/*
 * Copyright 2015 Henrik Olsson
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.meisolsson.githubsdk.model.payload;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

import com.meisolsson.githubsdk.model.Label;
import com.meisolsson.githubsdk.model.PullRequest;
import com.meisolsson.githubsdk.model.User;
import com.google.auto.value.AutoValue;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

import java.util.List;
import java.util.Map;

@AutoValue
public abstract class PullRequestPayload extends GitHubPayload<PullRequestPayload.Builder> implements Parcelable {
    public enum Action {
        @Json(name = "opened") Opened,
        @Json(name = "closed") Closed,
        @Json(name = "reopened") Reopened,
        @Json(name = "synchronized") Synchronized,
        @Json(name = "edited") Edited,
        @Json(name = "labeled") Labeled,
        @Json(name = "unlabeled") Unlabeled,
        @Json(name = "assigned") Assigned,
        @Json(name = "unassigned") Unassigned,
        @Json(name = "review_requested") ReviewRequested,
        @Json(name = "review_request_removed") ReviewRequestRemoved
    }

    @Nullable
    public abstract Action action();

    @Nullable
    public abstract Integer number();

    @Nullable
    public abstract Map<String, String> changes();

    @Json(name = "pull_request")
    @Nullable
    public abstract PullRequest pullRequest();

    @Nullable
    public abstract User assignee();

    @Nullable
    public abstract List<User> assignees();

    @Nullable
    public abstract Label label();

    @Nullable
    public abstract List<Label> labels();

    public abstract Builder toBuilder();

    public static JsonAdapter<PullRequestPayload> jsonAdapter(Moshi moshi) {
        return new AutoValue_PullRequestPayload.MoshiJsonAdapter(moshi);
    }

    public static PullRequestPayload createFromParcel(Parcel in) {
        return AutoValue_PullRequestPayload.CREATOR.createFromParcel(in);
    }

    public static Builder builder() {
        return new AutoValue_PullRequestPayload.Builder();
    }

    @AutoValue.Builder
    public abstract static class Builder extends GitHubPayload.Builder<PullRequestPayload, Builder> {
        public abstract Builder action(Action action);

        public abstract Builder number(Integer number);

        public abstract Builder changes(Map<String, String> changes);

        public abstract Builder pullRequest(PullRequest pullRequest);

        public abstract Builder assignee(User assignee);

        public abstract Builder assignees(List<User> assignees);

        public abstract Builder label(Label label);

        public abstract Builder labels(List<Label> labels);

        public abstract PullRequestPayload build();
    }
}

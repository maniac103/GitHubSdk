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

import com.meisolsson.githubsdk.core.FormattedTime;
import com.meisolsson.githubsdk.model.PullRequest;
import com.meisolsson.githubsdk.model.Review;
import com.meisolsson.githubsdk.model.User;
import com.google.auto.value.AutoValue;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

import java.util.Date;
import java.util.Map;

@AutoValue
public abstract class PullRequestReviewPayload extends GitHubPayload<PullRequestReviewPayload.Builder> implements Parcelable {

    @Nullable
    public abstract String action();

    @Nullable
    public abstract Review review();

    @Json(name = "pull_request")
    @Nullable
    public abstract PullRequest pullRequest();

    public abstract Builder toBuilder();

    public static JsonAdapter<PullRequestReviewPayload> jsonAdapter(Moshi moshi) {
        return new AutoValue_PullRequestReviewPayload.MoshiJsonAdapter(moshi);
    }

    public static PullRequestReviewPayload createFromParcel(Parcel in) {
        return AutoValue_PullRequestReviewPayload.CREATOR.createFromParcel(in);
    }

    public static Builder builder() {
        return new AutoValue_PullRequestReviewPayload.Builder();
    }

    @AutoValue.Builder
    public abstract static class Builder extends GitHubPayload.Builder<PullRequestReviewPayload, Builder> {
        public abstract Builder action(String action);

        public abstract Builder review(Review review);

        public abstract Builder pullRequest(PullRequest pullRequest);

        public abstract PullRequestReviewPayload build();
    }
}

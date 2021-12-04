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

package com.meisolsson.githubsdk.model;

import android.os.Parcelable;
import androidx.annotation.Nullable;

import com.google.auto.value.AutoValue;
import com.meisolsson.githubsdk.core.FormattedTime;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

import java.util.Date;
import java.util.List;

@AutoValue
public abstract class CheckRun implements Parcelable {
    @AutoValue
    public abstract static class Output implements Parcelable {
        @Nullable
        public abstract String title();

        @Nullable
        public abstract String summary();

        @Nullable
        public abstract String text();

        @Nullable
        @Json(name = "annotations_count")
        public abstract Integer annotationsCount();

        @Nullable
        @Json(name = "annotations_url")
        public abstract String annotationsUrl();

        public static JsonAdapter<Output> jsonAdapter(Moshi moshi) {
            return new AutoValue_CheckRun_Output.MoshiJsonAdapter(moshi);
        }
    }

    @Nullable
    public abstract Long id();

    @Nullable
    public abstract String url();

    @Nullable
    @Json(name = "details_url")
    public abstract String detailsUrl();

    @Nullable
    public abstract String name();

    @Nullable
    @Json(name = "status")
    public abstract CheckRunState state();

    @Nullable
    public abstract CheckRunConclusion conclusion();

    @Nullable
    public abstract Output output();

    @Json(name = "started_at")
    @Nullable
    @FormattedTime
    public abstract Date startedAt();

    @Json(name = "completed_at")
    @Nullable
    @FormattedTime
    public abstract Date completedAt();

    @Json(name = "pull_requests")
    @Nullable
    public abstract List<PullRequest> pullRequests();

    @Json(name ="head_sha")
    @Nullable
    public abstract String headSha();

    @Nullable
    public abstract GitHubApp app();

    public static JsonAdapter<CheckRun> jsonAdapter(Moshi moshi) {
        return new AutoValue_CheckRun.MoshiJsonAdapter(moshi);
    }
}

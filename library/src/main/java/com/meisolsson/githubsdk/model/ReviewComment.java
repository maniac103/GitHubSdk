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

import androidx.annotation.Nullable;

import com.google.auto.value.AutoValue;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;


@AutoValue
public abstract class ReviewComment extends PositionalCommentBase {

    @Json(name = "diff_hunk")
    @Nullable
    public abstract String diffChunk();

    @Json(name = "subject_type")
    @Nullable
    public abstract ReviewCommentSubjectType subjectType();

    @Json(name = "original_commit_id")
    @Nullable
    public abstract String originalCommitId();

    @Json(name = "original_position")
    @Nullable
    public abstract Integer originalPosition();

    @Json(name = "pull_request_review_id")
    @Nullable
    public abstract Long pullRequestReviewId();

    @Json(name = "in_reply_to_id")
    @Nullable
    public abstract Long inReplyToId();

    public abstract Builder toBuilder();

    @Json(name = "pull_request_url")
    @Nullable
    public abstract String pullRequestUrl();

    @Override
    public ReviewComment withReactions(Reactions reactions) {
        return toBuilder().reactions(reactions).build();
    }

    public static JsonAdapter<ReviewComment> jsonAdapter(Moshi moshi) {
        return new AutoValue_ReviewComment.MoshiJsonAdapter(moshi);
    }

    @AutoValue.Builder
    public abstract static class Builder extends PositionalCommentBase.Builder<Builder> {
        public abstract Builder diffChunk(String diffChunk);

        public abstract Builder subjectType(ReviewCommentSubjectType subjectType);

        public abstract Builder originalCommitId(String originalCommitId);

        public abstract Builder originalPosition(Integer originalPosition);

        public abstract Builder pullRequestReviewId(Long pullRequestReviewId);

        public abstract Builder inReplyToId(Long inReplyToId);

        public abstract Builder pullRequestUrl(String pullRequestUrl);

        public abstract ReviewComment build();
    }
}

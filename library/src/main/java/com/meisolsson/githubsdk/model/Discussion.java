package com.meisolsson.githubsdk.model;

import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.auto.value.AutoValue;
import com.meisolsson.githubsdk.core.FormattedTime;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

import java.util.Date;
import java.util.List;

@AutoValue
public abstract class Discussion implements Parcelable {
    @NonNull
    public abstract Long id();

    @Nullable
    public abstract Integer number();

    @Nullable
    public abstract String title();

    @Nullable
    public abstract String body();

    @Json(name = "node_id")
    @Nullable
    public abstract String nodeId();

    @Nullable
    public abstract DiscussionCategory catagory();

    @Nullable
    public abstract User user();

    @Nullable
    public abstract List<Label> labels();

    @Nullable
    public abstract Reactions reactions();

    @Json(name = "created_at")
    @Nullable
    @FormattedTime
    public abstract Date createdAt();

    @Json(name = "updated_at")
    @Nullable
    @FormattedTime
    public abstract Date updatedAt();

    @Nullable
    public abstract Integer comments();

    @Nullable
    public abstract Boolean locked();

    @Json(name = "active_lock_reason")
    @Nullable
    public abstract String activeLockReason();

    @Nullable
    public abstract String state();

    @Json(name = "state_reason")
    @Nullable
    public abstract String stateReason();

    @Json(name = "html_url")
    @Nullable
    public abstract String htmlUrl();

    @Json(name = "repository_url")
    @Nullable
    public abstract String repositoryUrl();

    @Json(name = "timeline_url")
    @Nullable
    public abstract String timelineUrl();

    @Json(name = "answer_chosen_at")
    @Nullable
    @FormattedTime
    public abstract Date answerChosenAt();

    @Json(name = "answer_chosen_by")
    @Nullable
    public abstract User answerChosenBy();

    @Json(name = "answer_html_url")
    @Nullable
    public abstract String answerHtmlUrl();

    public static JsonAdapter<Discussion> jsonAdapter(Moshi moshi) {
        return new AutoValue_Discussion.MoshiJsonAdapter(moshi);
    }
}

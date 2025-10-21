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

@AutoValue
public abstract class DiscussionCategory implements Parcelable {
    @NonNull
    public abstract Long id();

    @Nullable
    public abstract String name();

    @Nullable
    public abstract String description();

    @Nullable
    public abstract String emoji();

    @Nullable
    public abstract String slug();

    @Json(name = "node_id")
    @Nullable
    public abstract String nodeId();

    @Json(name = "repository_id")
    @Nullable
    public abstract Long repositoryId();

    @Json(name = "created_at")
    @Nullable
    @FormattedTime
    public abstract Date createdAt();

    @Json(name = "updated_at")
    @Nullable
    @FormattedTime
    public abstract Date updatedAt();

    @Json(name = "is_answerable")
    @Nullable
    public abstract Boolean isAnswerable();

    public static JsonAdapter<DiscussionCategory> jsonAdapter(Moshi moshi) {
        return new AutoValue_DiscussionCategory.MoshiJsonAdapter(moshi);
    }
}

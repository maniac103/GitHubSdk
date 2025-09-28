package com.meisolsson.githubsdk.model;

import android.os.Parcelable;

import androidx.annotation.Nullable;

import com.google.auto.value.AutoValue;
import com.meisolsson.githubsdk.core.FormattedTime;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

import java.util.Date;

@AutoValue
public abstract class IssueType implements Parcelable {
    @Nullable
    public abstract Long id();

    @Nullable
    public abstract String name();

    @Nullable
    public abstract String description();

    @Nullable
    public abstract String color();

    @Json(name = "is_enabled")
    @Nullable
    public abstract Boolean isEnabled();

    @Json(name = "created_at")
    @Nullable
    @FormattedTime
    public abstract Date createdAt();

    @Json(name = "updated_at")
    @Nullable
    @FormattedTime
    public abstract Date updatedAt();

    public abstract Builder toBuilder();

    public static JsonAdapter<IssueType> jsonAdapter(Moshi moshi) {
        return new AutoValue_IssueType.MoshiJsonAdapter(moshi);
    }

    public static Builder builder() {
        return new AutoValue_IssueType.Builder();
    }

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder id(Long id);

        public abstract Builder name(String name);

        public abstract Builder description(String description);

        public abstract Builder color(String color);

        public abstract Builder isEnabled(Boolean isEnabled);

        public abstract Builder createdAt(Date createdAt);

        public abstract Builder updatedAt(Date updatedAt);

        public abstract IssueType build();
    }
}
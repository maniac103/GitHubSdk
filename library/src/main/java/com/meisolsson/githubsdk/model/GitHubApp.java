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
public abstract class GitHubApp implements Parcelable {
    @Nullable
    public abstract Long id();

    @Nullable
    public abstract String slug();

    @Nullable
    public abstract User owner();

    @Nullable
    public abstract String name();

    @Nullable
    public abstract String description();

    @Nullable
    @Json(name = "external_url")
    public abstract String externalUrl();

    @Nullable
    @Json(name = "html_url")
    public abstract String htmlUrl();

    @Json(name = "created_at")
    @Nullable
    @FormattedTime
    public abstract Date createdAt();

    @Json(name = "updated_at")
    @Nullable
    @FormattedTime
    public abstract Date updatedAt();

    public static JsonAdapter<GitHubApp> jsonAdapter(Moshi moshi) {
        return new AutoValue_GitHubApp.MoshiJsonAdapter(moshi);
    }
}

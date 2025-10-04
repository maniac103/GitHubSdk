package com.meisolsson.githubsdk.model;

import android.os.Parcelable;

import androidx.annotation.Nullable;

import com.google.auto.value.AutoValue;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

@AutoValue
public abstract class SubIssuesSummary implements Parcelable {

    @Nullable
    public abstract Integer total();

    @Nullable
    public abstract Integer completed();

    @Json(name = "percent_completed")
    @Nullable
    public abstract Integer percentCompleted();

    public static JsonAdapter<SubIssuesSummary> jsonAdapter(Moshi moshi) {
        return new AutoValue_SubIssuesSummary.MoshiJsonAdapter(moshi);
    }
}

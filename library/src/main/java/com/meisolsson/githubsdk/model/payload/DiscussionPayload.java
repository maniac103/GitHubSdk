package com.meisolsson.githubsdk.model.payload;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

import com.meisolsson.githubsdk.model.Discussion;
import com.meisolsson.githubsdk.model.git.GitComment;
import com.google.auto.value.AutoValue;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

@AutoValue
public abstract class DiscussionPayload extends GitHubPayload<DiscussionPayload.Builder> implements Parcelable {
    @Nullable
    public abstract String action();

    @Nullable
    public abstract Discussion discussion();

    public abstract Builder toBuilder();

    public static JsonAdapter<DiscussionPayload> jsonAdapter(Moshi moshi) {
        return new AutoValue_DiscussionPayload.MoshiJsonAdapter(moshi);
    }

    public static DiscussionPayload createFromParcel(Parcel in) {
        return AutoValue_DiscussionPayload.CREATOR.createFromParcel(in);
    }

    public static Builder builder() {
        return new AutoValue_DiscussionPayload.Builder();
    }

    @AutoValue.Builder
    public abstract static class Builder extends GitHubPayload.Builder<DiscussionPayload, Builder> {
        public abstract Builder action(String action);

        public abstract Builder discussion(Discussion discussion);

        public abstract DiscussionPayload build();
    }
}

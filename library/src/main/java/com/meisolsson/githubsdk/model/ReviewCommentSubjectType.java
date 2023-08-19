package com.meisolsson.githubsdk.model;

import com.squareup.moshi.Json;

public enum ReviewCommentSubjectType {
    @Json(name = "file") File,
    @Json(name = "line") Line
}

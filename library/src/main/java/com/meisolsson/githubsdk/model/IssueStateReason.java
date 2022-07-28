package com.meisolsson.githubsdk.model;

import com.squareup.moshi.Json;

public enum IssueStateReason {
    @Json(name = "reopened") Reopened,
    @Json(name = "completed") Completed,
    @Json(name = "not_planned") NotPlanned
}

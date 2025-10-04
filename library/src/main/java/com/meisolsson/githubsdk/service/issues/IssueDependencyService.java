package com.meisolsson.githubsdk.service.issues;

import com.meisolsson.githubsdk.model.Issue;
import com.meisolsson.githubsdk.model.Page;

import io.reactivex.Single;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface IssueDependencyService {

    @GET("repos/{owner}/{repo}/issues/{number}/dependencies/blocked_by")
    Single<Response<Page<Issue>>> getIssuesIsBlockedBy(@Path("owner") String owner, @Path("repo") String repo, @Path("number") long number, @Query("page") long page);

    @GET("repos/{owner}/{repo}/issues/{number}/dependencies/blocking")
    Single<Response<Page<Issue>>> getIssuesIsBlocking(@Path("owner") String owner, @Path("repo") String repo, @Path("number") long number, @Query("page") long page);
}

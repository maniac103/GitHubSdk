package com.meisolsson.githubsdk.service.organizations;

import com.meisolsson.githubsdk.model.IssueType;

import java.util.List;

import io.reactivex.Single;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface OrganizationIssueTypeService {

    @GET("orgs/{org}/issue-types")
    Single<Response<List<IssueType>>> getOrganizationIssueTypes(@Path("org") String org);
}

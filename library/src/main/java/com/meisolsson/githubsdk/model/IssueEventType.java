/*
 * Copyright 2015 Henrik Olsson
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.meisolsson.githubsdk.model;

import com.squareup.moshi.Json;

public enum IssueEventType {
    @Json(name = "added_to_merge_queue") AddedToMergeQueue,
    @Json(name = "added_to_project") AddedToProject,
    @Json(name = "assigned") Assigned,
    @Json(name = "auto_merge_disabled") AutoMergeDisabled,
    @Json(name = "auto_merge_enabled") AutoMergeEnabled,
    @Json(name = "auto_rebase_enabled") AutoRebaseEnabled,
    @Json(name = "auto_squash_enabled") AutoSquashEnabled,
    @Json(name = "automatic_base_change_failed") AutomaticBaseChangeFailed,
    @Json(name = "automatic_base_change_succeeded") AutomaticBaseChangeSucceeded,
    @Json(name = "base_ref_changed") BaseRefChanged,
    @Json(name = "base_ref_deleted") BaseRefDeleted,
    @Json(name = "base_ref_force_pushed") BaseRefForcePushed,
    @Json(name = "closed") Closed,
    @Json(name = "comment_deleted") CommentDeleted,
    @Json(name = "commented") Commented,
    @Json(name = "committed") Committed,
    @Json(name = "connected") Connected,
    @Json(name = "convert_to_draft") ConvertToDraft,
    @Json(name = "converted_note_to_issue") ConvertedNoteToIssue,
    @Json(name = "converted_to_discussion") ConvertedToDiscussion,
    @Json(name = "cross-referenced") CrossReferenced,
    @Json(name = "demilestoned") Demilestoned,
    @Json(name = "deployed") Deployed,
    @Json(name = "disconnected") Disconnected,
    @Json(name = "head_ref_deleted") HeadRefDeleted,
    @Json(name = "head_ref_force_pushed") HeadRefForcePushed,
    @Json(name = "head_ref_restored") HeadRefRestored,
    @Json(name = "labeled") Labeled,
    @Json(name = "locked") Locked,
    @Json(name = "marked_as_duplicate") MarkedAsDuplicate,
    @Json(name = "mentioned") Mentioned,
    @Json(name = "merged") Merged,
    @Json(name = "moved_columns_in_project") MovedColumnsInProject,
    @Json(name = "milestoned") Milestoned,
    @Json(name = "pinned") Pinned,
    @Json(name = "ready_for_review") ReadyForReview,
    @Json(name = "referenced") Referenced,
    @Json(name = "removed_from_merge_queue") RemovedFromMergeQueue,
    @Json(name = "removed_from_project") RemovedFromProject,
    @Json(name = "renamed") Renamed,
    @Json(name = "reopened") Reopened,
    @Json(name = "reviewed") Reviewed,
    @Json(name = "review_dismissed") ReviewDismissed,
    @Json(name = "review_requested") ReviewRequested,
    @Json(name = "review_request_removed") ReviewRequestRemoved,
    @Json(name = "subscribed") Subscribed,
    @Json(name = "transferred") Transferred,
    @Json(name = "unassigned") Unassigned,
    @Json(name = "unlabeled") Unlabeled,
    @Json(name = "unlocked") Unlocked,
    @Json(name = "unmarked_as_duplicate") UnmarkedAsDuplicate,
    @Json(name = "unpinned") Unpinned,
    @Json(name = "unsubscribed") Unsubscribed,
    @Json(name = "user_blocked") UserBlocked
}

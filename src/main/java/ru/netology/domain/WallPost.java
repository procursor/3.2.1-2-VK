package ru.netology.domain;

import java.time.Instant;
import lombok.Data;


/**
 * @author me
 * @version 1
 * <p>
 * This object describes a post on the user or community wall. It contains the following fields:
 */
@Data
public class WallPost {

    private long Id;
    private long authorId;
    private long wallId;
    private long viewsNumber;

    private Instant lastModified;

    private boolean isFriendsOnly;
    private boolean isPinned;

    private LikesInfo likesInfo;
    private SharesInfo sharesInfo;
    private CommentsInfo commentsInfo;

    private ContentInfo contentInfo;
}

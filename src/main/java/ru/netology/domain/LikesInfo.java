package ru.netology.domain;

import lombok.Data;

/**
 * @author me
 * @version 2.01
 * <p>
 * This object describes likes of a post on the user or community wall.
 */
@Data
public class LikesInfo {
    private long counter;
    private boolean userLiked;
    private boolean canLike;
    private boolean canShare;
}

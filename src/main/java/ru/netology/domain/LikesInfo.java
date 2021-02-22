package ru.netology.domain;

import lombok.Data;

/**
 * @author me
 * @version 1
 * <p>
 * This object describes likes of a post on the user or community wall.
 */
@Data
public class LikesInfo {

    private long counter;
    private boolean userLiked;
}

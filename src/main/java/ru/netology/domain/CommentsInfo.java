package ru.netology.domain;

import lombok.Data;

/**
 * @author me
 * @version 2
 * <p>
 * This object describes comments to a post on the user or community wall.
 */
@Data
public class CommentsInfo {

    private long counter;

    private boolean canPost;
    private boolean canOpen;
    private boolean canClose;
}

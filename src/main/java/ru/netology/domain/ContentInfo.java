package ru.netology.domain;

import lombok.Data;


/**
 * @author me
 * @version 1
 * <p>
 * This object describes a post content on the user or community wall.
 */
@Data
public class ContentInfo {

    private String text;
    private String imageURI;
}

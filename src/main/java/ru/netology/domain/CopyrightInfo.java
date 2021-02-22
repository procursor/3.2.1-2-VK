package ru.netology.domain;

import lombok.Data;

/**
 * @author me
 * @version 2
 * <p>
 * This object describes copyright info of a post on the user or community wall.
 */
@Data
public class CopyrightInfo {

    private int id;
    private String link;
    private String name;
    private String type;
}

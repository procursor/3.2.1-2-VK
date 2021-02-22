package ru.netology.domain;

import lombok.Data;

/**
 * @author me
 * @version 2
 * <p>
 * This object describes reposts of a post on the user or community wall.
 */
@Data
public class SharesInfo {

    private long counter;
    private boolean userShared;
}

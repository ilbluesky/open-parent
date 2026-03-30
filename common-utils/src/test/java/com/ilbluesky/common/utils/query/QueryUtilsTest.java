package com.ilbluesky.common.utils.query;

import com.ilbluesky.common.vo.NameValue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Orca Zhang
 * date 3/30/2026
 */
public class QueryUtilsTest {

    @Test
    public void testEmptyToNull() {
        NameValue vo = new NameValue();
        vo.setName("");
        vo.setValue("abc");
        QueryUtils.blankToNull(vo);
        Assertions.assertEquals(vo.getValue(), "abc");
        Assertions.assertTrue(vo.getName() == null);
    }
}

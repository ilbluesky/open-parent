package com.ilbluesky.common.utils.query;

import com.ilbluesky.common.utils.lang.StringUtils;

import java.lang.reflect.Field;

/**
 * @author Orca Zhang
 * date 3/30/2026
 */
public abstract class QueryUtils {

    private QueryUtils() {}

    /**
     * Convert the <b>obj</b> empty field to null. E.g: obj.a = "", obj.b = "foo". After executing <>blankToNull</>,
     * the obj becomes obj.a = null, obj.b = "foo".
     * @param obj
     */
    public static void blankToNull(Object obj) {
        if (obj == null) {
            return;
        }
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field f : fields) {
            try {
                f.setAccessible(true);
                Object in = f.get(obj);
                if (in instanceof String) {
                    if (!StringUtils.hasText((String)in)) {
                        f.set(obj, null);
                    }
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }

        }
    }
}

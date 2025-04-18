package org.jacoco.core.internal.analysis;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class StringPool {
    private static final String[] EMPTY_ARRAY = new String[0];
    private final Map<String, String> pool = new HashMap(1024);

    public String get(String str) {
        if (str == null) {
            return null;
        }
        String str2 = this.pool.get(str);
        if (str2 != null) {
            return str2;
        }
        this.pool.put(str, str);
        return str;
    }

    public String[] get(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        if (strArr.length == 0) {
            return EMPTY_ARRAY;
        }
        for (int i2 = 0; i2 < strArr.length; i2++) {
            strArr[i2] = get(strArr[i2]);
        }
        return strArr;
    }
}

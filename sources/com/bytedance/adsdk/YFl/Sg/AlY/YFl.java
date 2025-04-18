package com.bytedance.adsdk.YFl.Sg.AlY;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public enum YFl implements wN {
    TRUE,
    FALSE,
    NULL;

    private static final Map<String, YFl> AlY = new HashMap(128);

    static {
        for (YFl yFl : values()) {
            AlY.put(yFl.name().toLowerCase(), yFl);
        }
    }

    public static YFl YFl(String str) {
        return AlY.get(str.toLowerCase());
    }
}

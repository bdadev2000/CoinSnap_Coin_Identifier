package com.bytedance.adsdk.ugeno.yoga;

@com.bytedance.adsdk.ugeno.yoga.YFl.YFl
/* loaded from: classes.dex */
public enum YogaLogLevel {
    ERROR(0),
    WARN(1),
    INFO(2),
    DEBUG(3),
    VERBOSE(4),
    FATAL(5);

    private final int DSW;

    YogaLogLevel(int i10) {
        this.DSW = i10;
    }

    @com.bytedance.adsdk.ugeno.yoga.YFl.YFl
    public static YogaLogLevel fromInt(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5) {
                                return FATAL;
                            }
                            throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(i10)));
                        }
                        return VERBOSE;
                    }
                    return DEBUG;
                }
                return INFO;
            }
            return WARN;
        }
        return ERROR;
    }
}

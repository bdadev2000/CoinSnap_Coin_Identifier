package com.mbridge.msdk.playercommon.exoplayer2.util;

/* loaded from: classes3.dex */
public final class RepeatModeUtil {
    public static final int REPEAT_TOGGLE_MODE_ALL = 2;
    public static final int REPEAT_TOGGLE_MODE_NONE = 0;
    public static final int REPEAT_TOGGLE_MODE_ONE = 1;

    /* loaded from: classes3.dex */
    public @interface RepeatToggleModes {
    }

    private RepeatModeUtil() {
    }

    public static int getNextRepeatMode(int i9, int i10) {
        for (int i11 = 1; i11 <= 2; i11++) {
            int i12 = (i9 + i11) % 3;
            if (isRepeatModeEnabled(i12, i10)) {
                return i12;
            }
        }
        return i9;
    }

    public static boolean isRepeatModeEnabled(int i9, int i10) {
        if (i9 != 0) {
            return i9 != 1 ? i9 == 2 && (i10 & 2) != 0 : (i10 & 1) != 0;
        }
        return true;
    }
}

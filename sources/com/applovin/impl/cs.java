package com.applovin.impl;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.drm.WidevineUtil;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class cs {
    private static long a(Map map, String str) {
        if (map == null) {
            return C.TIME_UNSET;
        }
        try {
            String str2 = (String) map.get(str);
            return str2 != null ? Long.parseLong(str2) : C.TIME_UNSET;
        } catch (NumberFormatException unused) {
            return C.TIME_UNSET;
        }
    }

    public static Pair a(x6 x6Var) {
        Map d10 = x6Var.d();
        if (d10 == null) {
            return null;
        }
        return new Pair(Long.valueOf(a(d10, WidevineUtil.PROPERTY_LICENSE_DURATION_REMAINING)), Long.valueOf(a(d10, WidevineUtil.PROPERTY_PLAYBACK_DURATION_REMAINING)));
    }
}

package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* loaded from: classes.dex */
public class EH {
    public static boolean AlY(Context context) {
        return tN(context) == 4;
    }

    public static String DSW(Context context) {
        int tN = tN(context);
        return tN != 2 ? tN != 3 ? tN != 4 ? tN != 5 ? tN != 6 ? "mobile" : "5g" : "4g" : "wifi" : "3g" : "2g";
    }

    public static int Sg(Context context) {
        int tN = tN(context);
        if (tN == 1) {
            return 0;
        }
        if (tN == 4) {
            return 1;
        }
        if (tN == 5) {
            return 4;
        }
        if (tN != 6) {
            return tN;
        }
        return 6;
    }

    public static boolean YFl(Context context) {
        return tN(context) != 0;
    }

    public static boolean qsH(Context context) {
        if (context == null) {
            return false;
        }
        int tN = tN(context);
        char c10 = 2;
        if (tN != 2) {
            c10 = 3;
            if (tN != 3) {
                c10 = 4;
                if (tN == 4) {
                    c10 = 1;
                } else if (tN != 5) {
                    c10 = tN != 6 ? (char) 0 : (char) 5;
                }
            }
        }
        return c10 != 0;
    }

    public static int tN(Context context) {
        return Ne.YFl(context, ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
    }

    public static boolean vc(Context context) {
        return tN(context) == 6;
    }

    public static boolean wN(Context context) {
        return tN(context) == 5;
    }

    public static boolean YFl(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("http://") || str.startsWith("https://");
    }
}

package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* loaded from: classes.dex */
public class KVG {
    public static boolean COT(Context context) {
        if (KS(context) == 5) {
            return true;
        }
        return false;
    }

    public static boolean HWF(Context context) {
        if (KS(context) == 6) {
            return true;
        }
        return false;
    }

    public static int KS(Context context) {
        return yRU.zp(context, ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
    }

    public static String QR(Context context) {
        int KS = KS(context);
        if (KS != 2) {
            if (KS != 3) {
                if (KS != 4) {
                    if (KS != 5) {
                        if (KS != 6) {
                            return "mobile";
                        }
                        return "5g";
                    }
                    return "4g";
                }
                return "wifi";
            }
            return "3g";
        }
        return "2g";
    }

    public static boolean jU(Context context) {
        if (KS(context) == 4) {
            return true;
        }
        return false;
    }

    public static boolean ku(Context context) {
        if (context == null) {
            return false;
        }
        int KS = KS(context);
        if (KS != 2 && KS != 3 && KS != 4 && KS != 5 && KS != 6) {
            return false;
        }
        return true;
    }

    public static int lMd(Context context) {
        int KS = KS(context);
        if (KS != 1) {
            if (KS == 4) {
                return 1;
            }
            if (KS == 5) {
                return 4;
            }
            if (KS == 6) {
                return 6;
            }
            return KS;
        }
        return 0;
    }

    public static boolean zp(Context context) {
        return KS(context) != 0;
    }

    public static boolean zp(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("http://") || str.startsWith("https://");
    }
}

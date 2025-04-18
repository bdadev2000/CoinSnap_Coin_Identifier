package com.bytedance.sdk.openadsdk.multipro.AlY;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.sdk.component.Sg;
import com.bytedance.sdk.openadsdk.core.NjR;
import com.bytedance.sdk.openadsdk.core.lG;

/* loaded from: classes.dex */
public class AlY {
    private static String Sg(String str) {
        return TextUtils.isEmpty(str) ? "tt_sp" : str;
    }

    private static boolean YFl() {
        return lG.YFl() == null;
    }

    public static String Sg(String str, String str2, String str3) {
        if (YFl()) {
            return str3;
        }
        if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
            return YFl.Sg(Sg(str), str2, str3);
        }
        return YFl.YFl(lG.YFl(), Sg(str), str2, str3);
    }

    public static void YFl(String str, String str2, Boolean bool) {
        if (YFl()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
            YFl.YFl(Sg(str), str2, bool);
        } else {
            YFl(Sg(str), str2, bool);
        }
    }

    public static void YFl(String str, String str2, Long l10) {
        if (YFl()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
            YFl.YFl(Sg(str), str2, l10);
        } else {
            YFl(Sg(str), str2, l10);
        }
    }

    public static void YFl(String str, String str2, String str3) {
        if (YFl()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
            YFl.YFl(Sg(str), str2, str3);
        } else {
            YFl(Sg(str), str2, str3);
        }
    }

    public static void YFl(String str, String str2, Integer num) {
        if (YFl()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
            YFl.YFl(Sg(str), str2, num);
        } else {
            YFl(Sg(str), str2, num);
        }
    }

    public static int YFl(String str, String str2, int i10) {
        if (YFl()) {
            return i10;
        }
        if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
            return YFl.YFl(Sg(str), str2, i10);
        }
        return YFl.YFl(lG.YFl(), Sg(str), str2, i10);
    }

    public static boolean YFl(String str, String str2, boolean z10) {
        if (YFl()) {
            return z10;
        }
        if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
            return YFl.YFl(Sg(str), str2, z10);
        }
        return YFl.YFl(lG.YFl(), Sg(str), str2, z10);
    }

    public static long YFl(String str, String str2, long j3) {
        if (YFl()) {
            return j3;
        }
        if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
            return YFl.YFl(Sg(str), str2, j3);
        }
        return YFl.YFl(lG.YFl(), Sg(str), str2, j3);
    }

    public static void YFl(String str, String str2) {
        if (YFl()) {
            return;
        }
        try {
            if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
                YFl.Sg(Sg(str), str2);
            } else {
                Sg.Sg(lG.YFl(), Sg(str), str2);
            }
        } catch (Throwable unused) {
        }
    }

    public static void YFl(String str) {
        if (YFl()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
            YFl.YFl(Sg(str));
        } else {
            Sg.Sg(lG.YFl(), Sg(str));
        }
    }

    private static <T> void YFl(String str, String str2, T t5) {
        String YFl = YFl.YFl(str, str2);
        if (NjR.DSW(YFl)) {
            Sg.tN Sg = com.bytedance.sdk.component.Sg.YFl(lG.YFl(), Sg(YFl)).Sg();
            Sg.YFl(Sg, str2, (Object) t5);
            Sg.apply();
        } else {
            SharedPreferences YFl2 = Sg.YFl(lG.YFl(), Sg(YFl));
            if (YFl2 == null) {
                return;
            }
            SharedPreferences.Editor edit = YFl2.edit();
            Sg.YFl(edit, str2, t5);
            edit.apply();
        }
    }
}

package com.bykv.vk.openvk.component.video.api;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.lMd.zp.Bj;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class KS {
    private static Bj COT = null;
    private static int HWF = 1;
    private static String KS = null;
    private static boolean jU = false;
    private static Context lMd = null;
    public static boolean zp = false;

    public static boolean COT() {
        return zp;
    }

    public static int HWF() {
        return HWF;
    }

    public static boolean KS() {
        return jU;
    }

    public static Bj jU() {
        if (COT == null) {
            Bj.zp zpVar = new Bj.zp("v_config");
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            COT = zpVar.zp(10000L, timeUnit).lMd(10000L, timeUnit).KS(10000L, timeUnit).zp();
        }
        return COT;
    }

    public static String lMd() {
        if (TextUtils.isEmpty(KS)) {
            try {
                File file = new File(zp().getFilesDir(), "ttad_dir");
                if (!file.exists()) {
                    file.mkdirs();
                }
                KS = file.getAbsolutePath();
            } catch (Throwable unused) {
            }
        }
        return KS;
    }

    public static Context zp() {
        return lMd;
    }

    public static void zp(Context context, String str) {
        lMd = context;
        KS = str;
    }

    public static void zp(boolean z8) {
        jU = z8;
    }

    public static void zp(Bj bj) {
        COT = bj;
    }

    public static void zp(int i9) {
        HWF = i9;
    }
}

package com.bytedance.sdk.openadsdk.core;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.view.ViewConfiguration;
import androidx.annotation.Nullable;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class KVG {
    private static int KS = -1;
    private static volatile woN<com.bytedance.sdk.openadsdk.lMd.zp> lMd;

    @SuppressLint({"StaticFieldLeak"})
    private static volatile Context zp;

    /* loaded from: classes.dex */
    public static class zp {

        @SuppressLint({"StaticFieldLeak"})
        private static volatile Application zp;

        static {
            try {
                Object lMd = lMd();
                zp = (Application) lMd.getClass().getMethod("getApplication", null).invoke(lMd, null);
                com.bytedance.sdk.component.utils.tG.zp("MyApplication", "application get success");
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.tG.zp("MyApplication", "application get failed", th);
            }
        }

        private static Object lMd() {
            try {
                Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", null);
                method.setAccessible(true);
                return method.invoke(null, null);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.tG.zp("MyApplication", "ActivityThread get error, maybe api level <= 4.2.2", th);
                return null;
            }
        }

        @Nullable
        public static Application zp() {
            return zp;
        }
    }

    public static com.bytedance.sdk.openadsdk.dT.KS.zp COT() {
        if (!com.bytedance.sdk.openadsdk.core.settings.Bj.zp()) {
            return com.bytedance.sdk.openadsdk.dT.KS.lMd.zp();
        }
        return com.bytedance.sdk.openadsdk.lMd.zp.jU.zp();
    }

    public static woN<com.bytedance.sdk.openadsdk.lMd.zp> KS() {
        if (lMd == null) {
            synchronized (KVG.class) {
                try {
                    if (lMd == null) {
                        lMd = new vwr(zp);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return lMd;
    }

    public static com.bytedance.sdk.openadsdk.core.settings.COT jU() {
        return com.bytedance.sdk.openadsdk.core.settings.dQp.etV();
    }

    public static int lMd() {
        Context zp2;
        if (KS < 0 && (zp2 = zp()) != null) {
            KS = ViewConfiguration.get(zp2).getScaledTouchSlop();
        }
        return KS;
    }

    public static Context zp() {
        if (zp == null) {
            zp(null);
        }
        return zp;
    }

    public static void zp(Context context) {
        if (zp == null) {
            synchronized (KVG.class) {
                try {
                    if (zp == null) {
                        if (context != null) {
                            zp = context;
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                zp = applicationContext;
                            }
                            return;
                        }
                        try {
                            Application zp2 = zp.zp();
                            if (zp2 != null) {
                                zp = zp2;
                            }
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}

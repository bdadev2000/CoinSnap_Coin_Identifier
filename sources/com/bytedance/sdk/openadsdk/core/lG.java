package com.bytedance.sdk.openadsdk.core;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.view.ViewConfiguration;
import androidx.annotation.Nullable;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class lG {
    private static volatile qO<com.bytedance.sdk.openadsdk.AlY.YFl> Sg = null;

    @SuppressLint({"StaticFieldLeak"})
    private static volatile Context YFl = null;
    private static int tN = -1;

    /* loaded from: classes.dex */
    public static class YFl {

        @SuppressLint({"StaticFieldLeak"})
        private static volatile Application YFl;

        static {
            try {
                Object Sg = Sg();
                YFl = (Application) Sg.getClass().getMethod("getApplication", new Class[0]).invoke(Sg, new Object[0]);
                com.bytedance.sdk.component.utils.YoT.YFl("MyApplication", "application get success");
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.YoT.YFl("MyApplication", "application get failed", th2);
            }
        }

        private static Object Sg() {
            try {
                Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]);
                method.setAccessible(true);
                return method.invoke(null, new Object[0]);
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.YoT.YFl("MyApplication", "ActivityThread get error, maybe api level <= 4.2.2", th2);
                return null;
            }
        }

        @Nullable
        public static Application YFl() {
            return YFl;
        }
    }

    public static com.bytedance.sdk.openadsdk.core.settings.vc AlY() {
        return com.bytedance.sdk.openadsdk.core.settings.rkt.JwO();
    }

    public static void Sg(Context context) {
        if (YFl == null) {
            synchronized (lG.class) {
                if (YFl == null) {
                    if (context != null) {
                        YFl = context;
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            YFl = applicationContext;
                        }
                        return;
                    }
                    try {
                        Application YFl2 = YFl.YFl();
                        if (YFl2 != null) {
                            YFl = YFl2;
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    public static Context YFl() {
        if (YFl == null) {
            Sg(null);
        }
        return YFl;
    }

    public static qO<com.bytedance.sdk.openadsdk.AlY.YFl> tN() {
        if (Sg == null) {
            synchronized (lG.class) {
                if (Sg == null) {
                    Sg = new aIu(YFl);
                }
            }
        }
        return Sg;
    }

    public static com.bytedance.sdk.openadsdk.pDU.tN.Sg wN() {
        if (!com.bytedance.sdk.openadsdk.core.settings.YoT.YFl()) {
            return com.bytedance.sdk.openadsdk.pDU.tN.tN.YFl();
        }
        return com.bytedance.sdk.openadsdk.AlY.YFl.AlY.YFl();
    }

    public static Context YFl(Context context) {
        if (context == null) {
            context = YFl();
        }
        if (context instanceof Application) {
            return context;
        }
        if (context != null) {
            return context.getApplicationContext();
        }
        return null;
    }

    public static int Sg() {
        Context YFl2;
        if (tN < 0 && (YFl2 = YFl()) != null) {
            tN = ViewConfiguration.get(YFl2).getScaledTouchSlop();
        }
        return tN;
    }
}

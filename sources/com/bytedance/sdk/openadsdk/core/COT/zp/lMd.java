package com.bytedance.sdk.openadsdk.core.COT.zp;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Process;
import android.util.ArrayMap;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class lMd {
    private static volatile lMd zp;
    private final ArrayList<String> lMd = new ArrayList<>();
    private final AtomicBoolean KS = new AtomicBoolean(false);
    private long jU = System.currentTimeMillis();
    private long COT = 0;
    private long HWF = 0;
    private String QR = "";
    private String ku = "";
    private String YW = "";
    private boolean dT = false;
    private boolean Bj = false;

    public static lMd zp(Application application) {
        if (zp == null) {
            synchronized (lMd.class) {
                try {
                    if (zp == null) {
                        lMd lmd = new lMd();
                        zp = lmd;
                        lmd.dT = zp((Context) application);
                        zp.Bj = zp(application.getApplicationContext(), "android.permission.SYSTEM_ALERT_WINDOW") == 0;
                        zp.zp();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zp;
    }

    public void lMd(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (this.lMd.contains(localClassName)) {
            this.lMd.remove(localClassName);
        }
        if (this.lMd.size() == 0) {
            this.jU = System.currentTimeMillis();
            this.KS.set(true);
            this.ku = localClassName;
        }
    }

    private static int zp(Context context, String str) {
        try {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        } catch (Throwable unused) {
            return -1;
        }
    }

    private static boolean zp(Context context) {
        ApplicationInfo applicationInfo;
        return (context == null || (applicationInfo = context.getApplicationInfo()) == null || (applicationInfo.flags & 1) <= 0) ? false : true;
    }

    public void zp(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (this.lMd.size() == 0) {
            this.QR = localClassName;
            this.COT = System.currentTimeMillis();
            this.HWF = System.currentTimeMillis() - this.jU;
            this.KS.set(false);
        }
        if (!this.lMd.contains(localClassName)) {
            this.lMd.add(localClassName);
        }
        if (localClassName.contains("com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity") || localClassName.contains("com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity")) {
            return;
        }
        this.YW = localClassName;
    }

    private void zp() {
        int size;
        boolean z8 = true;
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Method declaredMethod = cls.getDeclaredMethod("currentActivityThread", null);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, null);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            ArrayMap arrayMap = (ArrayMap) declaredField.get(invoke);
            if (arrayMap != null && (size = arrayMap.size()) > 0) {
                Class<?> cls2 = Class.forName("android.app.ActivityThread$ActivityClientRecord");
                Field declaredField2 = cls2.getDeclaredField("stopped");
                declaredField2.setAccessible(true);
                Field declaredField3 = cls2.getDeclaredField("activity");
                declaredField3.setAccessible(true);
                for (int i9 = 0; i9 < size; i9++) {
                    Object valueAt = arrayMap.valueAt(i9);
                    if (!((Boolean) declaredField2.get(valueAt)).booleanValue()) {
                        String localClassName = ((Activity) declaredField3.get(valueAt)).getLocalClassName();
                        if (!this.lMd.contains(localClassName)) {
                            this.lMd.add(localClassName);
                        }
                    }
                }
                AtomicBoolean atomicBoolean = this.KS;
                if (this.lMd.size() > 0) {
                    z8 = false;
                }
                atomicBoolean.set(z8);
            }
        } catch (Exception unused) {
        }
    }

    public String zp(String str, long j7, int i9) {
        String str2;
        long currentTimeMillis = System.currentTimeMillis();
        long j9 = currentTimeMillis - this.COT;
        long j10 = currentTimeMillis - j7;
        int i10 = j10 < 500 ? 1 : 0;
        if (this.KS.get() && this.Bj) {
            i10 |= 2;
        }
        if (!this.KS.get() && this.HWF >= DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS && j9 < 1000) {
            i10 = this.ku.equals(this.YW) ? i10 | 4 : i10 | 8;
        }
        try {
            str2 = new JSONObject().put("rst", i10).put("adtag", str).put("bakdur", this.HWF).put("rit", i9).put("poptime", j9).put("unlocktime", j10).put("bakground", this.KS).put("alert", this.Bj).put(NotificationCompat.CATEGORY_SYSTEM, this.dT).put("actsize", this.lMd.size()).put("mutiproc", com.bytedance.sdk.openadsdk.multipro.lMd.KS()).toString();
        } catch (JSONException unused) {
            str2 = "";
        }
        this.QR = "";
        this.HWF = 0L;
        this.COT = 0L;
        this.jU = System.currentTimeMillis();
        return str2;
    }
}

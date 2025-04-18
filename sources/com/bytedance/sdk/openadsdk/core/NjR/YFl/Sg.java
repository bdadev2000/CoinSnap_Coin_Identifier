package com.bytedance.sdk.openadsdk.core.NjR.YFl;

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
public class Sg {
    private static volatile Sg YFl;
    private final ArrayList<String> Sg = new ArrayList<>();
    private final AtomicBoolean tN = new AtomicBoolean(false);
    private long AlY = System.currentTimeMillis();
    private long wN = 0;

    /* renamed from: vc, reason: collision with root package name */
    private long f10640vc = 0;
    private String DSW = "";
    private String qsH = "";
    private String NjR = "";

    /* renamed from: nc, reason: collision with root package name */
    private boolean f10639nc = false;
    private boolean eT = false;

    public static Sg YFl(Application application) {
        if (YFl == null) {
            synchronized (Sg.class) {
                if (YFl == null) {
                    Sg sg2 = new Sg();
                    YFl = sg2;
                    sg2.f10639nc = YFl((Context) application);
                    YFl.eT = YFl(application.getApplicationContext(), "android.permission.SYSTEM_ALERT_WINDOW") == 0;
                    YFl.YFl();
                }
            }
        }
        return YFl;
    }

    public void Sg(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (this.Sg.contains(localClassName)) {
            this.Sg.remove(localClassName);
        }
        if (this.Sg.size() == 0) {
            this.AlY = System.currentTimeMillis();
            this.tN.set(true);
            this.qsH = localClassName;
        }
    }

    private static int YFl(Context context, String str) {
        try {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        } catch (Throwable unused) {
            return -1;
        }
    }

    private static boolean YFl(Context context) {
        ApplicationInfo applicationInfo;
        return (context == null || (applicationInfo = context.getApplicationInfo()) == null || (applicationInfo.flags & 1) <= 0) ? false : true;
    }

    public void YFl(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (this.Sg.size() == 0) {
            this.DSW = localClassName;
            this.wN = System.currentTimeMillis();
            this.f10640vc = System.currentTimeMillis() - this.AlY;
            this.tN.set(false);
        }
        if (!this.Sg.contains(localClassName)) {
            this.Sg.add(localClassName);
        }
        if (localClassName.contains("com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity") || localClassName.contains("com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity")) {
            return;
        }
        this.NjR = localClassName;
    }

    private void YFl() {
        int size;
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Method declaredMethod = cls.getDeclaredMethod("currentActivityThread", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            ArrayMap arrayMap = (ArrayMap) declaredField.get(invoke);
            if (arrayMap != null && (size = arrayMap.size()) > 0) {
                Class<?> cls2 = Class.forName("android.app.ActivityThread$ActivityClientRecord");
                Field declaredField2 = cls2.getDeclaredField("stopped");
                declaredField2.setAccessible(true);
                Field declaredField3 = cls2.getDeclaredField("activity");
                declaredField3.setAccessible(true);
                for (int i10 = 0; i10 < size; i10++) {
                    Object valueAt = arrayMap.valueAt(i10);
                    if (!((Boolean) declaredField2.get(valueAt)).booleanValue()) {
                        String localClassName = ((Activity) declaredField3.get(valueAt)).getLocalClassName();
                        if (!this.Sg.contains(localClassName)) {
                            this.Sg.add(localClassName);
                        }
                    }
                }
                this.tN.set(this.Sg.size() <= 0);
            }
        } catch (Throwable unused) {
        }
    }

    public String YFl(String str, long j3, int i10) {
        String str2;
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.wN;
        long j11 = currentTimeMillis - j3;
        int i11 = j11 < 500 ? 1 : 0;
        if (this.tN.get() && this.eT) {
            i11 |= 2;
        }
        if (!this.tN.get() && this.f10640vc >= DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS && j10 < 1000) {
            i11 = this.qsH.equals(this.NjR) ? i11 | 4 : i11 | 8;
        }
        try {
            str2 = new JSONObject().put("rst", i11).put("adtag", str).put("bakdur", this.f10640vc).put("rit", i10).put("poptime", j10).put("unlocktime", j11).put("bakground", this.tN).put("alert", this.eT).put(NotificationCompat.CATEGORY_SYSTEM, this.f10639nc).put("actsize", this.Sg.size()).put("mutiproc", com.bytedance.sdk.openadsdk.multipro.Sg.tN()).toString();
        } catch (JSONException unused) {
            str2 = "";
        }
        this.DSW = "";
        this.f10640vc = 0L;
        this.wN = 0L;
        this.AlY = System.currentTimeMillis();
        return str2;
    }
}

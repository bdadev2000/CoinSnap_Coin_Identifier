package com.apm.insight.b;

import android.app.ActivityManager;
import android.content.Context;
import android.os.FileObserver;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.apm.insight.l.r;
import com.apm.insight.l.v;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static String f5664a = null;
    private static long b = -1;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f5665c = false;

    /* renamed from: d, reason: collision with root package name */
    private static FileObserver f5666d;

    /* renamed from: e, reason: collision with root package name */
    private static ActivityManager.ProcessErrorStateInfo f5667e;

    public static String a(Context context, int i9) {
        if (r.a(NotificationCompat.FLAG_LOCAL_ONLY)) {
            f5665c = false;
            return "TEST_ANR_INFO";
        }
        if (SystemClock.uptimeMillis() - b < DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS) {
            return null;
        }
        try {
            ActivityManager.ProcessErrorStateInfo a6 = com.apm.insight.l.a.a(context, i9);
            if (a6 != null && Process.myPid() == a6.pid) {
                ActivityManager.ProcessErrorStateInfo processErrorStateInfo = f5667e;
                if (processErrorStateInfo != null && a.a(processErrorStateInfo, a6)) {
                    return null;
                }
                f5667e = a6;
                f5664a = null;
                b = SystemClock.uptimeMillis();
                f5665c = false;
                return a.a(a6);
            }
        } catch (Throwable unused) {
        }
        String str = f5664a;
        if (str == null) {
            return null;
        }
        f5665c = true;
        f5664a = null;
        b = SystemClock.uptimeMillis();
        return str;
    }

    public static void b() {
        f5667e = null;
    }

    public static JSONObject a(boolean z8) {
        try {
            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("thread_number", 1);
            jSONObject.put("mainStackFromTrace", v.a(stackTrace));
            return jSONObject;
        } catch (Throwable th) {
            com.apm.insight.c.a().a("NPTH_CATCH", th);
            return null;
        }
    }

    public static void a(final String str, final com.apm.insight.f fVar) {
        FileObserver fileObserver = f5666d;
        if (fileObserver != null) {
            fileObserver.stopWatching();
        }
        FileObserver fileObserver2 = new FileObserver(str, 136) { // from class: com.apm.insight.b.d.1
            @Override // android.os.FileObserver
            public void onEvent(int i9, @Nullable String str2) {
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                try {
                    String unused = d.f5664a = fVar.a(str, str2);
                } catch (Throwable th) {
                    com.apm.insight.c.a().a("NPTH_CATCH", th);
                }
            }
        };
        f5666d = fileObserver2;
        fileObserver2.startWatching();
    }

    public static boolean a() {
        return f5665c;
    }
}

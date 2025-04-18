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
import com.apm.insight.l.q;
import com.apm.insight.l.u;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {
    private static String a = null;

    /* renamed from: b, reason: collision with root package name */
    private static long f2986b = -1;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f2987c = false;

    /* renamed from: d, reason: collision with root package name */
    private static FileObserver f2988d;

    /* renamed from: e, reason: collision with root package name */
    private static ActivityManager.ProcessErrorStateInfo f2989e;

    public static String a(Context context, int i10) {
        if (q.a(NotificationCompat.FLAG_LOCAL_ONLY)) {
            f2987c = false;
            return "TEST_ANR_INFO";
        }
        if (SystemClock.uptimeMillis() - f2986b < DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS) {
            return null;
        }
        try {
            ActivityManager.ProcessErrorStateInfo a10 = com.apm.insight.l.a.a(context, i10);
            if (a10 != null && Process.myPid() == a10.pid) {
                ActivityManager.ProcessErrorStateInfo processErrorStateInfo = f2989e;
                if (processErrorStateInfo != null && a.a(processErrorStateInfo, a10)) {
                    return null;
                }
                f2989e = a10;
                a = null;
                f2986b = SystemClock.uptimeMillis();
                f2987c = false;
                return a.a(a10);
            }
        } catch (Throwable unused) {
        }
        String str = a;
        if (str == null) {
            return null;
        }
        f2987c = true;
        a = null;
        f2986b = SystemClock.uptimeMillis();
        return str;
    }

    public static void b() {
        f2989e = null;
    }

    public static JSONObject a(boolean z10) {
        try {
            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("thread_number", 1);
            jSONObject.put("mainStackFromTrace", u.a(stackTrace));
            return jSONObject;
        } catch (Throwable th2) {
            com.apm.insight.c.a().a("NPTH_CATCH", th2);
            return null;
        }
    }

    public static void a(final String str, final com.apm.insight.f fVar) {
        FileObserver fileObserver = f2988d;
        if (fileObserver != null) {
            fileObserver.stopWatching();
        }
        FileObserver fileObserver2 = new FileObserver(str, 136) { // from class: com.apm.insight.b.d.1
            @Override // android.os.FileObserver
            public void onEvent(int i10, @Nullable String str2) {
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                try {
                    String unused = d.a = fVar.a(str, str2);
                } catch (Throwable th2) {
                    com.apm.insight.c.a().a("NPTH_CATCH", th2);
                }
            }
        };
        f2988d = fileObserver2;
        fileObserver2.startWatching();
    }

    public static boolean a() {
        return f2987c;
    }
}

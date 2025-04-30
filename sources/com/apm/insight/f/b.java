package com.apm.insight.f;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.CrashType;
import com.apm.insight.entity.c;
import com.apm.insight.k.g;
import com.apm.insight.l.q;
import com.apm.insight.l.v;
import com.apm.insight.runtime.a.f;
import com.apm.insight.runtime.p;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {
    @Nullable
    private static String a(StackTraceElement[] stackTraceElementArr, int i9) {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        while (i9 < stackTraceElementArr.length) {
            v.a(stackTraceElementArr[i9], sb);
            i9++;
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Object obj, Throwable th, String str, boolean z8, Map<String, String> map, @NonNull String str2) {
        c(obj, th, str, z8, map, "EnsureNotReachHere", str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Object obj, Throwable th, String str, boolean z8, Map<String, String> map, String str2, @NonNull String str3) {
        if (th == null) {
            return;
        }
        try {
            StackTraceElement[] stackTrace = th.getStackTrace();
            StackTraceElement stackTraceElement = stackTrace[0];
            if (stackTraceElement == null) {
                return;
            }
            String a6 = v.a(th);
            if (TextUtils.isEmpty(a6)) {
                return;
            }
            c a9 = c.a(stackTraceElement, a6, str, Thread.currentThread().getName(), z8, str2, str3);
            if (obj != null) {
                a9.a("exception_line_num", (Object) com.apm.insight.entity.b.a(obj, th, stackTrace));
            }
            a(map, a9);
            f.a().a(CrashType.ENSURE, a9);
            g.a(obj, a9);
            q.b("[reportException] " + str);
        } catch (Throwable th2) {
            q.b(th2);
        }
    }

    public static void a(final Object obj, final Throwable th, final String str, final boolean z8, final Map<String, String> map, final String str2, @NonNull final String str3) {
        try {
            p.b().a(new Runnable() { // from class: com.apm.insight.f.b.2
                @Override // java.lang.Runnable
                public void run() {
                    b.c(obj, th, str, z8, map, str2, str3);
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(StackTraceElement[] stackTraceElementArr, int i9, @Nullable String str, String str2, @NonNull String str3, Map<String, String> map) {
        StackTraceElement stackTraceElement;
        if (stackTraceElementArr != null) {
            try {
                if (stackTraceElementArr.length > i9 + 1 && (stackTraceElement = stackTraceElementArr[i9]) != null) {
                    String a6 = a(stackTraceElementArr, i9);
                    if (TextUtils.isEmpty(a6)) {
                        return;
                    }
                    c a9 = c.a(stackTraceElement, a6, str, Thread.currentThread().getName(), true, str2, str3);
                    a(map, a9);
                    f.a().a(CrashType.ENSURE, a9);
                    g.a(a9);
                    q.b("[report] " + str);
                }
            } catch (Throwable th) {
                q.b(th);
            }
        }
    }

    public static void a(Throwable th, String str, boolean z8) {
        a(th, str, z8, "core_exception_monitor");
    }

    public static void a(Throwable th, String str, boolean z8, @NonNull String str2) {
        a(th, str, z8, (Map<String, String>) null, str2);
    }

    public static void a(final Throwable th, final String str, final boolean z8, final Map<String, String> map, @NonNull final String str2) {
        try {
            p.b().a(new Runnable() { // from class: com.apm.insight.f.b.1
                @Override // java.lang.Runnable
                public void run() {
                    b.b((Object) null, th, str, z8, (Map<String, String>) map, str2);
                }
            });
        } catch (Throwable unused) {
        }
    }

    private static void a(Map<String, String> map, c cVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (map != null) {
                for (String str : map.keySet()) {
                    jSONObject.put(str, map.get(str));
                }
                cVar.a("custom", jSONObject);
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(final StackTraceElement[] stackTraceElementArr, final int i9, @Nullable final String str, final String str2, final Map<String, String> map) {
        try {
            p.b().a(new Runnable() { // from class: com.apm.insight.f.b.3
                @Override // java.lang.Runnable
                public void run() {
                    b.b(stackTraceElementArr, i9, str, str2, "core_exception_monitor", (Map<String, String>) map);
                }
            });
        } catch (Throwable unused) {
        }
    }
}

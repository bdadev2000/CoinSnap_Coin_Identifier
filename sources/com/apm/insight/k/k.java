package com.apm.insight.k;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.apm.insight.l.n;
import com.apm.insight.runtime.p;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class k {
    private static File a = null;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f3218b = false;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f3219c = false;

    /* renamed from: d, reason: collision with root package name */
    private static String f3220d = "exception_modules";

    /* renamed from: e, reason: collision with root package name */
    private static String f3221e = "npth";

    /* renamed from: f, reason: collision with root package name */
    private static Map<String, String> f3222f;

    public static void a(String str) {
        if (f3222f == null) {
            f3222f = new HashMap();
        }
        f3222f.put(str, String.valueOf(System.currentTimeMillis()));
    }

    public static boolean b() {
        return f3219c;
    }

    public static void c() {
        if (f3218b) {
            return;
        }
        f3219c = true;
        File file = new File(n.j(com.apm.insight.i.g()), "apminsight/configCrash/configFile");
        if (file.exists()) {
            try {
                com.apm.insight.runtime.a.a(new JSONArray(com.apm.insight.l.h.c(file)), false);
                f3218b = true;
            } catch (Throwable unused) {
                com.apm.insight.runtime.a.a((JSONArray) null, false);
            }
        }
    }

    public static void d() {
        c();
        if (a(false)) {
            a.a();
        }
    }

    public static void e() {
        p.b().a(new Runnable() { // from class: com.apm.insight.k.k.1
            @Override // java.lang.Runnable
            public void run() {
                if (k.a(false)) {
                    a.a();
                }
            }
        });
    }

    public static void f() {
        Map<String, String> map = f3222f;
        if (map != null) {
            map.clear();
        }
    }

    @NonNull
    private static File g() {
        if (a == null) {
            a = new File(n.j(com.apm.insight.i.g()), "apminsight/configCrash/configInvalid");
        }
        return a;
    }

    public static void a(boolean z10, JSONArray jSONArray) {
        try {
            com.apm.insight.l.h.a(new File(n.j(com.apm.insight.i.g()), "apminsight/configCrash/configFile"), jSONArray, false);
        } catch (IOException unused) {
        }
        try {
            com.apm.insight.l.h.a(g(), f3222f);
        } catch (Throwable unused2) {
        }
    }

    public static boolean a() {
        return f3218b;
    }

    public static boolean a(boolean z10) {
        File g10 = g();
        try {
            Map<String, String> map = f3222f;
            if (map == null) {
                map = com.apm.insight.l.h.e(g10);
            }
            f3222f = map;
            if (map == null) {
                f3222f = new HashMap();
                return true;
            }
            if (map.size() < com.apm.insight.entity.b.c()) {
                return true;
            }
            Iterator<String> it = com.apm.insight.entity.b.d().iterator();
            while (it.hasNext()) {
                if (!f3222f.containsKey(it.next())) {
                    return true;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            boolean z11 = false;
            for (Map.Entry<String, String> entry : f3222f.entrySet()) {
                try {
                    if (currentTimeMillis - Long.decode(entry.getValue()).longValue() > com.apm.insight.runtime.e.e(entry.getKey())) {
                        z11 = true;
                    }
                } catch (Throwable th2) {
                    com.apm.insight.l.p.a(th2);
                }
            }
            com.apm.insight.l.p.a((Object) (z11 ? "config should be updated" : "config should not be updated"));
            return z11;
        } catch (Throwable th3) {
            Log.e("npth", NotificationCompat.CATEGORY_ERROR, th3);
            return true;
        }
    }
}

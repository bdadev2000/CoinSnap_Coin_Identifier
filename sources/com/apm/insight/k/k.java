package com.apm.insight.k;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.apm.insight.l.o;
import com.apm.insight.l.q;
import com.apm.insight.runtime.p;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private static File f5908a = null;
    private static boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f5909c = false;

    /* renamed from: d, reason: collision with root package name */
    private static String f5910d = "exception_modules";

    /* renamed from: e, reason: collision with root package name */
    private static String f5911e = "npth";

    /* renamed from: f, reason: collision with root package name */
    private static Map<String, String> f5912f;

    public static void a(String str) {
        if (f5912f == null) {
            f5912f = new HashMap();
        }
        f5912f.put(str, String.valueOf(System.currentTimeMillis()));
    }

    public static boolean b() {
        return f5909c;
    }

    public static void c() {
        if (b) {
            return;
        }
        f5909c = true;
        File file = new File(o.j(com.apm.insight.i.g()), "apminsight/configCrash/configFile");
        if (file.exists()) {
            try {
                com.apm.insight.runtime.a.a(new JSONArray(com.apm.insight.l.i.c(file)), false);
                b = true;
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
        Map<String, String> map = f5912f;
        if (map != null) {
            map.clear();
        }
    }

    @NonNull
    private static File g() {
        if (f5908a == null) {
            f5908a = new File(o.j(com.apm.insight.i.g()), "apminsight/configCrash/configInvalid");
        }
        return f5908a;
    }

    public static void a(boolean z8, JSONArray jSONArray) {
        try {
            com.apm.insight.l.i.a(new File(o.j(com.apm.insight.i.g()), "apminsight/configCrash/configFile"), jSONArray, false);
        } catch (IOException unused) {
        }
        try {
            com.apm.insight.l.i.a(g(), f5912f);
        } catch (Throwable unused2) {
        }
    }

    public static boolean a() {
        return b;
    }

    public static boolean a(boolean z8) {
        File g9 = g();
        try {
            Map<String, String> map = f5912f;
            if (map == null) {
                map = com.apm.insight.l.i.e(g9);
            }
            f5912f = map;
            if (map == null) {
                f5912f = new HashMap();
                return true;
            }
            if (map.size() < com.apm.insight.entity.b.c()) {
                return true;
            }
            Iterator<String> it = com.apm.insight.entity.b.d().iterator();
            while (it.hasNext()) {
                if (!f5912f.containsKey(it.next())) {
                    return true;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            boolean z9 = false;
            for (Map.Entry<String, String> entry : f5912f.entrySet()) {
                try {
                    if (currentTimeMillis - Long.decode(entry.getValue()).longValue() > com.apm.insight.runtime.e.e(entry.getKey())) {
                        z9 = true;
                    }
                } catch (Throwable th) {
                    q.a(th);
                }
            }
            q.a((Object) (z9 ? "config should be updated" : "config should not be updated"));
            return z9;
        } catch (Throwable th2) {
            Log.e("npth", NotificationCompat.CATEGORY_ERROR, th2);
            return true;
        }
    }
}

package com.apm.insight.h;

import com.apm.insight.i;
import com.apm.insight.l.q;
import com.apm.insight.runtime.p;
import com.apm.insight.runtime.r;
import java.io.File;
import java.util.HashMap;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static HashMap<String, String> f5813a;

    public static String a() {
        return i.g().getFilesDir() + "/apminsight/selflib/";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String e(String str) {
        return i.g().getFilesDir() + "/apminsight/selflib/" + str + ".ver";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean f(String str) {
        return "1.3.8.nourl-alpha.19".equals(f5813a.get(str)) && new File(a(str)).exists();
    }

    public static String a(String str) {
        return i.g().getFilesDir() + "/apminsight/selflib/lib" + str + ".so";
    }

    public static void b(final String str) {
        p.b().a(new Runnable() { // from class: com.apm.insight.h.b.1

            /* renamed from: a, reason: collision with root package name */
            boolean f5814a = false;

            @Override // java.lang.Runnable
            public void run() {
                String str2;
                String str3;
                b.d();
                if (b.f(str)) {
                    return;
                }
                r.a("updateSo", str);
                File file = new File(b.a(str));
                file.getParentFile().mkdirs();
                if (file.exists()) {
                    file.delete();
                }
                q.a("doUnpackLibrary: " + str);
                try {
                    str2 = c.a(i.g(), str, file);
                } catch (Throwable th) {
                    r.a("updateSoError", str);
                    com.apm.insight.c.a().a("NPTH_CATCH", th);
                    str2 = null;
                }
                if (str2 == null) {
                    b.f5813a.put(file.getName(), "1.3.8.nourl-alpha.19");
                    try {
                        com.apm.insight.l.i.a(new File(b.e(str)), "1.3.8.nourl-alpha.19", false);
                    } catch (Throwable unused) {
                    }
                    str3 = "updateSoSuccess";
                } else {
                    if (!this.f5814a) {
                        this.f5814a = true;
                        r.a("updateSoPostRetry", str);
                        p.b().a(this, 3000L);
                        return;
                    }
                    str3 = "updateSoFailed";
                }
                r.a(str3, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d() {
        if (f5813a != null) {
            return;
        }
        f5813a = new HashMap<>();
        File file = new File(i.g().getFilesDir(), "/apminsight/selflib/");
        String[] list = file.list();
        if (list == null) {
            return;
        }
        for (String str : list) {
            if (str.endsWith(".ver")) {
                try {
                    f5813a.put(str.substring(0, str.length() - 4), com.apm.insight.l.i.c(file.getAbsolutePath() + "/" + str));
                } catch (Throwable th) {
                    com.apm.insight.c.a().a("NPTH_CATCH", th);
                }
            } else if (!str.endsWith(".so")) {
                com.apm.insight.l.i.a(new File(file, str));
            }
        }
    }
}

package com.apm.insight.h;

import com.apm.insight.i;
import com.apm.insight.l.h;
import com.apm.insight.runtime.p;
import com.apm.insight.runtime.r;
import java.io.File;
import java.util.HashMap;

/* loaded from: classes.dex */
public class b {
    private static HashMap<String, String> a;

    public static String a() {
        return i.g().getFilesDir() + "/apminsight/selflib/";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String e(String str) {
        return i.g().getFilesDir() + "/apminsight/selflib/" + str + ".ver";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean f(String str) {
        return "1.3.8.nourl-alpha.22".equals(a.get(str)) && new File(a(str)).exists();
    }

    public static String a(String str) {
        return i.g().getFilesDir() + "/apminsight/selflib/lib" + str + ".so";
    }

    public static void b(final String str) {
        p.b().a(new Runnable() { // from class: com.apm.insight.h.b.1
            boolean a = false;

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
                com.apm.insight.l.p.a("doUnpackLibrary: " + str);
                try {
                    str2 = c.a(i.g(), str, file);
                } catch (Throwable th2) {
                    r.a("updateSoError", str);
                    com.apm.insight.c.a().a("NPTH_CATCH", th2);
                    str2 = null;
                }
                if (str2 == null) {
                    b.a.put(file.getName(), "1.3.8.nourl-alpha.22");
                    try {
                        h.a(new File(b.e(str)), "1.3.8.nourl-alpha.22", false);
                    } catch (Throwable unused) {
                    }
                    str3 = "updateSoSuccess";
                } else {
                    if (!this.a) {
                        this.a = true;
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
        if (a != null) {
            return;
        }
        a = new HashMap<>();
        File file = new File(i.g().getFilesDir(), "/apminsight/selflib/");
        String[] list = file.list();
        if (list == null) {
            return;
        }
        for (String str : list) {
            if (str.endsWith(".ver")) {
                try {
                    a.put(str.substring(0, str.length() - 4), h.c(file.getAbsolutePath() + "/" + str));
                } catch (Throwable th2) {
                    com.apm.insight.c.a().a("NPTH_CATCH", th2);
                }
            } else if (!str.endsWith(".so")) {
                h.a(new File(file, str));
            }
        }
    }
}

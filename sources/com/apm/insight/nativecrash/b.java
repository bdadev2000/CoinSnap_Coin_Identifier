package com.apm.insight.nativecrash;

import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.Npth;
import com.apm.insight.b.g;
import com.apm.insight.b.k;
import com.apm.insight.i;
import com.apm.insight.l.h;
import com.apm.insight.l.n;
import com.apm.insight.l.p;
import com.apm.insight.l.u;
import com.apm.insight.runtime.a.c;
import com.apm.insight.runtime.a.f;
import com.apm.insight.runtime.o;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {
    public static int a() {
        return 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if ("main".equalsIgnoreCase(str)) {
            return u.a(Looper.getMainLooper().getThread().getStackTrace());
        }
        ThreadGroup threadGroup = Looper.getMainLooper().getThread().getThreadGroup();
        int activeCount = threadGroup.activeCount();
        Thread[] threadArr = new Thread[(activeCount / 2) + activeCount];
        int enumerate = threadGroup.enumerate(threadArr);
        for (int i10 = 0; i10 < enumerate; i10++) {
            String name = threadArr[i10].getName();
            if (!TextUtils.isEmpty(name) && (name.equals(str) || name.startsWith(str) || name.endsWith(str))) {
                return u.a(threadArr[i10].getStackTrace());
            }
        }
        try {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                String name2 = entry.getKey().getName();
                if (name2.equals(str) || name2.startsWith(str) || name2.endsWith(str)) {
                    return u.a(entry.getValue());
                }
            }
        } catch (Throwable th2) {
            com.apm.insight.c.a().a("NPTH_CATCH", th2);
        }
        return "";
    }

    @Keep
    public static void onNativeCrash(final String str) {
        String c10;
        String a;
        final long currentTimeMillis = System.currentTimeMillis();
        p.a((Object) "[onNativeCrash] enter");
        try {
            try {
                com.apm.insight.k.b.a().b();
                final File e2 = n.e(new File(n.a(), i.f()));
                com.apm.insight.entity.a a10 = f.a().a(CrashType.NATIVE, null, new c.a() { // from class: com.apm.insight.nativecrash.b.1
                    @Override // com.apm.insight.runtime.a.c.a
                    public com.apm.insight.entity.a a(int i10, com.apm.insight.entity.a aVar) {
                        String str2;
                        String str3;
                        str2 = "true";
                        if (i10 != 1) {
                            if (i10 == 2) {
                                JSONArray c11 = g.b().c();
                                long uptimeMillis = SystemClock.uptimeMillis();
                                JSONObject a11 = g.b().a(uptimeMillis).a();
                                JSONArray a12 = k.a(100, uptimeMillis);
                                aVar.a("history_message", (Object) c11);
                                aVar.a("current_message", a11);
                                aVar.a("pending_messages", (Object) a12);
                                aVar.a("disable_looper_monitor", String.valueOf(com.apm.insight.runtime.a.d()));
                                aVar.a("npth_force_apm_crash", String.valueOf(com.apm.insight.c.b.a()));
                            } else if (i10 != 3) {
                                if (i10 == 4) {
                                    com.apm.insight.l.a.a(i.g(), aVar.h());
                                }
                            } else if (com.apm.insight.runtime.a.e()) {
                                aVar.a("all_thread_stacks", u.b(str));
                                str3 = "has_all_thread_stack";
                            }
                            return aVar;
                        }
                        String str4 = str;
                        if (str4 != null && str4.length() != 0) {
                            aVar.a("java_data", (Object) b.b(str));
                        }
                        str2 = Npth.hasCrashWhenNativeCrash() ? "true" : "false";
                        str3 = "crash_after_crash";
                        aVar.a(str3, str2);
                        return aVar;
                    }

                    @Override // com.apm.insight.runtime.a.c.a
                    public com.apm.insight.entity.a a(int i10, com.apm.insight.entity.a aVar, boolean z10) {
                        try {
                            JSONObject h10 = aVar.h();
                            if (h10.length() > 0) {
                                h.a(new File(e2.getAbsolutePath() + '.' + i10), h10, false);
                            }
                        } catch (IOException e10) {
                            com.apm.insight.c.a().a("NPTH_CATCH", e10);
                        }
                        if (i10 == 0) {
                            com.apm.insight.a.a.a().b();
                            com.apm.insight.a.a.a().a(CrashType.NATIVE, currentTimeMillis, i.f());
                        }
                        return aVar;
                    }

                    @Override // com.apm.insight.runtime.a.c.a
                    public void a(Throwable th2) {
                    }
                }, true);
                JSONObject h10 = a10.h();
                if (h10 != null && h10.length() != 0) {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    long j3 = currentTimeMillis2 - currentTimeMillis;
                    try {
                        h10.put("java_end", currentTimeMillis2);
                        a10.b("crash_cost", String.valueOf(j3));
                        a10.a("crash_cost", String.valueOf(j3 / 1000));
                    } catch (Throwable unused) {
                    }
                    File file = new File(e2.getAbsolutePath() + ".tmp");
                    h.a(file, h10, false);
                    file.renameTo(e2);
                }
            } catch (Throwable th2) {
                try {
                    com.apm.insight.c.a().a("NPTH_CATCH", th2);
                    if (o.a().d().isEmpty()) {
                        return;
                    }
                    File file2 = new File(n.a(), i.f());
                    e eVar = new e(file2);
                    eVar.b(file2);
                    c10 = eVar.c();
                    a = eVar.a();
                } catch (Throwable th3) {
                    try {
                        if (!o.a().d().isEmpty()) {
                            File file3 = new File(n.a(), i.f());
                            e eVar2 = new e(file3);
                            eVar2.b(file3);
                            a(eVar2.c(), eVar2.a(), str);
                        }
                    } catch (Throwable unused2) {
                        a("", null, str);
                    }
                    throw th3;
                }
            }
            if (o.a().d().isEmpty()) {
                return;
            }
            File file4 = new File(n.a(), i.f());
            e eVar3 = new e(file4);
            eVar3.b(file4);
            c10 = eVar3.c();
            a = eVar3.a();
            a(c10, a, str);
        } catch (Throwable unused3) {
            a("", null, str);
        }
    }

    private static void a(String str, String str2, String str3) {
        for (ICrashCallback iCrashCallback : o.a().d()) {
            try {
                if (iCrashCallback instanceof com.apm.insight.b) {
                    ((com.apm.insight.b) iCrashCallback).a(CrashType.NATIVE, str, str3, str2);
                } else {
                    iCrashCallback.onCrash(CrashType.NATIVE, str, null);
                }
            } catch (Throwable th2) {
                com.apm.insight.c.a().a("NPTH_CATCH", th2);
            }
        }
    }
}

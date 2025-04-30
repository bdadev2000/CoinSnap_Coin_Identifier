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
import com.apm.insight.l.o;
import com.apm.insight.l.q;
import com.apm.insight.l.v;
import com.apm.insight.runtime.a.c;
import com.apm.insight.runtime.a.f;
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
            return v.a(Looper.getMainLooper().getThread().getStackTrace());
        }
        ThreadGroup threadGroup = Looper.getMainLooper().getThread().getThreadGroup();
        int activeCount = threadGroup.activeCount();
        Thread[] threadArr = new Thread[(activeCount / 2) + activeCount];
        int enumerate = threadGroup.enumerate(threadArr);
        for (int i9 = 0; i9 < enumerate; i9++) {
            String name = threadArr[i9].getName();
            if (!TextUtils.isEmpty(name) && (name.equals(str) || name.startsWith(str) || name.endsWith(str))) {
                return v.a(threadArr[i9].getStackTrace());
            }
        }
        try {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                String name2 = entry.getKey().getName();
                if (!name2.equals(str) && !name2.startsWith(str) && !name2.endsWith(str)) {
                }
                return v.a(entry.getValue());
            }
        } catch (Throwable th) {
            com.apm.insight.c.a().a("NPTH_CATCH", th);
        }
        return "";
    }

    @Keep
    public static void onNativeCrash(final String str) {
        String c9;
        String a6;
        final long currentTimeMillis = System.currentTimeMillis();
        q.a((Object) "[onNativeCrash] enter");
        try {
            try {
                com.apm.insight.k.b.a().b();
                final File e4 = o.e(new File(o.a(), i.f()));
                com.apm.insight.entity.a a9 = f.a().a(CrashType.NATIVE, null, new c.a() { // from class: com.apm.insight.nativecrash.b.1
                    @Override // com.apm.insight.runtime.a.c.a
                    public com.apm.insight.entity.a a(int i9, com.apm.insight.entity.a aVar) {
                        String str2;
                        String str3;
                        str2 = "true";
                        if (i9 != 1) {
                            if (i9 == 2) {
                                JSONArray c10 = g.b().c();
                                long uptimeMillis = SystemClock.uptimeMillis();
                                JSONObject a10 = g.b().a(uptimeMillis).a();
                                JSONArray a11 = k.a(100, uptimeMillis);
                                aVar.a("history_message", (Object) c10);
                                aVar.a("current_message", a10);
                                aVar.a("pending_messages", (Object) a11);
                                aVar.a("disable_looper_monitor", String.valueOf(com.apm.insight.runtime.a.d()));
                                aVar.a("npth_force_apm_crash", String.valueOf(com.apm.insight.c.b.a()));
                            } else if (i9 != 3) {
                                if (i9 == 4) {
                                    com.apm.insight.l.a.a(i.g(), aVar.h());
                                }
                            } else if (com.apm.insight.runtime.a.e()) {
                                aVar.a("all_thread_stacks", v.b(str));
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
                    public com.apm.insight.entity.a a(int i9, com.apm.insight.entity.a aVar, boolean z8) {
                        try {
                            JSONObject h6 = aVar.h();
                            if (h6.length() > 0) {
                                com.apm.insight.l.i.a(new File(e4.getAbsolutePath() + '.' + i9), h6, false);
                            }
                        } catch (IOException e9) {
                            com.apm.insight.c.a().a("NPTH_CATCH", e9);
                        }
                        if (i9 == 0) {
                            com.apm.insight.a.a.a().b();
                            com.apm.insight.a.a.a().a(CrashType.NATIVE, currentTimeMillis, i.f());
                        }
                        return aVar;
                    }

                    @Override // com.apm.insight.runtime.a.c.a
                    public void a(Throwable th) {
                    }
                }, true);
                JSONObject h6 = a9.h();
                if (h6 != null && h6.length() != 0) {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    long j7 = currentTimeMillis2 - currentTimeMillis;
                    try {
                        h6.put("java_end", currentTimeMillis2);
                        a9.b("crash_cost", String.valueOf(j7));
                        a9.a("crash_cost", String.valueOf(j7 / 1000));
                    } catch (Throwable unused) {
                    }
                    File file = new File(e4.getAbsolutePath() + ".tmp");
                    com.apm.insight.l.i.a(file, h6, false);
                    file.renameTo(e4);
                }
            } catch (Throwable th) {
                try {
                    com.apm.insight.c.a().a("NPTH_CATCH", th);
                    if (com.apm.insight.runtime.o.a().d().isEmpty()) {
                        return;
                    }
                    File file2 = new File(o.a(), i.f());
                    e eVar = new e(file2);
                    eVar.b(file2);
                    c9 = eVar.c();
                    a6 = eVar.a();
                } catch (Throwable th2) {
                    try {
                        if (!com.apm.insight.runtime.o.a().d().isEmpty()) {
                            File file3 = new File(o.a(), i.f());
                            e eVar2 = new e(file3);
                            eVar2.b(file3);
                            a(eVar2.c(), eVar2.a(), str);
                        }
                    } catch (Throwable unused2) {
                        a("", null, str);
                    }
                    throw th2;
                }
            }
            if (com.apm.insight.runtime.o.a().d().isEmpty()) {
                return;
            }
            File file4 = new File(o.a(), i.f());
            e eVar3 = new e(file4);
            eVar3.b(file4);
            c9 = eVar3.c();
            a6 = eVar3.a();
            a(c9, a6, str);
        } catch (Throwable unused3) {
            a("", null, str);
        }
    }

    private static void a(String str, String str2, String str3) {
        for (ICrashCallback iCrashCallback : com.apm.insight.runtime.o.a().d()) {
            try {
                if (iCrashCallback instanceof com.apm.insight.b) {
                    ((com.apm.insight.b) iCrashCallback).a(CrashType.NATIVE, str, str3, str2);
                } else {
                    iCrashCallback.onCrash(CrashType.NATIVE, str, null);
                }
            } catch (Throwable th) {
                com.apm.insight.c.a().a("NPTH_CATCH", th);
            }
        }
    }
}

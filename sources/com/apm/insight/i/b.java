package com.apm.insight.i;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.adjust.sdk.Constants;
import com.apm.insight.CrashType;
import com.apm.insight.Npth;
import com.apm.insight.b.g;
import com.apm.insight.b.k;
import com.apm.insight.g.c;
import com.apm.insight.i;
import com.apm.insight.l.h;
import com.apm.insight.l.n;
import com.apm.insight.l.q;
import com.apm.insight.l.u;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.a.c;
import com.apm.insight.runtime.a.f;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b implements c {
    private Context a;

    public b(@NonNull Context context) {
        this.a = context;
    }

    private synchronized void b(final long j3, final Thread thread, final Throwable th2, final String str, File file, final String str2, final boolean z10) {
        final File file2 = new File(n.a(this.a), str);
        com.apm.insight.g.a.a().a(file2.getName());
        file2.mkdirs();
        h.f(file2);
        final boolean c10 = u.c(th2);
        com.apm.insight.entity.a a = f.a().a(CrashType.LAUNCH, null, new c.a() { // from class: com.apm.insight.i.b.1
            long a = 0;

            @Override // com.apm.insight.runtime.a.c.a
            public com.apm.insight.entity.a a(int i10, com.apm.insight.entity.a aVar) {
                String str3;
                String valueOf;
                this.a = SystemClock.uptimeMillis();
                if (i10 == 0) {
                    aVar.a("stack", (Object) u.a(th2));
                    aVar.a("event_type", "start_crash");
                    aVar.a("isOOM", Boolean.valueOf(c10));
                    aVar.a("crash_time", Long.valueOf(j3));
                    aVar.a("launch_mode", Integer.valueOf(com.apm.insight.runtime.a.b.b()));
                    aVar.a("launch_time", Long.valueOf(com.apm.insight.runtime.a.b.c()));
                    String str4 = str2;
                    if (str4 != null) {
                        aVar.a("crash_md5", (Object) str4);
                        aVar.a("crash_md5", str2);
                        boolean z11 = z10;
                        if (z11) {
                            str3 = "has_ignore";
                            valueOf = String.valueOf(z11);
                            aVar.a(str3, valueOf);
                        }
                    }
                } else if (i10 == 1) {
                    aVar.a(CampaignEx.JSON_KEY_TIMESTAMP, Long.valueOf(j3));
                    aVar.a("main_process", Boolean.valueOf(com.apm.insight.l.a.b(b.this.a)));
                    aVar.a("crash_type", CrashType.JAVA);
                    Thread thread2 = thread;
                    aVar.a("crash_thread_name", (Object) (thread2 != null ? thread2.getName() : ""));
                    aVar.a("tid", Integer.valueOf(Process.myTid()));
                    aVar.a("crash_after_crash", Npth.hasCrashWhenJavaCrash() ? "true" : "false");
                    aVar.a("crash_after_native", NativeImpl.d() ? "true" : "false");
                    com.apm.insight.g.a.a().a(thread, th2, true, aVar);
                } else if (i10 == 2) {
                    if (c10) {
                        com.apm.insight.l.a.a(b.this.a, aVar.h());
                    }
                    aVar.a("launch_did", (Object) a.a(b.this.a));
                    JSONArray c11 = g.b().c();
                    long uptimeMillis = SystemClock.uptimeMillis();
                    JSONObject a10 = g.b().a(uptimeMillis).a();
                    JSONArray a11 = k.a(100, uptimeMillis);
                    aVar.a("history_message", (Object) c11);
                    aVar.a("current_message", a10);
                    aVar.a("pending_messages", (Object) a11);
                    aVar.a("disable_looper_monitor", String.valueOf(com.apm.insight.runtime.a.d()));
                    valueOf = String.valueOf(com.apm.insight.c.b.a());
                    str3 = "npth_force_apm_crash";
                    aVar.a(str3, valueOf);
                } else if (i10 == 3) {
                    JSONObject b3 = u.b(Thread.currentThread().getName());
                    if (b3 != null) {
                        aVar.a("all_thread_stacks", b3);
                    }
                    aVar.a("logcat", (Object) com.apm.insight.runtime.k.b(i.f()));
                } else if (i10 != 4) {
                    if (i10 == 5) {
                        aVar.a("crash_uuid", (Object) str);
                    }
                } else if (!c10) {
                    com.apm.insight.l.a.a(b.this.a, aVar.h());
                }
                return aVar;
            }

            @Override // com.apm.insight.runtime.a.c.a
            public com.apm.insight.entity.a a(int i10, com.apm.insight.entity.a aVar, boolean z11) {
                if (q.a(q.b(i10))) {
                    return aVar;
                }
                try {
                    h.a(new File(file2, file2.getName() + "." + i10), aVar.h(), false);
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                return aVar;
            }

            @Override // com.apm.insight.runtime.a.c.a
            public void a(Throwable th3) {
            }
        }, true);
        long currentTimeMillis = System.currentTimeMillis() - j3;
        try {
            a.a("crash_type", Constants.NORMAL);
            a.b("crash_cost", String.valueOf(currentTimeMillis));
            a.a("crash_cost", String.valueOf(currentTimeMillis / 1000));
        } catch (Throwable th3) {
            com.apm.insight.c.a().a("NPTH_CATCH", th3);
        }
        if (q.a(4)) {
            return;
        }
        if (!Npth.isStopUpload()) {
            if (!q.a(2048)) {
            }
        }
    }

    @Override // com.apm.insight.g.c
    public void a(long j3, Thread thread, Throwable th2, String str, File file, String str2, boolean z10) {
        b(j3, thread, th2, str, file, str2, z10);
    }

    @Override // com.apm.insight.g.c
    public boolean a(Throwable th2) {
        return true;
    }
}

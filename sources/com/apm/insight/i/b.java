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
import com.apm.insight.l.i;
import com.apm.insight.l.o;
import com.apm.insight.l.r;
import com.apm.insight.l.v;
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

    /* renamed from: a, reason: collision with root package name */
    private Context f5833a;

    public b(@NonNull Context context) {
        this.f5833a = context;
    }

    private synchronized void b(final long j7, final Thread thread, final Throwable th, final String str, File file, final String str2, final boolean z8) {
        final File file2 = new File(o.a(this.f5833a), str);
        com.apm.insight.g.a.a().a(file2.getName());
        file2.mkdirs();
        i.f(file2);
        final boolean c9 = v.c(th);
        com.apm.insight.entity.a a6 = f.a().a(CrashType.LAUNCH, null, new c.a() { // from class: com.apm.insight.i.b.1

            /* renamed from: a, reason: collision with root package name */
            long f5834a = 0;

            @Override // com.apm.insight.runtime.a.c.a
            public com.apm.insight.entity.a a(int i9, com.apm.insight.entity.a aVar) {
                String str3;
                String valueOf;
                this.f5834a = SystemClock.uptimeMillis();
                if (i9 == 0) {
                    aVar.a("stack", (Object) v.a(th));
                    aVar.a("event_type", "start_crash");
                    aVar.a("isOOM", Boolean.valueOf(c9));
                    aVar.a("crash_time", Long.valueOf(j7));
                    aVar.a("launch_mode", Integer.valueOf(com.apm.insight.runtime.a.b.b()));
                    aVar.a("launch_time", Long.valueOf(com.apm.insight.runtime.a.b.c()));
                    String str4 = str2;
                    if (str4 != null) {
                        aVar.a("crash_md5", (Object) str4);
                        aVar.a("crash_md5", str2);
                        boolean z9 = z8;
                        if (z9) {
                            str3 = "has_ignore";
                            valueOf = String.valueOf(z9);
                            aVar.a(str3, valueOf);
                        }
                    }
                } else if (i9 == 1) {
                    aVar.a(CampaignEx.JSON_KEY_TIMESTAMP, Long.valueOf(j7));
                    aVar.a("main_process", Boolean.valueOf(com.apm.insight.l.a.b(b.this.f5833a)));
                    aVar.a("crash_type", CrashType.JAVA);
                    Thread thread2 = thread;
                    aVar.a("crash_thread_name", (Object) (thread2 != null ? thread2.getName() : ""));
                    aVar.a("tid", Integer.valueOf(Process.myTid()));
                    aVar.a("crash_after_crash", Npth.hasCrashWhenJavaCrash() ? "true" : "false");
                    aVar.a("crash_after_native", NativeImpl.d() ? "true" : "false");
                    com.apm.insight.g.a.a().a(thread, th, true, aVar);
                } else if (i9 == 2) {
                    if (c9) {
                        com.apm.insight.l.a.a(b.this.f5833a, aVar.h());
                    }
                    aVar.a("launch_did", (Object) a.a(b.this.f5833a));
                    JSONArray c10 = g.b().c();
                    long uptimeMillis = SystemClock.uptimeMillis();
                    JSONObject a9 = g.b().a(uptimeMillis).a();
                    JSONArray a10 = k.a(100, uptimeMillis);
                    aVar.a("history_message", (Object) c10);
                    aVar.a("current_message", a9);
                    aVar.a("pending_messages", (Object) a10);
                    aVar.a("disable_looper_monitor", String.valueOf(com.apm.insight.runtime.a.d()));
                    valueOf = String.valueOf(com.apm.insight.c.b.a());
                    str3 = "npth_force_apm_crash";
                    aVar.a(str3, valueOf);
                } else if (i9 == 3) {
                    JSONObject b = v.b(Thread.currentThread().getName());
                    if (b != null) {
                        aVar.a("all_thread_stacks", b);
                    }
                    aVar.a("logcat", (Object) com.apm.insight.runtime.k.b(com.apm.insight.i.f()));
                } else if (i9 != 4) {
                    if (i9 == 5) {
                        aVar.a("crash_uuid", (Object) str);
                    }
                } else if (!c9) {
                    com.apm.insight.l.a.a(b.this.f5833a, aVar.h());
                }
                return aVar;
            }

            @Override // com.apm.insight.runtime.a.c.a
            public com.apm.insight.entity.a a(int i9, com.apm.insight.entity.a aVar, boolean z9) {
                if (r.a(r.b(i9))) {
                    return aVar;
                }
                try {
                    i.a(new File(file2, file2.getName() + "." + i9), aVar.h(), false);
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
                return aVar;
            }

            @Override // com.apm.insight.runtime.a.c.a
            public void a(Throwable th2) {
            }
        }, true);
        long currentTimeMillis = System.currentTimeMillis() - j7;
        try {
            a6.a("crash_type", Constants.NORMAL);
            a6.b("crash_cost", String.valueOf(currentTimeMillis));
            a6.a("crash_cost", String.valueOf(currentTimeMillis / 1000));
        } catch (Throwable th2) {
            com.apm.insight.c.a().a("NPTH_CATCH", th2);
        }
        if (r.a(4)) {
            return;
        }
        if (!Npth.isStopUpload()) {
            if (!r.a(2048)) {
            }
        }
    }

    @Override // com.apm.insight.g.c
    public void a(long j7, Thread thread, Throwable th, String str, File file, String str2, boolean z8) {
        b(j7, thread, th, str, file, str2, z8);
    }

    @Override // com.apm.insight.g.c
    public boolean a(Throwable th) {
        return true;
    }
}

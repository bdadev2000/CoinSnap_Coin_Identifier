package com.apm.insight.k;

import androidx.annotation.Nullable;
import com.apm.insight.l.o;
import com.apm.insight.runtime.p;
import com.apm.insight.runtime.u;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.Map;

/* loaded from: classes.dex */
public class a {
    private static Runnable a = new Runnable() { // from class: com.apm.insight.k.a.1
        @Override // java.lang.Runnable
        public void run() {
            u b3;
            Runnable runnable;
            long j3;
            if (o.b(com.apm.insight.i.g())) {
                a.i();
            }
            if (a.f3161b > 0) {
                if (com.apm.insight.l.a.b(com.apm.insight.i.g())) {
                    b3 = p.b();
                    runnable = a.a;
                    j3 = 15000;
                } else {
                    b3 = p.b();
                    runnable = a.a;
                    j3 = ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
                }
                b3.a(runnable, j3);
            }
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private static int f3161b = 0;

    public static void a() {
        f3161b = 40;
        p.b().a(a);
    }

    public static void b() {
        if (!k.b()) {
            k.c();
        }
        if (o.b(com.apm.insight.i.g()) && k.a(false)) {
            i();
        }
    }

    public static boolean c() {
        return false;
    }

    public static void d() {
    }

    @Nullable
    private static byte[] h() {
        try {
            return e.a(com.apm.insight.i.i().getConfigUrl(), (Map<String, String>) null, com.apm.insight.entity.b.a().toString().getBytes());
        } catch (Throwable th2) {
            com.apm.insight.l.p.a(th2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        if (com.apm.insight.k.k.a() != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized void i() {
        /*
            java.lang.String r0 = "after fetchApmConfig net "
            java.lang.Class<com.apm.insight.k.a> r1 = com.apm.insight.k.a.class
            monitor-enter(r1)
            int r2 = com.apm.insight.k.a.f3161b     // Catch: java.lang.Throwable -> L65
            r3 = 1
            if (r2 <= 0) goto Ld
            int r2 = r2 - r3
            com.apm.insight.k.a.f3161b = r2     // Catch: java.lang.Throwable -> L65
        Ld:
            java.lang.String r2 = "try fetchApmConfig"
            com.apm.insight.l.p.a(r2)     // Catch: java.lang.Throwable -> L65
            android.content.Context r2 = com.apm.insight.i.g()     // Catch: java.lang.Throwable -> L65
            boolean r2 = com.apm.insight.l.a.b(r2)     // Catch: java.lang.Throwable -> L65
            r4 = 0
            if (r2 == 0) goto L59
            r2 = 0
            byte[] r5 = h()     // Catch: java.lang.Throwable -> L35
            if (r5 == 0) goto L3b
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L35
            java.lang.String r7 = new java.lang.String     // Catch: java.lang.Throwable -> L35
            r7.<init>(r5)     // Catch: java.lang.Throwable -> L35
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L35
            java.lang.String r5 = "data"
            org.json.JSONArray r2 = r6.optJSONArray(r5)     // Catch: java.lang.Throwable -> L35
            goto L3b
        L35:
            r5 = move-exception
            java.lang.String r6 = "npth"
            com.apm.insight.l.p.a(r6, r5)     // Catch: java.lang.Throwable -> L65
        L3b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L65
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L65
            r5.append(r2)     // Catch: java.lang.Throwable -> L65
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L65
            com.apm.insight.l.p.a(r0)     // Catch: java.lang.Throwable -> L65
            if (r2 == 0) goto L52
            com.apm.insight.runtime.a.a(r2, r3)     // Catch: java.lang.Throwable -> L65
        L4f:
            com.apm.insight.k.a.f3161b = r4     // Catch: java.lang.Throwable -> L65
            goto L63
        L52:
            int r0 = com.apm.insight.k.a.f3161b     // Catch: java.lang.Throwable -> L65
            int r0 = r0 + (-10)
            com.apm.insight.k.a.f3161b = r0     // Catch: java.lang.Throwable -> L65
            goto L63
        L59:
            com.apm.insight.k.k.c()     // Catch: java.lang.Throwable -> L65
            boolean r0 = com.apm.insight.k.k.a()     // Catch: java.lang.Throwable -> L65
            if (r0 == 0) goto L63
            goto L4f
        L63:
            monitor-exit(r1)
            return
        L65:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.k.a.i():void");
    }
}

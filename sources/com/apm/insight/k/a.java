package com.apm.insight.k;

import androidx.annotation.Nullable;
import com.apm.insight.l.p;
import com.apm.insight.l.q;
import com.apm.insight.runtime.u;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static Runnable f5847a = new Runnable() { // from class: com.apm.insight.k.a.1
        @Override // java.lang.Runnable
        public void run() {
            u b8;
            Runnable runnable;
            long j7;
            if (p.b(com.apm.insight.i.g())) {
                a.i();
            }
            if (a.b > 0) {
                if (com.apm.insight.l.a.b(com.apm.insight.i.g())) {
                    b8 = com.apm.insight.runtime.p.b();
                    runnable = a.f5847a;
                    j7 = 15000;
                } else {
                    b8 = com.apm.insight.runtime.p.b();
                    runnable = a.f5847a;
                    j7 = ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
                }
                b8.a(runnable, j7);
            }
        }
    };
    private static int b = 0;

    public static void a() {
        b = 40;
        com.apm.insight.runtime.p.b().a(f5847a);
    }

    public static void b() {
        if (!k.b()) {
            k.c();
        }
        if (p.b(com.apm.insight.i.g()) && k.a(false)) {
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
        } catch (Throwable th) {
            q.a(th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
    
        if (com.apm.insight.k.k.a() != false) goto L22;
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
            int r2 = com.apm.insight.k.a.b     // Catch: java.lang.Throwable -> Le
            r3 = 1
            if (r2 <= 0) goto L10
            int r2 = r2 - r3
            com.apm.insight.k.a.b = r2     // Catch: java.lang.Throwable -> Le
            goto L10
        Le:
            r0 = move-exception
            goto L68
        L10:
            java.lang.String r2 = "try fetchApmConfig"
            com.apm.insight.l.q.a(r2)     // Catch: java.lang.Throwable -> Le
            android.content.Context r2 = com.apm.insight.i.g()     // Catch: java.lang.Throwable -> Le
            boolean r2 = com.apm.insight.l.a.b(r2)     // Catch: java.lang.Throwable -> Le
            r4 = 0
            if (r2 == 0) goto L5c
            r2 = 0
            byte[] r5 = h()     // Catch: java.lang.Throwable -> L38
            if (r5 == 0) goto L3e
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L38
            java.lang.String r7 = new java.lang.String     // Catch: java.lang.Throwable -> L38
            r7.<init>(r5)     // Catch: java.lang.Throwable -> L38
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L38
            java.lang.String r5 = "data"
            org.json.JSONArray r2 = r6.optJSONArray(r5)     // Catch: java.lang.Throwable -> L38
            goto L3e
        L38:
            r5 = move-exception
            java.lang.String r6 = "npth"
            com.apm.insight.l.q.a(r6, r5)     // Catch: java.lang.Throwable -> Le
        L3e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le
            r5.<init>(r0)     // Catch: java.lang.Throwable -> Le
            r5.append(r2)     // Catch: java.lang.Throwable -> Le
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> Le
            com.apm.insight.l.q.a(r0)     // Catch: java.lang.Throwable -> Le
            if (r2 == 0) goto L55
            com.apm.insight.runtime.a.a(r2, r3)     // Catch: java.lang.Throwable -> Le
        L52:
            com.apm.insight.k.a.b = r4     // Catch: java.lang.Throwable -> Le
            goto L66
        L55:
            int r0 = com.apm.insight.k.a.b     // Catch: java.lang.Throwable -> Le
            int r0 = r0 + (-10)
            com.apm.insight.k.a.b = r0     // Catch: java.lang.Throwable -> Le
            goto L66
        L5c:
            com.apm.insight.k.k.c()     // Catch: java.lang.Throwable -> Le
            boolean r0 = com.apm.insight.k.k.a()     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L66
            goto L52
        L66:
            monitor-exit(r1)
            return
        L68:
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.k.a.i():void");
    }
}

package com.mbridge.msdk.foundation.same.report.b;

import android.text.TextUtils;
import com.applovin.impl.mediation.ads.e;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.report.f;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class c {
    private static long a;

    /* renamed from: b, reason: collision with root package name */
    private static long f13442b;

    /* loaded from: classes4.dex */
    public static final class a implements com.mbridge.msdk.foundation.same.report.b.a {
        @Override // com.mbridge.msdk.foundation.same.report.b.a
        public final void a() {
        }

        @Override // com.mbridge.msdk.foundation.same.report.b.a
        public final void a(final String str, final StackTraceElement[] stackTraceElementArr) {
            if (MBridgeConstans.DEBUG) {
                e.A("onAnrHappened: ", str, "AnrMonitorManager");
            }
            if (c.b(str)) {
                long unused = c.f13442b = System.currentTimeMillis();
                com.mbridge.msdk.foundation.same.f.b.e().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.same.report.b.c.a.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            c.a(str, stackTraceElementArr);
                        } catch (Exception e2) {
                            ad.b("AnrMonitorManager", "handler anr failed", e2);
                        }
                    }
                });
                return;
            }
            ad.a("AnrMonitorManager", "onAnrHappened: can track false");
        }
    }

    public static String b(StackTraceElement[] stackTraceElementArr) {
        return c(stackTraceElementArr) ? "1" : "0";
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0059 A[Catch: Exception -> 0x0071, TryCatch #0 {Exception -> 0x0071, blocks: (B:6:0x0008, B:8:0x0011, B:10:0x0015, B:15:0x0020, B:20:0x0059, B:23:0x002b, B:25:0x0033, B:27:0x003b, B:29:0x0043, B:31:0x004b, B:14:0x005c, B:37:0x005f, B:41:0x0066), top: B:5:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean c(java.lang.StackTraceElement[] r6) {
        /*
            r0 = 0
            if (r6 == 0) goto L7d
            int r1 = r6.length
            if (r1 != 0) goto L8
            goto L7d
        L8:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Exception -> L71
            r1.<init>()     // Catch: java.lang.Exception -> L71
            int r2 = r6.length     // Catch: java.lang.Exception -> L71
            r3 = r0
        Lf:
            if (r3 >= r2) goto L5f
            r4 = r6[r3]     // Catch: java.lang.Exception -> L71
            if (r4 == 0) goto L5c
            java.lang.String r5 = r4.toString()     // Catch: java.lang.Exception -> L71
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L71
            if (r5 == 0) goto L20
            goto L5c
        L20:
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L71
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L71
            if (r5 == 0) goto L2b
            goto L54
        L2b:
            java.lang.String r5 = "com.android"
            boolean r5 = r4.contains(r5)     // Catch: java.lang.Exception -> L71
            if (r5 != 0) goto L56
            java.lang.String r5 = "com.google"
            boolean r5 = r4.contains(r5)     // Catch: java.lang.Exception -> L71
            if (r5 != 0) goto L56
            java.lang.String r5 = "java.lang"
            boolean r5 = r4.contains(r5)     // Catch: java.lang.Exception -> L71
            if (r5 != 0) goto L56
            java.lang.String r5 = "android.os"
            boolean r5 = r4.contains(r5)     // Catch: java.lang.Exception -> L71
            if (r5 != 0) goto L56
            java.lang.String r5 = "android.app"
            boolean r5 = r4.contains(r5)     // Catch: java.lang.Exception -> L71
            if (r5 == 0) goto L54
            goto L56
        L54:
            r5 = r0
            goto L57
        L56:
            r5 = 1
        L57:
            if (r5 != 0) goto L5c
            r1.add(r4)     // Catch: java.lang.Exception -> L71
        L5c:
            int r3 = r3 + 1
            goto Lf
        L5f:
            int r6 = r1.size()     // Catch: java.lang.Exception -> L71
            if (r6 != 0) goto L66
            return r0
        L66:
            java.lang.Object r6 = r1.get(r0)     // Catch: java.lang.Exception -> L71
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L71
            boolean r6 = b(r6)     // Catch: java.lang.Exception -> L71
            return r6
        L71:
            r6 = move-exception
            boolean r1 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r1 == 0) goto L7d
            java.lang.String r1 = "AnrMonitorManager"
            java.lang.String r2 = "isMBridgeFirst exception"
            com.mbridge.msdk.foundation.tools.ad.b(r1, r2, r6)
        L7d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.report.b.c.c(java.lang.StackTraceElement[]):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            for (String str2 : d.a(d.a())) {
                if (!TextUtils.isEmpty(str2) && str.contains(str2)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static String a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr != null && stackTraceElementArr.length != 0) {
            try {
                StringBuilder sb2 = new StringBuilder();
                for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                    if (stackTraceElement != null) {
                        sb2.append(stackTraceElement.toString());
                        sb2.append("\r\n");
                    }
                }
                return sb2.toString();
            } catch (Exception unused) {
            }
        }
        return "";
    }

    public static void a() {
        if (!b()) {
            ad.a("AnrMonitorManager", "anr monitor is not available");
            return;
        }
        try {
            b.a().a(c(), new a()).start();
        } catch (Exception e2) {
            ad.b("AnrMonitorManager", "start anr monitor failed", e2);
        }
    }

    private static boolean b() {
        try {
            return af.a().a("anr_monitor_available", false);
        } catch (Exception e2) {
            ad.b("AnrMonitorManager", "get anr monitor available failed", e2);
            return false;
        }
    }

    public static /* synthetic */ void a(String str, StackTraceElement[] stackTraceElementArr) throws JSONException {
        try {
            JSONObject b3 = d.a(com.mbridge.msdk.foundation.controller.c.m().c()).b(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis())));
            b3.put("crashinfo", str);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exception", b3.toString());
            jSONObject.put("crash_first_index_from_mtg", b(stackTraceElementArr));
            com.mbridge.msdk.tracker.e eVar = new com.mbridge.msdk.tracker.e("m_anr_report");
            eVar.a(jSONObject);
            eVar.a(com.mbridge.msdk.foundation.same.report.c.c());
            eVar.a(0);
            eVar.b(1);
            f.a().d().a(eVar);
        } catch (JSONException e2) {
            ad.b("AnrMonitorManager", "reportANRByEventLibrary anr failed", e2);
        }
    }

    private static int c() {
        try {
            int a10 = af.a().a("anr_check_timeout", 5000);
            if (a10 <= 0) {
                return 5000;
            }
            return a10;
        } catch (Exception e2) {
            ad.b("AnrMonitorManager", "get anr check timeout failed", e2);
            return 5000;
        }
    }
}

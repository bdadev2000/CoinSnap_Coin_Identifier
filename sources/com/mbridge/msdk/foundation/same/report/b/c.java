package com.mbridge.msdk.foundation.same.report.b;

import android.text.TextUtils;
import com.applovin.impl.L;
import com.google.android.gms.common.internal.AccountType;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.report.f;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.tracker.e;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static long f15878a;
    private static long b;

    /* loaded from: classes3.dex */
    public static final class a implements com.mbridge.msdk.foundation.same.report.b.a {
        @Override // com.mbridge.msdk.foundation.same.report.b.a
        public final void a() {
        }

        @Override // com.mbridge.msdk.foundation.same.report.b.a
        public final void a(final String str, final StackTraceElement[] stackTraceElementArr) {
            if (MBridgeConstans.DEBUG) {
                L.C("onAnrHappened: ", str, "AnrMonitorManager");
            }
            if (c.b(str)) {
                long unused = c.b = System.currentTimeMillis();
                com.mbridge.msdk.foundation.same.f.b.e().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.same.report.b.c.a.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            c.a(str, stackTraceElementArr);
                        } catch (Exception e4) {
                            ad.b("AnrMonitorManager", "handler anr failed", e4);
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

    private static boolean c(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr != null && stackTraceElementArr.length != 0) {
            try {
                ArrayList arrayList = new ArrayList();
                for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                    if (stackTraceElement != null && !TextUtils.isEmpty(stackTraceElement.toString())) {
                        String stackTraceElement2 = stackTraceElement.toString();
                        if (!TextUtils.isEmpty(stackTraceElement2)) {
                            if (!stackTraceElement2.contains(MBridgeConstans.APPLICATION_STACK_COM_ANDROID)) {
                                if (!stackTraceElement2.contains(AccountType.GOOGLE)) {
                                    if (!stackTraceElement2.contains("java.lang")) {
                                        if (!stackTraceElement2.contains(MBridgeConstans.APPLICATION_STACK_ANDROID_OS)) {
                                            if (stackTraceElement2.contains(MBridgeConstans.APPLICATION_STACK_ANDROID_APP)) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        arrayList.add(stackTraceElement2);
                    }
                }
                if (arrayList.size() == 0) {
                    return false;
                }
                return b((String) arrayList.get(0));
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("AnrMonitorManager", "isMBridgeFirst exception", e4);
                }
            }
        }
        return false;
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
                StringBuilder sb = new StringBuilder();
                for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                    if (stackTraceElement != null) {
                        sb.append(stackTraceElement.toString());
                        sb.append("\r\n");
                    }
                }
                return sb.toString();
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
        } catch (Exception e4) {
            ad.b("AnrMonitorManager", "start anr monitor failed", e4);
        }
    }

    private static boolean b() {
        try {
            return af.a().a("anr_monitor_available", false);
        } catch (Exception e4) {
            ad.b("AnrMonitorManager", "get anr monitor available failed", e4);
            return false;
        }
    }

    public static /* synthetic */ void a(String str, StackTraceElement[] stackTraceElementArr) throws JSONException {
        try {
            JSONObject b8 = d.a(com.mbridge.msdk.foundation.controller.c.m().c()).b(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis())));
            b8.put("crashinfo", str);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exception", b8.toString());
            jSONObject.put("crash_first_index_from_mtg", b(stackTraceElementArr));
            e eVar = new e("m_anr_report");
            eVar.a(jSONObject);
            eVar.a(com.mbridge.msdk.foundation.same.report.c.c());
            eVar.a(0);
            eVar.b(1);
            f.a().d().a(eVar);
        } catch (JSONException e4) {
            ad.b("AnrMonitorManager", "reportANRByEventLibrary anr failed", e4);
        }
    }

    private static int c() {
        try {
            int a6 = af.a().a("anr_check_timeout", 5000);
            if (a6 <= 0) {
                return 5000;
            }
            return a6;
        } catch (Exception e4) {
            ad.b("AnrMonitorManager", "get anr check timeout failed", e4);
            return 5000;
        }
    }
}

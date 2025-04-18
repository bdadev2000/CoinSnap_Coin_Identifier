package com.mbridge.msdk.newreward.function.f;

import com.mbridge.msdk.c.g;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes4.dex */
public final class e {
    private String a = com.mbridge.msdk.foundation.controller.c.m().k();

    /* renamed from: b, reason: collision with root package name */
    private String f14703b;

    /* renamed from: c, reason: collision with root package name */
    private int f14704c;

    /* renamed from: d, reason: collision with root package name */
    private g f14705d;

    /* renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.d.a f14706e;

    /* renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.d.c f14707f;

    public final com.mbridge.msdk.videocommon.d.c b() {
        return this.f14707f;
    }

    public final com.mbridge.msdk.videocommon.d.a a() {
        return this.f14706e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.newreward.function.c.e eVar, int i10, String str) {
        int i11;
        try {
            com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
            dVar.a("key", "2000112");
            dVar.a("st_net", Integer.valueOf(com.mbridge.msdk.foundation.same.net.e.d.f().f13409s));
            if (eVar == com.mbridge.msdk.newreward.function.c.e.REPORT_SETTING_REQUEST_START) {
                i11 = 3;
            } else if (eVar == com.mbridge.msdk.newreward.function.c.e.REPORT_SETTING_REQUEST_SUCCESS) {
                i11 = 1;
            } else {
                i11 = eVar == com.mbridge.msdk.newreward.function.c.e.REPORT_SETTING_REQUEST_FAIL ? 2 : 0;
            }
            dVar.a("result", Integer.valueOf(i11));
            dVar.a("type", Integer.valueOf(i10));
            dVar.a("url", com.mbridge.msdk.foundation.same.net.e.d.f().f13408r ? com.mbridge.msdk.foundation.same.net.e.d.f().J : com.mbridge.msdk.foundation.same.net.e.d.f().I);
            dVar.a("reason", str);
            bVar.a("2000112", dVar);
            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000112", bVar);
        } catch (Throwable th2) {
            ad.b("SettingModel", th2.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.Object r11, com.mbridge.msdk.newreward.a.b.b r12) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.newreward.function.f.e.a(java.lang.Object, com.mbridge.msdk.newreward.a.b.b):void");
    }
}

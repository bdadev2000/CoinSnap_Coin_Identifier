package com.mbridge.msdk.foundation.same.f;

import com.mbridge.msdk.foundation.same.report.d.c;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes4.dex */
public final class a implements Runnable {
    private String a;

    /* renamed from: b, reason: collision with root package name */
    private String f13355b;

    public a(String str, String str2) {
        this.a = str;
        this.f13355b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            c.a().d(this.a);
        } catch (Throwable th2) {
            ad.b("ReportTask", th2.getMessage());
        }
    }
}

package com.mbridge.msdk.foundation.same.f;

import com.mbridge.msdk.foundation.same.report.d.c;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes3.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private String f15762a;
    private String b;

    public a(String str, String str2) {
        this.f15762a = str;
        this.b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            c.a().d(this.f15762a);
        } catch (Throwable th) {
            ad.b("ReportTask", th.getMessage());
        }
    }
}

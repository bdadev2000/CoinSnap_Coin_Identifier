package com.mbridge.msdk.mbbanner.common.util;

import android.os.Handler;
import android.os.Looper;
import com.applovin.impl.L;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.mbbanner.common.b.b;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16365a = "a";
    private final Handler b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    private boolean f16366c;

    public final void b(final b bVar, final com.mbridge.msdk.foundation.c.b bVar2) {
        ad.b(f16365a, "postResourceFail unitId=" + bVar2);
        this.b.post(new Runnable() { // from class: com.mbridge.msdk.mbbanner.common.util.a.4
            @Override // java.lang.Runnable
            public final void run() {
                if (bVar != null) {
                    bVar2.a(a.this.f16366c);
                    bVar.b(bVar2);
                }
            }
        });
    }

    public final void a(boolean z8) {
        this.f16366c = z8;
    }

    public final void a(final b bVar, final CampaignUnit campaignUnit, final String str) {
        L.B("postCampaignSuccess unitId=", str, f16365a);
        this.b.post(new Runnable() { // from class: com.mbridge.msdk.mbbanner.common.util.a.1
            @Override // java.lang.Runnable
            public final void run() {
                b bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.a(str, campaignUnit, a.this.f16366c);
                }
            }
        });
    }

    public final void a(final b bVar, final com.mbridge.msdk.foundation.c.b bVar2) {
        this.b.post(new Runnable() { // from class: com.mbridge.msdk.mbbanner.common.util.a.2
            @Override // java.lang.Runnable
            public final void run() {
                if (bVar != null) {
                    bVar2.a(a.this.f16366c);
                    bVar.a(bVar2);
                }
            }
        });
    }

    public final void a(final b bVar, final String str) {
        L.B("postResourceSuccess unitId=", str, f16365a);
        this.b.post(new Runnable() { // from class: com.mbridge.msdk.mbbanner.common.util.a.3
            @Override // java.lang.Runnable
            public final void run() {
                b bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.a(str, a.this.f16366c);
                }
            }
        });
    }
}

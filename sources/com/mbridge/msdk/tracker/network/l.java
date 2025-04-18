package com.mbridge.msdk.tracker.network;

import com.mbridge.msdk.tracker.network.w;
import java.nio.charset.StandardCharsets;

/* loaded from: classes4.dex */
public final class l extends i<String> implements w.a {

    /* renamed from: b, reason: collision with root package name */
    private final k<String> f15440b;

    public l(int i10, String str, String str2, long j3, k<String> kVar) {
        super(i10, str, 0, str2, j3);
        this.f15440b = kVar;
        a((w.a) this);
    }

    private void b(w<String> wVar) {
        k<String> kVar = this.f15440b;
        if (kVar != null) {
            try {
                kVar.b(this, wVar, wVar.f15522c.a);
            } catch (Exception e2) {
                com.mbridge.msdk.foundation.tools.ad.b(i.a, "parseNetworkResponse error: ", e2);
            }
        }
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public final /* bridge */ /* synthetic */ void a(Object obj) {
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public final w<String> a(r rVar) {
        try {
            w<String> a = w.a(new String(rVar.f15471b, StandardCharsets.UTF_8), com.mbridge.msdk.tracker.network.toolbox.f.a(rVar));
            k<String> kVar = this.f15440b;
            if (kVar != null) {
                try {
                    kVar.a(this, a, rVar);
                } catch (Exception e2) {
                    com.mbridge.msdk.foundation.tools.ad.b(i.a, "parseNetworkResponse error: ", e2);
                }
            }
            return a;
        } catch (Throwable th2) {
            com.mbridge.msdk.foundation.tools.ad.b(i.a, "parseNetworkResponse error: ", th2);
            w<String> a10 = w.a(new ac(th2));
            b(a10);
            return a10;
        }
    }

    @Override // com.mbridge.msdk.tracker.network.w.a
    public final void a(ad adVar) {
        b(w.a(adVar));
    }
}

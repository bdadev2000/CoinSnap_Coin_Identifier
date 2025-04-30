package com.mbridge.msdk.tracker.network;

import com.mbridge.msdk.tracker.network.w;
import java.nio.charset.StandardCharsets;

/* loaded from: classes3.dex */
public final class l extends i<String> implements w.a {
    private final k<String> b;

    public l(int i9, String str, String str2, long j7, k<String> kVar) {
        super(i9, str, 0, str2, j7);
        this.b = kVar;
        a((w.a) this);
    }

    private void b(w<String> wVar) {
        k<String> kVar = this.b;
        if (kVar != null) {
            try {
                kVar.b(this, wVar, wVar.f18286c.f18156a);
            } catch (Exception e4) {
                com.mbridge.msdk.foundation.tools.ad.b(i.f18178a, "parseNetworkResponse error: ", e4);
            }
        }
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public final /* bridge */ /* synthetic */ void a(Object obj) {
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public final w<String> a(r rVar) {
        try {
            w<String> a6 = w.a(new String(rVar.b, StandardCharsets.UTF_8), com.mbridge.msdk.tracker.network.toolbox.f.a(rVar));
            k<String> kVar = this.b;
            if (kVar != null) {
                try {
                    kVar.a(this, a6, rVar);
                } catch (Exception e4) {
                    com.mbridge.msdk.foundation.tools.ad.b(i.f18178a, "parseNetworkResponse error: ", e4);
                }
            }
            return a6;
        } catch (Throwable th) {
            com.mbridge.msdk.foundation.tools.ad.b(i.f18178a, "parseNetworkResponse error: ", th);
            w<String> a9 = w.a(new ac(th));
            b(a9);
            return a9;
        }
    }

    @Override // com.mbridge.msdk.tracker.network.w.a
    public final void a(ad adVar) {
        b(w.a(adVar));
    }
}

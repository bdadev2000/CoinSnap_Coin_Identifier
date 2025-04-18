package com.instagram.common.viewpoint.core;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Ff, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0528Ff extends AbstractC0933Vg<C1162bo> {
    public C0528Ff(C1162bo c1162bo) {
        super(c1162bo);
    }

    @Override // com.instagram.common.viewpoint.core.KY
    public final void A06() {
        C1045Zs c1045Zs;
        Handler handler;
        Runnable runnable;
        C1162bo A07 = A07();
        if (A07 == null) {
            return;
        }
        c1045Zs = A07.A08;
        if (MK.A02(c1045Zs)) {
            A07.A07();
            return;
        }
        handler = A07.A05;
        runnable = A07.A0C;
        handler.postDelayed(runnable, 5000L);
    }
}

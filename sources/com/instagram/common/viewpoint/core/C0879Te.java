package com.instagram.common.viewpoint.core;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Te, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0879Te implements LZ {
    public final /* synthetic */ C03839a A00;

    public C0879Te(C03839a c03839a) {
        this.A00 = c03839a;
    }

    @Override // com.instagram.common.viewpoint.core.LZ
    public final void ACu(String str) {
        Handler handler;
        handler = this.A00.A0F;
        handler.postDelayed(new Q8(this), 2000L);
    }

    @Override // com.instagram.common.viewpoint.core.LZ
    public final void ACv(String str) {
        this.A00.A0D(JE.A0a);
    }
}

package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;

/* loaded from: assets/audience_network.dex */
public final class W8 implements InterfaceC1172Gf {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final InterfaceC1182Gp A06;
    public final InterfaceC1195Hd A07;

    public W8(InterfaceC1182Gp interfaceC1182Gp) {
        this(interfaceC1182Gp, 10000, 25000, 25000, 0.75f, 0.75f, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS, InterfaceC1195Hd.A00);
    }

    public W8(InterfaceC1182Gp interfaceC1182Gp, int i9, int i10, int i11, float f9, float f10, long j7, InterfaceC1195Hd interfaceC1195Hd) {
        this.A06 = interfaceC1182Gp;
        this.A03 = i9;
        this.A02 = i10;
        this.A04 = i11;
        this.A00 = f9;
        this.A01 = f10;
        this.A05 = j7;
        this.A07 = interfaceC1195Hd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.InterfaceC1172Gf
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C1071Bp A4o(TrackGroup trackGroup, int... iArr) {
        return new C1071Bp(trackGroup, iArr, this.A06, this.A03, this.A02, this.A04, this.A00, this.A01, this.A05, this.A07);
    }
}

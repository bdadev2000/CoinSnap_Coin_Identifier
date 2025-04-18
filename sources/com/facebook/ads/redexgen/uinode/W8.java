package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;

/* loaded from: assets/audience_network.dex */
public final class W8 implements InterfaceC0606Gf {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final InterfaceC0616Gp A06;
    public final InterfaceC0629Hd A07;

    public W8(InterfaceC0616Gp interfaceC0616Gp) {
        this(interfaceC0616Gp, 10000, 25000, 25000, 0.75f, 0.75f, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS, InterfaceC0629Hd.A00);
    }

    public W8(InterfaceC0616Gp interfaceC0616Gp, int i10, int i11, int i12, float f10, float f11, long j3, InterfaceC0629Hd interfaceC0629Hd) {
        this.A06 = interfaceC0616Gp;
        this.A03 = i10;
        this.A02 = i11;
        this.A04 = i12;
        this.A00 = f10;
        this.A01 = f11;
        this.A05 = j3;
        this.A07 = interfaceC0629Hd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0606Gf
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C0505Bp A4o(TrackGroup trackGroup, int... iArr) {
        return new C0505Bp(trackGroup, iArr, this.A06, this.A03, this.A02, this.A04, this.A00, this.A01, this.A05, this.A07);
    }
}

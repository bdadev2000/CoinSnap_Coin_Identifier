package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup;

/* loaded from: assets/audience_network.dex */
public final class XD implements InterfaceC0555Gk {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final InterfaceC0565Gu A06;
    public final InterfaceC0579Hi A07;

    public XD(InterfaceC0565Gu interfaceC0565Gu) {
        this(interfaceC0565Gu, 10000, 25000, 25000, 0.75f, 0.75f, 2000L, InterfaceC0579Hi.A00);
    }

    public XD(InterfaceC0565Gu interfaceC0565Gu, int i2, int i3, int i4, float f2, float f3, long j2, InterfaceC0579Hi interfaceC0579Hi) {
        this.A06 = interfaceC0565Gu;
        this.A03 = i2;
        this.A02 = i3;
        this.A04 = i4;
        this.A00 = f2;
        this.A01 = f3;
        this.A05 = j2;
        this.A07 = interfaceC0579Hi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.InterfaceC0555Gk
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final D2 A5A(TrackGroup trackGroup, int... iArr) {
        return new D2(trackGroup, iArr, this.A06, this.A03, this.A02, this.A04, this.A00, this.A01, this.A05, this.A07);
    }
}

package com.facebook.ads.redexgen.uinode;

import android.os.Parcel;

/* renamed from: com.facebook.ads.redexgen.X.Dq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0546Dq {
    public final int A00;
    public final long A01;
    public final long A02;

    public C0546Dq(int i10, long j3, long j10) {
        this.A00 = i10;
        this.A02 = j3;
        this.A01 = j10;
    }

    public /* synthetic */ C0546Dq(int i10, long j3, long j10, C0545Dp c0545Dp) {
        this(i10, j3, j10);
    }

    public static C0546Dq A00(Parcel parcel) {
        return new C0546Dq(parcel.readInt(), parcel.readLong(), parcel.readLong());
    }

    public final void A01(Parcel parcel) {
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A01);
    }
}

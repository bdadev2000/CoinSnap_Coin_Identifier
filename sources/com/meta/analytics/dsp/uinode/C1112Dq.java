package com.meta.analytics.dsp.uinode;

import android.os.Parcel;

/* renamed from: com.facebook.ads.redexgen.X.Dq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1112Dq {
    public final int A00;
    public final long A01;
    public final long A02;

    public C1112Dq(int i9, long j7, long j9) {
        this.A00 = i9;
        this.A02 = j7;
        this.A01 = j9;
    }

    public /* synthetic */ C1112Dq(int i9, long j7, long j9, C1111Dp c1111Dp) {
        this(i9, j7, j9);
    }

    public static C1112Dq A00(Parcel parcel) {
        return new C1112Dq(parcel.readInt(), parcel.readLong(), parcel.readLong());
    }

    public final void A01(Parcel parcel) {
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A01);
    }
}

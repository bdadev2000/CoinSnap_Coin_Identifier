package com.facebook.ads.redexgen.uinode;

import android.os.Parcel;

/* renamed from: com.facebook.ads.redexgen.X.Dt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0549Dt {
    public final int A00;
    public final long A01;

    public C0549Dt(int i10, long j3) {
        this.A00 = i10;
        this.A01 = j3;
    }

    public /* synthetic */ C0549Dt(int i10, long j3, C0548Ds c0548Ds) {
        this(i10, j3);
    }

    public static C0549Dt A00(Parcel parcel) {
        return new C0549Dt(parcel.readInt(), parcel.readLong());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02(Parcel parcel) {
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A01);
    }
}

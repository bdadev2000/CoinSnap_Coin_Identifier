package com.meta.analytics.dsp.uinode;

import android.os.Parcel;

/* renamed from: com.facebook.ads.redexgen.X.Dt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1115Dt {
    public final int A00;
    public final long A01;

    public C1115Dt(int i9, long j7) {
        this.A00 = i9;
        this.A01 = j7;
    }

    public /* synthetic */ C1115Dt(int i9, long j7, C1114Ds c1114Ds) {
        this(i9, j7);
    }

    public static C1115Dt A00(Parcel parcel) {
        return new C1115Dt(parcel.readInt(), parcel.readLong());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02(Parcel parcel) {
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A01);
    }
}

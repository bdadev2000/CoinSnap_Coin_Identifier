package com.instagram.common.viewpoint.core;

import android.os.Parcel;

/* renamed from: com.facebook.ads.redexgen.X.Dy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0507Dy {
    public final int A00;
    public final long A01;

    public C0507Dy(int i2, long j2) {
        this.A00 = i2;
        this.A01 = j2;
    }

    public /* synthetic */ C0507Dy(int i2, long j2, C0506Dx c0506Dx) {
        this(i2, j2);
    }

    public static C0507Dy A00(Parcel parcel) {
        return new C0507Dy(parcel.readInt(), parcel.readLong());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02(Parcel parcel) {
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A01);
    }
}

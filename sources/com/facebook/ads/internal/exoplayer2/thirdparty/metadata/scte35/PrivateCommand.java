package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.viewpoint.core.C0502Dt;
import com.instagram.common.viewpoint.core.I4;

/* loaded from: assets/audience_network.dex */
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new C0502Dt();
    public final long A00;
    public final long A01;
    public final byte[] A02;

    public PrivateCommand(long j2, byte[] bArr, long j3) {
        this.A01 = j3;
        this.A00 = j2;
        this.A02 = bArr;
    }

    public PrivateCommand(Parcel parcel) {
        this.A01 = parcel.readLong();
        this.A00 = parcel.readLong();
        this.A02 = new byte[parcel.readInt()];
        parcel.readByteArray(this.A02);
    }

    public /* synthetic */ PrivateCommand(Parcel parcel, C0502Dt c0502Dt) {
        this(parcel);
    }

    public static PrivateCommand A00(I4 i4, int i2, long j2) {
        long A0M = i4.A0M();
        byte[] bArr = new byte[i2 - 4];
        i4.A0c(bArr, 0, bArr.length);
        return new PrivateCommand(A0M, bArr, j2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
        parcel.writeInt(this.A02.length);
        parcel.writeByteArray(this.A02);
    }
}

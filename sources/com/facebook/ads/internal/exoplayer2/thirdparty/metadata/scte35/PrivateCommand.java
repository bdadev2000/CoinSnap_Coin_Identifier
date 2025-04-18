package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.uinode.C0544Do;
import com.facebook.ads.redexgen.uinode.C0651Hz;

/* loaded from: assets/audience_network.dex */
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new C0544Do();
    public final long A00;
    public final long A01;
    public final byte[] A02;

    public PrivateCommand(long j3, byte[] bArr, long j10) {
        this.A01 = j10;
        this.A00 = j3;
        this.A02 = bArr;
    }

    public PrivateCommand(Parcel parcel) {
        this.A01 = parcel.readLong();
        this.A00 = parcel.readLong();
        byte[] bArr = new byte[parcel.readInt()];
        this.A02 = bArr;
        parcel.readByteArray(bArr);
    }

    public /* synthetic */ PrivateCommand(Parcel parcel, C0544Do c0544Do) {
        this(parcel);
    }

    public static PrivateCommand A00(C0651Hz c0651Hz, int i10, long j3) {
        long A0M = c0651Hz.A0M();
        byte[] bArr = new byte[i10 - 4];
        c0651Hz.A0c(bArr, 0, bArr.length);
        return new PrivateCommand(A0M, bArr, j3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
        parcel.writeInt(this.A02.length);
        parcel.writeByteArray(this.A02);
    }
}

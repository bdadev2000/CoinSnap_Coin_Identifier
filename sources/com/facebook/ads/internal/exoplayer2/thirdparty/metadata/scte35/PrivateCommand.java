package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.meta.analytics.dsp.uinode.C1110Do;
import com.meta.analytics.dsp.uinode.C1217Hz;

/* loaded from: assets/audience_network.dex */
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new C1110Do();
    public final long A00;
    public final long A01;
    public final byte[] A02;

    public PrivateCommand(long j7, byte[] bArr, long j9) {
        this.A01 = j9;
        this.A00 = j7;
        this.A02 = bArr;
    }

    public PrivateCommand(Parcel parcel) {
        this.A01 = parcel.readLong();
        this.A00 = parcel.readLong();
        byte[] bArr = new byte[parcel.readInt()];
        this.A02 = bArr;
        parcel.readByteArray(bArr);
    }

    public /* synthetic */ PrivateCommand(Parcel parcel, C1110Do c1110Do) {
        this(parcel);
    }

    public static PrivateCommand A00(C1217Hz c1217Hz, int i9, long j7) {
        long A0M = c1217Hz.A0M();
        byte[] bArr = new byte[i9 - 4];
        c1217Hz.A0c(bArr, 0, bArr.length);
        return new PrivateCommand(A0M, bArr, j7);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
        parcel.writeInt(this.A02.length);
        parcel.writeByteArray(this.A02);
    }
}

package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.viewpoint.core.E0;
import com.instagram.common.viewpoint.core.I4;
import com.instagram.common.viewpoint.core.IG;

/* loaded from: assets/audience_network.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new E0();
    public final long A00;
    public final long A01;

    public TimeSignalCommand(long j2, long j3) {
        this.A01 = j2;
        this.A00 = j3;
    }

    public /* synthetic */ TimeSignalCommand(long j2, long j3, E0 e02) {
        this(j2, j3);
    }

    public static long A00(I4 i4, long j2) {
        long A0E = i4.A0E();
        if ((128 & A0E) == 0) {
            return -9223372036854775807L;
        }
        long ptsTime = 1 & A0E;
        long firstByte = i4.A0M();
        return (((ptsTime << 32) | firstByte) + j2) & 8589934591L;
    }

    public static TimeSignalCommand A01(I4 i4, long j2, IG ig) {
        long A00 = A00(i4, j2);
        return new TimeSignalCommand(A00, ig.A07(A00));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
    }
}

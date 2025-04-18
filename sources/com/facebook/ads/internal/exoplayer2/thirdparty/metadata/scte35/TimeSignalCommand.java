package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.uinode.C0651Hz;
import com.facebook.ads.redexgen.uinode.Dv;
import com.facebook.ads.redexgen.uinode.IB;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: assets/audience_network.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static String[] A02 = {"sG", "SKgiCa5d9ZEELz", "pKJUtOIsmSdeWRhSmfkg", "RYqFvMPt4ygOGY", "4ulFqSy6k9HwIYoxn5tcLFNrNsE", "F6U", "Ool37D46w9DvUWXVHkToeSd93UD8I33w", "iJFoxGzstNUDxHZj"};
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new Dv();
    public final long A00;
    public final long A01;

    public TimeSignalCommand(long j3, long j10) {
        this.A01 = j3;
        this.A00 = j10;
    }

    public /* synthetic */ TimeSignalCommand(long j3, long j10, Dv dv) {
        this(j3, j10);
    }

    public static long A00(C0651Hz c0651Hz, long j3) {
        long A0E = c0651Hz.A0E();
        if ((128 & A0E) == 0) {
            return C.TIME_UNSET;
        }
        long j10 = (1 & A0E) << 32;
        long A0M = c0651Hz.A0M();
        String[] strArr = A02;
        if (strArr[7].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[1] = "aue9bKRLYwGt4M";
        strArr2[3] = "U8dfBAcmUh1N3t";
        return ((j10 | A0M) + j3) & 8589934591L;
    }

    public static TimeSignalCommand A01(C0651Hz c0651Hz, long j3, IB ib2) {
        long A00 = A00(c0651Hz, j3);
        return new TimeSignalCommand(A00, ib2.A07(A00));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
    }
}

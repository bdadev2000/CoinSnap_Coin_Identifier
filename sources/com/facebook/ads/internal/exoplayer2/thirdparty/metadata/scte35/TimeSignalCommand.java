package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.meta.analytics.dsp.uinode.C1217Hz;
import com.meta.analytics.dsp.uinode.Dv;
import com.meta.analytics.dsp.uinode.IB;

/* loaded from: assets/audience_network.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static String[] A02 = {"sG", "SKgiCa5d9ZEELz", "pKJUtOIsmSdeWRhSmfkg", "RYqFvMPt4ygOGY", "4ulFqSy6k9HwIYoxn5tcLFNrNsE", "F6U", "Ool37D46w9DvUWXVHkToeSd93UD8I33w", "iJFoxGzstNUDxHZj"};
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new Dv();
    public final long A00;
    public final long A01;

    public TimeSignalCommand(long j7, long j9) {
        this.A01 = j7;
        this.A00 = j9;
    }

    public /* synthetic */ TimeSignalCommand(long j7, long j9, Dv dv) {
        this(j7, j9);
    }

    public static long A00(C1217Hz c1217Hz, long j7) {
        long A0E = c1217Hz.A0E();
        if ((128 & A0E) == 0) {
            return C.TIME_UNSET;
        }
        long j9 = (1 & A0E) << 32;
        long A0M = c1217Hz.A0M();
        String[] strArr = A02;
        if (strArr[7].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[1] = "aue9bKRLYwGt4M";
        strArr2[3] = "U8dfBAcmUh1N3t";
        return ((j9 | A0M) + j7) & 8589934591L;
    }

    public static TimeSignalCommand A01(C1217Hz c1217Hz, long j7, IB ib) {
        long A00 = A00(c1217Hz, j7);
        return new TimeSignalCommand(A00, ib.A07(A00));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
    }
}

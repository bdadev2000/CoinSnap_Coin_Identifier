package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class eo extends pk {
    public static final Parcelable.Creator<eo> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final long f7470a;
    public final long b;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public eo[] newArray(int i9) {
            return new eo[i9];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public eo createFromParcel(Parcel parcel) {
            return new eo(parcel.readLong(), parcel.readLong(), null);
        }
    }

    private eo(long j7, long j9) {
        this.f7470a = j7;
        this.b = j9;
    }

    public static eo a(yg ygVar, long j7, io ioVar) {
        long a6 = a(ygVar, j7);
        return new eo(a6, ioVar.b(a6));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeLong(this.f7470a);
        parcel.writeLong(this.b);
    }

    public /* synthetic */ eo(long j7, long j9, a aVar) {
        this(j7, j9);
    }

    public static long a(yg ygVar, long j7) {
        long w2 = ygVar.w();
        return (128 & w2) != 0 ? 8589934591L & ((((w2 & 1) << 32) | ygVar.y()) + j7) : com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }
}

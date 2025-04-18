package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes.dex */
public final class eo extends pk {
    public static final Parcelable.Creator<eo> CREATOR = new a();
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4504b;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public eo[] newArray(int i10) {
            return new eo[i10];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public eo createFromParcel(Parcel parcel) {
            return new eo(parcel.readLong(), parcel.readLong(), null);
        }
    }

    private eo(long j3, long j10) {
        this.a = j3;
        this.f4504b = j10;
    }

    public static eo a(yg ygVar, long j3, io ioVar) {
        long a10 = a(ygVar, j3);
        return new eo(a10, ioVar.b(a10));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.f4504b);
    }

    public /* synthetic */ eo(long j3, long j10, a aVar) {
        this(j3, j10);
    }

    public static long a(yg ygVar, long j3) {
        long w10 = ygVar.w();
        return (128 & w10) != 0 ? 8589934591L & ((((w10 & 1) << 32) | ygVar.y()) + j3) : C.TIME_UNSET;
    }
}

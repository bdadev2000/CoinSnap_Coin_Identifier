package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.applovin.impl.do, reason: invalid class name */
/* loaded from: classes.dex */
public final class Cdo extends sk {
    public static final Parcelable.Creator<Cdo> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final long f23518a;

    /* renamed from: b, reason: collision with root package name */
    public final long f23519b;

    /* renamed from: com.applovin.impl.do$a */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cdo[] newArray(int i2) {
            return new Cdo[i2];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cdo createFromParcel(Parcel parcel) {
            return new Cdo(parcel.readLong(), parcel.readLong(), null);
        }
    }

    private Cdo(long j2, long j3) {
        this.f23518a = j2;
        this.f23519b = j3;
    }

    public static Cdo a(bh bhVar, long j2, ho hoVar) {
        long a2 = a(bhVar, j2);
        return new Cdo(a2, hoVar.b(a2));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f23518a);
        parcel.writeLong(this.f23519b);
    }

    public /* synthetic */ Cdo(long j2, long j3, a aVar) {
        this(j2, j3);
    }

    public static long a(bh bhVar, long j2) {
        long w = bhVar.w();
        if ((128 & w) != 0) {
            return 8589934591L & ((((w & 1) << 32) | bhVar.y()) + j2);
        }
        return -9223372036854775807L;
    }
}

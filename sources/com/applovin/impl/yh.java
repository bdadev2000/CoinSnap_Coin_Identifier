package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class yh extends sk {
    public static final Parcelable.Creator<yh> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final long f28203a;

    /* renamed from: b, reason: collision with root package name */
    public final long f28204b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f28205c;

    /* loaded from: classes4.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public yh[] newArray(int i2) {
            return new yh[i2];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public yh createFromParcel(Parcel parcel) {
            return new yh(parcel, null);
        }
    }

    private yh(long j2, byte[] bArr, long j3) {
        this.f28203a = j3;
        this.f28204b = j2;
        this.f28205c = bArr;
    }

    public static yh a(bh bhVar, int i2, long j2) {
        long y2 = bhVar.y();
        int i3 = i2 - 4;
        byte[] bArr = new byte[i3];
        bhVar.a(bArr, 0, i3);
        return new yh(y2, bArr, j2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f28203a);
        parcel.writeLong(this.f28204b);
        parcel.writeByteArray(this.f28205c);
    }

    private yh(Parcel parcel) {
        this.f28203a = parcel.readLong();
        this.f28204b = parcel.readLong();
        this.f28205c = (byte[]) xp.a((Object) parcel.createByteArray());
    }

    public /* synthetic */ yh(Parcel parcel, a aVar) {
        this(parcel);
    }
}

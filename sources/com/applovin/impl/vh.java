package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class vh extends pk {
    public static final Parcelable.Creator<vh> CREATOR = new a();
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8512b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f8513c;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public vh[] newArray(int i10) {
            return new vh[i10];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public vh createFromParcel(Parcel parcel) {
            return new vh(parcel, null);
        }
    }

    private vh(long j3, byte[] bArr, long j10) {
        this.a = j10;
        this.f8512b = j3;
        this.f8513c = bArr;
    }

    public static vh a(yg ygVar, int i10, long j3) {
        long y4 = ygVar.y();
        int i11 = i10 - 4;
        byte[] bArr = new byte[i11];
        ygVar.a(bArr, 0, i11);
        return new vh(y4, bArr, j3);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.f8512b);
        parcel.writeByteArray(this.f8513c);
    }

    private vh(Parcel parcel) {
        this.a = parcel.readLong();
        this.f8512b = parcel.readLong();
        this.f8513c = (byte[]) yp.a((Object) parcel.createByteArray());
    }

    public /* synthetic */ vh(Parcel parcel, a aVar) {
        this(parcel);
    }
}

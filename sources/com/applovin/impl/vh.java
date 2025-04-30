package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class vh extends pk {
    public static final Parcelable.Creator<vh> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final long f11734a;
    public final long b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f11735c;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public vh[] newArray(int i9) {
            return new vh[i9];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public vh createFromParcel(Parcel parcel) {
            return new vh(parcel, null);
        }
    }

    private vh(long j7, byte[] bArr, long j9) {
        this.f11734a = j9;
        this.b = j7;
        this.f11735c = bArr;
    }

    public static vh a(yg ygVar, int i9, long j7) {
        long y4 = ygVar.y();
        int i10 = i9 - 4;
        byte[] bArr = new byte[i10];
        ygVar.a(bArr, 0, i10);
        return new vh(y4, bArr, j7);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeLong(this.f11734a);
        parcel.writeLong(this.b);
        parcel.writeByteArray(this.f11735c);
    }

    private vh(Parcel parcel) {
        this.f11734a = parcel.readLong();
        this.b = parcel.readLong();
        this.f11735c = (byte[]) yp.a((Object) parcel.createByteArray());
    }

    public /* synthetic */ vh(Parcel parcel, a aVar) {
        this(parcel);
    }
}

package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.we;
import java.util.Arrays;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class ad implements we.b {
    public static final Parcelable.Creator<ad> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final String f6619a;
    public final byte[] b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6620c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6621d;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ad[] newArray(int i9) {
            return new ad[i9];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ad createFromParcel(Parcel parcel) {
            return new ad(parcel, null);
        }
    }

    private ad(Parcel parcel) {
        this.f6619a = (String) yp.a((Object) parcel.readString());
        this.b = (byte[]) yp.a((Object) parcel.createByteArray());
        this.f6620c = parcel.readInt();
        this.f6621d = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ad.class != obj.getClass()) {
            return false;
        }
        ad adVar = (ad) obj;
        if (this.f6619a.equals(adVar.f6619a) && Arrays.equals(this.b, adVar.b) && this.f6620c == adVar.f6620c && this.f6621d == adVar.f6621d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((Arrays.hashCode(this.b) + AbstractC2914a.b(527, 31, this.f6619a)) * 31) + this.f6620c) * 31) + this.f6621d;
    }

    public String toString() {
        return "mdta: key=" + this.f6619a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f6619a);
        parcel.writeByteArray(this.b);
        parcel.writeInt(this.f6620c);
        parcel.writeInt(this.f6621d);
    }

    public /* synthetic */ ad(Parcel parcel, a aVar) {
        this(parcel);
    }

    public ad(String str, byte[] bArr, int i9, int i10) {
        this.f6619a = str;
        this.b = bArr;
        this.f6620c = i9;
        this.f6621d = i10;
    }
}

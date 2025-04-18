package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.we;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ad implements we.b {
    public static final Parcelable.Creator<ad> CREATOR = new a();
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f3638b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3639c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3640d;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ad[] newArray(int i10) {
            return new ad[i10];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ad createFromParcel(Parcel parcel) {
            return new ad(parcel, null);
        }
    }

    private ad(Parcel parcel) {
        this.a = (String) yp.a((Object) parcel.readString());
        this.f3638b = (byte[]) yp.a((Object) parcel.createByteArray());
        this.f3639c = parcel.readInt();
        this.f3640d = parcel.readInt();
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
        if (this.a.equals(adVar.a) && Arrays.equals(this.f3638b, adVar.f3638b) && this.f3639c == adVar.f3639c && this.f3640d == adVar.f3640d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((Arrays.hashCode(this.f3638b) + vd.e.c(this.a, 527, 31)) * 31) + this.f3639c) * 31) + this.f3640d;
    }

    public String toString() {
        return "mdta: key=" + this.a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.a);
        parcel.writeByteArray(this.f3638b);
        parcel.writeInt(this.f3639c);
        parcel.writeInt(this.f3640d);
    }

    public /* synthetic */ ad(Parcel parcel, a aVar) {
        this(parcel);
    }

    public ad(String str, byte[] bArr, int i10, int i11) {
        this.a = str;
        this.f3638b = bArr;
        this.f3639c = i10;
        this.f3640d = i11;
    }
}

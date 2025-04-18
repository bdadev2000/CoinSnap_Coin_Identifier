package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.bf;

/* loaded from: classes.dex */
public final class kk implements bf.b {
    public static final Parcelable.Creator<kk> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final float f24925a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24926b;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public kk[] newArray(int i2) {
            return new kk[i2];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public kk createFromParcel(Parcel parcel) {
            return new kk(parcel, (a) null);
        }
    }

    public kk(float f2, int i2) {
        this.f24925a = f2;
        this.f24926b = i2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kk.class != obj.getClass()) {
            return false;
        }
        kk kkVar = (kk) obj;
        return this.f24925a == kkVar.f24925a && this.f24926b == kkVar.f24926b;
    }

    public int hashCode() {
        return ((d9.a(this.f24925a) + 527) * 31) + this.f24926b;
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.f24925a + ", svcTemporalLayerCount=" + this.f24926b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeFloat(this.f24925a);
        parcel.writeInt(this.f24926b);
    }

    private kk(Parcel parcel) {
        this.f24925a = parcel.readFloat();
        this.f24926b = parcel.readInt();
    }

    public /* synthetic */ kk(Parcel parcel, a aVar) {
        this(parcel);
    }
}

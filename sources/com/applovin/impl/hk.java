package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.we;

/* loaded from: classes.dex */
public final class hk implements we.b {
    public static final Parcelable.Creator<hk> CREATOR = new a();
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5171b;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public hk[] newArray(int i10) {
            return new hk[i10];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public hk createFromParcel(Parcel parcel) {
            return new hk(parcel, (a) null);
        }
    }

    public hk(float f10, int i10) {
        this.a = f10;
        this.f5171b = i10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hk.class != obj.getClass()) {
            return false;
        }
        hk hkVar = (hk) obj;
        if (this.a == hkVar.a && this.f5171b == hkVar.f5171b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((b9.a(this.a) + 527) * 31) + this.f5171b;
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.a + ", svcTemporalLayerCount=" + this.f5171b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.a);
        parcel.writeInt(this.f5171b);
    }

    private hk(Parcel parcel) {
        this.a = parcel.readFloat();
        this.f5171b = parcel.readInt();
    }

    public /* synthetic */ hk(Parcel parcel, a aVar) {
        this(parcel);
    }
}

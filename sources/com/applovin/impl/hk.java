package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.we;

/* loaded from: classes.dex */
public final class hk implements we.b {
    public static final Parcelable.Creator<hk> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final float f8149a;
    public final int b;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public hk[] newArray(int i9) {
            return new hk[i9];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public hk createFromParcel(Parcel parcel) {
            return new hk(parcel, (a) null);
        }
    }

    public hk(float f9, int i9) {
        this.f8149a = f9;
        this.b = i9;
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
        if (this.f8149a == hkVar.f8149a && this.b == hkVar.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((b9.a(this.f8149a) + 527) * 31) + this.b;
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.f8149a + ", svcTemporalLayerCount=" + this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeFloat(this.f8149a);
        parcel.writeInt(this.b);
    }

    private hk(Parcel parcel) {
        this.f8149a = parcel.readFloat();
        this.b = parcel.readInt();
    }

    public /* synthetic */ hk(Parcel parcel, a aVar) {
        this(parcel);
    }
}

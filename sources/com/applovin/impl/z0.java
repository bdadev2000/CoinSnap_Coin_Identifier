package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.bf;

/* loaded from: classes3.dex */
public final class z0 implements bf.b {
    public static final Parcelable.Creator<z0> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f28251a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28252b;

    public z0(int i2, String str) {
        this.f28251a = i2;
        this.f28252b = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Ait(controlCode=");
        sb.append(this.f28251a);
        sb.append(",url=");
        return android.support.v4.media.d.r(sb, this.f28252b, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f28252b);
        parcel.writeInt(this.f28251a);
    }

    /* loaded from: classes3.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z0 createFromParcel(Parcel parcel) {
            return new z0(parcel.readInt(), (String) b1.a((Object) parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z0[] newArray(int i2) {
            return new z0[i2];
        }
    }
}

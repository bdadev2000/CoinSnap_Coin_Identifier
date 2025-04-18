package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.we;

/* loaded from: classes.dex */
public final class y0 implements we.b {
    public static final Parcelable.Creator<y0> CREATOR = new a();
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9103b;

    public y0(int i10, String str) {
        this.a = i10;
        this.f9103b = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Ait(controlCode=");
        sb2.append(this.a);
        sb2.append(",url=");
        return vd.e.h(sb2, this.f9103b, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f9103b);
        parcel.writeInt(this.a);
    }

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y0 createFromParcel(Parcel parcel) {
            return new y0(parcel.readInt(), (String) a1.a((Object) parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y0[] newArray(int i10) {
            return new y0[i10];
        }
    }
}

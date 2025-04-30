package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.we;
import x0.AbstractC2914a;

/* renamed from: com.applovin.impl.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0778y0 implements we.b {
    public static final Parcelable.Creator<C0778y0> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f12308a;
    public final String b;

    public C0778y0(int i9, String str) {
        this.f12308a = i9;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Ait(controlCode=");
        sb.append(this.f12308a);
        sb.append(",url=");
        return AbstractC2914a.h(sb, this.b, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.b);
        parcel.writeInt(this.f12308a);
    }

    /* renamed from: com.applovin.impl.y0$a */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0778y0 createFromParcel(Parcel parcel) {
            return new C0778y0(parcel.readInt(), (String) AbstractC0669a1.a((Object) parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0778y0[] newArray(int i9) {
            return new C0778y0[i9];
        }
    }
}

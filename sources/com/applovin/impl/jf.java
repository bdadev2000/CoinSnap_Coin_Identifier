package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class jf extends ya {
    public static final Parcelable.Creator<jf> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f24669b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24670c;
    public final int d;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f24671f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f24672g;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public jf[] newArray(int i2) {
            return new jf[i2];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public jf createFromParcel(Parcel parcel) {
            return new jf(parcel);
        }
    }

    public jf(int i2, int i3, int i4, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f24669b = i2;
        this.f24670c = i3;
        this.d = i4;
        this.f24671f = iArr;
        this.f24672g = iArr2;
    }

    @Override // com.applovin.impl.ya, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jf.class != obj.getClass()) {
            return false;
        }
        jf jfVar = (jf) obj;
        return this.f24669b == jfVar.f24669b && this.f24670c == jfVar.f24670c && this.d == jfVar.d && Arrays.equals(this.f24671f, jfVar.f24671f) && Arrays.equals(this.f24672g, jfVar.f24672g);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f24672g) + ((Arrays.hashCode(this.f24671f) + ((((((this.f24669b + 527) * 31) + this.f24670c) * 31) + this.d) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f24669b);
        parcel.writeInt(this.f24670c);
        parcel.writeInt(this.d);
        parcel.writeIntArray(this.f24671f);
        parcel.writeIntArray(this.f24672g);
    }

    public jf(Parcel parcel) {
        super("MLLT");
        this.f24669b = parcel.readInt();
        this.f24670c = parcel.readInt();
        this.d = parcel.readInt();
        this.f24671f = (int[]) xp.a(parcel.createIntArray());
        this.f24672g = (int[]) xp.a(parcel.createIntArray());
    }
}

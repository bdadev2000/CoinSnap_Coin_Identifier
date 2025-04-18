package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class e3 extends ya {
    public static final Parcelable.Creator<e3> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f23574b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23575c;
    public final int d;

    /* renamed from: f, reason: collision with root package name */
    public final long f23576f;

    /* renamed from: g, reason: collision with root package name */
    public final long f23577g;

    /* renamed from: h, reason: collision with root package name */
    private final ya[] f23578h;

    /* loaded from: classes3.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e3[] newArray(int i2) {
            return new e3[i2];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e3 createFromParcel(Parcel parcel) {
            return new e3(parcel);
        }
    }

    public e3(Parcel parcel) {
        super("CHAP");
        this.f23574b = (String) xp.a((Object) parcel.readString());
        this.f23575c = parcel.readInt();
        this.d = parcel.readInt();
        this.f23576f = parcel.readLong();
        this.f23577g = parcel.readLong();
        int readInt = parcel.readInt();
        this.f23578h = new ya[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.f23578h[i2] = (ya) parcel.readParcelable(ya.class.getClassLoader());
        }
    }

    @Override // com.applovin.impl.ya, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e3.class != obj.getClass()) {
            return false;
        }
        e3 e3Var = (e3) obj;
        return this.f23575c == e3Var.f23575c && this.d == e3Var.d && this.f23576f == e3Var.f23576f && this.f23577g == e3Var.f23577g && xp.a((Object) this.f23574b, (Object) e3Var.f23574b) && Arrays.equals(this.f23578h, e3Var.f23578h);
    }

    public int hashCode() {
        int i2 = (((((((this.f23575c + 527) * 31) + this.d) * 31) + ((int) this.f23576f)) * 31) + ((int) this.f23577g)) * 31;
        String str = this.f23574b;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f23574b);
        parcel.writeInt(this.f23575c);
        parcel.writeInt(this.d);
        parcel.writeLong(this.f23576f);
        parcel.writeLong(this.f23577g);
        parcel.writeInt(this.f23578h.length);
        for (ya yaVar : this.f23578h) {
            parcel.writeParcelable(yaVar, 0);
        }
    }

    public e3(String str, int i2, int i3, long j2, long j3, ya[] yaVarArr) {
        super("CHAP");
        this.f23574b = str;
        this.f23575c = i2;
        this.d = i3;
        this.f23576f = j2;
        this.f23577g = j3;
        this.f23578h = yaVarArr;
    }
}

package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ef extends ua {
    public static final Parcelable.Creator<ef> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f4444b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4445c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4446d;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f4447f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f4448g;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ef[] newArray(int i10) {
            return new ef[i10];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ef createFromParcel(Parcel parcel) {
            return new ef(parcel);
        }
    }

    public ef(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f4444b = i10;
        this.f4445c = i11;
        this.f4446d = i12;
        this.f4447f = iArr;
        this.f4448g = iArr2;
    }

    @Override // com.applovin.impl.ua, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ef.class != obj.getClass()) {
            return false;
        }
        ef efVar = (ef) obj;
        if (this.f4444b == efVar.f4444b && this.f4445c == efVar.f4445c && this.f4446d == efVar.f4446d && Arrays.equals(this.f4447f, efVar.f4447f) && Arrays.equals(this.f4448g, efVar.f4448g)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f4448g) + ((Arrays.hashCode(this.f4447f) + ((((((this.f4444b + 527) * 31) + this.f4445c) * 31) + this.f4446d) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f4444b);
        parcel.writeInt(this.f4445c);
        parcel.writeInt(this.f4446d);
        parcel.writeIntArray(this.f4447f);
        parcel.writeIntArray(this.f4448g);
    }

    public ef(Parcel parcel) {
        super("MLLT");
        this.f4444b = parcel.readInt();
        this.f4445c = parcel.readInt();
        this.f4446d = parcel.readInt();
        this.f4447f = (int[]) yp.a(parcel.createIntArray());
        this.f4448g = (int[]) yp.a(parcel.createIntArray());
    }
}

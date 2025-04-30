package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ef extends ua {
    public static final Parcelable.Creator<ef> CREATOR = new a();
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7416c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7417d;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f7418f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f7419g;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ef[] newArray(int i9) {
            return new ef[i9];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ef createFromParcel(Parcel parcel) {
            return new ef(parcel);
        }
    }

    public ef(int i9, int i10, int i11, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.b = i9;
        this.f7416c = i10;
        this.f7417d = i11;
        this.f7418f = iArr;
        this.f7419g = iArr2;
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
        if (this.b == efVar.b && this.f7416c == efVar.f7416c && this.f7417d == efVar.f7417d && Arrays.equals(this.f7418f, efVar.f7418f) && Arrays.equals(this.f7419g, efVar.f7419g)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f7419g) + ((Arrays.hashCode(this.f7418f) + ((((((this.b + 527) * 31) + this.f7416c) * 31) + this.f7417d) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.f7416c);
        parcel.writeInt(this.f7417d);
        parcel.writeIntArray(this.f7418f);
        parcel.writeIntArray(this.f7419g);
    }

    public ef(Parcel parcel) {
        super("MLLT");
        this.b = parcel.readInt();
        this.f7416c = parcel.readInt();
        this.f7417d = parcel.readInt();
        this.f7418f = (int[]) yp.a(parcel.createIntArray());
        this.f7419g = (int[]) yp.a(parcel.createIntArray());
    }
}

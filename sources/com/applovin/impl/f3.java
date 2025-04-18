package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class f3 extends ya {
    public static final Parcelable.Creator<f3> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f23807b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23808c;
    public final boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final String[] f23809f;

    /* renamed from: g, reason: collision with root package name */
    private final ya[] f23810g;

    /* loaded from: classes3.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f3[] newArray(int i2) {
            return new f3[i2];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f3 createFromParcel(Parcel parcel) {
            return new f3(parcel);
        }
    }

    public f3(Parcel parcel) {
        super("CTOC");
        this.f23807b = (String) xp.a((Object) parcel.readString());
        this.f23808c = parcel.readByte() != 0;
        this.d = parcel.readByte() != 0;
        this.f23809f = (String[]) xp.a((Object) parcel.createStringArray());
        int readInt = parcel.readInt();
        this.f23810g = new ya[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.f23810g[i2] = (ya) parcel.readParcelable(ya.class.getClassLoader());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f3.class != obj.getClass()) {
            return false;
        }
        f3 f3Var = (f3) obj;
        return this.f23808c == f3Var.f23808c && this.d == f3Var.d && xp.a((Object) this.f23807b, (Object) f3Var.f23807b) && Arrays.equals(this.f23809f, f3Var.f23809f) && Arrays.equals(this.f23810g, f3Var.f23810g);
    }

    public int hashCode() {
        int i2 = ((((this.f23808c ? 1 : 0) + 527) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f23807b;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f23807b);
        parcel.writeByte(this.f23808c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f23809f);
        parcel.writeInt(this.f23810g.length);
        for (ya yaVar : this.f23810g) {
            parcel.writeParcelable(yaVar, 0);
        }
    }

    public f3(String str, boolean z2, boolean z3, String[] strArr, ya[] yaVarArr) {
        super("CTOC");
        this.f23807b = str;
        this.f23808c = z2;
        this.d = z3;
        this.f23809f = strArr;
        this.f23810g = yaVarArr;
    }
}

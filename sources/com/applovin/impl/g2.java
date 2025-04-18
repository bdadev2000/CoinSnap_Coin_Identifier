package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g2 extends ua {
    public static final Parcelable.Creator<g2> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f4835b;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g2[] newArray(int i10) {
            return new g2[i10];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g2 createFromParcel(Parcel parcel) {
            return new g2(parcel);
        }
    }

    public g2(Parcel parcel) {
        super((String) yp.a((Object) parcel.readString()));
        this.f4835b = (byte[]) yp.a((Object) parcel.createByteArray());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g2.class != obj.getClass()) {
            return false;
        }
        g2 g2Var = (g2) obj;
        if (this.a.equals(g2Var.a) && Arrays.equals(this.f4835b, g2Var.f4835b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f4835b) + vd.e.c(this.a, 527, 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.a);
        parcel.writeByteArray(this.f4835b);
    }

    public g2(String str, byte[] bArr) {
        super(str);
        this.f4835b = bArr;
    }
}

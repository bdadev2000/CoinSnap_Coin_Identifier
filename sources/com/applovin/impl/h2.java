package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class h2 extends ya {
    public static final Parcelable.Creator<h2> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f24196b;

    /* loaded from: classes3.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public h2[] newArray(int i2) {
            return new h2[i2];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public h2 createFromParcel(Parcel parcel) {
            return new h2(parcel);
        }
    }

    public h2(Parcel parcel) {
        super((String) xp.a((Object) parcel.readString()));
        this.f24196b = (byte[]) xp.a((Object) parcel.createByteArray());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h2.class != obj.getClass()) {
            return false;
        }
        h2 h2Var = (h2) obj;
        return this.f28125a.equals(h2Var.f28125a) && Arrays.equals(this.f24196b, h2Var.f24196b);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f24196b) + androidx.compose.foundation.text.input.a.b(this.f28125a, 527, 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f28125a);
        parcel.writeByteArray(this.f24196b);
    }

    public h2(String str, byte[] bArr) {
        super(str);
        this.f24196b = bArr;
    }
}

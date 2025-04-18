package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.bf;
import com.applovin.impl.vd;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class lh implements bf.b {
    public static final Parcelable.Creator<lh> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f25084a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25085b;

    /* renamed from: c, reason: collision with root package name */
    public final String f25086c;
    public final int d;

    /* renamed from: f, reason: collision with root package name */
    public final int f25087f;

    /* renamed from: g, reason: collision with root package name */
    public final int f25088g;

    /* renamed from: h, reason: collision with root package name */
    public final int f25089h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f25090i;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public lh[] newArray(int i2) {
            return new lh[i2];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public lh createFromParcel(Parcel parcel) {
            return new lh(parcel);
        }
    }

    public lh(int i2, String str, String str2, int i3, int i4, int i5, int i6, byte[] bArr) {
        this.f25084a = i2;
        this.f25085b = str;
        this.f25086c = str2;
        this.d = i3;
        this.f25087f = i4;
        this.f25088g = i5;
        this.f25089h = i6;
        this.f25090i = bArr;
    }

    @Override // com.applovin.impl.bf.b
    public void a(vd.b bVar) {
        bVar.a(this.f25090i, this.f25084a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lh.class != obj.getClass()) {
            return false;
        }
        lh lhVar = (lh) obj;
        return this.f25084a == lhVar.f25084a && this.f25085b.equals(lhVar.f25085b) && this.f25086c.equals(lhVar.f25086c) && this.d == lhVar.d && this.f25087f == lhVar.f25087f && this.f25088g == lhVar.f25088g && this.f25089h == lhVar.f25089h && Arrays.equals(this.f25090i, lhVar.f25090i);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f25090i) + ((((((((androidx.compose.foundation.text.input.a.b(this.f25086c, androidx.compose.foundation.text.input.a.b(this.f25085b, (this.f25084a + 527) * 31, 31), 31) + this.d) * 31) + this.f25087f) * 31) + this.f25088g) * 31) + this.f25089h) * 31);
    }

    public String toString() {
        return "Picture: mimeType=" + this.f25085b + ", description=" + this.f25086c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f25084a);
        parcel.writeString(this.f25085b);
        parcel.writeString(this.f25086c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f25087f);
        parcel.writeInt(this.f25088g);
        parcel.writeInt(this.f25089h);
        parcel.writeByteArray(this.f25090i);
    }

    public lh(Parcel parcel) {
        this.f25084a = parcel.readInt();
        this.f25085b = (String) xp.a((Object) parcel.readString());
        this.f25086c = (String) xp.a((Object) parcel.readString());
        this.d = parcel.readInt();
        this.f25087f = parcel.readInt();
        this.f25088g = parcel.readInt();
        this.f25089h = parcel.readInt();
        this.f25090i = (byte[]) xp.a((Object) parcel.createByteArray());
    }
}

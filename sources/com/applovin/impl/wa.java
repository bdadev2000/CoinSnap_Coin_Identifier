package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.bf;
import com.applovin.impl.vd;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class wa implements bf.b {
    public static final Parcelable.Creator<wa> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f27709a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27710b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27711c;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public wa[] newArray(int i2) {
            return new wa[i2];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public wa createFromParcel(Parcel parcel) {
            return new wa(parcel);
        }
    }

    public wa(Parcel parcel) {
        this.f27709a = (byte[]) b1.a(parcel.createByteArray());
        this.f27710b = parcel.readString();
        this.f27711c = parcel.readString();
    }

    @Override // com.applovin.impl.bf.b
    public void a(vd.b bVar) {
        String str = this.f27710b;
        if (str != null) {
            bVar.k(str);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wa.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f27709a, ((wa) obj).f27709a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f27709a);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f27710b, this.f27711c, Integer.valueOf(this.f27709a.length));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeByteArray(this.f27709a);
        parcel.writeString(this.f27710b);
        parcel.writeString(this.f27711c);
    }

    public wa(byte[] bArr, String str, String str2) {
        this.f27709a = bArr;
        this.f27710b = str;
        this.f27711c = str2;
    }
}

package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.qd;
import com.applovin.impl.we;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class sa implements we.b {
    public static final Parcelable.Creator<sa> CREATOR = new a();
    public final byte[] a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7470b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7471c;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public sa[] newArray(int i10) {
            return new sa[i10];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public sa createFromParcel(Parcel parcel) {
            return new sa(parcel);
        }
    }

    public sa(Parcel parcel) {
        this.a = (byte[]) a1.a(parcel.createByteArray());
        this.f7470b = parcel.readString();
        this.f7471c = parcel.readString();
    }

    @Override // com.applovin.impl.we.b
    public void a(qd.b bVar) {
        String str = this.f7470b;
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
        if (obj != null && sa.class == obj.getClass()) {
            return Arrays.equals(this.a, ((sa) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f7470b, this.f7471c, Integer.valueOf(this.a.length));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.a);
        parcel.writeString(this.f7470b);
        parcel.writeString(this.f7471c);
    }

    public sa(byte[] bArr, String str, String str2) {
        this.a = bArr;
        this.f7470b = str;
        this.f7471c = str2;
    }
}

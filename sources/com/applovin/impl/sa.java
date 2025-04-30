package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.qd;
import com.applovin.impl.we;
import java.util.Arrays;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class sa implements we.b {
    public static final Parcelable.Creator<sa> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f10611a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10612c;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public sa[] newArray(int i9) {
            return new sa[i9];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public sa createFromParcel(Parcel parcel) {
            return new sa(parcel);
        }
    }

    public sa(Parcel parcel) {
        this.f10611a = (byte[]) AbstractC0669a1.a(parcel.createByteArray());
        this.b = parcel.readString();
        this.f10612c = parcel.readString();
    }

    @Override // com.applovin.impl.we.b
    public void a(qd.b bVar) {
        String str = this.b;
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
            return Arrays.equals(this.f10611a, ((sa) obj).f10611a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f10611a);
    }

    public String toString() {
        String str = this.b;
        String str2 = this.f10612c;
        return AbstractC2914a.g(com.mbridge.msdk.foundation.entity.o.o("ICY: title=\"", str, "\", url=\"", str2, "\", rawMetadata.length=\""), this.f10611a.length, "\"");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeByteArray(this.f10611a);
        parcel.writeString(this.b);
        parcel.writeString(this.f10612c);
    }

    public sa(byte[] bArr, String str, String str2) {
        this.f10611a = bArr;
        this.b = str;
        this.f10612c = str2;
    }
}

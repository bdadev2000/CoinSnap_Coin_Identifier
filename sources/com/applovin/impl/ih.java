package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.qd;
import com.applovin.impl.we;
import java.util.Arrays;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class ih implements we.b {
    public static final Parcelable.Creator<ih> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f8300a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8301c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8302d;

    /* renamed from: f, reason: collision with root package name */
    public final int f8303f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8304g;

    /* renamed from: h, reason: collision with root package name */
    public final int f8305h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f8306i;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ih[] newArray(int i9) {
            return new ih[i9];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ih createFromParcel(Parcel parcel) {
            return new ih(parcel);
        }
    }

    public ih(int i9, String str, String str2, int i10, int i11, int i12, int i13, byte[] bArr) {
        this.f8300a = i9;
        this.b = str;
        this.f8301c = str2;
        this.f8302d = i10;
        this.f8303f = i11;
        this.f8304g = i12;
        this.f8305h = i13;
        this.f8306i = bArr;
    }

    @Override // com.applovin.impl.we.b
    public void a(qd.b bVar) {
        bVar.a(this.f8306i, this.f8300a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ih.class != obj.getClass()) {
            return false;
        }
        ih ihVar = (ih) obj;
        if (this.f8300a == ihVar.f8300a && this.b.equals(ihVar.b) && this.f8301c.equals(ihVar.f8301c) && this.f8302d == ihVar.f8302d && this.f8303f == ihVar.f8303f && this.f8304g == ihVar.f8304g && this.f8305h == ihVar.f8305h && Arrays.equals(this.f8306i, ihVar.f8306i)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f8306i) + ((((((((AbstractC2914a.b(AbstractC2914a.b((this.f8300a + 527) * 31, 31, this.b), 31, this.f8301c) + this.f8302d) * 31) + this.f8303f) * 31) + this.f8304g) * 31) + this.f8305h) * 31);
    }

    public String toString() {
        return "Picture: mimeType=" + this.b + ", description=" + this.f8301c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.f8300a);
        parcel.writeString(this.b);
        parcel.writeString(this.f8301c);
        parcel.writeInt(this.f8302d);
        parcel.writeInt(this.f8303f);
        parcel.writeInt(this.f8304g);
        parcel.writeInt(this.f8305h);
        parcel.writeByteArray(this.f8306i);
    }

    public ih(Parcel parcel) {
        this.f8300a = parcel.readInt();
        this.b = (String) yp.a((Object) parcel.readString());
        this.f8301c = (String) yp.a((Object) parcel.readString());
        this.f8302d = parcel.readInt();
        this.f8303f = parcel.readInt();
        this.f8304g = parcel.readInt();
        this.f8305h = parcel.readInt();
        this.f8306i = (byte[]) yp.a((Object) parcel.createByteArray());
    }
}

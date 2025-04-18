package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.qd;
import com.applovin.impl.we;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ih implements we.b {
    public static final Parcelable.Creator<ih> CREATOR = new a();
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5336b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5337c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5338d;

    /* renamed from: f, reason: collision with root package name */
    public final int f5339f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5340g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5341h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f5342i;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ih[] newArray(int i10) {
            return new ih[i10];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ih createFromParcel(Parcel parcel) {
            return new ih(parcel);
        }
    }

    public ih(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.a = i10;
        this.f5336b = str;
        this.f5337c = str2;
        this.f5338d = i11;
        this.f5339f = i12;
        this.f5340g = i13;
        this.f5341h = i14;
        this.f5342i = bArr;
    }

    @Override // com.applovin.impl.we.b
    public void a(qd.b bVar) {
        bVar.a(this.f5342i, this.a);
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
        if (this.a == ihVar.a && this.f5336b.equals(ihVar.f5336b) && this.f5337c.equals(ihVar.f5337c) && this.f5338d == ihVar.f5338d && this.f5339f == ihVar.f5339f && this.f5340g == ihVar.f5340g && this.f5341h == ihVar.f5341h && Arrays.equals(this.f5342i, ihVar.f5342i)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f5342i) + ((((((((vd.e.c(this.f5337c, vd.e.c(this.f5336b, (this.a + 527) * 31, 31), 31) + this.f5338d) * 31) + this.f5339f) * 31) + this.f5340g) * 31) + this.f5341h) * 31);
    }

    public String toString() {
        return "Picture: mimeType=" + this.f5336b + ", description=" + this.f5337c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.a);
        parcel.writeString(this.f5336b);
        parcel.writeString(this.f5337c);
        parcel.writeInt(this.f5338d);
        parcel.writeInt(this.f5339f);
        parcel.writeInt(this.f5340g);
        parcel.writeInt(this.f5341h);
        parcel.writeByteArray(this.f5342i);
    }

    public ih(Parcel parcel) {
        this.a = parcel.readInt();
        this.f5336b = (String) yp.a((Object) parcel.readString());
        this.f5337c = (String) yp.a((Object) parcel.readString());
        this.f5338d = parcel.readInt();
        this.f5339f = parcel.readInt();
        this.f5340g = parcel.readInt();
        this.f5341h = parcel.readInt();
        this.f5342i = (byte[]) yp.a((Object) parcel.createByteArray());
    }
}

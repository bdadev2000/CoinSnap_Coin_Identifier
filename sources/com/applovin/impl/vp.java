package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class vp extends ua {
    public static final Parcelable.Creator<vp> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f8623b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8624c;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public vp[] newArray(int i10) {
            return new vp[i10];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public vp createFromParcel(Parcel parcel) {
            return new vp(parcel);
        }
    }

    public vp(Parcel parcel) {
        super((String) yp.a((Object) parcel.readString()));
        this.f8623b = parcel.readString();
        this.f8624c = (String) yp.a((Object) parcel.readString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vp.class != obj.getClass()) {
            return false;
        }
        vp vpVar = (vp) obj;
        if (this.a.equals(vpVar.a) && yp.a((Object) this.f8623b, (Object) vpVar.f8623b) && yp.a((Object) this.f8624c, (Object) vpVar.f8624c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int c10 = vd.e.c(this.a, 527, 31);
        String str = this.f8623b;
        int i11 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (c10 + i10) * 31;
        String str2 = this.f8624c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    @Override // com.applovin.impl.ua
    public String toString() {
        return this.a + ": url=" + this.f8624c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.a);
        parcel.writeString(this.f8623b);
        parcel.writeString(this.f8624c);
    }

    public vp(String str, String str2, String str3) {
        super(str);
        this.f8623b = str2;
        this.f8624c = str3;
    }
}

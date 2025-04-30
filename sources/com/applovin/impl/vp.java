package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class vp extends ua {
    public static final Parcelable.Creator<vp> CREATOR = new a();
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11840c;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public vp[] newArray(int i9) {
            return new vp[i9];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public vp createFromParcel(Parcel parcel) {
            return new vp(parcel);
        }
    }

    public vp(Parcel parcel) {
        super((String) yp.a((Object) parcel.readString()));
        this.b = parcel.readString();
        this.f11840c = (String) yp.a((Object) parcel.readString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vp.class != obj.getClass()) {
            return false;
        }
        vp vpVar = (vp) obj;
        if (this.f11577a.equals(vpVar.f11577a) && yp.a((Object) this.b, (Object) vpVar.b) && yp.a((Object) this.f11840c, (Object) vpVar.f11840c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i9;
        int b = AbstractC2914a.b(527, 31, this.f11577a);
        String str = this.b;
        int i10 = 0;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        int i11 = (b + i9) * 31;
        String str2 = this.f11840c;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 + i10;
    }

    @Override // com.applovin.impl.ua
    public String toString() {
        return this.f11577a + ": url=" + this.f11840c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f11577a);
        parcel.writeString(this.b);
        parcel.writeString(this.f11840c);
    }

    public vp(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.f11840c = str3;
    }
}

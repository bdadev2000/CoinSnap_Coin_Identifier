package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class u3 extends ya {
    public static final Parcelable.Creator<u3> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f27271b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27272c;
    public final String d;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public u3[] newArray(int i2) {
            return new u3[i2];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public u3 createFromParcel(Parcel parcel) {
            return new u3(parcel);
        }
    }

    public u3(Parcel parcel) {
        super("COMM");
        this.f27271b = (String) xp.a((Object) parcel.readString());
        this.f27272c = (String) xp.a((Object) parcel.readString());
        this.d = (String) xp.a((Object) parcel.readString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u3.class != obj.getClass()) {
            return false;
        }
        u3 u3Var = (u3) obj;
        return xp.a((Object) this.f27272c, (Object) u3Var.f27272c) && xp.a((Object) this.f27271b, (Object) u3Var.f27271b) && xp.a((Object) this.d, (Object) u3Var.d);
    }

    public int hashCode() {
        String str = this.f27271b;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f27272c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.applovin.impl.ya
    public String toString() {
        return this.f28125a + ": language=" + this.f27271b + ", description=" + this.f27272c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f28125a);
        parcel.writeString(this.f27271b);
        parcel.writeString(this.d);
    }

    public u3(String str, String str2, String str3) {
        super("COMM");
        this.f27271b = str;
        this.f27272c = str2;
        this.d = str3;
    }
}

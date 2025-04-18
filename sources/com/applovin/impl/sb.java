package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class sb extends ya {
    public static final Parcelable.Creator<sb> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f26476b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26477c;
    public final String d;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public sb[] newArray(int i2) {
            return new sb[i2];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public sb createFromParcel(Parcel parcel) {
            return new sb(parcel);
        }
    }

    public sb(Parcel parcel) {
        super("----");
        this.f26476b = (String) xp.a((Object) parcel.readString());
        this.f26477c = (String) xp.a((Object) parcel.readString());
        this.d = (String) xp.a((Object) parcel.readString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sb.class != obj.getClass()) {
            return false;
        }
        sb sbVar = (sb) obj;
        return xp.a((Object) this.f26477c, (Object) sbVar.f26477c) && xp.a((Object) this.f26476b, (Object) sbVar.f26476b) && xp.a((Object) this.d, (Object) sbVar.d);
    }

    public int hashCode() {
        String str = this.f26476b;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f26477c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.applovin.impl.ya
    public String toString() {
        return this.f28125a + ": domain=" + this.f26476b + ", description=" + this.f26477c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f28125a);
        parcel.writeString(this.f26476b);
        parcel.writeString(this.d);
    }

    public sb(String str, String str2, String str3) {
        super("----");
        this.f26476b = str;
        this.f26477c = str2;
        this.d = str3;
    }
}

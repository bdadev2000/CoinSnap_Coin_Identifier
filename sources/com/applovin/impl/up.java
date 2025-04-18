package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class up extends ya {
    public static final Parcelable.Creator<up> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f27428b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27429c;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public up[] newArray(int i2) {
            return new up[i2];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public up createFromParcel(Parcel parcel) {
            return new up(parcel);
        }
    }

    public up(Parcel parcel) {
        super((String) xp.a((Object) parcel.readString()));
        this.f27428b = parcel.readString();
        this.f27429c = (String) xp.a((Object) parcel.readString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || up.class != obj.getClass()) {
            return false;
        }
        up upVar = (up) obj;
        return this.f28125a.equals(upVar.f28125a) && xp.a((Object) this.f27428b, (Object) upVar.f27428b) && xp.a((Object) this.f27429c, (Object) upVar.f27429c);
    }

    public int hashCode() {
        int b2 = androidx.compose.foundation.text.input.a.b(this.f28125a, 527, 31);
        String str = this.f27428b;
        int hashCode = (b2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f27429c;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.applovin.impl.ya
    public String toString() {
        return this.f28125a + ": url=" + this.f27429c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f28125a);
        parcel.writeString(this.f27428b);
        parcel.writeString(this.f27429c);
    }

    public up(String str, String str2, String str3) {
        super(str);
        this.f27428b = str2;
        this.f27429c = str3;
    }
}

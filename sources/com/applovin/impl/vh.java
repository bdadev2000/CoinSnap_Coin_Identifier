package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class vh extends ya {
    public static final Parcelable.Creator<vh> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f27573b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f27574c;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public vh[] newArray(int i2) {
            return new vh[i2];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public vh createFromParcel(Parcel parcel) {
            return new vh(parcel);
        }
    }

    public vh(Parcel parcel) {
        super("PRIV");
        this.f27573b = (String) xp.a((Object) parcel.readString());
        this.f27574c = (byte[]) xp.a((Object) parcel.createByteArray());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vh.class != obj.getClass()) {
            return false;
        }
        vh vhVar = (vh) obj;
        return xp.a((Object) this.f27573b, (Object) vhVar.f27573b) && Arrays.equals(this.f27574c, vhVar.f27574c);
    }

    public int hashCode() {
        String str = this.f27573b;
        return Arrays.hashCode(this.f27574c) + (((str != null ? str.hashCode() : 0) + 527) * 31);
    }

    @Override // com.applovin.impl.ya
    public String toString() {
        return this.f28125a + ": owner=" + this.f27573b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f27573b);
        parcel.writeByteArray(this.f27574c);
    }

    public vh(String str, byte[] bArr) {
        super("PRIV");
        this.f27573b = str;
        this.f27574c = bArr;
    }
}

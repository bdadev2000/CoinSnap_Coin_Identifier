package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class aa extends ya {
    public static final Parcelable.Creator<aa> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f22723b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22724c;
    public final String d;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f22725f;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public aa[] newArray(int i2) {
            return new aa[i2];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public aa createFromParcel(Parcel parcel) {
            return new aa(parcel);
        }
    }

    public aa(Parcel parcel) {
        super("GEOB");
        this.f22723b = (String) xp.a((Object) parcel.readString());
        this.f22724c = (String) xp.a((Object) parcel.readString());
        this.d = (String) xp.a((Object) parcel.readString());
        this.f22725f = (byte[]) xp.a((Object) parcel.createByteArray());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || aa.class != obj.getClass()) {
            return false;
        }
        aa aaVar = (aa) obj;
        return xp.a((Object) this.f22723b, (Object) aaVar.f22723b) && xp.a((Object) this.f22724c, (Object) aaVar.f22724c) && xp.a((Object) this.d, (Object) aaVar.d) && Arrays.equals(this.f22725f, aaVar.f22725f);
    }

    public int hashCode() {
        String str = this.f22723b;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f22724c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        return Arrays.hashCode(this.f22725f) + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // com.applovin.impl.ya
    public String toString() {
        return this.f28125a + ": mimeType=" + this.f22723b + ", filename=" + this.f22724c + ", description=" + this.d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f22723b);
        parcel.writeString(this.f22724c);
        parcel.writeString(this.d);
        parcel.writeByteArray(this.f22725f);
    }

    public aa(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f22723b = str;
        this.f22724c = str2;
        this.d = str3;
        this.f22725f = bArr;
    }
}

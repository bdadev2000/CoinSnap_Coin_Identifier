package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.GeobFrame;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class y9 extends ua {
    public static final Parcelable.Creator<y9> CREATOR = new a();
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12363c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12364d;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f12365f;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y9[] newArray(int i9) {
            return new y9[i9];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y9 createFromParcel(Parcel parcel) {
            return new y9(parcel);
        }
    }

    public y9(Parcel parcel) {
        super(GeobFrame.ID);
        this.b = (String) yp.a((Object) parcel.readString());
        this.f12363c = (String) yp.a((Object) parcel.readString());
        this.f12364d = (String) yp.a((Object) parcel.readString());
        this.f12365f = (byte[]) yp.a((Object) parcel.createByteArray());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y9.class != obj.getClass()) {
            return false;
        }
        y9 y9Var = (y9) obj;
        if (yp.a((Object) this.b, (Object) y9Var.b) && yp.a((Object) this.f12363c, (Object) y9Var.f12363c) && yp.a((Object) this.f12364d, (Object) y9Var.f12364d) && Arrays.equals(this.f12365f, y9Var.f12365f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i9;
        int i10;
        String str = this.b;
        int i11 = 0;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        int i12 = (i9 + 527) * 31;
        String str2 = this.f12363c;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i12 + i10) * 31;
        String str3 = this.f12364d;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return Arrays.hashCode(this.f12365f) + ((i13 + i11) * 31);
    }

    @Override // com.applovin.impl.ua
    public String toString() {
        return this.f11577a + ": mimeType=" + this.b + ", filename=" + this.f12363c + ", description=" + this.f12364d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.b);
        parcel.writeString(this.f12363c);
        parcel.writeString(this.f12364d);
        parcel.writeByteArray(this.f12365f);
    }

    public y9(String str, String str2, String str3, byte[] bArr) {
        super(GeobFrame.ID);
        this.b = str;
        this.f12363c = str2;
        this.f12364d = str3;
        this.f12365f = bArr;
    }
}

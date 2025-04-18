package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.GeobFrame;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class y9 extends ua {
    public static final Parcelable.Creator<y9> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f9161b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9162c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9163d;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f9164f;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y9[] newArray(int i10) {
            return new y9[i10];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y9 createFromParcel(Parcel parcel) {
            return new y9(parcel);
        }
    }

    public y9(Parcel parcel) {
        super(GeobFrame.ID);
        this.f9161b = (String) yp.a((Object) parcel.readString());
        this.f9162c = (String) yp.a((Object) parcel.readString());
        this.f9163d = (String) yp.a((Object) parcel.readString());
        this.f9164f = (byte[]) yp.a((Object) parcel.createByteArray());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y9.class != obj.getClass()) {
            return false;
        }
        y9 y9Var = (y9) obj;
        if (yp.a((Object) this.f9161b, (Object) y9Var.f9161b) && yp.a((Object) this.f9162c, (Object) y9Var.f9162c) && yp.a((Object) this.f9163d, (Object) y9Var.f9163d) && Arrays.equals(this.f9164f, y9Var.f9164f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11;
        String str = this.f9161b;
        int i12 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i10 + 527) * 31;
        String str2 = this.f9162c;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f9163d;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return Arrays.hashCode(this.f9164f) + ((i14 + i12) * 31);
    }

    @Override // com.applovin.impl.ua
    public String toString() {
        return this.a + ": mimeType=" + this.f9161b + ", filename=" + this.f9162c + ", description=" + this.f9163d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f9161b);
        parcel.writeString(this.f9162c);
        parcel.writeString(this.f9163d);
        parcel.writeByteArray(this.f9164f);
    }

    public y9(String str, String str2, String str3, byte[] bArr) {
        super(GeobFrame.ID);
        this.f9161b = str;
        this.f9162c = str2;
        this.f9163d = str3;
        this.f9164f = bArr;
    }
}

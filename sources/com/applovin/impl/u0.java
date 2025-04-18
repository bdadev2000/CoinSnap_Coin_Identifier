package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.qd;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ApicFrame;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class u0 extends ua {
    public static final Parcelable.Creator<u0> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f8319b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8320c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8321d;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f8322f;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public u0[] newArray(int i10) {
            return new u0[i10];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public u0 createFromParcel(Parcel parcel) {
            return new u0(parcel);
        }
    }

    public u0(Parcel parcel) {
        super(ApicFrame.ID);
        this.f8319b = (String) yp.a((Object) parcel.readString());
        this.f8320c = parcel.readString();
        this.f8321d = parcel.readInt();
        this.f8322f = (byte[]) yp.a((Object) parcel.createByteArray());
    }

    @Override // com.applovin.impl.we.b
    public void a(qd.b bVar) {
        bVar.a(this.f8322f, this.f8321d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u0.class != obj.getClass()) {
            return false;
        }
        u0 u0Var = (u0) obj;
        if (this.f8321d == u0Var.f8321d && yp.a((Object) this.f8319b, (Object) u0Var.f8319b) && yp.a((Object) this.f8320c, (Object) u0Var.f8320c) && Arrays.equals(this.f8322f, u0Var.f8322f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11 = (this.f8321d + 527) * 31;
        String str = this.f8319b;
        int i12 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i11 + i10) * 31;
        String str2 = this.f8320c;
        if (str2 != null) {
            i12 = str2.hashCode();
        }
        return Arrays.hashCode(this.f8322f) + ((i13 + i12) * 31);
    }

    @Override // com.applovin.impl.ua
    public String toString() {
        return this.a + ": mimeType=" + this.f8319b + ", description=" + this.f8320c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f8319b);
        parcel.writeString(this.f8320c);
        parcel.writeInt(this.f8321d);
        parcel.writeByteArray(this.f8322f);
    }

    public u0(String str, String str2, int i10, byte[] bArr) {
        super(ApicFrame.ID);
        this.f8319b = str;
        this.f8320c = str2;
        this.f8321d = i10;
        this.f8322f = bArr;
    }
}

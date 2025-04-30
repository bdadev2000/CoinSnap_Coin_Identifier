package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.qd;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ApicFrame;
import java.util.Arrays;

/* renamed from: com.applovin.impl.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0762u0 extends ua {
    public static final Parcelable.Creator<C0762u0> CREATOR = new a();
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11531c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11532d;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f11533f;

    /* renamed from: com.applovin.impl.u0$a */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0762u0[] newArray(int i9) {
            return new C0762u0[i9];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0762u0 createFromParcel(Parcel parcel) {
            return new C0762u0(parcel);
        }
    }

    public C0762u0(Parcel parcel) {
        super(ApicFrame.ID);
        this.b = (String) yp.a((Object) parcel.readString());
        this.f11531c = parcel.readString();
        this.f11532d = parcel.readInt();
        this.f11533f = (byte[]) yp.a((Object) parcel.createByteArray());
    }

    @Override // com.applovin.impl.we.b
    public void a(qd.b bVar) {
        bVar.a(this.f11533f, this.f11532d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0762u0.class != obj.getClass()) {
            return false;
        }
        C0762u0 c0762u0 = (C0762u0) obj;
        if (this.f11532d == c0762u0.f11532d && yp.a((Object) this.b, (Object) c0762u0.b) && yp.a((Object) this.f11531c, (Object) c0762u0.f11531c) && Arrays.equals(this.f11533f, c0762u0.f11533f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i9;
        int i10 = (this.f11532d + 527) * 31;
        String str = this.b;
        int i11 = 0;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        int i12 = (i10 + i9) * 31;
        String str2 = this.f11531c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return Arrays.hashCode(this.f11533f) + ((i12 + i11) * 31);
    }

    @Override // com.applovin.impl.ua
    public String toString() {
        return this.f11577a + ": mimeType=" + this.b + ", description=" + this.f11531c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.b);
        parcel.writeString(this.f11531c);
        parcel.writeInt(this.f11532d);
        parcel.writeByteArray(this.f11533f);
    }

    public C0762u0(String str, String str2, int i9, byte[] bArr) {
        super(ApicFrame.ID);
        this.b = str;
        this.f11531c = str2;
        this.f11532d = i9;
        this.f11533f = bArr;
    }
}

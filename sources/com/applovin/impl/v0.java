package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.vd;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class v0 extends ya {
    public static final Parcelable.Creator<v0> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f27446b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27447c;
    public final int d;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f27448f;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public v0[] newArray(int i2) {
            return new v0[i2];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public v0 createFromParcel(Parcel parcel) {
            return new v0(parcel);
        }
    }

    public v0(Parcel parcel) {
        super("APIC");
        this.f27446b = (String) xp.a((Object) parcel.readString());
        this.f27447c = parcel.readString();
        this.d = parcel.readInt();
        this.f27448f = (byte[]) xp.a((Object) parcel.createByteArray());
    }

    @Override // com.applovin.impl.bf.b
    public void a(vd.b bVar) {
        bVar.a(this.f27448f, this.d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v0.class != obj.getClass()) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return this.d == v0Var.d && xp.a((Object) this.f27446b, (Object) v0Var.f27446b) && xp.a((Object) this.f27447c, (Object) v0Var.f27447c) && Arrays.equals(this.f27448f, v0Var.f27448f);
    }

    public int hashCode() {
        int i2 = (this.d + 527) * 31;
        String str = this.f27446b;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f27447c;
        return Arrays.hashCode(this.f27448f) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // com.applovin.impl.ya
    public String toString() {
        return this.f28125a + ": mimeType=" + this.f27446b + ", description=" + this.f27447c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f27446b);
        parcel.writeString(this.f27447c);
        parcel.writeInt(this.d);
        parcel.writeByteArray(this.f27448f);
    }

    public v0(String str, String str2, int i2, byte[] bArr) {
        super("APIC");
        this.f27446b = str;
        this.f27447c = str2;
        this.d = i2;
        this.f27448f = bArr;
    }
}

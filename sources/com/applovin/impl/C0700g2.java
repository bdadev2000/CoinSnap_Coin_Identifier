package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import x0.AbstractC2914a;

/* renamed from: com.applovin.impl.g2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0700g2 extends ua {
    public static final Parcelable.Creator<C0700g2> CREATOR = new a();
    public final byte[] b;

    /* renamed from: com.applovin.impl.g2$a */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0700g2[] newArray(int i9) {
            return new C0700g2[i9];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0700g2 createFromParcel(Parcel parcel) {
            return new C0700g2(parcel);
        }
    }

    public C0700g2(Parcel parcel) {
        super((String) yp.a((Object) parcel.readString()));
        this.b = (byte[]) yp.a((Object) parcel.createByteArray());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0700g2.class != obj.getClass()) {
            return false;
        }
        C0700g2 c0700g2 = (C0700g2) obj;
        if (this.f11577a.equals(c0700g2.f11577a) && Arrays.equals(this.b, c0700g2.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.b) + AbstractC2914a.b(527, 31, this.f11577a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f11577a);
        parcel.writeByteArray(this.b);
    }

    public C0700g2(String str, byte[] bArr) {
        super(str);
        this.b = bArr;
    }
}

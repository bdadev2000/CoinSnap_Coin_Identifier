package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.bf;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class fd implements bf.b {
    public static final Parcelable.Creator<fd> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final String f23892a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f23893b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23894c;
    public final int d;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public fd[] newArray(int i2) {
            return new fd[i2];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public fd createFromParcel(Parcel parcel) {
            return new fd(parcel, null);
        }
    }

    private fd(Parcel parcel) {
        this.f23892a = (String) xp.a((Object) parcel.readString());
        this.f23893b = (byte[]) xp.a((Object) parcel.createByteArray());
        this.f23894c = parcel.readInt();
        this.d = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fd.class != obj.getClass()) {
            return false;
        }
        fd fdVar = (fd) obj;
        return this.f23892a.equals(fdVar.f23892a) && Arrays.equals(this.f23893b, fdVar.f23893b) && this.f23894c == fdVar.f23894c && this.d == fdVar.d;
    }

    public int hashCode() {
        return ((((Arrays.hashCode(this.f23893b) + androidx.compose.foundation.text.input.a.b(this.f23892a, 527, 31)) * 31) + this.f23894c) * 31) + this.d;
    }

    public String toString() {
        return "mdta: key=" + this.f23892a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f23892a);
        parcel.writeByteArray(this.f23893b);
        parcel.writeInt(this.f23894c);
        parcel.writeInt(this.d);
    }

    public /* synthetic */ fd(Parcel parcel, a aVar) {
        this(parcel);
    }

    public fd(String str, byte[] bArr, int i2, int i3) {
        this.f23892a = str;
        this.f23893b = bArr;
        this.f23894c = i2;
        this.d = i3;
    }
}

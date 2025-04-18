package com.google.android.material.timepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new r8.b(15);

    /* renamed from: b, reason: collision with root package name */
    public final int f11878b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11879c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11880d;

    /* renamed from: f, reason: collision with root package name */
    public final int f11881f;

    public i(Parcel parcel) {
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        int readInt3 = parcel.readInt();
        int readInt4 = parcel.readInt();
        this.f11879c = readInt;
        this.f11880d = readInt2;
        this.f11881f = readInt3;
        this.f11878b = readInt4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f11879c == iVar.f11879c && this.f11880d == iVar.f11880d && this.f11878b == iVar.f11878b && this.f11881f == iVar.f11881f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11878b), Integer.valueOf(this.f11879c), Integer.valueOf(this.f11880d), Integer.valueOf(this.f11881f)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f11879c);
        parcel.writeInt(this.f11880d);
        parcel.writeInt(this.f11881f);
        parcel.writeInt(this.f11878b);
    }
}

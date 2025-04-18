package q8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n9.h0;

/* loaded from: classes3.dex */
public final class l extends j {
    public static final Parcelable.Creator<l> CREATOR = new com.facebook.login.l(25);

    /* renamed from: c, reason: collision with root package name */
    public final int f23722c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23723d;

    /* renamed from: f, reason: collision with root package name */
    public final int f23724f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f23725g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f23726h;

    public l(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f23722c = i10;
        this.f23723d = i11;
        this.f23724f = i12;
        this.f23725g = iArr;
        this.f23726h = iArr2;
    }

    @Override // q8.j, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f23722c == lVar.f23722c && this.f23723d == lVar.f23723d && this.f23724f == lVar.f23724f && Arrays.equals(this.f23725g, lVar.f23725g) && Arrays.equals(this.f23726h, lVar.f23726h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f23726h) + ((Arrays.hashCode(this.f23725g) + ((((((527 + this.f23722c) * 31) + this.f23723d) * 31) + this.f23724f) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f23722c);
        parcel.writeInt(this.f23723d);
        parcel.writeInt(this.f23724f);
        parcel.writeIntArray(this.f23725g);
        parcel.writeIntArray(this.f23726h);
    }

    public l(Parcel parcel) {
        super("MLLT");
        this.f23722c = parcel.readInt();
        this.f23723d = parcel.readInt();
        this.f23724f = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        int i10 = h0.a;
        this.f23725g = createIntArray;
        this.f23726h = parcel.createIntArray();
    }
}

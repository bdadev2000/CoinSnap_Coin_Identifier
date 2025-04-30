package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: androidx.fragment.app.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0466h0 implements Parcelable {
    public static final Parcelable.Creator<C0466h0> CREATOR = new E3.b(17);
    public String b;

    /* renamed from: c, reason: collision with root package name */
    public int f4726c;

    public C0466h0(String str, int i9) {
        this.b = str;
        this.f4726c = i9;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.b);
        parcel.writeInt(this.f4726c);
    }
}

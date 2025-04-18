package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a0 implements Parcelable {
    public static final Parcelable.Creator<a0> CREATOR = new android.support.v4.media.a(14);

    /* renamed from: b, reason: collision with root package name */
    public int f1858b;

    /* renamed from: c, reason: collision with root package name */
    public int f1859c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1860d;

    public a0() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f1858b);
        parcel.writeInt(this.f1859c);
        parcel.writeInt(this.f1860d ? 1 : 0);
    }

    public a0(Parcel parcel) {
        this.f1858b = parcel.readInt();
        this.f1859c = parcel.readInt();
        this.f1860d = parcel.readInt() == 1;
    }

    public a0(a0 a0Var) {
        this.f1858b = a0Var.f1858b;
        this.f1859c = a0Var.f1859c;
        this.f1860d = a0Var.f1860d;
    }
}

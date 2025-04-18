package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class y3 extends w0.b {
    public static final Parcelable.Creator<y3> CREATOR = new j3(1);

    /* renamed from: d, reason: collision with root package name */
    public int f1099d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1100f;

    public y3(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1099d = parcel.readInt();
        this.f1100f = parcel.readInt() != 0;
    }

    @Override // w0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f26666b, i10);
        parcel.writeInt(this.f1099d);
        parcel.writeInt(this.f1100f ? 1 : 0);
    }

    public y3(Parcelable parcelable) {
        super(parcelable);
    }
}

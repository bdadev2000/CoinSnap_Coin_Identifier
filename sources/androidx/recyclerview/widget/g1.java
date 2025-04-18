package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.j3;

/* loaded from: classes.dex */
public final class g1 extends w0.b {
    public static final Parcelable.Creator<g1> CREATOR = new j3(5);

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f1918d;

    public g1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1918d = parcel.readParcelable(classLoader == null ? v0.class.getClassLoader() : classLoader);
    }

    @Override // w0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f26666b, i10);
        parcel.writeParcelable(this.f1918d, 0);
    }

    public g1(Parcelable parcelable) {
        super(parcelable);
    }
}

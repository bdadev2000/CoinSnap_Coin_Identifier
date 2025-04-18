package androidx.viewpager.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.j3;

/* loaded from: classes.dex */
public final class i extends w0.b {
    public static final Parcelable.Creator<i> CREATOR = new j3(6);

    /* renamed from: d, reason: collision with root package name */
    public int f2119d;

    /* renamed from: f, reason: collision with root package name */
    public Parcelable f2120f;

    /* renamed from: g, reason: collision with root package name */
    public final ClassLoader f2121g;

    public i(Parcelable parcelable) {
        super(parcelable);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentPager.SavedState{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" position=");
        return vd.e.g(sb2, this.f2119d, "}");
    }

    @Override // w0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f26666b, i10);
        parcel.writeInt(this.f2119d);
        parcel.writeParcelable(this.f2120f, i10);
    }

    public i(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? i.class.getClassLoader() : classLoader;
        this.f2119d = parcel.readInt();
        this.f2120f = parcel.readParcelable(classLoader);
        this.f2121g = classLoader;
    }
}

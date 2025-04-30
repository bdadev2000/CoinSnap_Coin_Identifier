package androidx.viewpager.widget;

import android.os.Parcel;
import android.os.Parcelable;
import b0.AbstractC0547b;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class i extends AbstractC0547b {
    public static final Parcelable.Creator<i> CREATOR = new B3.i(9);

    /* renamed from: d, reason: collision with root package name */
    public int f5164d;

    /* renamed from: f, reason: collision with root package name */
    public Parcelable f5165f;

    /* renamed from: g, reason: collision with root package name */
    public final ClassLoader f5166g;

    public i(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? i.class.getClassLoader() : classLoader;
        this.f5164d = parcel.readInt();
        this.f5165f = parcel.readParcelable(classLoader);
        this.f5166g = classLoader;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" position=");
        return AbstractC2914a.g(sb, this.f5164d, "}");
    }

    @Override // b0.AbstractC0547b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        super.writeToParcel(parcel, i9);
        parcel.writeInt(this.f5164d);
        parcel.writeParcelable(this.f5165f, i9);
    }
}

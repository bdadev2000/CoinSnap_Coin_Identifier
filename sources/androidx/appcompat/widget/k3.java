package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class k3 extends w0.b {
    public static final Parcelable.Creator<k3> CREATOR = new j3(0);

    /* renamed from: d, reason: collision with root package name */
    public boolean f913d;

    public k3(Parcelable parcelable) {
        super(parcelable);
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f913d + "}";
    }

    @Override // w0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f26666b, i10);
        parcel.writeValue(Boolean.valueOf(this.f913d));
    }

    public k3(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f913d = ((Boolean) parcel.readValue(null)).booleanValue();
    }
}

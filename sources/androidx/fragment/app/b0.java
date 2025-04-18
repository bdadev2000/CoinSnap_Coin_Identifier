package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.j3;

/* loaded from: classes.dex */
public final class b0 implements Parcelable {

    @NonNull
    public static final Parcelable.Creator<b0> CREATOR = new j3(4);

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f1583b;

    public b0(Bundle bundle) {
        this.f1583b = bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeBundle(this.f1583b);
    }

    public b0(Parcel parcel, ClassLoader classLoader) {
        Bundle readBundle = parcel.readBundle();
        this.f1583b = readBundle;
        if (classLoader == null || readBundle == null) {
            return;
        }
        readBundle.setClassLoader(classLoader);
    }
}

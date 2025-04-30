package b0;

import B3.i;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: b0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0547b implements Parcelable {
    public final Parcelable b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0546a f5254c = new AbstractC0547b();
    public static final Parcelable.Creator<AbstractC0547b> CREATOR = new i(10);

    public AbstractC0547b() {
        this.b = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeParcelable(this.b, i9);
    }

    public AbstractC0547b(Parcelable parcelable) {
        if (parcelable != null) {
            this.b = parcelable == f5254c ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbstractC0547b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.b = readParcelable == null ? f5254c : readParcelable;
    }
}

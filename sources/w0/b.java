package w0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.j3;

/* loaded from: classes.dex */
public abstract class b implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    public final Parcelable f26666b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f26665c = new a();
    public static final Parcelable.Creator<b> CREATOR = new j3(3);

    public b() {
        this.f26666b = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f26666b, i10);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f26666b = parcelable == f26665c ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f26666b = readParcelable == null ? f26665c : readParcelable;
    }
}

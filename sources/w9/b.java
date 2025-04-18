package w9;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.j3;

/* loaded from: classes3.dex */
public final class b extends w0.b {
    public static final Parcelable.Creator<b> CREATOR = new j3(10);

    /* renamed from: d, reason: collision with root package name */
    public boolean f26931d;

    public b(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // w0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f26666b, i10);
        parcel.writeInt(this.f26931d ? 1 : 0);
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            b.class.getClassLoader();
        }
        this.f26931d = parcel.readInt() == 1;
    }
}

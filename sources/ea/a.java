package ea;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.j3;

/* loaded from: classes3.dex */
public final class a extends w0.b {
    public static final Parcelable.Creator<a> CREATOR = new j3(11);

    /* renamed from: d, reason: collision with root package name */
    public boolean f17204d;

    public a(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // w0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f26666b, i10);
        parcel.writeInt(this.f17204d ? 1 : 0);
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f17204d = parcel.readInt() == 1;
    }
}

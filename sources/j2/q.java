package j2;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.appcompat.widget.j3;

/* loaded from: classes.dex */
public final class q extends View.BaseSavedState {
    public static final Parcelable.Creator<q> CREATOR = new j3(7);

    /* renamed from: b, reason: collision with root package name */
    public int f19739b;

    /* renamed from: c, reason: collision with root package name */
    public int f19740c;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f19741d;

    public q(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f19739b = parcel.readInt();
        this.f19740c = parcel.readInt();
        this.f19741d = parcel.readParcelable(classLoader);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f19739b);
        parcel.writeInt(this.f19740c);
        parcel.writeParcelable(this.f19741d, i10);
    }

    public q(Parcelable parcelable) {
        super(parcelable);
    }
}

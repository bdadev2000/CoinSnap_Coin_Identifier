package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes.dex */
public final class r0 extends View.BaseSavedState {
    public static final Parcelable.Creator<r0> CREATOR = new android.support.v4.media.a(7);

    /* renamed from: b, reason: collision with root package name */
    public boolean f1009b;

    public r0(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeByte(this.f1009b ? (byte) 1 : (byte) 0);
    }

    public r0(Parcel parcel) {
        super(parcel);
        this.f1009b = parcel.readByte() != 0;
    }
}

package v1;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: v1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2845f extends View.BaseSavedState {
    public static final Parcelable.Creator<C2845f> CREATOR = new com.facebook.y(21);
    public String b;

    /* renamed from: c, reason: collision with root package name */
    public int f23471c;

    /* renamed from: d, reason: collision with root package name */
    public float f23472d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23473f;

    /* renamed from: g, reason: collision with root package name */
    public String f23474g;

    /* renamed from: h, reason: collision with root package name */
    public int f23475h;

    /* renamed from: i, reason: collision with root package name */
    public int f23476i;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        super.writeToParcel(parcel, i9);
        parcel.writeString(this.b);
        parcel.writeFloat(this.f23472d);
        parcel.writeInt(this.f23473f ? 1 : 0);
        parcel.writeString(this.f23474g);
        parcel.writeInt(this.f23475h);
        parcel.writeInt(this.f23476i);
    }
}

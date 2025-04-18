package m3;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes.dex */
public final class g extends View.BaseSavedState {
    public static final Parcelable.Creator<g> CREATOR = new android.support.v4.media.a(18);

    /* renamed from: b, reason: collision with root package name */
    public String f21532b;

    /* renamed from: c, reason: collision with root package name */
    public int f21533c;

    /* renamed from: d, reason: collision with root package name */
    public float f21534d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f21535f;

    /* renamed from: g, reason: collision with root package name */
    public String f21536g;

    /* renamed from: h, reason: collision with root package name */
    public int f21537h;

    /* renamed from: i, reason: collision with root package name */
    public int f21538i;

    public g(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.f21532b);
        parcel.writeFloat(this.f21534d);
        parcel.writeInt(this.f21535f ? 1 : 0);
        parcel.writeString(this.f21536g);
        parcel.writeInt(this.f21537h);
        parcel.writeInt(this.f21538i);
    }

    public g(Parcel parcel) {
        super(parcel);
        this.f21532b = parcel.readString();
        this.f21534d = parcel.readFloat();
        this.f21535f = parcel.readInt() == 1;
        this.f21536g = parcel.readString();
        this.f21537h = parcel.readInt();
        this.f21538i = parcel.readInt();
    }
}

package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class p0 implements Parcelable {
    public static final Parcelable.Creator<p0> CREATOR = new E3.b(18);
    public ArrayList b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f4761c;

    /* renamed from: d, reason: collision with root package name */
    public C0453b[] f4762d;

    /* renamed from: f, reason: collision with root package name */
    public int f4763f;

    /* renamed from: g, reason: collision with root package name */
    public String f4764g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f4765h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f4766i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f4767j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeStringList(this.b);
        parcel.writeStringList(this.f4761c);
        parcel.writeTypedArray(this.f4762d, i9);
        parcel.writeInt(this.f4763f);
        parcel.writeString(this.f4764g);
        parcel.writeStringList(this.f4765h);
        parcel.writeTypedList(this.f4766i);
        parcel.writeTypedList(this.f4767j);
    }
}

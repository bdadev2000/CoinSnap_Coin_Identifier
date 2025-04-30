package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class x0 implements Parcelable {
    public static final Parcelable.Creator<x0> CREATOR = new E3.b(22);
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int f5116c;

    /* renamed from: d, reason: collision with root package name */
    public int f5117d;

    /* renamed from: f, reason: collision with root package name */
    public int[] f5118f;

    /* renamed from: g, reason: collision with root package name */
    public int f5119g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f5120h;

    /* renamed from: i, reason: collision with root package name */
    public List f5121i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5122j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5123k;
    public boolean l;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.f5116c);
        parcel.writeInt(this.f5117d);
        if (this.f5117d > 0) {
            parcel.writeIntArray(this.f5118f);
        }
        parcel.writeInt(this.f5119g);
        if (this.f5119g > 0) {
            parcel.writeIntArray(this.f5120h);
        }
        parcel.writeInt(this.f5122j ? 1 : 0);
        parcel.writeInt(this.f5123k ? 1 : 0);
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeList(this.f5121i);
    }
}

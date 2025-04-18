package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class w1 implements Parcelable {
    public static final Parcelable.Creator<w1> CREATOR = new android.support.v4.media.a(16);

    /* renamed from: b, reason: collision with root package name */
    public int f2062b;

    /* renamed from: c, reason: collision with root package name */
    public int f2063c;

    /* renamed from: d, reason: collision with root package name */
    public int f2064d;

    /* renamed from: f, reason: collision with root package name */
    public int[] f2065f;

    /* renamed from: g, reason: collision with root package name */
    public int f2066g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f2067h;

    /* renamed from: i, reason: collision with root package name */
    public List f2068i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2069j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2070k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2071l;

    public w1() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f2062b);
        parcel.writeInt(this.f2063c);
        parcel.writeInt(this.f2064d);
        if (this.f2064d > 0) {
            parcel.writeIntArray(this.f2065f);
        }
        parcel.writeInt(this.f2066g);
        if (this.f2066g > 0) {
            parcel.writeIntArray(this.f2067h);
        }
        parcel.writeInt(this.f2069j ? 1 : 0);
        parcel.writeInt(this.f2070k ? 1 : 0);
        parcel.writeInt(this.f2071l ? 1 : 0);
        parcel.writeList(this.f2068i);
    }

    public w1(Parcel parcel) {
        this.f2062b = parcel.readInt();
        this.f2063c = parcel.readInt();
        int readInt = parcel.readInt();
        this.f2064d = readInt;
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            this.f2065f = iArr;
            parcel.readIntArray(iArr);
        }
        int readInt2 = parcel.readInt();
        this.f2066g = readInt2;
        if (readInt2 > 0) {
            int[] iArr2 = new int[readInt2];
            this.f2067h = iArr2;
            parcel.readIntArray(iArr2);
        }
        this.f2069j = parcel.readInt() == 1;
        this.f2070k = parcel.readInt() == 1;
        this.f2071l = parcel.readInt() == 1;
        this.f2068i = parcel.readArrayList(u1.class.getClassLoader());
    }

    public w1(w1 w1Var) {
        this.f2064d = w1Var.f2064d;
        this.f2062b = w1Var.f2062b;
        this.f2063c = w1Var.f2063c;
        this.f2065f = w1Var.f2065f;
        this.f2066g = w1Var.f2066g;
        this.f2067h = w1Var.f2067h;
        this.f2069j = w1Var.f2069j;
        this.f2070k = w1Var.f2070k;
        this.f2071l = w1Var.f2071l;
        this.f2068i = w1Var.f2068i;
    }
}

package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e1 implements Parcelable {
    public static final Parcelable.Creator<e1> CREATOR = new android.support.v4.media.a(12);

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f1617b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f1618c;

    /* renamed from: d, reason: collision with root package name */
    public b[] f1619d;

    /* renamed from: f, reason: collision with root package name */
    public int f1620f;

    /* renamed from: g, reason: collision with root package name */
    public String f1621g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f1622h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f1623i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f1624j;

    public e1() {
        this.f1621g = null;
        this.f1622h = new ArrayList();
        this.f1623i = new ArrayList();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f1617b);
        parcel.writeStringList(this.f1618c);
        parcel.writeTypedArray(this.f1619d, i10);
        parcel.writeInt(this.f1620f);
        parcel.writeString(this.f1621g);
        parcel.writeStringList(this.f1622h);
        parcel.writeTypedList(this.f1623i);
        parcel.writeTypedList(this.f1624j);
    }

    public e1(Parcel parcel) {
        this.f1621g = null;
        this.f1622h = new ArrayList();
        this.f1623i = new ArrayList();
        this.f1617b = parcel.createStringArrayList();
        this.f1618c = parcel.createStringArrayList();
        this.f1619d = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f1620f = parcel.readInt();
        this.f1621g = parcel.readString();
        this.f1622h = parcel.createStringArrayList();
        this.f1623i = parcel.createTypedArrayList(c.CREATOR);
        this.f1624j = parcel.createTypedArrayList(x0.CREATOR);
    }
}

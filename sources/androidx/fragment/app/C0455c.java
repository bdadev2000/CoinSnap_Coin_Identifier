package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.fragment.app.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0455c implements Parcelable {
    public static final Parcelable.Creator<C0455c> CREATOR = new E3.b(16);
    public final List b;

    /* renamed from: c, reason: collision with root package name */
    public final List f4710c;

    public C0455c(ArrayList arrayList, ArrayList arrayList2) {
        this.b = arrayList;
        this.f4710c = arrayList2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeStringList(this.b);
        parcel.writeTypedList(this.f4710c);
    }

    public C0455c(Parcel parcel) {
        this.b = parcel.createStringArrayList();
        this.f4710c = parcel.createTypedArrayList(C0453b.CREATOR);
    }
}

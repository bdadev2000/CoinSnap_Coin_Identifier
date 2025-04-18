package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new android.support.v4.media.a(10);

    /* renamed from: b, reason: collision with root package name */
    public final List f1592b;

    /* renamed from: c, reason: collision with root package name */
    public final List f1593c;

    public c(ArrayList arrayList, ArrayList arrayList2) {
        this.f1592b = arrayList;
        this.f1593c = arrayList2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f1592b);
        parcel.writeTypedList(this.f1593c);
    }

    public c(Parcel parcel) {
        this.f1592b = parcel.createStringArrayList();
        this.f1593c = parcel.createTypedArrayList(b.CREATOR);
    }
}

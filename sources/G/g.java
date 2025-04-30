package G;

import B3.i;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import b0.AbstractC0547b;

/* loaded from: classes.dex */
public final class g extends AbstractC0547b {
    public static final Parcelable.Creator<g> CREATOR = new i(2);

    /* renamed from: d, reason: collision with root package name */
    public SparseArray f1239d;

    public g(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.f1239d = new SparseArray(readInt);
        for (int i9 = 0; i9 < readInt; i9++) {
            this.f1239d.append(iArr[i9], readParcelableArray[i9]);
        }
    }

    @Override // b0.AbstractC0547b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int i10;
        super.writeToParcel(parcel, i9);
        SparseArray sparseArray = this.f1239d;
        if (sparseArray != null) {
            i10 = sparseArray.size();
        } else {
            i10 = 0;
        }
        parcel.writeInt(i10);
        int[] iArr = new int[i10];
        Parcelable[] parcelableArr = new Parcelable[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = this.f1239d.keyAt(i11);
            parcelableArr[i11] = (Parcelable) this.f1239d.valueAt(i11);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i9);
    }
}

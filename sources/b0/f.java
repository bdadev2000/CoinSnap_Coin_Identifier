package b0;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.appcompat.widget.j3;

/* loaded from: classes.dex */
public final class f extends w0.b {
    public static final Parcelable.Creator<f> CREATOR = new j3(2);

    /* renamed from: d, reason: collision with root package name */
    public SparseArray f2266d;

    public f(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.f2266d = new SparseArray(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f2266d.append(iArr[i10], readParcelableArray[i10]);
        }
    }

    @Override // w0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11;
        parcel.writeParcelable(this.f26666b, i10);
        SparseArray sparseArray = this.f2266d;
        if (sparseArray != null) {
            i11 = sparseArray.size();
        } else {
            i11 = 0;
        }
        parcel.writeInt(i11);
        int[] iArr = new int[i11];
        Parcelable[] parcelableArr = new Parcelable[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            iArr[i12] = this.f2266d.keyAt(i12);
            parcelableArr[i12] = (Parcelable) this.f2266d.valueAt(i12);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i10);
    }

    public f(Parcelable parcelable) {
        super(parcelable);
    }
}

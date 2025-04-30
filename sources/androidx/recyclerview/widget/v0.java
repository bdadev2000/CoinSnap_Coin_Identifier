package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class v0 implements Parcelable {
    public static final Parcelable.Creator<v0> CREATOR = new E3.b(21);
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int f5100c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f5101d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5102f;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.b + ", mGapDir=" + this.f5100c + ", mHasUnwantedGapAfter=" + this.f5102f + ", mGapPerSpan=" + Arrays.toString(this.f5101d) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.f5100c);
        parcel.writeInt(this.f5102f ? 1 : 0);
        int[] iArr = this.f5101d;
        if (iArr != null && iArr.length > 0) {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f5101d);
        } else {
            parcel.writeInt(0);
        }
    }
}

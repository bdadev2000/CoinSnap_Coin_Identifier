package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public final class u1 implements Parcelable {
    public static final Parcelable.Creator<u1> CREATOR = new android.support.v4.media.a(15);

    /* renamed from: b, reason: collision with root package name */
    public int f2045b;

    /* renamed from: c, reason: collision with root package name */
    public int f2046c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f2047d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2048f;

    public u1(Parcel parcel) {
        this.f2045b = parcel.readInt();
        this.f2046c = parcel.readInt();
        this.f2048f = parcel.readInt() == 1;
        int readInt = parcel.readInt();
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            this.f2047d = iArr;
            parcel.readIntArray(iArr);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f2045b + ", mGapDir=" + this.f2046c + ", mHasUnwantedGapAfter=" + this.f2048f + ", mGapPerSpan=" + Arrays.toString(this.f2047d) + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f2045b);
        parcel.writeInt(this.f2046c);
        parcel.writeInt(this.f2048f ? 1 : 0);
        int[] iArr = this.f2047d;
        if (iArr != null && iArr.length > 0) {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f2047d);
        } else {
            parcel.writeInt(0);
        }
    }

    public u1() {
    }
}

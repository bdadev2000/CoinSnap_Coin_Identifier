package com.glority.camera;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.SparseArrayCompat;

/* loaded from: classes6.dex */
public class AspectRatio implements Comparable<AspectRatio>, Parcelable {
    private final int mX;
    private final int mY;
    private static SparseArrayCompat<SparseArrayCompat<AspectRatio>> sCache = new SparseArrayCompat<>();
    public static final AspectRatio DEFAULT_RATIO = Of(16, 9);
    public static final Parcelable.Creator<AspectRatio> CREATOR = new Parcelable.Creator<AspectRatio>() { // from class: com.glority.camera.AspectRatio.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AspectRatio createFromParcel(Parcel parcel) {
            return AspectRatio.Of(parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AspectRatio[] newArray(int i) {
            return new AspectRatio[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public static AspectRatio Of(int i, int i2) {
        int gcd = gcd(i, i2);
        int i3 = i / gcd;
        int i4 = i2 / gcd;
        SparseArrayCompat<AspectRatio> sparseArrayCompat = sCache.get(i3);
        if (sparseArrayCompat == null) {
            AspectRatio aspectRatio = new AspectRatio(i3, i4);
            SparseArrayCompat<AspectRatio> sparseArrayCompat2 = new SparseArrayCompat<>();
            sparseArrayCompat2.put(i4, aspectRatio);
            sCache.put(i3, sparseArrayCompat2);
            return aspectRatio;
        }
        AspectRatio aspectRatio2 = sparseArrayCompat.get(i4);
        if (aspectRatio2 != null) {
            return aspectRatio2;
        }
        AspectRatio aspectRatio3 = new AspectRatio(i3, i4);
        sparseArrayCompat.put(i4, aspectRatio3);
        return aspectRatio3;
    }

    private AspectRatio(int i, int i2) {
        this.mX = i;
        this.mY = i2;
    }

    public int getX() {
        return this.mX;
    }

    public int getY() {
        return this.mY;
    }

    public int hashCode() {
        int i = this.mY;
        int i2 = this.mX;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AspectRatio)) {
            return false;
        }
        AspectRatio aspectRatio = (AspectRatio) obj;
        return this.mX == aspectRatio.mX && this.mY == aspectRatio.mY;
    }

    public float toFloat() {
        return this.mX / this.mY;
    }

    public String toString() {
        return this.mX + ":" + this.mY;
    }

    @Override // java.lang.Comparable
    public int compareTo(AspectRatio aspectRatio) {
        if (equals(aspectRatio)) {
            return 0;
        }
        return toFloat() > aspectRatio.toFloat() ? 1 : -1;
    }

    public AspectRatio inverse() {
        return Of(this.mY, this.mX);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mX);
        parcel.writeInt(this.mY);
    }

    public boolean matches(Size size) {
        int gcd = gcd(size.getWidth(), size.getHeight());
        return this.mX == size.getWidth() / gcd && this.mY == size.getHeight() / gcd;
    }

    private static int gcd(int i, int i2) {
        return i2 == 0 ? i : gcd(i2, i % i2);
    }
}

package com.google.android.gms.common.images;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class Size {
    private final int zaa;
    private final int zab;

    public Size(int i9, int i10) {
        this.zaa = i9;
        this.zab = i10;
    }

    @NonNull
    public static Size parseSize(@NonNull String str) throws NumberFormatException {
        if (str != null) {
            int indexOf = str.indexOf(42);
            if (indexOf < 0) {
                indexOf = str.indexOf(120);
            }
            if (indexOf >= 0) {
                try {
                    return new Size(Integer.parseInt(str.substring(0, indexOf)), Integer.parseInt(str.substring(indexOf + 1)));
                } catch (NumberFormatException unused) {
                    throw zaa(str);
                }
            }
            throw zaa(str);
        }
        throw new IllegalArgumentException("string must not be null");
    }

    private static NumberFormatException zaa(String str) {
        throw new NumberFormatException(AbstractC2914a.e("Invalid Size: \"", str, "\""));
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            if (this.zaa == size.zaa && this.zab == size.zab) {
                return true;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.zab;
    }

    public int getWidth() {
        return this.zaa;
    }

    public int hashCode() {
        int i9 = this.zaa;
        return ((i9 >>> 16) | (i9 << 16)) ^ this.zab;
    }

    @NonNull
    public String toString() {
        return this.zaa + "x" + this.zab;
    }
}

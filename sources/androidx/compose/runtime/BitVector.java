package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes3.dex */
public final class BitVector {
    public static boolean a(int i2) {
        if (i2 >= 0 && i2 < 128) {
            return false;
        }
        throw new IllegalStateException(("Index " + i2 + " out of bound").toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitVector [");
        for (int i2 = 0; i2 < 128; i2++) {
            a(i2);
        }
        sb.append(']');
        String sb2 = sb.toString();
        p0.a.r(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}

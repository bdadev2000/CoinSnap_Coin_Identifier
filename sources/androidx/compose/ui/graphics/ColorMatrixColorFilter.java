package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import java.util.Arrays;

@Immutable
/* loaded from: classes3.dex */
public final class ColorMatrixColorFilter extends ColorFilter {

    /* renamed from: b, reason: collision with root package name */
    public float[] f14966b;

    public final float[] a() {
        float[] fArr = this.f14966b;
        if (fArr != null) {
            return fArr;
        }
        android.graphics.ColorFilter colorFilter = this.f14965a;
        if (!(colorFilter instanceof android.graphics.ColorMatrixColorFilter)) {
            throw new IllegalArgumentException("Unable to obtain ColorMatrix from Android ColorMatrixColorFilter. This method was invoked on an unsupported Android version");
        }
        float[] a2 = ColorMatrixFilterHelper.f14967a.a((android.graphics.ColorMatrixColorFilter) colorFilter);
        this.f14966b = a2;
        return a2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ColorMatrixColorFilter) && Arrays.equals(a(), ((ColorMatrixColorFilter) obj).a());
    }

    public final int hashCode() {
        float[] fArr = this.f14966b;
        if (fArr != null) {
            return Arrays.hashCode(fArr);
        }
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ColorMatrixColorFilter(colorMatrix=");
        float[] fArr = this.f14966b;
        if (fArr == null) {
            str = "null";
        } else {
            str = "ColorMatrix(values=" + Arrays.toString(fArr) + ')';
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }
}

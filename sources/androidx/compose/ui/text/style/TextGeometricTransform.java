package androidx.compose.ui.text.style;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes3.dex */
public final class TextGeometricTransform {

    /* renamed from: c, reason: collision with root package name */
    public static final TextGeometricTransform f17471c = new TextGeometricTransform(1.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f17472a;

    /* renamed from: b, reason: collision with root package name */
    public final float f17473b;

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    public TextGeometricTransform(float f2, float f3) {
        this.f17472a = f2;
        this.f17473b = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextGeometricTransform)) {
            return false;
        }
        TextGeometricTransform textGeometricTransform = (TextGeometricTransform) obj;
        return this.f17472a == textGeometricTransform.f17472a && this.f17473b == textGeometricTransform.f17473b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f17473b) + (Float.hashCode(this.f17472a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.f17472a);
        sb.append(", skewX=");
        return d.n(sb, this.f17473b, ')');
    }
}

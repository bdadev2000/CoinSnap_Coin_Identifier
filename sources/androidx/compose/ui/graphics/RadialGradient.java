package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;

@Immutable
/* loaded from: classes.dex */
public final class RadialGradient extends ShaderBrush {
    @Override // androidx.compose.ui.graphics.ShaderBrush
    public final Shader b(long j2) {
        float g2;
        float h2;
        if (OffsetKt.d(0L)) {
            long b2 = SizeKt.b(j2);
            g2 = Offset.g(b2);
            h2 = Offset.h(b2);
        } else {
            g2 = Offset.g(0L) == Float.POSITIVE_INFINITY ? Size.d(j2) : Offset.g(0L);
            h2 = Offset.h(0L) == Float.POSITIVE_INFINITY ? Size.b(j2) : Offset.h(0L);
        }
        OffsetKt.a(g2, h2);
        AndroidShader_androidKt.a(null, null);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RadialGradient)) {
            return false;
        }
        RadialGradient radialGradient = (RadialGradient) obj;
        radialGradient.getClass();
        if (!p0.a.g(null, null)) {
            return false;
        }
        radialGradient.getClass();
        if (!p0.a.g(null, null)) {
            return false;
        }
        radialGradient.getClass();
        if (!Offset.d(0L, 0L)) {
            return false;
        }
        radialGradient.getClass();
        radialGradient.getClass();
        return TileMode.a(0, 0);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        String str;
        String str2 = "";
        if (OffsetKt.c(0L)) {
            str = "center=" + ((Object) Offset.m(0L)) + ", ";
        } else {
            str = "";
        }
        if (!Float.isInfinite(0.0f) && !Float.isNaN(0.0f)) {
            str2 = "radius=0.0, ";
        }
        return "RadialGradient(colors=null, stops=null, " + str + str2 + "tileMode=" + ((Object) TileMode.b(0)) + ')';
    }
}

package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;

@Immutable
/* loaded from: classes2.dex */
public final class SweepGradient extends ShaderBrush {
    @Override // androidx.compose.ui.graphics.ShaderBrush
    public final Shader b(long j2) {
        if (OffsetKt.d(0L)) {
            SizeKt.b(j2);
        } else {
            OffsetKt.a(Offset.g(0L) == Float.POSITIVE_INFINITY ? Size.d(j2) : Offset.g(0L), Offset.h(0L) == Float.POSITIVE_INFINITY ? Size.b(j2) : Offset.h(0L));
        }
        AndroidShader_androidKt.a(null, null);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SweepGradient)) {
            return false;
        }
        SweepGradient sweepGradient = (SweepGradient) obj;
        sweepGradient.getClass();
        if (!Offset.d(0L, 0L)) {
            return false;
        }
        sweepGradient.getClass();
        if (!p0.a.g(null, null)) {
            return false;
        }
        sweepGradient.getClass();
        return p0.a.g(null, null);
    }

    public final int hashCode() {
        Long.hashCode(0L);
        throw null;
    }

    public final String toString() {
        String str;
        if (OffsetKt.c(0L)) {
            str = "center=" + ((Object) Offset.m(0L)) + ", ";
        } else {
            str = "";
        }
        return androidx.compose.foundation.text.input.a.A("SweepGradient(", str, "colors=null, stops=null)");
    }
}

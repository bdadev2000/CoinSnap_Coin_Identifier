package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Offset;

@Immutable
/* loaded from: classes2.dex */
public final class OffsetEffect extends RenderEffect {
    @Override // androidx.compose.ui.graphics.RenderEffect
    public final android.graphics.RenderEffect b() {
        return RenderEffectVerificationHelper.f15016a.b(null, 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffsetEffect)) {
            return false;
        }
        OffsetEffect offsetEffect = (OffsetEffect) obj;
        offsetEffect.getClass();
        if (!p0.a.g(null, null)) {
            return false;
        }
        offsetEffect.getClass();
        return Offset.d(0L, 0L);
    }

    public final int hashCode() {
        return Long.hashCode(0L);
    }

    public final String toString() {
        return "OffsetEffect(renderEffect=null, offset=" + ((Object) Offset.m(0L)) + ')';
    }
}

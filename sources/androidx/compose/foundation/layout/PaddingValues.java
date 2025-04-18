package androidx.compose.foundation.layout;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;

@Stable
/* loaded from: classes2.dex */
public interface PaddingValues {

    @Immutable
    /* loaded from: classes2.dex */
    public static final class Absolute implements PaddingValues {
        @Override // androidx.compose.foundation.layout.PaddingValues
        public final float a() {
            return 0.0f;
        }

        @Override // androidx.compose.foundation.layout.PaddingValues
        public final float b(LayoutDirection layoutDirection) {
            return 0.0f;
        }

        @Override // androidx.compose.foundation.layout.PaddingValues
        public final float c(LayoutDirection layoutDirection) {
            return 0.0f;
        }

        @Override // androidx.compose.foundation.layout.PaddingValues
        public final float d() {
            return 0.0f;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Absolute)) {
                return false;
            }
            Absolute absolute = (Absolute) obj;
            absolute.getClass();
            if (!Dp.a(0.0f, 0.0f)) {
                return false;
            }
            absolute.getClass();
            if (!Dp.a(0.0f, 0.0f)) {
                return false;
            }
            absolute.getClass();
            if (!Dp.a(0.0f, 0.0f)) {
                return false;
            }
            absolute.getClass();
            return Dp.a(0.0f, 0.0f);
        }

        public final int hashCode() {
            return Float.hashCode(0.0f) + d.b(0.0f, d.b(0.0f, Float.hashCode(0.0f) * 31, 31), 31);
        }

        public final String toString() {
            return "PaddingValues.Absolute(left=" + ((Object) Dp.b(0.0f)) + ", top=" + ((Object) Dp.b(0.0f)) + ", right=" + ((Object) Dp.b(0.0f)) + ", bottom=" + ((Object) Dp.b(0.0f)) + ')';
        }
    }

    float a();

    float b(LayoutDirection layoutDirection);

    float c(LayoutDirection layoutDirection);

    float d();
}

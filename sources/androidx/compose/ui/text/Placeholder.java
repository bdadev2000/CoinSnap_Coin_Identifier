package androidx.compose.ui.text;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;

@Immutable
/* loaded from: classes3.dex */
public final class Placeholder {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Placeholder)) {
            return false;
        }
        ((Placeholder) obj).getClass();
        return TextUnit.a(0L, 0L) && TextUnit.a(0L, 0L) && PlaceholderVerticalAlign.a(0);
    }

    public final int hashCode() {
        TextUnitType[] textUnitTypeArr = TextUnit.f17498b;
        return Integer.hashCode(0) + d.d(0L, Long.hashCode(0L) * 31, 31);
    }

    public final String toString() {
        return "Placeholder(width=" + ((Object) TextUnit.d(0L)) + ", height=" + ((Object) TextUnit.d(0L)) + ", placeholderVerticalAlign=" + ((Object) PlaceholderVerticalAlign.b()) + ')';
    }
}

package androidx.compose.foundation.text.selection;

import android.support.v4.media.d;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;

@Immutable
/* loaded from: classes2.dex */
public final class TextSelectionColors {

    /* renamed from: a, reason: collision with root package name */
    public final long f7358a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7359b;

    public TextSelectionColors(long j2, long j3) {
        this.f7358a = j2;
        this.f7359b = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextSelectionColors)) {
            return false;
        }
        TextSelectionColors textSelectionColors = (TextSelectionColors) obj;
        return Color.c(this.f7358a, textSelectionColors.f7358a) && Color.c(this.f7359b, textSelectionColors.f7359b);
    }

    public final int hashCode() {
        int i2 = Color.f14963j;
        return Long.hashCode(this.f7359b) + (Long.hashCode(this.f7358a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        d.z(this.f7358a, sb, ", selectionBackgroundColor=");
        sb.append((Object) Color.i(this.f7359b));
        sb.append(')');
        return sb.toString();
    }
}

package androidx.compose.foundation.text.input.internal.selection;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.text.style.ResolvedTextDirection;

@StabilityInferred
/* loaded from: classes2.dex */
public final class TextFieldHandleState {
    public static final TextFieldHandleState e = new TextFieldHandleState(false, 9205357640488583168L, ResolvedTextDirection.f17460a, false);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6687a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6688b;

    /* renamed from: c, reason: collision with root package name */
    public final ResolvedTextDirection f6689c;
    public final boolean d;

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    public TextFieldHandleState(boolean z2, long j2, ResolvedTextDirection resolvedTextDirection, boolean z3) {
        this.f6687a = z2;
        this.f6688b = j2;
        this.f6689c = resolvedTextDirection;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldHandleState)) {
            return false;
        }
        TextFieldHandleState textFieldHandleState = (TextFieldHandleState) obj;
        return this.f6687a == textFieldHandleState.f6687a && Offset.d(this.f6688b, textFieldHandleState.f6688b) && this.f6689c == textFieldHandleState.f6689c && this.d == textFieldHandleState.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.f6689c.hashCode() + d.d(this.f6688b, Boolean.hashCode(this.f6687a) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextFieldHandleState(visible=");
        sb.append(this.f6687a);
        sb.append(", position=");
        sb.append((Object) Offset.m(this.f6688b));
        sb.append(", direction=");
        sb.append(this.f6689c);
        sb.append(", handlesCrossed=");
        return d.s(sb, this.d, ')');
    }
}

package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import com.google.android.gms.common.api.Api;
import p0.a;

/* loaded from: classes3.dex */
public final class LayoutUtilsKt {
    public static final long a(long j2, boolean z2, int i2, float f2) {
        int i3 = ((z2 || TextOverflow.a(i2, 2)) && Constraints.e(j2)) ? Constraints.i(j2) : Api.BaseClientBuilder.API_PRIORITY_OTHER;
        if (Constraints.k(j2) != i3) {
            i3 = a.A(TextDelegateKt.a(f2), Constraints.k(j2), i3);
        }
        return Constraints.Companion.b(0, i3, 0, Constraints.h(j2));
    }
}

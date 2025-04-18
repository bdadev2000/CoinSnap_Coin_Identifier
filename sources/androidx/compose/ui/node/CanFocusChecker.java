package androidx.compose.ui.node;

import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.internal.InlineClassHelperKt;

/* loaded from: classes.dex */
final class CanFocusChecker implements FocusProperties {

    /* renamed from: a, reason: collision with root package name */
    public static final CanFocusChecker f15892a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f15893b;

    @Override // androidx.compose.ui.focus.FocusProperties
    public final void b(boolean z2) {
        f15893b = Boolean.valueOf(z2);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public final boolean c() {
        Boolean bool = f15893b;
        if (bool != null) {
            return bool.booleanValue();
        }
        InlineClassHelperKt.c("canFocus is read before it is written");
        throw null;
    }
}

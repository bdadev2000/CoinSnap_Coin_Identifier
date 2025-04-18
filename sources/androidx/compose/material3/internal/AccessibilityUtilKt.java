package androidx.compose.material3.internal;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;

/* loaded from: classes3.dex */
public final class AccessibilityUtilKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f12776a;

    /* renamed from: b, reason: collision with root package name */
    public static final Modifier f12777b;

    static {
        float f2 = 10;
        f12776a = f2;
        f12777b = PaddingKt.h(SemanticsModifierKt.b(LayoutModifierKt.a(Modifier.Companion.f14687a, AccessibilityUtilKt$IncreaseHorizontalSemanticsBounds$1.f12778a), true, AccessibilityUtilKt$IncreaseHorizontalSemanticsBounds$2.f12781a), f2, 0.0f, 2);
    }
}

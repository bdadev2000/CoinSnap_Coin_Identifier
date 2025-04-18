package androidx.compose.material3.carousel;

import androidx.compose.ui.util.MathHelpersKt;

/* loaded from: classes4.dex */
public final class KeylineListKt {
    public static final Keyline a(Keyline keyline, Keyline keyline2, float f2) {
        return new Keyline(MathHelpersKt.b(keyline.f12721a, keyline2.f12721a, f2), MathHelpersKt.b(keyline.f12722b, keyline2.f12722b, f2), MathHelpersKt.b(keyline.f12723c, keyline2.f12723c, f2), f2 < 0.5f ? keyline.d : keyline2.d, f2 < 0.5f ? keyline.e : keyline2.e, f2 < 0.5f ? keyline.f12724f : keyline2.f12724f, MathHelpersKt.b(keyline.f12725g, keyline2.f12725g, f2));
    }
}

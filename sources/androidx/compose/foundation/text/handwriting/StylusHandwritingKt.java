package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.ui.Modifier;
import q0.a;

/* loaded from: classes3.dex */
public final class StylusHandwritingKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f6275a = 40;

    /* renamed from: b, reason: collision with root package name */
    public static final float f6276b = 10;

    public static final Modifier a(a aVar, boolean z2) {
        Modifier.Companion companion = Modifier.Companion.f14687a;
        return (z2 && StylusHandwriting_androidKt.f6290a) ? PaddingKt.g(new StylusHandwritingElementWithNegativePadding(aVar), f6276b, f6275a) : companion;
    }
}

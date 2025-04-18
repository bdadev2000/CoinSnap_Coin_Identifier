package androidx.compose.foundation;

import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;

/* loaded from: classes4.dex */
final class IndicationModifier implements DrawModifier {

    /* renamed from: a, reason: collision with root package name */
    public final IndicationInstance f2756a;

    public IndicationModifier(IndicationInstance indicationInstance) {
        this.f2756a = indicationInstance;
    }

    @Override // androidx.compose.ui.draw.DrawModifier
    public final void z(ContentDrawScope contentDrawScope) {
        this.f2756a.a(contentDrawScope);
    }
}

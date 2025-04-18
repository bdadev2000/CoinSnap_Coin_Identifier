package androidx.compose.material3;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import q0.p;

@StabilityInferred
/* loaded from: classes3.dex */
public final class TooltipScopeImpl implements TooltipScope {

    /* renamed from: a, reason: collision with root package name */
    public final q0.a f12557a;

    public TooltipScopeImpl(q0.a aVar) {
        this.f12557a = aVar;
    }

    @Override // androidx.compose.material3.TooltipScope
    public final Modifier a(p pVar) {
        return DrawModifierKt.c(Modifier.Companion.f14687a, new TooltipScopeImpl$drawCaret$1(pVar, this));
    }
}

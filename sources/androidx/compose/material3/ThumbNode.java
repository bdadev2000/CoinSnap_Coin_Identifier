package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.material3.tokens.SwitchTokens;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import e0.x;
import kotlin.jvm.internal.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ThumbNode extends Modifier.Node implements LayoutModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public InteractionSource f12290o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f12291p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f12292q;

    /* renamed from: r, reason: collision with root package name */
    public Animatable f12293r;

    /* renamed from: s, reason: collision with root package name */
    public Animatable f12294s;

    /* renamed from: t, reason: collision with root package name */
    public float f12295t;

    /* renamed from: u, reason: collision with root package name */
    public float f12296u;

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean T1() {
        return false;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void W1() {
        e.v(S1(), null, 0, new ThumbNode$onAttach$1(this, null), 3);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult m(MeasureScope measureScope, Measurable measurable, long j2) {
        float y1 = measureScope.y1(this.f12292q ? SwitchTokens.f13550a : ((measurable.s(Constraints.i(j2)) != 0 && measurable.S(Constraints.h(j2)) != 0) || this.f12291p) ? SwitchKt.f11688a : SwitchKt.f11689b);
        Animatable animatable = this.f12294s;
        int floatValue = (int) (animatable != null ? ((Number) animatable.d()).floatValue() : y1);
        Placeable V = measurable.V(Constraints.Companion.c(floatValue, floatValue));
        float y12 = measureScope.y1((SwitchKt.d - measureScope.I(y1)) / 2.0f);
        float y13 = measureScope.y1((SwitchKt.f11690c - SwitchKt.f11688a) - SwitchKt.e);
        boolean z2 = this.f12292q;
        if (z2 && this.f12291p) {
            y12 = y13 - measureScope.y1(SwitchTokens.e);
        } else if (z2 && !this.f12291p) {
            y12 = measureScope.y1(SwitchTokens.e);
        } else if (this.f12291p) {
            y12 = y13;
        }
        Animatable animatable2 = this.f12294s;
        if (!p0.a.f(animatable2 != null ? (Float) animatable2.e.getValue() : null, y1)) {
            e.v(S1(), null, 0, new ThumbNode$measure$1(this, y1, null), 3);
        }
        Animatable animatable3 = this.f12293r;
        if (!p0.a.f(animatable3 != null ? (Float) animatable3.e.getValue() : null, y12)) {
            e.v(S1(), null, 0, new ThumbNode$measure$2(this, y12, null), 3);
        }
        if (Float.isNaN(this.f12296u) && Float.isNaN(this.f12295t)) {
            this.f12296u = y1;
            this.f12295t = y12;
        }
        return measureScope.T(floatValue, floatValue, x.f30219a, new ThumbNode$measure$3(V, this, y12));
    }
}

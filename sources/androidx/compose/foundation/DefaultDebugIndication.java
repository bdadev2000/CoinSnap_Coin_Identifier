package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DrawModifierNode;
import kotlin.jvm.internal.e;

/* loaded from: classes3.dex */
final class DefaultDebugIndication implements IndicationNodeFactory {

    /* renamed from: a, reason: collision with root package name */
    public static final DefaultDebugIndication f2675a = new Object();

    /* loaded from: classes3.dex */
    public static final class DefaultDebugIndicationInstance extends Modifier.Node implements DrawModifierNode {

        /* renamed from: o, reason: collision with root package name */
        public final InteractionSource f2676o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f2677p;

        /* renamed from: q, reason: collision with root package name */
        public boolean f2678q;

        /* renamed from: r, reason: collision with root package name */
        public boolean f2679r;

        public DefaultDebugIndicationInstance(InteractionSource interactionSource) {
            this.f2676o = interactionSource;
        }

        @Override // androidx.compose.ui.Modifier.Node
        public final void W1() {
            e.v(S1(), null, 0, new DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1(this, null), 3);
        }

        @Override // androidx.compose.ui.node.DrawModifierNode
        public final void z(ContentDrawScope contentDrawScope) {
            contentDrawScope.P1();
            if (this.f2677p) {
                DrawScope.R0(contentDrawScope, Color.b(Color.f14957b, 0.3f), 0L, contentDrawScope.b(), 0.0f, null, 122);
            } else if (this.f2678q || this.f2679r) {
                DrawScope.R0(contentDrawScope, Color.b(Color.f14957b, 0.1f), 0L, contentDrawScope.b(), 0.0f, null, 122);
            }
        }
    }

    @Override // androidx.compose.foundation.IndicationNodeFactory
    public final DelegatableNode b(InteractionSource interactionSource) {
        return new DefaultDebugIndicationInstance(interactionSource);
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return -1;
    }
}

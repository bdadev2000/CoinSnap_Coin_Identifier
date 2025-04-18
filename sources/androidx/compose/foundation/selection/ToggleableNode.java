package androidx.compose.foundation.selection;

import androidx.compose.foundation.ClickableNode;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.state.ToggleableState;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;
import q0.l;
import x0.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ToggleableNode extends ClickableNode {
    public boolean I;
    public l J;
    public final a K;

    /* renamed from: androidx.compose.foundation.selection.ToggleableNode$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass1 extends r implements a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f5378a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f5379b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z2, l lVar) {
            super(0);
            this.f5378a = lVar;
            this.f5379b = z2;
        }

        @Override // q0.a
        public final Object invoke() {
            this.f5378a.invoke(Boolean.valueOf(!this.f5379b));
            return b0.f30125a;
        }
    }

    public ToggleableNode(boolean z2, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z3, Role role, l lVar) {
        super(mutableInteractionSource, indicationNodeFactory, z3, null, role, new AnonymousClass1(z2, lVar));
        this.I = z2;
        this.J = lVar;
        this.K = new ToggleableNode$_onClick$1(this);
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public final void h2(SemanticsConfiguration semanticsConfiguration) {
        ToggleableState toggleableState = this.I ? ToggleableState.f16872a : ToggleableState.f16873b;
        n[] nVarArr = SemanticsPropertiesKt.f16865a;
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.C;
        n nVar = SemanticsPropertiesKt.f16865a[22];
        semanticsPropertyKey.getClass();
        semanticsConfiguration.b(semanticsPropertyKey, toggleableState);
    }
}

package androidx.compose.foundation.content;

import androidx.compose.foundation.content.internal.DragAndDropRequestPermission_androidKt;
import androidx.compose.foundation.content.internal.DynamicReceiveContentConfiguration;
import androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt;
import androidx.compose.foundation.content.internal.ReceiveContentDragAndDropNode_androidKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.modifier.SingleLocalMap;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

@StabilityInferred
/* loaded from: classes4.dex */
public final class ReceiveContentNode extends DelegatingNode implements ModifierLocalModifierNode, CompositionLocalConsumerModifierNode {

    /* renamed from: q, reason: collision with root package name */
    public ReceiveContentListener f2891q = null;

    /* renamed from: r, reason: collision with root package name */
    public final SingleLocalMap f2892r;

    /* renamed from: androidx.compose.foundation.content.ReceiveContentNode$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass1 extends r implements l {
        public AnonymousClass1() {
            super(1);
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            DragAndDropRequestPermission_androidKt.a(ReceiveContentNode.this, (DragAndDropEvent) obj);
            return b0.f30125a;
        }
    }

    public ReceiveContentNode() {
        DynamicReceiveContentConfiguration dynamicReceiveContentConfiguration = new DynamicReceiveContentConfiguration(this);
        ProvidableModifierLocal providableModifierLocal = ReceiveContentConfigurationKt.f2899a;
        SingleLocalMap singleLocalMap = new SingleLocalMap(providableModifierLocal);
        singleLocalMap.c(providableModifierLocal, dynamicReceiveContentConfiguration);
        this.f2892r = singleLocalMap;
        e2(ReceiveContentDragAndDropNode_androidKt.a(dynamicReceiveContentConfiguration, new AnonymousClass1()));
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public final ModifierLocalMap n0() {
        return this.f2892r;
    }
}

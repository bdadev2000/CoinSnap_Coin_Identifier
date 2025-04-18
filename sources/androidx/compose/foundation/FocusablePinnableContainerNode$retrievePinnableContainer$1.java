package androidx.compose.foundation;

import androidx.compose.ui.layout.PinnableContainerKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import d0.b0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.r;
import q0.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class FocusablePinnableContainerNode$retrievePinnableContainer$1 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f2718a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FocusablePinnableContainerNode f2719b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusablePinnableContainerNode$retrievePinnableContainer$1(f0 f0Var, FocusablePinnableContainerNode focusablePinnableContainerNode) {
        super(0);
        this.f2718a = f0Var;
        this.f2719b = focusablePinnableContainerNode;
    }

    @Override // q0.a
    public final Object invoke() {
        this.f2718a.f30930a = CompositionLocalConsumerModifierNodeKt.a(this.f2719b, PinnableContainerKt.f15823a);
        return b0.f30125a;
    }
}

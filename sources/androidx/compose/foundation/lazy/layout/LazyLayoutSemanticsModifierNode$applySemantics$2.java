package androidx.compose.foundation.lazy.layout;

import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes3.dex */
final class LazyLayoutSemanticsModifierNode$applySemantics$2 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LazyLayoutSemanticsModifierNode f4853a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutSemanticsModifierNode$applySemantics$2(LazyLayoutSemanticsModifierNode lazyLayoutSemanticsModifierNode) {
        super(0);
        this.f4853a = lazyLayoutSemanticsModifierNode;
    }

    @Override // q0.a
    public final Object invoke() {
        LazyLayoutSemanticsModifierNode lazyLayoutSemanticsModifierNode = this.f4853a;
        return Float.valueOf(lazyLayoutSemanticsModifierNode.f4846p.d() - lazyLayoutSemanticsModifierNode.f4846p.a());
    }
}

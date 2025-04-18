package androidx.compose.foundation;

import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes.dex */
final class ScrollSemanticsModifierNode$applySemantics$accessibilityScrollState$1 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ScrollSemanticsModifierNode f2862a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollSemanticsModifierNode$applySemantics$accessibilityScrollState$1(ScrollSemanticsModifierNode scrollSemanticsModifierNode) {
        super(0);
        this.f2862a = scrollSemanticsModifierNode;
    }

    @Override // q0.a
    public final Object invoke() {
        return Float.valueOf(this.f2862a.f2858o.f2865a.g());
    }
}

package androidx.compose.foundation;

import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes.dex */
final class ScrollSemanticsModifierNode$applySemantics$accessibilityScrollState$2 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ScrollSemanticsModifierNode f2863a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollSemanticsModifierNode$applySemantics$accessibilityScrollState$2(ScrollSemanticsModifierNode scrollSemanticsModifierNode) {
        super(0);
        this.f2863a = scrollSemanticsModifierNode;
    }

    @Override // q0.a
    public final Object invoke() {
        return Float.valueOf(this.f2863a.f2858o.d.g());
    }
}

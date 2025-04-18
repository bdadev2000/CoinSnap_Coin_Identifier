package androidx.compose.foundation;

import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes4.dex */
final class ClickableSemanticsNode$applySemantics$2 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClickableSemanticsNode f2654a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableSemanticsNode$applySemantics$2(ClickableSemanticsNode clickableSemanticsNode) {
        super(0);
        this.f2654a = clickableSemanticsNode;
    }

    @Override // q0.a
    public final Object invoke() {
        a aVar = this.f2654a.f2652t;
        if (aVar != null) {
            aVar.invoke();
        }
        return Boolean.TRUE;
    }
}

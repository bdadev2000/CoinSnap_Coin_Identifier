package androidx.compose.foundation;

import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes.dex */
final class CombinedClickableNodeImpl$applyAdditionalSemantics$1 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CombinedClickableNodeImpl f2668a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombinedClickableNodeImpl$applyAdditionalSemantics$1(CombinedClickableNodeImpl combinedClickableNodeImpl) {
        super(0);
        this.f2668a = combinedClickableNodeImpl;
    }

    @Override // q0.a
    public final Object invoke() {
        a aVar = this.f2668a.J;
        if (aVar != null) {
            aVar.invoke();
        }
        return Boolean.TRUE;
    }
}

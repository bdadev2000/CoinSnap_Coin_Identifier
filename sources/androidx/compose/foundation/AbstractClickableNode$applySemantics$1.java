package androidx.compose.foundation;

import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes.dex */
final class AbstractClickableNode$applySemantics$1 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractClickableNode f2415a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$applySemantics$1(AbstractClickableNode abstractClickableNode) {
        super(0);
        this.f2415a = abstractClickableNode;
    }

    @Override // q0.a
    public final Object invoke() {
        this.f2415a.f2412v.invoke();
        return Boolean.TRUE;
    }
}

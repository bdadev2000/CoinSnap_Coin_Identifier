package androidx.compose.ui.layout;

import androidx.compose.runtime.CompositionContext;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes2.dex */
final class SubcomposeLayoutState$setCompositionContext$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SubcomposeLayoutState f15853a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubcomposeLayoutState$setCompositionContext$1(SubcomposeLayoutState subcomposeLayoutState) {
        super(2);
        this.f15853a = subcomposeLayoutState;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        this.f15853a.a().f15752b = (CompositionContext) obj2;
        return b0.f30125a;
    }
}

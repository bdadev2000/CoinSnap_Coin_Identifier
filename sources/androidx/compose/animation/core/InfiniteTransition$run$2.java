package androidx.compose.animation.core;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class InfiniteTransition$run$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InfiniteTransition f2119a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2120b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfiniteTransition$run$2(InfiniteTransition infiniteTransition, int i2) {
        super(2);
        this.f2119a = infiniteTransition;
        this.f2120b = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.f2120b | 1);
        this.f2119a.a((Composer) obj, a2);
        return b0.f30125a;
    }
}

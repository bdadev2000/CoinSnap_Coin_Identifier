package androidx.compose.animation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class SharedTransitionScopeKt$SharedTransitionScope$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0.r f1941a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1942b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedTransitionScopeKt$SharedTransitionScope$2(q0.r rVar, int i2) {
        super(2);
        this.f1941a = rVar;
        this.f1942b = i2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a2 = RecomposeScopeImplKt.a(this.f1942b | 1);
        SharedTransitionScopeKt.a(this.f1941a, (Composer) obj, a2);
        return b0.f30125a;
    }
}

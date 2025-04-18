package androidx.compose.material3;

import androidx.compose.animation.core.AnimationScope;
import d0.b0;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class AppBarKt$settleAppBar$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f7870a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TopAppBarState f7871b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f7872c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$settleAppBar$2(c0 c0Var, TopAppBarState topAppBarState, c0 c0Var2) {
        super(1);
        this.f7870a = c0Var;
        this.f7871b = topAppBarState;
        this.f7872c = c0Var2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        AnimationScope animationScope = (AnimationScope) obj;
        float floatValue = ((Number) animationScope.e.getValue()).floatValue();
        c0 c0Var = this.f7870a;
        float f2 = floatValue - c0Var.f30922a;
        TopAppBarState topAppBarState = this.f7871b;
        float c2 = topAppBarState.f12611c.c();
        topAppBarState.b(c2 + f2);
        float abs = Math.abs(c2 - topAppBarState.f12611c.c());
        c0Var.f30922a = ((Number) animationScope.e.getValue()).floatValue();
        this.f7872c.f30922a = ((Number) animationScope.b()).floatValue();
        if (Math.abs(f2 - abs) > 0.5f) {
            animationScope.a();
        }
        return b0.f30125a;
    }
}

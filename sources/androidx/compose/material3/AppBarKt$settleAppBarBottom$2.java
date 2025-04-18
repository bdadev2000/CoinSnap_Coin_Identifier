package androidx.compose.material3;

import androidx.compose.animation.core.AnimationScope;
import d0.b0;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class AppBarKt$settleAppBarBottom$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f7878a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BottomAppBarState f7879b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f7880c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$settleAppBarBottom$2(c0 c0Var, BottomAppBarState bottomAppBarState, c0 c0Var2) {
        super(1);
        this.f7878a = c0Var;
        this.f7879b = bottomAppBarState;
        this.f7880c = c0Var2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        AnimationScope animationScope = (AnimationScope) obj;
        float floatValue = ((Number) animationScope.e.getValue()).floatValue();
        c0 c0Var = this.f7878a;
        float f2 = floatValue - c0Var.f30922a;
        BottomAppBarState bottomAppBarState = this.f7879b;
        float b2 = bottomAppBarState.b();
        bottomAppBarState.e(b2 + f2);
        float abs = Math.abs(b2 - bottomAppBarState.b());
        c0Var.f30922a = ((Number) animationScope.e.getValue()).floatValue();
        this.f7880c.f30922a = ((Number) animationScope.b()).floatValue();
        if (Math.abs(f2 - abs) > 0.5f) {
            animationScope.a();
        }
        return b0.f30125a;
    }
}

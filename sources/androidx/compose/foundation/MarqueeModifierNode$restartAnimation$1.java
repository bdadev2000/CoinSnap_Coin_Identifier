package androidx.compose.foundation;

import b1.d0;
import b1.h1;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.foundation.MarqueeModifierNode$restartAnimation$1", f = "BasicMarquee.kt", l = {349, 350}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class MarqueeModifierNode$restartAnimation$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f2799a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h1 f2800b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MarqueeModifierNode f2801c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarqueeModifierNode$restartAnimation$1(h1 h1Var, MarqueeModifierNode marqueeModifierNode, g gVar) {
        super(2, gVar);
        this.f2800b = h1Var;
        this.f2801c = marqueeModifierNode;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new MarqueeModifierNode$restartAnimation$1(this.f2800b, this.f2801c, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((MarqueeModifierNode$restartAnimation$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        Object G;
        a aVar = a.f30806a;
        int i2 = this.f2799a;
        b0 b0Var = b0.f30125a;
        if (i2 == 0) {
            q.m(obj);
            h1 h1Var = this.f2800b;
            if (h1Var != null) {
                this.f2799a = 1;
                if (h1Var.v(this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    q.m(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        this.f2799a = 2;
        MarqueeModifierNode marqueeModifierNode = this.f2801c;
        if (marqueeModifierNode.f2787o <= 0 || (G = kotlin.jvm.internal.e.G(this, FixedMotionDurationScale.f2700a, new MarqueeModifierNode$runAnimation$2(marqueeModifierNode, null))) != aVar) {
            G = b0Var;
        }
        return G == aVar ? aVar : b0Var;
    }
}

package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.node.DrawModifierNodeKt;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.objectweb.asm.Opcodes;
import q0.p;

@e(c = "androidx.compose.material.ripple.CommonRippleNode$addRipple$2", f = "CommonRipple.kt", l = {Opcodes.POP2}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class CommonRippleNode$addRipple$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f7396a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RippleAnimation f7397b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CommonRippleNode f7398c;
    public final /* synthetic */ PressInteraction.Press d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonRippleNode$addRipple$2(RippleAnimation rippleAnimation, CommonRippleNode commonRippleNode, PressInteraction.Press press, g gVar) {
        super(2, gVar);
        this.f7397b = rippleAnimation;
        this.f7398c = commonRippleNode;
        this.d = press;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new CommonRippleNode$addRipple$2(this.f7397b, this.f7398c, this.d, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((CommonRippleNode$addRipple$2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f7396a;
        PressInteraction.Press press = this.d;
        CommonRippleNode commonRippleNode = this.f7398c;
        try {
            if (i2 == 0) {
                q.m(obj);
                RippleAnimation rippleAnimation = this.f7397b;
                this.f7396a = 1;
                if (rippleAnimation.a(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.m(obj);
            }
            commonRippleNode.f7395y.i(press);
            DrawModifierNodeKt.a(commonRippleNode);
            return b0.f30125a;
        } catch (Throwable th) {
            commonRippleNode.f7395y.i(press);
            DrawModifierNodeKt.a(commonRippleNode);
            throw th;
        }
    }
}

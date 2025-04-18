package androidx.compose.material.ripple;

import h0.g;
import j0.c;
import j0.e;
import org.objectweb.asm.Opcodes;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.material.ripple.RippleAnimation", f = "RippleAnimation.kt", l = {77, Opcodes.IASTORE, Opcodes.LASTORE}, m = "animate")
/* loaded from: classes2.dex */
public final class RippleAnimation$animate$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public RippleAnimation f7420a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7421b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RippleAnimation f7422c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RippleAnimation$animate$1(RippleAnimation rippleAnimation, g gVar) {
        super(gVar);
        this.f7422c = rippleAnimation;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f7421b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f7422c.a(this);
    }
}

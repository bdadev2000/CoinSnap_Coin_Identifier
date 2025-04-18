package androidx.compose.animation.core;

import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.animation.core.Animatable$snapTo$2", f = "Animatable.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class Animatable$snapTo$2 extends i implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Animatable f2000a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2001b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Animatable$snapTo$2(Animatable animatable, Object obj, g gVar) {
        super(1, gVar);
        this.f2000a = animatable;
        this.f2001b = obj;
    }

    @Override // j0.a
    public final g create(g gVar) {
        return new Animatable$snapTo$2(this.f2000a, this.f2001b, gVar);
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Animatable$snapTo$2 animatable$snapTo$2 = (Animatable$snapTo$2) create((g) obj);
        b0 b0Var = b0.f30125a;
        animatable$snapTo$2.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        q.m(obj);
        Animatable animatable = this.f2000a;
        Animatable.b(animatable);
        Object a2 = Animatable.a(animatable, this.f2001b);
        animatable.f1983c.f2035b.setValue(a2);
        animatable.e.setValue(a2);
        return b0.f30125a;
    }
}

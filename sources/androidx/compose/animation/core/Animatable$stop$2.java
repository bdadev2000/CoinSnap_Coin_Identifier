package androidx.compose.animation.core;

import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.animation.core.Animatable$stop$2", f = "Animatable.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class Animatable$stop$2 extends i implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Animatable f2002a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Animatable$stop$2(Animatable animatable, g gVar) {
        super(1, gVar);
        this.f2002a = animatable;
    }

    @Override // j0.a
    public final g create(g gVar) {
        return new Animatable$stop$2(this.f2002a, gVar);
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Animatable$stop$2 animatable$stop$2 = (Animatable$stop$2) create((g) obj);
        b0 b0Var = b0.f30125a;
        animatable$stop$2.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        q.m(obj);
        Animatable.b(this.f2002a);
        return b0.f30125a;
    }
}

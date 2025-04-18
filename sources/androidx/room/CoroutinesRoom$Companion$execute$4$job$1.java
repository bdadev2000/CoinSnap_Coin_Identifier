package androidx.room;

import b1.d0;
import b1.k;
import d0.b0;
import h0.g;
import j0.i;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.q;
import q0.p;

@j0.e(c = "androidx.room.CoroutinesRoom$Companion$execute$4$job$1", f = "CoroutinesRoom.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CoroutinesRoom$Companion$execute$4$job$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Callable f21247a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f21248b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesRoom$Companion$execute$4$job$1(Callable callable, k kVar, g gVar) {
        super(2, gVar);
        this.f21247a = callable;
        this.f21248b = kVar;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new CoroutinesRoom$Companion$execute$4$job$1(this.f21247a, this.f21248b, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        CoroutinesRoom$Companion$execute$4$job$1 coroutinesRoom$Companion$execute$4$job$1 = (CoroutinesRoom$Companion$execute$4$job$1) create((d0) obj, (g) obj2);
        b0 b0Var = b0.f30125a;
        coroutinesRoom$Companion$execute$4$job$1.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        k kVar = this.f21248b;
        i0.a aVar = i0.a.f30806a;
        q.m(obj);
        try {
            kVar.resumeWith(this.f21247a.call());
        } catch (Throwable th) {
            kVar.resumeWith(q.d(th));
        }
        return b0.f30125a;
    }
}

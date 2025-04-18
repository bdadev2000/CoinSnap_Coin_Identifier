package androidx.room;

import b1.d0;
import d0.b0;
import h0.g;
import j0.i;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.q;
import q0.p;

@j0.e(c = "androidx.room.CoroutinesRoom$Companion$execute$2", f = "CoroutinesRoom.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class CoroutinesRoom$Companion$execute$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Callable f21244a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesRoom$Companion$execute$2(Callable callable, g gVar) {
        super(2, gVar);
        this.f21244a = callable;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new CoroutinesRoom$Companion$execute$2(this.f21244a, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((CoroutinesRoom$Companion$execute$2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        q.m(obj);
        return this.f21244a.call();
    }
}

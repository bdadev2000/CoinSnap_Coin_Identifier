package androidx.lifecycle;

import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.objectweb.asm.Opcodes;
import q0.p;

@e(c = "androidx.lifecycle.LiveDataScopeImpl$emit$2", f = "CoroutineLiveData.kt", l = {Opcodes.DADD}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class LiveDataScopeImpl$emit$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f20041a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LiveDataScopeImpl f20042b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20043c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveDataScopeImpl$emit$2(LiveDataScopeImpl liveDataScopeImpl, Object obj, g gVar) {
        super(2, gVar);
        this.f20042b = liveDataScopeImpl;
        this.f20043c = obj;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new LiveDataScopeImpl$emit$2(this.f20042b, this.f20043c, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((LiveDataScopeImpl$emit$2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f20041a;
        LiveDataScopeImpl liveDataScopeImpl = this.f20042b;
        if (i2 == 0) {
            q.m(obj);
            CoroutineLiveData coroutineLiveData = liveDataScopeImpl.f20039a;
            this.f20041a = 1;
            if (coroutineLiveData.j(this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        liveDataScopeImpl.f20039a.h(this.f20043c);
        return b0.f30125a;
    }
}

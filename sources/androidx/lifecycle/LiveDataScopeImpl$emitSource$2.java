package androidx.lifecycle;

import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.objectweb.asm.Opcodes;
import q0.p;

@e(c = "androidx.lifecycle.LiveDataScopeImpl$emitSource$2", f = "CoroutineLiveData.kt", l = {Opcodes.DUP2_X2}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class LiveDataScopeImpl$emitSource$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f20044a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LiveDataScopeImpl f20045b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LiveData f20046c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveDataScopeImpl$emitSource$2(LiveDataScopeImpl liveDataScopeImpl, LiveData liveData, g gVar) {
        super(2, gVar);
        this.f20045b = liveDataScopeImpl;
        this.f20046c = liveData;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new LiveDataScopeImpl$emitSource$2(this.f20045b, this.f20046c, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((LiveDataScopeImpl$emitSource$2) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f20044a;
        if (i2 == 0) {
            q.m(obj);
            CoroutineLiveData coroutineLiveData = this.f20045b.f20039a;
            this.f20044a = 1;
            obj = coroutineLiveData.k(this.f20046c, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        return obj;
    }
}

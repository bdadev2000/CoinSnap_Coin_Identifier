package androidx.compose.ui.platform;

import d0.b0;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.q;

/* JADX INFO: Access modifiers changed from: package-private */
@j0.e(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2", f = "PlatformTextInputModifierNode.kt", l = {252}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ChainedPlatformTextInputInterceptor$textInputSession$2 extends j0.i implements q0.p {

    /* renamed from: a, reason: collision with root package name */
    public int f16407a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f16408b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q0.p f16409c;
    public final /* synthetic */ ChainedPlatformTextInputInterceptor d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChainedPlatformTextInputInterceptor$textInputSession$2(q0.p pVar, ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor, h0.g gVar) {
        super(2, gVar);
        this.f16409c = pVar;
        this.d = chainedPlatformTextInputInterceptor;
    }

    @Override // j0.a
    public final h0.g create(Object obj, h0.g gVar) {
        ChainedPlatformTextInputInterceptor$textInputSession$2 chainedPlatformTextInputInterceptor$textInputSession$2 = new ChainedPlatformTextInputInterceptor$textInputSession$2(this.f16409c, this.d, gVar);
        chainedPlatformTextInputInterceptor$textInputSession$2.f16408b = obj;
        return chainedPlatformTextInputInterceptor$textInputSession$2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((ChainedPlatformTextInputInterceptor$textInputSession$2) create((PlatformTextInputSessionScope) obj, (h0.g) obj2)).invokeSuspend(b0.f30125a);
        return i0.a.f30806a;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f16407a;
        if (i2 == 0) {
            q.m(obj);
            ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1 chainedPlatformTextInputInterceptor$textInputSession$2$scope$1 = new ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1((PlatformTextInputSessionScope) this.f16408b, new AtomicReference(null), this.d);
            this.f16407a = 1;
            if (this.f16409c.invoke(chainedPlatformTextInputInterceptor$textInputSession$2$scope$1, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        throw new RuntimeException();
    }
}

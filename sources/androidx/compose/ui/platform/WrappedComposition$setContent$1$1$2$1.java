package androidx.compose.ui.platform;

import b1.d0;
import d0.b0;
import kotlin.jvm.internal.q;
import org.objectweb.asm.Opcodes;

@j0.e(c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$2$1", f = "Wrapper.android.kt", l = {Opcodes.DCMPL}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class WrappedComposition$setContent$1$1$2$1 extends j0.i implements q0.p {

    /* renamed from: a, reason: collision with root package name */
    public int f16696a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WrappedComposition f16697b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrappedComposition$setContent$1$1$2$1(WrappedComposition wrappedComposition, h0.g gVar) {
        super(2, gVar);
        this.f16697b = wrappedComposition;
    }

    @Override // j0.a
    public final h0.g create(Object obj, h0.g gVar) {
        return new WrappedComposition$setContent$1$1$2$1(this.f16697b, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((WrappedComposition$setContent$1$1$2$1) create((d0) obj, (h0.g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f16696a;
        b0 b0Var = b0.f30125a;
        if (i2 == 0) {
            q.m(obj);
            AndroidComposeView androidComposeView = this.f16697b.f16686a;
            this.f16696a = 1;
            Object a2 = androidComposeView.f16222q.a(this);
            if (a2 != aVar) {
                a2 = b0Var;
            }
            if (a2 == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        return b0Var;
    }
}

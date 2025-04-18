package androidx.compose.ui.platform;

import b1.d0;
import d0.b0;
import kotlin.jvm.internal.q;
import org.objectweb.asm.Opcodes;

@j0.e(c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$1$1", f = "Wrapper.android.kt", l = {Opcodes.LCMP}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class WrappedComposition$setContent$1$1$1$1 extends j0.i implements q0.p {

    /* renamed from: a, reason: collision with root package name */
    public int f16694a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WrappedComposition f16695b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrappedComposition$setContent$1$1$1$1(WrappedComposition wrappedComposition, h0.g gVar) {
        super(2, gVar);
        this.f16695b = wrappedComposition;
    }

    @Override // j0.a
    public final h0.g create(Object obj, h0.g gVar) {
        return new WrappedComposition$setContent$1$1$1$1(this.f16695b, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((WrappedComposition$setContent$1$1$1$1) create((d0) obj, (h0.g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f16694a;
        b0 b0Var = b0.f30125a;
        if (i2 == 0) {
            q.m(obj);
            AndroidComposeView androidComposeView = this.f16695b.f16686a;
            this.f16694a = 1;
            Object c2 = androidComposeView.f16220p.c(this);
            if (c2 != aVar) {
                c2 = b0Var;
            }
            if (c2 == aVar) {
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

package androidx.compose.foundation.text;

import b1.d0;
import d0.b0;
import e1.d;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.objectweb.asm.Opcodes;
import q0.p;

@e(c = "androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$1$1", f = "BasicSecureTextField.kt", l = {Opcodes.L2I}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class BasicSecureTextFieldKt$BasicSecureTextField$1$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f5416a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SecureTextFieldController f5417b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicSecureTextFieldKt$BasicSecureTextField$1$1(SecureTextFieldController secureTextFieldController, g gVar) {
        super(2, gVar);
        this.f5417b = secureTextFieldController;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new BasicSecureTextFieldKt$BasicSecureTextField$1$1(this.f5417b, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((BasicSecureTextFieldKt$BasicSecureTextField$1$1) create((d0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f5416a;
        b0 b0Var = b0.f30125a;
        if (i2 == 0) {
            q.m(obj);
            this.f5416a = 1;
            SecureTextFieldController secureTextFieldController = this.f5417b;
            Object D = p0.a.D(new d(secureTextFieldController.e, true), new SecureTextFieldController$observeHideEvents$2(secureTextFieldController, null), this);
            if (D != aVar) {
                D = b0Var;
            }
            if (D == aVar) {
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

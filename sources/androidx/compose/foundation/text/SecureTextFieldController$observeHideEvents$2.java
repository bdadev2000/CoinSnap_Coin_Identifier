package androidx.compose.foundation.text;

import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.foundation.text.SecureTextFieldController$observeHideEvents$2", f = "BasicSecureTextField.kt", l = {242}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SecureTextFieldController$observeHideEvents$2 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f6099a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SecureTextFieldController f6100b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecureTextFieldController$observeHideEvents$2(SecureTextFieldController secureTextFieldController, g gVar) {
        super(2, gVar);
        this.f6100b = secureTextFieldController;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new SecureTextFieldController$observeHideEvents$2(this.f6100b, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((SecureTextFieldController$observeHideEvents$2) create((b0) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f6099a;
        if (i2 == 0) {
            q.m(obj);
            this.f6099a = 1;
            if (p0.a.L(1500L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        this.f6100b.f6096b.a(-1);
        return b0.f30125a;
    }
}

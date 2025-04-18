package androidx.compose.foundation.text;

import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$2$1", f = "BasicSecureTextField.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class BasicSecureTextFieldKt$BasicSecureTextField$2$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f5418a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SecureTextFieldController f5419b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicSecureTextFieldKt$BasicSecureTextField$2$1(boolean z2, SecureTextFieldController secureTextFieldController, g gVar) {
        super(2, gVar);
        this.f5418a = z2;
        this.f5419b = secureTextFieldController;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        return new BasicSecureTextFieldKt$BasicSecureTextField$2$1(this.f5418a, this.f5419b, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        BasicSecureTextFieldKt$BasicSecureTextField$2$1 basicSecureTextFieldKt$BasicSecureTextField$2$1 = (BasicSecureTextFieldKt$BasicSecureTextField$2$1) create((d0) obj, (g) obj2);
        b0 b0Var = b0.f30125a;
        basicSecureTextFieldKt$BasicSecureTextField$2$1.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        q.m(obj);
        if (!this.f5418a) {
            this.f5419b.f6096b.a(-1);
        }
        return b0.f30125a;
    }
}

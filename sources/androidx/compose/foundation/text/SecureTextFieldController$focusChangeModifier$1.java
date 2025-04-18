package androidx.compose.foundation.text;

import androidx.compose.ui.focus.FocusState;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class SecureTextFieldController$focusChangeModifier$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SecureTextFieldController f6098a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecureTextFieldController$focusChangeModifier$1(SecureTextFieldController secureTextFieldController) {
        super(1);
        this.f6098a = secureTextFieldController;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        if (!((FocusState) obj).a()) {
            this.f6098a.f6096b.a(-1);
        }
        return b0.f30125a;
    }
}

package androidx.compose.foundation.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.TextFieldValue;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LegacyTextFieldState$onValueChange$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LegacyTextFieldState f6043a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyTextFieldState$onValueChange$1(LegacyTextFieldState legacyTextFieldState) {
        super(1);
        this.f6043a = legacyTextFieldState;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        TextFieldValue textFieldValue = (TextFieldValue) obj;
        String str = textFieldValue.f17361a.f16880a;
        LegacyTextFieldState legacyTextFieldState = this.f6043a;
        AnnotatedString annotatedString = legacyTextFieldState.f6028j;
        if (!p0.a.g(str, annotatedString != null ? annotatedString.f16880a : null)) {
            legacyTextFieldState.f6029k.setValue(HandleState.f5967a);
        }
        long j2 = TextRange.f17056b;
        legacyTextFieldState.g(j2);
        legacyTextFieldState.f(j2);
        legacyTextFieldState.f6037s.invoke(textFieldValue);
        legacyTextFieldState.f6022b.invalidate();
        return b0.f30125a;
    }
}

package androidx.compose.ui.text.input;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.SaversKt;
import androidx.compose.ui.text.TextRange;
import b1.f0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes2.dex */
public final class TextFieldValue$Companion$Saver$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final TextFieldValue$Companion$Saver$1 f17364a = new r(2);

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        SaverScope saverScope = (SaverScope) obj;
        TextFieldValue textFieldValue = (TextFieldValue) obj2;
        return f0.b(SaversKt.a(textFieldValue.f17361a, SaversKt.f16951a, saverScope), SaversKt.a(new TextRange(textFieldValue.f17362b), SaversKt.f16964p, saverScope));
    }
}

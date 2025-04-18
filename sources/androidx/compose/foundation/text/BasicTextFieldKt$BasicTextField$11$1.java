package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.TextFieldValue;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class BasicTextFieldKt$BasicTextField$11$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldValue f5479a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f5480b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextFieldKt$BasicTextField$11$1(TextFieldValue textFieldValue, l lVar) {
        super(1);
        this.f5479a = textFieldValue;
        this.f5480b = lVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        TextFieldValue textFieldValue = (TextFieldValue) obj;
        if (!p0.a.g(this.f5479a, textFieldValue)) {
            this.f5480b.invoke(textFieldValue);
        }
        return b0.f30125a;
    }
}

package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.TextFieldValue;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class BasicTextFieldKt$BasicTextField$8$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f5596a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MutableState f5597b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MutableState f5598c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextFieldKt$BasicTextField$8$1(l lVar, MutableState mutableState, MutableState mutableState2) {
        super(1);
        this.f5596a = lVar;
        this.f5597b = mutableState;
        this.f5598c = mutableState2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        TextFieldValue textFieldValue = (TextFieldValue) obj;
        TextFieldDecorator textFieldDecorator = BasicTextFieldKt.f5458a;
        this.f5597b.setValue(textFieldValue);
        MutableState mutableState = this.f5598c;
        boolean z2 = !p0.a.g((String) mutableState.getValue(), textFieldValue.f17361a.f16880a);
        AnnotatedString annotatedString = textFieldValue.f17361a;
        mutableState.setValue(annotatedString.f16880a);
        if (z2) {
            this.f5596a.invoke(annotatedString.f16880a);
        }
        return b0.f30125a;
    }
}

package androidx.compose.foundation.text;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class BasicTextFieldKt$BasicTextField$7$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldValue f5594a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MutableState f5595b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextFieldKt$BasicTextField$7$1(MutableState mutableState, TextFieldValue textFieldValue) {
        super(0);
        this.f5594a = textFieldValue;
        this.f5595b = mutableState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
    
        if (p0.a.g(r0.f17363c, ((androidx.compose.ui.text.input.TextFieldValue) r3.getValue()).f17363c) == false) goto L6;
     */
    @Override // q0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke() {
        /*
            r6 = this;
            androidx.compose.ui.text.input.TextFieldValue r0 = r6.f5594a
            long r1 = r0.f17362b
            androidx.compose.foundation.text.input.TextFieldDecorator r3 = androidx.compose.foundation.text.BasicTextFieldKt.f5458a
            androidx.compose.runtime.MutableState r3 = r6.f5595b
            java.lang.Object r4 = r3.getValue()
            androidx.compose.ui.text.input.TextFieldValue r4 = (androidx.compose.ui.text.input.TextFieldValue) r4
            long r4 = r4.f17362b
            boolean r1 = androidx.compose.ui.text.TextRange.b(r1, r4)
            if (r1 == 0) goto L26
            java.lang.Object r1 = r3.getValue()
            androidx.compose.ui.text.input.TextFieldValue r1 = (androidx.compose.ui.text.input.TextFieldValue) r1
            androidx.compose.ui.text.TextRange r1 = r1.f17363c
            androidx.compose.ui.text.TextRange r2 = r0.f17363c
            boolean r1 = p0.a.g(r2, r1)
            if (r1 != 0) goto L29
        L26:
            r3.setValue(r0)
        L29:
            d0.b0 r0 = d0.b0.f30125a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1.invoke():java.lang.Object");
    }
}

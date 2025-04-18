package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.ui.text.TextRange;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class TransformedTextFieldState$outputTransformedText$1$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransformedTextFieldState f6666a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OutputTransformation f6667b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformedTextFieldState$outputTransformedText$1$1(TransformedTextFieldState transformedTextFieldState, OutputTransformation outputTransformation) {
        super(0);
        this.f6666a = transformedTextFieldState;
        this.f6667b = outputTransformation;
    }

    @Override // q0.a
    public final Object invoke() {
        TransformedTextFieldState transformedTextFieldState = this.f6666a;
        TextFieldCharSequence b2 = transformedTextFieldState.f6651a.b();
        SelectionWedgeAffinity selectionWedgeAffinity = (SelectionWedgeAffinity) transformedTextFieldState.f6655g.getValue();
        OffsetMappingCalculator offsetMappingCalculator = new OffsetMappingCalculator();
        TextFieldBuffer textFieldBuffer = new TextFieldBuffer(b2, null, null, offsetMappingCalculator, 6);
        this.f6667b.a();
        if (textFieldBuffer.a().f6369a.f14144c == 0) {
            return null;
        }
        long b3 = TransformedTextFieldState.Companion.b(b2.f6298b, offsetMappingCalculator, selectionWedgeAffinity);
        TextRange textRange = b2.f6299c;
        return new TransformedTextFieldState.TransformedText(new TextFieldCharSequence(textFieldBuffer.f6295c.toString(), b3, textRange != null ? new TextRange(TransformedTextFieldState.Companion.b(textRange.f17058a, offsetMappingCalculator, selectionWedgeAffinity)) : null, 8), offsetMappingCalculator);
    }
}

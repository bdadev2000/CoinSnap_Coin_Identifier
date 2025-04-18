package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.TextRange;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class TransformedTextFieldState$codepointTransformedText$1$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransformedTextFieldState f6659a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CodepointTransformation f6660b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformedTextFieldState$codepointTransformedText$1$1(TransformedTextFieldState transformedTextFieldState, CodepointTransformation codepointTransformation) {
        super(0);
        this.f6659a = transformedTextFieldState;
        this.f6660b = codepointTransformation;
    }

    @Override // q0.a
    public final Object invoke() {
        TextFieldCharSequence b2;
        TransformedTextFieldState.TransformedText transformedText;
        TransformedTextFieldState transformedTextFieldState = this.f6659a;
        State state = transformedTextFieldState.e;
        if (state == null || (transformedText = (TransformedTextFieldState.TransformedText) state.getValue()) == null || (b2 = transformedText.f6657a) == null) {
            b2 = transformedTextFieldState.f6651a.b();
        }
        SelectionWedgeAffinity selectionWedgeAffinity = (SelectionWedgeAffinity) transformedTextFieldState.f6655g.getValue();
        OffsetMappingCalculator offsetMappingCalculator = new OffsetMappingCalculator();
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        while (i2 < b2.f6297a.length()) {
            int codePointAt = Character.codePointAt(b2, i2);
            int a2 = this.f6660b.a(i3, codePointAt);
            int charCount = Character.charCount(codePointAt);
            if (a2 != codePointAt) {
                offsetMappingCalculator.c(sb.length(), sb.length() + charCount, Character.charCount(a2));
                z2 = true;
            }
            sb.appendCodePoint(a2);
            i2 += charCount;
            i3++;
        }
        CharSequence sb2 = sb.toString();
        p0.a.r(sb2, "StringBuilder().apply(builderAction).toString()");
        CharSequence charSequence = z2 ? sb2 : b2;
        if (charSequence == b2) {
            return null;
        }
        long b3 = TransformedTextFieldState.Companion.b(b2.f6298b, offsetMappingCalculator, selectionWedgeAffinity);
        TextRange textRange = b2.f6299c;
        return new TransformedTextFieldState.TransformedText(new TextFieldCharSequence(charSequence, b3, textRange != null ? new TextRange(TransformedTextFieldState.Companion.b(textRange.f17058a, offsetMappingCalculator, selectionWedgeAffinity)) : null, 8), offsetMappingCalculator);
    }
}

package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import java.util.List;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class TextAnnotatedStringNode$applySemantics$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextAnnotatedStringNode f6982a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextAnnotatedStringNode$applySemantics$1(TextAnnotatedStringNode textAnnotatedStringNode) {
        super(1);
        this.f6982a = textAnnotatedStringNode;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        TextLayoutResult textLayoutResult;
        List list = (List) obj;
        TextAnnotatedStringNode textAnnotatedStringNode = this.f6982a;
        TextLayoutResult textLayoutResult2 = textAnnotatedStringNode.g2().f6907n;
        if (textLayoutResult2 != null) {
            TextLayoutInput textLayoutInput = textLayoutResult2.f17046a;
            AnnotatedString annotatedString = textLayoutInput.f17038a;
            TextStyle textStyle = textAnnotatedStringNode.f6970p;
            ColorProducer colorProducer = textAnnotatedStringNode.f6978z;
            textLayoutResult = new TextLayoutResult(new TextLayoutInput(annotatedString, TextStyle.f(0, 16777214, colorProducer != null ? colorProducer.a() : Color.f14962i, 0L, 0L, 0L, textStyle, null, null, null, null), textLayoutInput.f17040c, textLayoutInput.d, textLayoutInput.e, textLayoutInput.f17041f, textLayoutInput.f17042g, textLayoutInput.f17043h, textLayoutInput.f17044i, textLayoutInput.f17045j), textLayoutResult2.f17047b, textLayoutResult2.f17048c);
            list.add(textLayoutResult);
        } else {
            textLayoutResult = null;
        }
        return Boolean.valueOf(textLayoutResult != null);
    }
}

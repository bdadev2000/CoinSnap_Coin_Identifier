package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import d0.b0;
import java.util.List;
import kotlin.jvm.internal.r;
import p0.a;
import q0.l;

/* loaded from: classes4.dex */
final class TextAnnotatedStringNode$applySemantics$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextAnnotatedStringNode f6983a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextAnnotatedStringNode$applySemantics$2(TextAnnotatedStringNode textAnnotatedStringNode) {
        super(1);
        this.f6983a = textAnnotatedStringNode;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        AnnotatedString annotatedString = (AnnotatedString) obj;
        TextAnnotatedStringNode textAnnotatedStringNode = this.f6983a;
        TextAnnotatedStringNode.TextSubstitutionValue textSubstitutionValue = textAnnotatedStringNode.E;
        if (textSubstitutionValue == null) {
            TextAnnotatedStringNode.TextSubstitutionValue textSubstitutionValue2 = new TextAnnotatedStringNode.TextSubstitutionValue(textAnnotatedStringNode.f6969o, annotatedString);
            MultiParagraphLayoutCache multiParagraphLayoutCache = new MultiParagraphLayoutCache(annotatedString, textAnnotatedStringNode.f6970p, textAnnotatedStringNode.f6971q, textAnnotatedStringNode.f6973s, textAnnotatedStringNode.f6974t, textAnnotatedStringNode.f6975u, textAnnotatedStringNode.f6976v, textAnnotatedStringNode.w);
            multiParagraphLayoutCache.c(textAnnotatedStringNode.g2().f6904k);
            textSubstitutionValue2.d = multiParagraphLayoutCache;
            textAnnotatedStringNode.E = textSubstitutionValue2;
        } else if (!a.g(annotatedString, textSubstitutionValue.f6980b)) {
            textSubstitutionValue.f6980b = annotatedString;
            MultiParagraphLayoutCache multiParagraphLayoutCache2 = textSubstitutionValue.d;
            if (multiParagraphLayoutCache2 != null) {
                TextStyle textStyle = textAnnotatedStringNode.f6970p;
                FontFamily.Resolver resolver = textAnnotatedStringNode.f6971q;
                int i2 = textAnnotatedStringNode.f6973s;
                boolean z2 = textAnnotatedStringNode.f6974t;
                int i3 = textAnnotatedStringNode.f6975u;
                int i4 = textAnnotatedStringNode.f6976v;
                List list = textAnnotatedStringNode.w;
                multiParagraphLayoutCache2.f6896a = annotatedString;
                multiParagraphLayoutCache2.f6897b = textStyle;
                multiParagraphLayoutCache2.f6898c = resolver;
                multiParagraphLayoutCache2.d = i2;
                multiParagraphLayoutCache2.e = z2;
                multiParagraphLayoutCache2.f6899f = i3;
                multiParagraphLayoutCache2.f6900g = i4;
                multiParagraphLayoutCache2.f6901h = list;
                multiParagraphLayoutCache2.f6905l = null;
                multiParagraphLayoutCache2.f6907n = null;
                multiParagraphLayoutCache2.f6909p = -1;
                multiParagraphLayoutCache2.f6908o = -1;
                b0 b0Var = b0.f30125a;
            }
        }
        TextAnnotatedStringNode.e2(textAnnotatedStringNode);
        return Boolean.TRUE;
    }
}

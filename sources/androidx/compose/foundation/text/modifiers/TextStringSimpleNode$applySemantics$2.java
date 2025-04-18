package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.modifiers.TextStringSimpleNode;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSizeKt;
import d0.b0;
import kotlin.jvm.internal.r;
import p0.a;
import q0.l;

/* loaded from: classes4.dex */
final class TextStringSimpleNode$applySemantics$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextStringSimpleNode f7008a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextStringSimpleNode$applySemantics$2(TextStringSimpleNode textStringSimpleNode) {
        super(1);
        this.f7008a = textStringSimpleNode;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        String str = ((AnnotatedString) obj).f16880a;
        TextStringSimpleNode textStringSimpleNode = this.f7008a;
        TextStringSimpleNode.TextSubstitutionValue textSubstitutionValue = textStringSimpleNode.f7003z;
        if (textSubstitutionValue == null) {
            TextStringSimpleNode.TextSubstitutionValue textSubstitutionValue2 = new TextStringSimpleNode.TextSubstitutionValue(textStringSimpleNode.f6994o, str);
            ParagraphLayoutCache paragraphLayoutCache = new ParagraphLayoutCache(str, textStringSimpleNode.f6995p, textStringSimpleNode.f6996q, textStringSimpleNode.f6997r, textStringSimpleNode.f6998s, textStringSimpleNode.f6999t, textStringSimpleNode.f7000u);
            paragraphLayoutCache.c(textStringSimpleNode.f2().f6916i);
            textSubstitutionValue2.d = paragraphLayoutCache;
            textStringSimpleNode.f7003z = textSubstitutionValue2;
        } else if (!a.g(str, textSubstitutionValue.f7005b)) {
            textSubstitutionValue.f7005b = str;
            ParagraphLayoutCache paragraphLayoutCache2 = textSubstitutionValue.d;
            if (paragraphLayoutCache2 != null) {
                TextStyle textStyle = textStringSimpleNode.f6995p;
                FontFamily.Resolver resolver = textStringSimpleNode.f6996q;
                int i2 = textStringSimpleNode.f6997r;
                boolean z2 = textStringSimpleNode.f6998s;
                int i3 = textStringSimpleNode.f6999t;
                int i4 = textStringSimpleNode.f7000u;
                paragraphLayoutCache2.f6910a = str;
                paragraphLayoutCache2.f6911b = textStyle;
                paragraphLayoutCache2.f6912c = resolver;
                paragraphLayoutCache2.d = i2;
                paragraphLayoutCache2.e = z2;
                paragraphLayoutCache2.f6913f = i3;
                paragraphLayoutCache2.f6914g = i4;
                paragraphLayoutCache2.f6917j = null;
                paragraphLayoutCache2.f6921n = null;
                paragraphLayoutCache2.f6922o = null;
                paragraphLayoutCache2.f6924q = -1;
                paragraphLayoutCache2.f6925r = -1;
                paragraphLayoutCache2.f6923p = Constraints.Companion.c(0, 0);
                paragraphLayoutCache2.f6919l = IntSizeKt.a(0, 0);
                paragraphLayoutCache2.f6918k = false;
                b0 b0Var = b0.f30125a;
            }
        }
        TextStringSimpleNode.e2(textStringSimpleNode);
        return Boolean.TRUE;
    }
}

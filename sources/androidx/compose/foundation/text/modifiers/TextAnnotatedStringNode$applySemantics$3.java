package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class TextAnnotatedStringNode$applySemantics$3 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextAnnotatedStringNode f6984a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextAnnotatedStringNode$applySemantics$3(TextAnnotatedStringNode textAnnotatedStringNode) {
        super(1);
        this.f6984a = textAnnotatedStringNode;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        TextAnnotatedStringNode textAnnotatedStringNode = this.f6984a;
        TextAnnotatedStringNode.TextSubstitutionValue textSubstitutionValue = textAnnotatedStringNode.E;
        if (textSubstitutionValue == null) {
            return Boolean.FALSE;
        }
        l lVar = textAnnotatedStringNode.A;
        if (lVar != null) {
            lVar.invoke(textSubstitutionValue);
        }
        TextAnnotatedStringNode.TextSubstitutionValue textSubstitutionValue2 = textAnnotatedStringNode.E;
        if (textSubstitutionValue2 != null) {
            textSubstitutionValue2.f6981c = booleanValue;
        }
        TextAnnotatedStringNode.e2(textAnnotatedStringNode);
        return Boolean.TRUE;
    }
}

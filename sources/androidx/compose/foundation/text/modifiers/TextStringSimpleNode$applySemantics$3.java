package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.modifiers.TextStringSimpleNode;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class TextStringSimpleNode$applySemantics$3 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextStringSimpleNode f7009a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextStringSimpleNode$applySemantics$3(TextStringSimpleNode textStringSimpleNode) {
        super(1);
        this.f7009a = textStringSimpleNode;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        TextStringSimpleNode textStringSimpleNode = this.f7009a;
        TextStringSimpleNode.TextSubstitutionValue textSubstitutionValue = textStringSimpleNode.f7003z;
        if (textSubstitutionValue == null) {
            return Boolean.FALSE;
        }
        textSubstitutionValue.f7006c = booleanValue;
        TextStringSimpleNode.e2(textStringSimpleNode);
        return Boolean.TRUE;
    }
}

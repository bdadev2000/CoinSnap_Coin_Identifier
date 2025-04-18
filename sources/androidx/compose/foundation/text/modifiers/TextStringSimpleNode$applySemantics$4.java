package androidx.compose.foundation.text.modifiers;

import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes4.dex */
final class TextStringSimpleNode$applySemantics$4 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextStringSimpleNode f7010a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextStringSimpleNode$applySemantics$4(TextStringSimpleNode textStringSimpleNode) {
        super(0);
        this.f7010a = textStringSimpleNode;
    }

    @Override // q0.a
    public final Object invoke() {
        TextStringSimpleNode textStringSimpleNode = this.f7010a;
        textStringSimpleNode.f7003z = null;
        TextStringSimpleNode.e2(textStringSimpleNode);
        return Boolean.TRUE;
    }
}

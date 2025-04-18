package androidx.compose.foundation.text.modifiers;

import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes4.dex */
final class TextAnnotatedStringNode$applySemantics$4 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextAnnotatedStringNode f6985a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextAnnotatedStringNode$applySemantics$4(TextAnnotatedStringNode textAnnotatedStringNode) {
        super(0);
        this.f6985a = textAnnotatedStringNode;
    }

    @Override // q0.a
    public final Object invoke() {
        TextAnnotatedStringNode textAnnotatedStringNode = this.f6985a;
        textAnnotatedStringNode.E = null;
        TextAnnotatedStringNode.e2(textAnnotatedStringNode);
        return Boolean.TRUE;
    }
}

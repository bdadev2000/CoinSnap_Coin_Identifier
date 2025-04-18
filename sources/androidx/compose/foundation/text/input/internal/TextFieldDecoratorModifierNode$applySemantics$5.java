package androidx.compose.foundation.text.input.internal;

import kotlin.jvm.internal.r;

/* loaded from: classes4.dex */
final class TextFieldDecoratorModifierNode$applySemantics$5 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldDecoratorModifierNode f6559a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6560b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$applySemantics$5(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, int i2) {
        super(0);
        this.f6559a = textFieldDecoratorModifierNode;
        this.f6560b = i2;
    }

    @Override // q0.a
    public final Object invoke() {
        TextFieldDecoratorModifierNode.i2(this.f6559a, this.f6560b);
        return Boolean.TRUE;
    }
}

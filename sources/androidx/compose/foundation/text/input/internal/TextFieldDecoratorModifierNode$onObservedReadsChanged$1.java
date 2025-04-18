package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.WindowInfo;
import d0.b0;
import kotlin.jvm.internal.r;

/* loaded from: classes3.dex */
final class TextFieldDecoratorModifierNode$onObservedReadsChanged$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldDecoratorModifierNode f6576a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$onObservedReadsChanged$1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        super(0);
        this.f6576a = textFieldDecoratorModifierNode;
    }

    @Override // q0.a
    public final Object invoke() {
        StaticProvidableCompositionLocal staticProvidableCompositionLocal = CompositionLocalsKt.f16446r;
        TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.f6576a;
        textFieldDecoratorModifierNode.F = (WindowInfo) CompositionLocalConsumerModifierNodeKt.a(textFieldDecoratorModifierNode, staticProvidableCompositionLocal);
        textFieldDecoratorModifierNode.n2();
        return b0.f30125a;
    }
}

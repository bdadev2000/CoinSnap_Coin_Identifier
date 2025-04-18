package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
final class TextFieldDecoratorModifierNode$receiveContentConfigurationProvider$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldDecoratorModifierNode f6596a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$receiveContentConfigurationProvider$1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        super(0);
        this.f6596a = textFieldDecoratorModifierNode;
    }

    @Override // q0.a
    public final Object invoke() {
        return ReceiveContentConfigurationKt.a(this.f6596a);
    }
}

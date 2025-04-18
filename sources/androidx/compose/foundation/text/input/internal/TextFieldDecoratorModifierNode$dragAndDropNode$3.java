package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.content.internal.DragAndDropRequestPermission_androidKt;
import androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class TextFieldDecoratorModifierNode$dragAndDropNode$3 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldDecoratorModifierNode f6567a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$dragAndDropNode$3(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        super(1);
        this.f6567a = textFieldDecoratorModifierNode;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        DragAndDropEvent dragAndDropEvent = (DragAndDropEvent) obj;
        TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.f6567a;
        if (ReceiveContentConfigurationKt.a(textFieldDecoratorModifierNode) != null) {
            DragAndDropRequestPermission_androidKt.a(textFieldDecoratorModifierNode, dragAndDropEvent);
        }
        return b0.f30125a;
    }
}

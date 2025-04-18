package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.foundation.content.TransferableContent_androidKt;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt;
import androidx.compose.ui.platform.ClipEntry;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes4.dex */
final class TextFieldDecoratorModifierNode$dragAndDropNode$2 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldDecoratorModifierNode f6566a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$dragAndDropNode$2(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        super(2);
        this.f6566a = textFieldDecoratorModifierNode;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ClipEntry clipEntry;
        ClipEntry clipEntry2 = (ClipEntry) obj;
        TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.f6566a;
        TextFieldDecoratorModifierNode.h2(textFieldDecoratorModifierNode);
        textFieldDecoratorModifierNode.f6548s.e();
        String a2 = TransferableContent_androidKt.a(clipEntry2);
        ReceiveContentConfiguration a3 = ReceiveContentConfigurationKt.a(textFieldDecoratorModifierNode);
        if (a3 != null) {
            TransferableContent e = a3.a().e(new TransferableContent(clipEntry2));
            a2 = (e == null || (clipEntry = e.f2894a) == null) ? null : TransferableContent_androidKt.a(clipEntry);
        }
        if (a2 != null) {
            TransformedTextFieldState.h(textFieldDecoratorModifierNode.f6546q, a2, false, null, 6);
        }
        return Boolean.TRUE;
    }
}

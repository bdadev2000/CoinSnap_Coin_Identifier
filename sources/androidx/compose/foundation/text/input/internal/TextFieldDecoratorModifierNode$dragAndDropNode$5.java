package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.Handle;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextRangeKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class TextFieldDecoratorModifierNode$dragAndDropNode$5 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldDecoratorModifierNode f6569a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$dragAndDropNode$5(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        super(1);
        this.f6569a = textFieldDecoratorModifierNode;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        long j2 = ((Offset) obj).f14913a;
        TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.f6569a;
        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) textFieldDecoratorModifierNode.f6547r.f6647f.getValue();
        if (layoutCoordinates != null && layoutCoordinates.B()) {
            j2 = layoutCoordinates.D(j2);
        }
        int c2 = textFieldDecoratorModifierNode.f6547r.c(j2, true);
        textFieldDecoratorModifierNode.f6546q.j(TextRangeKt.a(c2, c2));
        textFieldDecoratorModifierNode.f6548s.C(Handle.f5964a, j2);
        return b0.f30125a;
    }
}

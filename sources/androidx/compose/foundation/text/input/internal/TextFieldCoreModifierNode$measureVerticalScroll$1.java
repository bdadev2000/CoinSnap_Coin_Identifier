package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class TextFieldCoreModifierNode$measureVerticalScroll$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldCoreModifierNode f6522a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MeasureScope f6523b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6524c;
    public final /* synthetic */ Placeable d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldCoreModifierNode$measureVerticalScroll$1(TextFieldCoreModifierNode textFieldCoreModifierNode, MeasureScope measureScope, int i2, Placeable placeable) {
        super(1);
        this.f6522a = textFieldCoreModifierNode;
        this.f6523b = measureScope;
        this.f6524c = i2;
        this.d = placeable;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        MeasureScope measureScope = this.f6523b;
        int i2 = this.f6524c;
        Placeable placeable = this.d;
        int i3 = placeable.f15826b;
        TextFieldCoreModifierNode textFieldCoreModifierNode = this.f6522a;
        TextFieldCoreModifierNode.h2(textFieldCoreModifierNode, measureScope, i2, i3, textFieldCoreModifierNode.f6514t.d().f6298b, this.f6523b.getLayoutDirection());
        Placeable.PlacementScope.h((Placeable.PlacementScope) obj, placeable, 0, -textFieldCoreModifierNode.x.f2865a.g());
        return b0.f30125a;
    }
}

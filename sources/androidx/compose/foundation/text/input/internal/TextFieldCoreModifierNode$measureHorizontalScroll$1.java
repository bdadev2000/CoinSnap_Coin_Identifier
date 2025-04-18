package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class TextFieldCoreModifierNode$measureHorizontalScroll$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldCoreModifierNode f6519a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MeasureScope f6520b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6521c;
    public final /* synthetic */ Placeable d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldCoreModifierNode$measureHorizontalScroll$1(TextFieldCoreModifierNode textFieldCoreModifierNode, MeasureScope measureScope, int i2, Placeable placeable) {
        super(1);
        this.f6519a = textFieldCoreModifierNode;
        this.f6520b = measureScope;
        this.f6521c = i2;
        this.d = placeable;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        MeasureScope measureScope = this.f6520b;
        int i2 = this.f6521c;
        Placeable placeable = this.d;
        int i3 = placeable.f15825a;
        TextFieldCoreModifierNode textFieldCoreModifierNode = this.f6519a;
        TextFieldCoreModifierNode.h2(textFieldCoreModifierNode, measureScope, i2, i3, textFieldCoreModifierNode.f6514t.d().f6298b, this.f6520b.getLayoutDirection());
        Placeable.PlacementScope.h((Placeable.PlacementScope) obj, placeable, -textFieldCoreModifierNode.x.f2865a.g(), 0);
        return b0.f30125a;
    }
}

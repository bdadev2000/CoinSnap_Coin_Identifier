package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes.dex */
final class TextFieldMagnifierNodeImpl28$magnifierNode$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldMagnifierNodeImpl28 f6698a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldMagnifierNodeImpl28$magnifierNode$2(TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28) {
        super(1);
        this.f6698a = textFieldMagnifierNodeImpl28;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        long j2 = ((DpSize) obj).f17488a;
        StaticProvidableCompositionLocal staticProvidableCompositionLocal = CompositionLocalsKt.f16434f;
        TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28 = this.f6698a;
        Density density = (Density) CompositionLocalConsumerModifierNodeKt.a(textFieldMagnifierNodeImpl28, staticProvidableCompositionLocal);
        textFieldMagnifierNodeImpl28.f6695u.setValue(new IntSize(IntSizeKt.a(density.F0(DpSize.b(j2)), density.F0(DpSize.a(j2)))));
        return b0.f30125a;
    }
}

package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.unit.LayoutDirection;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class HorizontalScrollLayoutModifier$measure$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MeasureScope f5976a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HorizontalScrollLayoutModifier f5977b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Placeable f5978c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalScrollLayoutModifier$measure$1(MeasureScope measureScope, HorizontalScrollLayoutModifier horizontalScrollLayoutModifier, Placeable placeable, int i2) {
        super(1);
        this.f5976a = measureScope;
        this.f5977b = horizontalScrollLayoutModifier;
        this.f5978c = placeable;
        this.d = i2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        MeasureScope measureScope = this.f5976a;
        HorizontalScrollLayoutModifier horizontalScrollLayoutModifier = this.f5977b;
        int i2 = horizontalScrollLayoutModifier.f5974b;
        TransformedText transformedText = horizontalScrollLayoutModifier.f5975c;
        TextLayoutResultProxy textLayoutResultProxy = (TextLayoutResultProxy) horizontalScrollLayoutModifier.d.invoke();
        TextLayoutResult textLayoutResult = textLayoutResultProxy != null ? textLayoutResultProxy.f6210a : null;
        boolean z2 = this.f5976a.getLayoutDirection() == LayoutDirection.f17495b;
        Placeable placeable = this.f5978c;
        Rect a2 = TextFieldScrollKt.a(measureScope, i2, transformedText, textLayoutResult, z2, placeable.f15825a);
        Orientation orientation = Orientation.f3395b;
        int i3 = placeable.f15825a;
        TextFieldScrollerPosition textFieldScrollerPosition = horizontalScrollLayoutModifier.f5973a;
        textFieldScrollerPosition.a(orientation, a2, this.d, i3);
        Placeable.PlacementScope.h(placementScope, placeable, Math.round(-textFieldScrollerPosition.f6198a.c()), 0);
        return b0.f30125a;
    }
}

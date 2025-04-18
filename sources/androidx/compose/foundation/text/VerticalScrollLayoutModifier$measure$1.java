package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.TransformedText;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class VerticalScrollLayoutModifier$measure$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MeasureScope f6258a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VerticalScrollLayoutModifier f6259b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Placeable f6260c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalScrollLayoutModifier$measure$1(MeasureScope measureScope, VerticalScrollLayoutModifier verticalScrollLayoutModifier, Placeable placeable, int i2) {
        super(1);
        this.f6258a = measureScope;
        this.f6259b = verticalScrollLayoutModifier;
        this.f6260c = placeable;
        this.d = i2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        MeasureScope measureScope = this.f6258a;
        VerticalScrollLayoutModifier verticalScrollLayoutModifier = this.f6259b;
        int i2 = verticalScrollLayoutModifier.f6256b;
        TransformedText transformedText = verticalScrollLayoutModifier.f6257c;
        TextLayoutResultProxy textLayoutResultProxy = (TextLayoutResultProxy) verticalScrollLayoutModifier.d.invoke();
        TextLayoutResult textLayoutResult = textLayoutResultProxy != null ? textLayoutResultProxy.f6210a : null;
        Placeable placeable = this.f6260c;
        Rect a2 = TextFieldScrollKt.a(measureScope, i2, transformedText, textLayoutResult, false, placeable.f15825a);
        Orientation orientation = Orientation.f3394a;
        int i3 = placeable.f15826b;
        TextFieldScrollerPosition textFieldScrollerPosition = verticalScrollLayoutModifier.f6255a;
        textFieldScrollerPosition.a(orientation, a2, this.d, i3);
        Placeable.PlacementScope.h(placementScope, placeable, 0, Math.round(-textFieldScrollerPosition.f6198a.c()));
        return b0.f30125a;
    }
}

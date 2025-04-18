package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.LinkedHashMap;
import java.util.Map;
import q0.p;

@StabilityInferred
/* loaded from: classes4.dex */
public final class TextFieldTextLayoutModifierNode extends Modifier.Node implements LayoutModifierNode, GlobalPositionAwareModifierNode, CompositionLocalConsumerModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public TextLayoutState f6640o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f6641p;

    /* renamed from: q, reason: collision with root package name */
    public Map f6642q;

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public final void M(NodeCoordinator nodeCoordinator) {
        this.f6640o.d.setValue(nodeCoordinator);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult m(MeasureScope measureScope, Measurable measurable, long j2) {
        TextLayoutState textLayoutState = this.f6640o;
        LayoutDirection layoutDirection = measureScope.getLayoutDirection();
        FontFamily.Resolver resolver = (FontFamily.Resolver) CompositionLocalConsumerModifierNodeKt.a(this, CompositionLocalsKt.f16437i);
        TextFieldLayoutStateCache textFieldLayoutStateCache = textLayoutState.f6644a;
        textFieldLayoutStateCache.getClass();
        TextFieldLayoutStateCache.MeasureInputs measureInputs = new TextFieldLayoutStateCache.MeasureInputs(measureScope, layoutDirection, resolver, j2);
        textFieldLayoutStateCache.f6617b.setValue(measureInputs);
        TextFieldLayoutStateCache.NonMeasureInputs nonMeasureInputs = (TextFieldLayoutStateCache.NonMeasureInputs) textFieldLayoutStateCache.f6616a.getValue();
        if (nonMeasureInputs == null) {
            throw new IllegalStateException("Called layoutWithNewMeasureInputs before updateNonMeasureInputs".toString());
        }
        TextLayoutResult a2 = textFieldLayoutStateCache.a(nonMeasureInputs, measureInputs);
        p pVar = textLayoutState.f6645b;
        if (pVar != null) {
            pVar.invoke(measureScope, new TextLayoutState$layoutWithNewMeasureInputs$1$textLayoutProvider$1(textLayoutState));
        }
        long j3 = a2.f17048c;
        int i2 = (int) (j3 >> 32);
        int i3 = (int) (j3 & 4294967295L);
        Placeable V = measurable.V(Constraints.Companion.b(i2, i2, i3, i3));
        this.f6640o.f6648g.setValue(new Dp(this.f6641p ? measureScope.H(TextDelegateKt.a(a2.f17047b.b(0))) : 0));
        Map map = this.f6642q;
        if (map == null) {
            map = new LinkedHashMap(2);
        }
        map.put(AlignmentLineKt.f15692a, Integer.valueOf(Math.round(a2.d)));
        map.put(AlignmentLineKt.f15693b, Integer.valueOf(Math.round(a2.e)));
        this.f6642q = map;
        return measureScope.T(i2, i3, map, new TextFieldTextLayoutModifierNode$measure$1(V));
    }
}

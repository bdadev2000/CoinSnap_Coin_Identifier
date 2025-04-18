package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.Magnifier_androidKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextHighlightType;
import androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNode;
import androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextPainter;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.LayoutDirection;
import b1.a2;
import com.google.android.gms.common.api.Api;
import d0.k;
import e0.x;

@StabilityInferred
/* loaded from: classes.dex */
public final class TextFieldCoreModifierNode extends DelegatingNode implements LayoutModifierNode, DrawModifierNode, CompositionLocalConsumerModifierNode, GlobalPositionAwareModifierNode, SemanticsModifierNode {
    public a2 A;
    public TextRange B;
    public int D;
    public final TextFieldMagnifierNode E;

    /* renamed from: q, reason: collision with root package name */
    public boolean f6511q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f6512r;

    /* renamed from: s, reason: collision with root package name */
    public TextLayoutState f6513s;

    /* renamed from: t, reason: collision with root package name */
    public TransformedTextFieldState f6514t;

    /* renamed from: u, reason: collision with root package name */
    public TextFieldSelectionState f6515u;

    /* renamed from: v, reason: collision with root package name */
    public Brush f6516v;
    public boolean w;
    public ScrollState x;

    /* renamed from: y, reason: collision with root package name */
    public Orientation f6517y;

    /* renamed from: z, reason: collision with root package name */
    public final CursorAnimationState f6518z = new CursorAnimationState();
    public Rect C = new Rect(-1.0f, -1.0f, -1.0f, -1.0f);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.node.DelegatingNode, androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode] */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNode, androidx.compose.ui.node.DelegatableNode] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    public TextFieldCoreModifierNode(boolean z2, boolean z3, TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, Brush brush, boolean z4, ScrollState scrollState, Orientation orientation) {
        this.f6511q = z2;
        this.f6512r = z3;
        this.f6513s = textLayoutState;
        this.f6514t = transformedTextFieldState;
        this.f6515u = textFieldSelectionState;
        this.f6516v = brush;
        this.w = z4;
        this.x = scrollState;
        this.f6517y = orientation;
        ?? textFieldMagnifierNodeImpl28 = Magnifier_androidKt.a() ? new TextFieldMagnifierNodeImpl28(this.f6514t, this.f6515u, this.f6513s, this.f6511q || this.f6512r) : new DelegatingNode();
        e2(textFieldMagnifierNodeImpl28);
        this.E = textFieldMagnifierNodeImpl28;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h2(TextFieldCoreModifierNode textFieldCoreModifierNode, MeasureScope measureScope, int i2, int i3, long j2, LayoutDirection layoutDirection) {
        int i4;
        TextLayoutResult b2;
        textFieldCoreModifierNode.x.f(i3 - i2);
        TextRange textRange = textFieldCoreModifierNode.B;
        if (textRange != null) {
            int i5 = TextRange.f17057c;
            int i6 = (int) (j2 & 4294967295L);
            long j3 = textRange.f17058a;
            if (i6 == ((int) (j3 & 4294967295L))) {
                i4 = (int) (j2 >> 32);
                if (i4 == ((int) (j3 >> 32)) && i3 == textFieldCoreModifierNode.D) {
                    i4 = -1;
                }
                if (i4 >= 0 || !textFieldCoreModifierNode.i2() || (b2 = textFieldCoreModifierNode.f6513s.b()) == null) {
                    return;
                }
                w0.e eVar = new w0.e(0, b2.f17046a.f17038a.f16880a.length(), 1);
                if (eVar instanceof w0.d) {
                    i4 = ((Number) p0.a.C(Integer.valueOf(i4), (w0.d) eVar)).intValue();
                } else {
                    if (eVar.isEmpty()) {
                        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + eVar + '.');
                    }
                    Integer num = 0;
                    if (i4 < num.intValue()) {
                        Integer num2 = 0;
                        i4 = num2.intValue();
                    } else {
                        int i7 = eVar.f31407b;
                        if (i4 > Integer.valueOf(i7).intValue()) {
                            i4 = Integer.valueOf(i7).intValue();
                        }
                    }
                }
                Rect c2 = b2.c(i4);
                boolean z2 = layoutDirection == LayoutDirection.f17495b;
                int F0 = measureScope.F0(TextFieldCoreModifierKt.f6510a);
                float f2 = c2.f14914a;
                float f3 = c2.f14916c;
                float f4 = z2 ? i3 - f3 : f2;
                float f5 = z2 ? (i3 - f3) + F0 : f2 + F0;
                float f6 = 0.0f;
                Rect b3 = Rect.b(c2, f4, f5, 0.0f, 10);
                Rect rect = textFieldCoreModifierNode.C;
                float f7 = rect.f14914a;
                float f8 = b3.f14914a;
                float f9 = b3.f14915b;
                if (f8 == f7 && f9 == rect.f14915b && i3 == textFieldCoreModifierNode.D) {
                    return;
                }
                boolean z3 = textFieldCoreModifierNode.f6517y == Orientation.f3394a;
                if (z3) {
                    f8 = f9;
                }
                float f10 = z3 ? b3.d : b3.f14916c;
                int g2 = textFieldCoreModifierNode.x.f2865a.g();
                float f11 = g2 + i2;
                if (f10 <= f11) {
                    float f12 = g2;
                    if (f8 >= f12 || f10 - f8 <= i2) {
                        if (f8 < f12 && f10 - f8 <= i2) {
                            f6 = f8 - f12;
                        }
                        textFieldCoreModifierNode.B = new TextRange(j2);
                        textFieldCoreModifierNode.C = b3;
                        textFieldCoreModifierNode.D = i3;
                        kotlin.jvm.internal.e.v(textFieldCoreModifierNode.S1(), null, 4, new TextFieldCoreModifierNode$updateScrollState$1(textFieldCoreModifierNode, f6, c2, null), 1);
                        return;
                    }
                }
                f6 = f10 - f11;
                textFieldCoreModifierNode.B = new TextRange(j2);
                textFieldCoreModifierNode.C = b3;
                textFieldCoreModifierNode.D = i3;
                kotlin.jvm.internal.e.v(textFieldCoreModifierNode.S1(), null, 4, new TextFieldCoreModifierNode$updateScrollState$1(textFieldCoreModifierNode, f6, c2, null), 1);
                return;
            }
        }
        int i8 = TextRange.f17057c;
        i4 = (int) (j2 & 4294967295L);
        if (i4 >= 0) {
        }
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void B(SemanticsConfiguration semanticsConfiguration) {
        this.E.B(semanticsConfiguration);
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public final void M(NodeCoordinator nodeCoordinator) {
        this.f6513s.e.setValue(nodeCoordinator);
        this.E.M(nodeCoordinator);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void W1() {
        if (this.f6511q && i2()) {
            this.A = kotlin.jvm.internal.e.v(S1(), null, 0, new TextFieldCoreModifierNode$startCursorJob$1(this, null), 3);
        }
    }

    public final boolean i2() {
        if (this.w && (this.f6511q || this.f6512r)) {
            Brush brush = this.f6516v;
            float f2 = TextFieldCoreModifierKt.f6510a;
            if (!(brush instanceof SolidColor) || ((SolidColor) brush).f15055a != 16) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult m(MeasureScope measureScope, Measurable measurable, long j2) {
        Orientation orientation = this.f6517y;
        Orientation orientation2 = Orientation.f3394a;
        x xVar = x.f30219a;
        if (orientation == orientation2) {
            Placeable V = measurable.V(Constraints.b(j2, 0, 0, 0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 7));
            int min = Math.min(V.f15826b, Constraints.h(j2));
            return measureScope.T(V.f15825a, min, xVar, new TextFieldCoreModifierNode$measureVerticalScroll$1(this, measureScope, min, V));
        }
        Placeable V2 = measurable.V(Constraints.b(j2, 0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 0, 0, 13));
        int min2 = Math.min(V2.f15825a, Constraints.i(j2));
        return measureScope.T(min2, V2.f15826b, xVar, new TextFieldCoreModifierNode$measureHorizontalScroll$1(this, measureScope, min2, V2));
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void z(ContentDrawScope contentDrawScope) {
        int f2;
        int e;
        contentDrawScope.P1();
        TextFieldCharSequence d = this.f6514t.d();
        TextLayoutResult b2 = this.f6513s.b();
        if (b2 == null) {
            return;
        }
        k kVar = d.d;
        if (kVar != null) {
            int i2 = ((TextHighlightType) kVar.f30134a).f6310a;
            long j2 = ((TextRange) kVar.f30135b).f17058a;
            if (!TextRange.c(j2)) {
                AndroidPath k2 = b2.k(TextRange.f(j2), TextRange.e(j2));
                if (i2 == 1) {
                    TextLayoutInput textLayoutInput = b2.f17046a;
                    Brush e2 = textLayoutInput.f17039b.f17059a.f17017a.e();
                    if (e2 != null) {
                        DrawScope.Y(contentDrawScope, k2, e2, 0.2f, null, 56);
                    } else {
                        long b3 = textLayoutInput.f17039b.b();
                        if (b3 == 16) {
                            b3 = Color.f14957b;
                        }
                        DrawScope.N(contentDrawScope, k2, Color.b(b3, Color.d(b3) * 0.2f), 0.0f, null, 60);
                    }
                } else {
                    DrawScope.N(contentDrawScope, k2, ((TextSelectionColors) CompositionLocalConsumerModifierNodeKt.a(this, TextSelectionColorsKt.f7360a)).f7359b, 0.0f, null, 60);
                }
            }
        }
        long j3 = d.f6298b;
        boolean c2 = TextRange.c(j3);
        k kVar2 = d.d;
        if (c2) {
            TextPainter.a(contentDrawScope.A1().a(), b2);
            if (kVar2 == null) {
                float c3 = this.f6518z.f6393b.c();
                if (c3 != 0.0f && i2()) {
                    Rect n2 = this.f6515u.n();
                    contentDrawScope.B1(this.f6516v, OffsetKt.a((n2.h() / 2.0f) + n2.f14914a, n2.f14915b), n2.c(), (r22 & 8) != 0 ? 0.0f : n2.h(), 0, null, (r22 & 64) != 0 ? 1.0f : c3, null, (r22 & 256) != 0 ? 3 : 0);
                }
            }
        } else {
            if (kVar2 == null && (f2 = TextRange.f(j3)) != (e = TextRange.e(j3))) {
                DrawScope.N(contentDrawScope, b2.k(f2, e), ((TextSelectionColors) CompositionLocalConsumerModifierNodeKt.a(this, TextSelectionColorsKt.f7360a)).f7359b, 0.0f, null, 60);
            }
            TextPainter.a(contentDrawScope.A1().a(), b2);
        }
        this.E.z(contentDrawScope);
    }
}

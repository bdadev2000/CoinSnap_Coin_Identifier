package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.MagnifierNode;
import androidx.compose.foundation.Magnifier_androidKt;
import androidx.compose.foundation.PlatformMagnifierFactory;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.selection.SelectionMagnifierKt;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.unit.IntSize;
import b1.a2;
import kotlin.jvm.internal.e;
import p0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class TextFieldMagnifierNodeImpl28 extends TextFieldMagnifierNode implements CompositionLocalConsumerModifierNode {

    /* renamed from: q, reason: collision with root package name */
    public TransformedTextFieldState f6691q;

    /* renamed from: r, reason: collision with root package name */
    public TextFieldSelectionState f6692r;

    /* renamed from: s, reason: collision with root package name */
    public TextLayoutState f6693s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f6694t;

    /* renamed from: u, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f6695u;

    /* renamed from: v, reason: collision with root package name */
    public final Animatable f6696v;
    public final MagnifierNode w;
    public a2 x;

    public TextFieldMagnifierNodeImpl28(TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, TextLayoutState textLayoutState, boolean z2) {
        ParcelableSnapshotMutableState f2;
        this.f6691q = transformedTextFieldState;
        this.f6692r = textFieldSelectionState;
        this.f6693s = textLayoutState;
        this.f6694t = z2;
        f2 = SnapshotStateKt.f(new IntSize(0L), StructuralEqualityPolicy.f14078a);
        this.f6695u = f2;
        this.f6696v = new Animatable(new Offset(TextFieldMagnifierKt.a(this.f6691q, this.f6692r, this.f6693s, ((IntSize) f2.getValue()).f17493a)), SelectionMagnifierKt.f7199b, new Offset(SelectionMagnifierKt.f7200c), 8);
        MagnifierNode magnifierNode = new MagnifierNode(new TextFieldMagnifierNodeImpl28$magnifierNode$1(this), null, new TextFieldMagnifierNodeImpl28$magnifierNode$2(this), Float.NaN, true, 9205357640488583168L, Float.NaN, Float.NaN, true, PlatformMagnifierFactory.Companion.a());
        e2(magnifierNode);
        this.w = magnifierNode;
    }

    @Override // androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNode, androidx.compose.ui.node.SemanticsModifierNode
    public final void B(SemanticsConfiguration semanticsConfiguration) {
        this.w.B(semanticsConfiguration);
    }

    @Override // androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNode, androidx.compose.ui.layout.OnGloballyPositionedModifier
    public final void M(NodeCoordinator nodeCoordinator) {
        this.w.M(nodeCoordinator);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void W1() {
        i2();
    }

    @Override // androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNode
    public final void h2(TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, TextLayoutState textLayoutState, boolean z2) {
        TransformedTextFieldState transformedTextFieldState2 = this.f6691q;
        TextFieldSelectionState textFieldSelectionState2 = this.f6692r;
        TextLayoutState textLayoutState2 = this.f6693s;
        boolean z3 = this.f6694t;
        this.f6691q = transformedTextFieldState;
        this.f6692r = textFieldSelectionState;
        this.f6693s = textLayoutState;
        this.f6694t = z2;
        if (a.g(transformedTextFieldState, transformedTextFieldState2) && a.g(textFieldSelectionState, textFieldSelectionState2) && a.g(textLayoutState, textLayoutState2) && z2 == z3) {
            return;
        }
        i2();
    }

    public final void i2() {
        a2 a2Var = this.x;
        if (a2Var != null) {
            a2Var.a(null);
        }
        this.x = null;
        if (Magnifier_androidKt.a()) {
            this.x = e.v(S1(), null, 0, new TextFieldMagnifierNodeImpl28$restartAnimationJob$1(this, null), 3);
        }
    }

    @Override // androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNode, androidx.compose.ui.node.DrawModifierNode
    public final void z(ContentDrawScope contentDrawScope) {
        contentDrawScope.P1();
        this.w.z(contentDrawScope);
    }
}

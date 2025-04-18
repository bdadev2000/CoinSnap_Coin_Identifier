package androidx.compose.foundation;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ScrollSemanticsModifierNode extends Modifier.Node implements SemanticsModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public ScrollState f2858o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2859p;

    /* renamed from: q, reason: collision with root package name */
    public FlingBehavior f2860q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2861r;

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void B(SemanticsConfiguration semanticsConfiguration) {
        SemanticsPropertiesKt.t(semanticsConfiguration);
        ScrollAxisRange scrollAxisRange = new ScrollAxisRange(new ScrollSemanticsModifierNode$applySemantics$accessibilityScrollState$1(this), new ScrollSemanticsModifierNode$applySemantics$accessibilityScrollState$2(this), this.f2859p);
        if (this.f2861r) {
            SemanticsPropertiesKt.v(semanticsConfiguration, scrollAxisRange);
        } else {
            SemanticsPropertiesKt.m(semanticsConfiguration, scrollAxisRange);
        }
    }
}

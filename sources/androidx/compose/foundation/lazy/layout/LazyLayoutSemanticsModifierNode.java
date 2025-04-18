package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import q0.a;
import q0.l;
import x0.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LazyLayoutSemanticsModifierNode extends Modifier.Node implements SemanticsModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public a f4845o;

    /* renamed from: p, reason: collision with root package name */
    public LazyLayoutSemanticState f4846p;

    /* renamed from: q, reason: collision with root package name */
    public Orientation f4847q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4848r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f4849s;

    /* renamed from: t, reason: collision with root package name */
    public ScrollAxisRange f4850t;

    /* renamed from: u, reason: collision with root package name */
    public final l f4851u = new LazyLayoutSemanticsModifierNode$indexForKeyMapping$1(this);

    /* renamed from: v, reason: collision with root package name */
    public l f4852v;

    public LazyLayoutSemanticsModifierNode(a aVar, LazyLayoutSemanticState lazyLayoutSemanticState, Orientation orientation, boolean z2, boolean z3) {
        this.f4845o = aVar;
        this.f4846p = lazyLayoutSemanticState;
        this.f4847q = orientation;
        this.f4848r = z2;
        this.f4849s = z3;
        e2();
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void B(SemanticsConfiguration semanticsConfiguration) {
        SemanticsPropertiesKt.t(semanticsConfiguration);
        semanticsConfiguration.b(SemanticsProperties.F, this.f4851u);
        if (this.f4847q == Orientation.f3394a) {
            ScrollAxisRange scrollAxisRange = this.f4850t;
            if (scrollAxisRange == null) {
                p0.a.B0("scrollAxisRange");
                throw null;
            }
            SemanticsPropertiesKt.v(semanticsConfiguration, scrollAxisRange);
        } else {
            ScrollAxisRange scrollAxisRange2 = this.f4850t;
            if (scrollAxisRange2 == null) {
                p0.a.B0("scrollAxisRange");
                throw null;
            }
            SemanticsPropertiesKt.m(semanticsConfiguration, scrollAxisRange2);
        }
        l lVar = this.f4852v;
        if (lVar != null) {
            semanticsConfiguration.b(SemanticsActions.f16796f, new AccessibilityAction(null, lVar));
        }
        SemanticsPropertiesKt.f(semanticsConfiguration, new LazyLayoutSemanticsModifierNode$applySemantics$2(this));
        CollectionInfo c2 = this.f4846p.c();
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f16836g;
        n nVar = SemanticsPropertiesKt.f16865a[20];
        semanticsPropertyKey.getClass();
        semanticsConfiguration.b(semanticsPropertyKey, c2);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean T1() {
        return false;
    }

    public final void e2() {
        this.f4850t = new ScrollAxisRange(new LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$1(this), new LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$2(this), this.f4849s);
        this.f4852v = this.f4848r ? new LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3(this) : null;
    }
}

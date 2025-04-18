package androidx.compose.foundation.text.modifiers;

import android.support.v4.media.d;
import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.foundation.text.selection.Selectable;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import b1.f0;
import e0.w;
import java.util.List;
import java.util.Map;
import p0.a;
import q0.l;
import x0.n;

@StabilityInferred
/* loaded from: classes3.dex */
public final class TextAnnotatedStringNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, SemanticsModifierNode {
    public l A;
    public Map B;
    public MultiParagraphLayoutCache C;
    public l D;
    public TextSubstitutionValue E;

    /* renamed from: o, reason: collision with root package name */
    public AnnotatedString f6969o;

    /* renamed from: p, reason: collision with root package name */
    public TextStyle f6970p;

    /* renamed from: q, reason: collision with root package name */
    public FontFamily.Resolver f6971q;

    /* renamed from: r, reason: collision with root package name */
    public l f6972r;

    /* renamed from: s, reason: collision with root package name */
    public int f6973s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f6974t;

    /* renamed from: u, reason: collision with root package name */
    public int f6975u;

    /* renamed from: v, reason: collision with root package name */
    public int f6976v;
    public List w;
    public l x;

    /* renamed from: y, reason: collision with root package name */
    public SelectionController f6977y;

    /* renamed from: z, reason: collision with root package name */
    public ColorProducer f6978z;

    @StabilityInferred
    /* loaded from: classes3.dex */
    public static final class TextSubstitutionValue {

        /* renamed from: a, reason: collision with root package name */
        public final AnnotatedString f6979a;

        /* renamed from: b, reason: collision with root package name */
        public AnnotatedString f6980b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f6981c = false;
        public MultiParagraphLayoutCache d = null;

        public TextSubstitutionValue(AnnotatedString annotatedString, AnnotatedString annotatedString2) {
            this.f6979a = annotatedString;
            this.f6980b = annotatedString2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextSubstitutionValue)) {
                return false;
            }
            TextSubstitutionValue textSubstitutionValue = (TextSubstitutionValue) obj;
            return a.g(this.f6979a, textSubstitutionValue.f6979a) && a.g(this.f6980b, textSubstitutionValue.f6980b) && this.f6981c == textSubstitutionValue.f6981c && a.g(this.d, textSubstitutionValue.d);
        }

        public final int hashCode() {
            int g2 = d.g(this.f6981c, (this.f6980b.hashCode() + (this.f6979a.hashCode() * 31)) * 31, 31);
            MultiParagraphLayoutCache multiParagraphLayoutCache = this.d;
            return g2 + (multiParagraphLayoutCache == null ? 0 : multiParagraphLayoutCache.hashCode());
        }

        public final String toString() {
            return "TextSubstitutionValue(original=" + ((Object) this.f6979a) + ", substitution=" + ((Object) this.f6980b) + ", isShowingSubstitution=" + this.f6981c + ", layoutCache=" + this.d + ')';
        }
    }

    public TextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, l lVar, int i2, boolean z2, int i3, int i4, List list, l lVar2, SelectionController selectionController, ColorProducer colorProducer, l lVar3) {
        this.f6969o = annotatedString;
        this.f6970p = textStyle;
        this.f6971q = resolver;
        this.f6972r = lVar;
        this.f6973s = i2;
        this.f6974t = z2;
        this.f6975u = i3;
        this.f6976v = i4;
        this.w = list;
        this.x = lVar2;
        this.f6977y = selectionController;
        this.f6978z = colorProducer;
        this.A = lVar3;
    }

    public static final void e2(TextAnnotatedStringNode textAnnotatedStringNode) {
        textAnnotatedStringNode.getClass();
        DelegatableNodeKt.f(textAnnotatedStringNode).K();
        DelegatableNodeKt.f(textAnnotatedStringNode).J();
        DrawModifierNodeKt.a(textAnnotatedStringNode);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int A(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return h2(intrinsicMeasureScope).a(i2, intrinsicMeasureScope.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void B(SemanticsConfiguration semanticsConfiguration) {
        l lVar = this.D;
        if (lVar == null) {
            lVar = new TextAnnotatedStringNode$applySemantics$1(this);
            this.D = lVar;
        }
        AnnotatedString annotatedString = this.f6969o;
        n[] nVarArr = SemanticsPropertiesKt.f16865a;
        semanticsConfiguration.b(SemanticsProperties.f16851v, f0.u(annotatedString));
        TextSubstitutionValue textSubstitutionValue = this.E;
        if (textSubstitutionValue != null) {
            AnnotatedString annotatedString2 = textSubstitutionValue.f6980b;
            SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.w;
            n[] nVarArr2 = SemanticsPropertiesKt.f16865a;
            n nVar = nVarArr2[14];
            semanticsPropertyKey.getClass();
            semanticsConfiguration.b(semanticsPropertyKey, annotatedString2);
            boolean z2 = textSubstitutionValue.f6981c;
            SemanticsPropertyKey semanticsPropertyKey2 = SemanticsProperties.x;
            n nVar2 = nVarArr2[15];
            Boolean valueOf = Boolean.valueOf(z2);
            semanticsPropertyKey2.getClass();
            semanticsConfiguration.b(semanticsPropertyKey2, valueOf);
        }
        semanticsConfiguration.b(SemanticsActions.f16800j, new AccessibilityAction(null, new TextAnnotatedStringNode$applySemantics$2(this)));
        semanticsConfiguration.b(SemanticsActions.f16801k, new AccessibilityAction(null, new TextAnnotatedStringNode$applySemantics$3(this)));
        semanticsConfiguration.b(SemanticsActions.f16802l, new AccessibilityAction(null, new TextAnnotatedStringNode$applySemantics$4(this)));
        SemanticsPropertiesKt.g(semanticsConfiguration, lVar);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int E(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return TextDelegateKt.a(h2(intrinsicMeasureScope).d(intrinsicMeasureScope.getLayoutDirection()).c());
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int K(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return TextDelegateKt.a(h2(intrinsicMeasureScope).d(intrinsicMeasureScope.getLayoutDirection()).b());
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final boolean f0() {
        return true;
    }

    public final void f2(boolean z2, boolean z3, boolean z4, boolean z5) {
        if (z3 || z4 || z5) {
            MultiParagraphLayoutCache g2 = g2();
            AnnotatedString annotatedString = this.f6969o;
            TextStyle textStyle = this.f6970p;
            FontFamily.Resolver resolver = this.f6971q;
            int i2 = this.f6973s;
            boolean z6 = this.f6974t;
            int i3 = this.f6975u;
            int i4 = this.f6976v;
            List list = this.w;
            g2.f6896a = annotatedString;
            g2.f6897b = textStyle;
            g2.f6898c = resolver;
            g2.d = i2;
            g2.e = z6;
            g2.f6899f = i3;
            g2.f6900g = i4;
            g2.f6901h = list;
            g2.f6905l = null;
            g2.f6907n = null;
            g2.f6909p = -1;
            g2.f6908o = -1;
        }
        if (this.f14699n) {
            if (z3 || (z2 && this.D != null)) {
                DelegatableNodeKt.f(this).K();
            }
            if (z3 || z4 || z5) {
                DelegatableNodeKt.f(this).J();
                DrawModifierNodeKt.a(this);
            }
            if (z2) {
                DrawModifierNodeKt.a(this);
            }
        }
    }

    public final MultiParagraphLayoutCache g2() {
        if (this.C == null) {
            this.C = new MultiParagraphLayoutCache(this.f6969o, this.f6970p, this.f6971q, this.f6973s, this.f6974t, this.f6975u, this.f6976v, this.w);
        }
        MultiParagraphLayoutCache multiParagraphLayoutCache = this.C;
        a.p(multiParagraphLayoutCache);
        return multiParagraphLayoutCache;
    }

    public final MultiParagraphLayoutCache h2(Density density) {
        MultiParagraphLayoutCache multiParagraphLayoutCache;
        TextSubstitutionValue textSubstitutionValue = this.E;
        if (textSubstitutionValue != null && textSubstitutionValue.f6981c && (multiParagraphLayoutCache = textSubstitutionValue.d) != null) {
            multiParagraphLayoutCache.c(density);
            return multiParagraphLayoutCache;
        }
        MultiParagraphLayoutCache g2 = g2();
        g2.c(density);
        return g2;
    }

    public final boolean i2(l lVar, l lVar2, SelectionController selectionController, l lVar3) {
        boolean z2;
        if (this.f6972r != lVar) {
            this.f6972r = lVar;
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.x != lVar2) {
            this.x = lVar2;
            z2 = true;
        }
        if (!a.g(this.f6977y, selectionController)) {
            this.f6977y = selectionController;
            z2 = true;
        }
        if (this.A == lVar3) {
            return z2;
        }
        this.A = lVar3;
        return true;
    }

    public final boolean j2(TextStyle textStyle, List list, int i2, int i3, boolean z2, FontFamily.Resolver resolver, int i4) {
        boolean z3 = !this.f6970p.d(textStyle);
        this.f6970p = textStyle;
        if (!a.g(this.w, list)) {
            this.w = list;
            z3 = true;
        }
        if (this.f6976v != i2) {
            this.f6976v = i2;
            z3 = true;
        }
        if (this.f6975u != i3) {
            this.f6975u = i3;
            z3 = true;
        }
        if (this.f6974t != z2) {
            this.f6974t = z2;
            z3 = true;
        }
        if (!a.g(this.f6971q, resolver)) {
            this.f6971q = resolver;
            z3 = true;
        }
        if (TextOverflow.a(this.f6973s, i4)) {
            return z3;
        }
        this.f6973s = i4;
        return true;
    }

    public final boolean k2(AnnotatedString annotatedString) {
        boolean z2 = true;
        boolean z3 = !a.g(this.f6969o.f16880a, annotatedString.f16880a);
        boolean z4 = !a.g(this.f6969o.b(), annotatedString.b());
        List list = this.f6969o.f16882c;
        List list2 = w.f30218a;
        if (list == null) {
            list = list2;
        }
        List list3 = annotatedString.f16882c;
        if (list3 != null) {
            list2 = list3;
        }
        boolean z5 = !a.g(list, list2);
        boolean z6 = !a.g(this.f6969o.d, annotatedString.d);
        if (!z3 && !z4 && !z5 && !z6) {
            z2 = false;
        }
        if (z2) {
            this.f6969o = annotatedString;
        }
        if (z3) {
            this.E = null;
        }
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0125  */
    @Override // androidx.compose.ui.node.LayoutModifierNode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.ui.layout.MeasureResult m(androidx.compose.ui.layout.MeasureScope r8, androidx.compose.ui.layout.Measurable r9, long r10) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.m(androidx.compose.ui.layout.MeasureScope, androidx.compose.ui.layout.Measurable, long):androidx.compose.ui.layout.MeasureResult");
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int q(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return h2(intrinsicMeasureScope).a(i2, intrinsicMeasureScope.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void z(ContentDrawScope contentDrawScope) {
        List list;
        Selection selection;
        if (this.f14699n) {
            SelectionController selectionController = this.f6977y;
            boolean z2 = false;
            if (selectionController != null && (selection = (Selection) selectionController.f6941b.b().c(selectionController.f6940a)) != null) {
                Selection.AnchorInfo anchorInfo = selection.f7084b;
                Selection.AnchorInfo anchorInfo2 = selection.f7083a;
                boolean z3 = selection.f7085c;
                int i2 = !z3 ? anchorInfo2.f7087b : anchorInfo.f7087b;
                int i3 = !z3 ? anchorInfo.f7087b : anchorInfo2.f7087b;
                if (i2 != i3) {
                    Selectable selectable = selectionController.f6943f;
                    int g2 = selectable != null ? selectable.g() : 0;
                    if (i2 > g2) {
                        i2 = g2;
                    }
                    if (i3 > g2) {
                        i3 = g2;
                    }
                    TextLayoutResult textLayoutResult = selectionController.d.f6956b;
                    AndroidPath k2 = textLayoutResult != null ? textLayoutResult.k(i2, i3) : null;
                    if (k2 != null) {
                        TextLayoutResult textLayoutResult2 = selectionController.d.f6956b;
                        if (textLayoutResult2 == null || TextOverflow.a(textLayoutResult2.f17046a.f17041f, 3) || !textLayoutResult2.d()) {
                            DrawScope.N(contentDrawScope, k2, selectionController.f6942c, 0.0f, null, 60);
                        } else {
                            float d = Size.d(contentDrawScope.b());
                            float b2 = Size.b(contentDrawScope.b());
                            CanvasDrawScope$drawContext$1 A1 = contentDrawScope.A1();
                            long b3 = A1.b();
                            A1.a().p();
                            try {
                                A1.f15139a.b(0.0f, 0.0f, d, b2, 1);
                                DrawScope.N(contentDrawScope, k2, selectionController.f6942c, 0.0f, null, 60);
                            } finally {
                                d.A(A1, b3);
                            }
                        }
                    }
                }
            }
            Canvas a2 = contentDrawScope.A1().a();
            TextLayoutResult textLayoutResult3 = h2(contentDrawScope).f6907n;
            if (textLayoutResult3 == null) {
                throw new IllegalStateException("You must call layoutWithConstraints first");
            }
            MultiParagraph multiParagraph = textLayoutResult3.f17047b;
            if (textLayoutResult3.d() && !TextOverflow.a(this.f6973s, 3)) {
                z2 = true;
            }
            if (z2) {
                long j2 = textLayoutResult3.f17048c;
                Rect a3 = RectKt.a(0L, SizeKt.a((int) (j2 >> 32), (int) (j2 & 4294967295L)));
                a2.p();
                a2.t(1, a3);
            }
            try {
                SpanStyle spanStyle = this.f6970p.f17059a;
                TextDecoration textDecoration = spanStyle.f17027m;
                if (textDecoration == null) {
                    textDecoration = TextDecoration.f17464b;
                }
                TextDecoration textDecoration2 = textDecoration;
                Shadow shadow = spanStyle.f17028n;
                if (shadow == null) {
                    shadow = Shadow.d;
                }
                Shadow shadow2 = shadow;
                DrawStyle drawStyle = spanStyle.f17030p;
                if (drawStyle == null) {
                    drawStyle = Fill.f15146a;
                }
                DrawStyle drawStyle2 = drawStyle;
                Brush e = spanStyle.f17017a.e();
                if (e != null) {
                    MultiParagraph.h(multiParagraph, a2, e, this.f6970p.f17059a.f17017a.a(), shadow2, textDecoration2, drawStyle2);
                } else {
                    ColorProducer colorProducer = this.f6978z;
                    long a4 = colorProducer != null ? colorProducer.a() : Color.f14962i;
                    if (a4 == 16) {
                        a4 = this.f6970p.b() != 16 ? this.f6970p.b() : Color.f14957b;
                    }
                    MultiParagraph.g(multiParagraph, a2, a4, shadow2, textDecoration2, drawStyle2, 0, 32);
                }
                if (z2) {
                    a2.i();
                }
                TextSubstitutionValue textSubstitutionValue = this.E;
                if (((textSubstitutionValue == null || !textSubstitutionValue.f6981c) && TextAnnotatedStringNodeKt.a(this.f6969o)) || !((list = this.w) == null || list.isEmpty())) {
                    contentDrawScope.P1();
                }
            } catch (Throwable th) {
                if (z2) {
                    a2.i();
                }
                throw th;
            }
        }
    }
}

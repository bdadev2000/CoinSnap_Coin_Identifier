package androidx.compose.foundation.text.modifiers;

import android.support.v4.media.d;
import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.foundation.text.modifiers.MinLinesConstrainer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
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
import androidx.compose.ui.text.AndroidParagraph;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import b1.f0;
import java.util.LinkedHashMap;
import java.util.Map;
import p0.a;
import q0.l;
import x0.n;

@StabilityInferred
/* loaded from: classes.dex */
public final class TextStringSimpleNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, SemanticsModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public String f6994o;

    /* renamed from: p, reason: collision with root package name */
    public TextStyle f6995p;

    /* renamed from: q, reason: collision with root package name */
    public FontFamily.Resolver f6996q;

    /* renamed from: r, reason: collision with root package name */
    public int f6997r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f6998s;

    /* renamed from: t, reason: collision with root package name */
    public int f6999t;

    /* renamed from: u, reason: collision with root package name */
    public int f7000u;

    /* renamed from: v, reason: collision with root package name */
    public ColorProducer f7001v;
    public Map w;
    public ParagraphLayoutCache x;

    /* renamed from: y, reason: collision with root package name */
    public l f7002y;

    /* renamed from: z, reason: collision with root package name */
    public TextSubstitutionValue f7003z;

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class TextSubstitutionValue {

        /* renamed from: a, reason: collision with root package name */
        public final String f7004a;

        /* renamed from: b, reason: collision with root package name */
        public String f7005b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f7006c = false;
        public ParagraphLayoutCache d = null;

        public TextSubstitutionValue(String str, String str2) {
            this.f7004a = str;
            this.f7005b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextSubstitutionValue)) {
                return false;
            }
            TextSubstitutionValue textSubstitutionValue = (TextSubstitutionValue) obj;
            return a.g(this.f7004a, textSubstitutionValue.f7004a) && a.g(this.f7005b, textSubstitutionValue.f7005b) && this.f7006c == textSubstitutionValue.f7006c && a.g(this.d, textSubstitutionValue.d);
        }

        public final int hashCode() {
            int g2 = d.g(this.f7006c, androidx.compose.foundation.text.input.a.b(this.f7005b, this.f7004a.hashCode() * 31, 31), 31);
            ParagraphLayoutCache paragraphLayoutCache = this.d;
            return g2 + (paragraphLayoutCache == null ? 0 : paragraphLayoutCache.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TextSubstitution(layoutCache=");
            sb.append(this.d);
            sb.append(", isShowingSubstitution=");
            return d.s(sb, this.f7006c, ')');
        }
    }

    public static final void e2(TextStringSimpleNode textStringSimpleNode) {
        textStringSimpleNode.getClass();
        DelegatableNodeKt.f(textStringSimpleNode).K();
        DelegatableNodeKt.f(textStringSimpleNode).J();
        DrawModifierNodeKt.a(textStringSimpleNode);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int A(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return g2(intrinsicMeasureScope).a(i2, intrinsicMeasureScope.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void B(SemanticsConfiguration semanticsConfiguration) {
        l lVar = this.f7002y;
        if (lVar == null) {
            lVar = new TextStringSimpleNode$applySemantics$1(this);
            this.f7002y = lVar;
        }
        AnnotatedString annotatedString = new AnnotatedString(this.f6994o, null, 6);
        n[] nVarArr = SemanticsPropertiesKt.f16865a;
        semanticsConfiguration.b(SemanticsProperties.f16851v, f0.u(annotatedString));
        TextSubstitutionValue textSubstitutionValue = this.f7003z;
        if (textSubstitutionValue != null) {
            boolean z2 = textSubstitutionValue.f7006c;
            SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.x;
            n[] nVarArr2 = SemanticsPropertiesKt.f16865a;
            n nVar = nVarArr2[15];
            Boolean valueOf = Boolean.valueOf(z2);
            semanticsPropertyKey.getClass();
            semanticsConfiguration.b(semanticsPropertyKey, valueOf);
            AnnotatedString annotatedString2 = new AnnotatedString(textSubstitutionValue.f7005b, null, 6);
            SemanticsPropertyKey semanticsPropertyKey2 = SemanticsProperties.w;
            n nVar2 = nVarArr2[14];
            semanticsPropertyKey2.getClass();
            semanticsConfiguration.b(semanticsPropertyKey2, annotatedString2);
        }
        semanticsConfiguration.b(SemanticsActions.f16800j, new AccessibilityAction(null, new TextStringSimpleNode$applySemantics$2(this)));
        semanticsConfiguration.b(SemanticsActions.f16801k, new AccessibilityAction(null, new TextStringSimpleNode$applySemantics$3(this)));
        semanticsConfiguration.b(SemanticsActions.f16802l, new AccessibilityAction(null, new TextStringSimpleNode$applySemantics$4(this)));
        SemanticsPropertiesKt.g(semanticsConfiguration, lVar);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int E(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return TextDelegateKt.a(g2(intrinsicMeasureScope).d(intrinsicMeasureScope.getLayoutDirection()).c());
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int K(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return TextDelegateKt.a(g2(intrinsicMeasureScope).d(intrinsicMeasureScope.getLayoutDirection()).b());
    }

    public final ParagraphLayoutCache f2() {
        if (this.x == null) {
            this.x = new ParagraphLayoutCache(this.f6994o, this.f6995p, this.f6996q, this.f6997r, this.f6998s, this.f6999t, this.f7000u);
        }
        ParagraphLayoutCache paragraphLayoutCache = this.x;
        a.p(paragraphLayoutCache);
        return paragraphLayoutCache;
    }

    public final ParagraphLayoutCache g2(Density density) {
        ParagraphLayoutCache paragraphLayoutCache;
        TextSubstitutionValue textSubstitutionValue = this.f7003z;
        if (textSubstitutionValue != null && textSubstitutionValue.f7006c && (paragraphLayoutCache = textSubstitutionValue.d) != null) {
            paragraphLayoutCache.c(density);
            return paragraphLayoutCache;
        }
        ParagraphLayoutCache f2 = f2();
        f2.c(density);
        return f2;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final MeasureResult m(MeasureScope measureScope, Measurable measurable, long j2) {
        long j3;
        ParagraphIntrinsics paragraphIntrinsics;
        ParagraphLayoutCache g2 = g2(measureScope);
        LayoutDirection layoutDirection = measureScope.getLayoutDirection();
        boolean z2 = true;
        if (g2.f6914g > 1) {
            MinLinesConstrainer minLinesConstrainer = g2.f6920m;
            TextStyle textStyle = g2.f6911b;
            Density density = g2.f6916i;
            a.p(density);
            MinLinesConstrainer a2 = MinLinesConstrainer.Companion.a(minLinesConstrainer, layoutDirection, textStyle, density, g2.f6912c);
            g2.f6920m = a2;
            j3 = a2.a(g2.f6914g, j2);
        } else {
            j3 = j2;
        }
        AndroidParagraph androidParagraph = g2.f6917j;
        boolean z3 = false;
        if (androidParagraph == null || (paragraphIntrinsics = g2.f6921n) == null || paragraphIntrinsics.a() || layoutDirection != g2.f6922o || (!Constraints.c(j3, g2.f6923p) && (Constraints.i(j3) != Constraints.i(g2.f6923p) || Constraints.h(j3) < androidParagraph.getHeight() || androidParagraph.d.d))) {
            AndroidParagraph b2 = g2.b(j3, layoutDirection);
            g2.f6923p = j3;
            g2.f6919l = ConstraintsKt.e(j3, IntSizeKt.a(TextDelegateKt.a(b2.getWidth()), TextDelegateKt.a(b2.getHeight())));
            if (!TextOverflow.a(g2.d, 3) && (((int) (r5 >> 32)) < b2.getWidth() || ((int) (r5 & 4294967295L)) < b2.getHeight())) {
                z3 = true;
            }
            g2.f6918k = z3;
            g2.f6917j = b2;
        } else {
            if (!Constraints.c(j3, g2.f6923p)) {
                AndroidParagraph androidParagraph2 = g2.f6917j;
                a.p(androidParagraph2);
                g2.f6919l = ConstraintsKt.e(j3, IntSizeKt.a(TextDelegateKt.a(Math.min(androidParagraph2.y(), androidParagraph2.getWidth())), TextDelegateKt.a(androidParagraph2.getHeight())));
                if (TextOverflow.a(g2.d, 3) || (((int) (r12 >> 32)) >= androidParagraph2.getWidth() && ((int) (r12 & 4294967295L)) >= androidParagraph2.getHeight())) {
                    z2 = false;
                }
                g2.f6918k = z2;
                g2.f6923p = j3;
            }
            z2 = false;
        }
        ParagraphIntrinsics paragraphIntrinsics2 = g2.f6921n;
        if (paragraphIntrinsics2 != null) {
            paragraphIntrinsics2.a();
        }
        AndroidParagraph androidParagraph3 = g2.f6917j;
        a.p(androidParagraph3);
        long j4 = g2.f6919l;
        if (z2) {
            DelegatableNodeKt.d(this, 2).q1();
            Map map = this.w;
            if (map == null) {
                map = new LinkedHashMap(2);
            }
            map.put(AlignmentLineKt.f15692a, Integer.valueOf(Math.round(androidParagraph3.i())));
            map.put(AlignmentLineKt.f15693b, Integer.valueOf(Math.round(androidParagraph3.r())));
            this.w = map;
        }
        int i2 = (int) (j4 >> 32);
        int i3 = (int) (j4 & 4294967295L);
        Placeable V = measurable.V(Constraints.Companion.b(i2, i2, i3, i3));
        Map map2 = this.w;
        a.p(map2);
        return measureScope.T(i2, i3, map2, new TextStringSimpleNode$measure$1(V));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int q(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return g2(intrinsicMeasureScope).a(i2, intrinsicMeasureScope.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void z(ContentDrawScope contentDrawScope) {
        if (this.f14699n) {
            ParagraphLayoutCache g2 = g2(contentDrawScope);
            AndroidParagraph androidParagraph = g2.f6917j;
            if (androidParagraph == null) {
                throw new IllegalArgumentException(("no paragraph (layoutCache=" + this.x + ", textSubstitution=" + this.f7003z + ')').toString());
            }
            Canvas a2 = contentDrawScope.A1().a();
            boolean z2 = g2.f6918k;
            if (z2) {
                long j2 = g2.f6919l;
                a2.p();
                a2.f(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L), 1);
            }
            try {
                SpanStyle spanStyle = this.f6995p.f17059a;
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
                    androidParagraph.p(a2, e, this.f6995p.f17059a.f17017a.a(), shadow2, textDecoration2, drawStyle2, 3);
                } else {
                    ColorProducer colorProducer = this.f7001v;
                    long a3 = colorProducer != null ? colorProducer.a() : Color.f14962i;
                    if (a3 == 16) {
                        a3 = this.f6995p.b() != 16 ? this.f6995p.b() : Color.f14957b;
                    }
                    androidParagraph.g(a2, a3, shadow2, textDecoration2, drawStyle2, 3);
                }
                if (z2) {
                    a2.i();
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

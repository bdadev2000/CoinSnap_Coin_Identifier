package androidx.compose.foundation.text.modifiers;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSizeKt;
import p0.a;

@StabilityInferred
/* loaded from: classes4.dex */
public final class TextStringSimpleElement extends ModifierNodeElement<TextStringSimpleNode> {

    /* renamed from: a, reason: collision with root package name */
    public final String f6987a;

    /* renamed from: b, reason: collision with root package name */
    public final TextStyle f6988b;

    /* renamed from: c, reason: collision with root package name */
    public final FontFamily.Resolver f6989c;
    public final int d;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6990f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6991g;

    /* renamed from: h, reason: collision with root package name */
    public final int f6992h;

    /* renamed from: i, reason: collision with root package name */
    public final ColorProducer f6993i;

    public TextStringSimpleElement(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i2, boolean z2, int i3, int i4, ColorProducer colorProducer) {
        this.f6987a = str;
        this.f6988b = textStyle;
        this.f6989c = resolver;
        this.d = i2;
        this.f6990f = z2;
        this.f6991g = i3;
        this.f6992h = i4;
        this.f6993i = colorProducer;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.text.modifiers.TextStringSimpleNode, androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ?? node = new Modifier.Node();
        node.f6994o = this.f6987a;
        node.f6995p = this.f6988b;
        node.f6996q = this.f6989c;
        node.f6997r = this.d;
        node.f6998s = this.f6990f;
        node.f6999t = this.f6991g;
        node.f7000u = this.f6992h;
        node.f7001v = this.f6993i;
        return node;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        boolean z2;
        TextStringSimpleNode textStringSimpleNode = (TextStringSimpleNode) node;
        ColorProducer colorProducer = textStringSimpleNode.f7001v;
        ColorProducer colorProducer2 = this.f6993i;
        boolean z3 = true;
        boolean z4 = !a.g(colorProducer2, colorProducer);
        textStringSimpleNode.f7001v = colorProducer2;
        TextStyle textStyle = this.f6988b;
        boolean z5 = z4 || !textStyle.c(textStringSimpleNode.f6995p);
        String str = textStringSimpleNode.f6994o;
        String str2 = this.f6987a;
        if (a.g(str, str2)) {
            z2 = false;
        } else {
            textStringSimpleNode.f6994o = str2;
            textStringSimpleNode.f7003z = null;
            z2 = true;
        }
        boolean z6 = !textStringSimpleNode.f6995p.d(textStyle);
        textStringSimpleNode.f6995p = textStyle;
        int i2 = textStringSimpleNode.f7000u;
        int i3 = this.f6992h;
        if (i2 != i3) {
            textStringSimpleNode.f7000u = i3;
            z6 = true;
        }
        int i4 = textStringSimpleNode.f6999t;
        int i5 = this.f6991g;
        if (i4 != i5) {
            textStringSimpleNode.f6999t = i5;
            z6 = true;
        }
        boolean z7 = textStringSimpleNode.f6998s;
        boolean z8 = this.f6990f;
        if (z7 != z8) {
            textStringSimpleNode.f6998s = z8;
            z6 = true;
        }
        FontFamily.Resolver resolver = textStringSimpleNode.f6996q;
        FontFamily.Resolver resolver2 = this.f6989c;
        if (!a.g(resolver, resolver2)) {
            textStringSimpleNode.f6996q = resolver2;
            z6 = true;
        }
        int i6 = textStringSimpleNode.f6997r;
        int i7 = this.d;
        if (TextOverflow.a(i6, i7)) {
            z3 = z6;
        } else {
            textStringSimpleNode.f6997r = i7;
        }
        if (z2 || z3) {
            ParagraphLayoutCache f2 = textStringSimpleNode.f2();
            String str3 = textStringSimpleNode.f6994o;
            TextStyle textStyle2 = textStringSimpleNode.f6995p;
            FontFamily.Resolver resolver3 = textStringSimpleNode.f6996q;
            int i8 = textStringSimpleNode.f6997r;
            boolean z9 = textStringSimpleNode.f6998s;
            int i9 = textStringSimpleNode.f6999t;
            int i10 = textStringSimpleNode.f7000u;
            f2.f6910a = str3;
            f2.f6911b = textStyle2;
            f2.f6912c = resolver3;
            f2.d = i8;
            f2.e = z9;
            f2.f6913f = i9;
            f2.f6914g = i10;
            f2.f6917j = null;
            f2.f6921n = null;
            f2.f6922o = null;
            f2.f6924q = -1;
            f2.f6925r = -1;
            f2.f6923p = Constraints.Companion.c(0, 0);
            f2.f6919l = IntSizeKt.a(0, 0);
            f2.f6918k = false;
        }
        if (textStringSimpleNode.f14699n) {
            if (z2 || (z5 && textStringSimpleNode.f7002y != null)) {
                DelegatableNodeKt.f(textStringSimpleNode).K();
            }
            if (z2 || z3) {
                DelegatableNodeKt.f(textStringSimpleNode).J();
                DrawModifierNodeKt.a(textStringSimpleNode);
            }
            if (z5) {
                DrawModifierNodeKt.a(textStringSimpleNode);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        return a.g(this.f6993i, textStringSimpleElement.f6993i) && a.g(this.f6987a, textStringSimpleElement.f6987a) && a.g(this.f6988b, textStringSimpleElement.f6988b) && a.g(this.f6989c, textStringSimpleElement.f6989c) && TextOverflow.a(this.d, textStringSimpleElement.d) && this.f6990f == textStringSimpleElement.f6990f && this.f6991g == textStringSimpleElement.f6991g && this.f6992h == textStringSimpleElement.f6992h;
    }

    public final int hashCode() {
        int g2 = (((d.g(this.f6990f, d.c(this.d, (this.f6989c.hashCode() + ((this.f6988b.hashCode() + (this.f6987a.hashCode() * 31)) * 31)) * 31, 31), 31) + this.f6991g) * 31) + this.f6992h) * 31;
        ColorProducer colorProducer = this.f6993i;
        return g2 + (colorProducer != null ? colorProducer.hashCode() : 0);
    }
}

package androidx.compose.foundation.text.modifiers;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import java.util.List;
import p0.a;
import q0.l;

@StabilityInferred
/* loaded from: classes4.dex */
public final class TextAnnotatedStringElement extends ModifierNodeElement<TextAnnotatedStringNode> {

    /* renamed from: a, reason: collision with root package name */
    public final AnnotatedString f6957a;

    /* renamed from: b, reason: collision with root package name */
    public final TextStyle f6958b;

    /* renamed from: c, reason: collision with root package name */
    public final FontFamily.Resolver f6959c;
    public final l d;

    /* renamed from: f, reason: collision with root package name */
    public final int f6960f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f6961g;

    /* renamed from: h, reason: collision with root package name */
    public final int f6962h;

    /* renamed from: i, reason: collision with root package name */
    public final int f6963i;

    /* renamed from: j, reason: collision with root package name */
    public final List f6964j;

    /* renamed from: k, reason: collision with root package name */
    public final l f6965k;

    /* renamed from: l, reason: collision with root package name */
    public final SelectionController f6966l = null;

    /* renamed from: m, reason: collision with root package name */
    public final ColorProducer f6967m;

    /* renamed from: n, reason: collision with root package name */
    public final l f6968n;

    public TextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, l lVar, int i2, boolean z2, int i3, int i4, List list, l lVar2, ColorProducer colorProducer, l lVar3) {
        this.f6957a = annotatedString;
        this.f6958b = textStyle;
        this.f6959c = resolver;
        this.d = lVar;
        this.f6960f = i2;
        this.f6961g = z2;
        this.f6962h = i3;
        this.f6963i = i4;
        this.f6964j = list;
        this.f6965k = lVar2;
        this.f6967m = colorProducer;
        this.f6968n = lVar3;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new TextAnnotatedStringNode(this.f6957a, this.f6958b, this.f6959c, this.d, this.f6960f, this.f6961g, this.f6962h, this.f6963i, this.f6964j, this.f6965k, this.f6966l, this.f6967m, this.f6968n);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        TextAnnotatedStringNode textAnnotatedStringNode = (TextAnnotatedStringNode) node;
        ColorProducer colorProducer = textAnnotatedStringNode.f6978z;
        ColorProducer colorProducer2 = this.f6967m;
        boolean z2 = true;
        boolean z3 = !a.g(colorProducer2, colorProducer);
        textAnnotatedStringNode.f6978z = colorProducer2;
        if (!z3) {
            if (this.f6958b.c(textAnnotatedStringNode.f6970p)) {
                z2 = false;
            }
        }
        textAnnotatedStringNode.f2(z2, textAnnotatedStringNode.k2(this.f6957a), textAnnotatedStringNode.j2(this.f6958b, this.f6964j, this.f6963i, this.f6962h, this.f6961g, this.f6959c, this.f6960f), textAnnotatedStringNode.i2(this.d, this.f6965k, this.f6966l, this.f6968n));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        return a.g(this.f6967m, textAnnotatedStringElement.f6967m) && a.g(this.f6957a, textAnnotatedStringElement.f6957a) && a.g(this.f6958b, textAnnotatedStringElement.f6958b) && a.g(this.f6964j, textAnnotatedStringElement.f6964j) && a.g(this.f6959c, textAnnotatedStringElement.f6959c) && this.d == textAnnotatedStringElement.d && this.f6968n == textAnnotatedStringElement.f6968n && TextOverflow.a(this.f6960f, textAnnotatedStringElement.f6960f) && this.f6961g == textAnnotatedStringElement.f6961g && this.f6962h == textAnnotatedStringElement.f6962h && this.f6963i == textAnnotatedStringElement.f6963i && this.f6965k == textAnnotatedStringElement.f6965k && a.g(this.f6966l, textAnnotatedStringElement.f6966l);
    }

    public final int hashCode() {
        int hashCode = (this.f6959c.hashCode() + ((this.f6958b.hashCode() + (this.f6957a.hashCode() * 31)) * 31)) * 31;
        l lVar = this.d;
        int g2 = (((d.g(this.f6961g, d.c(this.f6960f, (hashCode + (lVar != null ? lVar.hashCode() : 0)) * 31, 31), 31) + this.f6962h) * 31) + this.f6963i) * 31;
        List list = this.f6964j;
        int hashCode2 = (g2 + (list != null ? list.hashCode() : 0)) * 31;
        l lVar2 = this.f6965k;
        int hashCode3 = (hashCode2 + (lVar2 != null ? lVar2.hashCode() : 0)) * 31;
        SelectionController selectionController = this.f6966l;
        int hashCode4 = (hashCode3 + (selectionController != null ? selectionController.hashCode() : 0)) * 31;
        ColorProducer colorProducer = this.f6967m;
        int hashCode5 = (hashCode4 + (colorProducer != null ? colorProducer.hashCode() : 0)) * 31;
        l lVar3 = this.f6968n;
        return hashCode5 + (lVar3 != null ? lVar3.hashCode() : 0);
    }
}

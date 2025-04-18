package androidx.compose.foundation.text.modifiers;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.DelegatableNodeKt;
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
public final class SelectableTextAnnotatedStringElement extends ModifierNodeElement<SelectableTextAnnotatedStringNode> {

    /* renamed from: a, reason: collision with root package name */
    public final AnnotatedString f6926a;

    /* renamed from: b, reason: collision with root package name */
    public final TextStyle f6927b;

    /* renamed from: c, reason: collision with root package name */
    public final FontFamily.Resolver f6928c;
    public final l d;

    /* renamed from: f, reason: collision with root package name */
    public final int f6929f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f6930g;

    /* renamed from: h, reason: collision with root package name */
    public final int f6931h;

    /* renamed from: i, reason: collision with root package name */
    public final int f6932i;

    /* renamed from: j, reason: collision with root package name */
    public final List f6933j;

    /* renamed from: k, reason: collision with root package name */
    public final l f6934k;

    /* renamed from: l, reason: collision with root package name */
    public final SelectionController f6935l;

    /* renamed from: m, reason: collision with root package name */
    public final ColorProducer f6936m;

    public SelectableTextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, l lVar, int i2, boolean z2, int i3, int i4, List list, l lVar2, SelectionController selectionController, ColorProducer colorProducer) {
        this.f6926a = annotatedString;
        this.f6927b = textStyle;
        this.f6928c = resolver;
        this.d = lVar;
        this.f6929f = i2;
        this.f6930g = z2;
        this.f6931h = i3;
        this.f6932i = i4;
        this.f6933j = list;
        this.f6934k = lVar2;
        this.f6935l = selectionController;
        this.f6936m = colorProducer;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new SelectableTextAnnotatedStringNode(this.f6926a, this.f6927b, this.f6928c, this.d, this.f6929f, this.f6930g, this.f6931h, this.f6932i, this.f6933j, this.f6934k, this.f6935l, this.f6936m);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        SelectableTextAnnotatedStringNode selectableTextAnnotatedStringNode = (SelectableTextAnnotatedStringNode) node;
        TextStyle textStyle = this.f6927b;
        List list = this.f6933j;
        int i2 = this.f6932i;
        int i3 = this.f6931h;
        boolean z2 = this.f6930g;
        FontFamily.Resolver resolver = this.f6928c;
        int i4 = this.f6929f;
        TextAnnotatedStringNode textAnnotatedStringNode = selectableTextAnnotatedStringNode.f6939s;
        ColorProducer colorProducer = textAnnotatedStringNode.f6978z;
        ColorProducer colorProducer2 = this.f6936m;
        boolean z3 = true;
        boolean z4 = !a.g(colorProducer2, colorProducer);
        textAnnotatedStringNode.f6978z = colorProducer2;
        if (!z4 && textStyle.c(textAnnotatedStringNode.f6970p)) {
            z3 = false;
        }
        boolean k2 = textAnnotatedStringNode.k2(this.f6926a);
        boolean j2 = selectableTextAnnotatedStringNode.f6939s.j2(textStyle, list, i2, i3, z2, resolver, i4);
        l lVar = selectableTextAnnotatedStringNode.f6938r;
        l lVar2 = this.d;
        l lVar3 = this.f6934k;
        SelectionController selectionController = this.f6935l;
        textAnnotatedStringNode.f2(z3, k2, j2, textAnnotatedStringNode.i2(lVar2, lVar3, selectionController, lVar));
        selectableTextAnnotatedStringNode.f6937q = selectionController;
        DelegatableNodeKt.f(selectableTextAnnotatedStringNode).J();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectableTextAnnotatedStringElement)) {
            return false;
        }
        SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement = (SelectableTextAnnotatedStringElement) obj;
        return a.g(this.f6936m, selectableTextAnnotatedStringElement.f6936m) && a.g(this.f6926a, selectableTextAnnotatedStringElement.f6926a) && a.g(this.f6927b, selectableTextAnnotatedStringElement.f6927b) && a.g(this.f6933j, selectableTextAnnotatedStringElement.f6933j) && a.g(this.f6928c, selectableTextAnnotatedStringElement.f6928c) && this.d == selectableTextAnnotatedStringElement.d && TextOverflow.a(this.f6929f, selectableTextAnnotatedStringElement.f6929f) && this.f6930g == selectableTextAnnotatedStringElement.f6930g && this.f6931h == selectableTextAnnotatedStringElement.f6931h && this.f6932i == selectableTextAnnotatedStringElement.f6932i && this.f6934k == selectableTextAnnotatedStringElement.f6934k && a.g(this.f6935l, selectableTextAnnotatedStringElement.f6935l);
    }

    public final int hashCode() {
        int hashCode = (this.f6928c.hashCode() + ((this.f6927b.hashCode() + (this.f6926a.hashCode() * 31)) * 31)) * 31;
        l lVar = this.d;
        int g2 = (((d.g(this.f6930g, d.c(this.f6929f, (hashCode + (lVar != null ? lVar.hashCode() : 0)) * 31, 31), 31) + this.f6931h) * 31) + this.f6932i) * 31;
        List list = this.f6933j;
        int hashCode2 = (g2 + (list != null ? list.hashCode() : 0)) * 31;
        l lVar2 = this.f6934k;
        int hashCode3 = (hashCode2 + (lVar2 != null ? lVar2.hashCode() : 0)) * 31;
        SelectionController selectionController = this.f6935l;
        int hashCode4 = (hashCode3 + (selectionController != null ? selectionController.hashCode() : 0)) * 31;
        ColorProducer colorProducer = this.f6936m;
        return hashCode4 + (colorProducer != null ? colorProducer.hashCode() : 0);
    }

    public final String toString() {
        return "SelectableTextAnnotatedStringElement(text=" + ((Object) this.f6926a) + ", style=" + this.f6927b + ", fontFamilyResolver=" + this.f6928c + ", onTextLayout=" + this.d + ", overflow=" + ((Object) TextOverflow.b(this.f6929f)) + ", softWrap=" + this.f6930g + ", maxLines=" + this.f6931h + ", minLines=" + this.f6932i + ", placeholders=" + this.f6933j + ", onPlaceholderLayout=" + this.f6934k + ", selectionController=" + this.f6935l + ", color=" + this.f6936m + ')';
    }
}

package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;

/* loaded from: classes2.dex */
final class PaddingValuesElement extends ModifierNodeElement<PaddingValuesModifier> {

    /* renamed from: a, reason: collision with root package name */
    public final PaddingValues f4075a;

    public PaddingValuesElement(PaddingValues paddingValues) {
        this.f4075a = paddingValues;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.layout.PaddingValuesModifier, androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ?? node = new Modifier.Node();
        node.f4080o = this.f4075a;
        return node;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        ((PaddingValuesModifier) node).f4080o = this.f4075a;
    }

    public final boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement = obj instanceof PaddingValuesElement ? (PaddingValuesElement) obj : null;
        if (paddingValuesElement == null) {
            return false;
        }
        return p0.a.g(this.f4075a, paddingValuesElement.f4075a);
    }

    public final int hashCode() {
        return this.f4075a.hashCode();
    }
}

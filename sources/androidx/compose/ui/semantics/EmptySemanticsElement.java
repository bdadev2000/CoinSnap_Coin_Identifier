package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;

@StabilityInferred
/* loaded from: classes3.dex */
public final class EmptySemanticsElement extends ModifierNodeElement<EmptySemanticsModifier> {

    /* renamed from: a, reason: collision with root package name */
    public final EmptySemanticsModifier f16784a;

    public EmptySemanticsElement(EmptySemanticsModifier emptySemanticsModifier) {
        this.f16784a = emptySemanticsModifier;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return this.f16784a;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final /* bridge */ /* synthetic */ void b(Modifier.Node node) {
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }
}

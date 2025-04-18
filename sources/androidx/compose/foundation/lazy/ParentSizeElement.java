package androidx.compose.foundation.lazy;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import p0.a;

/* loaded from: classes2.dex */
final class ParentSizeElement extends ModifierNodeElement<ParentSizeNode> {

    /* renamed from: a, reason: collision with root package name */
    public final float f4436a;

    /* renamed from: b, reason: collision with root package name */
    public final State f4437b;

    /* renamed from: c, reason: collision with root package name */
    public final State f4438c = null;

    public ParentSizeElement(float f2, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState) {
        this.f4436a = f2;
        this.f4437b = parcelableSnapshotMutableIntState;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.lazy.ParentSizeNode, androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ?? node = new Modifier.Node();
        node.f4439o = this.f4436a;
        node.f4440p = this.f4437b;
        node.f4441q = this.f4438c;
        return node;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        ParentSizeNode parentSizeNode = (ParentSizeNode) node;
        parentSizeNode.f4439o = this.f4436a;
        parentSizeNode.f4440p = this.f4437b;
        parentSizeNode.f4441q = this.f4438c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParentSizeElement)) {
            return false;
        }
        ParentSizeElement parentSizeElement = (ParentSizeElement) obj;
        return this.f4436a == parentSizeElement.f4436a && a.g(this.f4437b, parentSizeElement.f4437b) && a.g(this.f4438c, parentSizeElement.f4438c);
    }

    public final int hashCode() {
        State state = this.f4437b;
        int hashCode = (state != null ? state.hashCode() : 0) * 31;
        State state2 = this.f4438c;
        return Float.hashCode(this.f4436a) + ((hashCode + (state2 != null ? state2.hashCode() : 0)) * 31);
    }
}

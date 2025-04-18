package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;

@StabilityInferred
/* loaded from: classes.dex */
public final class TabIndicatorModifier extends ModifierNodeElement<TabIndicatorOffsetNode> {

    /* renamed from: a, reason: collision with root package name */
    public final State f11708a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11709b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11710c;

    public TabIndicatorModifier(ParcelableSnapshotMutableState parcelableSnapshotMutableState, int i2, boolean z2) {
        this.f11708a = parcelableSnapshotMutableState;
        this.f11709b = i2;
        this.f11710c = z2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.material3.TabIndicatorOffsetNode, androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ?? node = new Modifier.Node();
        node.f11711o = this.f11708a;
        node.f11712p = this.f11709b;
        node.f11713q = this.f11710c;
        return node;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        TabIndicatorOffsetNode tabIndicatorOffsetNode = (TabIndicatorOffsetNode) node;
        tabIndicatorOffsetNode.f11711o = this.f11708a;
        tabIndicatorOffsetNode.f11712p = this.f11709b;
        tabIndicatorOffsetNode.f11713q = this.f11710c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabIndicatorModifier)) {
            return false;
        }
        TabIndicatorModifier tabIndicatorModifier = (TabIndicatorModifier) obj;
        return p0.a.g(this.f11708a, tabIndicatorModifier.f11708a) && this.f11709b == tabIndicatorModifier.f11709b && this.f11710c == tabIndicatorModifier.f11710c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11710c) + d.c(this.f11709b, this.f11708a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TabIndicatorModifier(tabPositionsState=");
        sb.append(this.f11708a);
        sb.append(", selectedTabIndex=");
        sb.append(this.f11709b);
        sb.append(", followContentSize=");
        return d.s(sb, this.f11710c, ')');
    }
}

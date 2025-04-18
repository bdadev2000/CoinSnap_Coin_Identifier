package androidx.compose.ui.node;

/* loaded from: classes4.dex */
public final class NodeKind<T> {
    public final boolean equals(Object obj) {
        if (!(obj instanceof NodeKind)) {
            return false;
        }
        ((NodeKind) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(0);
    }

    public final String toString() {
        return "NodeKind(mask=0)";
    }
}

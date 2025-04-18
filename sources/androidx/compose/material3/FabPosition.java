package androidx.compose.material3;

/* loaded from: classes4.dex */
public final class FabPosition {

    /* loaded from: classes4.dex */
    public static final class Companion {
    }

    public static final boolean a(int i2, int i3) {
        return i2 == i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FabPosition)) {
            return false;
        }
        ((FabPosition) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(0);
    }

    public final String toString() {
        return a(0, 0) ? "FabPosition.Start" : a(0, 1) ? "FabPosition.Center" : a(0, 2) ? "FabPosition.End" : "FabPosition.EndOverlay";
    }
}

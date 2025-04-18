package androidx.compose.ui.node;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class Snake {
    public static final int a(int[] iArr) {
        return Math.min(iArr[2] - iArr[0], iArr[3] - iArr[1]);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Snake)) {
            return false;
        }
        ((Snake) obj).getClass();
        return p0.a.g(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode((int[]) null);
    }

    public final String toString() {
        throw null;
    }
}

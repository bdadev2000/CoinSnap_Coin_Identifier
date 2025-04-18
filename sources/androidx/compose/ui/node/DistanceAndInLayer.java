package androidx.compose.ui.node;

/* loaded from: classes3.dex */
final class DistanceAndInLayer {
    public static final int a(long j2, long j3) {
        boolean z2 = ((int) (j2 & 4294967295L)) != 0;
        return z2 != (((int) (4294967295L & j3)) != 0) ? z2 ? -1 : 1 : (int) Math.signum(Float.intBitsToFloat((int) (j2 >> 32)) - Float.intBitsToFloat((int) (j3 >> 32)));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DistanceAndInLayer)) {
            return false;
        }
        ((DistanceAndInLayer) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(0L);
    }

    public final String toString() {
        return "DistanceAndInLayer(packedValue=0)";
    }
}

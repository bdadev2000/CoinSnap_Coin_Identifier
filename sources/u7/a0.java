package u7;

/* loaded from: classes3.dex */
public final class a0 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a0.class != obj.getClass()) {
            return false;
        }
        if (Float.compare(0.0f, 0.0f) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(0.0f) + 16337;
    }
}

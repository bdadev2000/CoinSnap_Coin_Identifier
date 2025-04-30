package androidx.lifecycle;

/* renamed from: androidx.lifecycle.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0501k {
    public static EnumC0503m a(EnumC0504n enumC0504n) {
        G7.j.e(enumC0504n, "state");
        int ordinal = enumC0504n.ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                if (ordinal != 4) {
                    return null;
                }
                return EnumC0503m.ON_PAUSE;
            }
            return EnumC0503m.ON_STOP;
        }
        return EnumC0503m.ON_DESTROY;
    }

    public static EnumC0503m b(EnumC0504n enumC0504n) {
        G7.j.e(enumC0504n, "state");
        int ordinal = enumC0504n.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    return null;
                }
                return EnumC0503m.ON_RESUME;
            }
            return EnumC0503m.ON_START;
        }
        return EnumC0503m.ON_CREATE;
    }

    public static EnumC0503m c(EnumC0504n enumC0504n) {
        G7.j.e(enumC0504n, "state");
        int ordinal = enumC0504n.ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                if (ordinal != 4) {
                    return null;
                }
                return EnumC0503m.ON_RESUME;
            }
            return EnumC0503m.ON_START;
        }
        return EnumC0503m.ON_CREATE;
    }
}

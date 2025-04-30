package r8;

import org.conscrypt.Conscrypt;

/* loaded from: classes3.dex */
public abstract class e {
    public static boolean a() {
        Conscrypt.Version version = Conscrypt.version();
        if (version.major() != 2) {
            if (version.major() > 2) {
                return true;
            }
            return false;
        }
        if (version.minor() != 1) {
            if (version.minor() > 1) {
                return true;
            }
            return false;
        }
        if (version.patch() >= 0) {
            return true;
        }
        return false;
    }

    public static boolean b() {
        return g.f22937d;
    }
}

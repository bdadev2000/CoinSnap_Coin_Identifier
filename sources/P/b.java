package P;

import android.os.Build;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f2259a = 0;

    static {
        int i9 = Build.VERSION.SDK_INT;
        a aVar = a.f2258a;
        if (i9 >= 30) {
            aVar.a(30);
        }
        if (i9 >= 30) {
            aVar.a(31);
        }
        if (i9 >= 30) {
            aVar.a(33);
        }
        if (i9 >= 30) {
            aVar.a(1000000);
        }
    }

    public static final boolean a(String str, String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = str2.toUpperCase(locale);
        G7.j.d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = str.toUpperCase(locale);
        G7.j.d(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        if (upperCase.compareTo(upperCase2) < 0) {
            return false;
        }
        return true;
    }

    public static final boolean b() {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 < 31) {
            if (i9 >= 30) {
                String str = Build.VERSION.CODENAME;
                G7.j.d(str, "CODENAME");
                if (a("S", str)) {
                }
            }
            return false;
        }
        return true;
    }
}

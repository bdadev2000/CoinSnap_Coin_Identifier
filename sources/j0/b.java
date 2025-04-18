package j0;

import android.os.Build;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationKt;

/* loaded from: classes.dex */
public abstract class b {
    public static final /* synthetic */ int a = 0;

    static {
        int i10 = Build.VERSION.SDK_INT;
        a aVar = a.a;
        if (i10 >= 30) {
            aVar.a(30);
        }
        if (i10 >= 30) {
            aVar.a(31);
        }
        if (i10 >= 30) {
            aVar.a(33);
        }
        if (i10 >= 30) {
            aVar.a(DurationKt.NANOS_IN_MILLIS);
        }
    }

    public static final boolean a(String codename, String buildCodename) {
        Intrinsics.checkNotNullParameter(codename, "codename");
        Intrinsics.checkNotNullParameter(buildCodename, "buildCodename");
        if (Intrinsics.areEqual("REL", buildCodename)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = buildCodename.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = codename.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        if (upperCase.compareTo(upperCase2) < 0) {
            return false;
        }
        return true;
    }

    public static final boolean b() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 31) {
            if (i10 >= 30) {
                String CODENAME = Build.VERSION.CODENAME;
                Intrinsics.checkNotNullExpressionValue(CODENAME, "CODENAME");
                if (a("S", CODENAME)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean c() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 33) {
            if (i10 >= 32) {
                String CODENAME = Build.VERSION.CODENAME;
                Intrinsics.checkNotNullExpressionValue(CODENAME, "CODENAME");
                if (a("Tiramisu", CODENAME)) {
                }
            }
            return false;
        }
        return true;
    }
}

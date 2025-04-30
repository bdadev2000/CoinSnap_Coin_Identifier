package U0;

import android.content.pm.PackageInfo;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class j extends c {

    /* renamed from: d, reason: collision with root package name */
    public final Pattern f3108d;

    public j() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.f3108d = Pattern.compile("\\A\\d+");
    }

    @Override // U0.c
    public final boolean a() {
        if (Build.VERSION.SDK_INT >= 33) {
            return true;
        }
        return false;
    }

    @Override // U0.c
    public final boolean b() {
        int i9;
        PackageInfo packageInfo;
        boolean b = super.b();
        if (b && (i9 = Build.VERSION.SDK_INT) < 29) {
            int i10 = T0.e.f2954a;
            if (i9 >= 26) {
                packageInfo = d.a();
            } else {
                try {
                    packageInfo = T0.e.b();
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    packageInfo = null;
                }
            }
            if (packageInfo == null) {
                return false;
            }
            Matcher matcher = this.f3108d.matcher(packageInfo.versionName);
            if (!matcher.find() || Integer.parseInt(packageInfo.versionName.substring(matcher.start(), matcher.end())) < 105) {
                return false;
            }
            return true;
        }
        return b;
    }
}

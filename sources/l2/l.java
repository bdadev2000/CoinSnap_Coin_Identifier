package l2;

import android.content.pm.PackageInfo;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class l extends c {

    /* renamed from: d, reason: collision with root package name */
    public final Pattern f21117d;

    public l() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.f21117d = Pattern.compile("\\A\\d+");
    }

    @Override // l2.c
    public final boolean a() {
        return Build.VERSION.SDK_INT >= 33;
    }

    @Override // l2.c
    public final boolean b() {
        int i10;
        PackageInfo packageInfo;
        boolean b3 = super.b();
        if (b3 && (i10 = Build.VERSION.SDK_INT) < 29) {
            int i11 = k2.e.a;
            if (i10 >= 26) {
                packageInfo = e.a();
            } else {
                try {
                    packageInfo = k2.e.b();
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    packageInfo = null;
                }
            }
            if (packageInfo == null) {
                return false;
            }
            Matcher matcher = this.f21117d.matcher(packageInfo.versionName);
            if (!matcher.find() || Integer.parseInt(packageInfo.versionName.substring(matcher.start(), matcher.end())) < 105) {
                return false;
            }
            return true;
        }
        return b3;
    }
}

package u1;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* loaded from: classes.dex */
public abstract class h {
    public static PackageInfo a(PackageManager packageManager, Context context) throws PackageManager.NameNotFoundException {
        PackageManager.PackageInfoFlags of2;
        PackageInfo packageInfo;
        String packageName = context.getPackageName();
        of2 = PackageManager.PackageInfoFlags.of(0L);
        packageInfo = packageManager.getPackageInfo(packageName, of2);
        return packageInfo;
    }
}

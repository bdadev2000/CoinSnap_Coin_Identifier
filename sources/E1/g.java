package e1;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final String f20035a = androidx.work.o.g("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z8) {
        int i9;
        String str;
        String str2 = "disabled";
        String str3 = f20035a;
        try {
            PackageManager packageManager = context.getPackageManager();
            ComponentName componentName = new ComponentName(context, cls.getName());
            if (z8) {
                i9 = 1;
            } else {
                i9 = 2;
            }
            packageManager.setComponentEnabledSetting(componentName, i9, 1);
            androidx.work.o e4 = androidx.work.o.e();
            String name = cls.getName();
            if (!z8) {
                str = "disabled";
            } else {
                str = "enabled";
            }
            e4.b(str3, name + " " + str, new Throwable[0]);
        } catch (Exception e9) {
            androidx.work.o e10 = androidx.work.o.e();
            String name2 = cls.getName();
            if (z8) {
                str2 = "enabled";
            }
            e10.b(str3, com.mbridge.msdk.foundation.entity.o.k(name2, " could not be ", str2), e9);
        }
    }
}

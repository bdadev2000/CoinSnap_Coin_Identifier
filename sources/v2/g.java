package v2;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;

/* loaded from: classes.dex */
public abstract class g {
    public static final String a = androidx.work.p.g("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z10) {
        int i10;
        Object obj;
        String str = "enabled";
        String str2 = a;
        try {
            PackageManager packageManager = context.getPackageManager();
            ComponentName componentName = new ComponentName(context, cls.getName());
            if (z10) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            packageManager.setComponentEnabledSetting(componentName, i10, 1);
            androidx.work.p e2 = androidx.work.p.e();
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            if (z10) {
                obj = "enabled";
            } else {
                obj = "disabled";
            }
            objArr[1] = obj;
            e2.b(str2, String.format("%s %s", objArr), new Throwable[0]);
        } catch (Exception e10) {
            androidx.work.p e11 = androidx.work.p.e();
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            if (!z10) {
                str = "disabled";
            }
            objArr2[1] = str;
            e11.b(str2, String.format("%s could not be %s", objArr2), e10);
        }
    }
}

package androidx.work.impl.utils;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.Logger;

/* loaded from: classes.dex */
public class PackageManagerHelper {

    /* renamed from: a, reason: collision with root package name */
    public static final String f22194a = Logger.e("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z2) {
        String str = f22194a;
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z2 ? 1 : 2, 1);
            Logger c2 = Logger.c();
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            objArr[1] = z2 ? "enabled" : "disabled";
            c2.a(str, String.format("%s %s", objArr), new Throwable[0]);
        } catch (Exception e) {
            Logger c3 = Logger.c();
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            objArr2[1] = z2 ? "enabled" : "disabled";
            c3.a(str, String.format("%s could not be %s", objArr2), e);
        }
    }
}

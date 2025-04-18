package androidx.core.content;

import android.content.Context;
import android.os.Process;
import androidx.annotation.RestrictTo;
import androidx.core.app.AppOpsManagerCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class PermissionChecker {

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes2.dex */
    public @interface PermissionResult {
    }

    public static int a(Context context, String str) {
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        String c2 = AppOpsManagerCompat.c(str);
        if (c2 != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            if (((Process.myUid() == myUid && Objects.equals(context.getPackageName(), packageName)) ? AppOpsManagerCompat.a(myUid, context, c2, packageName) : AppOpsManagerCompat.b(context, c2, packageName)) != 0) {
                return -2;
            }
        }
        return 0;
    }
}

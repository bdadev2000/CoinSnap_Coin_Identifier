package androidx.ads.identifier;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class AdvertisingIdUtils {
    public static final String GET_AD_ID_ACTION = "androidx.ads.identifier.provider.GET_AD_ID";
    static final String HIGH_PRIORITY_PERMISSION = "androidx.ads.identifier.provider.HIGH_PRIORITY";

    AdvertisingIdUtils() {
    }

    public static List<ServiceInfo> getAdvertisingIdProviderServices(PackageManager packageManager) {
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(new Intent(GET_AD_ID_ACTION), 1048576);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<ResolveInfo> it = queryIntentServices.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().serviceInfo);
        }
        return arrayList;
    }

    private static boolean isSystemByApplicationInfo(String str, PackageManager packageManager) {
        try {
            return (packageManager.getApplicationInfo(str, 0).flags & 1) != 0;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static ServiceInfo selectServiceByPriority(List<ServiceInfo> list, PackageManager packageManager) {
        ServiceInfo serviceInfo = null;
        if (list.isEmpty()) {
            return null;
        }
        PackageInfo packageInfo = null;
        for (ServiceInfo serviceInfo2 : list) {
            try {
                PackageInfo packageInfo2 = packageManager.getPackageInfo(serviceInfo2.packageName, 4096);
                if (packageInfo == null || hasHigherPriority(packageInfo2, packageInfo)) {
                    serviceInfo = serviceInfo2;
                    packageInfo = packageInfo2;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return serviceInfo;
    }

    private static boolean hasHigherPriority(PackageInfo packageInfo, PackageInfo packageInfo2) {
        boolean isRequestHighPriority = isRequestHighPriority(packageInfo);
        return isRequestHighPriority != isRequestHighPriority(packageInfo2) ? isRequestHighPriority : packageInfo.firstInstallTime != packageInfo2.firstInstallTime ? packageInfo.firstInstallTime < packageInfo2.firstInstallTime : packageInfo.packageName.compareTo(packageInfo2.packageName) < 0;
    }

    private static boolean isRequestHighPriority(PackageInfo packageInfo) {
        if (packageInfo.requestedPermissions == null) {
            return false;
        }
        for (String str : packageInfo.requestedPermissions) {
            if (HIGH_PRIORITY_PERMISSION.equals(str)) {
                return true;
            }
        }
        return false;
    }
}

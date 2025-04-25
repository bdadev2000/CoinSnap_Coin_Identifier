package com.glority.utils.permission;

import android.app.Activity;
import com.glority.utils.permission.callback.PermissionResultCallback;
import java.util.LinkedList;

/* loaded from: classes9.dex */
public class PermissionResultHandler {
    private PermissionResultHandler() {
        throw new UnsupportedOperationException("U can't initialize me!");
    }

    public static void handlePermissionsResult(Activity activity, int i, String[] strArr, int[] iArr, PermissionResultCallback permissionResultCallback) {
        LinkedList<String> linkedList = new LinkedList();
        int length = iArr.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (iArr[i3] != 0) {
                i2++;
                linkedList.add(strArr[i3]);
            }
        }
        if (iArr.length > 0 && i2 == 0) {
            permissionResultCallback.onGetAllPermissions();
            return;
        }
        LinkedList linkedList2 = new LinkedList();
        for (String str : linkedList) {
            if (!activity.shouldShowRequestPermissionRationale(str)) {
                linkedList2.add(str);
            }
        }
        if (linkedList2.isEmpty()) {
            permissionResultCallback.onPermissionNotGranted((String[]) linkedList.toArray(new String[0]));
        } else {
            permissionResultCallback.showPermissionsRationale((String[]) linkedList2.toArray(new String[0]));
        }
    }
}

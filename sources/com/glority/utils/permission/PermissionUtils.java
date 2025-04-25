package com.glority.utils.permission;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.MotionEventCompat;
import com.glority.utils.UtilsApp;
import com.glority.utils.permission.callback.OnGetPermissionCallback;
import com.glority.utils.permission.callback.PermissionResultCallback;
import com.glority.utils.permission.callback.PermissionResultCallbackWrapper;
import java.util.LinkedList;

/* loaded from: classes9.dex */
public final class PermissionUtils {
    private PermissionUtils() {
        throw new UnsupportedOperationException("U can't initialize me!");
    }

    public static <T extends Activity & PermissionResultResolver> void checkPermission(T t, int i, OnGetPermissionCallback onGetPermissionCallback) {
        checkPermissions(t, onGetPermissionCallback, i);
    }

    public static <T extends Activity & PermissionResultResolver> void checkPermissions(T t, OnGetPermissionCallback onGetPermissionCallback, int... iArr) {
        PermissionResultCallbackWrapper permissionResultCallbackWrapper = new PermissionResultCallbackWrapper(onGetPermissionCallback);
        t.setPermissionResultCallback(permissionResultCallbackWrapper);
        checkPermissions(t, permissionResultCallbackWrapper, iArr);
    }

    public static <T extends Activity & PermissionResultResolver> void checkPermission(T t, int i, PermissionResultCallback permissionResultCallback) {
        checkPermissions(t, permissionResultCallback, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends Activity & PermissionResultResolver> void checkPermissions(T t, PermissionResultCallback permissionResultCallback, int... iArr) {
        t.setPermissionResultCallback(permissionResultCallback);
        int length = iArr.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = Permission.map(iArr[i]);
        }
        LinkedList linkedList = new LinkedList();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (ContextCompat.checkSelfPermission(t, strArr[i3]) != 0) {
                i2++;
                linkedList.add(strArr[i3]);
            }
        }
        if (i2 != 0) {
            ActivityCompat.requestPermissions(t, (String[]) linkedList.toArray(new String[0]), MotionEventCompat.ACTION_POINTER_INDEX_MASK);
        } else if (permissionResultCallback != null) {
            permissionResultCallback.onGetAllPermissions();
        }
    }

    public static boolean hasPermissions(Activity activity, int... iArr) {
        int length = iArr.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = Permission.map(iArr[i]);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (ContextCompat.checkSelfPermission(activity, strArr[i3]) != 0) {
                i2++;
            }
        }
        return i2 == 0;
    }

    public static void toSetPermission(Context context) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", UtilsApp.getApp().getPackageName(), null));
        context.startActivity(intent);
    }
}

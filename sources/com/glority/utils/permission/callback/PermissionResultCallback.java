package com.glority.utils.permission.callback;

/* loaded from: classes9.dex */
public interface PermissionResultCallback {
    void onGetAllPermissions();

    boolean onPermissionNotGranted(String... strArr);

    boolean showPermissionsRationale(String... strArr);
}

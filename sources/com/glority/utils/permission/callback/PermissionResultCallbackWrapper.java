package com.glority.utils.permission.callback;

/* loaded from: classes9.dex */
public class PermissionResultCallbackWrapper implements PermissionResultCallback {
    private OnGetPermissionCallback onGetPermissionCallback;

    @Override // com.glority.utils.permission.callback.PermissionResultCallback
    public boolean onPermissionNotGranted(String... strArr) {
        return false;
    }

    @Override // com.glority.utils.permission.callback.PermissionResultCallback
    public boolean showPermissionsRationale(String... strArr) {
        return false;
    }

    public PermissionResultCallbackWrapper(OnGetPermissionCallback onGetPermissionCallback) {
        this.onGetPermissionCallback = onGetPermissionCallback;
    }

    @Override // com.glority.utils.permission.callback.PermissionResultCallback
    public void onGetAllPermissions() {
        OnGetPermissionCallback onGetPermissionCallback = this.onGetPermissionCallback;
        if (onGetPermissionCallback != null) {
            onGetPermissionCallback.onGetPermission();
        }
    }
}

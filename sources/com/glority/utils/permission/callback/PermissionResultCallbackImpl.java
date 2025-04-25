package com.glority.utils.permission.callback;

import android.content.Context;
import android.content.DialogInterface;
import android.text.Html;
import androidx.appcompat.app.AlertDialog;
import com.glority.utils.R;
import com.glority.utils.permission.Permission;
import com.glority.utils.permission.PermissionUtils;
import com.glority.utils.ui.ToastUtils;

/* loaded from: classes9.dex */
public class PermissionResultCallbackImpl implements PermissionResultCallback {
    private Context context;
    private PermissionResultCallback permissionResultCallback;

    public PermissionResultCallbackImpl(Context context, PermissionResultCallback permissionResultCallback) {
        this.context = context;
        this.permissionResultCallback = permissionResultCallback;
    }

    @Override // com.glority.utils.permission.callback.PermissionResultCallback
    public void onGetAllPermissions() {
        PermissionResultCallback permissionResultCallback = this.permissionResultCallback;
        if (permissionResultCallback != null) {
            permissionResultCallback.onGetAllPermissions();
        }
    }

    @Override // com.glority.utils.permission.callback.PermissionResultCallback
    public boolean showPermissionsRationale(String... strArr) {
        PermissionResultCallback permissionResultCallback = this.permissionResultCallback;
        if (permissionResultCallback == null || permissionResultCallback.showPermissionsRationale(strArr)) {
            return true;
        }
        new AlertDialog.Builder(this.context).setTitle(R.string.permission_set_permission).setMessage(Html.fromHtml(this.context.getResources().getQuantityString(R.plurals.permission_set_in_settings_message, strArr.length, Permission.names(this.context, strArr)))).setPositiveButton(R.string.permission_to_set, new DialogInterface.OnClickListener() { // from class: com.glority.utils.permission.callback.PermissionResultCallbackImpl.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                PermissionUtils.toSetPermission(PermissionResultCallbackImpl.this.context);
            }
        }).setNegativeButton(R.string.permission_cancel, (DialogInterface.OnClickListener) null).create().show();
        return true;
    }

    @Override // com.glority.utils.permission.callback.PermissionResultCallback
    public boolean onPermissionNotGranted(String... strArr) {
        PermissionResultCallback permissionResultCallback = this.permissionResultCallback;
        if (permissionResultCallback == null || permissionResultCallback.onPermissionNotGranted(strArr)) {
            return true;
        }
        ToastUtils.showShort(Html.fromHtml(this.context.getResources().getQuantityString(R.plurals.permission_denied_message, strArr.length, Permission.names(this.context, strArr))));
        return true;
    }
}

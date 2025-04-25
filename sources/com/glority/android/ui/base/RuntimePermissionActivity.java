package com.glority.android.ui.base;

import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.route.RouteableActivity;
import com.glority.android.ui.R;
import com.glority.utils.app.ResUtils;
import com.glority.utils.permission.PermissionResultHandler;
import com.glority.utils.permission.PermissionResultResolver;
import com.glority.utils.permission.PermissionUtils;
import com.glority.utils.permission.callback.PermissionResultCallback;
import com.glority.utils.permission.callback.PermissionResultCallbackImpl;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RuntimePermissionActivity.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J+\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u000e\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/glority/android/ui/base/RuntimePermissionActivity;", "Lcom/glority/android/core/route/RouteableActivity;", "", "Lcom/glority/utils/permission/PermissionResultResolver;", "()V", "permissionResultCallback", "Lcom/glority/utils/permission/callback/PermissionResultCallback;", "onRequestPermissionsResult", "", "requestCode", "", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "setPermissionResultCallback", "showSetPermissionDialog", LogEventArguments.ARG_MESSAGE, "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public abstract class RuntimePermissionActivity extends RouteableActivity<String> implements PermissionResultResolver {
    private PermissionResultCallback permissionResultCallback;

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.glority.utils.permission.PermissionResultResolver
    public void setPermissionResultCallback(PermissionResultCallback permissionResultCallback) {
        Intrinsics.checkNotNullParameter(permissionResultCallback, "permissionResultCallback");
        this.permissionResultCallback = permissionResultCallback;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        final PermissionResultCallback permissionResultCallback = this.permissionResultCallback;
        PermissionResultHandler.handlePermissionsResult(this, requestCode, permissions, grantResults, new PermissionResultCallbackImpl(permissionResultCallback) { // from class: com.glority.android.ui.base.RuntimePermissionActivity$onRequestPermissionsResult$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                RuntimePermissionActivity runtimePermissionActivity = RuntimePermissionActivity.this;
            }

            @Override // com.glority.utils.permission.callback.PermissionResultCallbackImpl, com.glority.utils.permission.callback.PermissionResultCallback
            public boolean showPermissionsRationale(String... permissions2) {
                PermissionResultCallback permissionResultCallback2;
                PermissionResultCallback permissionResultCallback3;
                Intrinsics.checkNotNullParameter(permissions2, "permissions");
                permissionResultCallback2 = RuntimePermissionActivity.this.permissionResultCallback;
                if (permissionResultCallback2 == null) {
                    return true;
                }
                permissionResultCallback3 = RuntimePermissionActivity.this.permissionResultCallback;
                Intrinsics.checkNotNull(permissionResultCallback3);
                if (permissionResultCallback3.showPermissionsRationale((String[]) Arrays.copyOf(permissions2, permissions2.length))) {
                    return true;
                }
                RuntimePermissionActivity runtimePermissionActivity = RuntimePermissionActivity.this;
                String string = ResUtils.getString(R.string.text_permission_denyed_try_after);
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.text_…mission_denyed_try_after)");
                runtimePermissionActivity.showSetPermissionDialog(string);
                return true;
            }
        });
    }

    public final void showSetPermissionDialog(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        new AlertDialog.Builder(this).setTitle(R.string.text_permission_setting).setMessage(message).setPositiveButton(R.string.text_to_set, new DialogInterface.OnClickListener() { // from class: com.glority.android.ui.base.RuntimePermissionActivity$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                RuntimePermissionActivity.m7942showSetPermissionDialog$lambda0(RuntimePermissionActivity.this, dialogInterface, i);
            }
        }).setNegativeButton(R.string.text_cancel, (DialogInterface.OnClickListener) null).create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showSetPermissionDialog$lambda-0, reason: not valid java name */
    public static final void m7942showSetPermissionDialog$lambda0(RuntimePermissionActivity this$0, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        PermissionUtils.toSetPermission(this$0);
    }
}

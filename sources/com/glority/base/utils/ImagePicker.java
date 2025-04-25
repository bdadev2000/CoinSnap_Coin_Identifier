package com.glority.base.utils;

import android.net.Uri;
import android.os.Build;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.PickVisualMediaRequest;
import androidx.activity.result.PickVisualMediaRequestKt;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.glority.android.ui.base.RuntimePermissionActivity;
import com.glority.base.R;
import com.glority.utils.app.ResUtils;
import com.glority.utils.permission.Permission;
import com.glority.utils.permission.PermissionUtils;
import com.glority.utils.permission.callback.PermissionResultCallback;
import com.glority.utils.ui.ToastUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ImagePicker.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0002\t\f\u0018\u00002\u00020\u0001:\u0001\u001fB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\b\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u001e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u001eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u0010\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/glority/base/utils/ImagePicker;", "", "context", "Landroidx/fragment/app/Fragment;", "pickCount", "", "<init>", "(Landroidx/fragment/app/Fragment;I)V", "multiImageCallback", "com/glority/base/utils/ImagePicker$multiImageCallback$1", "Lcom/glority/base/utils/ImagePicker$multiImageCallback$1;", "singleImageCallback", "com/glority/base/utils/ImagePicker$singleImageCallback$1", "Lcom/glority/base/utils/ImagePicker$singleImageCallback$1;", "onImageSelectedListener", "Lcom/glority/base/utils/ImagePicker$OnImageSelectedListener;", "pickMultipleMedia", "Landroidx/activity/result/ActivityResultLauncher;", "Landroidx/activity/result/PickVisualMediaRequest;", "pick", "", "systemImagePicker", "customImagePicker", "runtimePermissionActivity", "Lcom/glority/android/ui/base/RuntimePermissionActivity;", "getPermissionResultCallback", "Lcom/glority/utils/permission/callback/PermissionResultCallback;", "rationaleMessage", "", "onGetAllPermissions", "Lkotlin/Function0;", "OnImageSelectedListener", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class ImagePicker {
    public static final int $stable = 8;
    private final Fragment context;
    private final ImagePicker$multiImageCallback$1 multiImageCallback;
    private OnImageSelectedListener onImageSelectedListener;
    private final int pickCount;
    private ActivityResultLauncher<PickVisualMediaRequest> pickMultipleMedia;
    private final ImagePicker$singleImageCallback$1 singleImageCallback;

    /* compiled from: ImagePicker.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/glority/base/utils/ImagePicker$OnImageSelectedListener;", "", "onImageSelected", "", "uris", "", "Landroid/net/Uri;", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public interface OnImageSelectedListener {
        void onImageSelected(List<? extends Uri> uris);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.glority.base.utils.ImagePicker$multiImageCallback$1] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.glority.base.utils.ImagePicker$singleImageCallback$1] */
    public ImagePicker(Fragment context, int i) {
        ActivityResultLauncher<PickVisualMediaRequest> registerForActivityResult;
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.pickCount = i;
        ?? r0 = new ActivityResultCallback<List<? extends Uri>>() { // from class: com.glority.base.utils.ImagePicker$multiImageCallback$1
            /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
            
                r0 = r1.this$0.onImageSelectedListener;
             */
            @Override // androidx.activity.result.ActivityResultCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onActivityResult(java.util.List<? extends android.net.Uri> r2) {
                /*
                    r1 = this;
                    r0 = r2
                    java.util.Collection r0 = (java.util.Collection) r0
                    if (r0 == 0) goto L17
                    boolean r0 = r0.isEmpty()
                    if (r0 == 0) goto Lc
                    goto L17
                Lc:
                    com.glority.base.utils.ImagePicker r0 = com.glority.base.utils.ImagePicker.this
                    com.glority.base.utils.ImagePicker$OnImageSelectedListener r0 = com.glority.base.utils.ImagePicker.access$getOnImageSelectedListener$p(r0)
                    if (r0 == 0) goto L17
                    r0.onImageSelected(r2)
                L17:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.glority.base.utils.ImagePicker$multiImageCallback$1.onActivityResult(java.util.List):void");
            }
        };
        this.multiImageCallback = r0;
        ?? r1 = new ActivityResultCallback<Uri>() { // from class: com.glority.base.utils.ImagePicker$singleImageCallback$1
            /* JADX WARN: Code restructure failed: missing block: B:2:0x0002, code lost:
            
                r0 = r3.this$0.onImageSelectedListener;
             */
            @Override // androidx.activity.result.ActivityResultCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onActivityResult(android.net.Uri r4) {
                /*
                    r3 = this;
                    if (r4 == 0) goto L17
                    com.glority.base.utils.ImagePicker r0 = com.glority.base.utils.ImagePicker.this
                    com.glority.base.utils.ImagePicker$OnImageSelectedListener r0 = com.glority.base.utils.ImagePicker.access$getOnImageSelectedListener$p(r0)
                    if (r0 == 0) goto L17
                    r1 = 1
                    android.net.Uri[] r1 = new android.net.Uri[r1]
                    r2 = 0
                    r1[r2] = r4
                    java.util.List r4 = kotlin.collections.CollectionsKt.mutableListOf(r1)
                    r0.onImageSelected(r4)
                L17:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.glority.base.utils.ImagePicker$singleImageCallback$1.onActivityResult(android.net.Uri):void");
            }
        };
        this.singleImageCallback = r1;
        if (i > 1) {
            registerForActivityResult = context.registerForActivityResult(new ActivityResultContracts.PickMultipleVisualMedia(i), (ActivityResultCallback) r0);
        } else {
            registerForActivityResult = context.registerForActivityResult(new ActivityResultContracts.PickVisualMedia(), (ActivityResultCallback) r1);
        }
        Intrinsics.checkNotNull(registerForActivityResult);
        this.pickMultipleMedia = registerForActivityResult;
    }

    public final void pick(OnImageSelectedListener onImageSelectedListener) {
        this.onImageSelectedListener = onImageSelectedListener;
        FragmentActivity activity = this.context.getActivity();
        if (Build.VERSION.SDK_INT < 33 && (activity instanceof RuntimePermissionActivity)) {
            customImagePicker((RuntimePermissionActivity) activity);
        } else {
            systemImagePicker();
        }
    }

    private final void systemImagePicker() {
        this.pickMultipleMedia.launch(PickVisualMediaRequestKt.PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE));
    }

    private final void customImagePicker(RuntimePermissionActivity runtimePermissionActivity) {
        String string = ResUtils.getString(R.string.text_set_permission_in_settings, ResUtils.getString(R.string.text_storage_permission));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        PermissionUtils.checkPermission(runtimePermissionActivity, Permission.STORAGE, getPermissionResultCallback(string, new ImagePicker$customImagePicker$1(this)));
    }

    private final PermissionResultCallback getPermissionResultCallback(final String rationaleMessage, final Function0<Unit> onGetAllPermissions) {
        return new PermissionResultCallback() { // from class: com.glority.base.utils.ImagePicker$getPermissionResultCallback$1
            @Override // com.glority.utils.permission.callback.PermissionResultCallback
            public boolean onPermissionNotGranted(String... permissions) {
                Intrinsics.checkNotNullParameter(permissions, "permissions");
                ToastUtils.showShort(R.string.text_permission_denied_try_after);
                return true;
            }

            @Override // com.glority.utils.permission.callback.PermissionResultCallback
            public void onGetAllPermissions() {
                onGetAllPermissions.invoke();
            }

            @Override // com.glority.utils.permission.callback.PermissionResultCallback
            public boolean showPermissionsRationale(String... permissions) {
                Fragment fragment;
                Intrinsics.checkNotNullParameter(permissions, "permissions");
                fragment = this.context;
                FragmentActivity activity = fragment.getActivity();
                RuntimePermissionActivity runtimePermissionActivity = activity instanceof RuntimePermissionActivity ? (RuntimePermissionActivity) activity : null;
                if (runtimePermissionActivity == null) {
                    return true;
                }
                runtimePermissionActivity.showSetPermissionDialog(rationaleMessage);
                return true;
            }
        };
    }
}

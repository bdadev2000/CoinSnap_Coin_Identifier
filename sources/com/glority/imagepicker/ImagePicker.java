package com.glority.imagepicker;

import com.glority.android.ui.base.RuntimePermissionActivity;
import com.glority.imagepicker.MultiImageSelector;
import com.glority.imagepicker.bean.ResultImage;
import com.glority.utils.permission.Permission;
import com.glority.utils.permission.PermissionUtils;
import com.glority.utils.permission.callback.OnGetPermissionCallback;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: ImagePicker.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J<\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¨\u0006\u0010"}, d2 = {"Lcom/glority/imagepicker/ImagePicker;", "", "()V", "pickPhoto", "", "activity", "Lcom/glority/android/ui/base/RuntimePermissionActivity;", "showCamera", "", "maxNum", "", "selectedImages", "Ljava/util/ArrayList;", "Lcom/glority/imagepicker/bean/ResultImage;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/glority/imagepicker/MultiImageSelector$SelectorListener;", "base-imagePicker_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public final class ImagePicker {
    public static final ImagePicker INSTANCE = new ImagePicker();

    private ImagePicker() {
    }

    public final void pickPhoto(final RuntimePermissionActivity activity, final boolean showCamera, final int maxNum, final ArrayList<ResultImage> selectedImages, final MultiImageSelector.SelectorListener listener) {
        if (activity != null) {
            PermissionUtils.checkPermission(activity, Permission.STORAGE, new OnGetPermissionCallback() { // from class: com.glority.imagepicker.ImagePicker$pickPhoto$1
                @Override // com.glority.utils.permission.callback.OnGetPermissionCallback
                public final void onGetPermission() {
                    MultiImageSelector listener2 = MultiImageSelector.create().showCamera(showCamera).count(maxNum).listener(listener);
                    if (maxNum == 1) {
                        listener2.single();
                    } else {
                        listener2.multi().origin(selectedImages);
                    }
                    listener2.start(activity, 0);
                }
            });
        }
    }
}

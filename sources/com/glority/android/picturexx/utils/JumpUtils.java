package com.glority.android.picturexx.utils;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.glority.android.picturexx.recognize.CoreActivity;
import com.glority.android.picturexx.vm.GradingRecognizeProcess;
import com.glority.android.ui.base.RuntimePermissionActivity;
import com.glority.android.xx.constants.Args;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JumpUtils.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¨\u0006\u000f"}, d2 = {"Lcom/glority/android/picturexx/utils/JumpUtils;", "", "<init>", "()V", "toGradeCapture", "", "activity", "Landroid/app/Activity;", "from", "", "sharedView", "Landroid/view/View;", Args.transitionName, "keyLogBundle", "Landroid/os/Bundle;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class JumpUtils {
    public static final int $stable = 0;
    public static final JumpUtils INSTANCE = new JumpUtils();

    private JumpUtils() {
    }

    public final void toGradeCapture(Activity activity, String from, View sharedView, String transitionName, Bundle keyLogBundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(from, "from");
        CoreActivity.INSTANCE.openGrading((RuntimePermissionActivity) activity, new GradingRecognizeProcess(null, 1, null), from, (r17 & 8) != 0 ? 2 : 0, (r17 & 16) != 0, (r17 & 32) != 0 ? null : transitionName, (r17 & 64) != 0 ? null : keyLogBundle);
    }
}

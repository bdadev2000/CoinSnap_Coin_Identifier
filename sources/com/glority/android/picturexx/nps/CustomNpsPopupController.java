package com.glority.android.picturexx.nps;

import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity;
import com.glority.android.netpromoterscore.NpsPopupController;
import com.glority.utils.stability.LogUtils;
import com.glority.utils.ui.ViewUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomNpsPopupController.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u001c\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0002J\u001a\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\r2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000b¨\u0006\u000e"}, d2 = {"Lcom/glority/android/picturexx/nps/CustomNpsPopupController;", "", "<init>", "()V", "init", "", "check", "", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "currentClass", "Ljava/lang/Class;", "checkAndOpen", "Landroid/app/Activity;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class CustomNpsPopupController {
    public static final int $stable = 0;
    public static final CustomNpsPopupController INSTANCE = new CustomNpsPopupController();

    private CustomNpsPopupController() {
    }

    public final void init() {
        NpsPopupController.INSTANCE.init();
    }

    private final boolean check(AppCompatActivity activity, Class<?> currentClass) {
        LogUtils.d("nps", currentClass.getSimpleName());
        return (!NpsPopupController.INSTANCE.check(activity) || NpsBlackList.INSTANCE.getBlackList().contains(currentClass) || ViewUtils.isSoftInputVisible(activity)) ? false : true;
    }

    public final void checkAndOpen(Activity activity, Class<?> currentClass) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(currentClass, "currentClass");
        if (activity instanceof AppCompatActivity) {
            AppCompatActivity appCompatActivity = (AppCompatActivity) activity;
            if (check(appCompatActivity, currentClass)) {
                NpsPopupController.INSTANCE.openNpsDialog(appCompatActivity);
            }
        }
    }
}

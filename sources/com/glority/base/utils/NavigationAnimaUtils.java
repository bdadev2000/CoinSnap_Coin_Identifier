package com.glority.base.utils;

import android.app.Activity;
import androidx.navigation.NavOptions;
import com.glority.base.R;
import kotlin.Metadata;

/* compiled from: NavigationAnimaUtils.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/glority/base/utils/NavigationAnimaUtils;", "", "<init>", "()V", "getSlideAnima", "Landroidx/navigation/NavOptions;", "activity", "Landroid/app/Activity;", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class NavigationAnimaUtils {
    public static final int $stable = 0;
    public static final NavigationAnimaUtils INSTANCE = new NavigationAnimaUtils();

    private NavigationAnimaUtils() {
    }

    public final NavOptions getSlideAnima(Activity activity) {
        if (activity != null) {
            return new NavOptions.Builder().setEnterAnim(R.anim.slide_in_right).setExitAnim(R.anim.slide_out_left).setPopEnterAnim(R.anim.slide_in_left).setPopExitAnim(R.anim.slide_out_right).build();
        }
        return new NavOptions.Builder().setEnterAnim(android.R.anim.fade_in).setExitAnim(android.R.anim.fade_out).setPopEnterAnim(android.R.anim.fade_in).setPopExitAnim(android.R.anim.fade_out).build();
    }
}

package com.glority.base.utils;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import com.glority.android.core.app.AppContext;
import com.glority.utils.stability.LogUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ImmersiveUtils.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"Lcom/glority/base/utils/ImmersiveUtils;", "", "<init>", "()V", "immersiveNavigationBar", "", "activity", "Landroid/app/Activity;", "getNavigationBarHeight", "", "context", "Landroid/content/Context;", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class ImmersiveUtils {
    public static final int $stable = 0;
    public static final ImmersiveUtils INSTANCE = new ImmersiveUtils();

    private ImmersiveUtils() {
    }

    public final void immersiveNavigationBar(final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        activity.getWindow().addFlags(Integer.MIN_VALUE);
        WindowCompat.setDecorFitsSystemWindows(activity.getWindow(), false);
        ViewCompat.setOnApplyWindowInsetsListener((FrameLayout) activity.findViewById(R.id.content), new OnApplyWindowInsetsListener() { // from class: com.glority.base.utils.ImmersiveUtils$$ExternalSyntheticLambda0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                WindowInsetsCompat immersiveNavigationBar$lambda$2;
                immersiveNavigationBar$lambda$2 = ImmersiveUtils.immersiveNavigationBar$lambda$2(activity, view, windowInsetsCompat);
                return immersiveNavigationBar$lambda$2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat immersiveNavigationBar$lambda$2(Activity activity, View view, WindowInsetsCompat windowInsets) {
        Insets insets;
        boolean z;
        ViewGroup.LayoutParams layoutParams;
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        try {
            insets = windowInsets.getInsets(WindowInsetsCompat.Type.navigationBars());
            Intrinsics.checkNotNullExpressionValue(insets, "getInsets(...)");
            Insets insets2 = windowInsets.getInsets(WindowInsetsCompat.Type.systemGestures());
            Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
            int i = insets2.left;
            boolean z2 = true;
            boolean z3 = i == 0;
            boolean z4 = insets.bottom <= 80;
            z = !z3 && z4;
            Object[] objArr = new Object[1];
            if (z3 || !z4) {
                z2 = false;
            }
            objArr[0] = "immersiveNavigationBar :" + z2;
            LogUtils.d(objArr);
            layoutParams = view.getLayoutParams();
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = z ? 0 : insets.bottom;
        view.setLayoutParams(marginLayoutParams);
        if (z) {
            activity.getWindow().setNavigationBarColor(0);
        }
        Unit unit = Unit.INSTANCE;
        return windowInsets;
    }

    public final int getNavigationBarHeight(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }
}

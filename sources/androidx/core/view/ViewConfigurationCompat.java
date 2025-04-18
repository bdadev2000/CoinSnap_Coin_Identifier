package androidx.core.view;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.InputDevice;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import java.lang.reflect.Method;
import java.util.Objects;
import m0.e;
import n0.f1;
import n0.g1;
import n0.h1;
import n0.i1;

/* loaded from: classes.dex */
public final class ViewConfigurationCompat {
    private static final int NO_FLING_MAX_VELOCITY = Integer.MIN_VALUE;
    private static final int NO_FLING_MIN_VELOCITY = Integer.MAX_VALUE;
    private static final int RESOURCE_ID_NOT_SUPPORTED = -1;
    private static final int RESOURCE_ID_SUPPORTED_BUT_NOT_FOUND = 0;
    private static final String TAG = "ViewConfigCompat";
    private static Method sGetScaledScrollFactorMethod;

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                sGetScaledScrollFactorMethod = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new Class[0]);
            } catch (Exception unused) {
                Log.i(TAG, "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }

    private ViewConfigurationCompat() {
    }

    private static int getCompatFlingVelocityThreshold(Resources resources, int i10, e eVar, int i11) {
        int scaledMaximumFlingVelocity;
        int dimensionPixelSize;
        if (i10 != -1) {
            if (i10 != 0 && (dimensionPixelSize = resources.getDimensionPixelSize(i10)) >= 0) {
                return dimensionPixelSize;
            }
            return i11;
        }
        f1 f1Var = (f1) eVar;
        int i12 = f1Var.a;
        ViewConfiguration viewConfiguration = f1Var.f22274b;
        switch (i12) {
            case 0:
                scaledMaximumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                break;
            default:
                scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                break;
        }
        return Integer.valueOf(scaledMaximumFlingVelocity).intValue();
    }

    private static float getLegacyScrollFactor(ViewConfiguration viewConfiguration, Context context) {
        Method method;
        if (Build.VERSION.SDK_INT >= 25 && (method = sGetScaledScrollFactorMethod) != null) {
            try {
                return ((Integer) method.invoke(viewConfiguration, new Object[0])).intValue();
            } catch (Exception unused) {
                Log.i(TAG, "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    private static int getPlatformResId(Resources resources, String str, String str2) {
        return resources.getIdentifier(str, str2, "android");
    }

    private static int getPreApi34MaximumFlingVelocityResId(Resources resources, int i10, int i11) {
        if (i10 == 4194304 && i11 == 26) {
            return getPlatformResId(resources, "config_viewMaxRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    private static int getPreApi34MinimumFlingVelocityResId(Resources resources, int i10, int i11) {
        if (i10 == 4194304 && i11 == 26) {
            return getPlatformResId(resources, "config_viewMinRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    public static float getScaledHorizontalScrollFactor(@NonNull ViewConfiguration viewConfiguration, @NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return g1.a(viewConfiguration);
        }
        return getLegacyScrollFactor(viewConfiguration, context);
    }

    public static int getScaledHoverSlop(@NonNull ViewConfiguration viewConfiguration) {
        if (Build.VERSION.SDK_INT >= 28) {
            return h1.a(viewConfiguration);
        }
        return viewConfiguration.getScaledTouchSlop() / 2;
    }

    public static int getScaledMaximumFlingVelocity(@NonNull Context context, @NonNull ViewConfiguration viewConfiguration, int i10, int i11, int i12) {
        if (Build.VERSION.SDK_INT >= 34) {
            return i1.a(viewConfiguration, i10, i11, i12);
        }
        if (!isInputDeviceInfoValid(i10, i11, i12)) {
            return Integer.MIN_VALUE;
        }
        Resources resources = context.getResources();
        int preApi34MaximumFlingVelocityResId = getPreApi34MaximumFlingVelocityResId(resources, i12, i11);
        Objects.requireNonNull(viewConfiguration);
        return getCompatFlingVelocityThreshold(resources, preApi34MaximumFlingVelocityResId, new f1(viewConfiguration, 1), Integer.MIN_VALUE);
    }

    public static int getScaledMinimumFlingVelocity(@NonNull Context context, @NonNull ViewConfiguration viewConfiguration, int i10, int i11, int i12) {
        if (Build.VERSION.SDK_INT >= 34) {
            return i1.b(viewConfiguration, i10, i11, i12);
        }
        if (!isInputDeviceInfoValid(i10, i11, i12)) {
            return Integer.MAX_VALUE;
        }
        Resources resources = context.getResources();
        int preApi34MinimumFlingVelocityResId = getPreApi34MinimumFlingVelocityResId(resources, i12, i11);
        Objects.requireNonNull(viewConfiguration);
        return getCompatFlingVelocityThreshold(resources, preApi34MinimumFlingVelocityResId, new f1(viewConfiguration, 0), Integer.MAX_VALUE);
    }

    @Deprecated
    public static int getScaledPagingTouchSlop(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledPagingTouchSlop();
    }

    public static float getScaledVerticalScrollFactor(@NonNull ViewConfiguration viewConfiguration, @NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return g1.b(viewConfiguration);
        }
        return getLegacyScrollFactor(viewConfiguration, context);
    }

    @Deprecated
    public static boolean hasPermanentMenuKey(ViewConfiguration viewConfiguration) {
        return viewConfiguration.hasPermanentMenuKey();
    }

    private static boolean isInputDeviceInfoValid(int i10, int i11, int i12) {
        InputDevice device = InputDevice.getDevice(i10);
        if (device != null && device.getMotionRange(i11, i12) != null) {
            return true;
        }
        return false;
    }

    public static boolean shouldShowMenuShortcutsWhenKeyboardPresent(@NonNull ViewConfiguration viewConfiguration, @NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return h1.b(viewConfiguration);
        }
        Resources resources = context.getResources();
        int platformResId = getPlatformResId(resources, "config_showMenuShortcutsWhenKeyboardPresent", "bool");
        if (platformResId != 0 && resources.getBoolean(platformResId)) {
            return true;
        }
        return false;
    }
}

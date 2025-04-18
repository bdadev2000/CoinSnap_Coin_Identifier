package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.core.view.DifferentialMotionFlingController;
import androidx.core.view.ViewConfigurationCompat;
import com.google.android.gms.common.api.Api;
import java.util.Objects;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements DifferentialMotionFlingController.FlingVelocityThresholdCalculator, DifferentialMotionFlingController.DifferentialVelocityProvider {
    /* JADX WARN: Removed duplicated region for block: B:24:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013b  */
    @Override // androidx.core.view.DifferentialMotionFlingController.DifferentialVelocityProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float a(android.view.VelocityTracker r25, android.view.MotionEvent r26, int r27) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.b.a(android.view.VelocityTracker, android.view.MotionEvent, int):float");
    }

    @Override // androidx.core.view.DifferentialMotionFlingController.FlingVelocityThresholdCalculator
    public final void b(Context context, int[] iArr, MotionEvent motionEvent, int i2) {
        int intValue;
        int dimensionPixelSize;
        int intValue2;
        int dimensionPixelSize2;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int deviceId = motionEvent.getDeviceId();
        int source = motionEvent.getSource();
        int i3 = Build.VERSION.SDK_INT;
        boolean z2 = false;
        if (i3 >= 34) {
            intValue = ViewConfigurationCompat.Api34Impl.b(viewConfiguration, deviceId, i2, source);
        } else {
            InputDevice device = InputDevice.getDevice(deviceId);
            boolean z3 = (device == null || device.getMotionRange(i2, source) == null) ? false : true;
            int i4 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            if (z3) {
                Resources resources = context.getResources();
                int identifier = (source == 4194304 && i2 == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                Objects.requireNonNull(viewConfiguration);
                if (identifier == -1) {
                    intValue = Integer.valueOf(viewConfiguration.getScaledMinimumFlingVelocity()).intValue();
                } else if (identifier != 0 && (dimensionPixelSize = resources.getDimensionPixelSize(identifier)) >= 0) {
                    i4 = dimensionPixelSize;
                }
            }
            intValue = i4;
        }
        iArr[0] = intValue;
        int deviceId2 = motionEvent.getDeviceId();
        int source2 = motionEvent.getSource();
        if (i3 >= 34) {
            intValue2 = ViewConfigurationCompat.Api34Impl.a(viewConfiguration, deviceId2, i2, source2);
        } else {
            InputDevice device2 = InputDevice.getDevice(deviceId2);
            if (device2 != null && device2.getMotionRange(i2, source2) != null) {
                z2 = true;
            }
            int i5 = Integer.MIN_VALUE;
            if (z2) {
                Resources resources2 = context.getResources();
                int identifier2 = (source2 == 4194304 && i2 == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                Objects.requireNonNull(viewConfiguration);
                if (identifier2 == -1) {
                    intValue2 = Integer.valueOf(viewConfiguration.getScaledMaximumFlingVelocity()).intValue();
                } else if (identifier2 != 0 && (dimensionPixelSize2 = resources2.getDimensionPixelSize(identifier2)) >= 0) {
                    i5 = dimensionPixelSize2;
                }
            }
            intValue2 = i5;
        }
        iArr[1] = intValue2;
    }
}

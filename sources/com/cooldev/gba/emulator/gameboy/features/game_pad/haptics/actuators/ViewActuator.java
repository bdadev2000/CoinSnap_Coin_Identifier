package com.cooldev.gba.emulator.gameboy.features.game_pad.haptics.actuators;

import android.os.Build;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import e0.e0;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import p0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class ViewActuator implements HapticActuator {
    public static final int $stable;

    @NotNull
    public static final Companion Companion;

    @NotNull
    private static final Map<Integer, Integer> HAPTIC_CONSTANTS_MAPPINGS;
    private static final int VIEW_FLAGS = 3;

    @NotNull
    private final WeakReference<View> view;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Integer findReleaseHapticConstant() {
            return Build.VERSION.SDK_INT >= 27 ? 8 : null;
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        $stable = 8;
        HAPTIC_CONSTANTS_MAPPINGS = e0.t(new d0.k(0, null), new d0.k(2, 1), new d0.k(1, companion.findReleaseHapticConstant()));
    }

    public ViewActuator(@NotNull WeakReference<View> weakReference) {
        a.s(weakReference, ViewHierarchyConstants.VIEW_KEY);
        this.view = weakReference;
    }

    @Override // com.cooldev.gba.emulator.gameboy.features.game_pad.haptics.actuators.HapticActuator
    public void performHaptic(int i2) {
        Integer num = HAPTIC_CONSTANTS_MAPPINGS.get(Integer.valueOf(i2));
        if (num != null) {
            int intValue = num.intValue();
            View view = this.view.get();
            if (view != null) {
                view.performHapticFeedback(intValue, 3);
            }
        }
    }
}

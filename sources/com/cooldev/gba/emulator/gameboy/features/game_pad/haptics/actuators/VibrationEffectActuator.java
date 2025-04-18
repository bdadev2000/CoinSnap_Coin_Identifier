package com.cooldev.gba.emulator.gameboy.features.game_pad.haptics.actuators;

import android.content.Context;
import android.os.VibrationEffect;
import android.os.Vibrator;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@StabilityInferred
@RequiresApi
/* loaded from: classes3.dex */
public final class VibrationEffectActuator implements HapticActuator {
    public static final int $stable = 8;

    @NotNull
    private final VibrationEffect pressEffect;

    @NotNull
    private final VibrationEffect releaseEffect;

    @Nullable
    private final Vibrator vibrationService;

    public VibrationEffectActuator(@NotNull Context context) {
        VibrationEffect createPredefined;
        VibrationEffect createPredefined2;
        a.s(context, "context");
        this.vibrationService = (Vibrator) ContextCompat.getSystemService(context, Vibrator.class);
        createPredefined = VibrationEffect.createPredefined(0);
        a.r(createPredefined, "createPredefined(...)");
        this.pressEffect = createPredefined;
        createPredefined2 = VibrationEffect.createPredefined(2);
        a.r(createPredefined2, "createPredefined(...)");
        this.releaseEffect = createPredefined2;
    }

    @Override // com.cooldev.gba.emulator.gameboy.features.game_pad.haptics.actuators.HapticActuator
    public void performHaptic(int i2) {
        Vibrator vibrator;
        VibrationEffect vibrationEffect = i2 != 1 ? i2 != 2 ? null : this.pressEffect : this.releaseEffect;
        if (vibrationEffect == null || (vibrator = this.vibrationService) == null) {
            return;
        }
        vibrator.vibrate(vibrationEffect);
    }
}

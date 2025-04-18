package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

@RestrictTo
/* loaded from: classes3.dex */
public class SchemeRainbow extends DynamicScheme {
    public SchemeRainbow(Hct hct, boolean z2, double d) {
        super(hct, Variant.RAINBOW, z2, d, TonalPalette.fromHueAndChroma(hct.getHue(), 48.0d), TonalPalette.fromHueAndChroma(hct.getHue(), 16.0d), TonalPalette.fromHueAndChroma(MathUtils.sanitizeDegreesDouble(hct.getHue() + 60.0d), 24.0d), TonalPalette.fromHueAndChroma(hct.getHue(), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE), TonalPalette.fromHueAndChroma(hct.getHue(), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
    }
}

package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

@RestrictTo
/* loaded from: classes3.dex */
public class SchemeMonochrome extends DynamicScheme {
    public SchemeMonochrome(Hct hct, boolean z2, double d) {
        super(hct, Variant.MONOCHROME, z2, d, TonalPalette.fromHueAndChroma(hct.getHue(), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE), TonalPalette.fromHueAndChroma(hct.getHue(), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE), TonalPalette.fromHueAndChroma(hct.getHue(), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE), TonalPalette.fromHueAndChroma(hct.getHue(), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE), TonalPalette.fromHueAndChroma(hct.getHue(), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
    }
}

package com.google.android.material.color.utilities;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Function;

@RestrictTo
/* loaded from: classes2.dex */
public final class DynamicColor {
    public final Function<DynamicScheme, DynamicColor> background;
    public final ContrastCurve contrastCurve;
    private final HashMap<DynamicScheme, Hct> hctCache;
    public final boolean isBackground;
    public final String name;
    public final Function<DynamicScheme, Double> opacity;
    public final Function<DynamicScheme, TonalPalette> palette;
    public final Function<DynamicScheme, DynamicColor> secondBackground;
    public final Function<DynamicScheme, Double> tone;
    public final Function<DynamicScheme, ToneDeltaPair> toneDeltaPair;

    public DynamicColor(@NonNull String str, @NonNull Function<DynamicScheme, TonalPalette> function, @NonNull Function<DynamicScheme, Double> function2, boolean z2, @Nullable Function<DynamicScheme, DynamicColor> function3, @Nullable Function<DynamicScheme, DynamicColor> function4, @Nullable ContrastCurve contrastCurve, @Nullable Function<DynamicScheme, ToneDeltaPair> function5) {
        this.hctCache = new HashMap<>();
        this.name = str;
        this.palette = function;
        this.tone = function2;
        this.isBackground = z2;
        this.background = function3;
        this.secondBackground = function4;
        this.contrastCurve = contrastCurve;
        this.toneDeltaPair = function5;
        this.opacity = null;
    }

    public static double enableLightForeground(double d) {
        if (!tonePrefersLightForeground(d) || toneAllowsLightForeground(d)) {
            return d;
        }
        return 49.0d;
    }

    public static double foregroundTone(double d, double d2) {
        double lighterUnsafe = Contrast.lighterUnsafe(d, d2);
        double darkerUnsafe = Contrast.darkerUnsafe(d, d2);
        double ratioOfTones = Contrast.ratioOfTones(lighterUnsafe, d);
        double ratioOfTones2 = Contrast.ratioOfTones(darkerUnsafe, d);
        if (tonePrefersLightForeground(d)) {
            return (ratioOfTones >= d2 || ratioOfTones >= ratioOfTones2 || ((Math.abs(ratioOfTones - ratioOfTones2) > 0.1d ? 1 : (Math.abs(ratioOfTones - ratioOfTones2) == 0.1d ? 0 : -1)) < 0 && (ratioOfTones > d2 ? 1 : (ratioOfTones == d2 ? 0 : -1)) < 0 && (ratioOfTones2 > d2 ? 1 : (ratioOfTones2 == d2 ? 0 : -1)) < 0)) ? lighterUnsafe : darkerUnsafe;
        }
        return (ratioOfTones2 >= d2 || ratioOfTones2 >= ratioOfTones) ? darkerUnsafe : lighterUnsafe;
    }

    @NonNull
    public static DynamicColor fromArgb(@NonNull String str, int i2) {
        return fromPalette(str, new a(TonalPalette.fromInt(i2), 0), new a(Hct.fromInt(i2), 1));
    }

    @NonNull
    public static DynamicColor fromPalette(@NonNull String str, @NonNull Function<DynamicScheme, TonalPalette> function, @NonNull Function<DynamicScheme, Double> function2) {
        return new DynamicColor(str, function, function2, false, null, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TonalPalette lambda$fromArgb$0(TonalPalette tonalPalette, DynamicScheme dynamicScheme) {
        return tonalPalette;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$fromArgb$1(Hct hct, DynamicScheme dynamicScheme) {
        return Double.valueOf(hct.getTone());
    }

    public static boolean toneAllowsLightForeground(double d) {
        return Math.round(d) <= 49;
    }

    public static boolean tonePrefersLightForeground(double d) {
        return Math.round(d) < 60;
    }

    public int getArgb(@NonNull DynamicScheme dynamicScheme) {
        int i2 = getHct(dynamicScheme).toInt();
        Function<DynamicScheme, Double> function = this.opacity;
        if (function == null) {
            return i2;
        }
        return (MathUtils.clampInt(0, 255, (int) Math.round(function.apply(dynamicScheme).doubleValue() * 255.0d)) << 24) | (i2 & 16777215);
    }

    @NonNull
    public Hct getHct(@NonNull DynamicScheme dynamicScheme) {
        Hct hct = this.hctCache.get(dynamicScheme);
        if (hct != null) {
            return hct;
        }
        Hct hct2 = this.palette.apply(dynamicScheme).getHct(getTone(dynamicScheme));
        if (this.hctCache.size() > 4) {
            this.hctCache.clear();
        }
        this.hctCache.put(dynamicScheme, hct2);
        return hct2;
    }

    public double getTone(@NonNull DynamicScheme dynamicScheme) {
        double d;
        boolean z2 = dynamicScheme.contrastLevel < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        Function<DynamicScheme, ToneDeltaPair> function = this.toneDeltaPair;
        if (function == null) {
            double doubleValue = this.tone.apply(dynamicScheme).doubleValue();
            Function<DynamicScheme, DynamicColor> function2 = this.background;
            if (function2 == null) {
                return doubleValue;
            }
            double tone = function2.apply(dynamicScheme).getTone(dynamicScheme);
            double contrast = this.contrastCurve.getContrast(dynamicScheme.contrastLevel);
            if (Contrast.ratioOfTones(tone, doubleValue) < contrast) {
                doubleValue = foregroundTone(tone, contrast);
            }
            if (z2) {
                doubleValue = foregroundTone(tone, contrast);
            }
            double d2 = (!this.isBackground || 50.0d > doubleValue || doubleValue >= 60.0d) ? doubleValue : Contrast.ratioOfTones(49.0d, tone) >= contrast ? 49.0d : 60.0d;
            if (this.secondBackground == null) {
                return d2;
            }
            double tone2 = this.background.apply(dynamicScheme).getTone(dynamicScheme);
            double tone3 = this.secondBackground.apply(dynamicScheme).getTone(dynamicScheme);
            double max = Math.max(tone2, tone3);
            double min = Math.min(tone2, tone3);
            if (Contrast.ratioOfTones(max, d2) >= contrast && Contrast.ratioOfTones(min, d2) >= contrast) {
                return d2;
            }
            double lighter = Contrast.lighter(max, contrast);
            double darker = Contrast.darker(min, contrast);
            ArrayList arrayList = new ArrayList();
            if (lighter != -1.0d) {
                arrayList.add(Double.valueOf(lighter));
            }
            if (darker != -1.0d) {
                arrayList.add(Double.valueOf(darker));
            }
            if (!tonePrefersLightForeground(tone2) && !tonePrefersLightForeground(tone3)) {
                return arrayList.size() == 1 ? ((Double) arrayList.get(0)).doubleValue() : darker == -1.0d ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : darker;
            }
            if (lighter == -1.0d) {
                return 100.0d;
            }
            return lighter;
        }
        ToneDeltaPair apply = function.apply(dynamicScheme);
        DynamicColor roleA = apply.getRoleA();
        DynamicColor roleB = apply.getRoleB();
        double delta = apply.getDelta();
        TonePolarity polarity = apply.getPolarity();
        boolean stayTogether = apply.getStayTogether();
        double tone4 = this.background.apply(dynamicScheme).getTone(dynamicScheme);
        boolean z3 = polarity == TonePolarity.NEARER || (polarity == TonePolarity.LIGHTER && !dynamicScheme.isDark) || (polarity == TonePolarity.DARKER && dynamicScheme.isDark);
        DynamicColor dynamicColor = z3 ? roleA : roleB;
        DynamicColor dynamicColor2 = z3 ? roleB : roleA;
        boolean equals = this.name.equals(dynamicColor.name);
        double d3 = dynamicScheme.isDark ? 1.0d : -1.0d;
        double contrast2 = dynamicColor.contrastCurve.getContrast(dynamicScheme.contrastLevel);
        double contrast3 = dynamicColor2.contrastCurve.getContrast(dynamicScheme.contrastLevel);
        double doubleValue2 = dynamicColor.tone.apply(dynamicScheme).doubleValue();
        if (Contrast.ratioOfTones(tone4, doubleValue2) < contrast2) {
            doubleValue2 = foregroundTone(tone4, contrast2);
        }
        double d4 = doubleValue2;
        double doubleValue3 = dynamicColor2.tone.apply(dynamicScheme).doubleValue();
        if (Contrast.ratioOfTones(tone4, doubleValue3) < contrast3) {
            doubleValue3 = foregroundTone(tone4, contrast3);
        }
        if (z2) {
            d4 = foregroundTone(tone4, contrast2);
            doubleValue3 = foregroundTone(tone4, contrast3);
        }
        if ((doubleValue3 - d4) * d3 < delta) {
            double d5 = delta * d3;
            doubleValue3 = MathUtils.clampDouble(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 100.0d, d4 + d5);
            if ((doubleValue3 - d4) * d3 < delta) {
                d4 = MathUtils.clampDouble(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 100.0d, doubleValue3 - d5);
            }
        }
        if (50.0d > d4 || d4 >= 60.0d) {
            if (50.0d > doubleValue3 || doubleValue3 >= 60.0d) {
                d = doubleValue3;
            } else if (!stayTogether) {
                d = d3 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? 60.0d : 49.0d;
            } else if (d3 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                d = Math.max(doubleValue3, (delta * d3) + 60.0d);
                d4 = 60.0d;
            } else {
                d = Math.min(doubleValue3, (delta * d3) + 49.0d);
                d4 = 49.0d;
            }
        } else if (d3 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            d4 = 60.0d;
            d = Math.max(doubleValue3, (delta * d3) + 60.0d);
        } else {
            d = Math.min(doubleValue3, (delta * d3) + 49.0d);
            d4 = 49.0d;
        }
        return equals ? d4 : d;
    }

    @NonNull
    public static DynamicColor fromPalette(@NonNull String str, @NonNull Function<DynamicScheme, TonalPalette> function, @NonNull Function<DynamicScheme, Double> function2, boolean z2) {
        return new DynamicColor(str, function, function2, z2, null, null, null, null);
    }

    public DynamicColor(@NonNull String str, @NonNull Function<DynamicScheme, TonalPalette> function, @NonNull Function<DynamicScheme, Double> function2, boolean z2, @Nullable Function<DynamicScheme, DynamicColor> function3, @Nullable Function<DynamicScheme, DynamicColor> function4, @Nullable ContrastCurve contrastCurve, @Nullable Function<DynamicScheme, ToneDeltaPair> function5, @Nullable Function<DynamicScheme, Double> function6) {
        this.hctCache = new HashMap<>();
        this.name = str;
        this.palette = function;
        this.tone = function2;
        this.isBackground = z2;
        this.background = function3;
        this.secondBackground = function4;
        this.contrastCurve = contrastCurve;
        this.toneDeltaPair = function5;
        this.opacity = function6;
    }
}

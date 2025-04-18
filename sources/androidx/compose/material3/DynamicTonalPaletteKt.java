package androidx.compose.material3;

import android.content.Context;
import android.os.Build;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.Lab;
import androidx.core.math.MathUtils;

/* loaded from: classes3.dex */
public final class DynamicTonalPaletteKt {
    public static final ColorScheme a(Context context) {
        if (Build.VERSION.SDK_INT < 34) {
            TonalPalette c2 = c(context);
            long j2 = c2.x;
            long j3 = c2.A;
            long j4 = c2.f12525z;
            long j5 = c2.w;
            long j6 = c2.f12524y;
            long j7 = c2.E;
            long j8 = c2.H;
            long j9 = c2.G;
            long j10 = c2.D;
            long j11 = c2.L;
            long j12 = c2.O;
            long j13 = c2.N;
            long j14 = c2.K;
            long j15 = c2.f12520s;
            long j16 = c2.f12508g;
            long j17 = c2.f12513l;
            return ColorSchemeKt.d(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j15, j16, j17, c2.f12510i, j2, j16, c2.f12516o, c2.f12511j, j17, c2.f12522u, c2.f12514m, c2.f12518q, c2.f12517p, c2.f12515n, c2.f12519r, c2.f12521t, j15, 62914560, 0);
        }
        ColorResourceHelper colorResourceHelper = ColorResourceHelper.f8505a;
        long a2 = colorResourceHelper.a(context, android.R.color.car_cyan_50);
        long a3 = colorResourceHelper.a(context, android.R.color.car_cyan_500);
        long a4 = colorResourceHelper.a(context, android.R.color.car_cyan_300);
        long a5 = colorResourceHelper.a(context, android.R.color.car_cyan_400);
        long a6 = colorResourceHelper.a(context, android.R.color.car_action1_dark);
        long a7 = colorResourceHelper.a(context, android.R.color.car_cyan_800);
        long a8 = colorResourceHelper.a(context, android.R.color.car_cyan_900);
        long a9 = colorResourceHelper.a(context, android.R.color.car_cyan_600);
        long a10 = colorResourceHelper.a(context, android.R.color.car_cyan_700);
        long a11 = colorResourceHelper.a(context, android.R.color.car_dark_blue_grey_700);
        long a12 = colorResourceHelper.a(context, android.R.color.car_dark_blue_grey_800);
        long a13 = colorResourceHelper.a(context, android.R.color.car_dark_blue_grey_1000);
        long a14 = colorResourceHelper.a(context, android.R.color.car_dark_blue_grey_600);
        long a15 = colorResourceHelper.a(context, android.R.color.car_dark_blue_grey_900);
        long a16 = colorResourceHelper.a(context, android.R.color.car_green_100);
        long a17 = colorResourceHelper.a(context, android.R.color.car_green_200);
        long a18 = colorResourceHelper.a(context, android.R.color.car_green_300);
        long a19 = colorResourceHelper.a(context, android.R.color.car_grey_100);
        long a20 = colorResourceHelper.a(context, android.R.color.car_grey_1000);
        long a21 = colorResourceHelper.a(context, android.R.color.car_blue_900);
        long a22 = colorResourceHelper.a(context, android.R.color.car_blue_grey_800);
        long a23 = colorResourceHelper.a(context, android.R.color.car_grey_200);
        long a24 = colorResourceHelper.a(context, android.R.color.car_keyboard_divider_line);
        long a25 = colorResourceHelper.a(context, android.R.color.car_green_800);
        long a26 = colorResourceHelper.a(context, android.R.color.car_green_900);
        return ColorSchemeKt.d(a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, colorResourceHelper.a(context, android.R.color.car_cyan_50), a21, a22, a23, a24, 0L, a25, colorResourceHelper.a(context, android.R.color.car_green_500), colorResourceHelper.a(context, android.R.color.car_green_600), colorResourceHelper.a(context, android.R.color.car_green_700), colorResourceHelper.a(context, android.R.color.car_green_400), colorResourceHelper.a(context, android.R.color.car_green_50), a26, 331350016, 0);
    }

    public static final ColorScheme b(Context context) {
        if (Build.VERSION.SDK_INT < 34) {
            TonalPalette c2 = c(context);
            long j2 = c2.f12524y;
            long j3 = c2.f12523v;
            long j4 = c2.w;
            long j5 = c2.B;
            long j6 = c2.x;
            long j7 = c2.F;
            long j8 = c2.C;
            long j9 = c2.D;
            long j10 = c2.I;
            long j11 = c2.M;
            long j12 = c2.J;
            long j13 = c2.K;
            long j14 = c2.P;
            long j15 = c2.f12505b;
            long j16 = c2.f12519r;
            long j17 = c2.f12508g;
            return ColorSchemeKt.g(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j15, j16, j17, c2.f12513l, j2, c2.f12516o, c2.d, c2.f12512k, c2.f12510i, c2.f12522u, j15, c2.e, c2.f12507f, j17, c2.f12506c, c2.f12504a, c2.f12509h, 62914560, 0);
        }
        ColorResourceHelper colorResourceHelper = ColorResourceHelper.f8505a;
        long a2 = colorResourceHelper.a(context, android.R.color.car_action1_dark);
        long a3 = colorResourceHelper.a(context, android.R.color.car_action1_light);
        long a4 = colorResourceHelper.a(context, android.R.color.car_accent_light);
        long a5 = colorResourceHelper.a(context, android.R.color.car_action1);
        long a6 = colorResourceHelper.a(context, android.R.color.car_cyan_50);
        long a7 = colorResourceHelper.a(context, android.R.color.car_blue_200);
        long a8 = colorResourceHelper.a(context, android.R.color.car_blue_300);
        long a9 = colorResourceHelper.a(context, android.R.color.car_background);
        long a10 = colorResourceHelper.a(context, android.R.color.car_blue_100);
        long a11 = colorResourceHelper.a(context, android.R.color.car_blue_500);
        long a12 = colorResourceHelper.a(context, android.R.color.car_blue_600);
        long a13 = colorResourceHelper.a(context, android.R.color.car_blue_400);
        long a14 = colorResourceHelper.a(context, android.R.color.car_blue_50);
        long a15 = colorResourceHelper.a(context, android.R.color.car_blue_700);
        long a16 = colorResourceHelper.a(context, android.R.color.car_blue_800);
        long a17 = colorResourceHelper.a(context, android.R.color.car_blue_900);
        long a18 = colorResourceHelper.a(context, android.R.color.car_blue_grey_800);
        long a19 = colorResourceHelper.a(context, android.R.color.car_body3);
        long a20 = colorResourceHelper.a(context, android.R.color.car_body3_dark);
        long a21 = colorResourceHelper.a(context, android.R.color.car_green_200);
        long a22 = colorResourceHelper.a(context, android.R.color.car_green_300);
        long a23 = colorResourceHelper.a(context, android.R.color.car_body3_light);
        long a24 = colorResourceHelper.a(context, android.R.color.car_highlight_light);
        long a25 = colorResourceHelper.a(context, android.R.color.car_body2_dark);
        long a26 = colorResourceHelper.a(context, android.R.color.car_body2_light);
        return ColorSchemeKt.g(a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, colorResourceHelper.a(context, android.R.color.car_action1_dark), a21, a22, a23, a24, 0L, a25, colorResourceHelper.a(context, android.R.color.car_body1_dark), colorResourceHelper.a(context, android.R.color.car_body1_light), colorResourceHelper.a(context, android.R.color.car_body2), colorResourceHelper.a(context, android.R.color.car_blue_grey_900), colorResourceHelper.a(context, android.R.color.car_body1), a26, 331350016, 0);
    }

    public static final TonalPalette c(Context context) {
        ColorResourceHelper colorResourceHelper = ColorResourceHelper.f8505a;
        colorResourceHelper.a(context, android.R.color.Blue_700);
        colorResourceHelper.a(context, android.R.color.Blue_800);
        d(colorResourceHelper.a(context, android.R.color.Purple_800), 98.0f);
        d(colorResourceHelper.a(context, android.R.color.Purple_800), 96.0f);
        colorResourceHelper.a(context, android.R.color.GM2_grey_800);
        d(colorResourceHelper.a(context, android.R.color.Purple_800), 94.0f);
        d(colorResourceHelper.a(context, android.R.color.Purple_800), 92.0f);
        colorResourceHelper.a(context, android.R.color.Indigo_700);
        d(colorResourceHelper.a(context, android.R.color.Purple_800), 87.0f);
        colorResourceHelper.a(context, android.R.color.Indigo_800);
        colorResourceHelper.a(context, android.R.color.Pink_700);
        colorResourceHelper.a(context, android.R.color.Pink_800);
        colorResourceHelper.a(context, android.R.color.Purple_700);
        colorResourceHelper.a(context, android.R.color.Purple_800);
        colorResourceHelper.a(context, android.R.color.Red_700);
        d(colorResourceHelper.a(context, android.R.color.Purple_800), 24.0f);
        d(colorResourceHelper.a(context, android.R.color.Purple_800), 22.0f);
        colorResourceHelper.a(context, android.R.color.Red_800);
        d(colorResourceHelper.a(context, android.R.color.Purple_800), 17.0f);
        d(colorResourceHelper.a(context, android.R.color.Purple_800), 12.0f);
        colorResourceHelper.a(context, android.R.color.Teal_700);
        d(colorResourceHelper.a(context, android.R.color.Purple_800), 6.0f);
        d(colorResourceHelper.a(context, android.R.color.Purple_800), 4.0f);
        colorResourceHelper.a(context, android.R.color.Teal_800);
        long a2 = colorResourceHelper.a(context, android.R.color.accent_device_default);
        colorResourceHelper.a(context, android.R.color.accent_device_default_50);
        long d = d(colorResourceHelper.a(context, android.R.color.accessibility_focus_highlight), 98.0f);
        long d2 = d(colorResourceHelper.a(context, android.R.color.accessibility_focus_highlight), 96.0f);
        long a3 = colorResourceHelper.a(context, android.R.color.accent_device_default_700);
        long d3 = d(colorResourceHelper.a(context, android.R.color.accessibility_focus_highlight), 94.0f);
        long d4 = d(colorResourceHelper.a(context, android.R.color.accessibility_focus_highlight), 92.0f);
        long a4 = colorResourceHelper.a(context, android.R.color.accent_device_default_dark);
        long d5 = d(colorResourceHelper.a(context, android.R.color.accessibility_focus_highlight), 87.0f);
        long a5 = colorResourceHelper.a(context, android.R.color.accent_device_default_dark_60_percent_opacity);
        colorResourceHelper.a(context, android.R.color.accent_device_default_light);
        long a6 = colorResourceHelper.a(context, android.R.color.accent_material_dark);
        long a7 = colorResourceHelper.a(context, android.R.color.accent_material_light);
        colorResourceHelper.a(context, android.R.color.accessibility_focus_highlight);
        long a8 = colorResourceHelper.a(context, android.R.color.autofill_background_material_dark);
        long d6 = d(colorResourceHelper.a(context, android.R.color.accessibility_focus_highlight), 24.0f);
        long d7 = d(colorResourceHelper.a(context, android.R.color.accessibility_focus_highlight), 22.0f);
        long a9 = colorResourceHelper.a(context, android.R.color.autofill_background_material_light);
        long d8 = d(colorResourceHelper.a(context, android.R.color.accessibility_focus_highlight), 17.0f);
        long d9 = d(colorResourceHelper.a(context, android.R.color.accessibility_focus_highlight), 12.0f);
        long a10 = colorResourceHelper.a(context, android.R.color.autofilled_highlight);
        long d10 = d(colorResourceHelper.a(context, android.R.color.accessibility_focus_highlight), 6.0f);
        long d11 = d(colorResourceHelper.a(context, android.R.color.accessibility_focus_highlight), 4.0f);
        long a11 = colorResourceHelper.a(context, android.R.color.background_cache_hint_selector_device_default);
        long a12 = colorResourceHelper.a(context, android.R.color.background_cache_hint_selector_holo_dark);
        colorResourceHelper.a(context, android.R.color.background_cache_hint_selector_holo_light);
        colorResourceHelper.a(context, android.R.color.background_cache_hint_selector_material_dark);
        long a13 = colorResourceHelper.a(context, android.R.color.background_cache_hint_selector_material_light);
        long a14 = colorResourceHelper.a(context, android.R.color.background_device_default_dark);
        colorResourceHelper.a(context, android.R.color.background_device_default_light);
        colorResourceHelper.a(context, android.R.color.background_floating_device_default_dark);
        colorResourceHelper.a(context, android.R.color.background_floating_device_default_light);
        long a15 = colorResourceHelper.a(context, android.R.color.background_floating_material_dark);
        long a16 = colorResourceHelper.a(context, android.R.color.background_floating_material_light);
        long a17 = colorResourceHelper.a(context, android.R.color.background_holo_dark);
        long a18 = colorResourceHelper.a(context, android.R.color.background_holo_light);
        colorResourceHelper.a(context, android.R.color.background_leanback_dark);
        long a19 = colorResourceHelper.a(context, android.R.color.background_leanback_light);
        colorResourceHelper.a(context, android.R.color.background_material_dark);
        colorResourceHelper.a(context, android.R.color.background_material_light);
        long a20 = colorResourceHelper.a(context, android.R.color.bright_foreground_dark);
        long a21 = colorResourceHelper.a(context, android.R.color.bright_foreground_dark_disabled);
        colorResourceHelper.a(context, android.R.color.bright_foreground_dark_inverse);
        colorResourceHelper.a(context, android.R.color.bright_foreground_disabled_holo_dark);
        colorResourceHelper.a(context, android.R.color.bright_foreground_disabled_holo_light);
        long a22 = colorResourceHelper.a(context, android.R.color.bright_foreground_holo_dark);
        long a23 = colorResourceHelper.a(context, android.R.color.bright_foreground_holo_light);
        long a24 = colorResourceHelper.a(context, android.R.color.bright_foreground_inverse_holo_dark);
        long a25 = colorResourceHelper.a(context, android.R.color.bright_foreground_inverse_holo_light);
        colorResourceHelper.a(context, android.R.color.bright_foreground_light);
        long a26 = colorResourceHelper.a(context, android.R.color.bright_foreground_light_disabled);
        colorResourceHelper.a(context, android.R.color.bright_foreground_light_inverse);
        colorResourceHelper.a(context, android.R.color.btn_colored_background_material);
        long a27 = colorResourceHelper.a(context, android.R.color.btn_colored_borderless_text_material);
        long a28 = colorResourceHelper.a(context, android.R.color.btn_colored_text_material);
        colorResourceHelper.a(context, android.R.color.btn_default_material_dark);
        colorResourceHelper.a(context, android.R.color.btn_default_material_light);
        colorResourceHelper.a(context, android.R.color.btn_watch_default_dark);
        long a29 = colorResourceHelper.a(context, android.R.color.button_material_dark);
        long a30 = colorResourceHelper.a(context, android.R.color.button_material_light);
        long a31 = colorResourceHelper.a(context, android.R.color.button_normal_device_default_dark);
        long a32 = colorResourceHelper.a(context, android.R.color.car_accent);
        colorResourceHelper.a(context, android.R.color.car_accent_dark);
        return new TonalPalette(a2, d, d2, a3, d3, d4, a4, d5, a5, a6, a7, a8, d6, d7, a9, d8, d9, a10, d10, d11, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27, a28, a29, a30, a31, a32);
    }

    public static final long d(long j2, float f2) {
        double d = f2;
        if (!(d < 1.0E-4d) && !(d > 99.9999d)) {
            Lab lab = ColorSpaces.f15088r;
            long a2 = Color.a(j2, lab);
            return Color.a(ColorKt.a(f2, Color.g(a2), Color.e(a2), 1.0f, lab), ColorSpaces.f15075c);
        }
        float f3 = 100;
        float f4 = 16;
        float f5 = 116;
        float f6 = (f2 + f4) / f5;
        float f7 = f6 * f6 * f6;
        if (f7 <= 0.008856452f) {
            f7 = ((f5 * f6) - f4) / 903.2963f;
        }
        double d2 = (f7 * f3) / f3;
        int b2 = MathUtils.b(p0.a.s0((d2 <= 0.0031308d ? d2 * 12.92d : (Math.pow(d2, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d), 0, 255);
        return ColorKt.c(b2, b2, b2, 255);
    }
}

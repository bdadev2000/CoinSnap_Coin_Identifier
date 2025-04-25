package com.glority.android.picturexx.theme;

import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import com.glority.android.compose.ui.theme.GlTypographyKt;
import com.glority.base.utils.StatusBarUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Theme.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0002\u0010\f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"LightColors", "Landroidx/compose/material3/ColorScheme;", "DarkColors", "BlueLightColors", "BlueDarkColors", "AppTheme", "", "useDarkTheme", "", "content", "Landroidx/compose/runtime/internal/ComposableFunction0;", "Landroidx/compose/runtime/Composable;", "(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "businessMod_release"}, k = 2, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class ThemeKt {
    private static final ColorScheme BlueDarkColors;
    private static final ColorScheme BlueLightColors;
    private static final ColorScheme DarkColors;
    private static final ColorScheme LightColors;

    static {
        long md_theme_light_primary = ColorKt.getMd_theme_light_primary();
        long md_theme_light_onPrimary = ColorKt.getMd_theme_light_onPrimary();
        long md_theme_light_primaryContainer = ColorKt.getMd_theme_light_primaryContainer();
        long md_theme_light_onPrimaryContainer = ColorKt.getMd_theme_light_onPrimaryContainer();
        long md_theme_light_secondary = ColorKt.getMd_theme_light_secondary();
        long md_theme_light_onSecondary = ColorKt.getMd_theme_light_onSecondary();
        long md_theme_light_secondaryContainer = ColorKt.getMd_theme_light_secondaryContainer();
        long md_theme_light_onSecondaryContainer = ColorKt.getMd_theme_light_onSecondaryContainer();
        long md_theme_light_tertiary = ColorKt.getMd_theme_light_tertiary();
        long md_theme_light_onTertiary = ColorKt.getMd_theme_light_onTertiary();
        long md_theme_light_tertiaryContainer = ColorKt.getMd_theme_light_tertiaryContainer();
        long md_theme_light_onTertiaryContainer = ColorKt.getMd_theme_light_onTertiaryContainer();
        long md_theme_light_error = ColorKt.getMd_theme_light_error();
        long md_theme_light_errorContainer = ColorKt.getMd_theme_light_errorContainer();
        long md_theme_light_onError = ColorKt.getMd_theme_light_onError();
        long md_theme_light_onErrorContainer = ColorKt.getMd_theme_light_onErrorContainer();
        long md_theme_light_background = ColorKt.getMd_theme_light_background();
        long md_theme_light_onBackground = ColorKt.getMd_theme_light_onBackground();
        long md_theme_light_surface = ColorKt.getMd_theme_light_surface();
        long md_theme_light_onSurface = ColorKt.getMd_theme_light_onSurface();
        long md_theme_light_surfaceVariant = ColorKt.getMd_theme_light_surfaceVariant();
        long md_theme_light_onSurfaceVariant = ColorKt.getMd_theme_light_onSurfaceVariant();
        long md_theme_light_outline = ColorKt.getMd_theme_light_outline();
        long md_theme_light_inverseOnSurface = ColorKt.getMd_theme_light_inverseOnSurface();
        LightColors = ColorSchemeKt.m2257lightColorSchemeCXl9yA$default(md_theme_light_primary, md_theme_light_onPrimary, md_theme_light_primaryContainer, md_theme_light_onPrimaryContainer, ColorKt.getMd_theme_light_inversePrimary(), md_theme_light_secondary, md_theme_light_onSecondary, md_theme_light_secondaryContainer, md_theme_light_onSecondaryContainer, md_theme_light_tertiary, md_theme_light_onTertiary, md_theme_light_tertiaryContainer, md_theme_light_onTertiaryContainer, md_theme_light_background, md_theme_light_onBackground, md_theme_light_surface, md_theme_light_onSurface, md_theme_light_surfaceVariant, md_theme_light_onSurfaceVariant, ColorKt.getMd_theme_light_surfaceTint(), ColorKt.getMd_theme_light_inverseSurface(), md_theme_light_inverseOnSurface, md_theme_light_error, md_theme_light_onError, md_theme_light_errorContainer, md_theme_light_onErrorContainer, md_theme_light_outline, ColorKt.getMd_theme_light_outlineVariant(), ColorKt.getMd_theme_light_scrim(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, -536870912, 15, null);
        long md_theme_dark_primary = ColorKt.getMd_theme_dark_primary();
        long md_theme_dark_onPrimary = ColorKt.getMd_theme_dark_onPrimary();
        long md_theme_dark_primaryContainer = ColorKt.getMd_theme_dark_primaryContainer();
        long md_theme_dark_onPrimaryContainer = ColorKt.getMd_theme_dark_onPrimaryContainer();
        long md_theme_dark_secondary = ColorKt.getMd_theme_dark_secondary();
        long md_theme_dark_onSecondary = ColorKt.getMd_theme_dark_onSecondary();
        long md_theme_dark_secondaryContainer = ColorKt.getMd_theme_dark_secondaryContainer();
        long md_theme_dark_onSecondaryContainer = ColorKt.getMd_theme_dark_onSecondaryContainer();
        long md_theme_dark_tertiary = ColorKt.getMd_theme_dark_tertiary();
        long md_theme_dark_onTertiary = ColorKt.getMd_theme_dark_onTertiary();
        long md_theme_dark_tertiaryContainer = ColorKt.getMd_theme_dark_tertiaryContainer();
        long md_theme_dark_onTertiaryContainer = ColorKt.getMd_theme_dark_onTertiaryContainer();
        long md_theme_dark_error = ColorKt.getMd_theme_dark_error();
        long md_theme_dark_errorContainer = ColorKt.getMd_theme_dark_errorContainer();
        long md_theme_dark_onError = ColorKt.getMd_theme_dark_onError();
        long md_theme_dark_onErrorContainer = ColorKt.getMd_theme_dark_onErrorContainer();
        long md_theme_dark_background = ColorKt.getMd_theme_dark_background();
        long md_theme_dark_onBackground = ColorKt.getMd_theme_dark_onBackground();
        long md_theme_dark_surface = ColorKt.getMd_theme_dark_surface();
        long md_theme_dark_onSurface = ColorKt.getMd_theme_dark_onSurface();
        long md_theme_dark_surfaceVariant = ColorKt.getMd_theme_dark_surfaceVariant();
        long md_theme_dark_onSurfaceVariant = ColorKt.getMd_theme_dark_onSurfaceVariant();
        long md_theme_dark_outline = ColorKt.getMd_theme_dark_outline();
        long md_theme_dark_inverseOnSurface = ColorKt.getMd_theme_dark_inverseOnSurface();
        DarkColors = ColorSchemeKt.m2253darkColorSchemeCXl9yA$default(md_theme_dark_primary, md_theme_dark_onPrimary, md_theme_dark_primaryContainer, md_theme_dark_onPrimaryContainer, ColorKt.getMd_theme_dark_inversePrimary(), md_theme_dark_secondary, md_theme_dark_onSecondary, md_theme_dark_secondaryContainer, md_theme_dark_onSecondaryContainer, md_theme_dark_tertiary, md_theme_dark_onTertiary, md_theme_dark_tertiaryContainer, md_theme_dark_onTertiaryContainer, md_theme_dark_background, md_theme_dark_onBackground, md_theme_dark_surface, md_theme_dark_onSurface, md_theme_dark_surfaceVariant, md_theme_dark_onSurfaceVariant, ColorKt.getMd_theme_dark_surfaceTint(), ColorKt.getMd_theme_dark_inverseSurface(), md_theme_dark_inverseOnSurface, md_theme_dark_error, md_theme_dark_onError, md_theme_dark_errorContainer, md_theme_dark_onErrorContainer, md_theme_dark_outline, ColorKt.getMd_theme_dark_outlineVariant(), ColorKt.getMd_theme_dark_scrim(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, -536870912, 15, null);
        long md_blue_theme_light_primary = CoinColorBlueKt.getMd_blue_theme_light_primary();
        long md_blue_theme_light_onPrimary = CoinColorBlueKt.getMd_blue_theme_light_onPrimary();
        long md_blue_theme_light_primaryContainer = CoinColorBlueKt.getMd_blue_theme_light_primaryContainer();
        long md_blue_theme_light_onPrimaryContainer = CoinColorBlueKt.getMd_blue_theme_light_onPrimaryContainer();
        long md_blue_theme_light_secondary = CoinColorBlueKt.getMd_blue_theme_light_secondary();
        long md_blue_theme_light_onSecondary = CoinColorBlueKt.getMd_blue_theme_light_onSecondary();
        long md_blue_theme_light_secondaryContainer = CoinColorBlueKt.getMd_blue_theme_light_secondaryContainer();
        long md_blue_theme_light_onSecondaryContainer = CoinColorBlueKt.getMd_blue_theme_light_onSecondaryContainer();
        long md_blue_theme_light_tertiary = CoinColorBlueKt.getMd_blue_theme_light_tertiary();
        long md_blue_theme_light_onTertiary = CoinColorBlueKt.getMd_blue_theme_light_onTertiary();
        long md_blue_theme_light_tertiaryContainer = CoinColorBlueKt.getMd_blue_theme_light_tertiaryContainer();
        long md_blue_theme_light_onTertiaryContainer = CoinColorBlueKt.getMd_blue_theme_light_onTertiaryContainer();
        long md_blue_theme_light_error = CoinColorBlueKt.getMd_blue_theme_light_error();
        long md_blue_theme_light_errorContainer = CoinColorBlueKt.getMd_blue_theme_light_errorContainer();
        long md_blue_theme_light_onError = CoinColorBlueKt.getMd_blue_theme_light_onError();
        long md_blue_theme_light_onErrorContainer = CoinColorBlueKt.getMd_blue_theme_light_onErrorContainer();
        long md_blue_theme_light_background = CoinColorBlueKt.getMd_blue_theme_light_background();
        long md_blue_theme_light_onBackground = CoinColorBlueKt.getMd_blue_theme_light_onBackground();
        long md_blue_theme_light_surface = CoinColorBlueKt.getMd_blue_theme_light_surface();
        long md_blue_theme_light_onSurface = CoinColorBlueKt.getMd_blue_theme_light_onSurface();
        long md_blue_theme_light_surfaceVariant = CoinColorBlueKt.getMd_blue_theme_light_surfaceVariant();
        long md_blue_theme_light_onSurfaceVariant = CoinColorBlueKt.getMd_blue_theme_light_onSurfaceVariant();
        long md_blue_theme_light_outline = CoinColorBlueKt.getMd_blue_theme_light_outline();
        long md_blue_theme_light_inverseOnSurface = CoinColorBlueKt.getMd_blue_theme_light_inverseOnSurface();
        BlueLightColors = ColorSchemeKt.m2257lightColorSchemeCXl9yA$default(md_blue_theme_light_primary, md_blue_theme_light_onPrimary, md_blue_theme_light_primaryContainer, md_blue_theme_light_onPrimaryContainer, CoinColorBlueKt.getMd_blue_theme_light_inversePrimary(), md_blue_theme_light_secondary, md_blue_theme_light_onSecondary, md_blue_theme_light_secondaryContainer, md_blue_theme_light_onSecondaryContainer, md_blue_theme_light_tertiary, md_blue_theme_light_onTertiary, md_blue_theme_light_tertiaryContainer, md_blue_theme_light_onTertiaryContainer, md_blue_theme_light_background, md_blue_theme_light_onBackground, md_blue_theme_light_surface, md_blue_theme_light_onSurface, md_blue_theme_light_surfaceVariant, md_blue_theme_light_onSurfaceVariant, CoinColorBlueKt.getMd_blue_theme_light_surfaceTint(), CoinColorBlueKt.getMd_blue_theme_light_inverseSurface(), md_blue_theme_light_inverseOnSurface, md_blue_theme_light_error, md_blue_theme_light_onError, md_blue_theme_light_errorContainer, md_blue_theme_light_onErrorContainer, md_blue_theme_light_outline, CoinColorBlueKt.getMd_blue_theme_light_outlineVariant(), CoinColorBlueKt.getMd_blue_theme_light_scrim(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, -536870912, 15, null);
        long md_blue_theme_dark_primary = CoinColorBlueKt.getMd_blue_theme_dark_primary();
        long md_blue_theme_dark_onPrimary = CoinColorBlueKt.getMd_blue_theme_dark_onPrimary();
        long md_blue_theme_dark_primaryContainer = CoinColorBlueKt.getMd_blue_theme_dark_primaryContainer();
        long md_blue_theme_dark_onPrimaryContainer = CoinColorBlueKt.getMd_blue_theme_dark_onPrimaryContainer();
        long md_blue_theme_dark_secondary = CoinColorBlueKt.getMd_blue_theme_dark_secondary();
        long md_blue_theme_dark_onSecondary = CoinColorBlueKt.getMd_blue_theme_dark_onSecondary();
        long md_blue_theme_dark_secondaryContainer = CoinColorBlueKt.getMd_blue_theme_dark_secondaryContainer();
        long md_blue_theme_dark_onSecondaryContainer = CoinColorBlueKt.getMd_blue_theme_dark_onSecondaryContainer();
        long md_blue_theme_dark_tertiary = CoinColorBlueKt.getMd_blue_theme_dark_tertiary();
        long md_blue_theme_dark_onTertiary = CoinColorBlueKt.getMd_blue_theme_dark_onTertiary();
        long md_blue_theme_dark_tertiaryContainer = CoinColorBlueKt.getMd_blue_theme_dark_tertiaryContainer();
        long md_blue_theme_dark_onTertiaryContainer = CoinColorBlueKt.getMd_blue_theme_dark_onTertiaryContainer();
        long md_blue_theme_dark_error = CoinColorBlueKt.getMd_blue_theme_dark_error();
        long md_blue_theme_dark_errorContainer = CoinColorBlueKt.getMd_blue_theme_dark_errorContainer();
        long md_blue_theme_dark_onError = CoinColorBlueKt.getMd_blue_theme_dark_onError();
        long md_blue_theme_dark_onErrorContainer = CoinColorBlueKt.getMd_blue_theme_dark_onErrorContainer();
        long md_blue_theme_dark_background = CoinColorBlueKt.getMd_blue_theme_dark_background();
        long md_blue_theme_dark_onBackground = CoinColorBlueKt.getMd_blue_theme_dark_onBackground();
        long md_blue_theme_dark_surface = CoinColorBlueKt.getMd_blue_theme_dark_surface();
        long md_blue_theme_dark_onSurface = CoinColorBlueKt.getMd_blue_theme_dark_onSurface();
        long md_blue_theme_dark_surfaceVariant = CoinColorBlueKt.getMd_blue_theme_dark_surfaceVariant();
        long md_blue_theme_dark_onSurfaceVariant = CoinColorBlueKt.getMd_blue_theme_dark_onSurfaceVariant();
        long md_blue_theme_dark_outline = CoinColorBlueKt.getMd_blue_theme_dark_outline();
        long md_blue_theme_dark_inverseOnSurface = CoinColorBlueKt.getMd_blue_theme_dark_inverseOnSurface();
        BlueDarkColors = ColorSchemeKt.m2253darkColorSchemeCXl9yA$default(md_blue_theme_dark_primary, md_blue_theme_dark_onPrimary, md_blue_theme_dark_primaryContainer, md_blue_theme_dark_onPrimaryContainer, CoinColorBlueKt.getMd_blue_theme_dark_inversePrimary(), md_blue_theme_dark_secondary, md_blue_theme_dark_onSecondary, md_blue_theme_dark_secondaryContainer, md_blue_theme_dark_onSecondaryContainer, md_blue_theme_dark_tertiary, md_blue_theme_dark_onTertiary, md_blue_theme_dark_tertiaryContainer, md_blue_theme_dark_onTertiaryContainer, md_blue_theme_dark_background, md_blue_theme_dark_onBackground, md_blue_theme_dark_surface, md_blue_theme_dark_onSurface, md_blue_theme_dark_surfaceVariant, md_blue_theme_dark_onSurfaceVariant, CoinColorBlueKt.getMd_blue_theme_dark_surfaceTint(), CoinColorBlueKt.getMd_blue_theme_dark_inverseSurface(), md_blue_theme_dark_inverseOnSurface, md_blue_theme_dark_error, md_blue_theme_dark_onError, md_blue_theme_dark_errorContainer, md_blue_theme_dark_onErrorContainer, md_blue_theme_dark_outline, CoinColorBlueKt.getMd_blue_theme_dark_outlineVariant(), CoinColorBlueKt.getMd_blue_theme_dark_scrim(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, -536870912, 15, null);
    }

    public static final void AppTheme(final boolean z, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        ColorScheme colorScheme;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1644147005);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) == 0) {
            i3 |= startRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                z = false;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1644147005, i3, -1, "com.glority.android.picturexx.theme.AppTheme (Theme.kt:143)");
            }
            if (!z) {
                colorScheme = BlueLightColors;
            } else {
                colorScheme = BlueDarkColors;
            }
            MaterialThemeKt.MaterialTheme(colorScheme, null, GlTypographyKt.getGlTypography(), content, startRestartGroup, ((i3 << 6) & 7168) | 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.theme.ThemeKt$AppTheme$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    ThemeKt.AppTheme(z, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }
}

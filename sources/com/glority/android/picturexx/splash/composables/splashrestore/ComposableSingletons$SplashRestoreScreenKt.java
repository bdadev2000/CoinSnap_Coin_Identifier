package com.glority.android.picturexx.splash.composables.splashrestore;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.glority.android.picturexx.splash.R;
import com.glority.base.composables.ComposableExtensionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SplashRestoreScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class ComposableSingletons$SplashRestoreScreenKt {
    public static final ComposableSingletons$SplashRestoreScreenKt INSTANCE = new ComposableSingletons$SplashRestoreScreenKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f151lambda1 = ComposableLambdaKt.composableLambdaInstance(339148306, false, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.splashrestore.ComposableSingletons$SplashRestoreScreenKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(339148306, i, -1, "com.glority.android.picturexx.splash.composables.splashrestore.ComposableSingletons$SplashRestoreScreenKt.lambda-1.<anonymous> (SplashRestoreScreen.kt:150)");
                }
                ImageKt.Image(ComposableExtensionsKt.asPainter(R.drawable.icon_splash_restore_close_btn, composer, 0), "close", SizeKt.m1030size3ABfNKs(Modifier.INSTANCE, Dp.m6997constructorimpl(32)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 440, 120);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f152lambda2 = ComposableLambdaKt.composableLambdaInstance(1233786142, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.splashrestore.ComposableSingletons$SplashRestoreScreenKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope Button, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            if ((i & 81) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1233786142, i, -1, "com.glority.android.picturexx.splash.composables.splashrestore.ComposableSingletons$SplashRestoreScreenKt.lambda-2.<anonymous> (SplashRestoreScreen.kt:360)");
                }
                TextKt.m3014Text4IGK_g(ComposableExtensionsKt.asString(R.string.restorescreen_restore_button_text, composer, 0), (Modifier) null, Color.INSTANCE.m4552getWhite0d7_KjU(), TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(22), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3456, 6, 130034);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f153lambda3 = ComposableLambdaKt.composableLambdaInstance(-619037775, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.splashrestore.ComposableSingletons$SplashRestoreScreenKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope TextButton, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
            if ((i & 81) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-619037775, i, -1, "com.glority.android.picturexx.splash.composables.splashrestore.ComposableSingletons$SplashRestoreScreenKt.lambda-3.<anonymous> (SplashRestoreScreen.kt:375)");
                }
                TextKt.m3014Text4IGK_g(StringResources_androidKt.stringResource(R.string.restorefailedscreen_skip_button_text, composer, 0), (Modifier) null, ColorKt.Color(4287927444L), TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(22), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3456, 6, 130034);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-4, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f154lambda4 = ComposableLambdaKt.composableLambdaInstance(-490365422, false, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.splashrestore.ComposableSingletons$SplashRestoreScreenKt$lambda-4$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-490365422, i, -1, "com.glority.android.picturexx.splash.composables.splashrestore.ComposableSingletons$SplashRestoreScreenKt.lambda-4.<anonymous> (SplashRestoreScreen.kt:430)");
                }
                TextKt.m3014Text4IGK_g(StringResources_androidKt.stringResource(R.string.restorefailedscreen_email_input_placeholder, composer, 0), (Modifier) null, ColorKt.Color(4290032820L), TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(22), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3456, 6, 130034);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-5, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f155lambda5 = ComposableLambdaKt.composableLambdaInstance(408001211, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.splashrestore.ComposableSingletons$SplashRestoreScreenKt$lambda-5$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope Button, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            if ((i & 81) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(408001211, i, -1, "com.glority.android.picturexx.splash.composables.splashrestore.ComposableSingletons$SplashRestoreScreenKt.lambda-5.<anonymous> (SplashRestoreScreen.kt:475)");
                }
                TextKt.m3014Text4IGK_g(StringResources_androidKt.stringResource(R.string.restorefailedscreen_send_button_text, composer, 0), (Modifier) null, Color.INSTANCE.m4552getWhite0d7_KjU(), TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(22), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3456, 6, 130034);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-6, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f156lambda6 = ComposableLambdaKt.composableLambdaInstance(1322273294, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.composables.splashrestore.ComposableSingletons$SplashRestoreScreenKt$lambda-6$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope TextButton, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
            if ((i & 81) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1322273294, i, -1, "com.glority.android.picturexx.splash.composables.splashrestore.ComposableSingletons$SplashRestoreScreenKt.lambda-6.<anonymous> (SplashRestoreScreen.kt:490)");
                }
                TextKt.m3014Text4IGK_g(StringResources_androidKt.stringResource(R.string.restorefailedscreen_skip_button_text, composer, 0), (Modifier) null, ColorKt.Color(4287927444L), TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(22), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3456, 6, 130034);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-7, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f157lambda7 = ComposableLambdaKt.composableLambdaInstance(-1277942011, false, ComposableSingletons$SplashRestoreScreenKt$lambda7$1.INSTANCE);

    /* renamed from: getLambda-1$splash_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7850getLambda1$splash_release() {
        return f151lambda1;
    }

    /* renamed from: getLambda-2$splash_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7851getLambda2$splash_release() {
        return f152lambda2;
    }

    /* renamed from: getLambda-3$splash_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7852getLambda3$splash_release() {
        return f153lambda3;
    }

    /* renamed from: getLambda-4$splash_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7853getLambda4$splash_release() {
        return f154lambda4;
    }

    /* renamed from: getLambda-5$splash_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7854getLambda5$splash_release() {
        return f155lambda5;
    }

    /* renamed from: getLambda-6$splash_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7855getLambda6$splash_release() {
        return f156lambda6;
    }

    /* renamed from: getLambda-7$splash_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7856getLambda7$splash_release() {
        return f157lambda7;
    }
}

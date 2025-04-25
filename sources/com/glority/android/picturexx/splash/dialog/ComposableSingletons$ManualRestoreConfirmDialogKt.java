package com.glority.android.picturexx.splash.dialog;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.glority.android.picturexx.splash.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ManualRestoreConfirmDialog.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class ComposableSingletons$ManualRestoreConfirmDialogKt {
    public static final ComposableSingletons$ManualRestoreConfirmDialogKt INSTANCE = new ComposableSingletons$ManualRestoreConfirmDialogKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f158lambda1 = ComposableLambdaKt.composableLambdaInstance(-205166092, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.dialog.ComposableSingletons$ManualRestoreConfirmDialogKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope TextButton, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
            if ((i & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-205166092, i, -1, "com.glority.android.picturexx.splash.dialog.ComposableSingletons$ManualRestoreConfirmDialogKt.lambda-1.<anonymous> (ManualRestoreConfirmDialog.kt:102)");
            }
            TextKt.m3014Text4IGK_g(StringResources_androidKt.stringResource(R.string.text_confirm, composer, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f159lambda2 = ComposableLambdaKt.composableLambdaInstance(-1929774414, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.dialog.ComposableSingletons$ManualRestoreConfirmDialogKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope TextButton, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
            if ((i & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1929774414, i, -1, "com.glority.android.picturexx.splash.dialog.ComposableSingletons$ManualRestoreConfirmDialogKt.lambda-2.<anonymous> (ManualRestoreConfirmDialog.kt:111)");
            }
            TextKt.m3014Text4IGK_g(StringResources_androidKt.stringResource(R.string.text_cancel, composer, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f160lambda3 = ComposableLambdaKt.composableLambdaInstance(-1158502387, false, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.dialog.ComposableSingletons$ManualRestoreConfirmDialogKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1158502387, i, -1, "com.glority.android.picturexx.splash.dialog.ComposableSingletons$ManualRestoreConfirmDialogKt.lambda-3.<anonymous> (ManualRestoreConfirmDialog.kt:88)");
            }
            TextKt.m3014Text4IGK_g(StringResources_androidKt.stringResource(R.string.confirm_sync_dialog_title, composer, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-4, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f161lambda4 = ComposableLambdaKt.composableLambdaInstance(-2020806548, false, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.dialog.ComposableSingletons$ManualRestoreConfirmDialogKt$lambda-4$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2020806548, i, -1, "com.glority.android.picturexx.splash.dialog.ComposableSingletons$ManualRestoreConfirmDialogKt.lambda-4.<anonymous> (ManualRestoreConfirmDialog.kt:91)");
            }
            TextKt.m3014Text4IGK_g(StringResources_androidKt.stringResource(R.string.confirm_sync_dialog_message, composer, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$splash_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7857getLambda1$splash_release() {
        return f158lambda1;
    }

    /* renamed from: getLambda-2$splash_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7858getLambda2$splash_release() {
        return f159lambda2;
    }

    /* renamed from: getLambda-3$splash_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7859getLambda3$splash_release() {
        return f160lambda3;
    }

    /* renamed from: getLambda-4$splash_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7860getLambda4$splash_release() {
        return f161lambda4;
    }
}

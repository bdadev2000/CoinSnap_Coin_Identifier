package com.glority.android.picturexx.view.dialog;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ArrowBackKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.TextUnitKt;
import com.glority.android.picturexx.business.R;
import com.glority.base.composables.ComposableExtensionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CommonSuggestionsFeedbackDialog.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class ComposableSingletons$CommonSuggestionsFeedbackDialogKt {
    public static final ComposableSingletons$CommonSuggestionsFeedbackDialogKt INSTANCE = new ComposableSingletons$CommonSuggestionsFeedbackDialogKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f167lambda1 = ComposableLambdaKt.composableLambdaInstance(110774753, false, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.dialog.ComposableSingletons$CommonSuggestionsFeedbackDialogKt$lambda-1$1
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
                ComposerKt.traceEventStart(110774753, i, -1, "com.glority.android.picturexx.view.dialog.ComposableSingletons$CommonSuggestionsFeedbackDialogKt.lambda-1.<anonymous> (CommonSuggestionsFeedbackDialog.kt:132)");
            }
            IconKt.m2471Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.INSTANCE.getDefault()), "Back", (Modifier) null, 0L, composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f168lambda2 = ComposableLambdaKt.composableLambdaInstance(2062123507, false, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.dialog.ComposableSingletons$CommonSuggestionsFeedbackDialogKt$lambda-2$1
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
                ComposerKt.traceEventStart(2062123507, i, -1, "com.glority.android.picturexx.view.dialog.ComposableSingletons$CommonSuggestionsFeedbackDialogKt.lambda-2.<anonymous> (CommonSuggestionsFeedbackDialog.kt:157)");
            }
            TextKt.m3014Text4IGK_g(ComposableExtensionsKt.asString(R.string.grade_feedback_popups_paratext3, composer, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f169lambda3 = ComposableLambdaKt.composableLambdaInstance(-717506596, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.dialog.ComposableSingletons$CommonSuggestionsFeedbackDialogKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope Button, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            if ((i & 81) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-717506596, i, -1, "com.glority.android.picturexx.view.dialog.ComposableSingletons$CommonSuggestionsFeedbackDialogKt.lambda-3.<anonymous> (CommonSuggestionsFeedbackDialog.kt:191)");
                }
                TextKt.m3014Text4IGK_g(ComposableExtensionsKt.asString(R.string.text_submit, composer, 0), (Modifier) null, Color.INSTANCE.m4552getWhite0d7_KjU(), TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3456, 0, 131058);
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
    public static Function2<Composer, Integer, Unit> f170lambda4 = ComposableLambdaKt.composableLambdaInstance(-1782357233, false, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.dialog.ComposableSingletons$CommonSuggestionsFeedbackDialogKt$lambda-4$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1782357233, i, -1, "com.glority.android.picturexx.view.dialog.ComposableSingletons$CommonSuggestionsFeedbackDialogKt.lambda-4.<anonymous> (CommonSuggestionsFeedbackDialog.kt:207)");
                }
                CommonSuggestionsFeedbackDialogKt.SuggestionScreen(Modifier.INSTANCE, new Function0<Unit>() { // from class: com.glority.android.picturexx.view.dialog.ComposableSingletons$CommonSuggestionsFeedbackDialogKt$lambda-4$1.1
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                }, new Function1<String, Unit>() { // from class: com.glority.android.picturexx.view.dialog.ComposableSingletons$CommonSuggestionsFeedbackDialogKt$lambda-4$1.2
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(String it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(String str) {
                        invoke2(str);
                        return Unit.INSTANCE;
                    }
                }, composer, 438);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: getLambda-1$businessMod_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7885getLambda1$businessMod_release() {
        return f167lambda1;
    }

    /* renamed from: getLambda-2$businessMod_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7886getLambda2$businessMod_release() {
        return f168lambda2;
    }

    /* renamed from: getLambda-3$businessMod_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7887getLambda3$businessMod_release() {
        return f169lambda3;
    }

    /* renamed from: getLambda-4$businessMod_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7888getLambda4$businessMod_release() {
        return f170lambda4;
    }
}

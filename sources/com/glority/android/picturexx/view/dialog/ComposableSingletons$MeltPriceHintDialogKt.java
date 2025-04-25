package com.glority.android.picturexx.view.dialog;

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
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.TextUnitKt;
import com.glority.android.picturexx.business.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MeltPriceHintDialog.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class ComposableSingletons$MeltPriceHintDialogKt {
    public static final ComposableSingletons$MeltPriceHintDialogKt INSTANCE = new ComposableSingletons$MeltPriceHintDialogKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f171lambda1 = ComposableLambdaKt.composableLambdaInstance(1933615892, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.dialog.ComposableSingletons$MeltPriceHintDialogKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope Button, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            if ((i & 81) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1933615892, i, -1, "com.glority.android.picturexx.view.dialog.ComposableSingletons$MeltPriceHintDialogKt.lambda-1.<anonymous> (MeltPriceHintDialog.kt:144)");
                }
                TextKt.m3014Text4IGK_g(StringResources_androidKt.stringResource(R.string.collection_seriesdetails_got, composer, 0), (Modifier) null, Color.INSTANCE.m4552getWhite0d7_KjU(), TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(22), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3456, 6, 130034);
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
    public static Function2<Composer, Integer, Unit> f172lambda2 = ComposableLambdaKt.composableLambdaInstance(-1172951157, false, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.dialog.ComposableSingletons$MeltPriceHintDialogKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1172951157, i, -1, "com.glority.android.picturexx.view.dialog.ComposableSingletons$MeltPriceHintDialogKt.lambda-2.<anonymous> (MeltPriceHintDialog.kt:162)");
                }
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_close_black, composer, 0), "", SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 440, 120);
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
    public final Function3<RowScope, Composer, Integer, Unit> m7889getLambda1$businessMod_release() {
        return f171lambda1;
    }

    /* renamed from: getLambda-2$businessMod_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7890getLambda2$businessMod_release() {
        return f172lambda2;
    }
}

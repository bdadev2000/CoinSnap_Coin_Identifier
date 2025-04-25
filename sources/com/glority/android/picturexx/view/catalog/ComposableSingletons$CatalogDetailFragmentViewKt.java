package com.glority.android.picturexx.view.catalog;

import androidx.compose.material3.DividerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.unit.Dp;
import com.glority.android.picturexx.theme.CoinColor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CatalogDetailFragmentView.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class ComposableSingletons$CatalogDetailFragmentViewKt {
    public static final ComposableSingletons$CatalogDetailFragmentViewKt INSTANCE = new ComposableSingletons$CatalogDetailFragmentViewKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f162lambda1 = ComposableLambdaKt.composableLambdaInstance(796386058, false, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.catalog.ComposableSingletons$CatalogDetailFragmentViewKt$lambda-1$1
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
                ComposerKt.traceEventStart(796386058, i, -1, "com.glority.android.picturexx.view.catalog.ComposableSingletons$CatalogDetailFragmentViewKt.lambda-1.<anonymous> (CatalogDetailFragmentView.kt:369)");
            }
            DividerKt.m2392Divider9IZ8Weo(null, Dp.m6997constructorimpl((float) 0.5d), CoinColor.INSTANCE.m7870dividerColorWaAFU9c(composer, 6), composer, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$businessMod_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7877getLambda1$businessMod_release() {
        return f162lambda1;
    }
}

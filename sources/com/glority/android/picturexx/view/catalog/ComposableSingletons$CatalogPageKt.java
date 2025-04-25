package com.glority.android.picturexx.view.catalog;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CatalogPage.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class ComposableSingletons$CatalogPageKt {
    public static final ComposableSingletons$CatalogPageKt INSTANCE = new ComposableSingletons$CatalogPageKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function4<LazyGridItemScope, Integer, Composer, Integer, Unit> f163lambda1 = ComposableLambdaKt.composableLambdaInstance(-258553797, false, new Function4<LazyGridItemScope, Integer, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.catalog.ComposableSingletons$CatalogPageKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyGridItemScope items, int i, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(items, "$this$items");
            if ((i2 & 641) == 128 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-258553797, i2, -1, "com.glority.android.picturexx.view.catalog.ComposableSingletons$CatalogPageKt.lambda-1.<anonymous> (CatalogPage.kt:128)");
            }
            BoxKt.Box(SizeKt.m1016height3ABfNKs(Modifier.INSTANCE, Dp.m6997constructorimpl(60)), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$businessMod_release, reason: not valid java name */
    public final Function4<LazyGridItemScope, Integer, Composer, Integer, Unit> m7878getLambda1$businessMod_release() {
        return f163lambda1;
    }
}

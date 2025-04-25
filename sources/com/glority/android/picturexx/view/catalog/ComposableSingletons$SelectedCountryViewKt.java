package com.glority.android.picturexx.view.catalog;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SelectedCountryView.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class ComposableSingletons$SelectedCountryViewKt {
    public static final ComposableSingletons$SelectedCountryViewKt INSTANCE = new ComposableSingletons$SelectedCountryViewKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function4<LazyItemScope, Integer, Composer, Integer, Unit> f165lambda1 = ComposableLambdaKt.composableLambdaInstance(931327695, false, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.catalog.ComposableSingletons$SelectedCountryViewKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope items, int i, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(items, "$this$items");
            if ((i2 & 641) == 128 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(931327695, i2, -1, "com.glority.android.picturexx.view.catalog.ComposableSingletons$SelectedCountryViewKt.lambda-1.<anonymous> (SelectedCountryView.kt:105)");
            }
            BoxKt.Box(SizeKt.m1016height3ABfNKs(Modifier.INSTANCE, Dp.m6997constructorimpl(80)), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function4<LazyItemScope, Integer, Composer, Integer, Unit> f166lambda2 = ComposableLambdaKt.composableLambdaInstance(-1355395848, false, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.catalog.ComposableSingletons$SelectedCountryViewKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope items, int i, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(items, "$this$items");
            if ((i2 & 641) == 128 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1355395848, i2, -1, "com.glority.android.picturexx.view.catalog.ComposableSingletons$SelectedCountryViewKt.lambda-2.<anonymous> (SelectedCountryView.kt:191)");
            }
            BoxKt.Box(SizeKt.m1016height3ABfNKs(Modifier.INSTANCE, Dp.m6997constructorimpl(80)), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$businessMod_release, reason: not valid java name */
    public final Function4<LazyItemScope, Integer, Composer, Integer, Unit> m7880getLambda1$businessMod_release() {
        return f165lambda1;
    }

    /* renamed from: getLambda-2$businessMod_release, reason: not valid java name */
    public final Function4<LazyItemScope, Integer, Composer, Integer, Unit> m7881getLambda2$businessMod_release() {
        return f166lambda2;
    }
}

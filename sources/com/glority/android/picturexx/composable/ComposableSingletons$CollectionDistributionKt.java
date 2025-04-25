package com.glority.android.picturexx.composable;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import com.glority.android.picturexx.business.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CollectionDistribution.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class ComposableSingletons$CollectionDistributionKt {
    public static final ComposableSingletons$CollectionDistributionKt INSTANCE = new ComposableSingletons$CollectionDistributionKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function3<LazyItemScope, Composer, Integer, Unit> f93lambda1 = ComposableLambdaKt.composableLambdaInstance(212611367, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.composable.ComposableSingletons$CollectionDistributionKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 81) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(212611367, i, -1, "com.glority.android.picturexx.composable.ComposableSingletons$CollectionDistributionKt.lambda-1.<anonymous> (CollectionDistribution.kt:411)");
                }
                SpacerKt.Spacer(SizeKt.m1016height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen.x40, composer, 0)), composer, 0);
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
    public static Function3<LazyItemScope, Composer, Integer, Unit> f94lambda2 = ComposableLambdaKt.composableLambdaInstance(1294395119, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.composable.ComposableSingletons$CollectionDistributionKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 81) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1294395119, i, -1, "com.glority.android.picturexx.composable.ComposableSingletons$CollectionDistributionKt.lambda-2.<anonymous> (CollectionDistribution.kt:551)");
                }
                SpacerKt.Spacer(SizeKt.m1016height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen.x40, composer, 0)), composer, 0);
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
    public static Function3<LazyItemScope, Composer, Integer, Unit> f95lambda3 = ComposableLambdaKt.composableLambdaInstance(-1947535410, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.composable.ComposableSingletons$CollectionDistributionKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 81) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1947535410, i, -1, "com.glority.android.picturexx.composable.ComposableSingletons$CollectionDistributionKt.lambda-3.<anonymous> (CollectionDistribution.kt:582)");
                }
                SpacerKt.Spacer(SizeKt.m1016height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen.x40, composer, 0)), composer, 0);
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
    public final Function3<LazyItemScope, Composer, Integer, Unit> m7763getLambda1$businessMod_release() {
        return f93lambda1;
    }

    /* renamed from: getLambda-2$businessMod_release, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m7764getLambda2$businessMod_release() {
        return f94lambda2;
    }

    /* renamed from: getLambda-3$businessMod_release, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m7765getLambda3$businessMod_release() {
        return f95lambda3;
    }
}

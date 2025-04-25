package com.glority.android.compose.ui;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ArrowBackKt;
import androidx.compose.material.icons.outlined.ClearKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: Search.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class ComposableSingletons$SearchKt {
    public static final ComposableSingletons$SearchKt INSTANCE = new ComposableSingletons$SearchKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f88lambda1 = ComposableLambdaKt.composableLambdaInstance(1374054033, false, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.compose.ui.ComposableSingletons$SearchKt$lambda-1$1
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
                ComposerKt.traceEventStart(1374054033, i, -1, "com.glority.android.compose.ui.ComposableSingletons$SearchKt.lambda-1.<anonymous> (Search.kt:59)");
            }
            IconKt.m2471Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.INSTANCE.getDefault()), (String) null, (Modifier) null, 0L, composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f89lambda2 = ComposableLambdaKt.composableLambdaInstance(1250805676, false, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.compose.ui.ComposableSingletons$SearchKt$lambda-2$1
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
                ComposerKt.traceEventStart(1250805676, i, -1, "com.glority.android.compose.ui.ComposableSingletons$SearchKt.lambda-2.<anonymous> (Search.kt:82)");
            }
            IconKt.m2471Iconww6aTOc(ClearKt.getClear(Icons.Outlined.INSTANCE), (String) null, (Modifier) null, 0L, composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$lib_compose_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7710getLambda1$lib_compose_release() {
        return f88lambda1;
    }

    /* renamed from: getLambda-2$lib_compose_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7711getLambda2$lib_compose_release() {
        return f89lambda2;
    }
}

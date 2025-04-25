package com.glority.android.compose.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: TextField.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class ComposableSingletons$TextFieldKt {
    public static final ComposableSingletons$TextFieldKt INSTANCE = new ComposableSingletons$TextFieldKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f90lambda1 = ComposableLambdaKt.composableLambdaInstance(1003276191, false, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.compose.ui.ComposableSingletons$TextFieldKt$lambda-1$1
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
                ComposerKt.traceEventStart(1003276191, i, -1, "com.glority.android.compose.ui.ComposableSingletons$TextFieldKt.lambda-1.<anonymous> (TextField.kt:47)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$lib_compose_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7712getLambda1$lib_compose_release() {
        return f90lambda1;
    }
}

package com.glority.android.picturexx.view.recognize;

import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: ValueCheckerFragment.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class ComposableSingletons$ValueCheckerFragmentKt {
    public static final ComposableSingletons$ValueCheckerFragmentKt INSTANCE = new ComposableSingletons$ValueCheckerFragmentKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f173lambda1 = ComposableLambdaKt.composableLambdaInstance(-1278872558, false, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.recognize.ComposableSingletons$ValueCheckerFragmentKt$lambda-1$1
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
                ComposerKt.traceEventStart(-1278872558, i, -1, "com.glority.android.picturexx.view.recognize.ComposableSingletons$ValueCheckerFragmentKt.lambda-1.<anonymous> (ValueCheckerFragment.kt:111)");
            }
            TextKt.m3014Text4IGK_g("", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$businessMod_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7906getLambda1$businessMod_release() {
        return f173lambda1;
    }
}

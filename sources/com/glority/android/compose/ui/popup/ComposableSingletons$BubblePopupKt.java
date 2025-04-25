package com.glority.android.compose.ui.popup;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
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
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BubblePopup.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class ComposableSingletons$BubblePopupKt {
    public static final ComposableSingletons$BubblePopupKt INSTANCE = new ComposableSingletons$BubblePopupKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f91lambda1 = ComposableLambdaKt.composableLambdaInstance(-1108583835, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.glority.android.compose.ui.popup.ComposableSingletons$BubblePopupKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope Button, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            if ((i & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1108583835, i, -1, "com.glority.android.compose.ui.popup.ComposableSingletons$BubblePopupKt.lambda-1.<anonymous> (BubblePopup.kt:40)");
            }
            TextKt.m3014Text4IGK_g("show", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function3<ColumnScope, Composer, Integer, Unit> f92lambda2 = ComposableLambdaKt.composableLambdaInstance(944384504, false, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.glority.android.compose.ui.popup.ComposableSingletons$BubblePopupKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            invoke(columnScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(ColumnScope BubblePopup, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BubblePopup, "$this$BubblePopup");
            if ((i & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(944384504, i, -1, "com.glority.android.compose.ui.popup.ComposableSingletons$BubblePopupKt.lambda-2.<anonymous> (BubblePopup.kt:47)");
            }
            TextKt.m3014Text4IGK_g("Item 1 Item 2 Item 2", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$lib_compose_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7720getLambda1$lib_compose_release() {
        return f91lambda1;
    }

    /* renamed from: getLambda-2$lib_compose_release, reason: not valid java name */
    public final Function3<ColumnScope, Composer, Integer, Unit> m7721getLambda2$lib_compose_release() {
        return f92lambda2;
    }
}

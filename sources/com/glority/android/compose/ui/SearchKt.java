package com.glority.android.compose.ui;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Search.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0002\u001aW\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u008e\u0002"}, d2 = {"ExpandedSearchBarPreview", "", "(Landroidx/compose/runtime/Composer;I)V", "GlSearchBar", "modifier", "Landroidx/compose/ui/Modifier;", "hintText", "", "text", "onValueChange", "Lkotlin/Function1;", "onBackClick", "Lkotlin/Function0;", "onClearClick", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "lib-compose_release", "inputText", "Landroidx/compose/ui/text/input/TextFieldValue;"}, k = 2, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class SearchKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void ExpandedSearchBarPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1415272734);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1415272734, i, -1, "com.glority.android.compose.ui.ExpandedSearchBarPreview (Search.kt:31)");
            }
            GlSearchBar(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), "hint", "", new Function1<String, Unit>() { // from class: com.glority.android.compose.ui.SearchKt$ExpandedSearchBarPreview$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.glority.android.compose.ui.SearchKt$ExpandedSearchBarPreview$2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.glority.android.compose.ui.SearchKt$ExpandedSearchBarPreview$3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, startRestartGroup, 224694, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.compose.ui.SearchKt$ExpandedSearchBarPreview$4
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    SearchKt.ExpandedSearchBarPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void GlSearchBar(final androidx.compose.ui.Modifier r25, final java.lang.String r26, final java.lang.String r27, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r28, final kotlin.jvm.functions.Function0<kotlin.Unit> r29, kotlin.jvm.functions.Function0<kotlin.Unit> r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 1151
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.compose.ui.SearchKt.GlSearchBar(androidx.compose.ui.Modifier, java.lang.String, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final TextFieldValue GlSearchBar$lambda$2(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }
}

package com.glority.android.compose.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.picturexx.ui.components.state.VisibleSate;
import com.google.android.material.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: Dialog.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001am\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"GlDialog", "", "visibleSate", "Lcom/glority/android/picturexx/ui/components/state/VisibleSate;", "onDismissRequest", "Lkotlin/Function0;", "onConfirmation", "dialogTitle", "", "dialogText", "confirmText", "dismissText", "icon", "", "properties", "Landroidx/compose/ui/window/DialogProperties;", "(Lcom/glority/android/picturexx/ui/components/state/VisibleSate;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Landroidx/compose/ui/window/DialogProperties;Landroidx/compose/runtime/Composer;II)V", "GlDialogPreview", "(Landroidx/compose/runtime/Composer;I)V", "lib-compose_release"}, k = 2, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class DialogKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void GlDialogPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-668360501);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-668360501, i, -1, "com.glority.android.compose.ui.GlDialogPreview (Dialog.kt:15)");
            }
            GlDialog(new VisibleSate(true), new Function0<Unit>() { // from class: com.glority.android.compose.ui.DialogKt$GlDialogPreview$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.glority.android.compose.ui.DialogKt$GlDialogPreview$2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, "dialogTitle", "dialogText", "confirmText", "dismissText", Integer.valueOf(R.drawable.material_cursor_drawable), null, startRestartGroup, 1797552, 256);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.compose.ui.DialogKt$GlDialogPreview$3
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
                    DialogKt.GlDialogPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void GlDialog(final com.glority.android.picturexx.ui.components.state.VisibleSate r35, final kotlin.jvm.functions.Function0<kotlin.Unit> r36, final kotlin.jvm.functions.Function0<kotlin.Unit> r37, final java.lang.String r38, final java.lang.String r39, final java.lang.String r40, final java.lang.String r41, java.lang.Integer r42, androidx.compose.ui.window.DialogProperties r43, androidx.compose.runtime.Composer r44, final int r45, final int r46) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.compose.ui.DialogKt.GlDialog(com.glority.android.picturexx.ui.components.state.VisibleSate, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, androidx.compose.ui.window.DialogProperties, androidx.compose.runtime.Composer, int, int):void");
    }
}

package com.glority.android.picturexx.splash.dialog;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.glority.base.utils.StatusBarUtils;
import com.google.android.exoplayer2.C;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: ManualRestoreConfirmDialog.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0003¢\u0006\u0002\u0010\u0007\u001a\r\u0010\b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"ManualRestoreConfirmView", "", "modifier", "Landroidx/compose/ui/Modifier;", "onConfirm", "Lkotlin/Function0;", "onCancel", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ManualRestoreConfirmView_Preview", "(Landroidx/compose/runtime/Composer;I)V", "splash_release"}, k = 2, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class ManualRestoreConfirmDialogKt {
    public static final /* synthetic */ void access$ManualRestoreConfirmView(Modifier modifier, Function0 function0, Function0 function02, Composer composer, int i) {
        ManualRestoreConfirmView(modifier, function0, function02, composer, i);
    }

    public static final void ManualRestoreConfirmView(final Modifier modifier, final Function0<Unit> function0, final Function0<Unit> function02, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(1632704985);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1632704985, i2, -1, "com.glority.android.picturexx.splash.dialog.ManualRestoreConfirmView (ManualRestoreConfirmDialog.kt:80)");
            }
            Modifier wrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), null, false, 3, null);
            RoundedCornerShape m1268RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1268RoundedCornerShape0680j_4(Dp.m6997constructorimpl(10));
            long m4552getWhite0d7_KjU = Color.INSTANCE.m4552getWhite0d7_KjU();
            startRestartGroup.startReplaceableGroup(1080514385);
            boolean changedInstance = startRestartGroup.changedInstance(function02);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = (Function0) new Function0<Unit>() { // from class: com.glority.android.picturexx.splash.dialog.ManualRestoreConfirmDialogKt$ManualRestoreConfirmView$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        function02.invoke();
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            composer2 = startRestartGroup;
            AndroidAlertDialog_androidKt.m2082AlertDialogOix01E0((Function0) rememberedValue, ComposableLambdaKt.composableLambda(startRestartGroup, -2004253039, true, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.dialog.ManualRestoreConfirmDialogKt$ManualRestoreConfirmView$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 11) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2004253039, i3, -1, "com.glority.android.picturexx.splash.dialog.ManualRestoreConfirmView.<anonymous> (ManualRestoreConfirmDialog.kt:97)");
                        }
                        composer3.startReplaceableGroup(1080514497);
                        boolean changedInstance2 = composer3.changedInstance(function0);
                        final Function0<Unit> function03 = function0;
                        Object rememberedValue2 = composer3.rememberedValue();
                        if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = (Function0) new Function0<Unit>() { // from class: com.glority.android.picturexx.splash.dialog.ManualRestoreConfirmDialogKt$ManualRestoreConfirmView$2$1$1
                                /* JADX INFO: Access modifiers changed from: package-private */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    function03.invoke();
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue2);
                        }
                        composer3.endReplaceableGroup();
                        ButtonKt.TextButton((Function0) rememberedValue2, null, false, null, null, null, null, null, null, ComposableSingletons$ManualRestoreConfirmDialogKt.INSTANCE.m7857getLambda1$splash_release(), composer3, C.ENCODING_PCM_32BIT, TypedValues.PositionType.TYPE_POSITION_TYPE);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), wrapContentHeight$default, ComposableLambdaKt.composableLambda(startRestartGroup, 566105935, true, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.dialog.ManualRestoreConfirmDialogKt$ManualRestoreConfirmView$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 11) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(566105935, i3, -1, "com.glority.android.picturexx.splash.dialog.ManualRestoreConfirmView.<anonymous> (ManualRestoreConfirmDialog.kt:106)");
                        }
                        composer3.startReplaceableGroup(1080514733);
                        boolean changedInstance2 = composer3.changedInstance(function02);
                        final Function0<Unit> function03 = function02;
                        Object rememberedValue2 = composer3.rememberedValue();
                        if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = (Function0) new Function0<Unit>() { // from class: com.glority.android.picturexx.splash.dialog.ManualRestoreConfirmDialogKt$ManualRestoreConfirmView$3$1$1
                                /* JADX INFO: Access modifiers changed from: package-private */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    function03.invoke();
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue2);
                        }
                        composer3.endReplaceableGroup();
                        ButtonKt.TextButton((Function0) rememberedValue2, null, false, null, null, null, null, null, null, ComposableSingletons$ManualRestoreConfirmDialogKt.INSTANCE.m7858getLambda2$splash_release(), composer3, C.ENCODING_PCM_32BIT, TypedValues.PositionType.TYPE_POSITION_TYPE);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), null, ComposableSingletons$ManualRestoreConfirmDialogKt.INSTANCE.m7859getLambda3$splash_release(), ComposableSingletons$ManualRestoreConfirmDialogKt.INSTANCE.m7860getLambda4$splash_release(), m1268RoundedCornerShape0680j_4, m4552getWhite0d7_KjU, 0L, 0L, 0L, 0.0f, null, composer2, 102435888, 0, 15888);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.dialog.ManualRestoreConfirmDialogKt$ManualRestoreConfirmView$4
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    ManualRestoreConfirmDialogKt.ManualRestoreConfirmView(Modifier.this, function0, function02, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void ManualRestoreConfirmView_Preview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1852945023);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1852945023, i, -1, "com.glority.android.picturexx.splash.dialog.ManualRestoreConfirmView_Preview (ManualRestoreConfirmDialog.kt:119)");
            }
            ManualRestoreConfirmView(Modifier.INSTANCE, new Function0<Unit>() { // from class: com.glority.android.picturexx.splash.dialog.ManualRestoreConfirmDialogKt$ManualRestoreConfirmView_Preview$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.glority.android.picturexx.splash.dialog.ManualRestoreConfirmDialogKt$ManualRestoreConfirmView_Preview$2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, startRestartGroup, 438);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.splash.dialog.ManualRestoreConfirmDialogKt$ManualRestoreConfirmView_Preview$3
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
                    ManualRestoreConfirmDialogKt.ManualRestoreConfirmView_Preview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

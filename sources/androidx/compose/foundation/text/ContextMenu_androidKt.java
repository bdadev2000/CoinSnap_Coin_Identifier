package androidx.compose.foundation.text;

import androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt;
import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.contextmenu.ContextMenuState_androidKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.SelectionManager_androidKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: ContextMenu.android.kt */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\bH\u0001¢\u0006\u0002\u0010\t\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\bH\u0001¢\u0006\u0002\u0010\f\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\r2\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\bH\u0001¢\u0006\u0002\u0010\u000e\u001a5\u0010\u000f\u001a\u00020\u0001*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00052\u000e\b\u0004\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0080\b¨\u0006\u0016"}, d2 = {"ContextMenuArea", "", "selectionState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "enabled", "", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "manager", "Landroidx/compose/foundation/text/selection/SelectionManager;", "(Landroidx/compose/foundation/text/selection/SelectionManager;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "TextItem", "Landroidx/compose/foundation/contextmenu/ContextMenuScope;", "state", "Landroidx/compose/foundation/contextmenu/ContextMenuState;", Constants.ScionAnalytics.PARAM_LABEL, "Landroidx/compose/foundation/text/TextContextMenuItems;", "operation", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ContextMenu_androidKt {
    public static final void ContextMenuArea(final TextFieldSelectionManager textFieldSelectionManager, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1985516685);
        ComposerKt.sourceInformation(startRestartGroup, "C(ContextMenuArea)P(1)36@1552L31,39@1688L17,37@1628L215:ContextMenu.android.kt#423gt5");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(textFieldSelectionManager) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1985516685, i2, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:35)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 181395603, "CC(remember):ContextMenu.android.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new ContextMenuState(null, 1, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final ContextMenuState contextMenuState = (ContextMenuState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 181399941, "CC(remember):ContextMenu.android.kt#9igjgp");
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (Function0) new Function0<Unit>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
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
                        ContextMenuState_androidKt.close(ContextMenuState.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ContextMenuArea_androidKt.ContextMenuArea(contextMenuState, (Function0) rememberedValue2, TextFieldSelectionManager_androidKt.contextMenuBuilder(textFieldSelectionManager, contextMenuState), null, textFieldSelectionManager.getEnabled(), function2, startRestartGroup, ((i2 << 12) & 458752) | 54, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    ContextMenu_androidKt.ContextMenuArea(TextFieldSelectionManager.this, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void ContextMenuArea(final TextFieldSelectionState textFieldSelectionState, final boolean z, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(2103477555);
        ComposerKt.sourceInformation(startRestartGroup, "C(ContextMenuArea)P(2,1)52@2019L31,55@2155L17,53@2095L214:ContextMenu.android.kt#423gt5");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(textFieldSelectionState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2103477555, i2, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:51)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 181410547, "CC(remember):ContextMenu.android.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new ContextMenuState(null, 1, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final ContextMenuState contextMenuState = (ContextMenuState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 181414885, "CC(remember):ContextMenu.android.kt#9igjgp");
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (Function0) new Function0<Unit>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$3$1
                    /* JADX INFO: Access modifiers changed from: package-private */
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
                        ContextMenuState_androidKt.close(ContextMenuState.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            int i3 = i2 << 9;
            ContextMenuArea_androidKt.ContextMenuArea(contextMenuState, (Function0) rememberedValue2, TextFieldSelectionState_androidKt.contextMenuBuilder(textFieldSelectionState, contextMenuState), null, z, function2, startRestartGroup, (57344 & i3) | 54 | (i3 & 458752), 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$4
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    ContextMenu_androidKt.ContextMenuArea(TextFieldSelectionState.this, z, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void ContextMenuArea(final SelectionManager selectionManager, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(605522716);
        ComposerKt.sourceInformation(startRestartGroup, "C(ContextMenuArea)P(1)67@2449L31,70@2585L17,68@2525L180:ContextMenu.android.kt#423gt5");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(selectionManager) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(605522716, i2, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:66)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 181424307, "CC(remember):ContextMenu.android.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new ContextMenuState(null, 1, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final ContextMenuState contextMenuState = (ContextMenuState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 181428645, "CC(remember):ContextMenu.android.kt#9igjgp");
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (Function0) new Function0<Unit>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$5$1
                    /* JADX INFO: Access modifiers changed from: package-private */
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
                        ContextMenuState_androidKt.close(ContextMenuState.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ContextMenuArea_androidKt.ContextMenuArea(contextMenuState, (Function0) rememberedValue2, SelectionManager_androidKt.contextMenuBuilder(selectionManager, contextMenuState), null, false, function2, startRestartGroup, ((i2 << 12) & 458752) | 54, 24);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$6
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    ContextMenu_androidKt.ContextMenuArea(SelectionManager.this, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void TextItem(ContextMenuScope contextMenuScope, final ContextMenuState contextMenuState, TextContextMenuItems textContextMenuItems, boolean z, final Function0<Unit> function0) {
        ContextMenuScope.item$default(contextMenuScope, new ContextMenu_androidKt$TextItem$1(textContextMenuItems), null, z, null, new Function0<Unit>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$TextItem$2
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
                function0.invoke();
                ContextMenuState_androidKt.close(contextMenuState);
            }
        }, 10, null);
    }
}

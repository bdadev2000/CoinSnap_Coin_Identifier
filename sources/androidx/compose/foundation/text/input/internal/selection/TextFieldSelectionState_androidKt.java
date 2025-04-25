package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.contextmenu.ContextMenuState_androidKt;
import androidx.compose.foundation.text.ContextMenu_androidKt$TextItem$1;
import androidx.compose.foundation.text.TextContextMenuItems;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: TextFieldSelectionState.android.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a%\u0010\u0000\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¨\u0006\b"}, d2 = {"contextMenuBuilder", "Lkotlin/Function1;", "Landroidx/compose/foundation/contextmenu/ContextMenuScope;", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "state", "Landroidx/compose/foundation/contextmenu/ContextMenuState;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class TextFieldSelectionState_androidKt {
    public static final Function1<ContextMenuScope, Unit> contextMenuBuilder(final TextFieldSelectionState textFieldSelectionState, final ContextMenuState contextMenuState) {
        return new Function1<ContextMenuScope, Unit>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$contextMenuBuilder$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContextMenuScope contextMenuScope) {
                invoke2(contextMenuScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ContextMenuScope contextMenuScope) {
                final ContextMenuState contextMenuState2 = ContextMenuState.this;
                TextContextMenuItems textContextMenuItems = TextContextMenuItems.Cut;
                boolean canCut = textFieldSelectionState.canCut();
                final TextFieldSelectionState textFieldSelectionState2 = textFieldSelectionState;
                ContextMenuScope.item$default(contextMenuScope, new ContextMenu_androidKt$TextItem$1(textContextMenuItems), null, canCut, null, new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$1
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
                        textFieldSelectionState2.cut();
                        ContextMenuState_androidKt.close(ContextMenuState.this);
                    }
                }, 10, null);
                final ContextMenuState contextMenuState3 = ContextMenuState.this;
                TextContextMenuItems textContextMenuItems2 = TextContextMenuItems.Copy;
                boolean canCopy = textFieldSelectionState.canCopy();
                final TextFieldSelectionState textFieldSelectionState3 = textFieldSelectionState;
                ContextMenuScope.item$default(contextMenuScope, new ContextMenu_androidKt$TextItem$1(textContextMenuItems2), null, canCopy, null, new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$2
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
                        textFieldSelectionState3.copy(false);
                        ContextMenuState_androidKt.close(ContextMenuState.this);
                    }
                }, 10, null);
                final ContextMenuState contextMenuState4 = ContextMenuState.this;
                TextContextMenuItems textContextMenuItems3 = TextContextMenuItems.Paste;
                boolean canPaste = textFieldSelectionState.canPaste();
                final TextFieldSelectionState textFieldSelectionState4 = textFieldSelectionState;
                ContextMenuScope.item$default(contextMenuScope, new ContextMenu_androidKt$TextItem$1(textContextMenuItems3), null, canPaste, null, new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$3
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
                        textFieldSelectionState4.paste();
                        ContextMenuState_androidKt.close(ContextMenuState.this);
                    }
                }, 10, null);
                final ContextMenuState contextMenuState5 = ContextMenuState.this;
                TextContextMenuItems textContextMenuItems4 = TextContextMenuItems.SelectAll;
                boolean canSelectAll = textFieldSelectionState.canSelectAll();
                final TextFieldSelectionState textFieldSelectionState5 = textFieldSelectionState;
                ContextMenuScope.item$default(contextMenuScope, new ContextMenu_androidKt$TextItem$1(textContextMenuItems4), null, canSelectAll, null, new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$4
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
                        textFieldSelectionState5.selectAll();
                        ContextMenuState_androidKt.close(ContextMenuState.this);
                    }
                }, 10, null);
            }
        };
    }
}

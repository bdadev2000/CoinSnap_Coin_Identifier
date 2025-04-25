package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: BasicTextField.kt */
@Metadata(d1 = {"\u0000Ê\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aÛ\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u001728\b\u0002\u0010\u0018\u001a2\u0012\u0004\u0012\u00020\u001a\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0019¢\u0006\u0002\b 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010(\u001a\u00020)H\u0007¢\u0006\u0002\u0010*\u001añ\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u001728\b\u0002\u0010\u0018\u001a2\u0012\u0004\u0012\u00020\u001a\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0019¢\u0006\u0002\b 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020$2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010-\u001a\u00020\fH\u0001¢\u0006\u0002\u0010.\u001aâ\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010/\u001a\u0002002\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0006022\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u00020\f2\b\b\u0002\u00106\u001a\u0002072\b\b\u0002\u00108\u001a\u0002092\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0006022\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$23\b\u0002\u0010:\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00060\u001b¢\u0006\u0002\b;¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(<\u0012\u0004\u0012\u00020\u000602¢\u0006\u0002\b;H\u0007¢\u0006\u0002\u0010=\u001aî\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010/\u001a\u0002002\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0006022\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u00020\f2\b\b\u0002\u00106\u001a\u0002072\b\b\u0002\u0010>\u001a\u0002072\b\b\u0002\u00108\u001a\u0002092\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0006022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020$23\b\u0002\u0010:\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00060\u001b¢\u0006\u0002\b;¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(<\u0012\u0004\u0012\u00020\u000602¢\u0006\u0002\b;H\u0007¢\u0006\u0002\u0010?\u001aâ\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010/\u001a\u00020@2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u0006022\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u00020\f2\b\b\u0002\u00106\u001a\u0002072\b\b\u0002\u00108\u001a\u0002092\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0006022\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$23\b\u0002\u0010:\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00060\u001b¢\u0006\u0002\b;¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(<\u0012\u0004\u0012\u00020\u000602¢\u0006\u0002\b;H\u0007¢\u0006\u0002\u0010A\u001aî\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010/\u001a\u00020@2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u0006022\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u00020\f2\b\b\u0002\u00106\u001a\u0002072\b\b\u0002\u0010>\u001a\u0002072\b\b\u0002\u00108\u001a\u0002092\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0006022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020$23\b\u0002\u0010:\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00060\u001b¢\u0006\u0002\b;¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(<\u0012\u0004\u0012\u00020\u000602¢\u0006\u0002\b;H\u0007¢\u0006\u0002\u0010B\u001a\u0015\u0010C\u001a\u00020\u00062\u0006\u0010D\u001a\u00020EH\u0001¢\u0006\u0002\u0010F\u001a\u0015\u0010G\u001a\u00020\u00062\u0006\u0010D\u001a\u00020EH\u0001¢\u0006\u0002\u0010F\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004¨\u0006H²\u0006\n\u0010I\u001a\u00020JX\u008a\u0084\u0002²\u0006\n\u0010K\u001a\u00020JX\u008a\u0084\u0002²\u0006\n\u0010L\u001a\u00020JX\u008a\u0084\u0002²\u0006\n\u0010M\u001a\u000200X\u008a\u008e\u0002²\u0006\n\u0010N\u001a\u00020@X\u008a\u008e\u0002"}, d2 = {"DefaultTextFieldDecorator", "Landroidx/compose/foundation/text/input/TextFieldDecorator;", "MinTouchTargetSizeForHandles", "Landroidx/compose/ui/unit/DpSize;", "J", "BasicTextField", "", "state", "Landroidx/compose/foundation/text/input/TextFieldState;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "readOnly", "inputTransformation", "Landroidx/compose/foundation/text/input/InputTransformation;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "onKeyboardAction", "Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "lineLimits", "Landroidx/compose/foundation/text/input/TextFieldLineLimits;", "onTextLayout", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/Function0;", "Landroidx/compose/ui/text/TextLayoutResult;", "Lkotlin/ParameterName;", "name", "getResult", "Lkotlin/ExtensionFunctionType;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "cursorBrush", "Landroidx/compose/ui/graphics/Brush;", "outputTransformation", "Landroidx/compose/foundation/text/input/OutputTransformation;", "decorator", "scrollState", "Landroidx/compose/foundation/ScrollState;", "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Landroidx/compose/foundation/text/input/TextFieldLineLimits;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text/input/OutputTransformation;Landroidx/compose/foundation/text/input/TextFieldDecorator;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;III)V", "codepointTransformation", "Landroidx/compose/foundation/text/input/internal/CodepointTransformation;", "isPassword", "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Landroidx/compose/foundation/text/input/TextFieldLineLimits;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text/input/internal/CodepointTransformation;Landroidx/compose/foundation/text/input/OutputTransformation;Landroidx/compose/foundation/text/input/TextFieldDecorator;Landroidx/compose/foundation/ScrollState;ZLandroidx/compose/runtime/Composer;III)V", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "maxLines", "", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "decorationBox", "Landroidx/compose/runtime/Composable;", "innerTextField", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "minLines", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "TextFieldCursorHandle", "selectionState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/runtime/Composer;I)V", "TextFieldSelectionHandles", "foundation_release", "cursorHandleState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;", "startHandleState", "endHandleState", "textFieldValueState", "lastTextValue"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class BasicTextFieldKt {
    private static final TextFieldDecorator DefaultTextFieldDecorator = BasicTextFieldKt$DefaultTextFieldDecorator$1.INSTANCE;
    private static final long MinTouchTargetSizeForHandles;

    /* JADX WARN: Removed duplicated region for block: B:100:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0277  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void BasicTextField(final androidx.compose.foundation.text.input.TextFieldState r41, androidx.compose.ui.Modifier r42, boolean r43, boolean r44, androidx.compose.foundation.text.input.InputTransformation r45, androidx.compose.ui.text.TextStyle r46, androidx.compose.foundation.text.KeyboardOptions r47, androidx.compose.foundation.text.input.KeyboardActionHandler r48, androidx.compose.foundation.text.input.TextFieldLineLimits r49, kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Density, ? super kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> r50, androidx.compose.foundation.interaction.MutableInteractionSource r51, androidx.compose.ui.graphics.Brush r52, androidx.compose.foundation.text.input.OutputTransformation r53, androidx.compose.foundation.text.input.TextFieldDecorator r54, androidx.compose.foundation.ScrollState r55, androidx.compose.runtime.Composer r56, final int r57, final int r58, final int r59) {
        /*
            Method dump skipped, instructions count: 926
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(androidx.compose.foundation.text.input.TextFieldState, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.foundation.text.input.InputTransformation, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.input.KeyboardActionHandler, androidx.compose.foundation.text.input.TextFieldLineLimits, kotlin.jvm.functions.Function2, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, androidx.compose.foundation.text.input.OutputTransformation, androidx.compose.foundation.text.input.TextFieldDecorator, androidx.compose.foundation.ScrollState, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x06f8  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0484 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void BasicTextField(final androidx.compose.foundation.text.input.TextFieldState r50, androidx.compose.ui.Modifier r51, boolean r52, boolean r53, androidx.compose.foundation.text.input.InputTransformation r54, androidx.compose.ui.text.TextStyle r55, androidx.compose.foundation.text.KeyboardOptions r56, androidx.compose.foundation.text.input.KeyboardActionHandler r57, androidx.compose.foundation.text.input.TextFieldLineLimits r58, kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Density, ? super kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> r59, androidx.compose.foundation.interaction.MutableInteractionSource r60, androidx.compose.ui.graphics.Brush r61, androidx.compose.foundation.text.input.internal.CodepointTransformation r62, androidx.compose.foundation.text.input.OutputTransformation r63, androidx.compose.foundation.text.input.TextFieldDecorator r64, androidx.compose.foundation.ScrollState r65, boolean r66, androidx.compose.runtime.Composer r67, final int r68, final int r69, final int r70) {
        /*
            Method dump skipped, instructions count: 1849
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(androidx.compose.foundation.text.input.TextFieldState, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.foundation.text.input.InputTransformation, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.input.KeyboardActionHandler, androidx.compose.foundation.text.input.TextFieldLineLimits, kotlin.jvm.functions.Function2, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, androidx.compose.foundation.text.input.internal.CodepointTransformation, androidx.compose.foundation.text.input.OutputTransformation, androidx.compose.foundation.text.input.TextFieldDecorator, androidx.compose.foundation.ScrollState, boolean, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final void TextFieldCursorHandle(final TextFieldSelectionState textFieldSelectionState, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(1991581797);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextFieldCursorHandle)417@20797L128:BasicTextField.kt#423gt5");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(textFieldSelectionState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1991581797, i2, -1, "androidx.compose.foundation.text.TextFieldCursorHandle (BasicTextField.kt:414)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -425876476, "CC(remember):BasicTextField.kt#9igjgp");
            boolean changed = startRestartGroup.changed(textFieldSelectionState);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt.derivedStateOf(new Function0<TextFieldHandleState>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldCursorHandle$cursorHandleState$2$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final TextFieldHandleState invoke() {
                        return TextFieldSelectionState.this.getCursorHandleState$foundation_release(false);
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (TextFieldCursorHandle$lambda$9((State) rememberedValue).getVisible()) {
                startRestartGroup.startReplaceGroup(-317096444);
                ComposerKt.sourceInformation(startRestartGroup, "422@21014L142,428@21236L87,421@20971L426");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -425869518, "CC(remember):BasicTextField.kt#9igjgp");
                boolean changedInstance = startRestartGroup.changedInstance(textFieldSelectionState);
                OffsetProvider rememberedValue2 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new OffsetProvider() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldCursorHandle$1$1
                        @Override // androidx.compose.foundation.text.selection.OffsetProvider
                        /* renamed from: provide-F1C5BW0, reason: not valid java name */
                        public final long mo1275provideF1C5BW0() {
                            return TextFieldSelectionState.this.getCursorHandleState$foundation_release(true).m1548getPositionF1C5BW0();
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                OffsetProvider offsetProvider = (OffsetProvider) rememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Modifier.Companion companion = Modifier.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -425862469, "CC(remember):BasicTextField.kt#9igjgp");
                boolean changedInstance2 = startRestartGroup.changedInstance(textFieldSelectionState);
                BasicTextFieldKt$TextFieldCursorHandle$2$1 rememberedValue3 = startRestartGroup.rememberedValue();
                if (changedInstance2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new BasicTextFieldKt$TextFieldCursorHandle$2$1(textFieldSelectionState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                AndroidCursorHandle_androidKt.m1271CursorHandleUSBMPiE(offsetProvider, SuspendingPointerInputFilterKt.pointerInput(companion, textFieldSelectionState, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3), MinTouchTargetSizeForHandles, startRestartGroup, 384, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-316671682);
                startRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldCursorHandle$3
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

                public final void invoke(Composer composer2, int i3) {
                    BasicTextFieldKt.TextFieldCursorHandle(TextFieldSelectionState.this, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void TextFieldSelectionHandles(final TextFieldSelectionState textFieldSelectionState, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(2025287684);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextFieldSelectionHandles)441@21601L149,464@22479L150:BasicTextField.kt#423gt5");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(textFieldSelectionState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2025287684, i2, -1, "androidx.compose.foundation.text.TextFieldSelectionHandles (BasicTextField.kt:439)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1983345574, "CC(remember):BasicTextField.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt.derivedStateOf(new Function0<TextFieldHandleState>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$startHandleState$2$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final TextFieldHandleState invoke() {
                        return TextFieldSelectionState.this.getSelectionHandleState$foundation_release(true, false);
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            State state = (State) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (TextFieldSelectionHandles$lambda$13(state).getVisible()) {
                startRestartGroup.startReplaceGroup(-1353974139);
                ComposerKt.sourceInformation(startRestartGroup, "448@21841L167,456@22219L86,447@21795L584");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1983337876, "CC(remember):BasicTextField.kt#9igjgp");
                boolean changedInstance = startRestartGroup.changedInstance(textFieldSelectionState);
                OffsetProvider rememberedValue2 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new OffsetProvider() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$1$1
                        @Override // androidx.compose.foundation.text.selection.OffsetProvider
                        /* renamed from: provide-F1C5BW0 */
                        public final long mo1275provideF1C5BW0() {
                            return TextFieldSelectionState.this.getSelectionHandleState$foundation_release(true, true).m1548getPositionF1C5BW0();
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                OffsetProvider offsetProvider = (OffsetProvider) rememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ResolvedTextDirection direction = TextFieldSelectionHandles$lambda$13(state).getDirection();
                boolean handlesCrossed = TextFieldSelectionHandles$lambda$13(state).getHandlesCrossed();
                Modifier.Companion companion = Modifier.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1983325861, "CC(remember):BasicTextField.kt#9igjgp");
                boolean changedInstance2 = startRestartGroup.changedInstance(textFieldSelectionState);
                BasicTextFieldKt$TextFieldSelectionHandles$2$1 rememberedValue3 = startRestartGroup.rememberedValue();
                if (changedInstance2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new BasicTextFieldKt$TextFieldSelectionHandles$2$1(textFieldSelectionState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                AndroidSelectionHandles_androidKt.m1627SelectionHandlepzduO1o(offsetProvider, true, direction, handlesCrossed, MinTouchTargetSizeForHandles, SuspendingPointerInputFilterKt.pointerInput(companion, textFieldSelectionState, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3), startRestartGroup, 24624, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1353397539);
                startRestartGroup.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1983317477, "CC(remember):BasicTextField.kt#9igjgp");
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0<TextFieldHandleState>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$endHandleState$2$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final TextFieldHandleState invoke() {
                        return TextFieldSelectionState.this.getSelectionHandleState$foundation_release(false, false);
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            State state2 = (State) rememberedValue4;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (TextFieldSelectionHandles$lambda$17(state2).getVisible()) {
                startRestartGroup.startReplaceGroup(-1353104186);
                ComposerKt.sourceInformation(startRestartGroup, "471@22718L168,479@23094L87,470@22672L583");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1983309811, "CC(remember):BasicTextField.kt#9igjgp");
                boolean changedInstance3 = startRestartGroup.changedInstance(textFieldSelectionState);
                OffsetProvider rememberedValue5 = startRestartGroup.rememberedValue();
                if (changedInstance3 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new OffsetProvider() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$3$1
                        @Override // androidx.compose.foundation.text.selection.OffsetProvider
                        /* renamed from: provide-F1C5BW0 */
                        public final long mo1275provideF1C5BW0() {
                            return TextFieldSelectionState.this.getSelectionHandleState$foundation_release(false, true).m1548getPositionF1C5BW0();
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                OffsetProvider offsetProvider2 = (OffsetProvider) rememberedValue5;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ResolvedTextDirection direction2 = TextFieldSelectionHandles$lambda$17(state2).getDirection();
                boolean handlesCrossed2 = TextFieldSelectionHandles$lambda$17(state2).getHandlesCrossed();
                Modifier.Companion companion2 = Modifier.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1983297860, "CC(remember):BasicTextField.kt#9igjgp");
                boolean changedInstance4 = startRestartGroup.changedInstance(textFieldSelectionState);
                BasicTextFieldKt$TextFieldSelectionHandles$4$1 rememberedValue6 = startRestartGroup.rememberedValue();
                if (changedInstance4 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = new BasicTextFieldKt$TextFieldSelectionHandles$4$1(textFieldSelectionState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                AndroidSelectionHandles_androidKt.m1627SelectionHandlepzduO1o(offsetProvider2, false, direction2, handlesCrossed2, MinTouchTargetSizeForHandles, SuspendingPointerInputFilterKt.pointerInput(companion2, textFieldSelectionState, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue6), startRestartGroup, 24624, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1352528547);
                startRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$5
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

                public final void invoke(Composer composer2, int i3) {
                    BasicTextFieldKt.TextFieldSelectionHandles(TextFieldSelectionState.this, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    static {
        float f = 40;
        MinTouchTargetSizeForHandles = DpKt.m7019DpSizeYgX7TsA(Dp.m6997constructorimpl(f), Dp.m6997constructorimpl(f));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void BasicTextField(final java.lang.String r40, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r41, androidx.compose.ui.Modifier r42, boolean r43, boolean r44, androidx.compose.ui.text.TextStyle r45, androidx.compose.foundation.text.KeyboardOptions r46, androidx.compose.foundation.text.KeyboardActions r47, boolean r48, int r49, int r50, androidx.compose.ui.text.input.VisualTransformation r51, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> r52, androidx.compose.foundation.interaction.MutableInteractionSource r53, androidx.compose.ui.graphics.Brush r54, kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r55, androidx.compose.runtime.Composer r56, final int r57, final int r58, final int r59) {
        /*
            Method dump skipped, instructions count: 1233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function1, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue BasicTextField$lambda$21(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String BasicTextField$lambda$25(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0365  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void BasicTextField(final androidx.compose.ui.text.input.TextFieldValue r36, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> r37, androidx.compose.ui.Modifier r38, boolean r39, boolean r40, androidx.compose.ui.text.TextStyle r41, androidx.compose.foundation.text.KeyboardOptions r42, androidx.compose.foundation.text.KeyboardActions r43, boolean r44, int r45, int r46, androidx.compose.ui.text.input.VisualTransformation r47, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> r48, androidx.compose.foundation.interaction.MutableInteractionSource r49, androidx.compose.ui.graphics.Brush r50, kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r51, androidx.compose.runtime.Composer r52, final int r53, final int r54, final int r55) {
        /*
            Method dump skipped, instructions count: 1056
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function1, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02b3  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void BasicTextField(final java.lang.String r40, final kotlin.jvm.functions.Function1 r41, androidx.compose.ui.Modifier r42, boolean r43, boolean r44, androidx.compose.ui.text.TextStyle r45, androidx.compose.foundation.text.KeyboardOptions r46, androidx.compose.foundation.text.KeyboardActions r47, boolean r48, int r49, androidx.compose.ui.text.input.VisualTransformation r50, kotlin.jvm.functions.Function1 r51, androidx.compose.foundation.interaction.MutableInteractionSource r52, androidx.compose.ui.graphics.Brush r53, kotlin.jvm.functions.Function3 r54, androidx.compose.runtime.Composer r55, final int r56, final int r57, final int r58) {
        /*
            Method dump skipped, instructions count: 859
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function1, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02b3  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void BasicTextField(final androidx.compose.ui.text.input.TextFieldValue r40, final kotlin.jvm.functions.Function1 r41, androidx.compose.ui.Modifier r42, boolean r43, boolean r44, androidx.compose.ui.text.TextStyle r45, androidx.compose.foundation.text.KeyboardOptions r46, androidx.compose.foundation.text.KeyboardActions r47, boolean r48, int r49, androidx.compose.ui.text.input.VisualTransformation r50, kotlin.jvm.functions.Function1 r51, androidx.compose.foundation.interaction.MutableInteractionSource r52, androidx.compose.ui.graphics.Brush r53, kotlin.jvm.functions.Function3 r54, androidx.compose.runtime.Composer r55, final int r56, final int r57, final int r58) {
        /*
            Method dump skipped, instructions count: 859
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function1, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    private static final TextFieldHandleState TextFieldCursorHandle$lambda$9(State<TextFieldHandleState> state) {
        return state.getValue();
    }

    private static final TextFieldHandleState TextFieldSelectionHandles$lambda$13(State<TextFieldHandleState> state) {
        return state.getValue();
    }

    private static final TextFieldHandleState TextFieldSelectionHandles$lambda$17(State<TextFieldHandleState> state) {
        return state.getValue();
    }
}

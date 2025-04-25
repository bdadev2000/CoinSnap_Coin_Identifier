package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.foundation.text.selection.SelectionHandleAnchor;
import androidx.compose.foundation.text.selection.SelectionHandleInfo;
import androidx.compose.foundation.text.selection.SelectionHandlesKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.base.utils.StatusBarUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CoreTextField.kt */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aî\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00132\b\b\u0002\u0010\u001c\u001a\u00020\u001323\b\u0002\u0010\u001d\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00010\u001e¢\u0006\u0002\b\u001f¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u001fH\u0001¢\u0006\u0002\u0010#\u001a0\u0010$\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010%\u001a\u00020&2\u0011\u0010'\u001a\r\u0012\u0004\u0012\u00020\u00010\u001e¢\u0006\u0002\b\u001fH\u0003¢\u0006\u0002\u0010(\u001a\u001d\u0010)\u001a\u00020\u00012\u0006\u0010%\u001a\u00020&2\u0006\u0010*\u001a\u00020\u0013H\u0003¢\u0006\u0002\u0010+\u001a\u0015\u0010,\u001a\u00020\u00012\u0006\u0010%\u001a\u00020&H\u0001¢\u0006\u0002\u0010-\u001a\u0010\u0010.\u001a\u00020\u00012\u0006\u0010/\u001a\u000200H\u0002\u001a \u00101\u001a\u00020\u00012\u0006\u0010/\u001a\u0002002\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u00102\u001a\u000203H\u0002\u001a0\u00104\u001a\u00020\u00012\u0006\u00105\u001a\u0002062\u0006\u0010/\u001a\u0002002\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u00102\u001a\u000203H\u0002\u001a \u00107\u001a\u00020\u00012\u0006\u0010/\u001a\u0002002\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u0013H\u0002\u001a2\u0010;\u001a\u00020\u0001*\u00020<2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020\r2\u0006\u00102\u001a\u000203H\u0080@¢\u0006\u0002\u0010@\u001a\u001c\u0010A\u001a\u00020\u0007*\u00020\u00072\u0006\u0010/\u001a\u0002002\u0006\u0010%\u001a\u00020&H\u0002¨\u0006B²\u0006\n\u0010C\u001a\u00020\u0013X\u008a\u0084\u0002"}, d2 = {"CoreTextField", "", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "onTextLayout", "Landroidx/compose/ui/text/TextLayoutResult;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "cursorBrush", "Landroidx/compose/ui/graphics/Brush;", "softWrap", "", "maxLines", "", "minLines", "imeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "enabled", "readOnly", "decorationBox", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ParameterName;", "name", "innerTextField", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;ZIILandroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/foundation/text/KeyboardActions;ZZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "CoreTextFieldRootBox", "manager", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "content", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "SelectionToolbarAndHandles", "show", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;ZLandroidx/compose/runtime/Composer;I)V", "TextFieldCursorHandle", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/runtime/Composer;I)V", "endInputSession", "state", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "notifyFocusedRect", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "startInputSession", "textInputService", "Landroidx/compose/ui/text/input/TextInputService;", "tapToFocus", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "allowKeyboard", "bringSelectionEndIntoView", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "textDelegate", "Landroidx/compose/foundation/text/TextDelegate;", "textLayoutResult", "(Landroidx/compose/foundation/relocation/BringIntoViewRequester;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/text/input/OffsetMapping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "previewKeyEventToDeselectOnBack", "foundation_release", "writeable"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class CoreTextFieldKt {
    /* JADX WARN: Code restructure failed: missing block: B:312:0x04ac, code lost:
    
        if (r7 == null) goto L272;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0701 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0733  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x074d  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x078c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x07b8  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x07c4  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x07d8  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0830  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x083f  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0875  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x088a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0899  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x08e2  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x08ed  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x08fa  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0911  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0925  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x095a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0991  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x09c3  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x09cb  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x09df  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0a15  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0a4c  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0a67  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0ac0  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0ad9  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0b4f  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0ae2  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0a18  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x09c5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x08fc  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x08ef  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x08e4  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x088c  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0877  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0832  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0b74  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0408 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void CoreTextField(final androidx.compose.ui.text.input.TextFieldValue r53, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> r54, androidx.compose.ui.Modifier r55, androidx.compose.ui.text.TextStyle r56, androidx.compose.ui.text.input.VisualTransformation r57, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> r58, androidx.compose.foundation.interaction.MutableInteractionSource r59, androidx.compose.ui.graphics.Brush r60, boolean r61, int r62, int r63, androidx.compose.ui.text.input.ImeOptions r64, androidx.compose.foundation.text.KeyboardActions r65, boolean r66, boolean r67, kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r68, androidx.compose.runtime.Composer r69, final int r70, final int r71, final int r72) {
        /*
            Method dump skipped, instructions count: 2961
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function1, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, boolean, int, int, androidx.compose.ui.text.input.ImeOptions, androidx.compose.foundation.text.KeyboardActions, boolean, boolean, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CoreTextFieldRootBox(final Modifier modifier, final TextFieldSelectionManager textFieldSelectionManager, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-20551815);
        ComposerKt.sourceInformation(startRestartGroup, "C(CoreTextFieldRootBox)P(2,1)802@36846L95:CoreTextField.kt#423gt5");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(textFieldSelectionManager) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-20551815, i2, -1, "androidx.compose.foundation.text.CoreTextFieldRootBox (CoreTextField.kt:801)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m4008constructorimpl = Updater.m4008constructorimpl(startRestartGroup);
            Updater.m4015setimpl(m4008constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4015setimpl(m4008constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1183915871, "C803@36902L33:CoreTextField.kt#423gt5");
            int i3 = i2 >> 3;
            ContextMenu_androidKt.ContextMenuArea(textFieldSelectionManager, function2, startRestartGroup, (i3 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) | (i3 & 14));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextFieldRootBox$2
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
                    CoreTextFieldKt.CoreTextFieldRootBox(Modifier.this, textFieldSelectionManager, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    private static final Modifier previewKeyEventToDeselectOnBack(Modifier modifier, final LegacyTextFieldState legacyTextFieldState, final TextFieldSelectionManager textFieldSelectionManager) {
        return KeyInputModifierKt.onPreviewKeyEvent(modifier, new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$previewKeyEventToDeselectOnBack$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                return m1298invokeZmokQxo(keyEvent.m5569unboximpl());
            }

            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m1298invokeZmokQxo(android.view.KeyEvent keyEvent) {
                boolean z;
                if (LegacyTextFieldState.this.getHandleState() == HandleState.Selection && KeyEventHelpers_androidKt.m1300cancelsTextSelectionZmokQxo(keyEvent)) {
                    z = true;
                    TextFieldSelectionManager.m1699deselect_kEHs6E$foundation_release$default(textFieldSelectionManager, null, 1, null);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tapToFocus(LegacyTextFieldState legacyTextFieldState, FocusRequester focusRequester, boolean z) {
        SoftwareKeyboardController keyboardController;
        if (!legacyTextFieldState.getHasFocus()) {
            focusRequester.requestFocus();
        } else {
            if (!z || (keyboardController = legacyTextFieldState.getKeyboardController()) == null) {
                return;
            }
            keyboardController.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startInputSession(TextInputService textInputService, LegacyTextFieldState legacyTextFieldState, TextFieldValue textFieldValue, ImeOptions imeOptions, OffsetMapping offsetMapping) {
        legacyTextFieldState.setInputSession(TextFieldDelegate.INSTANCE.onFocus$foundation_release(textInputService, textFieldValue, legacyTextFieldState.getProcessor(), imeOptions, legacyTextFieldState.getOnValueChange(), legacyTextFieldState.getOnImeActionPerformed()));
        notifyFocusedRect(legacyTextFieldState, textFieldValue, offsetMapping);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void endInputSession(LegacyTextFieldState legacyTextFieldState) {
        TextInputSession inputSession = legacyTextFieldState.getInputSession();
        if (inputSession != null) {
            TextFieldDelegate.INSTANCE.onBlur$foundation_release(inputSession, legacyTextFieldState.getProcessor(), legacyTextFieldState.getOnValueChange());
        }
        legacyTextFieldState.setInputSession(null);
    }

    public static final Object bringSelectionEndIntoView(BringIntoViewRequester bringIntoViewRequester, TextFieldValue textFieldValue, TextDelegate textDelegate, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, Continuation<? super Unit> continuation) {
        Rect rect;
        int originalToTransformed = offsetMapping.originalToTransformed(TextRange.m6457getMaximpl(textFieldValue.getSelection()));
        if (originalToTransformed < textLayoutResult.getLayoutInput().getText().length()) {
            rect = textLayoutResult.getBoundingBox(originalToTransformed);
        } else if (originalToTransformed != 0) {
            rect = textLayoutResult.getBoundingBox(originalToTransformed - 1);
        } else {
            rect = new Rect(0.0f, 0.0f, 1.0f, IntSize.m7166getHeightimpl(TextFieldDelegateKt.computeSizeForDefaultText$default(textDelegate.getStyle(), textDelegate.getDensity(), textDelegate.getFontFamilyResolver(), null, 0, 24, null)));
        }
        Object bringIntoView = bringIntoViewRequester.bringIntoView(rect, continuation);
        return bringIntoView == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? bringIntoView : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SelectionToolbarAndHandles(final TextFieldSelectionManager textFieldSelectionManager, final boolean z, Composer composer, final int i) {
        int i2;
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        Composer startRestartGroup = composer.startRestartGroup(626339208);
        ComposerKt.sourceInformation(startRestartGroup, "C(SelectionToolbarAndHandles):CoreTextField.kt#423gt5");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(textFieldSelectionManager) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(626339208, i2, -1, "androidx.compose.foundation.text.SelectionToolbarAndHandles (CoreTextField.kt:1146)");
            }
            if (z) {
                startRestartGroup.startReplaceGroup(-1286242594);
                ComposerKt.sourceInformation(startRestartGroup, "");
                LegacyTextFieldState state = textFieldSelectionManager.getState();
                TextLayoutResult textLayoutResult = null;
                if (state != null && (layoutResult = state.getLayoutResult()) != null && (value = layoutResult.getValue()) != null) {
                    if (!(textFieldSelectionManager.getState() != null ? r5.getIsLayoutResultStale() : true)) {
                        textLayoutResult = value;
                    }
                }
                if (textLayoutResult == null) {
                    startRestartGroup.startReplaceGroup(-1285984396);
                } else {
                    startRestartGroup.startReplaceGroup(-1285984395);
                    ComposerKt.sourceInformation(startRestartGroup, "");
                    if (!TextRange.m6454getCollapsedimpl(textFieldSelectionManager.getValue$foundation_release().getSelection())) {
                        startRestartGroup.startReplaceGroup(-1680616096);
                        ComposerKt.sourceInformation(startRestartGroup, "");
                        int originalToTransformed = textFieldSelectionManager.getOffsetMapping().originalToTransformed(TextRange.m6460getStartimpl(textFieldSelectionManager.getValue$foundation_release().getSelection()));
                        int originalToTransformed2 = textFieldSelectionManager.getOffsetMapping().originalToTransformed(TextRange.m6455getEndimpl(textFieldSelectionManager.getValue$foundation_release().getSelection()));
                        ResolvedTextDirection bidiRunDirection = textLayoutResult.getBidiRunDirection(originalToTransformed);
                        ResolvedTextDirection bidiRunDirection2 = textLayoutResult.getBidiRunDirection(Math.max(originalToTransformed2 - 1, 0));
                        LegacyTextFieldState state2 = textFieldSelectionManager.getState();
                        if (state2 != null && state2.getShowSelectionHandleStart()) {
                            startRestartGroup.startReplaceGroup(-1680216289);
                            ComposerKt.sourceInformation(startRestartGroup, "1158@51449L203");
                            TextFieldSelectionManagerKt.TextFieldSelectionHandle(true, bidiRunDirection, textFieldSelectionManager, startRestartGroup, ((i2 << 6) & 896) | 6);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(-1679975078);
                            startRestartGroup.endReplaceGroup();
                        }
                        LegacyTextFieldState state3 = textFieldSelectionManager.getState();
                        if (state3 != null && state3.getShowSelectionHandleEnd()) {
                            startRestartGroup.startReplaceGroup(-1679895904);
                            ComposerKt.sourceInformation(startRestartGroup, "1165@51772L202");
                            TextFieldSelectionManagerKt.TextFieldSelectionHandle(false, bidiRunDirection2, textFieldSelectionManager, startRestartGroup, ((i2 << 6) & 896) | 6);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(-1679655654);
                            startRestartGroup.endReplaceGroup();
                        }
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-1679637798);
                        startRestartGroup.endReplaceGroup();
                    }
                    LegacyTextFieldState state4 = textFieldSelectionManager.getState();
                    if (state4 != null) {
                        if (textFieldSelectionManager.isTextChanged$foundation_release()) {
                            state4.setShowFloatingToolbar(false);
                        }
                        if (state4.getHasFocus()) {
                            if (state4.getShowFloatingToolbar()) {
                                textFieldSelectionManager.showSelectionToolbar$foundation_release();
                            } else {
                                textFieldSelectionManager.hideSelectionToolbar$foundation_release();
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                }
                startRestartGroup.endReplaceGroup();
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(651305535);
                startRestartGroup.endReplaceGroup();
                textFieldSelectionManager.hideSelectionToolbar$foundation_release();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$SelectionToolbarAndHandles$2
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
                    CoreTextFieldKt.SelectionToolbarAndHandles(TextFieldSelectionManager.this, z, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void TextFieldCursorHandle(final TextFieldSelectionManager textFieldSelectionManager, Composer composer, final int i) {
        int i2;
        AnnotatedString transformedText$foundation_release;
        Composer startRestartGroup = composer.startRestartGroup(-1436003720);
        ComposerKt.sourceInformation(startRestartGroup, "C(TextFieldCursorHandle):CoreTextField.kt#423gt5");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(textFieldSelectionManager) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1436003720, i2, -1, "androidx.compose.foundation.text.TextFieldCursorHandle (CoreTextField.kt:1189)");
            }
            LegacyTextFieldState state = textFieldSelectionManager.getState();
            if (state != null && state.getShowCursorHandle() && (transformedText$foundation_release = textFieldSelectionManager.getTransformedText$foundation_release()) != null && transformedText$foundation_release.length() > 0) {
                startRestartGroup.startReplaceGroup(-285446808);
                ComposerKt.sourceInformation(startRestartGroup, "1191@52866L50,1192@52979L7,1194@53039L12,1196@53125L601,1208@53754L309,1193@52996L1077");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -424850346, "CC(remember):CoreTextField.kt#9igjgp");
                boolean changed = startRestartGroup.changed(textFieldSelectionManager);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = textFieldSelectionManager.cursorDragObserver$foundation_release();
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                TextDragObserver textDragObserver = (TextDragObserver) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume = startRestartGroup.consume(localDensity);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final long m1705getCursorPositiontuRUvjQ$foundation_release = textFieldSelectionManager.m1705getCursorPositiontuRUvjQ$foundation_release((Density) consume);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -424844848, "CC(remember):CoreTextField.kt#9igjgp");
                boolean changed2 = startRestartGroup.changed(m1705getCursorPositiontuRUvjQ$foundation_release);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = (OffsetProvider) new OffsetProvider() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1$1
                        @Override // androidx.compose.foundation.text.selection.OffsetProvider
                        /* renamed from: provide-F1C5BW0 */
                        public final long mo1275provideF1C5BW0() {
                            return m1705getCursorPositiontuRUvjQ$foundation_release;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                OffsetProvider offsetProvider = (OffsetProvider) rememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Modifier.Companion companion = Modifier.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -424841507, "CC(remember):CoreTextField.kt#9igjgp");
                boolean changedInstance = startRestartGroup.changedInstance(textDragObserver) | startRestartGroup.changedInstance(textFieldSelectionManager);
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = (Function2) new CoreTextFieldKt$TextFieldCursorHandle$2$1(textDragObserver, textFieldSelectionManager, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, textDragObserver, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -424821671, "CC(remember):CoreTextField.kt#9igjgp");
                boolean changed3 = startRestartGroup.changed(m1705getCursorPositiontuRUvjQ$foundation_release);
                Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (changed3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$3$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            semanticsPropertyReceiver.set(SelectionHandlesKt.getSelectionHandleInfoKey(), new SelectionHandleInfo(Handle.Cursor, m1705getCursorPositiontuRUvjQ$foundation_release, SelectionHandleAnchor.Middle, true, null));
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                AndroidCursorHandle_androidKt.m1271CursorHandleUSBMPiE(offsetProvider, SemanticsModifierKt.semantics$default(pointerInput, false, (Function1) rememberedValue4, 1, null), 0L, startRestartGroup, 0, 4);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-284257090);
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
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$4
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
                    CoreTextFieldKt.TextFieldCursorHandle(TextFieldSelectionManager.this, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyFocusedRect(LegacyTextFieldState legacyTextFieldState, TextFieldValue textFieldValue, OffsetMapping offsetMapping) {
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
            if (layoutResult == null) {
                return;
            }
            TextInputSession inputSession = legacyTextFieldState.getInputSession();
            if (inputSession == null) {
                return;
            }
            LayoutCoordinates layoutCoordinates = legacyTextFieldState.getLayoutCoordinates();
            if (layoutCoordinates == null) {
                return;
            }
            TextFieldDelegate.INSTANCE.notifyFocusedRect$foundation_release(textFieldValue, legacyTextFieldState.getTextDelegate(), layoutResult.getValue(), layoutCoordinates, inputSession, legacyTextFieldState.getHasFocus(), offsetMapping);
            Unit unit = Unit.INSTANCE;
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CoreTextField$lambda$11(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}

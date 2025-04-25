package androidx.compose.foundation.text.input.internal;

import android.os.CancellationSignal;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextHighlightType;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextGranularity;
import androidx.compose.ui.text.TextInclusionStrategy;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.DeleteSurroundingTextCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.SetSelectionCommand;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

/* compiled from: HandwritingGesture.android.kt */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0003J>\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0003ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00162\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0003J8\u0010\u0017\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0003ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0014\u0010\u001c\u001a\u00020\u0004*\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u0006H\u0003J&\u0010\u001e\u001a\u00020\n*\u00020\u001d2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020 H\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J0\u0010#\u001a\u00020\u0004*\u00020$2\u0006\u0010\u0005\u001a\u00020%2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0003J\u001c\u0010#\u001a\u00020\u0004*\u00020\u001d2\u0006\u0010\u0005\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0003J0\u0010(\u001a\u00020\u0004*\u00020$2\u0006\u0010\u0005\u001a\u00020)2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0003J\u001c\u0010(\u001a\u00020\u0004*\u00020\u001d2\u0006\u0010\u0005\u001a\u00020)2\u0006\u0010&\u001a\u00020'H\u0003J&\u0010*\u001a\u00020\n*\u00020\u001d2\u0006\u0010+\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0003ø\u0001\u0000¢\u0006\u0004\b,\u0010-JA\u0010.\u001a\u00020\u0004*\u00020$2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010/\u001a\u0004\u0018\u00010\u00192\b\u00100\u001a\u0004\u0018\u0001012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0001¢\u0006\u0002\b2J+\u0010.\u001a\u00020\u0004*\u00020\u001d2\u0006\u00103\u001a\u00020\u00062\u0006\u0010&\u001a\u00020'2\b\u00100\u001a\u0004\u0018\u000101H\u0001¢\u0006\u0002\b2J2\u00104\u001a\u00020\u0004*\u00020$2\u0006\u0010\u0005\u001a\u0002052\b\u00100\u001a\u0004\u0018\u0001012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0003J&\u00104\u001a\u00020\u0004*\u00020\u001d2\u0006\u0010\u0005\u001a\u0002052\u0006\u0010&\u001a\u00020'2\b\u00100\u001a\u0004\u0018\u000101H\u0003J:\u00106\u001a\u00020\u0004*\u00020$2\u0006\u0010\u0005\u001a\u0002072\u0006\u0010\u000e\u001a\u00020\u000f2\b\u00100\u001a\u0004\u0018\u0001012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0003J&\u00106\u001a\u00020\u0004*\u00020\u001d2\u0006\u0010\u0005\u001a\u0002072\u0006\u0010&\u001a\u00020'2\b\u00100\u001a\u0004\u0018\u000101H\u0003J:\u00108\u001a\u00020\u0004*\u00020$2\u0006\u0010\u0005\u001a\u0002092\u0006\u0010\u000e\u001a\u00020\u000f2\b\u00100\u001a\u0004\u0018\u0001012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0003J&\u00108\u001a\u00020\u0004*\u00020\u001d2\u0006\u0010\u0005\u001a\u0002092\u0006\u0010&\u001a\u00020'2\b\u00100\u001a\u0004\u0018\u000101H\u0003J2\u0010:\u001a\u00020\u0004*\u00020$2\u0006\u0010\u0005\u001a\u00020;2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0003J\u001c\u0010:\u001a\u00020\u0004*\u00020\u001d2\u0006\u0010\u0005\u001a\u00020;2\u0006\u0010&\u001a\u00020'H\u0003J2\u0010<\u001a\u00020\u0004*\u00020$2\u0006\u0010\u0005\u001a\u00020=2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0003J\u001c\u0010<\u001a\u00020\u0004*\u00020\u001d2\u0006\u0010\u0005\u001a\u00020=2\u0006\u0010&\u001a\u00020'H\u0003J\u001e\u0010>\u001a\u00020\n*\u00020$2\u0006\u0010\u0005\u001a\u00020%2\b\u0010/\u001a\u0004\u0018\u00010\u0019H\u0003J\u001c\u0010>\u001a\u00020\n*\u00020\u001d2\u0006\u0010\u0005\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0003J\u001e\u0010?\u001a\u00020\n*\u00020$2\u0006\u0010\u0005\u001a\u00020)2\b\u0010/\u001a\u0004\u0018\u00010\u0019H\u0003J\u001c\u0010?\u001a\u00020\n*\u00020\u001d2\u0006\u0010\u0005\u001a\u00020)2\u0006\u0010&\u001a\u00020'H\u0003J-\u0010@\u001a\u00020\u0011*\u00020$2\u0006\u0010\u0005\u001a\u00020A2\b\u0010/\u001a\u0004\u0018\u00010\u00192\b\u0010B\u001a\u0004\u0018\u00010CH\u0001¢\u0006\u0002\bDJ+\u0010@\u001a\u00020\u0011*\u00020\u001d2\u0006\u00103\u001a\u00020A2\u0006\u0010&\u001a\u00020'2\b\u0010B\u001a\u0004\u0018\u00010CH\u0001¢\u0006\u0002\bDJ\u001e\u0010E\u001a\u00020\n*\u00020$2\u0006\u0010\u0005\u001a\u00020;2\b\u0010/\u001a\u0004\u0018\u00010\u0019H\u0003J\u001c\u0010E\u001a\u00020\n*\u00020\u001d2\u0006\u0010\u0005\u001a\u00020;2\u0006\u0010&\u001a\u00020'H\u0003J\u001e\u0010F\u001a\u00020\n*\u00020$2\u0006\u0010\u0005\u001a\u00020=2\b\u0010/\u001a\u0004\u0018\u00010\u0019H\u0003J\u001c\u0010F\u001a\u00020\n*\u00020\u001d2\u0006\u0010\u0005\u001a\u00020=2\u0006\u0010&\u001a\u00020'H\u0003J\u0019\u0010G\u001a\u00020H*\u00020\u0004H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bI\u0010J\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006K"}, d2 = {"Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;", "", "()V", "fallbackOnLegacyTextField", "", "gesture", "Landroid/view/inputmethod/HandwritingGesture;", "editCommandConsumer", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/EditCommand;", "", "performDeletionOnLegacyTextField", "range", "Landroidx/compose/ui/text/TextRange;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "adjustRange", "", "performDeletionOnLegacyTextField-vJH6DeI", "(JLandroidx/compose/ui/text/AnnotatedString;ZLkotlin/jvm/functions/Function1;)V", "performInsertionOnLegacyTextField", TypedValues.CycleType.S_WAVE_OFFSET, "", "performSelectionOnLegacyTextField", "textSelectionManager", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "performSelectionOnLegacyTextField-8ffj60Q", "(JLandroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function1;)V", "fallback", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "highlightRange", "type", "Landroidx/compose/foundation/text/input/TextHighlightType;", "highlightRange-XJREzCE", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;JI)V", "performDeleteGesture", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "Landroid/view/inputmethod/DeleteGesture;", "layoutState", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "performDeleteRangeGesture", "Landroid/view/inputmethod/DeleteRangeGesture;", "performDeletion", "rangeInTransformedText", "performDeletion-Sb-Bc2M", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;JZ)V", "performHandwritingGesture", "textFieldSelectionManager", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "performHandwritingGesture$foundation_release", "handwritingGesture", "performInsertGesture", "Landroid/view/inputmethod/InsertGesture;", "performJoinOrSplitGesture", "Landroid/view/inputmethod/JoinOrSplitGesture;", "performRemoveSpaceGesture", "Landroid/view/inputmethod/RemoveSpaceGesture;", "performSelectGesture", "Landroid/view/inputmethod/SelectGesture;", "performSelectRangeGesture", "Landroid/view/inputmethod/SelectRangeGesture;", "previewDeleteGesture", "previewDeleteRangeGesture", "previewHandwritingGesture", "Landroid/view/inputmethod/PreviewableHandwritingGesture;", "cancellationSignal", "Landroid/os/CancellationSignal;", "previewHandwritingGesture$foundation_release", "previewSelectGesture", "previewSelectRangeGesture", "toTextGranularity", "Landroidx/compose/ui/text/TextGranularity;", "toTextGranularity-NUwxegE", "(I)I", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class HandwritingGestureApi34 {
    public static final int $stable = 0;
    public static final HandwritingGestureApi34 INSTANCE = new HandwritingGestureApi34();

    private HandwritingGestureApi34() {
    }

    public final int performHandwritingGesture$foundation_release(TransformedTextFieldState transformedTextFieldState, HandwritingGesture handwritingGesture, TextLayoutState textLayoutState, ViewConfiguration viewConfiguration) {
        if (handwritingGesture instanceof SelectGesture) {
            return performSelectGesture(transformedTextFieldState, (SelectGesture) handwritingGesture, textLayoutState);
        }
        if (handwritingGesture instanceof DeleteGesture) {
            return performDeleteGesture(transformedTextFieldState, (DeleteGesture) handwritingGesture, textLayoutState);
        }
        if (handwritingGesture instanceof SelectRangeGesture) {
            return performSelectRangeGesture(transformedTextFieldState, (SelectRangeGesture) handwritingGesture, textLayoutState);
        }
        if (handwritingGesture instanceof DeleteRangeGesture) {
            return performDeleteRangeGesture(transformedTextFieldState, (DeleteRangeGesture) handwritingGesture, textLayoutState);
        }
        if (handwritingGesture instanceof JoinOrSplitGesture) {
            return performJoinOrSplitGesture(transformedTextFieldState, (JoinOrSplitGesture) handwritingGesture, textLayoutState, viewConfiguration);
        }
        if (handwritingGesture instanceof InsertGesture) {
            return performInsertGesture(transformedTextFieldState, (InsertGesture) handwritingGesture, textLayoutState, viewConfiguration);
        }
        if (handwritingGesture instanceof RemoveSpaceGesture) {
            return performRemoveSpaceGesture(transformedTextFieldState, (RemoveSpaceGesture) handwritingGesture, textLayoutState, viewConfiguration);
        }
        return 2;
    }

    public final boolean previewHandwritingGesture$foundation_release(final TransformedTextFieldState transformedTextFieldState, PreviewableHandwritingGesture previewableHandwritingGesture, TextLayoutState textLayoutState, CancellationSignal cancellationSignal) {
        if (previewableHandwritingGesture instanceof SelectGesture) {
            previewSelectGesture(transformedTextFieldState, (SelectGesture) previewableHandwritingGesture, textLayoutState);
        } else if (previewableHandwritingGesture instanceof DeleteGesture) {
            previewDeleteGesture(transformedTextFieldState, (DeleteGesture) previewableHandwritingGesture, textLayoutState);
        } else if (previewableHandwritingGesture instanceof SelectRangeGesture) {
            previewSelectRangeGesture(transformedTextFieldState, (SelectRangeGesture) previewableHandwritingGesture, textLayoutState);
        } else {
            if (!(previewableHandwritingGesture instanceof DeleteRangeGesture)) {
                return false;
            }
            previewDeleteRangeGesture(transformedTextFieldState, (DeleteRangeGesture) previewableHandwritingGesture, textLayoutState);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.compose.foundation.text.input.internal.HandwritingGestureApi34$$ExternalSyntheticLambda1
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                HandwritingGestureApi34.previewHandwritingGesture$lambda$1(TransformedTextFieldState.this);
            }
        });
        return true;
    }

    private final int performSelectGesture(TransformedTextFieldState transformedTextFieldState, SelectGesture selectGesture, TextLayoutState textLayoutState) {
        long m1474getRangeForScreenRectOH9lIzo;
        m1474getRangeForScreenRectOH9lIzo = HandwritingGesture_androidKt.m1474getRangeForScreenRectOH9lIzo(textLayoutState, RectHelper_androidKt.toComposeRect(selectGesture.getSelectionArea()), m1456toTextGranularityNUwxegE(selectGesture.getGranularity()), TextInclusionStrategy.INSTANCE.getContainsCenter());
        if (TextRange.m6454getCollapsedimpl(m1474getRangeForScreenRectOH9lIzo)) {
            return INSTANCE.fallback(transformedTextFieldState, selectGesture);
        }
        transformedTextFieldState.m1537selectCharsIn5zctL8(m1474getRangeForScreenRectOH9lIzo);
        return 1;
    }

    private final void previewSelectGesture(TransformedTextFieldState transformedTextFieldState, SelectGesture selectGesture, TextLayoutState textLayoutState) {
        long m1474getRangeForScreenRectOH9lIzo;
        m1474getRangeForScreenRectOH9lIzo = HandwritingGesture_androidKt.m1474getRangeForScreenRectOH9lIzo(textLayoutState, RectHelper_androidKt.toComposeRect(selectGesture.getSelectionArea()), m1456toTextGranularityNUwxegE(selectGesture.getGranularity()), TextInclusionStrategy.INSTANCE.getContainsCenter());
        m1452highlightRangeXJREzCE(transformedTextFieldState, m1474getRangeForScreenRectOH9lIzo, TextHighlightType.INSTANCE.m1425getHandwritingSelectPreviewsxJuwY());
    }

    private final int performDeleteGesture(TransformedTextFieldState transformedTextFieldState, DeleteGesture deleteGesture, TextLayoutState textLayoutState) {
        long m1474getRangeForScreenRectOH9lIzo;
        int m1456toTextGranularityNUwxegE = m1456toTextGranularityNUwxegE(deleteGesture.getGranularity());
        m1474getRangeForScreenRectOH9lIzo = HandwritingGesture_androidKt.m1474getRangeForScreenRectOH9lIzo(textLayoutState, RectHelper_androidKt.toComposeRect(deleteGesture.getDeletionArea()), m1456toTextGranularityNUwxegE, TextInclusionStrategy.INSTANCE.getContainsCenter());
        if (TextRange.m6454getCollapsedimpl(m1474getRangeForScreenRectOH9lIzo)) {
            return INSTANCE.fallback(transformedTextFieldState, deleteGesture);
        }
        m1453performDeletionSbBc2M(transformedTextFieldState, m1474getRangeForScreenRectOH9lIzo, TextGranularity.m6420equalsimpl0(m1456toTextGranularityNUwxegE, TextGranularity.INSTANCE.m6425getWordDRrd7Zo()));
        return 1;
    }

    private final void previewDeleteGesture(TransformedTextFieldState transformedTextFieldState, DeleteGesture deleteGesture, TextLayoutState textLayoutState) {
        long m1474getRangeForScreenRectOH9lIzo;
        m1474getRangeForScreenRectOH9lIzo = HandwritingGesture_androidKt.m1474getRangeForScreenRectOH9lIzo(textLayoutState, RectHelper_androidKt.toComposeRect(deleteGesture.getDeletionArea()), m1456toTextGranularityNUwxegE(deleteGesture.getGranularity()), TextInclusionStrategy.INSTANCE.getContainsCenter());
        m1452highlightRangeXJREzCE(transformedTextFieldState, m1474getRangeForScreenRectOH9lIzo, TextHighlightType.INSTANCE.m1424getHandwritingDeletePreviewsxJuwY());
    }

    private final int performSelectRangeGesture(TransformedTextFieldState transformedTextFieldState, SelectRangeGesture selectRangeGesture, TextLayoutState textLayoutState) {
        long m1476getRangeForScreenRectsO048IG0;
        m1476getRangeForScreenRectsO048IG0 = HandwritingGesture_androidKt.m1476getRangeForScreenRectsO048IG0(textLayoutState, RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionStartArea()), RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionEndArea()), m1456toTextGranularityNUwxegE(selectRangeGesture.getGranularity()), TextInclusionStrategy.INSTANCE.getContainsCenter());
        if (TextRange.m6454getCollapsedimpl(m1476getRangeForScreenRectsO048IG0)) {
            return INSTANCE.fallback(transformedTextFieldState, selectRangeGesture);
        }
        transformedTextFieldState.m1537selectCharsIn5zctL8(m1476getRangeForScreenRectsO048IG0);
        return 1;
    }

    private final void previewSelectRangeGesture(TransformedTextFieldState transformedTextFieldState, SelectRangeGesture selectRangeGesture, TextLayoutState textLayoutState) {
        long m1476getRangeForScreenRectsO048IG0;
        m1476getRangeForScreenRectsO048IG0 = HandwritingGesture_androidKt.m1476getRangeForScreenRectsO048IG0(textLayoutState, RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionStartArea()), RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionEndArea()), m1456toTextGranularityNUwxegE(selectRangeGesture.getGranularity()), TextInclusionStrategy.INSTANCE.getContainsCenter());
        m1452highlightRangeXJREzCE(transformedTextFieldState, m1476getRangeForScreenRectsO048IG0, TextHighlightType.INSTANCE.m1425getHandwritingSelectPreviewsxJuwY());
    }

    private final int performDeleteRangeGesture(TransformedTextFieldState transformedTextFieldState, DeleteRangeGesture deleteRangeGesture, TextLayoutState textLayoutState) {
        long m1476getRangeForScreenRectsO048IG0;
        int m1456toTextGranularityNUwxegE = m1456toTextGranularityNUwxegE(deleteRangeGesture.getGranularity());
        m1476getRangeForScreenRectsO048IG0 = HandwritingGesture_androidKt.m1476getRangeForScreenRectsO048IG0(textLayoutState, RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionStartArea()), RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionEndArea()), m1456toTextGranularityNUwxegE, TextInclusionStrategy.INSTANCE.getContainsCenter());
        if (TextRange.m6454getCollapsedimpl(m1476getRangeForScreenRectsO048IG0)) {
            return INSTANCE.fallback(transformedTextFieldState, deleteRangeGesture);
        }
        m1453performDeletionSbBc2M(transformedTextFieldState, m1476getRangeForScreenRectsO048IG0, TextGranularity.m6420equalsimpl0(m1456toTextGranularityNUwxegE, TextGranularity.INSTANCE.m6425getWordDRrd7Zo()));
        return 1;
    }

    private final void previewDeleteRangeGesture(TransformedTextFieldState transformedTextFieldState, DeleteRangeGesture deleteRangeGesture, TextLayoutState textLayoutState) {
        long m1476getRangeForScreenRectsO048IG0;
        m1476getRangeForScreenRectsO048IG0 = HandwritingGesture_androidKt.m1476getRangeForScreenRectsO048IG0(textLayoutState, RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionStartArea()), RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionEndArea()), m1456toTextGranularityNUwxegE(deleteRangeGesture.getGranularity()), TextInclusionStrategy.INSTANCE.getContainsCenter());
        m1452highlightRangeXJREzCE(transformedTextFieldState, m1476getRangeForScreenRectsO048IG0, TextHighlightType.INSTANCE.m1424getHandwritingDeletePreviewsxJuwY());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r12 == true) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int performJoinOrSplitGesture(androidx.compose.foundation.text.input.internal.TransformedTextFieldState r10, android.view.inputmethod.JoinOrSplitGesture r11, androidx.compose.foundation.text.input.internal.TextLayoutState r12, androidx.compose.ui.platform.ViewConfiguration r13) {
        /*
            r9 = this;
            androidx.compose.foundation.text.input.TextFieldCharSequence r0 = r10.getOutputText()
            androidx.compose.foundation.text.input.TextFieldCharSequence r1 = r10.getUntransformedText()
            if (r0 == r1) goto Lc
            r10 = 3
            return r10
        Lc:
            android.graphics.PointF r0 = r11.getJoinOrSplitPoint()
            long r0 = androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.access$toOffset(r0)
            int r13 = androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.m1459access$getOffsetForHandwritingGestured4ec7I(r12, r0, r13)
            r0 = -1
            if (r13 == r0) goto L4d
            androidx.compose.ui.text.TextLayoutResult r12 = r12.getLayoutResult()
            r0 = 1
            if (r12 == 0) goto L29
            boolean r12 = androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.access$isBiDiBoundary(r12, r13)
            if (r12 != r0) goto L29
            goto L4d
        L29:
            androidx.compose.foundation.text.input.TextFieldCharSequence r11 = r10.getVisualText()
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            long r3 = androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.access$rangeOfWhitespaces(r11, r13)
            boolean r11 = androidx.compose.ui.text.TextRange.m6454getCollapsedimpl(r3)
            if (r11 == 0) goto L48
            java.lang.String r11 = " "
            r2 = r11
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r7 = 12
            r8 = 0
            r5 = 0
            r6 = 0
            r1 = r10
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState.m1530replaceTextM8tDOmk$default(r1, r2, r3, r5, r6, r7, r8)
            goto L4c
        L48:
            r11 = 0
            r9.m1453performDeletionSbBc2M(r10, r3, r11)
        L4c:
            return r0
        L4d:
            android.view.inputmethod.HandwritingGesture r11 = (android.view.inputmethod.HandwritingGesture) r11
            int r10 = r9.fallback(r10, r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.HandwritingGestureApi34.performJoinOrSplitGesture(androidx.compose.foundation.text.input.internal.TransformedTextFieldState, android.view.inputmethod.JoinOrSplitGesture, androidx.compose.foundation.text.input.internal.TextLayoutState, androidx.compose.ui.platform.ViewConfiguration):int");
    }

    private final int performInsertGesture(TransformedTextFieldState transformedTextFieldState, InsertGesture insertGesture, TextLayoutState textLayoutState, ViewConfiguration viewConfiguration) {
        long offset;
        int m1469getOffsetForHandwritingGestured4ec7I;
        offset = HandwritingGesture_androidKt.toOffset(insertGesture.getInsertionPoint());
        m1469getOffsetForHandwritingGestured4ec7I = HandwritingGesture_androidKt.m1469getOffsetForHandwritingGestured4ec7I(textLayoutState, offset, viewConfiguration);
        if (m1469getOffsetForHandwritingGestured4ec7I == -1) {
            return fallback(transformedTextFieldState, insertGesture);
        }
        TransformedTextFieldState.m1530replaceTextM8tDOmk$default(transformedTextFieldState, insertGesture.getTextToInsert(), TextRangeKt.TextRange(m1469getOffsetForHandwritingGestured4ec7I), null, false, 12, null);
        return 1;
    }

    private final int performRemoveSpaceGesture(TransformedTextFieldState transformedTextFieldState, RemoveSpaceGesture removeSpaceGesture, TextLayoutState textLayoutState, ViewConfiguration viewConfiguration) {
        long offset;
        long offset2;
        long m1471getRangeForRemoveSpaceGesture5iVPX68;
        TextLayoutResult layoutResult = textLayoutState.getLayoutResult();
        offset = HandwritingGesture_androidKt.toOffset(removeSpaceGesture.getStartPoint());
        offset2 = HandwritingGesture_androidKt.toOffset(removeSpaceGesture.getEndPoint());
        m1471getRangeForRemoveSpaceGesture5iVPX68 = HandwritingGesture_androidKt.m1471getRangeForRemoveSpaceGesture5iVPX68(layoutResult, offset, offset2, textLayoutState.getTextLayoutNodeCoordinates(), viewConfiguration);
        if (TextRange.m6454getCollapsedimpl(m1471getRangeForRemoveSpaceGesture5iVPX68)) {
            return INSTANCE.fallback(transformedTextFieldState, removeSpaceGesture);
        }
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = -1;
        final Ref.IntRef intRef2 = new Ref.IntRef();
        intRef2.element = -1;
        String replace = new Regex("\\s+").replace(TextRangeKt.m6467substringFDrldGo(transformedTextFieldState.getVisualText(), m1471getRangeForRemoveSpaceGesture5iVPX68), new Function1<MatchResult, CharSequence>() { // from class: androidx.compose.foundation.text.input.internal.HandwritingGestureApi34$performRemoveSpaceGesture$newText$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(MatchResult matchResult) {
                if (Ref.IntRef.this.element == -1) {
                    Ref.IntRef.this.element = matchResult.getRange().getFirst();
                }
                intRef2.element = matchResult.getRange().getLast() + 1;
                return "";
            }
        });
        if (intRef.element == -1 || intRef2.element == -1) {
            return fallback(transformedTextFieldState, removeSpaceGesture);
        }
        long TextRange = TextRangeKt.TextRange(TextRange.m6460getStartimpl(m1471getRangeForRemoveSpaceGesture5iVPX68) + intRef.element, TextRange.m6460getStartimpl(m1471getRangeForRemoveSpaceGesture5iVPX68) + intRef2.element);
        String substring = replace.substring(intRef.element, replace.length() - (TextRange.m6456getLengthimpl(m1471getRangeForRemoveSpaceGesture5iVPX68) - intRef2.element));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        TransformedTextFieldState.m1530replaceTextM8tDOmk$default(transformedTextFieldState, substring, TextRange, null, false, 12, null);
        return 1;
    }

    /* renamed from: performDeletion-Sb-Bc2M, reason: not valid java name */
    private final void m1453performDeletionSbBc2M(TransformedTextFieldState transformedTextFieldState, long j, boolean z) {
        if (z) {
            j = HandwritingGesture_androidKt.m1465adjustHandwritingDeleteGestureRange72CqOWE(j, transformedTextFieldState.getVisualText());
        }
        TransformedTextFieldState.m1530replaceTextM8tDOmk$default(transformedTextFieldState, "", j, null, false, 12, null);
    }

    /* renamed from: highlightRange-XJREzCE, reason: not valid java name */
    private final void m1452highlightRangeXJREzCE(TransformedTextFieldState transformedTextFieldState, long j, int i) {
        if (TextRange.m6454getCollapsedimpl(j)) {
            TextFieldState textFieldState = transformedTextFieldState.textFieldState;
            InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
            TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
            textFieldState.getMainBuffer().getChangeTracker().clearChanges();
            textFieldState.getMainBuffer().clearHighlight();
            textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
            return;
        }
        transformedTextFieldState.m1531highlightCharsIn7RAjNK8(i, j);
    }

    public final int performHandwritingGesture$foundation_release(LegacyTextFieldState legacyTextFieldState, HandwritingGesture handwritingGesture, TextFieldSelectionManager textFieldSelectionManager, ViewConfiguration viewConfiguration, Function1<? super EditCommand, Unit> function1) {
        TextLayoutResult value;
        TextLayoutInput layoutInput;
        AnnotatedString untransformedText = legacyTextFieldState.getUntransformedText();
        if (untransformedText == null) {
            return 3;
        }
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        if (!Intrinsics.areEqual(untransformedText, (layoutResult == null || (value = layoutResult.getValue()) == null || (layoutInput = value.getLayoutInput()) == null) ? null : layoutInput.getText())) {
            return 3;
        }
        if (handwritingGesture instanceof SelectGesture) {
            return performSelectGesture(legacyTextFieldState, (SelectGesture) handwritingGesture, textFieldSelectionManager, function1);
        }
        if (handwritingGesture instanceof DeleteGesture) {
            return performDeleteGesture(legacyTextFieldState, (DeleteGesture) handwritingGesture, untransformedText, function1);
        }
        if (handwritingGesture instanceof SelectRangeGesture) {
            return performSelectRangeGesture(legacyTextFieldState, (SelectRangeGesture) handwritingGesture, textFieldSelectionManager, function1);
        }
        if (handwritingGesture instanceof DeleteRangeGesture) {
            return performDeleteRangeGesture(legacyTextFieldState, (DeleteRangeGesture) handwritingGesture, untransformedText, function1);
        }
        if (handwritingGesture instanceof JoinOrSplitGesture) {
            return performJoinOrSplitGesture(legacyTextFieldState, (JoinOrSplitGesture) handwritingGesture, untransformedText, viewConfiguration, function1);
        }
        if (handwritingGesture instanceof InsertGesture) {
            return performInsertGesture(legacyTextFieldState, (InsertGesture) handwritingGesture, viewConfiguration, function1);
        }
        if (handwritingGesture instanceof RemoveSpaceGesture) {
            return performRemoveSpaceGesture(legacyTextFieldState, (RemoveSpaceGesture) handwritingGesture, untransformedText, viewConfiguration, function1);
        }
        return 2;
    }

    public final boolean previewHandwritingGesture$foundation_release(LegacyTextFieldState legacyTextFieldState, PreviewableHandwritingGesture previewableHandwritingGesture, final TextFieldSelectionManager textFieldSelectionManager, CancellationSignal cancellationSignal) {
        TextLayoutResult value;
        TextLayoutInput layoutInput;
        AnnotatedString untransformedText = legacyTextFieldState.getUntransformedText();
        if (untransformedText == null) {
            return false;
        }
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        if (!Intrinsics.areEqual(untransformedText, (layoutResult == null || (value = layoutResult.getValue()) == null || (layoutInput = value.getLayoutInput()) == null) ? null : layoutInput.getText())) {
            return false;
        }
        if (previewableHandwritingGesture instanceof SelectGesture) {
            previewSelectGesture(legacyTextFieldState, (SelectGesture) previewableHandwritingGesture, textFieldSelectionManager);
        } else if (previewableHandwritingGesture instanceof DeleteGesture) {
            previewDeleteGesture(legacyTextFieldState, (DeleteGesture) previewableHandwritingGesture, textFieldSelectionManager);
        } else if (previewableHandwritingGesture instanceof SelectRangeGesture) {
            previewSelectRangeGesture(legacyTextFieldState, (SelectRangeGesture) previewableHandwritingGesture, textFieldSelectionManager);
        } else {
            if (!(previewableHandwritingGesture instanceof DeleteRangeGesture)) {
                return false;
            }
            previewDeleteRangeGesture(legacyTextFieldState, (DeleteRangeGesture) previewableHandwritingGesture, textFieldSelectionManager);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.compose.foundation.text.input.internal.HandwritingGestureApi34$$ExternalSyntheticLambda0
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                HandwritingGestureApi34.previewHandwritingGesture$lambda$9(TextFieldSelectionManager.this);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void previewHandwritingGesture$lambda$9(TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.clearPreviewHighlight$foundation_release();
        }
    }

    private final int performSelectGesture(LegacyTextFieldState legacyTextFieldState, SelectGesture selectGesture, TextFieldSelectionManager textFieldSelectionManager, Function1<? super EditCommand, Unit> function1) {
        long m1473getRangeForScreenRectOH9lIzo;
        m1473getRangeForScreenRectOH9lIzo = HandwritingGesture_androidKt.m1473getRangeForScreenRectOH9lIzo(legacyTextFieldState, RectHelper_androidKt.toComposeRect(selectGesture.getSelectionArea()), m1456toTextGranularityNUwxegE(selectGesture.getGranularity()), TextInclusionStrategy.INSTANCE.getContainsCenter());
        if (TextRange.m6454getCollapsedimpl(m1473getRangeForScreenRectOH9lIzo)) {
            return INSTANCE.fallbackOnLegacyTextField(selectGesture, function1);
        }
        m1455performSelectionOnLegacyTextField8ffj60Q(m1473getRangeForScreenRectOH9lIzo, textFieldSelectionManager, function1);
        return 1;
    }

    private final void previewSelectGesture(LegacyTextFieldState legacyTextFieldState, SelectGesture selectGesture, TextFieldSelectionManager textFieldSelectionManager) {
        long m1473getRangeForScreenRectOH9lIzo;
        if (textFieldSelectionManager != null) {
            m1473getRangeForScreenRectOH9lIzo = HandwritingGesture_androidKt.m1473getRangeForScreenRectOH9lIzo(legacyTextFieldState, RectHelper_androidKt.toComposeRect(selectGesture.getSelectionArea()), m1456toTextGranularityNUwxegE(selectGesture.getGranularity()), TextInclusionStrategy.INSTANCE.getContainsCenter());
            textFieldSelectionManager.m1708setSelectionPreviewHighlight5zctL8$foundation_release(m1473getRangeForScreenRectOH9lIzo);
        }
    }

    private final int performDeleteGesture(LegacyTextFieldState legacyTextFieldState, DeleteGesture deleteGesture, AnnotatedString annotatedString, Function1<? super EditCommand, Unit> function1) {
        long m1473getRangeForScreenRectOH9lIzo;
        int m1456toTextGranularityNUwxegE = m1456toTextGranularityNUwxegE(deleteGesture.getGranularity());
        m1473getRangeForScreenRectOH9lIzo = HandwritingGesture_androidKt.m1473getRangeForScreenRectOH9lIzo(legacyTextFieldState, RectHelper_androidKt.toComposeRect(deleteGesture.getDeletionArea()), m1456toTextGranularityNUwxegE, TextInclusionStrategy.INSTANCE.getContainsCenter());
        if (TextRange.m6454getCollapsedimpl(m1473getRangeForScreenRectOH9lIzo)) {
            return INSTANCE.fallbackOnLegacyTextField(deleteGesture, function1);
        }
        m1454performDeletionOnLegacyTextFieldvJH6DeI(m1473getRangeForScreenRectOH9lIzo, annotatedString, TextGranularity.m6420equalsimpl0(m1456toTextGranularityNUwxegE, TextGranularity.INSTANCE.m6425getWordDRrd7Zo()), function1);
        return 1;
    }

    private final void previewDeleteGesture(LegacyTextFieldState legacyTextFieldState, DeleteGesture deleteGesture, TextFieldSelectionManager textFieldSelectionManager) {
        long m1473getRangeForScreenRectOH9lIzo;
        if (textFieldSelectionManager != null) {
            m1473getRangeForScreenRectOH9lIzo = HandwritingGesture_androidKt.m1473getRangeForScreenRectOH9lIzo(legacyTextFieldState, RectHelper_androidKt.toComposeRect(deleteGesture.getDeletionArea()), m1456toTextGranularityNUwxegE(deleteGesture.getGranularity()), TextInclusionStrategy.INSTANCE.getContainsCenter());
            textFieldSelectionManager.m1707setDeletionPreviewHighlight5zctL8$foundation_release(m1473getRangeForScreenRectOH9lIzo);
        }
    }

    private final int performSelectRangeGesture(LegacyTextFieldState legacyTextFieldState, SelectRangeGesture selectRangeGesture, TextFieldSelectionManager textFieldSelectionManager, Function1<? super EditCommand, Unit> function1) {
        long m1475getRangeForScreenRectsO048IG0;
        m1475getRangeForScreenRectsO048IG0 = HandwritingGesture_androidKt.m1475getRangeForScreenRectsO048IG0(legacyTextFieldState, RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionStartArea()), RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionEndArea()), m1456toTextGranularityNUwxegE(selectRangeGesture.getGranularity()), TextInclusionStrategy.INSTANCE.getContainsCenter());
        if (TextRange.m6454getCollapsedimpl(m1475getRangeForScreenRectsO048IG0)) {
            return INSTANCE.fallbackOnLegacyTextField(selectRangeGesture, function1);
        }
        m1455performSelectionOnLegacyTextField8ffj60Q(m1475getRangeForScreenRectsO048IG0, textFieldSelectionManager, function1);
        return 1;
    }

    private final void previewSelectRangeGesture(LegacyTextFieldState legacyTextFieldState, SelectRangeGesture selectRangeGesture, TextFieldSelectionManager textFieldSelectionManager) {
        long m1475getRangeForScreenRectsO048IG0;
        if (textFieldSelectionManager != null) {
            m1475getRangeForScreenRectsO048IG0 = HandwritingGesture_androidKt.m1475getRangeForScreenRectsO048IG0(legacyTextFieldState, RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionStartArea()), RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionEndArea()), m1456toTextGranularityNUwxegE(selectRangeGesture.getGranularity()), TextInclusionStrategy.INSTANCE.getContainsCenter());
            textFieldSelectionManager.m1708setSelectionPreviewHighlight5zctL8$foundation_release(m1475getRangeForScreenRectsO048IG0);
        }
    }

    private final int performDeleteRangeGesture(LegacyTextFieldState legacyTextFieldState, DeleteRangeGesture deleteRangeGesture, AnnotatedString annotatedString, Function1<? super EditCommand, Unit> function1) {
        long m1475getRangeForScreenRectsO048IG0;
        int m1456toTextGranularityNUwxegE = m1456toTextGranularityNUwxegE(deleteRangeGesture.getGranularity());
        m1475getRangeForScreenRectsO048IG0 = HandwritingGesture_androidKt.m1475getRangeForScreenRectsO048IG0(legacyTextFieldState, RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionStartArea()), RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionEndArea()), m1456toTextGranularityNUwxegE, TextInclusionStrategy.INSTANCE.getContainsCenter());
        if (TextRange.m6454getCollapsedimpl(m1475getRangeForScreenRectsO048IG0)) {
            return INSTANCE.fallbackOnLegacyTextField(deleteRangeGesture, function1);
        }
        m1454performDeletionOnLegacyTextFieldvJH6DeI(m1475getRangeForScreenRectsO048IG0, annotatedString, TextGranularity.m6420equalsimpl0(m1456toTextGranularityNUwxegE, TextGranularity.INSTANCE.m6425getWordDRrd7Zo()), function1);
        return 1;
    }

    private final void previewDeleteRangeGesture(LegacyTextFieldState legacyTextFieldState, DeleteRangeGesture deleteRangeGesture, TextFieldSelectionManager textFieldSelectionManager) {
        long m1475getRangeForScreenRectsO048IG0;
        if (textFieldSelectionManager != null) {
            m1475getRangeForScreenRectsO048IG0 = HandwritingGesture_androidKt.m1475getRangeForScreenRectsO048IG0(legacyTextFieldState, RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionStartArea()), RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionEndArea()), m1456toTextGranularityNUwxegE(deleteRangeGesture.getGranularity()), TextInclusionStrategy.INSTANCE.getContainsCenter());
            textFieldSelectionManager.m1707setDeletionPreviewHighlight5zctL8$foundation_release(m1475getRangeForScreenRectsO048IG0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (r8 == true) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int performJoinOrSplitGesture(androidx.compose.foundation.text.LegacyTextFieldState r8, android.view.inputmethod.JoinOrSplitGesture r9, androidx.compose.ui.text.AnnotatedString r10, androidx.compose.ui.platform.ViewConfiguration r11, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.EditCommand, kotlin.Unit> r12) {
        /*
            r7 = this;
            if (r11 != 0) goto L9
            android.view.inputmethod.HandwritingGesture r9 = (android.view.inputmethod.HandwritingGesture) r9
            int r8 = r7.fallbackOnLegacyTextField(r9, r12)
            return r8
        L9:
            android.graphics.PointF r0 = r9.getJoinOrSplitPoint()
            long r0 = androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.access$toOffset(r0)
            int r11 = androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.m1458access$getOffsetForHandwritingGestured4ec7I(r8, r0, r11)
            r0 = -1
            if (r11 == r0) goto L4b
            androidx.compose.foundation.text.TextLayoutResultProxy r8 = r8.getLayoutResult()
            r0 = 1
            if (r8 == 0) goto L2c
            androidx.compose.ui.text.TextLayoutResult r8 = r8.getValue()
            if (r8 == 0) goto L2c
            boolean r8 = androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.access$isBiDiBoundary(r8, r11)
            if (r8 != r0) goto L2c
            goto L4b
        L2c:
            r8 = r10
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            long r2 = androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.access$rangeOfWhitespaces(r8, r11)
            boolean r8 = androidx.compose.ui.text.TextRange.m6454getCollapsedimpl(r2)
            if (r8 == 0) goto L43
            int r8 = androidx.compose.ui.text.TextRange.m6460getStartimpl(r2)
            java.lang.String r9 = " "
            r7.performInsertionOnLegacyTextField(r8, r9, r12)
            goto L4a
        L43:
            r5 = 0
            r1 = r7
            r4 = r10
            r6 = r12
            r1.m1454performDeletionOnLegacyTextFieldvJH6DeI(r2, r4, r5, r6)
        L4a:
            return r0
        L4b:
            android.view.inputmethod.HandwritingGesture r9 = (android.view.inputmethod.HandwritingGesture) r9
            int r8 = r7.fallbackOnLegacyTextField(r9, r12)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.HandwritingGestureApi34.performJoinOrSplitGesture(androidx.compose.foundation.text.LegacyTextFieldState, android.view.inputmethod.JoinOrSplitGesture, androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.platform.ViewConfiguration, kotlin.jvm.functions.Function1):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (r3 == true) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int performInsertGesture(androidx.compose.foundation.text.LegacyTextFieldState r3, android.view.inputmethod.InsertGesture r4, androidx.compose.ui.platform.ViewConfiguration r5, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.EditCommand, kotlin.Unit> r6) {
        /*
            r2 = this;
            if (r5 != 0) goto L9
            android.view.inputmethod.HandwritingGesture r4 = (android.view.inputmethod.HandwritingGesture) r4
            int r3 = r2.fallbackOnLegacyTextField(r4, r6)
            return r3
        L9:
            android.graphics.PointF r0 = r4.getInsertionPoint()
            long r0 = androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.access$toOffset(r0)
            int r5 = androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.m1458access$getOffsetForHandwritingGestured4ec7I(r3, r0, r5)
            r0 = -1
            if (r5 == r0) goto L34
            androidx.compose.foundation.text.TextLayoutResultProxy r3 = r3.getLayoutResult()
            r0 = 1
            if (r3 == 0) goto L2c
            androidx.compose.ui.text.TextLayoutResult r3 = r3.getValue()
            if (r3 == 0) goto L2c
            boolean r3 = androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.access$isBiDiBoundary(r3, r5)
            if (r3 != r0) goto L2c
            goto L34
        L2c:
            java.lang.String r3 = r4.getTextToInsert()
            r2.performInsertionOnLegacyTextField(r5, r3, r6)
            return r0
        L34:
            android.view.inputmethod.HandwritingGesture r4 = (android.view.inputmethod.HandwritingGesture) r4
            int r3 = r2.fallbackOnLegacyTextField(r4, r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.HandwritingGestureApi34.performInsertGesture(androidx.compose.foundation.text.LegacyTextFieldState, android.view.inputmethod.InsertGesture, androidx.compose.ui.platform.ViewConfiguration, kotlin.jvm.functions.Function1):int");
    }

    private final int performRemoveSpaceGesture(LegacyTextFieldState legacyTextFieldState, RemoveSpaceGesture removeSpaceGesture, AnnotatedString annotatedString, ViewConfiguration viewConfiguration, Function1<? super EditCommand, Unit> function1) {
        long offset;
        long offset2;
        long m1471getRangeForRemoveSpaceGesture5iVPX68;
        EditCommand compoundEditCommand;
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        TextLayoutResult value = layoutResult != null ? layoutResult.getValue() : null;
        offset = HandwritingGesture_androidKt.toOffset(removeSpaceGesture.getStartPoint());
        offset2 = HandwritingGesture_androidKt.toOffset(removeSpaceGesture.getEndPoint());
        m1471getRangeForRemoveSpaceGesture5iVPX68 = HandwritingGesture_androidKt.m1471getRangeForRemoveSpaceGesture5iVPX68(value, offset, offset2, legacyTextFieldState.getLayoutCoordinates(), viewConfiguration);
        if (TextRange.m6454getCollapsedimpl(m1471getRangeForRemoveSpaceGesture5iVPX68)) {
            return INSTANCE.fallbackOnLegacyTextField(removeSpaceGesture, function1);
        }
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = -1;
        final Ref.IntRef intRef2 = new Ref.IntRef();
        intRef2.element = -1;
        String replace = new Regex("\\s+").replace(TextRangeKt.m6467substringFDrldGo(annotatedString, m1471getRangeForRemoveSpaceGesture5iVPX68), new Function1<MatchResult, CharSequence>() { // from class: androidx.compose.foundation.text.input.internal.HandwritingGestureApi34$performRemoveSpaceGesture$newText$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(MatchResult matchResult) {
                if (Ref.IntRef.this.element == -1) {
                    Ref.IntRef.this.element = matchResult.getRange().getFirst();
                }
                intRef2.element = matchResult.getRange().getLast() + 1;
                return "";
            }
        });
        if (intRef.element == -1 || intRef2.element == -1) {
            return fallbackOnLegacyTextField(removeSpaceGesture, function1);
        }
        int m6460getStartimpl = TextRange.m6460getStartimpl(m1471getRangeForRemoveSpaceGesture5iVPX68) + intRef.element;
        int m6460getStartimpl2 = TextRange.m6460getStartimpl(m1471getRangeForRemoveSpaceGesture5iVPX68) + intRef2.element;
        String substring = replace.substring(intRef.element, replace.length() - (TextRange.m6456getLengthimpl(m1471getRangeForRemoveSpaceGesture5iVPX68) - intRef2.element));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        compoundEditCommand = HandwritingGesture_androidKt.compoundEditCommand(new SetSelectionCommand(m6460getStartimpl, m6460getStartimpl2), new CommitTextCommand(substring, 1));
        function1.invoke(compoundEditCommand);
        return 1;
    }

    private final void performInsertionOnLegacyTextField(int offset, String text, Function1<? super EditCommand, Unit> editCommandConsumer) {
        EditCommand compoundEditCommand;
        compoundEditCommand = HandwritingGesture_androidKt.compoundEditCommand(new SetSelectionCommand(offset, offset), new CommitTextCommand(text, 1));
        editCommandConsumer.invoke(compoundEditCommand);
    }

    /* renamed from: performSelectionOnLegacyTextField-8ffj60Q, reason: not valid java name */
    private final void m1455performSelectionOnLegacyTextField8ffj60Q(long range, TextFieldSelectionManager textSelectionManager, Function1<? super EditCommand, Unit> editCommandConsumer) {
        editCommandConsumer.invoke(new SetSelectionCommand(TextRange.m6460getStartimpl(range), TextRange.m6455getEndimpl(range)));
        if (textSelectionManager != null) {
            textSelectionManager.enterSelectionMode$foundation_release(true);
        }
    }

    /* renamed from: performDeletionOnLegacyTextField-vJH6DeI, reason: not valid java name */
    private final void m1454performDeletionOnLegacyTextFieldvJH6DeI(long range, AnnotatedString text, boolean adjustRange, Function1<? super EditCommand, Unit> editCommandConsumer) {
        EditCommand compoundEditCommand;
        if (adjustRange) {
            range = HandwritingGesture_androidKt.m1465adjustHandwritingDeleteGestureRange72CqOWE(range, text);
        }
        compoundEditCommand = HandwritingGesture_androidKt.compoundEditCommand(new SetSelectionCommand(TextRange.m6455getEndimpl(range), TextRange.m6455getEndimpl(range)), new DeleteSurroundingTextCommand(TextRange.m6456getLengthimpl(range), 0));
        editCommandConsumer.invoke(compoundEditCommand);
    }

    private final int fallbackOnLegacyTextField(HandwritingGesture gesture, Function1<? super EditCommand, Unit> editCommandConsumer) {
        String fallbackText = gesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        editCommandConsumer.invoke(new CommitTextCommand(fallbackText, 1));
        return 5;
    }

    /* renamed from: toTextGranularity-NUwxegE, reason: not valid java name */
    private final int m1456toTextGranularityNUwxegE(int i) {
        if (i == 1) {
            return TextGranularity.INSTANCE.m6425getWordDRrd7Zo();
        }
        if (i == 2) {
            return TextGranularity.INSTANCE.m6424getCharacterDRrd7Zo();
        }
        return TextGranularity.INSTANCE.m6424getCharacterDRrd7Zo();
    }

    private final int fallback(TransformedTextFieldState transformedTextFieldState, HandwritingGesture handwritingGesture) {
        TextFieldState textFieldState = transformedTextFieldState.textFieldState;
        InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer().getChangeTracker().clearChanges();
        textFieldState.getMainBuffer().clearHighlight();
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        TransformedTextFieldState.replaceSelectedText$default(transformedTextFieldState, fallbackText, true, null, 4, null);
        return 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void previewHandwritingGesture$lambda$1(TransformedTextFieldState transformedTextFieldState) {
        TextFieldState textFieldState = transformedTextFieldState.textFieldState;
        InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer().getChangeTracker().clearChanges();
        textFieldState.getMainBuffer().clearHighlight();
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
    }
}

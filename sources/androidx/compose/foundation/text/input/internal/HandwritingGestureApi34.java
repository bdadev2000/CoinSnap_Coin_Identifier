package androidx.compose.foundation.text.input.internal;

import android.graphics.PointF;
import android.graphics.RectF;
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
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextHighlightType;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextGranularity;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.DeleteSurroundingTextCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.SetSelectionCommand;
import d0.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.l;
import z0.h;

@StabilityInferred
@RequiresApi
/* loaded from: classes2.dex */
public final class HandwritingGestureApi34 {

    /* renamed from: a, reason: collision with root package name */
    public static final HandwritingGestureApi34 f6408a = new Object();

    @DoNotInline
    private final void A(TransformedTextFieldState transformedTextFieldState, DeleteRangeGesture deleteRangeGesture, TextLayoutState textLayoutState) {
        RectF deletionStartArea;
        RectF deletionEndArea;
        int granularity;
        deletionStartArea = deleteRangeGesture.getDeletionStartArea();
        Rect e = RectHelper_androidKt.e(deletionStartArea);
        deletionEndArea = deleteRangeGesture.getDeletionEndArea();
        Rect e2 = RectHelper_androidKt.e(deletionEndArea);
        granularity = deleteRangeGesture.getGranularity();
        c(transformedTextFieldState, HandwritingGesture_androidKt.d(textLayoutState, e, e2, H(granularity)), 1);
    }

    @DoNotInline
    private final void D(LegacyTextFieldState legacyTextFieldState, SelectGesture selectGesture, TextFieldSelectionManager textFieldSelectionManager) {
        RectF selectionArea;
        int granularity;
        if (textFieldSelectionManager != null) {
            selectionArea = selectGesture.getSelectionArea();
            Rect e = RectHelper_androidKt.e(selectionArea);
            granularity = selectGesture.getGranularity();
            long j2 = HandwritingGesture_androidKt.j(legacyTextFieldState, e, H(granularity));
            LegacyTextFieldState legacyTextFieldState2 = textFieldSelectionManager.d;
            if (legacyTextFieldState2 != null) {
                legacyTextFieldState2.g(j2);
            }
            LegacyTextFieldState legacyTextFieldState3 = textFieldSelectionManager.d;
            if (legacyTextFieldState3 != null) {
                legacyTextFieldState3.f(TextRange.f17056b);
            }
            if (TextRange.c(j2)) {
                return;
            }
            textFieldSelectionManager.t(false);
            textFieldSelectionManager.r(HandleState.f5967a);
        }
    }

    @DoNotInline
    private final void E(TransformedTextFieldState transformedTextFieldState, SelectGesture selectGesture, TextLayoutState textLayoutState) {
        RectF selectionArea;
        int granularity;
        selectionArea = selectGesture.getSelectionArea();
        Rect e = RectHelper_androidKt.e(selectionArea);
        granularity = selectGesture.getGranularity();
        c(transformedTextFieldState, HandwritingGesture_androidKt.k(textLayoutState, e, H(granularity)), 0);
    }

    @DoNotInline
    private final void F(LegacyTextFieldState legacyTextFieldState, SelectRangeGesture selectRangeGesture, TextFieldSelectionManager textFieldSelectionManager) {
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity;
        if (textFieldSelectionManager != null) {
            selectionStartArea = selectRangeGesture.getSelectionStartArea();
            Rect e = RectHelper_androidKt.e(selectionStartArea);
            selectionEndArea = selectRangeGesture.getSelectionEndArea();
            Rect e2 = RectHelper_androidKt.e(selectionEndArea);
            granularity = selectRangeGesture.getGranularity();
            long c2 = HandwritingGesture_androidKt.c(legacyTextFieldState, e, e2, H(granularity));
            LegacyTextFieldState legacyTextFieldState2 = textFieldSelectionManager.d;
            if (legacyTextFieldState2 != null) {
                legacyTextFieldState2.g(c2);
            }
            LegacyTextFieldState legacyTextFieldState3 = textFieldSelectionManager.d;
            if (legacyTextFieldState3 != null) {
                legacyTextFieldState3.f(TextRange.f17056b);
            }
            if (TextRange.c(c2)) {
                return;
            }
            textFieldSelectionManager.t(false);
            textFieldSelectionManager.r(HandleState.f5967a);
        }
    }

    @DoNotInline
    private final void G(TransformedTextFieldState transformedTextFieldState, SelectRangeGesture selectRangeGesture, TextLayoutState textLayoutState) {
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity;
        selectionStartArea = selectRangeGesture.getSelectionStartArea();
        Rect e = RectHelper_androidKt.e(selectionStartArea);
        selectionEndArea = selectRangeGesture.getSelectionEndArea();
        Rect e2 = RectHelper_androidKt.e(selectionEndArea);
        granularity = selectRangeGesture.getGranularity();
        c(transformedTextFieldState, HandwritingGesture_androidKt.d(textLayoutState, e, e2, H(granularity)), 0);
    }

    @DoNotInline
    private final int H(int i2) {
        return i2 != 1 ? 0 : 1;
    }

    @DoNotInline
    private final int a(TransformedTextFieldState transformedTextFieldState, HandwritingGesture handwritingGesture) {
        String fallbackText;
        TextFieldState textFieldState = transformedTextFieldState.f6651a;
        InputTransformation inputTransformation = transformedTextFieldState.f6652b;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.f6873a;
        textFieldState.f6307b.f6400b.b();
        textFieldState.f6307b.e = null;
        TextFieldState.a(textFieldState, inputTransformation, true, textFieldEditUndoBehavior);
        fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        TransformedTextFieldState.h(transformedTextFieldState, fallbackText, true, null, 4);
        return 5;
    }

    @DoNotInline
    private final int b(HandwritingGesture handwritingGesture, l lVar) {
        String fallbackText;
        fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        lVar.invoke(new CommitTextCommand(fallbackText, 1));
        return 5;
    }

    public static void c(TransformedTextFieldState transformedTextFieldState, long j2, int i2) {
        boolean c2 = TextRange.c(j2);
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.f6873a;
        if (c2) {
            TextFieldState textFieldState = transformedTextFieldState.f6651a;
            InputTransformation inputTransformation = transformedTextFieldState.f6652b;
            textFieldState.f6307b.f6400b.b();
            textFieldState.f6307b.e = null;
            TextFieldState.a(textFieldState, inputTransformation, true, textFieldEditUndoBehavior);
            return;
        }
        long f2 = transformedTextFieldState.f(j2);
        InputTransformation inputTransformation2 = transformedTextFieldState.f6652b;
        TextFieldState textFieldState2 = transformedTextFieldState.f6651a;
        textFieldState2.f6307b.f6400b.b();
        EditingBuffer editingBuffer = textFieldState2.f6307b;
        int i3 = (int) (f2 >> 32);
        int i4 = (int) (f2 & 4294967295L);
        if (i3 >= i4) {
            editingBuffer.getClass();
            throw new IllegalArgumentException(android.support.v4.media.d.k("Do not set reversed or empty range: ", i3, " > ", i4));
        }
        PartialGapBuffer partialGapBuffer = editingBuffer.f6399a;
        editingBuffer.e = new k(new TextHighlightType(i2), new TextRange(TextRangeKt.a(p0.a.A(i3, 0, partialGapBuffer.length()), p0.a.A(i4, 0, partialGapBuffer.length()))));
        TextFieldState.a(textFieldState2, inputTransformation2, true, textFieldEditUndoBehavior);
    }

    @DoNotInline
    private final int d(LegacyTextFieldState legacyTextFieldState, DeleteGesture deleteGesture, AnnotatedString annotatedString, l lVar) {
        int granularity;
        RectF deletionArea;
        granularity = deleteGesture.getGranularity();
        int H = H(granularity);
        deletionArea = deleteGesture.getDeletionArea();
        long j2 = HandwritingGesture_androidKt.j(legacyTextFieldState, RectHelper_androidKt.e(deletionArea), H);
        if (TextRange.c(j2)) {
            return f6408a.b(d.e(deleteGesture), lVar);
        }
        i(j2, annotatedString, TextGranularity.a(H, 1), lVar);
        return 1;
    }

    @DoNotInline
    private final int e(TransformedTextFieldState transformedTextFieldState, DeleteGesture deleteGesture, TextLayoutState textLayoutState) {
        int granularity;
        RectF deletionArea;
        granularity = deleteGesture.getGranularity();
        int H = H(granularity);
        deletionArea = deleteGesture.getDeletionArea();
        long k2 = HandwritingGesture_androidKt.k(textLayoutState, RectHelper_androidKt.e(deletionArea), H);
        if (TextRange.c(k2)) {
            return f6408a.a(transformedTextFieldState, d.e(deleteGesture));
        }
        h(transformedTextFieldState, k2, TextGranularity.a(H, 1));
        return 1;
    }

    @DoNotInline
    private final int f(LegacyTextFieldState legacyTextFieldState, DeleteRangeGesture deleteRangeGesture, AnnotatedString annotatedString, l lVar) {
        int granularity;
        RectF deletionStartArea;
        RectF deletionEndArea;
        granularity = deleteRangeGesture.getGranularity();
        int H = H(granularity);
        deletionStartArea = deleteRangeGesture.getDeletionStartArea();
        Rect e = RectHelper_androidKt.e(deletionStartArea);
        deletionEndArea = deleteRangeGesture.getDeletionEndArea();
        long c2 = HandwritingGesture_androidKt.c(legacyTextFieldState, e, RectHelper_androidKt.e(deletionEndArea), H);
        if (TextRange.c(c2)) {
            return f6408a.b(d.e(deleteRangeGesture), lVar);
        }
        i(c2, annotatedString, TextGranularity.a(H, 1), lVar);
        return 1;
    }

    @DoNotInline
    private final int g(TransformedTextFieldState transformedTextFieldState, DeleteRangeGesture deleteRangeGesture, TextLayoutState textLayoutState) {
        int granularity;
        RectF deletionStartArea;
        RectF deletionEndArea;
        granularity = deleteRangeGesture.getGranularity();
        int H = H(granularity);
        deletionStartArea = deleteRangeGesture.getDeletionStartArea();
        Rect e = RectHelper_androidKt.e(deletionStartArea);
        deletionEndArea = deleteRangeGesture.getDeletionEndArea();
        long d = HandwritingGesture_androidKt.d(textLayoutState, e, RectHelper_androidKt.e(deletionEndArea), H);
        if (TextRange.c(d)) {
            return f6408a.a(transformedTextFieldState, d.e(deleteRangeGesture));
        }
        h(transformedTextFieldState, d, TextGranularity.a(H, 1));
        return 1;
    }

    @DoNotInline
    private final void h(TransformedTextFieldState transformedTextFieldState, long j2, boolean z2) {
        if (z2) {
            j2 = HandwritingGesture_androidKt.a(j2, transformedTextFieldState.d());
        }
        TransformedTextFieldState.i(transformedTextFieldState, "", j2, false, 12);
    }

    @DoNotInline
    private final void i(long j2, AnnotatedString annotatedString, boolean z2, l lVar) {
        if (z2) {
            j2 = HandwritingGesture_androidKt.a(j2, annotatedString);
        }
        int i2 = (int) (4294967295L & j2);
        lVar.invoke(new HandwritingGesture_androidKt$compoundEditCommand$1(new EditCommand[]{new SetSelectionCommand(i2, i2), new DeleteSurroundingTextCommand(TextRange.d(j2), 0)}));
    }

    @DoNotInline
    private final int l(LegacyTextFieldState legacyTextFieldState, InsertGesture insertGesture, ViewConfiguration viewConfiguration, l lVar) {
        PointF insertionPoint;
        TextLayoutResultProxy d;
        String textToInsert;
        TextLayoutResult textLayoutResult;
        TextLayoutResult textLayoutResult2;
        MultiParagraph multiParagraph;
        if (viewConfiguration == null) {
            return b(d.e(insertGesture), lVar);
        }
        insertionPoint = insertGesture.getInsertionPoint();
        long g2 = HandwritingGesture_androidKt.g(insertionPoint);
        TextLayoutResultProxy d2 = legacyTextFieldState.d();
        int i2 = (d2 == null || (textLayoutResult2 = d2.f6210a) == null || (multiParagraph = textLayoutResult2.f17047b) == null) ? -1 : HandwritingGesture_androidKt.i(multiParagraph, g2, legacyTextFieldState.c(), viewConfiguration);
        if (i2 == -1 || !((d = legacyTextFieldState.d()) == null || (textLayoutResult = d.f6210a) == null || !HandwritingGesture_androidKt.e(textLayoutResult, i2))) {
            return b(d.e(insertGesture), lVar);
        }
        textToInsert = insertGesture.getTextToInsert();
        n(i2, textToInsert, lVar);
        return 1;
    }

    @DoNotInline
    private final int m(TransformedTextFieldState transformedTextFieldState, InsertGesture insertGesture, TextLayoutState textLayoutState, ViewConfiguration viewConfiguration) {
        PointF insertionPoint;
        String textToInsert;
        MultiParagraph multiParagraph;
        insertionPoint = insertGesture.getInsertionPoint();
        long g2 = HandwritingGesture_androidKt.g(insertionPoint);
        TextLayoutResult b2 = textLayoutState.b();
        int i2 = (b2 == null || (multiParagraph = b2.f17047b) == null) ? -1 : HandwritingGesture_androidKt.i(multiParagraph, g2, textLayoutState.d(), viewConfiguration);
        if (i2 == -1) {
            return a(transformedTextFieldState, d.e(insertGesture));
        }
        textToInsert = insertGesture.getTextToInsert();
        TransformedTextFieldState.i(transformedTextFieldState, textToInsert, TextRangeKt.a(i2, i2), false, 12);
        return 1;
    }

    @DoNotInline
    private final void n(int i2, String str, l lVar) {
        lVar.invoke(new HandwritingGesture_androidKt$compoundEditCommand$1(new EditCommand[]{new SetSelectionCommand(i2, i2), new CommitTextCommand(str, 1)}));
    }

    @DoNotInline
    private final int o(LegacyTextFieldState legacyTextFieldState, JoinOrSplitGesture joinOrSplitGesture, AnnotatedString annotatedString, ViewConfiguration viewConfiguration, l lVar) {
        PointF joinOrSplitPoint;
        TextLayoutResultProxy d;
        TextLayoutResult textLayoutResult;
        TextLayoutResult textLayoutResult2;
        MultiParagraph multiParagraph;
        if (viewConfiguration == null) {
            return b(d.e(joinOrSplitGesture), lVar);
        }
        joinOrSplitPoint = joinOrSplitGesture.getJoinOrSplitPoint();
        long g2 = HandwritingGesture_androidKt.g(joinOrSplitPoint);
        TextLayoutResultProxy d2 = legacyTextFieldState.d();
        int i2 = (d2 == null || (textLayoutResult2 = d2.f6210a) == null || (multiParagraph = textLayoutResult2.f17047b) == null) ? -1 : HandwritingGesture_androidKt.i(multiParagraph, g2, legacyTextFieldState.c(), viewConfiguration);
        if (i2 == -1 || !((d = legacyTextFieldState.d()) == null || (textLayoutResult = d.f6210a) == null || !HandwritingGesture_androidKt.e(textLayoutResult, i2))) {
            return b(d.e(joinOrSplitGesture), lVar);
        }
        long f2 = HandwritingGesture_androidKt.f(i2, annotatedString);
        if (TextRange.c(f2)) {
            n((int) (f2 >> 32), " ", lVar);
        } else {
            i(f2, annotatedString, false, lVar);
        }
        return 1;
    }

    @DoNotInline
    private final int p(TransformedTextFieldState transformedTextFieldState, JoinOrSplitGesture joinOrSplitGesture, TextLayoutState textLayoutState, ViewConfiguration viewConfiguration) {
        PointF joinOrSplitPoint;
        TextLayoutResult b2;
        MultiParagraph multiParagraph;
        if (transformedTextFieldState.c() != transformedTextFieldState.f6651a.b()) {
            return 3;
        }
        joinOrSplitPoint = joinOrSplitGesture.getJoinOrSplitPoint();
        long g2 = HandwritingGesture_androidKt.g(joinOrSplitPoint);
        TextLayoutResult b3 = textLayoutState.b();
        int i2 = (b3 == null || (multiParagraph = b3.f17047b) == null) ? -1 : HandwritingGesture_androidKt.i(multiParagraph, g2, textLayoutState.d(), viewConfiguration);
        if (i2 == -1 || ((b2 = textLayoutState.b()) != null && HandwritingGesture_androidKt.e(b2, i2))) {
            return a(transformedTextFieldState, d.e(joinOrSplitGesture));
        }
        long f2 = HandwritingGesture_androidKt.f(i2, transformedTextFieldState.d());
        if (TextRange.c(f2)) {
            TransformedTextFieldState.i(transformedTextFieldState, " ", f2, false, 12);
        } else {
            h(transformedTextFieldState, f2, false);
        }
        return 1;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.jvm.internal.d0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [kotlin.jvm.internal.d0, java.lang.Object] */
    @DoNotInline
    private final int q(LegacyTextFieldState legacyTextFieldState, RemoveSpaceGesture removeSpaceGesture, AnnotatedString annotatedString, ViewConfiguration viewConfiguration, l lVar) {
        PointF startPoint;
        PointF endPoint;
        int i2;
        TextLayoutResultProxy d = legacyTextFieldState.d();
        TextLayoutResult textLayoutResult = d != null ? d.f6210a : null;
        startPoint = removeSpaceGesture.getStartPoint();
        long g2 = HandwritingGesture_androidKt.g(startPoint);
        endPoint = removeSpaceGesture.getEndPoint();
        long b2 = HandwritingGesture_androidKt.b(textLayoutResult, g2, HandwritingGesture_androidKt.g(endPoint), legacyTextFieldState.c(), viewConfiguration);
        if (TextRange.c(b2)) {
            return f6408a.b(d.e(removeSpaceGesture), lVar);
        }
        ?? obj = new Object();
        obj.f30925a = -1;
        ?? obj2 = new Object();
        obj2.f30925a = -1;
        String b3 = new h("\\s+").b(TextRangeKt.c(b2, annotatedString), new HandwritingGestureApi34$performRemoveSpaceGesture$newText$2(obj, obj2));
        int i3 = obj.f30925a;
        if (i3 == -1 || (i2 = obj2.f30925a) == -1) {
            return b(d.e(removeSpaceGesture), lVar);
        }
        int i4 = (int) (b2 >> 32);
        String substring = b3.substring(i3, b3.length() - (TextRange.d(b2) - obj2.f30925a));
        p0.a.r(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        lVar.invoke(new HandwritingGesture_androidKt$compoundEditCommand$1(new EditCommand[]{new SetSelectionCommand(i4 + i3, i4 + i2), new CommitTextCommand(substring, 1)}));
        return 1;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.internal.d0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.internal.d0, java.lang.Object] */
    @DoNotInline
    private final int r(TransformedTextFieldState transformedTextFieldState, RemoveSpaceGesture removeSpaceGesture, TextLayoutState textLayoutState, ViewConfiguration viewConfiguration) {
        PointF startPoint;
        PointF endPoint;
        int i2;
        TextLayoutResult b2 = textLayoutState.b();
        startPoint = removeSpaceGesture.getStartPoint();
        long g2 = HandwritingGesture_androidKt.g(startPoint);
        endPoint = removeSpaceGesture.getEndPoint();
        long b3 = HandwritingGesture_androidKt.b(b2, g2, HandwritingGesture_androidKt.g(endPoint), textLayoutState.d(), viewConfiguration);
        if (TextRange.c(b3)) {
            return f6408a.a(transformedTextFieldState, d.e(removeSpaceGesture));
        }
        ?? obj = new Object();
        obj.f30925a = -1;
        ?? obj2 = new Object();
        obj2.f30925a = -1;
        String b4 = new h("\\s+").b(TextRangeKt.c(b3, transformedTextFieldState.d()), new HandwritingGestureApi34$performRemoveSpaceGesture$newText$1(obj, obj2));
        int i3 = obj.f30925a;
        if (i3 == -1 || (i2 = obj2.f30925a) == -1) {
            return a(transformedTextFieldState, d.e(removeSpaceGesture));
        }
        int i4 = (int) (b3 >> 32);
        long a2 = TextRangeKt.a(i3 + i4, i4 + i2);
        String substring = b4.substring(obj.f30925a, b4.length() - (TextRange.d(b3) - obj2.f30925a));
        p0.a.r(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        TransformedTextFieldState.i(transformedTextFieldState, substring, a2, false, 12);
        return 1;
    }

    @DoNotInline
    private final int s(LegacyTextFieldState legacyTextFieldState, SelectGesture selectGesture, TextFieldSelectionManager textFieldSelectionManager, l lVar) {
        RectF selectionArea;
        int granularity;
        selectionArea = selectGesture.getSelectionArea();
        Rect e = RectHelper_androidKt.e(selectionArea);
        granularity = selectGesture.getGranularity();
        long j2 = HandwritingGesture_androidKt.j(legacyTextFieldState, e, H(granularity));
        if (TextRange.c(j2)) {
            return f6408a.b(d.e(selectGesture), lVar);
        }
        w(j2, textFieldSelectionManager, lVar);
        return 1;
    }

    @DoNotInline
    private final int t(TransformedTextFieldState transformedTextFieldState, SelectGesture selectGesture, TextLayoutState textLayoutState) {
        RectF selectionArea;
        int granularity;
        selectionArea = selectGesture.getSelectionArea();
        Rect e = RectHelper_androidKt.e(selectionArea);
        granularity = selectGesture.getGranularity();
        long k2 = HandwritingGesture_androidKt.k(textLayoutState, e, H(granularity));
        if (TextRange.c(k2)) {
            return f6408a.a(transformedTextFieldState, d.e(selectGesture));
        }
        transformedTextFieldState.j(k2);
        return 1;
    }

    @DoNotInline
    private final int u(LegacyTextFieldState legacyTextFieldState, SelectRangeGesture selectRangeGesture, TextFieldSelectionManager textFieldSelectionManager, l lVar) {
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity;
        selectionStartArea = selectRangeGesture.getSelectionStartArea();
        Rect e = RectHelper_androidKt.e(selectionStartArea);
        selectionEndArea = selectRangeGesture.getSelectionEndArea();
        Rect e2 = RectHelper_androidKt.e(selectionEndArea);
        granularity = selectRangeGesture.getGranularity();
        long c2 = HandwritingGesture_androidKt.c(legacyTextFieldState, e, e2, H(granularity));
        if (TextRange.c(c2)) {
            return f6408a.b(d.e(selectRangeGesture), lVar);
        }
        w(c2, textFieldSelectionManager, lVar);
        return 1;
    }

    @DoNotInline
    private final int v(TransformedTextFieldState transformedTextFieldState, SelectRangeGesture selectRangeGesture, TextLayoutState textLayoutState) {
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity;
        selectionStartArea = selectRangeGesture.getSelectionStartArea();
        Rect e = RectHelper_androidKt.e(selectionStartArea);
        selectionEndArea = selectRangeGesture.getSelectionEndArea();
        Rect e2 = RectHelper_androidKt.e(selectionEndArea);
        granularity = selectRangeGesture.getGranularity();
        long d = HandwritingGesture_androidKt.d(textLayoutState, e, e2, H(granularity));
        if (TextRange.c(d)) {
            return f6408a.a(transformedTextFieldState, d.e(selectRangeGesture));
        }
        transformedTextFieldState.j(d);
        return 1;
    }

    @DoNotInline
    private final void w(long j2, TextFieldSelectionManager textFieldSelectionManager, l lVar) {
        int i2 = TextRange.f17057c;
        lVar.invoke(new SetSelectionCommand((int) (j2 >> 32), (int) (j2 & 4294967295L)));
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.h(true);
        }
    }

    @DoNotInline
    private final void x(LegacyTextFieldState legacyTextFieldState, DeleteGesture deleteGesture, TextFieldSelectionManager textFieldSelectionManager) {
        RectF deletionArea;
        int granularity;
        if (textFieldSelectionManager != null) {
            deletionArea = deleteGesture.getDeletionArea();
            Rect e = RectHelper_androidKt.e(deletionArea);
            granularity = deleteGesture.getGranularity();
            long j2 = HandwritingGesture_androidKt.j(legacyTextFieldState, e, H(granularity));
            LegacyTextFieldState legacyTextFieldState2 = textFieldSelectionManager.d;
            if (legacyTextFieldState2 != null) {
                legacyTextFieldState2.f(j2);
            }
            LegacyTextFieldState legacyTextFieldState3 = textFieldSelectionManager.d;
            if (legacyTextFieldState3 != null) {
                legacyTextFieldState3.g(TextRange.f17056b);
            }
            if (TextRange.c(j2)) {
                return;
            }
            textFieldSelectionManager.t(false);
            textFieldSelectionManager.r(HandleState.f5967a);
        }
    }

    @DoNotInline
    private final void y(TransformedTextFieldState transformedTextFieldState, DeleteGesture deleteGesture, TextLayoutState textLayoutState) {
        RectF deletionArea;
        int granularity;
        deletionArea = deleteGesture.getDeletionArea();
        Rect e = RectHelper_androidKt.e(deletionArea);
        granularity = deleteGesture.getGranularity();
        c(transformedTextFieldState, HandwritingGesture_androidKt.k(textLayoutState, e, H(granularity)), 1);
    }

    @DoNotInline
    private final void z(LegacyTextFieldState legacyTextFieldState, DeleteRangeGesture deleteRangeGesture, TextFieldSelectionManager textFieldSelectionManager) {
        RectF deletionStartArea;
        RectF deletionEndArea;
        int granularity;
        if (textFieldSelectionManager != null) {
            deletionStartArea = deleteRangeGesture.getDeletionStartArea();
            Rect e = RectHelper_androidKt.e(deletionStartArea);
            deletionEndArea = deleteRangeGesture.getDeletionEndArea();
            Rect e2 = RectHelper_androidKt.e(deletionEndArea);
            granularity = deleteRangeGesture.getGranularity();
            long c2 = HandwritingGesture_androidKt.c(legacyTextFieldState, e, e2, H(granularity));
            LegacyTextFieldState legacyTextFieldState2 = textFieldSelectionManager.d;
            if (legacyTextFieldState2 != null) {
                legacyTextFieldState2.f(c2);
            }
            LegacyTextFieldState legacyTextFieldState3 = textFieldSelectionManager.d;
            if (legacyTextFieldState3 != null) {
                legacyTextFieldState3.g(TextRange.f17056b);
            }
            if (TextRange.c(c2)) {
                return;
            }
            textFieldSelectionManager.t(false);
            textFieldSelectionManager.r(HandleState.f5967a);
        }
    }

    @DoNotInline
    public final boolean B(@NotNull LegacyTextFieldState legacyTextFieldState, @NotNull PreviewableHandwritingGesture previewableHandwritingGesture, @Nullable TextFieldSelectionManager textFieldSelectionManager, @Nullable CancellationSignal cancellationSignal) {
        TextLayoutResult textLayoutResult;
        TextLayoutInput textLayoutInput;
        AnnotatedString annotatedString = legacyTextFieldState.f6028j;
        if (annotatedString == null) {
            return false;
        }
        TextLayoutResultProxy d = legacyTextFieldState.d();
        if (!p0.a.g(annotatedString, (d == null || (textLayoutResult = d.f6210a) == null || (textLayoutInput = textLayoutResult.f17046a) == null) ? null : textLayoutInput.f17038a)) {
            return false;
        }
        if (e.x(previewableHandwritingGesture)) {
            D(legacyTextFieldState, d.i(previewableHandwritingGesture), textFieldSelectionManager);
        } else if (d.q(previewableHandwritingGesture)) {
            x(legacyTextFieldState, d.c(previewableHandwritingGesture), textFieldSelectionManager);
        } else if (d.u(previewableHandwritingGesture)) {
            F(legacyTextFieldState, d.j(previewableHandwritingGesture), textFieldSelectionManager);
        } else {
            if (!d.w(previewableHandwritingGesture)) {
                return false;
            }
            z(legacyTextFieldState, d.d(previewableHandwritingGesture), textFieldSelectionManager);
        }
        int i2 = 1;
        if (cancellationSignal != null) {
            cancellationSignal.setOnCancelListener(new f(textFieldSelectionManager, i2));
        }
        return true;
    }

    @DoNotInline
    public final boolean C(@NotNull TransformedTextFieldState transformedTextFieldState, @NotNull PreviewableHandwritingGesture previewableHandwritingGesture, @NotNull TextLayoutState textLayoutState, @Nullable CancellationSignal cancellationSignal) {
        int i2 = 0;
        if (e.x(previewableHandwritingGesture)) {
            E(transformedTextFieldState, d.i(previewableHandwritingGesture), textLayoutState);
        } else if (d.q(previewableHandwritingGesture)) {
            y(transformedTextFieldState, d.c(previewableHandwritingGesture), textLayoutState);
        } else if (d.u(previewableHandwritingGesture)) {
            G(transformedTextFieldState, d.j(previewableHandwritingGesture), textLayoutState);
        } else {
            if (!d.w(previewableHandwritingGesture)) {
                return false;
            }
            A(transformedTextFieldState, d.d(previewableHandwritingGesture), textLayoutState);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new f(transformedTextFieldState, i2));
        return true;
    }

    @DoNotInline
    public final int j(@NotNull LegacyTextFieldState legacyTextFieldState, @NotNull HandwritingGesture handwritingGesture, @Nullable TextFieldSelectionManager textFieldSelectionManager, @Nullable ViewConfiguration viewConfiguration, @NotNull l lVar) {
        TextLayoutResult textLayoutResult;
        TextLayoutInput textLayoutInput;
        AnnotatedString annotatedString = legacyTextFieldState.f6028j;
        if (annotatedString == null) {
            return 3;
        }
        TextLayoutResultProxy d = legacyTextFieldState.d();
        if (!p0.a.g(annotatedString, (d == null || (textLayoutResult = d.f6210a) == null || (textLayoutInput = textLayoutResult.f17046a) == null) ? null : textLayoutInput.f17038a)) {
            return 3;
        }
        if (e.x(handwritingGesture)) {
            return s(legacyTextFieldState, d.i(handwritingGesture), textFieldSelectionManager, lVar);
        }
        if (d.q(handwritingGesture)) {
            return d(legacyTextFieldState, d.c(handwritingGesture), annotatedString, lVar);
        }
        if (d.u(handwritingGesture)) {
            return u(legacyTextFieldState, d.j(handwritingGesture), textFieldSelectionManager, lVar);
        }
        if (d.w(handwritingGesture)) {
            return f(legacyTextFieldState, d.d(handwritingGesture), annotatedString, lVar);
        }
        if (d.C(handwritingGesture)) {
            return o(legacyTextFieldState, d.g(handwritingGesture), annotatedString, viewConfiguration, lVar);
        }
        if (d.y(handwritingGesture)) {
            return l(legacyTextFieldState, d.f(handwritingGesture), viewConfiguration, lVar);
        }
        if (d.A(handwritingGesture)) {
            return q(legacyTextFieldState, d.h(handwritingGesture), annotatedString, viewConfiguration, lVar);
        }
        return 2;
    }

    @DoNotInline
    public final int k(@NotNull TransformedTextFieldState transformedTextFieldState, @NotNull HandwritingGesture handwritingGesture, @NotNull TextLayoutState textLayoutState, @Nullable ViewConfiguration viewConfiguration) {
        if (e.x(handwritingGesture)) {
            return t(transformedTextFieldState, d.i(handwritingGesture), textLayoutState);
        }
        if (d.q(handwritingGesture)) {
            return e(transformedTextFieldState, d.c(handwritingGesture), textLayoutState);
        }
        if (d.u(handwritingGesture)) {
            return v(transformedTextFieldState, d.j(handwritingGesture), textLayoutState);
        }
        if (d.w(handwritingGesture)) {
            return g(transformedTextFieldState, d.d(handwritingGesture), textLayoutState);
        }
        if (d.C(handwritingGesture)) {
            return p(transformedTextFieldState, d.g(handwritingGesture), textLayoutState, viewConfiguration);
        }
        if (d.y(handwritingGesture)) {
            return m(transformedTextFieldState, d.f(handwritingGesture), textLayoutState, viewConfiguration);
        }
        if (d.A(handwritingGesture)) {
            return r(transformedTextFieldState, d.h(handwritingGesture), textLayoutState, viewConfiguration);
        }
        return 2;
    }
}

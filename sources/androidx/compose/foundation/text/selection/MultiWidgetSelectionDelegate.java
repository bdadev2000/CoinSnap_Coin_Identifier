package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import java.util.ArrayList;
import java.util.Comparator;

@StabilityInferred
/* loaded from: classes3.dex */
public final class MultiWidgetSelectionDelegate implements Selectable {

    /* renamed from: a, reason: collision with root package name */
    public final long f7076a;

    /* renamed from: b, reason: collision with root package name */
    public final q0.a f7077b;

    /* renamed from: c, reason: collision with root package name */
    public final q0.a f7078c;
    public TextLayoutResult d;
    public int e = -1;

    public MultiWidgetSelectionDelegate(long j2, q0.a aVar, q0.a aVar2) {
        this.f7076a = j2;
        this.f7077b = aVar;
        this.f7078c = aVar2;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public final AnnotatedString a() {
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.f7078c.invoke();
        return textLayoutResult == null ? new AnnotatedString("", null, 6) : textLayoutResult.f17046a.f17038a;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public final float b(int i2) {
        int f2;
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.f7078c.invoke();
        if (textLayoutResult != null && (f2 = textLayoutResult.f(i2)) < textLayoutResult.f17047b.f16914f) {
            return textLayoutResult.h(f2);
        }
        return -1.0f;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public final float c(int i2) {
        int f2;
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.f7078c.invoke();
        if (textLayoutResult != null && (f2 = textLayoutResult.f(i2)) < textLayoutResult.f17047b.f16914f) {
            return textLayoutResult.g(f2);
        }
        return -1.0f;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public final Rect d(int i2) {
        int length;
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.f7078c.invoke();
        Rect rect = Rect.e;
        return (textLayoutResult != null && (length = textLayoutResult.f17046a.f17038a.f16880a.length()) >= 1) ? textLayoutResult.b(p0.a.A(i2, 0, length - 1)) : rect;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public final LayoutCoordinates e() {
        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) this.f7077b.invoke();
        if (layoutCoordinates == null || !layoutCoordinates.B()) {
            return null;
        }
        return layoutCoordinates;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public final long f(Selection selection, boolean z2) {
        TextLayoutResult textLayoutResult;
        Selection.AnchorInfo anchorInfo = selection.f7083a;
        long j2 = this.f7076a;
        if (!z2 || anchorInfo.f7088c == j2) {
            Selection.AnchorInfo anchorInfo2 = selection.f7084b;
            if ((!z2 && anchorInfo2.f7088c != j2) || e() == null || (textLayoutResult = (TextLayoutResult) this.f7078c.invoke()) == null) {
                return 9205357640488583168L;
            }
            return TextSelectionDelegateKt.a(textLayoutResult, p0.a.A(z2 ? anchorInfo.f7087b : anchorInfo2.f7087b, 0, m(textLayoutResult)), z2, selection.f7085c);
        }
        return 9205357640488583168L;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public final int g() {
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.f7078c.invoke();
        if (textLayoutResult == null) {
            return 0;
        }
        return m(textLayoutResult);
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public final float h(int i2) {
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.f7078c.invoke();
        if (textLayoutResult == null) {
            return -1.0f;
        }
        int f2 = textLayoutResult.f(i2);
        MultiParagraph multiParagraph = textLayoutResult.f17047b;
        if (f2 >= multiParagraph.f16914f) {
            return -1.0f;
        }
        float d = multiParagraph.d(f2);
        return ((multiParagraph.b(f2) - d) / 2) + d;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public final long i() {
        return this.f7076a;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public final Selection j() {
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.f7078c.invoke();
        if (textLayoutResult == null) {
            return null;
        }
        int length = textLayoutResult.f17046a.f17038a.f16880a.length();
        ResolvedTextDirection a2 = textLayoutResult.a(0);
        long j2 = this.f7076a;
        return new Selection(new Selection.AnchorInfo(a2, 0, j2), new Selection.AnchorInfo(textLayoutResult.a(Math.max(length - 1, 0)), length, j2), false);
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public final void k(SelectionLayoutBuilder selectionLayoutBuilder) {
        TextLayoutResult textLayoutResult;
        boolean z2;
        Selection selection;
        Direction direction;
        Direction a2;
        Direction direction2;
        Direction direction3;
        Direction direction4;
        Direction direction5;
        Direction direction6;
        Direction direction7;
        int i2;
        Selection.AnchorInfo anchorInfo;
        Selection.AnchorInfo anchorInfo2;
        LayoutCoordinates e = e();
        if (e == null || (textLayoutResult = (TextLayoutResult) this.f7078c.invoke()) == null) {
            return;
        }
        long v2 = selectionLayoutBuilder.f7190c.v(e, 0L);
        long j2 = Offset.j(selectionLayoutBuilder.f7188a, v2);
        long j3 = selectionLayoutBuilder.f7189b;
        long j4 = OffsetKt.d(j3) ? 9205357640488583168L : Offset.j(j3, v2);
        long j5 = this.f7076a;
        long j6 = textLayoutResult.f17048c;
        float f2 = (int) (j6 >> 32);
        float f3 = (int) (j6 & 4294967295L);
        float g2 = Offset.g(j2);
        Direction direction8 = Direction.f7058c;
        Direction direction9 = Direction.f7056a;
        Direction direction10 = Direction.f7057b;
        Direction direction11 = g2 < 0.0f ? direction9 : Offset.g(j2) > f2 ? direction8 : direction10;
        if (Offset.h(j2) >= 0.0f) {
            direction9 = Offset.h(j2) > f3 ? direction8 : direction10;
        }
        boolean z3 = selectionLayoutBuilder.d;
        Selection selection2 = selectionLayoutBuilder.e;
        if (z3) {
            Direction direction12 = direction11;
            z2 = z3;
            selection = selection2;
            a2 = MultiWidgetSelectionDelegateKt.a(direction11, direction9, selectionLayoutBuilder, j5, selection2 != null ? selection2.f7084b : null);
            direction6 = a2;
            direction5 = direction6;
            direction2 = direction12;
            direction4 = direction2;
            direction = direction9;
            direction3 = direction;
        } else {
            Direction direction13 = direction11;
            z2 = z3;
            selection = selection2;
            direction = direction9;
            a2 = MultiWidgetSelectionDelegateKt.a(direction13, direction, selectionLayoutBuilder, j5, selection != null ? selection.f7083a : null);
            direction2 = a2;
            direction3 = direction2;
            direction4 = direction13;
            direction5 = direction4;
            direction6 = direction;
        }
        Direction c2 = SelectionLayoutKt.c(direction4, direction);
        if (c2 == direction10 || c2 != a2) {
            int length = textLayoutResult.f17046a.f17038a.f16880a.length();
            Comparator comparator = selectionLayoutBuilder.f7191f;
            if (z2) {
                int b2 = MultiWidgetSelectionDelegateKt.b(j2, textLayoutResult);
                if (selection == null || (anchorInfo2 = selection.f7084b) == null) {
                    direction7 = direction6;
                    length = b2;
                } else {
                    direction7 = direction6;
                    int compare = comparator.compare(Long.valueOf(anchorInfo2.f7088c), Long.valueOf(j5));
                    if (compare < 0) {
                        length = 0;
                    } else if (compare <= 0) {
                        length = anchorInfo2.f7087b;
                    }
                }
                i2 = b2;
            } else {
                direction7 = direction6;
                int b3 = MultiWidgetSelectionDelegateKt.b(j2, textLayoutResult);
                if (selection == null || (anchorInfo = selection.f7083a) == null) {
                    length = b3;
                } else {
                    int compare2 = comparator.compare(Long.valueOf(anchorInfo.f7088c), Long.valueOf(j5));
                    if (compare2 < 0) {
                        length = 0;
                    } else if (compare2 <= 0) {
                        length = anchorInfo.f7087b;
                    }
                }
                i2 = length;
                length = b3;
            }
            int b4 = OffsetKt.d(j4) ? -1 : MultiWidgetSelectionDelegateKt.b(j4, textLayoutResult);
            int i3 = selectionLayoutBuilder.f7196k + 2;
            selectionLayoutBuilder.f7196k = i3;
            SelectableInfo selectableInfo = new SelectableInfo(j5, i3, i2, length, b4, textLayoutResult);
            selectionLayoutBuilder.f7194i = selectionLayoutBuilder.a(selectionLayoutBuilder.f7194i, direction2, direction3);
            selectionLayoutBuilder.f7195j = selectionLayoutBuilder.a(selectionLayoutBuilder.f7195j, direction5, direction7);
            ArrayList arrayList = selectionLayoutBuilder.f7193h;
            selectionLayoutBuilder.f7192g.d(arrayList.size(), j5);
            arrayList.add(selectableInfo);
        }
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public final long l(int i2) {
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.f7078c.invoke();
        if (textLayoutResult == null) {
            int i3 = TextRange.f17057c;
            return TextRange.f17056b;
        }
        int m2 = m(textLayoutResult);
        if (m2 < 1) {
            int i4 = TextRange.f17057c;
            return TextRange.f17056b;
        }
        int f2 = textLayoutResult.f(p0.a.A(i2, 0, m2 - 1));
        return TextRangeKt.a(textLayoutResult.i(f2), textLayoutResult.e(f2, true));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized int m(androidx.compose.ui.text.TextLayoutResult r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            androidx.compose.ui.text.TextLayoutResult r0 = r8.d     // Catch: java.lang.Throwable -> L5d
            if (r0 == r9) goto L5f
            androidx.compose.ui.text.MultiParagraph r0 = r9.f17047b     // Catch: java.lang.Throwable -> L5d
            boolean r1 = r0.f16913c     // Catch: java.lang.Throwable -> L5d
            r2 = 1
            r3 = 0
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r1 != 0) goto L20
            long r6 = r9.f17048c     // Catch: java.lang.Throwable -> L5d
            long r6 = r6 & r4
            int r6 = (int) r6     // Catch: java.lang.Throwable -> L5d
            float r6 = (float) r6     // Catch: java.lang.Throwable -> L5d
            float r7 = r0.e     // Catch: java.lang.Throwable -> L5d
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L1e
            goto L20
        L1e:
            r6 = r3
            goto L21
        L20:
            r6 = r2
        L21:
            if (r6 == 0) goto L50
            if (r1 == 0) goto L26
            goto L50
        L26:
            long r6 = r9.f17048c     // Catch: java.lang.Throwable -> L5d
            long r6 = r6 & r4
            int r1 = (int) r6     // Catch: java.lang.Throwable -> L5d
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L5d
            int r0 = r0.c(r1)     // Catch: java.lang.Throwable -> L5d
            androidx.compose.ui.text.MultiParagraph r1 = r9.f17047b     // Catch: java.lang.Throwable -> L5d
            int r1 = r1.f16914f     // Catch: java.lang.Throwable -> L5d
            int r1 = r1 - r2
            if (r0 <= r1) goto L37
            r0 = r1
        L37:
            if (r0 < 0) goto L4b
            androidx.compose.ui.text.MultiParagraph r1 = r9.f17047b     // Catch: java.lang.Throwable -> L5d
            float r1 = r1.d(r0)     // Catch: java.lang.Throwable -> L5d
            long r6 = r9.f17048c     // Catch: java.lang.Throwable -> L5d
            long r6 = r6 & r4
            int r6 = (int) r6     // Catch: java.lang.Throwable -> L5d
            float r6 = (float) r6     // Catch: java.lang.Throwable -> L5d
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 < 0) goto L4b
            int r0 = r0 + (-1)
            goto L37
        L4b:
            if (r0 >= 0) goto L4e
            goto L54
        L4e:
            r3 = r0
            goto L54
        L50:
            int r0 = r0.f16914f     // Catch: java.lang.Throwable -> L5d
            int r3 = r0 + (-1)
        L54:
            int r0 = r9.e(r3, r2)     // Catch: java.lang.Throwable -> L5d
            r8.e = r0     // Catch: java.lang.Throwable -> L5d
            r8.d = r9     // Catch: java.lang.Throwable -> L5d
            goto L5f
        L5d:
            r9 = move-exception
            goto L63
        L5f:
            int r9 = r8.e     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r8)
            return r9
        L63:
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.MultiWidgetSelectionDelegate.m(androidx.compose.ui.text.TextLayoutResult):int");
    }
}

package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextDelegate;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.UndoManager;
import androidx.compose.foundation.text.ValidatingOffsetMappingKt;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.PasswordVisualTransformation;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextFieldValueKt;
import androidx.compose.ui.text.input.VisualTransformation;
import q0.l;

@StabilityInferred
/* loaded from: classes3.dex */
public final class TextFieldSelectionManager {

    /* renamed from: a, reason: collision with root package name */
    public final UndoManager f7300a;

    /* renamed from: b, reason: collision with root package name */
    public OffsetMapping f7301b = ValidatingOffsetMappingKt.f6254a;

    /* renamed from: c, reason: collision with root package name */
    public l f7302c = TextFieldSelectionManager$onValueChange$1.f7324a;
    public LegacyTextFieldState d;
    public final ParcelableSnapshotMutableState e;

    /* renamed from: f, reason: collision with root package name */
    public VisualTransformation f7303f;

    /* renamed from: g, reason: collision with root package name */
    public ClipboardManager f7304g;

    /* renamed from: h, reason: collision with root package name */
    public TextToolbar f7305h;

    /* renamed from: i, reason: collision with root package name */
    public HapticFeedback f7306i;

    /* renamed from: j, reason: collision with root package name */
    public FocusRequester f7307j;

    /* renamed from: k, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f7308k;

    /* renamed from: l, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f7309l;

    /* renamed from: m, reason: collision with root package name */
    public long f7310m;

    /* renamed from: n, reason: collision with root package name */
    public Integer f7311n;

    /* renamed from: o, reason: collision with root package name */
    public long f7312o;

    /* renamed from: p, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f7313p;

    /* renamed from: q, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f7314q;

    /* renamed from: r, reason: collision with root package name */
    public int f7315r;

    /* renamed from: s, reason: collision with root package name */
    public TextFieldValue f7316s;

    /* renamed from: t, reason: collision with root package name */
    public SelectionLayout f7317t;

    /* renamed from: u, reason: collision with root package name */
    public final TextFieldSelectionManager$touchSelectionObserver$1 f7318u;

    /* renamed from: v, reason: collision with root package name */
    public final TextFieldSelectionManager$mouseSelectionObserver$1 f7319v;

    /* JADX WARN: Type inference failed for: r6v12, types: [androidx.compose.foundation.text.selection.TextFieldSelectionManager$touchSelectionObserver$1] */
    /* JADX WARN: Type inference failed for: r6v13, types: [androidx.compose.foundation.text.selection.TextFieldSelectionManager$mouseSelectionObserver$1] */
    public TextFieldSelectionManager(UndoManager undoManager) {
        ParcelableSnapshotMutableState f2;
        ParcelableSnapshotMutableState f3;
        ParcelableSnapshotMutableState f4;
        ParcelableSnapshotMutableState f5;
        ParcelableSnapshotMutableState f6;
        this.f7300a = undoManager;
        f2 = SnapshotStateKt.f(new TextFieldValue((String) null, 0L, 7), StructuralEqualityPolicy.f14078a);
        this.e = f2;
        this.f7303f = VisualTransformation.Companion.f17394a;
        Boolean bool = Boolean.TRUE;
        f3 = SnapshotStateKt.f(bool, StructuralEqualityPolicy.f14078a);
        this.f7308k = f3;
        f4 = SnapshotStateKt.f(bool, StructuralEqualityPolicy.f14078a);
        this.f7309l = f4;
        this.f7310m = 0L;
        this.f7312o = 0L;
        f5 = SnapshotStateKt.f(null, StructuralEqualityPolicy.f14078a);
        this.f7313p = f5;
        f6 = SnapshotStateKt.f(null, StructuralEqualityPolicy.f14078a);
        this.f7314q = f6;
        this.f7315r = -1;
        this.f7316s = new TextFieldValue((String) null, 0L, 7);
        this.f7318u = new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$touchSelectionObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void a() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void b(long j2) {
                TextLayoutResultProxy d;
                TextLayoutResultProxy d2;
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                if (textFieldSelectionManager.j()) {
                    ParcelableSnapshotMutableState parcelableSnapshotMutableState = textFieldSelectionManager.f7313p;
                    if (((Handle) parcelableSnapshotMutableState.getValue()) != null) {
                        return;
                    }
                    parcelableSnapshotMutableState.setValue(Handle.f5966c);
                    textFieldSelectionManager.f7315r = -1;
                    textFieldSelectionManager.m();
                    LegacyTextFieldState legacyTextFieldState = textFieldSelectionManager.d;
                    if (legacyTextFieldState == null || (d2 = legacyTextFieldState.d()) == null || !d2.c(j2)) {
                        LegacyTextFieldState legacyTextFieldState2 = textFieldSelectionManager.d;
                        if (legacyTextFieldState2 != null && (d = legacyTextFieldState2.d()) != null) {
                            int a2 = textFieldSelectionManager.f7301b.a(d.b(j2, true));
                            TextFieldValue e = TextFieldSelectionManager.e(textFieldSelectionManager.l().f17361a, TextRangeKt.a(a2, a2));
                            textFieldSelectionManager.h(false);
                            HapticFeedback hapticFeedback = textFieldSelectionManager.f7306i;
                            if (hapticFeedback != null) {
                                hapticFeedback.a();
                            }
                            textFieldSelectionManager.f7302c.invoke(e);
                        }
                    } else {
                        if (textFieldSelectionManager.l().f17361a.f16880a.length() == 0) {
                            return;
                        }
                        textFieldSelectionManager.h(false);
                        textFieldSelectionManager.f7311n = Integer.valueOf((int) (TextFieldSelectionManager.c(textFieldSelectionManager, TextFieldValue.a(textFieldSelectionManager.l(), null, TextRange.f17056b, 5), j2, true, false, SelectionAdjustment.Companion.f7091c, true) >> 32));
                    }
                    textFieldSelectionManager.r(HandleState.f5967a);
                    textFieldSelectionManager.f7310m = j2;
                    textFieldSelectionManager.f7314q.setValue(new Offset(j2));
                    textFieldSelectionManager.f7312o = 0L;
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void c() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void d(long j2) {
                TextLayoutResultProxy d;
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                if (!textFieldSelectionManager.j() || textFieldSelectionManager.l().f17361a.f16880a.length() == 0) {
                    return;
                }
                textFieldSelectionManager.f7312o = Offset.k(textFieldSelectionManager.f7312o, j2);
                LegacyTextFieldState legacyTextFieldState = textFieldSelectionManager.d;
                if (legacyTextFieldState != null && (d = legacyTextFieldState.d()) != null) {
                    textFieldSelectionManager.f7314q.setValue(new Offset(Offset.k(textFieldSelectionManager.f7310m, textFieldSelectionManager.f7312o)));
                    Integer num = textFieldSelectionManager.f7311n;
                    a aVar = SelectionAdjustment.Companion.f7091c;
                    if (num == null) {
                        Offset i2 = textFieldSelectionManager.i();
                        p0.a.p(i2);
                        if (!d.c(i2.f14913a)) {
                            int a2 = textFieldSelectionManager.f7301b.a(d.b(textFieldSelectionManager.f7310m, true));
                            OffsetMapping offsetMapping = textFieldSelectionManager.f7301b;
                            Offset i3 = textFieldSelectionManager.i();
                            p0.a.p(i3);
                            if (a2 == offsetMapping.a(d.b(i3.f14913a, true))) {
                                aVar = SelectionAdjustment.Companion.f7089a;
                            }
                            TextFieldValue l2 = textFieldSelectionManager.l();
                            Offset i4 = textFieldSelectionManager.i();
                            p0.a.p(i4);
                            TextFieldSelectionManager.c(textFieldSelectionManager, l2, i4.f14913a, false, false, aVar, true);
                            int i5 = TextRange.f17057c;
                        }
                    }
                    Integer num2 = textFieldSelectionManager.f7311n;
                    int intValue = num2 != null ? num2.intValue() : d.b(textFieldSelectionManager.f7310m, false);
                    Offset i6 = textFieldSelectionManager.i();
                    p0.a.p(i6);
                    int b2 = d.b(i6.f14913a, false);
                    if (textFieldSelectionManager.f7311n == null && intValue == b2) {
                        return;
                    }
                    TextFieldValue l3 = textFieldSelectionManager.l();
                    Offset i7 = textFieldSelectionManager.i();
                    p0.a.p(i7);
                    TextFieldSelectionManager.c(textFieldSelectionManager, l3, i7.f14913a, false, false, aVar, true);
                    int i52 = TextRange.f17057c;
                }
                textFieldSelectionManager.t(false);
            }

            public final void e() {
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                TextFieldSelectionManager.b(textFieldSelectionManager, null);
                textFieldSelectionManager.f7314q.setValue(null);
                textFieldSelectionManager.t(true);
                textFieldSelectionManager.f7311n = null;
                boolean c2 = TextRange.c(textFieldSelectionManager.l().f17362b);
                textFieldSelectionManager.r(c2 ? HandleState.f5969c : HandleState.f5968b);
                LegacyTextFieldState legacyTextFieldState = textFieldSelectionManager.d;
                if (legacyTextFieldState != null) {
                    legacyTextFieldState.f6031m.setValue(Boolean.valueOf(!c2 && TextFieldSelectionManagerKt.b(textFieldSelectionManager, true)));
                }
                LegacyTextFieldState legacyTextFieldState2 = textFieldSelectionManager.d;
                if (legacyTextFieldState2 != null) {
                    legacyTextFieldState2.f6032n.setValue(Boolean.valueOf(!c2 && TextFieldSelectionManagerKt.b(textFieldSelectionManager, false)));
                }
                LegacyTextFieldState legacyTextFieldState3 = textFieldSelectionManager.d;
                if (legacyTextFieldState3 == null) {
                    return;
                }
                legacyTextFieldState3.f6033o.setValue(Boolean.valueOf(c2 && TextFieldSelectionManagerKt.b(textFieldSelectionManager, true)));
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void onCancel() {
                e();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void onStop() {
                e();
            }
        };
        this.f7319v = new MouseSelectionObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$mouseSelectionObserver$1
            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public final boolean a(long j2, a aVar) {
                LegacyTextFieldState legacyTextFieldState;
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                if (!textFieldSelectionManager.j() || textFieldSelectionManager.l().f17361a.f16880a.length() == 0 || (legacyTextFieldState = textFieldSelectionManager.d) == null || legacyTextFieldState.d() == null) {
                    return false;
                }
                FocusRequester focusRequester = textFieldSelectionManager.f7307j;
                if (focusRequester != null) {
                    focusRequester.b();
                }
                textFieldSelectionManager.f7310m = j2;
                textFieldSelectionManager.f7315r = -1;
                textFieldSelectionManager.h(true);
                d(textFieldSelectionManager.l(), textFieldSelectionManager.f7310m, true, aVar);
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public final void b() {
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public final boolean c(long j2, SelectionAdjustment selectionAdjustment) {
                LegacyTextFieldState legacyTextFieldState;
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                if (!textFieldSelectionManager.j() || textFieldSelectionManager.l().f17361a.f16880a.length() == 0 || (legacyTextFieldState = textFieldSelectionManager.d) == null || legacyTextFieldState.d() == null) {
                    return false;
                }
                d(textFieldSelectionManager.l(), j2, false, selectionAdjustment);
                return true;
            }

            public final void d(TextFieldValue textFieldValue, long j2, boolean z2, SelectionAdjustment selectionAdjustment) {
                TextFieldSelectionManager.this.r(TextRange.c(TextFieldSelectionManager.c(TextFieldSelectionManager.this, textFieldValue, j2, z2, false, selectionAdjustment, false)) ? HandleState.f5969c : HandleState.f5968b);
            }
        };
    }

    public static final void a(TextFieldSelectionManager textFieldSelectionManager, Offset offset) {
        textFieldSelectionManager.f7314q.setValue(offset);
    }

    public static final void b(TextFieldSelectionManager textFieldSelectionManager, Handle handle) {
        textFieldSelectionManager.f7313p.setValue(handle);
    }

    public static final long c(TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, long j2, boolean z2, boolean z3, SelectionAdjustment selectionAdjustment, boolean z4) {
        TextLayoutResultProxy d;
        boolean z5;
        boolean z6;
        HapticFeedback hapticFeedback;
        int i2;
        LegacyTextFieldState legacyTextFieldState = textFieldSelectionManager.d;
        if (legacyTextFieldState == null || (d = legacyTextFieldState.d()) == null) {
            return TextRange.f17056b;
        }
        OffsetMapping offsetMapping = textFieldSelectionManager.f7301b;
        long j3 = textFieldValue.f17362b;
        int i3 = TextRange.f17057c;
        int b2 = offsetMapping.b((int) (j3 >> 32));
        OffsetMapping offsetMapping2 = textFieldSelectionManager.f7301b;
        long j4 = textFieldValue.f17362b;
        long a2 = TextRangeKt.a(b2, offsetMapping2.b((int) (j4 & 4294967295L)));
        int b3 = d.b(j2, false);
        int i4 = (z3 || z2) ? b3 : (int) (a2 >> 32);
        int i5 = (!z3 || z2) ? b3 : (int) (a2 & 4294967295L);
        SelectionLayout selectionLayout = textFieldSelectionManager.f7317t;
        int i6 = -1;
        if (!z2 && selectionLayout != null && (i2 = textFieldSelectionManager.f7315r) != -1) {
            i6 = i2;
        }
        SelectionLayout b4 = SelectionLayoutKt.b(d.f6210a, i4, i5, i6, a2, z2, z3);
        if (!((SingleSelectionLayout) b4).h(selectionLayout)) {
            return j4;
        }
        textFieldSelectionManager.f7317t = b4;
        textFieldSelectionManager.f7315r = b3;
        Selection a3 = selectionAdjustment.a(b4);
        long a4 = TextRangeKt.a(textFieldSelectionManager.f7301b.a(a3.f7083a.f7087b), textFieldSelectionManager.f7301b.a(a3.f7084b.f7087b));
        if (TextRange.b(a4, j4)) {
            return j4;
        }
        boolean z7 = TextRange.g(a4) != TextRange.g(j4) && TextRange.b(TextRangeKt.a((int) (a4 & 4294967295L), (int) (a4 >> 32)), j4);
        boolean z8 = TextRange.c(a4) && TextRange.c(j4);
        AnnotatedString annotatedString = textFieldValue.f17361a;
        if (z4 && annotatedString.f16880a.length() > 0 && !z7 && !z8 && (hapticFeedback = textFieldSelectionManager.f7306i) != null) {
            hapticFeedback.a();
        }
        textFieldSelectionManager.f7302c.invoke(e(annotatedString, a4));
        if (!z4) {
            textFieldSelectionManager.t(!TextRange.c(a4));
        }
        LegacyTextFieldState legacyTextFieldState2 = textFieldSelectionManager.d;
        if (legacyTextFieldState2 != null) {
            legacyTextFieldState2.f6035q.setValue(Boolean.valueOf(z4));
        }
        LegacyTextFieldState legacyTextFieldState3 = textFieldSelectionManager.d;
        if (legacyTextFieldState3 != null) {
            legacyTextFieldState3.f6031m.setValue(Boolean.valueOf(!TextRange.c(a4) && TextFieldSelectionManagerKt.b(textFieldSelectionManager, true)));
        }
        LegacyTextFieldState legacyTextFieldState4 = textFieldSelectionManager.d;
        if (legacyTextFieldState4 == null) {
            z5 = false;
        } else {
            if (TextRange.c(a4)) {
                z5 = false;
            } else {
                z5 = false;
                if (TextFieldSelectionManagerKt.b(textFieldSelectionManager, false)) {
                    z6 = true;
                    legacyTextFieldState4.f6032n.setValue(Boolean.valueOf(z6));
                }
            }
            z6 = z5;
            legacyTextFieldState4.f6032n.setValue(Boolean.valueOf(z6));
        }
        LegacyTextFieldState legacyTextFieldState5 = textFieldSelectionManager.d;
        if (legacyTextFieldState5 != null) {
            legacyTextFieldState5.f6033o.setValue(Boolean.valueOf((TextRange.c(a4) && TextFieldSelectionManagerKt.b(textFieldSelectionManager, true)) ? true : z5));
        }
        return a4;
    }

    public static TextFieldValue e(AnnotatedString annotatedString, long j2) {
        return new TextFieldValue(annotatedString, j2, (TextRange) null);
    }

    public final void d(boolean z2) {
        if (TextRange.c(l().f17362b)) {
            return;
        }
        ClipboardManager clipboardManager = this.f7304g;
        if (clipboardManager != null) {
            clipboardManager.d(TextFieldValueKt.a(l()));
        }
        if (z2) {
            int e = TextRange.e(l().f17362b);
            this.f7302c.invoke(e(l().f17361a, TextRangeKt.a(e, e)));
            r(HandleState.f5967a);
        }
    }

    public final void f() {
        if (TextRange.c(l().f17362b)) {
            return;
        }
        ClipboardManager clipboardManager = this.f7304g;
        if (clipboardManager != null) {
            clipboardManager.d(TextFieldValueKt.a(l()));
        }
        AnnotatedString c2 = TextFieldValueKt.c(l(), l().f17361a.f16880a.length());
        AnnotatedString b2 = TextFieldValueKt.b(l(), l().f17361a.f16880a.length());
        AnnotatedString.Builder builder = new AnnotatedString.Builder(c2);
        builder.b(b2);
        AnnotatedString f2 = builder.f();
        int f3 = TextRange.f(l().f17362b);
        this.f7302c.invoke(e(f2, TextRangeKt.a(f3, f3)));
        r(HandleState.f5967a);
        UndoManager undoManager = this.f7300a;
        if (undoManager != null) {
            undoManager.f6248f = true;
        }
    }

    public final void g(Offset offset) {
        if (!TextRange.c(l().f17362b)) {
            LegacyTextFieldState legacyTextFieldState = this.d;
            TextLayoutResultProxy d = legacyTextFieldState != null ? legacyTextFieldState.d() : null;
            int e = (offset == null || d == null) ? TextRange.e(l().f17362b) : this.f7301b.a(d.b(offset.f14913a, true));
            this.f7302c.invoke(TextFieldValue.a(l(), null, TextRangeKt.a(e, e), 5));
        }
        r((offset == null || l().f17361a.f16880a.length() <= 0) ? HandleState.f5967a : HandleState.f5969c);
        t(false);
    }

    public final void h(boolean z2) {
        FocusRequester focusRequester;
        LegacyTextFieldState legacyTextFieldState = this.d;
        if (legacyTextFieldState != null && !legacyTextFieldState.b() && (focusRequester = this.f7307j) != null) {
            focusRequester.b();
        }
        this.f7316s = l();
        t(z2);
        r(HandleState.f5968b);
    }

    public final Offset i() {
        return (Offset) this.f7314q.getValue();
    }

    public final boolean j() {
        return ((Boolean) this.f7309l.getValue()).booleanValue();
    }

    public final long k(boolean z2) {
        TextLayoutResultProxy d;
        TextLayoutResult textLayoutResult;
        long j2;
        TextDelegate textDelegate;
        LegacyTextFieldState legacyTextFieldState = this.d;
        if (legacyTextFieldState == null || (d = legacyTextFieldState.d()) == null || (textLayoutResult = d.f6210a) == null) {
            return 9205357640488583168L;
        }
        LegacyTextFieldState legacyTextFieldState2 = this.d;
        AnnotatedString annotatedString = (legacyTextFieldState2 == null || (textDelegate = legacyTextFieldState2.f6021a) == null) ? null : textDelegate.f6107a;
        if (annotatedString == null) {
            return 9205357640488583168L;
        }
        if (!p0.a.g(annotatedString.f16880a, textLayoutResult.f17046a.f17038a.f16880a)) {
            return 9205357640488583168L;
        }
        TextFieldValue l2 = l();
        if (z2) {
            long j3 = l2.f17362b;
            int i2 = TextRange.f17057c;
            j2 = j3 >> 32;
        } else {
            long j4 = l2.f17362b;
            int i3 = TextRange.f17057c;
            j2 = j4 & 4294967295L;
        }
        return TextSelectionDelegateKt.a(textLayoutResult, this.f7301b.b((int) j2), z2, TextRange.g(l().f17362b));
    }

    public final TextFieldValue l() {
        return (TextFieldValue) this.e.getValue();
    }

    public final void m() {
        TextToolbar textToolbar;
        TextToolbar textToolbar2 = this.f7305h;
        if ((textToolbar2 != null ? textToolbar2.getStatus() : null) != TextToolbarStatus.f16601a || (textToolbar = this.f7305h) == null) {
            return;
        }
        textToolbar.hide();
    }

    public final void n() {
        AnnotatedString a2;
        ClipboardManager clipboardManager = this.f7304g;
        if (clipboardManager == null || (a2 = clipboardManager.a()) == null) {
            return;
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(TextFieldValueKt.c(l(), l().f17361a.f16880a.length()));
        builder.b(a2);
        AnnotatedString f2 = builder.f();
        AnnotatedString b2 = TextFieldValueKt.b(l(), l().f17361a.f16880a.length());
        AnnotatedString.Builder builder2 = new AnnotatedString.Builder(f2);
        builder2.b(b2);
        AnnotatedString f3 = builder2.f();
        int length = a2.f16880a.length() + TextRange.f(l().f17362b);
        this.f7302c.invoke(e(f3, TextRangeKt.a(length, length)));
        r(HandleState.f5967a);
        UndoManager undoManager = this.f7300a;
        if (undoManager != null) {
            undoManager.f6248f = true;
        }
    }

    public final void o() {
        TextFieldValue e = e(l().f17361a, TextRangeKt.a(0, l().f17361a.f16880a.length()));
        this.f7302c.invoke(e);
        this.f7316s = TextFieldValue.a(this.f7316s, null, e.f17362b, 5);
        h(true);
    }

    public final void p(boolean z2) {
        this.f7308k.setValue(Boolean.valueOf(z2));
    }

    public final void q(boolean z2) {
        this.f7309l.setValue(Boolean.valueOf(z2));
    }

    public final void r(HandleState handleState) {
        LegacyTextFieldState legacyTextFieldState = this.d;
        if (legacyTextFieldState != null) {
            if (legacyTextFieldState.a() == handleState) {
                legacyTextFieldState = null;
            }
            if (legacyTextFieldState != null) {
                legacyTextFieldState.f6029k.setValue(handleState);
            }
        }
    }

    public final void s() {
        TextFieldSelectionManager$showSelectionToolbar$cut$1 textFieldSelectionManager$showSelectionToolbar$cut$1;
        TextFieldSelectionManager$showSelectionToolbar$selectAll$1 textFieldSelectionManager$showSelectionToolbar$selectAll$1;
        Rect rect;
        float f2;
        LayoutCoordinates c2;
        TextLayoutResult textLayoutResult;
        LayoutCoordinates c3;
        float f3;
        TextLayoutResult textLayoutResult2;
        LayoutCoordinates c4;
        LayoutCoordinates c5;
        ClipboardManager clipboardManager;
        if (j()) {
            LegacyTextFieldState legacyTextFieldState = this.d;
            if (legacyTextFieldState == null || ((Boolean) legacyTextFieldState.f6035q.getValue()).booleanValue()) {
                boolean z2 = this.f7303f instanceof PasswordVisualTransformation;
                TextFieldSelectionManager$showSelectionToolbar$copy$1 textFieldSelectionManager$showSelectionToolbar$copy$1 = (TextRange.c(l().f17362b) || z2) ? null : new TextFieldSelectionManager$showSelectionToolbar$copy$1(this);
                boolean c6 = TextRange.c(l().f17362b);
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.f7308k;
                TextFieldSelectionManager$showSelectionToolbar$cut$1 textFieldSelectionManager$showSelectionToolbar$cut$12 = (c6 || !((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue() || z2) ? null : new TextFieldSelectionManager$showSelectionToolbar$cut$1(this);
                TextFieldSelectionManager$showSelectionToolbar$paste$1 textFieldSelectionManager$showSelectionToolbar$paste$1 = (((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue() && (clipboardManager = this.f7304g) != null && clipboardManager.c()) ? new TextFieldSelectionManager$showSelectionToolbar$paste$1(this) : null;
                TextFieldSelectionManager$showSelectionToolbar$selectAll$1 textFieldSelectionManager$showSelectionToolbar$selectAll$12 = TextRange.d(l().f17362b) != l().f17361a.f16880a.length() ? new TextFieldSelectionManager$showSelectionToolbar$selectAll$1(this) : null;
                TextToolbar textToolbar = this.f7305h;
                if (textToolbar != null) {
                    LegacyTextFieldState legacyTextFieldState2 = this.d;
                    if (legacyTextFieldState2 != null) {
                        LegacyTextFieldState legacyTextFieldState3 = legacyTextFieldState2.f6034p ^ true ? legacyTextFieldState2 : null;
                        if (legacyTextFieldState3 != null) {
                            int b2 = this.f7301b.b((int) (l().f17362b >> 32));
                            int b3 = this.f7301b.b((int) (l().f17362b & 4294967295L));
                            LegacyTextFieldState legacyTextFieldState4 = this.d;
                            long j2 = 0;
                            long e02 = (legacyTextFieldState4 == null || (c5 = legacyTextFieldState4.c()) == null) ? 0L : c5.e0(k(true));
                            LegacyTextFieldState legacyTextFieldState5 = this.d;
                            if (legacyTextFieldState5 != null && (c4 = legacyTextFieldState5.c()) != null) {
                                j2 = c4.e0(k(false));
                            }
                            LegacyTextFieldState legacyTextFieldState6 = this.d;
                            float f4 = 0.0f;
                            if (legacyTextFieldState6 == null || (c3 = legacyTextFieldState6.c()) == null) {
                                textFieldSelectionManager$showSelectionToolbar$cut$1 = textFieldSelectionManager$showSelectionToolbar$cut$12;
                                textFieldSelectionManager$showSelectionToolbar$selectAll$1 = textFieldSelectionManager$showSelectionToolbar$selectAll$12;
                                f2 = 0.0f;
                            } else {
                                TextLayoutResultProxy d = legacyTextFieldState3.d();
                                if (d == null || (textLayoutResult2 = d.f6210a) == null) {
                                    textFieldSelectionManager$showSelectionToolbar$cut$1 = textFieldSelectionManager$showSelectionToolbar$cut$12;
                                    textFieldSelectionManager$showSelectionToolbar$selectAll$1 = textFieldSelectionManager$showSelectionToolbar$selectAll$12;
                                    f3 = 0.0f;
                                } else {
                                    f3 = textLayoutResult2.c(b2).f14915b;
                                    textFieldSelectionManager$showSelectionToolbar$cut$1 = textFieldSelectionManager$showSelectionToolbar$cut$12;
                                    textFieldSelectionManager$showSelectionToolbar$selectAll$1 = textFieldSelectionManager$showSelectionToolbar$selectAll$12;
                                }
                                f2 = Offset.h(c3.e0(OffsetKt.a(0.0f, f3)));
                            }
                            LegacyTextFieldState legacyTextFieldState7 = this.d;
                            if (legacyTextFieldState7 != null && (c2 = legacyTextFieldState7.c()) != null) {
                                TextLayoutResultProxy d2 = legacyTextFieldState3.d();
                                f4 = Offset.h(c2.e0(OffsetKt.a(0.0f, (d2 == null || (textLayoutResult = d2.f6210a) == null) ? 0.0f : textLayoutResult.c(b3).f14915b)));
                            }
                            rect = new Rect(Math.min(Offset.g(e02), Offset.g(j2)), Math.min(f2, f4), Math.max(Offset.g(e02), Offset.g(j2)), (legacyTextFieldState3.f6021a.f6111g.getDensity() * 25) + Math.max(Offset.h(e02), Offset.h(j2)));
                            textToolbar.a(rect, textFieldSelectionManager$showSelectionToolbar$copy$1, textFieldSelectionManager$showSelectionToolbar$paste$1, textFieldSelectionManager$showSelectionToolbar$cut$1, textFieldSelectionManager$showSelectionToolbar$selectAll$1);
                        }
                    }
                    textFieldSelectionManager$showSelectionToolbar$cut$1 = textFieldSelectionManager$showSelectionToolbar$cut$12;
                    textFieldSelectionManager$showSelectionToolbar$selectAll$1 = textFieldSelectionManager$showSelectionToolbar$selectAll$12;
                    rect = Rect.e;
                    textToolbar.a(rect, textFieldSelectionManager$showSelectionToolbar$copy$1, textFieldSelectionManager$showSelectionToolbar$paste$1, textFieldSelectionManager$showSelectionToolbar$cut$1, textFieldSelectionManager$showSelectionToolbar$selectAll$1);
                }
            }
        }
    }

    public final void t(boolean z2) {
        LegacyTextFieldState legacyTextFieldState = this.d;
        if (legacyTextFieldState != null) {
            legacyTextFieldState.f6030l.setValue(Boolean.valueOf(z2));
        }
        if (z2) {
            s();
        } else {
            m();
        }
    }
}

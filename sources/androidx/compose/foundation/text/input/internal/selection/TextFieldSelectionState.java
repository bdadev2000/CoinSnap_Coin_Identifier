package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.foundation.content.TransferableContent_androidKt;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextFieldCursorKt;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.EditingBuffer;
import androidx.compose.foundation.text.input.internal.IndexTransformationType;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TextLayoutStateKt;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionGesturesKt;
import androidx.compose.foundation.text.selection.SelectionLayout;
import androidx.compose.foundation.text.selection.SelectionLayoutKt;
import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.foundation.text.selection.TextSelectionDelegateKt;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import d0.b0;
import h0.g;
import kotlin.jvm.internal.e0;
import q0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class TextFieldSelectionState {

    /* renamed from: a, reason: collision with root package name */
    public final TransformedTextFieldState f6714a;

    /* renamed from: b, reason: collision with root package name */
    public final TextLayoutState f6715b;

    /* renamed from: c, reason: collision with root package name */
    public Density f6716c;
    public boolean d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6717f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6718g;

    /* renamed from: h, reason: collision with root package name */
    public HapticFeedback f6719h;

    /* renamed from: i, reason: collision with root package name */
    public TextToolbar f6720i;

    /* renamed from: j, reason: collision with root package name */
    public ClipboardManager f6721j;

    /* renamed from: k, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f6722k;

    /* renamed from: l, reason: collision with root package name */
    public a f6723l;

    /* renamed from: m, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f6724m;

    /* renamed from: n, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f6725n;

    /* renamed from: o, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f6726o;

    /* renamed from: p, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f6727p;

    /* renamed from: q, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f6728q;

    /* renamed from: r, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f6729r;

    /* renamed from: s, reason: collision with root package name */
    public SelectionLayout f6730s;

    /* renamed from: t, reason: collision with root package name */
    public int f6731t;

    /* renamed from: u, reason: collision with root package name */
    public PressInteraction.Press f6732u;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static final class InputType {

        /* renamed from: a, reason: collision with root package name */
        public static final InputType f6745a;

        /* renamed from: b, reason: collision with root package name */
        public static final InputType f6746b;

        /* renamed from: c, reason: collision with root package name */
        public static final InputType f6747c;
        public static final /* synthetic */ InputType[] d;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$InputType] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$InputType] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$InputType] */
        static {
            ?? r02 = new Enum("None", 0);
            f6745a = r02;
            ?? r1 = new Enum("Touch", 1);
            f6746b = r1;
            ?? r2 = new Enum("Mouse", 2);
            f6747c = r2;
            d = new InputType[]{r02, r1, r2};
        }

        public static InputType valueOf(String str) {
            return (InputType) Enum.valueOf(InputType.class, str);
        }

        public static InputType[] values() {
            return (InputType[]) d.clone();
        }
    }

    /* loaded from: classes2.dex */
    public final class TextFieldMouseSelectionObserver implements MouseSelectionObserver {

        /* renamed from: a, reason: collision with root package name */
        public final a f6748a;

        /* renamed from: b, reason: collision with root package name */
        public int f6749b = -1;

        /* renamed from: c, reason: collision with root package name */
        public long f6750c = 9205357640488583168L;

        public TextFieldMouseSelectionObserver(a aVar) {
            this.f6748a = aVar;
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        public final boolean a(long j2, androidx.compose.foundation.text.selection.a aVar) {
            TextFieldSelectionState textFieldSelectionState = TextFieldSelectionState.this;
            if (!textFieldSelectionState.d || textFieldSelectionState.f6714a.d().f6297a.length() == 0) {
                return false;
            }
            textFieldSelectionState.f6727p.setValue(InputType.f6747c);
            this.f6748a.invoke();
            textFieldSelectionState.f6731t = -1;
            this.f6749b = -1;
            this.f6750c = j2;
            this.f6749b = (int) (d(j2, aVar, true) >> 32);
            return true;
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        public final void b() {
            TextFieldSelectionState.this.f6727p.setValue(InputType.f6745a);
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        public final boolean c(long j2, SelectionAdjustment selectionAdjustment) {
            TextFieldSelectionState textFieldSelectionState = TextFieldSelectionState.this;
            if (!textFieldSelectionState.d || textFieldSelectionState.f6714a.d().f6297a.length() == 0) {
                return false;
            }
            d(j2, selectionAdjustment, false);
            return true;
        }

        public final long d(long j2, SelectionAdjustment selectionAdjustment, boolean z2) {
            Integer valueOf = Integer.valueOf(this.f6749b);
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            TextFieldSelectionState textFieldSelectionState = TextFieldSelectionState.this;
            long D = textFieldSelectionState.D(textFieldSelectionState.f6714a.d(), valueOf != null ? valueOf.intValue() : textFieldSelectionState.f6715b.c(this.f6750c, false), textFieldSelectionState.f6715b.c(j2, false), false, selectionAdjustment, false, z2);
            if (this.f6749b == -1 && !TextRange.c(D)) {
                this.f6749b = (int) (D >> 32);
            }
            if (TextRange.g(D)) {
                D = TextRangeKt.a((int) (4294967295L & D), (int) (D >> 32));
            }
            textFieldSelectionState.f6714a.j(D);
            textFieldSelectionState.A(TextToolbarState.f6865c);
            return D;
        }
    }

    /* loaded from: classes2.dex */
    public final class TextFieldTextDragObserver implements TextDragObserver {

        /* renamed from: a, reason: collision with root package name */
        public final a f6751a;

        /* renamed from: b, reason: collision with root package name */
        public int f6752b = -1;

        /* renamed from: c, reason: collision with root package name */
        public long f6753c = 9205357640488583168L;
        public long d = 0;
        public Handle e = Handle.f5966c;

        public TextFieldTextDragObserver(a aVar) {
            this.f6751a = aVar;
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        public final void a() {
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        public final void b(long j2) {
            TextFieldSelectionState textFieldSelectionState = TextFieldSelectionState.this;
            if (textFieldSelectionState.d) {
                textFieldSelectionState.C(this.e, j2);
                textFieldSelectionState.z(false);
                textFieldSelectionState.f6727p.setValue(InputType.f6746b);
                this.f6753c = j2;
                this.d = 0L;
                textFieldSelectionState.f6731t = -1;
                TextLayoutState textLayoutState = textFieldSelectionState.f6715b;
                boolean e = textLayoutState.e(j2);
                TransformedTextFieldState transformedTextFieldState = textFieldSelectionState.f6714a;
                if (e) {
                    if (transformedTextFieldState.d().f6297a.length() == 0) {
                        return;
                    }
                    int c2 = textLayoutState.c(j2, true);
                    long D = textFieldSelectionState.D(new TextFieldCharSequence(textFieldSelectionState.f6714a.d(), TextRange.f17056b, (TextRange) null, 12), c2, c2, false, SelectionAdjustment.Companion.f7091c, false, false);
                    transformedTextFieldState.j(D);
                    textFieldSelectionState.A(TextToolbarState.f6865c);
                    this.f6752b = (int) (D >> 32);
                    return;
                }
                int c3 = textLayoutState.c(j2, true);
                HapticFeedback hapticFeedback = textFieldSelectionState.f6719h;
                if (hapticFeedback != null) {
                    hapticFeedback.a();
                }
                transformedTextFieldState.getClass();
                transformedTextFieldState.j(TextRangeKt.a(c3, c3));
                textFieldSelectionState.z(true);
                textFieldSelectionState.A(TextToolbarState.f6864b);
            }
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        public final void c() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x00cb, code lost:
        
            if (((int) (r1 & 4294967295L)) == ((int) (r13 & 4294967295L))) goto L52;
         */
        @Override // androidx.compose.foundation.text.TextDragObserver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void d(long r17) {
            /*
                Method dump skipped, instructions count: 270
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.TextFieldTextDragObserver.d(long):void");
        }

        public final void e() {
            if (OffsetKt.c(this.f6753c)) {
                TextFieldSelectionState textFieldSelectionState = TextFieldSelectionState.this;
                textFieldSelectionState.e();
                this.f6752b = -1;
                this.f6753c = 9205357640488583168L;
                this.d = 0L;
                textFieldSelectionState.f6731t = -1;
                textFieldSelectionState.f6727p.setValue(InputType.f6745a);
                this.f6751a.invoke();
            }
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        public final void onCancel() {
            e();
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        public final void onStop() {
            e();
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[IndexTransformationType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public TextFieldSelectionState(TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, Density density, boolean z2, boolean z3, boolean z4, boolean z5) {
        ParcelableSnapshotMutableState f2;
        ParcelableSnapshotMutableState f3;
        ParcelableSnapshotMutableState f4;
        ParcelableSnapshotMutableState f5;
        ParcelableSnapshotMutableState f6;
        ParcelableSnapshotMutableState f7;
        ParcelableSnapshotMutableState f8;
        this.f6714a = transformedTextFieldState;
        this.f6715b = textLayoutState;
        this.f6716c = density;
        this.d = z2;
        this.e = z3;
        this.f6717f = z4;
        this.f6718g = z5;
        f2 = SnapshotStateKt.f(Boolean.TRUE, StructuralEqualityPolicy.f14078a);
        this.f6722k = f2;
        f3 = SnapshotStateKt.f(new Offset(9205357640488583168L), StructuralEqualityPolicy.f14078a);
        this.f6724m = f3;
        f4 = SnapshotStateKt.f(new Offset(9205357640488583168L), StructuralEqualityPolicy.f14078a);
        this.f6725n = f4;
        f5 = SnapshotStateKt.f(null, StructuralEqualityPolicy.f14078a);
        this.f6726o = f5;
        f6 = SnapshotStateKt.f(InputType.f6745a, StructuralEqualityPolicy.f14078a);
        this.f6727p = f6;
        f7 = SnapshotStateKt.f(Boolean.FALSE, StructuralEqualityPolicy.f14078a);
        this.f6728q = f7;
        f8 = SnapshotStateKt.f(TextToolbarState.f6863a, StructuralEqualityPolicy.f14078a);
        this.f6729r = f8;
        this.f6731t = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r12v2, types: [kotlin.jvm.internal.e0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.jvm.internal.e0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r10, androidx.compose.ui.input.pointer.PointerInputScope r11, h0.g r12) {
        /*
            r10.getClass()
            boolean r0 = r12 instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1
            if (r0 == 0) goto L17
            r0 = r12
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1 r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1) r0
            int r1 = r0.f6772g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.f6772g = r1
        L15:
            r6 = r0
            goto L1d
        L17:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1 r0 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1
            r0.<init>(r10, r12)
            goto L15
        L1d:
            java.lang.Object r12 = r6.d
            i0.a r0 = i0.a.f30806a
            int r1 = r6.f6772g
            r2 = 1
            if (r1 == 0) goto L3c
            if (r1 != r2) goto L34
            kotlin.jvm.internal.e0 r10 = r6.f6770c
            kotlin.jvm.internal.e0 r11 = r6.f6769b
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r0 = r6.f6768a
            kotlin.jvm.internal.q.m(r12)     // Catch: java.lang.Throwable -> L32
            goto L7d
        L32:
            r12 = move-exception
            goto L89
        L34:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3c:
            kotlin.jvm.internal.q.m(r12)
            kotlin.jvm.internal.e0 r12 = new kotlin.jvm.internal.e0
            r12.<init>()
            r3 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r12.f30927a = r3
            kotlin.jvm.internal.e0 r7 = new kotlin.jvm.internal.e0
            r7.<init>()
            r7.f30927a = r3
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$2 r3 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$2     // Catch: java.lang.Throwable -> L83
            r3.<init>(r10, r12, r7)     // Catch: java.lang.Throwable -> L83
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$3 r4 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$3     // Catch: java.lang.Throwable -> L83
            r4.<init>(r10, r12, r7)     // Catch: java.lang.Throwable -> L83
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$4 r5 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$4     // Catch: java.lang.Throwable -> L83
            r5.<init>(r10, r12, r7)     // Catch: java.lang.Throwable -> L83
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$5 r8 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$5     // Catch: java.lang.Throwable -> L83
            r8.<init>(r10, r7, r12)     // Catch: java.lang.Throwable -> L83
            r6.f6768a = r10     // Catch: java.lang.Throwable -> L83
            r6.f6769b = r12     // Catch: java.lang.Throwable -> L83
            r6.f6770c = r7     // Catch: java.lang.Throwable -> L83
            r6.f6772g = r2     // Catch: java.lang.Throwable -> L83
            r1 = r11
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r8
            java.lang.Object r11 = androidx.compose.foundation.gestures.DragGestureDetectorKt.f(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L83
            if (r11 != r0) goto L7a
            goto L82
        L7a:
            r0 = r10
            r11 = r12
            r10 = r7
        L7d:
            i(r0, r11, r10)
            d0.b0 r0 = d0.b0.f30125a
        L82:
            return r0
        L83:
            r11 = move-exception
            r0 = r10
            r10 = r7
            r9 = r12
            r12 = r11
            r11 = r9
        L89:
            i(r0, r11, r10)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.a(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState, androidx.compose.ui.input.pointer.PointerInputScope, h0.g):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.jvm.internal.e0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v0, types: [kotlin.jvm.internal.e0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r17, androidx.compose.ui.input.pointer.PointerInputScope r18, h0.g r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 194
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.b(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState, androidx.compose.ui.input.pointer.PointerInputScope, h0.g, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean c(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r17, long r18) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.c(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState, long):boolean");
    }

    public static final void i(TextFieldSelectionState textFieldSelectionState, e0 e0Var, e0 e0Var2) {
        if (OffsetKt.c(e0Var.f30927a)) {
            e0Var.f30927a = 9205357640488583168L;
            e0Var2.f30927a = 9205357640488583168L;
            textFieldSelectionState.e();
        }
    }

    public static final void j(TextFieldSelectionState textFieldSelectionState, e0 e0Var, e0 e0Var2) {
        if (OffsetKt.c(e0Var.f30927a)) {
            textFieldSelectionState.e();
            e0Var.f30927a = 9205357640488583168L;
            e0Var2.f30927a = 0L;
            textFieldSelectionState.f6731t = -1;
        }
    }

    public final void A(TextToolbarState textToolbarState) {
        this.f6729r.setValue(textToolbarState);
    }

    public final Object B(PointerInputScope pointerInputScope, a aVar, g gVar) {
        Object j2 = SelectionGesturesKt.j(pointerInputScope, new TextFieldMouseSelectionObserver(aVar), new TextFieldTextDragObserver(aVar), gVar);
        return j2 == i0.a.f30806a ? j2 : b0.f30125a;
    }

    public final void C(Handle handle, long j2) {
        this.f6726o.setValue(handle);
        this.f6725n.setValue(new Offset(j2));
    }

    public final long D(TextFieldCharSequence textFieldCharSequence, int i2, int i3, boolean z2, SelectionAdjustment selectionAdjustment, boolean z3, boolean z4) {
        long j2;
        HapticFeedback hapticFeedback;
        long j3 = textFieldCharSequence.f6298b;
        TextRange textRange = new TextRange(j3);
        if (z4 || (!z3 && TextRange.c(j3))) {
            textRange = null;
        }
        TextLayoutResult b2 = this.f6715b.b();
        boolean z5 = false;
        if (b2 == null) {
            j2 = TextRange.f17056b;
        } else if (textRange == null && p0.a.g(selectionAdjustment, SelectionAdjustment.Companion.f7090b)) {
            j2 = TextRangeKt.a(i2, i3);
        } else {
            SelectionLayout b3 = SelectionLayoutKt.b(b2, i2, i3, this.f6731t, textRange != null ? textRange.f17058a : TextRange.f17056b, textRange == null, z2);
            if (textRange == null || b3.h(this.f6730s)) {
                Selection a2 = selectionAdjustment.a(b3);
                long a3 = TextRangeKt.a(a2.f7083a.f7087b, a2.f7084b.f7087b);
                this.f6730s = b3;
                this.f6731t = z2 ? i2 : i3;
                j2 = a3;
            } else {
                j2 = textRange.f17058a;
            }
        }
        long j4 = textFieldCharSequence.f6298b;
        if (TextRange.b(j2, j4)) {
            return j2;
        }
        if (TextRange.g(j2) != TextRange.g(j4) && TextRange.b(TextRangeKt.a((int) (4294967295L & j2), (int) (j2 >> 32)), j4)) {
            z5 = true;
        }
        if (((Boolean) this.f6722k.getValue()).booleanValue() && !z5 && (hapticFeedback = this.f6719h) != null) {
            hapticFeedback.a();
        }
        return j2;
    }

    public final boolean d() {
        if (!(this.d && !this.e)) {
            return false;
        }
        ClipboardManager clipboardManager = this.f6721j;
        if (clipboardManager != null && clipboardManager.c()) {
            return true;
        }
        a aVar = this.f6723l;
        if ((aVar != null ? (ReceiveContentConfiguration) aVar.invoke() : null) == null) {
            return false;
        }
        ClipboardManager clipboardManager2 = this.f6721j;
        return (clipboardManager2 != null ? clipboardManager2.b() : null) != null;
    }

    public final void e() {
        this.f6726o.setValue(null);
        this.f6725n.setValue(new Offset(9205357640488583168L));
        this.f6724m.setValue(new Offset(9205357640488583168L));
    }

    public final void f(boolean z2) {
        TransformedTextFieldState transformedTextFieldState = this.f6714a;
        TextFieldCharSequence d = transformedTextFieldState.d();
        if (TextRange.c(d.f6298b)) {
            return;
        }
        ClipboardManager clipboardManager = this.f6721j;
        if (clipboardManager != null) {
            long j2 = d.f6298b;
            clipboardManager.d(new AnnotatedString(d.f6297a.subSequence(TextRange.f(j2), TextRange.e(j2)).toString(), null, 6));
        }
        if (z2) {
            transformedTextFieldState.a();
        }
    }

    public final Object g(PointerInputScope pointerInputScope, g gVar) {
        Object J = p0.a.J(new TextFieldSelectionState$cursorHandleGestures$2(this, pointerInputScope, null), gVar);
        return J == i0.a.f30806a ? J : b0.f30125a;
    }

    public final void h() {
        TransformedTextFieldState transformedTextFieldState = this.f6714a;
        TextFieldCharSequence d = transformedTextFieldState.d();
        if (TextRange.c(d.f6298b)) {
            return;
        }
        ClipboardManager clipboardManager = this.f6721j;
        if (clipboardManager != null) {
            long j2 = d.f6298b;
            clipboardManager.d(new AnnotatedString(d.f6297a.subSequence(TextRange.f(j2), TextRange.e(j2)).toString(), null, 6));
        }
        InputTransformation inputTransformation = transformedTextFieldState.f6652b;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.f6874b;
        TextFieldState textFieldState = transformedTextFieldState.f6651a;
        textFieldState.f6307b.f6400b.b();
        EditingBuffer editingBuffer = textFieldState.f6307b;
        editingBuffer.c(TextRange.f(editingBuffer.e()), TextRange.e(editingBuffer.e()));
        editingBuffer.h(TextRange.f(editingBuffer.e()), TextRange.f(editingBuffer.e()));
        TextFieldState.a(textFieldState, inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final Object k(PointerInputScope pointerInputScope, MutableInteractionSource mutableInteractionSource, a aVar, a aVar2, g gVar) {
        Object d = TapGestureDetectorKt.d(pointerInputScope, new TextFieldSelectionState$detectTextFieldTapGestures$2(mutableInteractionSource, this, null), new TextFieldSelectionState$detectTextFieldTapGestures$3(aVar, this, aVar2), gVar);
        return d == i0.a.f30806a ? d : b0.f30125a;
    }

    public final Object l(PointerInputScope pointerInputScope, g gVar) {
        Object K1 = pointerInputScope.K1(new TextFieldSelectionState$detectTouchMode$2(this, null), gVar);
        return K1 == i0.a.f30806a ? K1 : b0.f30125a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        if (androidx.compose.foundation.text.selection.SelectionManagerKt.a(r3, androidx.compose.foundation.text.selection.SelectionManagerKt.c(r0)) != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState m(boolean r10) {
        /*
            r9 = this;
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r0 = r9.f6714a
            androidx.compose.foundation.text.input.TextFieldCharSequence r0 = r0.d()
            androidx.compose.runtime.ParcelableSnapshotMutableState r1 = r9.f6728q
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            androidx.compose.runtime.ParcelableSnapshotMutableState r2 = r9.f6727p
            java.lang.Object r2 = r2.getValue()
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$InputType r2 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.InputType) r2
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$InputType r3 = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.InputType.f6745a
            if (r2 != r3) goto L20
            r2 = 1
            goto L21
        L20:
            r2 = 0
        L21:
            androidx.compose.foundation.text.Handle r3 = r9.o()
            if (r1 == 0) goto L8f
            if (r2 == 0) goto L8f
            long r1 = r0.f6298b
            boolean r1 = androidx.compose.ui.text.TextRange.c(r1)
            if (r1 == 0) goto L8f
            d0.k r1 = r0.d
            if (r1 != 0) goto L8f
            java.lang.CharSequence r0 = r0.f6297a
            int r0 = r0.length()
            if (r0 <= 0) goto L8f
            androidx.compose.foundation.text.Handle r0 = androidx.compose.foundation.text.Handle.f5964a
            if (r3 == r0) goto L72
            androidx.compose.runtime.snapshots.Snapshot r0 = androidx.compose.runtime.snapshots.Snapshot.Companion.a()
            if (r0 == 0) goto L4c
            q0.l r1 = r0.f()
            goto L4d
        L4c:
            r1 = 0
        L4d:
            androidx.compose.runtime.snapshots.Snapshot r2 = androidx.compose.runtime.snapshots.Snapshot.Companion.c(r0)
            androidx.compose.ui.geometry.Rect r3 = r9.n()     // Catch: java.lang.Throwable -> L6d
            long r3 = r3.c()     // Catch: java.lang.Throwable -> L6d
            androidx.compose.runtime.snapshots.Snapshot.Companion.f(r0, r2, r1)
            androidx.compose.ui.layout.LayoutCoordinates r0 = r9.s()
            if (r0 == 0) goto L8f
            androidx.compose.ui.geometry.Rect r0 = androidx.compose.foundation.text.selection.SelectionManagerKt.c(r0)
            boolean r0 = androidx.compose.foundation.text.selection.SelectionManagerKt.a(r3, r0)
            if (r0 == 0) goto L8f
            goto L72
        L6d:
            r10 = move-exception
            androidx.compose.runtime.snapshots.Snapshot.Companion.f(r0, r2, r1)
            throw r10
        L72:
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState r0 = new androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState
            r4 = 1
            if (r10 == 0) goto L81
            androidx.compose.ui.geometry.Rect r10 = r9.n()
            long r1 = r10.c()
        L7f:
            r5 = r1
            goto L87
        L81:
            r1 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            goto L7f
        L87:
            androidx.compose.ui.text.style.ResolvedTextDirection r7 = androidx.compose.ui.text.style.ResolvedTextDirection.f17460a
            r8 = 0
            r3 = r0
            r3.<init>(r4, r5, r7, r8)
            return r0
        L8f:
            androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState r10 = androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState.e
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.m(boolean):androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState");
    }

    public final Rect n() {
        float f2;
        TextLayoutResult b2 = this.f6715b.b();
        Rect rect = Rect.e;
        if (b2 == null) {
            return rect;
        }
        TextFieldCharSequence d = this.f6714a.d();
        if (!TextRange.c(d.f6298b)) {
            return rect;
        }
        Rect c2 = b2.c((int) (d.f6298b >> 32));
        float y1 = this.f6716c.y1(TextFieldCursorKt.f6116a);
        if (b2.f17046a.f17043h == LayoutDirection.f17494a) {
            f2 = (y1 / 2) + c2.f14914a;
        } else {
            f2 = c2.f14916c - (y1 / 2);
        }
        float f3 = y1 / 2;
        float v2 = p0.a.v(p0.a.x(f2, ((int) (b2.f17048c >> 32)) - f3), f3);
        return new Rect(v2 - f3, c2.f14915b, v2 + f3, c2.d);
    }

    public final Handle o() {
        return (Handle) this.f6726o.getValue();
    }

    public final long p() {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.f6725n;
        if (OffsetKt.d(((Offset) parcelableSnapshotMutableState.getValue()).f14913a)) {
            return 9205357640488583168L;
        }
        ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = this.f6724m;
        if (OffsetKt.d(((Offset) parcelableSnapshotMutableState2.getValue()).f14913a)) {
            return TextLayoutStateKt.b(this.f6715b, ((Offset) parcelableSnapshotMutableState.getValue()).f14913a);
        }
        long j2 = ((Offset) parcelableSnapshotMutableState.getValue()).f14913a;
        long j3 = ((Offset) parcelableSnapshotMutableState2.getValue()).f14913a;
        LayoutCoordinates s2 = s();
        return Offset.k(j2, Offset.j(j3, s2 != null ? s2.M(0L) : 9205357640488583168L));
    }

    public final long q(boolean z2) {
        long j2;
        TextLayoutResult b2 = this.f6715b.b();
        if (b2 == null) {
            return 0L;
        }
        long j3 = this.f6714a.d().f6298b;
        if (z2) {
            int i2 = TextRange.f17057c;
            j2 = j3 >> 32;
        } else {
            int i3 = TextRange.f17057c;
            j2 = 4294967295L & j3;
        }
        return TextSelectionDelegateKt.a(b2, (int) j2, z2, TextRange.g(j3));
    }

    public final TextFieldHandleState r(boolean z2, boolean z3) {
        LayoutCoordinates s2;
        Handle handle = z2 ? Handle.f5965b : Handle.f5966c;
        TextLayoutResult b2 = this.f6715b.b();
        TextFieldHandleState textFieldHandleState = TextFieldHandleState.e;
        if (b2 == null) {
            return textFieldHandleState;
        }
        TransformedTextFieldState transformedTextFieldState = this.f6714a;
        long j2 = transformedTextFieldState.d().f6298b;
        if (TextRange.c(j2)) {
            return textFieldHandleState;
        }
        long q2 = q(z2);
        if (((InputType) this.f6727p.getValue()) != InputType.f6745a || ((o() != handle && ((s2 = s()) == null || !SelectionManagerKt.a(q2, SelectionManagerKt.c(s2)))) || transformedTextFieldState.d().d != null)) {
            return textFieldHandleState;
        }
        ResolvedTextDirection a2 = b2.a(z2 ? (int) (j2 >> 32) : Math.max(((int) (4294967295L & j2)) - 1, 0));
        boolean g2 = TextRange.g(j2);
        if (z3) {
            LayoutCoordinates s3 = s();
            if (s3 != null) {
                q2 = TextLayoutStateKt.a(q2, SelectionManagerKt.c(s3));
            }
        } else {
            q2 = 9205357640488583168L;
        }
        return new TextFieldHandleState(true, q2, a2, g2);
    }

    public final LayoutCoordinates s() {
        LayoutCoordinates d = this.f6715b.d();
        if (d == null || !d.B()) {
            return null;
        }
        return d;
    }

    public final TextToolbarState t() {
        return (TextToolbarState) this.f6729r.getValue();
    }

    public final void u() {
        TextToolbar textToolbar;
        TextToolbar textToolbar2 = this.f6720i;
        if ((textToolbar2 != null ? textToolbar2.getStatus() : null) != TextToolbarStatus.f16601a || (textToolbar = this.f6720i) == null) {
            return;
        }
        textToolbar.hide();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object v(h0.g r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeChanges$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeChanges$1 r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeChanges$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeChanges$1 r0 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeChanges$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f6825b
            i0.a r1 = i0.a.f30806a
            int r2 = r0.d
            androidx.compose.foundation.text.input.internal.selection.TextToolbarState r3 = androidx.compose.foundation.text.input.internal.selection.TextToolbarState.f6863a
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L36
            if (r2 != r5) goto L2e
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r0 = r0.f6824a
            kotlin.jvm.internal.q.m(r7)     // Catch: java.lang.Throwable -> L2c
            goto L4b
        L2c:
            r7 = move-exception
            goto L5c
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L36:
            kotlin.jvm.internal.q.m(r7)
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeChanges$2 r7 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeChanges$2     // Catch: java.lang.Throwable -> L5a
            r2 = 0
            r7.<init>(r6, r2)     // Catch: java.lang.Throwable -> L5a
            r0.f6824a = r6     // Catch: java.lang.Throwable -> L5a
            r0.d = r5     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r7 = p0.a.J(r7, r0)     // Catch: java.lang.Throwable -> L5a
            if (r7 != r1) goto L4a
            return r1
        L4a:
            r0 = r6
        L4b:
            r0.z(r4)
            androidx.compose.foundation.text.input.internal.selection.TextToolbarState r7 = r0.t()
            if (r7 == r3) goto L57
            r0.u()
        L57:
            d0.b0 r7 = d0.b0.f30125a
            return r7
        L5a:
            r7 = move-exception
            r0 = r6
        L5c:
            r0.z(r4)
            androidx.compose.foundation.text.input.internal.selection.TextToolbarState r1 = r0.t()
            if (r1 == r3) goto L68
            r0.u()
        L68:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.v(h0.g):java.lang.Object");
    }

    public final void w() {
        AnnotatedString a2;
        String str;
        ReceiveContentConfiguration receiveContentConfiguration;
        AnnotatedString a3;
        String str2;
        ClipEntry b2;
        ClipEntry clipEntry;
        String a4;
        a aVar = this.f6723l;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.f6874b;
        TransformedTextFieldState transformedTextFieldState = this.f6714a;
        if (aVar == null || (receiveContentConfiguration = (ReceiveContentConfiguration) aVar.invoke()) == null) {
            ClipboardManager clipboardManager = this.f6721j;
            if (clipboardManager == null || (a2 = clipboardManager.a()) == null || (str = a2.f16880a) == null) {
                return;
            }
            TransformedTextFieldState.h(transformedTextFieldState, str, false, textFieldEditUndoBehavior, 2);
            return;
        }
        ClipboardManager clipboardManager2 = this.f6721j;
        if (clipboardManager2 == null || (b2 = clipboardManager2.b()) == null) {
            ClipboardManager clipboardManager3 = this.f6721j;
            if (clipboardManager3 == null || (a3 = clipboardManager3.a()) == null || (str2 = a3.f16880a) == null) {
                return;
            }
            TransformedTextFieldState.h(transformedTextFieldState, str2, false, textFieldEditUndoBehavior, 2);
            return;
        }
        b2.f16424a.getDescription();
        TransferableContent e = receiveContentConfiguration.a().e(new TransferableContent(b2));
        if (e == null || (clipEntry = e.f2894a) == null || (a4 = TransferableContent_androidKt.a(clipEntry)) == null) {
            return;
        }
        TransformedTextFieldState.h(transformedTextFieldState, a4, false, textFieldEditUndoBehavior, 2);
    }

    public final void x() {
        TransformedTextFieldState transformedTextFieldState = this.f6714a;
        InputTransformation inputTransformation = transformedTextFieldState.f6652b;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.f6873a;
        TextFieldState textFieldState = transformedTextFieldState.f6651a;
        textFieldState.f6307b.f6400b.b();
        EditingBuffer editingBuffer = textFieldState.f6307b;
        editingBuffer.h(0, editingBuffer.f6399a.length());
        TextFieldState.a(textFieldState, inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final Object y(PointerInputScope pointerInputScope, boolean z2, g gVar) {
        Object J = p0.a.J(new TextFieldSelectionState$selectionHandleGestures$2(this, pointerInputScope, null, z2), gVar);
        return J == i0.a.f30806a ? J : b0.f30125a;
    }

    public final void z(boolean z2) {
        this.f6728q.setValue(Boolean.valueOf(z2));
    }
}

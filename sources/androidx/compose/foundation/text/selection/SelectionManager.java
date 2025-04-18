package androidx.compose.foundation.text.selection;

import androidx.collection.LongIntMapKt;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongIntMap;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.input.internal.TextLayoutStateKt;
import androidx.compose.foundation.text.selection.Selection;
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
import androidx.compose.ui.text.AnnotatedString;
import d0.b0;
import e0.u;
import java.util.ArrayList;
import java.util.Comparator;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import q0.l;
import q0.p;
import q0.t;

@StabilityInferred
/* loaded from: classes3.dex */
public final class SelectionManager {

    /* renamed from: a, reason: collision with root package name */
    public final SelectionRegistrarImpl f7215a;

    /* renamed from: b, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f7216b;

    /* renamed from: c, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f7217c;
    public r d;
    public HapticFeedback e;

    /* renamed from: f, reason: collision with root package name */
    public ClipboardManager f7218f;

    /* renamed from: g, reason: collision with root package name */
    public TextToolbar f7219g;

    /* renamed from: h, reason: collision with root package name */
    public final FocusRequester f7220h;

    /* renamed from: i, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f7221i;

    /* renamed from: j, reason: collision with root package name */
    public Offset f7222j;

    /* renamed from: k, reason: collision with root package name */
    public LayoutCoordinates f7223k;

    /* renamed from: l, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f7224l;

    /* renamed from: m, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f7225m;

    /* renamed from: n, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f7226n;

    /* renamed from: o, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f7227o;

    /* renamed from: p, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f7228p;

    /* renamed from: q, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f7229q;

    /* renamed from: r, reason: collision with root package name */
    public SelectionLayout f7230r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f7231s;

    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass1 extends r implements l {
        public AnonymousClass1() {
            super(1);
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            long longValue = ((Number) obj).longValue();
            SelectionManager selectionManager = SelectionManager.this;
            if (selectionManager.f7215a.b().a(longValue)) {
                selectionManager.o();
                selectionManager.q();
            }
            return b0.f30125a;
        }
    }

    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass2 extends r implements q0.r {
        public AnonymousClass2() {
            super(4);
        }

        @Override // q0.r
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj2;
            long j2 = ((Offset) obj3).f14913a;
            SelectionAdjustment selectionAdjustment = (SelectionAdjustment) obj4;
            long a2 = layoutCoordinates.a();
            Rect rect = new Rect(0.0f, 0.0f, (int) (a2 >> 32), (int) (a2 & 4294967295L));
            if (!SelectionManagerKt.a(j2, rect)) {
                j2 = TextLayoutStateKt.a(j2, rect);
            }
            SelectionManager selectionManager = SelectionManager.this;
            long a3 = SelectionManager.a(selectionManager, layoutCoordinates, j2);
            if (OffsetKt.c(a3)) {
                selectionManager.l(booleanValue);
                selectionManager.f7230r = null;
                selectionManager.p(a3, 9205357640488583168L, false, selectionAdjustment);
                selectionManager.f7220h.b();
                selectionManager.n(false);
            }
            return b0.f30125a;
        }
    }

    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$3, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass3 extends r implements p {
        public AnonymousClass3() {
            super(2);
        }

        /* JADX WARN: Type inference failed for: r1v8, types: [kotlin.jvm.internal.r, q0.l] */
        @Override // q0.p
        public final Object invoke(Object obj, Object obj2) {
            HapticFeedback hapticFeedback;
            long j2;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            long longValue = ((Number) obj2).longValue();
            SelectionManager selectionManager = SelectionManager.this;
            Selection e = selectionManager.e();
            MutableLongObjectMap mutableLongObjectMap = LongObjectMapKt.f1461a;
            MutableLongObjectMap mutableLongObjectMap2 = new MutableLongObjectMap();
            LayoutCoordinates j3 = selectionManager.j();
            SelectionRegistrarImpl selectionRegistrarImpl = selectionManager.f7215a;
            ArrayList j4 = selectionRegistrarImpl.j(j3);
            int size = j4.size();
            int i2 = 0;
            Selection selection = null;
            while (i2 < size) {
                Selectable selectable = (Selectable) j4.get(i2);
                Selection j5 = selectable.i() == longValue ? selectable.j() : null;
                if (j5 != null) {
                    mutableLongObjectMap2.g(selectable.i(), j5);
                }
                if (selection == null) {
                    j2 = longValue;
                    selection = j5;
                } else if (j5 == null) {
                    j2 = longValue;
                } else {
                    Selection.AnchorInfo anchorInfo = j5.f7084b;
                    boolean z2 = j5.f7085c;
                    boolean z3 = selection.f7085c;
                    if (z3) {
                        j2 = longValue;
                    } else if (z2) {
                        j2 = longValue;
                    } else {
                        j2 = longValue;
                        selection = Selection.a(selection, null, anchorInfo, false, 5);
                    }
                    if (z2) {
                        anchorInfo = j5.f7083a;
                    }
                    selection = new Selection(anchorInfo, z3 ? selection.f7084b : selection.f7083a, true);
                }
                i2++;
                longValue = j2;
            }
            if (selectionManager.g() && !p0.a.g(selection, e) && (hapticFeedback = selectionManager.e) != null) {
                hapticFeedback.a();
            }
            if (!p0.a.g(selection, selectionManager.e())) {
                selectionRegistrarImpl.f7284l.setValue(mutableLongObjectMap2);
                selectionManager.d.invoke(selection);
            }
            selectionManager.l(booleanValue);
            selectionManager.f7220h.b();
            selectionManager.n(false);
            return b0.f30125a;
        }
    }

    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$4, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass4 extends r implements t {
        public AnonymousClass4() {
            super(6);
        }

        @Override // q0.t
        public final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj2;
            long j2 = ((Offset) obj3).f14913a;
            long j3 = ((Offset) obj4).f14913a;
            SelectionManager selectionManager = SelectionManager.this;
            long a2 = SelectionManager.a(selectionManager, layoutCoordinates, j2);
            long a3 = SelectionManager.a(selectionManager, layoutCoordinates, j3);
            selectionManager.l(booleanValue);
            selectionManager.getClass();
            return Boolean.valueOf(selectionManager.p(a2, a3, ((Boolean) obj5).booleanValue(), (SelectionAdjustment) obj6));
        }
    }

    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$5, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass5 extends r implements q0.a {
        public AnonymousClass5() {
            super(0);
        }

        @Override // q0.a
        public final Object invoke() {
            SelectionManager selectionManager = SelectionManager.this;
            selectionManager.n(true);
            selectionManager.f7228p.setValue(null);
            selectionManager.f7229q.setValue(null);
            return b0.f30125a;
        }
    }

    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$6, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass6 extends r implements l {
        public AnonymousClass6() {
            super(1);
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            long longValue = ((Number) obj).longValue();
            SelectionManager selectionManager = SelectionManager.this;
            if (selectionManager.f7215a.b().a(longValue)) {
                selectionManager.i();
                selectionManager.m(null);
            }
            return b0.f30125a;
        }
    }

    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$7, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass7 extends r implements l {
        public AnonymousClass7() {
            super(1);
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            Selection.AnchorInfo anchorInfo;
            Selection.AnchorInfo anchorInfo2;
            long longValue = ((Number) obj).longValue();
            SelectionManager selectionManager = SelectionManager.this;
            Selection e = selectionManager.e();
            if (e != null && (anchorInfo2 = e.f7083a) != null && longValue == anchorInfo2.f7088c) {
                selectionManager.f7226n.setValue(null);
            }
            Selection e2 = selectionManager.e();
            if (e2 != null && (anchorInfo = e2.f7084b) != null && longValue == anchorInfo.f7088c) {
                selectionManager.f7227o.setValue(null);
            }
            if (selectionManager.f7215a.b().a(longValue)) {
                selectionManager.q();
            }
            return b0.f30125a;
        }
    }

    public SelectionManager(SelectionRegistrarImpl selectionRegistrarImpl) {
        ParcelableSnapshotMutableState f2;
        ParcelableSnapshotMutableState f3;
        ParcelableSnapshotMutableState f4;
        ParcelableSnapshotMutableState f5;
        ParcelableSnapshotMutableState f6;
        ParcelableSnapshotMutableState f7;
        ParcelableSnapshotMutableState f8;
        ParcelableSnapshotMutableState f9;
        ParcelableSnapshotMutableState f10;
        this.f7215a = selectionRegistrarImpl;
        f2 = SnapshotStateKt.f(null, StructuralEqualityPolicy.f14078a);
        this.f7216b = f2;
        f3 = SnapshotStateKt.f(Boolean.TRUE, StructuralEqualityPolicy.f14078a);
        this.f7217c = f3;
        this.d = new SelectionManager$onSelectionChange$1(this);
        this.f7220h = new FocusRequester();
        f4 = SnapshotStateKt.f(Boolean.FALSE, StructuralEqualityPolicy.f14078a);
        this.f7221i = f4;
        f5 = SnapshotStateKt.f(new Offset(0L), StructuralEqualityPolicy.f14078a);
        this.f7224l = f5;
        f6 = SnapshotStateKt.f(new Offset(0L), StructuralEqualityPolicy.f14078a);
        this.f7225m = f6;
        f7 = SnapshotStateKt.f(null, StructuralEqualityPolicy.f14078a);
        this.f7226n = f7;
        f8 = SnapshotStateKt.f(null, StructuralEqualityPolicy.f14078a);
        this.f7227o = f8;
        f9 = SnapshotStateKt.f(null, StructuralEqualityPolicy.f14078a);
        this.f7228p = f9;
        f10 = SnapshotStateKt.f(null, StructuralEqualityPolicy.f14078a);
        this.f7229q = f10;
        selectionRegistrarImpl.e = new AnonymousClass1();
        selectionRegistrarImpl.f7278f = new AnonymousClass2();
        selectionRegistrarImpl.f7279g = new AnonymousClass3();
        selectionRegistrarImpl.f7280h = new AnonymousClass4();
        selectionRegistrarImpl.f7281i = new AnonymousClass5();
        selectionRegistrarImpl.f7282j = new AnonymousClass6();
        selectionRegistrarImpl.f7283k = new AnonymousClass7();
    }

    public static final long a(SelectionManager selectionManager, LayoutCoordinates layoutCoordinates, long j2) {
        LayoutCoordinates layoutCoordinates2 = selectionManager.f7223k;
        if (layoutCoordinates2 == null || !layoutCoordinates2.B()) {
            return 9205357640488583168L;
        }
        return selectionManager.j().v(layoutCoordinates, j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r10 = this;
            androidx.compose.foundation.text.selection.Selection r0 = r10.e()
            r1 = 0
            if (r0 == 0) goto L64
            androidx.compose.foundation.text.selection.SelectionRegistrarImpl r0 = r10.f7215a
            androidx.collection.LongObjectMap r2 = r0.b()
            int r2 = r2.e
            if (r2 != 0) goto L12
            goto L64
        L12:
            androidx.compose.ui.text.AnnotatedString$Builder r2 = new androidx.compose.ui.text.AnnotatedString$Builder
            r2.<init>()
            androidx.compose.ui.layout.LayoutCoordinates r3 = r10.j()
            java.util.ArrayList r3 = r0.j(r3)
            int r4 = r3.size()
            r5 = 0
        L24:
            if (r5 >= r4) goto L5f
            java.lang.Object r6 = r3.get(r5)
            androidx.compose.foundation.text.selection.Selectable r6 = (androidx.compose.foundation.text.selection.Selectable) r6
            androidx.collection.LongObjectMap r7 = r0.b()
            long r8 = r6.i()
            java.lang.Object r7 = r7.c(r8)
            androidx.compose.foundation.text.selection.Selection r7 = (androidx.compose.foundation.text.selection.Selection) r7
            if (r7 == 0) goto L5c
            androidx.compose.ui.text.AnnotatedString r6 = r6.a()
            boolean r8 = r7.f7085c
            androidx.compose.foundation.text.selection.Selection$AnchorInfo r9 = r7.f7083a
            androidx.compose.foundation.text.selection.Selection$AnchorInfo r7 = r7.f7084b
            if (r8 == 0) goto L51
            int r7 = r7.f7087b
            int r8 = r9.f7087b
            androidx.compose.ui.text.AnnotatedString r6 = r6.subSequence(r7, r8)
            goto L59
        L51:
            int r8 = r9.f7087b
            int r7 = r7.f7087b
            androidx.compose.ui.text.AnnotatedString r6 = r6.subSequence(r8, r7)
        L59:
            r2.b(r6)
        L5c:
            int r5 = r5 + 1
            goto L24
        L5f:
            androidx.compose.ui.text.AnnotatedString r0 = r2.f()
            goto L65
        L64:
            r0 = r1
        L65:
            if (r0 == 0) goto L79
            java.lang.String r2 = r0.f16880a
            int r2 = r2.length()
            if (r2 <= 0) goto L70
            r1 = r0
        L70:
            if (r1 == 0) goto L79
            androidx.compose.ui.platform.ClipboardManager r0 = r10.f7218f
            if (r0 == 0) goto L79
            r0.d(r1)
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionManager.b():void");
    }

    public final Handle c() {
        return (Handle) this.f7228p.getValue();
    }

    public final boolean d() {
        return ((Boolean) this.f7221i.getValue()).booleanValue();
    }

    public final Selection e() {
        return (Selection) this.f7216b.getValue();
    }

    public final boolean f() {
        Selection selection;
        LayoutCoordinates j2 = j();
        SelectionRegistrarImpl selectionRegistrarImpl = this.f7215a;
        ArrayList j3 = selectionRegistrarImpl.j(j2);
        if (j3.isEmpty()) {
            return true;
        }
        int size = j3.size();
        for (int i2 = 0; i2 < size; i2++) {
            Selectable selectable = (Selectable) j3.get(i2);
            AnnotatedString a2 = selectable.a();
            if (a2.f16880a.length() != 0 && ((selection = (Selection) selectionRegistrarImpl.b().c(selectable.i())) == null || Math.abs(selection.f7083a.f7087b - selection.f7084b.f7087b) != a2.f16880a.length())) {
                return false;
            }
        }
        return true;
    }

    public final boolean g() {
        return ((Boolean) this.f7217c.getValue()).booleanValue();
    }

    public final boolean h() {
        Selection e = e();
        if (e == null) {
            return false;
        }
        Selection.AnchorInfo anchorInfo = e.f7083a;
        Selection.AnchorInfo anchorInfo2 = e.f7084b;
        if (p0.a.g(anchorInfo, anchorInfo2)) {
            return false;
        }
        if (anchorInfo.f7088c == anchorInfo2.f7088c) {
            return true;
        }
        LayoutCoordinates j2 = j();
        SelectionRegistrarImpl selectionRegistrarImpl = this.f7215a;
        ArrayList j3 = selectionRegistrarImpl.j(j2);
        int size = j3.size();
        for (int i2 = 0; i2 < size; i2++) {
            Selection selection = (Selection) selectionRegistrarImpl.b().c(((Selectable) j3.get(i2)).i());
            if (selection != null && selection.f7083a.f7087b != selection.f7084b.f7087b) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.internal.r, q0.l] */
    public final void i() {
        HapticFeedback hapticFeedback;
        MutableLongObjectMap mutableLongObjectMap = LongObjectMapKt.f1461a;
        p0.a.q(mutableLongObjectMap, "null cannot be cast to non-null type androidx.collection.LongObjectMap<V of androidx.collection.LongObjectMapKt.emptyLongObjectMap>");
        this.f7215a.f7284l.setValue(mutableLongObjectMap);
        n(false);
        if (e() != null) {
            this.d.invoke(null);
            if (!g() || (hapticFeedback = this.e) == null) {
                return;
            }
            hapticFeedback.a();
        }
    }

    public final LayoutCoordinates j() {
        LayoutCoordinates layoutCoordinates = this.f7223k;
        if (layoutCoordinates == null) {
            throw new IllegalArgumentException("null coordinates".toString());
        }
        if (layoutCoordinates.B()) {
            return layoutCoordinates;
        }
        throw new IllegalArgumentException("unattached coordinates".toString());
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.jvm.internal.r, q0.l] */
    public final void k() {
        LayoutCoordinates j2 = j();
        SelectionRegistrarImpl selectionRegistrarImpl = this.f7215a;
        ArrayList j3 = selectionRegistrarImpl.j(j2);
        if (j3.isEmpty()) {
            return;
        }
        MutableLongObjectMap mutableLongObjectMap = LongObjectMapKt.f1461a;
        MutableLongObjectMap mutableLongObjectMap2 = new MutableLongObjectMap();
        int size = j3.size();
        Selection selection = null;
        Selection selection2 = null;
        for (int i2 = 0; i2 < size; i2++) {
            Selectable selectable = (Selectable) j3.get(i2);
            Selection j4 = selectable.j();
            if (j4 != null) {
                if (selection == null) {
                    selection = j4;
                }
                long i3 = selectable.i();
                int d = mutableLongObjectMap2.d(i3);
                Object[] objArr = mutableLongObjectMap2.f1460c;
                Object obj = objArr[d];
                mutableLongObjectMap2.f1459b[d] = i3;
                objArr[d] = j4;
                selection2 = j4;
            }
        }
        if (mutableLongObjectMap2.e == 0) {
            return;
        }
        if (selection != selection2) {
            p0.a.p(selection);
            p0.a.p(selection2);
            selection = new Selection(selection.f7083a, selection2.f7084b, false);
        }
        selectionRegistrarImpl.f7284l.setValue(mutableLongObjectMap2);
        this.d.invoke(selection);
        this.f7230r = null;
    }

    public final void l(boolean z2) {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.f7217c;
        if (((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue() != z2) {
            parcelableSnapshotMutableState.setValue(Boolean.valueOf(z2));
            q();
        }
    }

    public final void m(Selection selection) {
        this.f7216b.setValue(selection);
        if (selection != null) {
            o();
        }
    }

    public final void n(boolean z2) {
        this.f7231s = z2;
        q();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        if (androidx.compose.foundation.text.selection.SelectionManagerKt.a(r4, r9) == false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o() {
        /*
            r13 = this;
            androidx.compose.foundation.text.selection.Selection r0 = r13.e()
            androidx.compose.ui.layout.LayoutCoordinates r1 = r13.f7223k
            androidx.compose.foundation.text.selection.SelectionRegistrarImpl r2 = r13.f7215a
            r3 = 0
            if (r0 == 0) goto L1a
            androidx.compose.foundation.text.selection.Selection$AnchorInfo r4 = r0.f7083a
            if (r4 == 0) goto L1a
            androidx.collection.MutableLongObjectMap r5 = r2.f7277c
            long r6 = r4.f7088c
            java.lang.Object r4 = r5.c(r6)
            androidx.compose.foundation.text.selection.Selectable r4 = (androidx.compose.foundation.text.selection.Selectable) r4
            goto L1b
        L1a:
            r4 = r3
        L1b:
            if (r0 == 0) goto L2c
            androidx.compose.foundation.text.selection.Selection$AnchorInfo r5 = r0.f7084b
            if (r5 == 0) goto L2c
            androidx.collection.MutableLongObjectMap r2 = r2.f7277c
            long r5 = r5.f7088c
            java.lang.Object r2 = r2.c(r5)
            androidx.compose.foundation.text.selection.Selectable r2 = (androidx.compose.foundation.text.selection.Selectable) r2
            goto L2d
        L2c:
            r2 = r3
        L2d:
            if (r4 == 0) goto L34
            androidx.compose.ui.layout.LayoutCoordinates r5 = r4.e()
            goto L35
        L34:
            r5 = r3
        L35:
            if (r2 == 0) goto L3c
            androidx.compose.ui.layout.LayoutCoordinates r6 = r2.e()
            goto L3d
        L3c:
            r6 = r3
        L3d:
            androidx.compose.runtime.ParcelableSnapshotMutableState r7 = r13.f7227o
            androidx.compose.runtime.ParcelableSnapshotMutableState r8 = r13.f7226n
            if (r0 == 0) goto La8
            if (r1 == 0) goto La8
            boolean r9 = r1.B()
            if (r9 == 0) goto La8
            if (r5 != 0) goto L50
            if (r6 != 0) goto L50
            goto La8
        L50:
            androidx.compose.ui.geometry.Rect r9 = androidx.compose.foundation.text.selection.SelectionManagerKt.c(r1)
            if (r5 == 0) goto L7a
            r10 = 1
            long r10 = r4.f(r0, r10)
            boolean r4 = androidx.compose.ui.geometry.OffsetKt.d(r10)
            if (r4 == 0) goto L62
            goto L7a
        L62:
            long r4 = r1.v(r5, r10)
            androidx.compose.ui.geometry.Offset r10 = new androidx.compose.ui.geometry.Offset
            r10.<init>(r4)
            androidx.compose.foundation.text.Handle r11 = r13.c()
            androidx.compose.foundation.text.Handle r12 = androidx.compose.foundation.text.Handle.f5965b
            if (r11 == r12) goto L7b
            boolean r4 = androidx.compose.foundation.text.selection.SelectionManagerKt.a(r4, r9)
            if (r4 == 0) goto L7a
            goto L7b
        L7a:
            r10 = r3
        L7b:
            r8.setValue(r10)
            if (r6 == 0) goto La4
            r4 = 0
            long r4 = r2.f(r0, r4)
            boolean r0 = androidx.compose.ui.geometry.OffsetKt.d(r4)
            if (r0 == 0) goto L8c
            goto La4
        L8c:
            long r0 = r1.v(r6, r4)
            androidx.compose.ui.geometry.Offset r2 = new androidx.compose.ui.geometry.Offset
            r2.<init>(r0)
            androidx.compose.foundation.text.Handle r4 = r13.c()
            androidx.compose.foundation.text.Handle r5 = androidx.compose.foundation.text.Handle.f5966c
            if (r4 == r5) goto La3
            boolean r0 = androidx.compose.foundation.text.selection.SelectionManagerKt.a(r0, r9)
            if (r0 == 0) goto La4
        La3:
            r3 = r2
        La4:
            r7.setValue(r3)
            return
        La8:
            r8.setValue(r3)
            r7.setValue(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionManager.o():void");
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [kotlin.jvm.internal.r, q0.l] */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.compose.foundation.text.selection.SelectionManager$getSelectionLayout-Wko1d7g$$inlined$compareBy$1] */
    public final boolean p(long j2, long j3, boolean z2, SelectionAdjustment selectionAdjustment) {
        SelectionLayout singleSelectionLayout;
        this.f7228p.setValue(z2 ? Handle.f5965b : Handle.f5966c);
        this.f7229q.setValue(new Offset(j2));
        LayoutCoordinates j4 = j();
        SelectionRegistrarImpl selectionRegistrarImpl = this.f7215a;
        ArrayList j5 = selectionRegistrarImpl.j(j4);
        int i2 = LongIntMapKt.f1453a;
        final MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(6);
        int size = j5.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            mutableLongIntMap.d(i4, ((Selectable) j5.get(i4)).i());
        }
        SelectionLayoutBuilder selectionLayoutBuilder = new SelectionLayoutBuilder(j2, j3, j4, z2, OffsetKt.d(j3) ? null : e(), new Comparator() { // from class: androidx.compose.foundation.text.selection.SelectionManager$getSelectionLayout-Wko1d7g$$inlined$compareBy$1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                long longValue = ((Number) obj).longValue();
                MutableLongIntMap mutableLongIntMap2 = MutableLongIntMap.this;
                return q.c(Integer.valueOf(mutableLongIntMap2.a(longValue)), Integer.valueOf(mutableLongIntMap2.a(((Number) obj2).longValue())));
            }
        });
        int size2 = j5.size();
        for (int i5 = 0; i5 < size2; i5++) {
            ((Selectable) j5.get(i5)).k(selectionLayoutBuilder);
        }
        int i6 = selectionLayoutBuilder.f7196k + 1;
        ArrayList arrayList = selectionLayoutBuilder.f7193h;
        int size3 = arrayList.size();
        if (size3 == 0) {
            throw new IllegalStateException("SelectionLayout must not be empty.");
        }
        if (size3 != 1) {
            MutableLongIntMap mutableLongIntMap2 = selectionLayoutBuilder.f7192g;
            int i7 = selectionLayoutBuilder.f7194i;
            int i8 = i7 == -1 ? i6 : i7;
            int i9 = selectionLayoutBuilder.f7195j;
            if (i9 != -1) {
                i6 = i9;
            }
            singleSelectionLayout = new MultiSelectionLayout(mutableLongIntMap2, arrayList, i8, i6, selectionLayoutBuilder.d, selectionLayoutBuilder.e);
        } else {
            SelectableInfo selectableInfo = (SelectableInfo) u.S0(arrayList);
            int i10 = selectionLayoutBuilder.f7194i;
            int i11 = i10 == -1 ? i6 : i10;
            int i12 = selectionLayoutBuilder.f7195j;
            singleSelectionLayout = new SingleSelectionLayout(selectionLayoutBuilder.d, i11, i12 == -1 ? i6 : i12, selectionLayoutBuilder.e, selectableInfo);
        }
        if (!singleSelectionLayout.h(this.f7230r)) {
            return false;
        }
        Selection a2 = selectionAdjustment.a(singleSelectionLayout);
        if (!p0.a.g(a2, e())) {
            if (g()) {
                ArrayList arrayList2 = selectionRegistrarImpl.f7276b;
                int size4 = arrayList2.size();
                while (true) {
                    if (i3 >= size4) {
                        break;
                    }
                    if (((Selectable) arrayList2.get(i3)).a().f16880a.length() > 0) {
                        HapticFeedback hapticFeedback = this.e;
                        if (hapticFeedback != null) {
                            hapticFeedback.a();
                        }
                    } else {
                        i3++;
                    }
                }
            }
            selectionRegistrarImpl.f7284l.setValue(singleSelectionLayout.g(a2));
            this.d.invoke(a2);
        }
        this.f7230r = singleSelectionLayout;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01a3  */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v7, types: [kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r8v6, types: [kotlin.jvm.internal.n] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q() {
        /*
            Method dump skipped, instructions count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionManager.q():void");
    }
}

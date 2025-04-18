package androidx.compose.foundation.text;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidPaint;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.EditingBuffer;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.unit.Dp;
import q0.l;

@StabilityInferred
/* loaded from: classes3.dex */
public final class LegacyTextFieldState {

    /* renamed from: a, reason: collision with root package name */
    public TextDelegate f6021a;

    /* renamed from: b, reason: collision with root package name */
    public final RecomposeScope f6022b;

    /* renamed from: c, reason: collision with root package name */
    public final SoftwareKeyboardController f6023c;
    public final EditProcessor d;
    public TextInputSession e;

    /* renamed from: f, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f6024f;

    /* renamed from: g, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f6025g;

    /* renamed from: h, reason: collision with root package name */
    public LayoutCoordinates f6026h;

    /* renamed from: i, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f6027i;

    /* renamed from: j, reason: collision with root package name */
    public AnnotatedString f6028j;

    /* renamed from: k, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f6029k;

    /* renamed from: l, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f6030l;

    /* renamed from: m, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f6031m;

    /* renamed from: n, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f6032n;

    /* renamed from: o, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f6033o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f6034p;

    /* renamed from: q, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f6035q;

    /* renamed from: r, reason: collision with root package name */
    public final KeyboardActionRunner f6036r;

    /* renamed from: s, reason: collision with root package name */
    public l f6037s;

    /* renamed from: t, reason: collision with root package name */
    public final l f6038t;

    /* renamed from: u, reason: collision with root package name */
    public final l f6039u;

    /* renamed from: v, reason: collision with root package name */
    public final AndroidPaint f6040v;
    public long w;
    public final ParcelableSnapshotMutableState x;

    /* renamed from: y, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f6041y;

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, androidx.compose.ui.text.input.EditProcessor] */
    public LegacyTextFieldState(TextDelegate textDelegate, RecomposeScope recomposeScope, SoftwareKeyboardController softwareKeyboardController) {
        ParcelableSnapshotMutableState f2;
        ParcelableSnapshotMutableState f3;
        ParcelableSnapshotMutableState f4;
        ParcelableSnapshotMutableState f5;
        ParcelableSnapshotMutableState f6;
        ParcelableSnapshotMutableState f7;
        ParcelableSnapshotMutableState f8;
        ParcelableSnapshotMutableState f9;
        ParcelableSnapshotMutableState f10;
        ParcelableSnapshotMutableState f11;
        ParcelableSnapshotMutableState f12;
        this.f6021a = textDelegate;
        this.f6022b = recomposeScope;
        this.f6023c = softwareKeyboardController;
        ?? obj = new Object();
        AnnotatedString annotatedString = AnnotatedStringKt.f16893a;
        long j2 = TextRange.f17056b;
        TextFieldValue textFieldValue = new TextFieldValue(annotatedString, j2, (TextRange) null);
        obj.f17320a = textFieldValue;
        obj.f17321b = new EditingBuffer(annotatedString, textFieldValue.f17362b);
        this.d = obj;
        Boolean bool = Boolean.FALSE;
        f2 = SnapshotStateKt.f(bool, StructuralEqualityPolicy.f14078a);
        this.f6024f = f2;
        f3 = SnapshotStateKt.f(new Dp(0), StructuralEqualityPolicy.f14078a);
        this.f6025g = f3;
        f4 = SnapshotStateKt.f(null, StructuralEqualityPolicy.f14078a);
        this.f6027i = f4;
        f5 = SnapshotStateKt.f(HandleState.f5967a, StructuralEqualityPolicy.f14078a);
        this.f6029k = f5;
        f6 = SnapshotStateKt.f(bool, StructuralEqualityPolicy.f14078a);
        this.f6030l = f6;
        f7 = SnapshotStateKt.f(bool, StructuralEqualityPolicy.f14078a);
        this.f6031m = f7;
        f8 = SnapshotStateKt.f(bool, StructuralEqualityPolicy.f14078a);
        this.f6032n = f8;
        f9 = SnapshotStateKt.f(bool, StructuralEqualityPolicy.f14078a);
        this.f6033o = f9;
        this.f6034p = true;
        f10 = SnapshotStateKt.f(Boolean.TRUE, StructuralEqualityPolicy.f14078a);
        this.f6035q = f10;
        this.f6036r = new KeyboardActionRunner(softwareKeyboardController);
        this.f6037s = LegacyTextFieldState$onValueChangeOriginal$1.f6044a;
        this.f6038t = new LegacyTextFieldState$onValueChange$1(this);
        this.f6039u = new LegacyTextFieldState$onImeActionPerformed$1(this);
        this.f6040v = AndroidPaint_androidKt.a();
        this.w = Color.f14962i;
        f11 = SnapshotStateKt.f(new TextRange(j2), StructuralEqualityPolicy.f14078a);
        this.x = f11;
        f12 = SnapshotStateKt.f(new TextRange(j2), StructuralEqualityPolicy.f14078a);
        this.f6041y = f12;
    }

    public final HandleState a() {
        return (HandleState) this.f6029k.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.f6024f.getValue()).booleanValue();
    }

    public final LayoutCoordinates c() {
        LayoutCoordinates layoutCoordinates = this.f6026h;
        if (layoutCoordinates == null || !layoutCoordinates.B()) {
            return null;
        }
        return layoutCoordinates;
    }

    public final TextLayoutResultProxy d() {
        return (TextLayoutResultProxy) this.f6027i.getValue();
    }

    public final boolean e() {
        return (TextRange.c(((TextRange) this.x.getValue()).f17058a) && TextRange.c(((TextRange) this.f6041y.getValue()).f17058a)) ? false : true;
    }

    public final void f(long j2) {
        this.f6041y.setValue(new TextRange(j2));
    }

    public final void g(long j2) {
        this.x.setValue(new TextRange(j2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        if (r1.f6112h != r18) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(androidx.compose.ui.text.AnnotatedString r13, androidx.compose.ui.text.AnnotatedString r14, androidx.compose.ui.text.TextStyle r15, boolean r16, androidx.compose.ui.unit.Density r17, androidx.compose.ui.text.font.FontFamily.Resolver r18, q0.l r19, androidx.compose.foundation.text.KeyboardActions r20, androidx.compose.ui.focus.FocusManager r21, long r22) {
        /*
            r12 = this;
            r0 = r12
            r1 = r19
            r0.f6037s = r1
            r1 = r22
            r0.w = r1
            androidx.compose.foundation.text.KeyboardActionRunner r1 = r0.f6036r
            r2 = r20
            r1.f6007b = r2
            r2 = r21
            r1.f6008c = r2
            r1 = r13
            r0.f6028j = r1
            androidx.compose.foundation.text.TextDelegate r1 = r0.f6021a
            e0.w r11 = e0.w.f30218a
            r8 = 1
            r5 = 2147483647(0x7fffffff, float:NaN)
            r6 = 1
            androidx.compose.ui.text.AnnotatedString r2 = r1.f6107a
            r3 = r14
            boolean r2 = p0.a.g(r2, r14)
            if (r2 == 0) goto L69
            androidx.compose.ui.text.TextStyle r2 = r1.f6108b
            r4 = r15
            boolean r2 = p0.a.g(r2, r15)
            if (r2 == 0) goto L66
            boolean r2 = r1.e
            r7 = r16
            if (r2 != r7) goto L63
            int r2 = r1.f6110f
            boolean r2 = androidx.compose.ui.text.style.TextOverflow.a(r2, r8)
            if (r2 == 0) goto L63
            int r2 = r1.f6109c
            if (r2 != r5) goto L63
            int r2 = r1.d
            if (r2 != r6) goto L63
            androidx.compose.ui.unit.Density r2 = r1.f6111g
            r9 = r17
            boolean r2 = p0.a.g(r2, r9)
            if (r2 == 0) goto L60
            java.util.List r2 = r1.f6113i
            boolean r2 = p0.a.g(r2, r11)
            if (r2 == 0) goto L60
            androidx.compose.ui.text.font.FontFamily$Resolver r2 = r1.f6112h
            r10 = r18
            if (r2 == r10) goto L79
            goto L6b
        L60:
            r10 = r18
            goto L6b
        L63:
            r9 = r17
            goto L60
        L66:
            r7 = r16
            goto L63
        L69:
            r4 = r15
            goto L66
        L6b:
            androidx.compose.foundation.text.TextDelegate r1 = new androidx.compose.foundation.text.TextDelegate
            r2 = r1
            r3 = r14
            r4 = r15
            r7 = r16
            r9 = r17
            r10 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L79:
            androidx.compose.foundation.text.TextDelegate r2 = r0.f6021a
            if (r2 == r1) goto L80
            r2 = 1
            r0.f6034p = r2
        L80:
            r0.f6021a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.LegacyTextFieldState.h(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.text.TextStyle, boolean, androidx.compose.ui.unit.Density, androidx.compose.ui.text.font.FontFamily$Resolver, q0.l, androidx.compose.foundation.text.KeyboardActions, androidx.compose.ui.focus.FocusManager, long):void");
    }
}

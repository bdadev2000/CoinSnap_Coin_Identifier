package androidx.compose.ui.text.input;

import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.pointer.PositionCalculator;
import androidx.compose.ui.text.TextLayoutResult;
import q0.l;

@StabilityInferred
@d0.a
/* loaded from: classes4.dex */
public final class CursorAnchorInfoController {

    /* renamed from: a, reason: collision with root package name */
    public final PositionCalculator f17298a;

    /* renamed from: b, reason: collision with root package name */
    public final InputMethodManager f17299b;
    public boolean d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f17301f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17302g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f17303h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f17304i;

    /* renamed from: j, reason: collision with root package name */
    public TextFieldValue f17305j;

    /* renamed from: k, reason: collision with root package name */
    public TextLayoutResult f17306k;

    /* renamed from: l, reason: collision with root package name */
    public OffsetMapping f17307l;

    /* renamed from: n, reason: collision with root package name */
    public Rect f17309n;

    /* renamed from: o, reason: collision with root package name */
    public Rect f17310o;

    /* renamed from: c, reason: collision with root package name */
    public final Object f17300c = new Object();

    /* renamed from: m, reason: collision with root package name */
    public l f17308m = CursorAnchorInfoController$textFieldToRootTransform$1.f17315a;

    /* renamed from: p, reason: collision with root package name */
    public final CursorAnchorInfo.Builder f17311p = new CursorAnchorInfo.Builder();

    /* renamed from: q, reason: collision with root package name */
    public final float[] f17312q = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: r, reason: collision with root package name */
    public final Matrix f17313r = new Matrix();

    public CursorAnchorInfoController(PositionCalculator positionCalculator, InputMethodManagerImpl inputMethodManagerImpl) {
        this.f17298a = positionCalculator;
        this.f17299b = inputMethodManagerImpl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x012b, code lost:
    
        if (androidx.compose.ui.text.input.CursorAnchorInfoBuilder_androidKt.a(r6, r3, r12) == false) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.input.CursorAnchorInfoController.a():void");
    }
}

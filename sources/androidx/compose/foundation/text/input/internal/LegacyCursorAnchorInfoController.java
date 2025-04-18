package androidx.compose.foundation.text.input.internal;

import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import q0.l;

@StabilityInferred
/* loaded from: classes4.dex */
public final class LegacyCursorAnchorInfoController {

    /* renamed from: a, reason: collision with root package name */
    public final l f6431a;

    /* renamed from: b, reason: collision with root package name */
    public final InputMethodManager f6432b;
    public boolean d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6434f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6435g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6436h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f6437i;

    /* renamed from: j, reason: collision with root package name */
    public TextFieldValue f6438j;

    /* renamed from: k, reason: collision with root package name */
    public TextLayoutResult f6439k;

    /* renamed from: l, reason: collision with root package name */
    public OffsetMapping f6440l;

    /* renamed from: m, reason: collision with root package name */
    public Rect f6441m;

    /* renamed from: n, reason: collision with root package name */
    public Rect f6442n;

    /* renamed from: c, reason: collision with root package name */
    public final Object f6433c = new Object();

    /* renamed from: o, reason: collision with root package name */
    public final CursorAnchorInfo.Builder f6443o = new CursorAnchorInfo.Builder();

    /* renamed from: p, reason: collision with root package name */
    public final float[] f6444p = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: q, reason: collision with root package name */
    public final Matrix f6445q = new Matrix();

    public LegacyCursorAnchorInfoController(l lVar, InputMethodManager inputMethodManager) {
        this.f6431a = lVar;
        this.f6432b = inputMethodManager;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x013e, code lost:
    
        if (androidx.compose.foundation.text.input.internal.LegacyCursorAnchorInfoBuilder_androidKt.a(r7, r3, r13) == false) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.LegacyCursorAnchorInfoController.a():void");
    }
}

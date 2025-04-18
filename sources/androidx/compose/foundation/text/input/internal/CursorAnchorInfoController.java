package androidx.compose.foundation.text.input.internal;

import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import b1.a2;
import b1.d0;

@StabilityInferred
/* loaded from: classes3.dex */
public final class CursorAnchorInfoController {

    /* renamed from: a, reason: collision with root package name */
    public final TransformedTextFieldState f6378a;

    /* renamed from: b, reason: collision with root package name */
    public final TextLayoutState f6379b;

    /* renamed from: c, reason: collision with root package name */
    public final ComposeInputMethodManager f6380c;
    public final d0 d;
    public a2 e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6381f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6382g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6383h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f6384i;

    /* renamed from: j, reason: collision with root package name */
    public final CursorAnchorInfo.Builder f6385j = new CursorAnchorInfo.Builder();

    /* renamed from: k, reason: collision with root package name */
    public final float[] f6386k = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: l, reason: collision with root package name */
    public final Matrix f6387l = new Matrix();

    public CursorAnchorInfoController(TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, ComposeInputMethodManager composeInputMethodManager, d0 d0Var) {
        this.f6378a = transformedTextFieldState;
        this.f6379b = textLayoutState;
        this.f6380c = composeInputMethodManager;
        this.d = d0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x013f, code lost:
    
        if (androidx.compose.foundation.text.input.internal.LegacyCursorAnchorInfoBuilder_androidKt.a(r4, r0, r12) == false) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.inputmethod.CursorAnchorInfo a() {
        /*
            Method dump skipped, instructions count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.CursorAnchorInfoController.a():android.view.inputmethod.CursorAnchorInfo");
    }
}

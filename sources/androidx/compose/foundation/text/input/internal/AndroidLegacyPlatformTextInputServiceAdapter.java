package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.handwriting.StylusHandwriting_androidKt;
import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import b1.h1;
import d0.b0;
import e1.l0;
import e1.s0;
import e1.t0;
import java.lang.ref.WeakReference;
import q0.l;

@StabilityInferred
/* loaded from: classes4.dex */
public final class AndroidLegacyPlatformTextInputServiceAdapter extends LegacyPlatformTextInputServiceAdapter {

    /* renamed from: b, reason: collision with root package name */
    public h1 f6316b;

    /* renamed from: c, reason: collision with root package name */
    public LegacyTextInputMethodRequest f6317c;
    public s0 d;

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void a() {
        LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode legacyPlatformTextInputNode = this.f6446a;
        if (legacyPlatformTextInputNode == null) {
            return;
        }
        this.f6316b = legacyPlatformTextInputNode.p0(new AndroidLegacyPlatformTextInputServiceAdapter$startInput$2(null, this, legacyPlatformTextInputNode, null));
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void b() {
        h1 h1Var = this.f6316b;
        if (h1Var != null) {
            h1Var.a(null);
        }
        this.f6316b = null;
        l0 k2 = k();
        if (k2 != null) {
            ((s0) k2).n();
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void d(TextFieldValue textFieldValue, TextFieldValue textFieldValue2) {
        LegacyTextInputMethodRequest legacyTextInputMethodRequest = this.f6317c;
        if (legacyTextInputMethodRequest != null) {
            boolean z2 = (TextRange.b(legacyTextInputMethodRequest.f6454h.f17362b, textFieldValue2.f17362b) && p0.a.g(legacyTextInputMethodRequest.f6454h.f17363c, textFieldValue2.f17363c)) ? false : true;
            legacyTextInputMethodRequest.f6454h = textFieldValue2;
            int size = legacyTextInputMethodRequest.f6456j.size();
            for (int i2 = 0; i2 < size; i2++) {
                RecordingInputConnection recordingInputConnection = (RecordingInputConnection) ((WeakReference) legacyTextInputMethodRequest.f6456j.get(i2)).get();
                if (recordingInputConnection != null) {
                    recordingInputConnection.f6474g = textFieldValue2;
                }
            }
            LegacyCursorAnchorInfoController legacyCursorAnchorInfoController = legacyTextInputMethodRequest.f6459m;
            synchronized (legacyCursorAnchorInfoController.f6433c) {
                legacyCursorAnchorInfoController.f6438j = null;
                legacyCursorAnchorInfoController.f6440l = null;
                legacyCursorAnchorInfoController.f6439k = null;
                legacyCursorAnchorInfoController.f6441m = null;
                legacyCursorAnchorInfoController.f6442n = null;
            }
            if (p0.a.g(textFieldValue, textFieldValue2)) {
                if (z2) {
                    InputMethodManager inputMethodManager = legacyTextInputMethodRequest.f6450b;
                    int f2 = TextRange.f(textFieldValue2.f17362b);
                    int e = TextRange.e(textFieldValue2.f17362b);
                    TextRange textRange = legacyTextInputMethodRequest.f6454h.f17363c;
                    int f3 = textRange != null ? TextRange.f(textRange.f17058a) : -1;
                    TextRange textRange2 = legacyTextInputMethodRequest.f6454h.f17363c;
                    inputMethodManager.a(f2, e, f3, textRange2 != null ? TextRange.e(textRange2.f17058a) : -1);
                    return;
                }
                return;
            }
            if (textFieldValue != null && (!p0.a.g(textFieldValue.f17361a.f16880a, textFieldValue2.f17361a.f16880a) || (TextRange.b(textFieldValue.f17362b, textFieldValue2.f17362b) && !p0.a.g(textFieldValue.f17363c, textFieldValue2.f17363c)))) {
                legacyTextInputMethodRequest.f6450b.b();
                return;
            }
            int size2 = legacyTextInputMethodRequest.f6456j.size();
            for (int i3 = 0; i3 < size2; i3++) {
                RecordingInputConnection recordingInputConnection2 = (RecordingInputConnection) ((WeakReference) legacyTextInputMethodRequest.f6456j.get(i3)).get();
                if (recordingInputConnection2 != null) {
                    TextFieldValue textFieldValue3 = legacyTextInputMethodRequest.f6454h;
                    InputMethodManager inputMethodManager2 = legacyTextInputMethodRequest.f6450b;
                    if (recordingInputConnection2.f6478k) {
                        recordingInputConnection2.f6474g = textFieldValue3;
                        if (recordingInputConnection2.f6476i) {
                            inputMethodManager2.d(recordingInputConnection2.f6475h, RecordingInputConnection_androidKt.a(textFieldValue3));
                        }
                        TextRange textRange3 = textFieldValue3.f17363c;
                        int f4 = textRange3 != null ? TextRange.f(textRange3.f17058a) : -1;
                        TextRange textRange4 = textFieldValue3.f17363c;
                        int e2 = textRange4 != null ? TextRange.e(textRange4.f17058a) : -1;
                        long j2 = textFieldValue3.f17362b;
                        inputMethodManager2.a(TextRange.f(j2), TextRange.e(j2), f4, e2);
                    }
                }
            }
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void f(TextFieldValue textFieldValue, ImeOptions imeOptions, l lVar, l lVar2) {
        AndroidLegacyPlatformTextInputServiceAdapter$startInput$1 androidLegacyPlatformTextInputServiceAdapter$startInput$1 = new AndroidLegacyPlatformTextInputServiceAdapter$startInput$1(textFieldValue, this, imeOptions, lVar, lVar2);
        LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode legacyPlatformTextInputNode = this.f6446a;
        if (legacyPlatformTextInputNode == null) {
            return;
        }
        this.f6316b = legacyPlatformTextInputNode.p0(new AndroidLegacyPlatformTextInputServiceAdapter$startInput$2(androidLegacyPlatformTextInputServiceAdapter$startInput$1, this, legacyPlatformTextInputNode, null));
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void g(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, l lVar, Rect rect, Rect rect2) {
        LegacyTextInputMethodRequest legacyTextInputMethodRequest = this.f6317c;
        if (legacyTextInputMethodRequest != null) {
            LegacyCursorAnchorInfoController legacyCursorAnchorInfoController = legacyTextInputMethodRequest.f6459m;
            synchronized (legacyCursorAnchorInfoController.f6433c) {
                try {
                    legacyCursorAnchorInfoController.f6438j = textFieldValue;
                    legacyCursorAnchorInfoController.f6440l = offsetMapping;
                    legacyCursorAnchorInfoController.f6439k = textLayoutResult;
                    legacyCursorAnchorInfoController.f6441m = rect;
                    legacyCursorAnchorInfoController.f6442n = rect2;
                    if (!legacyCursorAnchorInfoController.e) {
                        if (legacyCursorAnchorInfoController.d) {
                        }
                    }
                    legacyCursorAnchorInfoController.a();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void h(Rect rect) {
        android.graphics.Rect rect2;
        LegacyTextInputMethodRequest legacyTextInputMethodRequest = this.f6317c;
        if (legacyTextInputMethodRequest != null) {
            legacyTextInputMethodRequest.f6458l = new android.graphics.Rect(p0.a.t0(rect.f14914a), p0.a.t0(rect.f14915b), p0.a.t0(rect.f14916c), p0.a.t0(rect.d));
            if (!legacyTextInputMethodRequest.f6456j.isEmpty() || (rect2 = legacyTextInputMethodRequest.f6458l) == null) {
                return;
            }
            legacyTextInputMethodRequest.f6449a.requestRectangleOnScreen(new android.graphics.Rect(rect2));
        }
    }

    @Override // androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter
    public final void i() {
        l0 k2 = k();
        if (k2 != null) {
            ((s0) k2).b(b0.f30125a);
        }
    }

    public final l0 k() {
        s0 s0Var = this.d;
        if (s0Var != null) {
            return s0Var;
        }
        if (!StylusHandwriting_androidKt.f6290a) {
            return null;
        }
        s0 b2 = t0.b(1, 0, 3, 2);
        this.d = b2;
        return b2;
    }
}

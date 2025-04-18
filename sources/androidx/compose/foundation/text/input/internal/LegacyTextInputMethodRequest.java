package androidx.compose.foundation.text.input.internal;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.PlatformTextInputMethodRequest;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.emoji2.text.EmojiCompat;
import b1.f0;
import d0.h;
import d0.i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import q0.l;

@StabilityInferred
/* loaded from: classes3.dex */
public final class LegacyTextInputMethodRequest implements PlatformTextInputMethodRequest {

    /* renamed from: a, reason: collision with root package name */
    public final View f6449a;

    /* renamed from: b, reason: collision with root package name */
    public final InputMethodManager f6450b;
    public LegacyTextFieldState e;

    /* renamed from: f, reason: collision with root package name */
    public TextFieldSelectionManager f6452f;

    /* renamed from: g, reason: collision with root package name */
    public ViewConfiguration f6453g;

    /* renamed from: l, reason: collision with root package name */
    public Rect f6458l;

    /* renamed from: m, reason: collision with root package name */
    public final LegacyCursorAnchorInfoController f6459m;

    /* renamed from: c, reason: collision with root package name */
    public l f6451c = LegacyTextInputMethodRequest$onEditCommand$1.f6462a;
    public l d = LegacyTextInputMethodRequest$onImeActionPerformed$1.f6463a;

    /* renamed from: h, reason: collision with root package name */
    public TextFieldValue f6454h = new TextFieldValue("", TextRange.f17056b, 4);

    /* renamed from: i, reason: collision with root package name */
    public ImeOptions f6455i = ImeOptions.f17331h;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f6456j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final h f6457k = f0.s(i.f30133c, new LegacyTextInputMethodRequest$baseInputConnection$2(this));

    public LegacyTextInputMethodRequest(View view, l lVar, InputMethodManager inputMethodManager) {
        this.f6449a = view;
        this.f6450b = inputMethodManager;
        this.f6459m = new LegacyCursorAnchorInfoController(lVar, inputMethodManager);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest$createInputConnection$1] */
    @Override // androidx.compose.ui.platform.PlatformTextInputMethodRequest
    public final InputConnection a(EditorInfo editorInfo) {
        TextFieldValue textFieldValue = this.f6454h;
        EditorInfo_androidKt.a(editorInfo, textFieldValue.f17361a.f16880a, textFieldValue.f17362b, this.f6455i, null);
        l lVar = LegacyPlatformTextInputServiceAdapter_androidKt.f6447a;
        if (EmojiCompat.g()) {
            EmojiCompat.a().m(editorInfo);
        }
        RecordingInputConnection recordingInputConnection = new RecordingInputConnection(this.f6454h, new InputEventCallback2() { // from class: androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest$createInputConnection$1
            @Override // androidx.compose.foundation.text.input.internal.InputEventCallback2
            public final void b(int i2) {
                LegacyTextInputMethodRequest.this.d.invoke(new ImeAction(i2));
            }

            @Override // androidx.compose.foundation.text.input.internal.InputEventCallback2
            public final void c(KeyEvent keyEvent) {
                ((BaseInputConnection) LegacyTextInputMethodRequest.this.f6457k.getValue()).sendKeyEvent(keyEvent);
            }

            @Override // androidx.compose.foundation.text.input.internal.InputEventCallback2
            public final void d(ArrayList arrayList) {
                LegacyTextInputMethodRequest.this.f6451c.invoke(arrayList);
            }

            @Override // androidx.compose.foundation.text.input.internal.InputEventCallback2
            public final void e(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
                LegacyCursorAnchorInfoController legacyCursorAnchorInfoController = LegacyTextInputMethodRequest.this.f6459m;
                synchronized (legacyCursorAnchorInfoController.f6433c) {
                    try {
                        legacyCursorAnchorInfoController.f6434f = z4;
                        legacyCursorAnchorInfoController.f6435g = z5;
                        legacyCursorAnchorInfoController.f6436h = z6;
                        legacyCursorAnchorInfoController.f6437i = z7;
                        if (z2) {
                            legacyCursorAnchorInfoController.e = true;
                            if (legacyCursorAnchorInfoController.f6438j != null) {
                                legacyCursorAnchorInfoController.a();
                            }
                        }
                        legacyCursorAnchorInfoController.d = z3;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // androidx.compose.foundation.text.input.internal.InputEventCallback2
            public final void f(RecordingInputConnection recordingInputConnection2) {
                LegacyTextInputMethodRequest legacyTextInputMethodRequest = LegacyTextInputMethodRequest.this;
                int size = legacyTextInputMethodRequest.f6456j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (p0.a.g(((WeakReference) legacyTextInputMethodRequest.f6456j.get(i2)).get(), recordingInputConnection2)) {
                        legacyTextInputMethodRequest.f6456j.remove(i2);
                        return;
                    }
                }
            }
        }, this.f6455i.f17334c, this.e, this.f6452f, this.f6453g);
        this.f6456j.add(new WeakReference(recordingInputConnection));
        return recordingInputConnection;
    }
}

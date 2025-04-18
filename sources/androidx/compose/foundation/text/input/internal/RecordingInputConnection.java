package androidx.compose.foundation.text.input.internal;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.DeleteSurroundingTextCommand;
import androidx.compose.ui.text.input.DeleteSurroundingTextInCodePointsCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.SetComposingRegionCommand;
import androidx.compose.ui.text.input.SetComposingTextCommand;
import androidx.compose.ui.text.input.SetSelectionCommand;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextFieldValueKt;
import e0.u;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

@StabilityInferred
/* loaded from: classes4.dex */
public final class RecordingInputConnection implements InputConnection {

    /* renamed from: a, reason: collision with root package name */
    public final InputEventCallback2 f6470a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6471b;

    /* renamed from: c, reason: collision with root package name */
    public final LegacyTextFieldState f6472c;
    public final TextFieldSelectionManager d;
    public final ViewConfiguration e;

    /* renamed from: f, reason: collision with root package name */
    public int f6473f;

    /* renamed from: g, reason: collision with root package name */
    public TextFieldValue f6474g;

    /* renamed from: h, reason: collision with root package name */
    public int f6475h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f6476i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f6477j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public boolean f6478k = true;

    public RecordingInputConnection(TextFieldValue textFieldValue, LegacyTextInputMethodRequest$createInputConnection$1 legacyTextInputMethodRequest$createInputConnection$1, boolean z2, LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, ViewConfiguration viewConfiguration) {
        this.f6470a = legacyTextInputMethodRequest$createInputConnection$1;
        this.f6471b = z2;
        this.f6472c = legacyTextFieldState;
        this.d = textFieldSelectionManager;
        this.e = viewConfiguration;
        this.f6474g = textFieldValue;
    }

    public final void b(EditCommand editCommand) {
        this.f6473f++;
        try {
            this.f6477j.add(editCommand);
        } finally {
            c();
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z2 = this.f6478k;
        if (!z2) {
            return z2;
        }
        this.f6473f++;
        return true;
    }

    public final boolean c() {
        int i2 = this.f6473f - 1;
        this.f6473f = i2;
        if (i2 == 0) {
            ArrayList arrayList = this.f6477j;
            if (!arrayList.isEmpty()) {
                this.f6470a.d(u.b1(arrayList));
                arrayList.clear();
            }
        }
        return this.f6473f > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i2) {
        boolean z2 = this.f6478k;
        if (z2) {
            return false;
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f6477j.clear();
        this.f6473f = 0;
        this.f6478k = false;
        this.f6470a.f(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z2 = this.f6478k;
        if (z2) {
            return false;
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i2, Bundle bundle) {
        boolean z2 = this.f6478k;
        if (z2) {
            return false;
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z2 = this.f6478k;
        return z2 ? this.f6471b : z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i2) {
        boolean z2 = this.f6478k;
        if (z2) {
            b(new CommitTextCommand(String.valueOf(charSequence), i2));
        }
        return z2;
    }

    public final void d(int i2) {
        sendKeyEvent(new KeyEvent(0, i2));
        sendKeyEvent(new KeyEvent(1, i2));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i2, int i3) {
        boolean z2 = this.f6478k;
        if (!z2) {
            return z2;
        }
        b(new DeleteSurroundingTextCommand(i2, i3));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i2, int i3) {
        boolean z2 = this.f6478k;
        if (!z2) {
            return z2;
        }
        b(new DeleteSurroundingTextInCodePointsCommand(i2, i3));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, androidx.compose.ui.text.input.EditCommand] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z2 = this.f6478k;
        if (!z2) {
            return z2;
        }
        b(new Object());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i2) {
        TextFieldValue textFieldValue = this.f6474g;
        return TextUtils.getCapsMode(textFieldValue.f17361a.f16880a, TextRange.f(textFieldValue.f17362b), i2);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i2) {
        boolean z2 = (i2 & 1) != 0;
        this.f6476i = z2;
        if (z2) {
            this.f6475h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return RecordingInputConnection_androidKt.a(this.f6474g);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i2) {
        if (TextRange.c(this.f6474g.f17362b)) {
            return null;
        }
        return TextFieldValueKt.a(this.f6474g).f16880a;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i2, int i3) {
        return TextFieldValueKt.b(this.f6474g, i2).f16880a;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i2, int i3) {
        return TextFieldValueKt.c(this.f6474g, i2).f16880a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i2) {
        boolean z2 = this.f6478k;
        if (z2) {
            z2 = false;
            switch (i2) {
                case R.id.selectAll:
                    b(new SetSelectionCommand(0, this.f6474g.f17361a.f16880a.length()));
                    break;
                case R.id.cut:
                    d(277);
                    break;
                case R.id.copy:
                    d(278);
                    break;
                case R.id.paste:
                    d(279);
                    break;
            }
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i2) {
        int i3;
        boolean z2 = this.f6478k;
        if (z2) {
            z2 = true;
            if (i2 != 0) {
                switch (i2) {
                    case 2:
                        i3 = 2;
                        break;
                    case 3:
                        i3 = 3;
                        break;
                    case 4:
                        i3 = 4;
                        break;
                    case 5:
                        i3 = 6;
                        break;
                    case 6:
                        i3 = 7;
                        break;
                    case 7:
                        i3 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i2);
                        break;
                }
                this.f6470a.b(i3);
            }
            i3 = 1;
            this.f6470a.b(i3);
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        if (Build.VERSION.SDK_INT >= 34) {
            Api34LegacyPerformHandwritingGestureImpl.f6366a.a(this.f6472c, this.d, handwritingGesture, this.e, executor, intConsumer, new RecordingInputConnection$performHandwritingGesture$1(this));
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z2 = this.f6478k;
        if (z2) {
            return true;
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34LegacyPerformHandwritingGestureImpl.f6366a.b(this.f6472c, this.d, previewableHandwritingGesture, cancellationSignal);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z2) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i2) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6 = this.f6478k;
        if (!z6) {
            return z6;
        }
        boolean z7 = false;
        boolean z8 = (i2 & 1) != 0;
        boolean z9 = (i2 & 2) != 0;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33) {
            boolean z10 = (i2 & 16) != 0;
            boolean z11 = (i2 & 8) != 0;
            boolean z12 = (i2 & 4) != 0;
            if (i3 >= 34 && (i2 & 32) != 0) {
                z7 = true;
            }
            if (z10 || z11 || z12 || z7) {
                z3 = z7;
                z2 = z12;
                z5 = z11;
                z4 = z10;
            } else if (i3 >= 34) {
                z4 = true;
                z5 = true;
                z2 = true;
                z3 = true;
            } else {
                z3 = z7;
                z4 = true;
                z5 = true;
                z2 = true;
            }
        } else {
            z2 = false;
            z3 = false;
            z4 = true;
            z5 = true;
        }
        this.f6470a.e(z8, z9, z4, z5, z2, z3);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z2 = this.f6478k;
        if (!z2) {
            return z2;
        }
        this.f6470a.c(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i2, int i3) {
        boolean z2 = this.f6478k;
        if (z2) {
            b(new SetComposingRegionCommand(i2, i3));
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i2) {
        boolean z2 = this.f6478k;
        if (z2) {
            b(new SetComposingTextCommand(String.valueOf(charSequence), i2));
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i2, int i3) {
        boolean z2 = this.f6478k;
        if (!z2) {
            return z2;
        }
        b(new SetSelectionCommand(i2, i3));
        return true;
    }
}

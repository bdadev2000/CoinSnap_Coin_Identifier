package androidx.compose.ui.text.input;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.TextRange;
import e0.u;
import java.util.ArrayList;

@StabilityInferred
@d0.a
/* loaded from: classes3.dex */
public final class RecordingInputConnection implements InputConnection {

    /* renamed from: a, reason: collision with root package name */
    public final InputEventCallback2 f17349a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f17350b;

    /* renamed from: c, reason: collision with root package name */
    public int f17351c;
    public TextFieldValue d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f17352f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f17353g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public boolean f17354h = true;

    public RecordingInputConnection(TextFieldValue textFieldValue, TextInputServiceAndroid$createInputConnection$1 textInputServiceAndroid$createInputConnection$1, boolean z2) {
        this.f17349a = textInputServiceAndroid$createInputConnection$1;
        this.f17350b = z2;
        this.d = textFieldValue;
    }

    public final void b(EditCommand editCommand) {
        this.f17351c++;
        try {
            this.f17353g.add(editCommand);
        } finally {
            c();
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z2 = this.f17354h;
        if (!z2) {
            return z2;
        }
        this.f17351c++;
        return true;
    }

    public final boolean c() {
        int i2 = this.f17351c - 1;
        this.f17351c = i2;
        if (i2 == 0) {
            ArrayList arrayList = this.f17353g;
            if (!arrayList.isEmpty()) {
                this.f17349a.d(u.b1(arrayList));
                arrayList.clear();
            }
        }
        return this.f17351c > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i2) {
        boolean z2 = this.f17354h;
        if (z2) {
            return false;
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f17353g.clear();
        this.f17351c = 0;
        this.f17354h = false;
        this.f17349a.a(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z2 = this.f17354h;
        if (z2) {
            return false;
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i2, Bundle bundle) {
        boolean z2 = this.f17354h;
        if (z2) {
            return false;
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z2 = this.f17354h;
        return z2 ? this.f17350b : z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i2) {
        boolean z2 = this.f17354h;
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
        boolean z2 = this.f17354h;
        if (!z2) {
            return z2;
        }
        b(new DeleteSurroundingTextCommand(i2, i3));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i2, int i3) {
        boolean z2 = this.f17354h;
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
        boolean z2 = this.f17354h;
        if (!z2) {
            return z2;
        }
        b(new Object());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i2) {
        TextFieldValue textFieldValue = this.d;
        return TextUtils.getCapsMode(textFieldValue.f17361a.f16880a, TextRange.f(textFieldValue.f17362b), i2);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i2) {
        boolean z2 = (i2 & 1) != 0;
        this.f17352f = z2;
        if (z2) {
            this.e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return InputState_androidKt.a(this.d);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i2) {
        if (TextRange.c(this.d.f17362b)) {
            return null;
        }
        return TextFieldValueKt.a(this.d).f16880a;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i2, int i3) {
        return TextFieldValueKt.b(this.d, i2).f16880a;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i2, int i3) {
        return TextFieldValueKt.c(this.d, i2).f16880a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i2) {
        boolean z2 = this.f17354h;
        if (z2) {
            z2 = false;
            switch (i2) {
                case R.id.selectAll:
                    b(new SetSelectionCommand(0, this.d.f17361a.f16880a.length()));
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
        boolean z2 = this.f17354h;
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
                this.f17349a.b(i3);
            }
            i3 = 1;
            this.f17349a.b(i3);
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z2 = this.f17354h;
        if (z2) {
            return true;
        }
        return z2;
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
        boolean z6 = this.f17354h;
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
        this.f17349a.e(z8, z9, z4, z5, z2, z3);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z2 = this.f17354h;
        if (!z2) {
            return z2;
        }
        this.f17349a.c(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i2, int i3) {
        boolean z2 = this.f17354h;
        if (z2) {
            b(new SetComposingRegionCommand(i2, i3));
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i2) {
        boolean z2 = this.f17354h;
        if (z2) {
            b(new SetComposingTextCommand(String.valueOf(charSequence), i2));
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i2, int i3) {
        boolean z2 = this.f17354h;
        if (!z2) {
            return z2;
        }
        b(new SetSelectionCommand(i2, i3));
        return true;
    }
}

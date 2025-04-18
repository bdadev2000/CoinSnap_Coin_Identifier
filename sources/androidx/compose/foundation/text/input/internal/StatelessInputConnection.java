package androidx.compose.foundation.text.input.internal;

import android.R;
import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.text.TextRange;
import androidx.core.view.inputmethod.InputConnectionCompat;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import q0.l;
import z0.m;

@StabilityInferred
/* loaded from: classes.dex */
public final class StatelessInputConnection implements InputConnection {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputSession f6483a;

    /* renamed from: b, reason: collision with root package name */
    public int f6484b;

    /* renamed from: c, reason: collision with root package name */
    public final MutableVector f6485c = new MutableVector(new l[16]);
    public final InputConnection d;

    public StatelessInputConnection(AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1 androidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1, EditorInfo editorInfo) {
        this.f6483a = androidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1;
        this.d = InputConnectionCompat.a(new InputConnectionWrapper(this, false), editorInfo, new InputConnectionCompat.OnCommitContentListener() { // from class: androidx.compose.foundation.text.input.internal.StatelessInputConnection$commitContentDelegateInputConnection$1
            @Override // androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener
            public final boolean a(InputContentInfoCompat inputContentInfoCompat, int i2, Bundle bundle) {
                int i3 = i2 & 1;
                StatelessInputConnection statelessInputConnection = StatelessInputConnection.this;
                if (i3 != 0) {
                    try {
                        inputContentInfoCompat.d();
                        Object e = inputContentInfoCompat.e();
                        p0.a.q(e, "null cannot be cast to non-null type android.os.Parcelable");
                        Parcelable parcelable = (Parcelable) e;
                        bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                        bundle.putParcelable("EXTRA_INPUT_CONTENT_INFO", parcelable);
                    } catch (Exception e2) {
                        e2.toString();
                        statelessInputConnection.getClass();
                        return false;
                    }
                }
                TextInputSession textInputSession = statelessInputConnection.f6483a;
                ClipEntry clipEntry = new ClipEntry(new ClipData(inputContentInfoCompat.b(), new ClipData.Item(inputContentInfoCompat.a())));
                inputContentInfoCompat.b();
                inputContentInfoCompat.c();
                if (bundle == null) {
                    Bundle bundle2 = Bundle.EMPTY;
                }
                return textInputSession.d(new TransferableContent(clipEntry));
            }
        });
    }

    public final void b(l lVar) {
        this.f6484b++;
        try {
            this.f6485c.b(lVar);
        } finally {
            c();
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        this.f6484b++;
        return true;
    }

    public final boolean c() {
        int i2 = this.f6484b - 1;
        this.f6484b = i2;
        if (i2 == 0) {
            MutableVector mutableVector = this.f6485c;
            if (mutableVector.m()) {
                this.f6483a.e(new StatelessInputConnection$endBatchEditInternal$1(this));
                mutableVector.g();
            }
        }
        return this.f6484b > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i2) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f6485c.g();
        this.f6484b = 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        Objects.toString(completionInfo != null ? completionInfo.getText() : null);
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i2, Bundle bundle) {
        Objects.toString(inputContentInfo);
        Objects.toString(bundle);
        return Api25CommitContentImpl.f6365a.a(this.d, inputContentInfo, i2, bundle);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i2) {
        Objects.toString(charSequence);
        b(new StatelessInputConnection$commitText$1(i2, charSequence));
        return true;
    }

    public final void d(int i2) {
        sendKeyEvent(new KeyEvent(0, i2));
        sendKeyEvent(new KeyEvent(1, i2));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i2, int i3) {
        b(new StatelessInputConnection$deleteSurroundingText$1(i2, i3));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i2, int i3) {
        b(new StatelessInputConnection$deleteSurroundingTextInCodePoints$1(i2, i3));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return c();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        b(StatelessInputConnection$finishComposingText$1.f6494a);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i2) {
        TextInputSession textInputSession = this.f6483a;
        return TextUtils.getCapsMode(textInputSession.a(), TextRange.f(textInputSession.a().f6298b), i2);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i2) {
        Objects.toString(extractedTextRequest);
        TextFieldCharSequence a2 = this.f6483a.a();
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = a2;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = a2.f6297a.length();
        extractedText.partialStartOffset = -1;
        long j2 = a2.f6298b;
        extractedText.selectionStart = TextRange.f(j2);
        extractedText.selectionEnd = TextRange.e(j2);
        extractedText.flags = !m.N0(a2, '\n') ? 1 : 0;
        return extractedText;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i2) {
        TextInputSession textInputSession = this.f6483a;
        if (TextRange.c(textInputSession.a().f6298b)) {
            return null;
        }
        TextFieldCharSequence a2 = textInputSession.a();
        return a2.f6297a.subSequence(TextRange.f(a2.f6298b), TextRange.e(a2.f6298b)).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i2, int i3) {
        TextFieldCharSequence a2 = this.f6483a.a();
        int e = TextRange.e(a2.f6298b);
        int e2 = TextRange.e(a2.f6298b) + i2;
        CharSequence charSequence = a2.f6297a;
        return charSequence.subSequence(e, Math.min(e2, charSequence.length())).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i2, int i3) {
        TextFieldCharSequence a2 = this.f6483a.a();
        return a2.f6297a.subSequence(Math.max(0, TextRange.f(a2.f6298b) - i2), TextRange.f(a2.f6298b)).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i2) {
        switch (i2) {
            case R.id.selectAll:
                b(new StatelessInputConnection$performContextMenuAction$1(this));
                return false;
            case R.id.cut:
                d(277);
                return false;
            case R.id.copy:
                d(278);
                return false;
            case R.id.paste:
                d(279);
                return false;
            default:
                return false;
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i2) {
        int i3;
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
            }
            this.f6483a.b(i3);
            return true;
        }
        i3 = 1;
        this.f6483a.b(i3);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        Objects.toString(handwritingGesture);
        Objects.toString(executor);
        Objects.toString(intConsumer);
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        Api34PerformHandwritingGestureImpl.f6367a.a(this.f6483a, handwritingGesture, executor, intConsumer);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        Objects.toString(bundle);
        return ((InputConnectionWrapper) this.d).performPrivateCommand(str, bundle);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        Objects.toString(previewableHandwritingGesture);
        Objects.toString(cancellationSignal);
        if (Build.VERSION.SDK_INT < 34) {
            return false;
        }
        return Api34PerformHandwritingGestureImpl.f6367a.b(this.f6483a, previewableHandwritingGesture, cancellationSignal);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z2) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i2) {
        this.f6483a.requestCursorUpdates(i2);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        Objects.toString(keyEvent);
        this.f6483a.sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i2, int i3) {
        b(new StatelessInputConnection$setComposingRegion$1(i2, i3));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i2) {
        Objects.toString(charSequence);
        b(new StatelessInputConnection$setComposingText$1(i2, charSequence));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i2, int i3) {
        b(new StatelessInputConnection$setSelection$1(i2, i3));
        return true;
    }
}

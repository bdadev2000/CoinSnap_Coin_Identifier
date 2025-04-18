package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import androidx.compose.foundation.text.DeadKeyCombiner;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextToolbarState;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.TextRange;

@StabilityInferred
/* loaded from: classes2.dex */
public abstract class TextFieldKeyEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final TextFieldPreparedSelectionState f6612a;

    /* renamed from: b, reason: collision with root package name */
    public final DeadKeyCombiner f6613b;

    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[KeyCommand.values().length];
            try {
                iArr[16] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[17] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[18] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[3] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[2] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[5] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[4] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[10] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[11] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[12] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[13] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[6] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[7] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[8] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[9] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[14] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[15] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[19] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[20] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[21] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[22] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[23] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[24] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[43] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[44] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[25] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[26] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[27] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[34] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[35] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[37] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[36] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[38] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[39] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[40] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[41] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[28] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[29] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[30] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[31] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[32] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[33] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[42] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[45] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[46] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[47] = 48;
            } catch (NoSuchFieldError unused48) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelectionState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, androidx.compose.foundation.text.DeadKeyCombiner] */
    public TextFieldKeyEventHandler() {
        ?? obj = new Object();
        obj.f6713a = Float.NaN;
        this.f6612a = obj;
        this.f6613b = new Object();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:46:0x00e6. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(android.view.KeyEvent r23, androidx.compose.foundation.text.input.internal.TransformedTextFieldState r24, androidx.compose.foundation.text.input.internal.TextLayoutState r25, androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r26, boolean r27, boolean r28, q0.a r29) {
        /*
            Method dump skipped, instructions count: 1854
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler.a(android.view.KeyEvent, androidx.compose.foundation.text.input.internal.TransformedTextFieldState, androidx.compose.foundation.text.input.internal.TextLayoutState, androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState, boolean, boolean, q0.a):boolean");
    }

    public boolean b(KeyEvent keyEvent, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, FocusManager focusManager, SoftwareKeyboardController softwareKeyboardController) {
        if (TextRange.c(transformedTextFieldState.d().f6298b) || keyEvent.getKeyCode() != 4 || !KeyEventType.a(KeyEvent_androidKt.a(keyEvent), 1)) {
            return false;
        }
        TransformedTextFieldState transformedTextFieldState2 = textFieldSelectionState.f6714a;
        if (!TextRange.c(transformedTextFieldState2.d().f6298b)) {
            InputTransformation inputTransformation = transformedTextFieldState2.f6652b;
            TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.f6873a;
            TextFieldState textFieldState = transformedTextFieldState2.f6651a;
            textFieldState.f6307b.f6400b.b();
            EditingBuffer editingBuffer = textFieldState.f6307b;
            editingBuffer.h((int) (editingBuffer.e() & 4294967295L), (int) (editingBuffer.e() & 4294967295L));
            TextFieldState.a(textFieldState, inputTransformation, true, textFieldEditUndoBehavior);
        }
        textFieldSelectionState.z(false);
        textFieldSelectionState.A(TextToolbarState.f6863a);
        return true;
    }
}

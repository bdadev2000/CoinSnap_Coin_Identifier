package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextPreparedSelectionState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import d0.b0;
import e0.u;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.r;
import q0.l;

@StabilityInferred
/* loaded from: classes3.dex */
public final class TextFieldKeyInput {

    /* renamed from: a, reason: collision with root package name */
    public final LegacyTextFieldState f6134a;

    /* renamed from: b, reason: collision with root package name */
    public final TextFieldSelectionManager f6135b;

    /* renamed from: c, reason: collision with root package name */
    public final TextFieldValue f6136c;
    public final boolean d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final TextPreparedSelectionState f6137f;

    /* renamed from: g, reason: collision with root package name */
    public final OffsetMapping f6138g;

    /* renamed from: h, reason: collision with root package name */
    public final UndoManager f6139h;

    /* renamed from: i, reason: collision with root package name */
    public final DeadKeyCombiner f6140i;

    /* renamed from: j, reason: collision with root package name */
    public final KeyMapping f6141j;

    /* renamed from: k, reason: collision with root package name */
    public final l f6142k;

    /* renamed from: l, reason: collision with root package name */
    public final int f6143l;

    /* renamed from: androidx.compose.foundation.text.TextFieldKeyInput$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass1 extends r implements l {
        @Override // q0.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b0.f30125a;
        }
    }

    public TextFieldKeyInput(LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z2, boolean z3, TextPreparedSelectionState textPreparedSelectionState, OffsetMapping offsetMapping, UndoManager undoManager, DeadKeyCombiner deadKeyCombiner, l lVar, int i2) {
        KeyMapping_androidKt$platformDefaultKeyMapping$1 keyMapping_androidKt$platformDefaultKeyMapping$1 = KeyMapping_androidKt.f6005a;
        this.f6134a = legacyTextFieldState;
        this.f6135b = textFieldSelectionManager;
        this.f6136c = textFieldValue;
        this.d = z2;
        this.e = z3;
        this.f6137f = textPreparedSelectionState;
        this.f6138g = offsetMapping;
        this.f6139h = undoManager;
        this.f6140i = deadKeyCombiner;
        this.f6141j = keyMapping_androidKt$platformDefaultKeyMapping$1;
        this.f6142k = lVar;
        this.f6143l = i2;
    }

    public final void a(List list) {
        EditProcessor editProcessor = this.f6134a.d;
        ArrayList b12 = u.b1(list);
        b12.add(0, new Object());
        this.f6142k.invoke(editProcessor.a(b12));
    }
}

package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.text.input.EditCommand;

/* loaded from: classes3.dex */
public final class HandwritingGesture_androidKt$compoundEditCommand$1 implements EditCommand {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EditCommand[] f6413a;

    public HandwritingGesture_androidKt$compoundEditCommand$1(EditCommand[] editCommandArr) {
        this.f6413a = editCommandArr;
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public final void a(androidx.compose.ui.text.input.EditingBuffer editingBuffer) {
        for (EditCommand editCommand : this.f6413a) {
            editCommand.a(editingBuffer);
        }
    }
}

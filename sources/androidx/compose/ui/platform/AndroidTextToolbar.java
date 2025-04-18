package androidx.compose.ui.platform;

import android.view.ActionMode;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.actionmodecallback.FloatingTextActionModeCallback;
import androidx.compose.ui.platform.actionmodecallback.TextActionModeCallback;

@StabilityInferred
/* loaded from: classes4.dex */
public final class AndroidTextToolbar implements TextToolbar {

    /* renamed from: a, reason: collision with root package name */
    public final View f16368a;

    /* renamed from: b, reason: collision with root package name */
    public ActionMode f16369b;

    /* renamed from: c, reason: collision with root package name */
    public final TextActionModeCallback f16370c = new TextActionModeCallback(new AndroidTextToolbar$textActionModeCallback$1(this));
    public TextToolbarStatus d = TextToolbarStatus.f16602b;

    public AndroidTextToolbar(View view) {
        this.f16368a = view;
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    public final void a(Rect rect, q0.a aVar, q0.a aVar2, q0.a aVar3, q0.a aVar4) {
        TextActionModeCallback textActionModeCallback = this.f16370c;
        textActionModeCallback.f16712b = rect;
        textActionModeCallback.f16713c = aVar;
        textActionModeCallback.e = aVar3;
        textActionModeCallback.d = aVar2;
        textActionModeCallback.f16714f = aVar4;
        ActionMode actionMode = this.f16369b;
        if (actionMode != null) {
            if (actionMode != null) {
                actionMode.invalidate();
            }
        } else {
            this.d = TextToolbarStatus.f16601a;
            this.f16369b = TextToolbarHelperMethods.f16600a.b(this.f16368a, new FloatingTextActionModeCallback(textActionModeCallback), 1);
        }
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    public final TextToolbarStatus getStatus() {
        return this.d;
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    public final void hide() {
        this.d = TextToolbarStatus.f16602b;
        ActionMode actionMode = this.f16369b;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.f16369b = null;
    }
}

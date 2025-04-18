package androidx.compose.ui.platform.actionmodecallback;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import q0.a;

@StabilityInferred
@RequiresApi
/* loaded from: classes3.dex */
public final class FloatingTextActionModeCallback extends ActionMode.Callback2 {

    /* renamed from: a, reason: collision with root package name */
    public final TextActionModeCallback f16704a;

    public FloatingTextActionModeCallback(TextActionModeCallback textActionModeCallback) {
        this.f16704a = textActionModeCallback;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f16704a.c(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        this.f16704a.d(actionMode, menu);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        a aVar = this.f16704a.f16711a;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        androidx.compose.ui.geometry.Rect rect2 = this.f16704a.f16712b;
        if (rect != null) {
            rect.set((int) rect2.f14914a, (int) rect2.f14915b, (int) rect2.f14916c, (int) rect2.d);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return this.f16704a.e(actionMode, menu);
    }
}

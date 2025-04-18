package t0;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class p implements ActionMode.Callback {
    public final ActionMode.Callback a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f25166b;

    /* renamed from: c, reason: collision with root package name */
    public Class f25167c;

    /* renamed from: d, reason: collision with root package name */
    public Method f25168d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f25169e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f25170f = false;

    public p(ActionMode.Callback callback, TextView textView) {
        this.a = callback;
        this.f25166b = textView;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.a.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.a.onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.a.onDestroyActionMode(actionMode);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009f A[SYNTHETIC] */
    @Override // android.view.ActionMode.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onPrepareActionMode(android.view.ActionMode r14, android.view.Menu r15) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.p.onPrepareActionMode(android.view.ActionMode, android.view.Menu):boolean");
    }
}

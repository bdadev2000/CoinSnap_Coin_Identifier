package o;

import android.view.ActionMode;
import android.view.SearchEvent;
import android.view.Window;

/* loaded from: classes.dex */
public abstract class l {
    public static boolean a(Window.Callback callback, SearchEvent searchEvent) {
        return callback.onSearchRequested(searchEvent);
    }

    public static ActionMode b(Window.Callback callback, ActionMode.Callback callback2, int i9) {
        return callback.onWindowStartingActionMode(callback2, i9);
    }
}

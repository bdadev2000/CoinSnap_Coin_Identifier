package o;

import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.Window;
import java.util.List;

/* loaded from: classes.dex */
public abstract class m {
    public static void a(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i9) {
        callback.onProvideKeyboardShortcuts(list, menu, i9);
    }
}

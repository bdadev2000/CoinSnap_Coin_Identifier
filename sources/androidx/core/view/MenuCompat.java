package androidx.core.view;

import android.view.Menu;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public final class MenuCompat {

    @RequiresApi
    /* loaded from: classes.dex */
    public static class Api28Impl {
        @DoNotInline
        public static void a(Menu menu, boolean z2) {
            menu.setGroupDividerEnabled(z2);
        }
    }
}

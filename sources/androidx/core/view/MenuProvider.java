package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

/* loaded from: classes3.dex */
public interface MenuProvider {
    default void a(Menu menu) {
    }

    default void b(Menu menu) {
    }

    boolean c(MenuItem menuItem);

    void d(Menu menu, MenuInflater menuInflater);
}

package androidx.loader.app;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import java.io.PrintWriter;

/* loaded from: classes3.dex */
public abstract class LoaderManager {

    /* loaded from: classes3.dex */
    public interface LoaderCallbacks<D> {
    }

    public static LoaderManager b(LifecycleOwner lifecycleOwner) {
        return new LoaderManagerImpl(lifecycleOwner, ((ViewModelStoreOwner) lifecycleOwner).getViewModelStore());
    }

    public abstract void a(String str, PrintWriter printWriter);

    public abstract void c();
}

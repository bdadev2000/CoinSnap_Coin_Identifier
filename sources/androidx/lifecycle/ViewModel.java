package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.lifecycle.viewmodel.internal.ViewModelImpl;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.io.Closeable;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public abstract class ViewModel {

    @Nullable
    private final ViewModelImpl impl = new ViewModelImpl();

    public void addCloseable(@NotNull AutoCloseable autoCloseable) {
        p0.a.s(autoCloseable, "closeable");
        ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null) {
            viewModelImpl.a(autoCloseable);
        }
    }

    @MainThread
    public final void clear$lifecycle_viewmodel_release() {
        ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null && !viewModelImpl.d) {
            viewModelImpl.d = true;
            synchronized (viewModelImpl.f20244a) {
                try {
                    Iterator it = viewModelImpl.f20245b.values().iterator();
                    while (it.hasNext()) {
                        ViewModelImpl.b((AutoCloseable) it.next());
                    }
                    Iterator it2 = viewModelImpl.f20246c.iterator();
                    while (it2.hasNext()) {
                        ViewModelImpl.b((AutoCloseable) it2.next());
                    }
                    viewModelImpl.f20246c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        onCleared();
    }

    @Nullable
    public final <T extends AutoCloseable> T getCloseable(@NotNull String str) {
        T t2;
        p0.a.s(str, SDKConstants.PARAM_KEY);
        ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl == null) {
            return null;
        }
        synchronized (viewModelImpl.f20244a) {
            t2 = (T) viewModelImpl.f20245b.get(str);
        }
        return t2;
    }

    public void onCleared() {
    }

    @d0.a
    public /* synthetic */ void addCloseable(Closeable closeable) {
        p0.a.s(closeable, "closeable");
        ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null) {
            viewModelImpl.a(closeable);
        }
    }

    public final void addCloseable(@NotNull String str, @NotNull AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        p0.a.s(str, SDKConstants.PARAM_KEY);
        p0.a.s(autoCloseable, "closeable");
        ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null) {
            if (viewModelImpl.d) {
                ViewModelImpl.b(autoCloseable);
                return;
            }
            synchronized (viewModelImpl.f20244a) {
                autoCloseable2 = (AutoCloseable) viewModelImpl.f20245b.put(str, autoCloseable);
            }
            ViewModelImpl.b(autoCloseable2);
        }
    }
}

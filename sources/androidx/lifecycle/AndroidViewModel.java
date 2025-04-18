package androidx.lifecycle;

import android.app.Application;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class AndroidViewModel extends ViewModel {

    @NotNull
    private final Application application;

    public AndroidViewModel(Application application) {
        p0.a.s(application, "application");
        this.application = application;
    }

    @NotNull
    public <T extends Application> T getApplication() {
        T t2 = (T) this.application;
        p0.a.q(t2, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        return t2;
    }
}

package n0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import androidx.core.view.ViewCompat;

/* loaded from: classes.dex */
public final class q0 implements View.OnApplyWindowInsetsListener {
    public r2 a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f22343b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f22344c;

    public q0(View view, z zVar) {
        this.f22343b = view;
        this.f22344c = zVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        r2 h10 = r2.h(view, windowInsets);
        int i10 = Build.VERSION.SDK_INT;
        z zVar = this.f22344c;
        if (i10 < 30) {
            r0.a(windowInsets, this.f22343b);
            if (h10.equals(this.a)) {
                return zVar.t(view, h10).g();
            }
        }
        this.a = h10;
        r2 t5 = zVar.t(view, h10);
        if (i10 >= 30) {
            return t5.g();
        }
        ViewCompat.requestApplyInsets(view);
        return t5.g();
    }
}

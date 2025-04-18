package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;

/* loaded from: classes4.dex */
final class InsetsListener extends WindowInsetsAnimationCompat.Callback implements Runnable, OnApplyWindowInsetsListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final WindowInsetsHolder f4011a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4012b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4013c;
    public WindowInsetsCompat d;

    public InsetsListener(WindowInsetsHolder windowInsetsHolder) {
        super(!windowInsetsHolder.f4155u ? 1 : 0);
        this.f4011a = windowInsetsHolder;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        this.d = windowInsetsCompat;
        WindowInsetsHolder windowInsetsHolder = this.f4011a;
        windowInsetsHolder.getClass();
        windowInsetsHolder.f4153s.f(WindowInsets_androidKt.a(windowInsetsCompat.e(8)));
        if (this.f4012b) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f4013c) {
            windowInsetsHolder.f4154t.f(WindowInsets_androidKt.a(windowInsetsCompat.e(8)));
            WindowInsetsHolder.a(windowInsetsHolder, windowInsetsCompat);
        }
        return windowInsetsHolder.f4155u ? WindowInsetsCompat.f18788b : windowInsetsCompat;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final void onEnd(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        this.f4012b = false;
        this.f4013c = false;
        WindowInsetsCompat windowInsetsCompat = this.d;
        if (windowInsetsAnimationCompat.a() != 0 && windowInsetsCompat != null) {
            WindowInsetsHolder windowInsetsHolder = this.f4011a;
            windowInsetsHolder.getClass();
            windowInsetsHolder.f4154t.f(WindowInsets_androidKt.a(windowInsetsCompat.e(8)));
            windowInsetsHolder.f4153s.f(WindowInsets_androidKt.a(windowInsetsCompat.e(8)));
            WindowInsetsHolder.a(windowInsetsHolder, windowInsetsCompat);
        }
        this.d = null;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final void onPrepare(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        this.f4012b = true;
        this.f4013c = true;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final WindowInsetsCompat onProgress(WindowInsetsCompat windowInsetsCompat, List list) {
        WindowInsetsHolder windowInsetsHolder = this.f4011a;
        WindowInsetsHolder.a(windowInsetsHolder, windowInsetsCompat);
        return windowInsetsHolder.f4155u ? WindowInsetsCompat.f18788b : windowInsetsCompat;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final WindowInsetsAnimationCompat.BoundsCompat onStart(WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsetsAnimationCompat.BoundsCompat boundsCompat) {
        this.f4012b = false;
        return boundsCompat;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f4012b) {
            this.f4012b = false;
            this.f4013c = false;
            WindowInsetsCompat windowInsetsCompat = this.d;
            if (windowInsetsCompat != null) {
                WindowInsetsHolder windowInsetsHolder = this.f4011a;
                windowInsetsHolder.getClass();
                windowInsetsHolder.f4154t.f(WindowInsets_androidKt.a(windowInsetsCompat.e(8)));
                WindowInsetsHolder.a(windowInsetsHolder, windowInsetsCompat);
                this.d = null;
            }
        }
    }
}

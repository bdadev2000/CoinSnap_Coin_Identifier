package o9;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import n9.h0;

/* loaded from: classes3.dex */
public final class t implements r, DisplayManager.DisplayListener {
    public final DisplayManager a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.core.app.h f23246b;

    public t(DisplayManager displayManager) {
        this.a = displayManager;
    }

    @Override // o9.r
    public final void a() {
        this.a.unregisterDisplayListener(this);
        this.f23246b = null;
    }

    @Override // o9.r
    public final void b(androidx.core.app.h hVar) {
        this.f23246b = hVar;
        Handler j3 = h0.j(null);
        DisplayManager displayManager = this.a;
        displayManager.registerDisplayListener(this, j3);
        hVar.g(displayManager.getDisplay(0));
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i10) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i10) {
        androidx.core.app.h hVar = this.f23246b;
        if (hVar != null && i10 == 0) {
            hVar.g(this.a.getDisplay(0));
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i10) {
    }
}

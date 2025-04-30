package r2;

import B1.f;
import android.graphics.Point;
import android.util.Log;
import android.view.MotionEvent;
import androidx.lifecycle.InterfaceC0495e;
import androidx.lifecycle.InterfaceC0511v;
import com.google.ar.core.Session;
import com.google.ar.core.exceptions.CameraNotAvailableException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p6.AbstractC2572a;
import s2.AbstractC2694b;
import s2.C2695c;
import s2.d;

/* renamed from: r2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2657a extends f implements InterfaceC0495e {

    /* renamed from: d, reason: collision with root package name */
    public d f22813d;

    /* renamed from: f, reason: collision with root package name */
    public Point f22814f;

    /* renamed from: g, reason: collision with root package name */
    public MotionEvent f22815g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f22816h;

    @Override // androidx.lifecycle.InterfaceC0495e
    public final void a(InterfaceC0511v interfaceC0511v) {
        C2695c c2695c = AbstractC2694b.f22970a;
        c2695c.getClass();
        try {
            Session session = c2695c.f22971a;
            if (session != null) {
                session.resume();
                AbstractC2572a.a(null, com.mbridge.msdk.foundation.controller.a.f15376a.concat(":resumeSession"));
            }
        } catch (CameraNotAvailableException unused) {
            Log.e(com.mbridge.msdk.foundation.controller.a.f15376a, "Camera not available. Please restart the app.");
            c2695c.f22971a = null;
        }
    }

    @Override // androidx.lifecycle.InterfaceC0495e
    public final void c(InterfaceC0511v interfaceC0511v) {
        Session session = AbstractC2694b.f22970a.f22971a;
        if (session != null) {
            session.pause();
            AbstractC2572a.a(null, com.mbridge.msdk.foundation.controller.a.f15376a.concat(":pauseSession"));
        }
    }

    @Override // androidx.lifecycle.InterfaceC0495e
    public final void onDestroy(InterfaceC0511v interfaceC0511v) {
        C2695c c2695c = AbstractC2694b.f22970a;
        Session session = c2695c.f22971a;
        if (session != null) {
            session.close();
            c2695c.f22971a = null;
            AbstractC2572a.a(null, com.mbridge.msdk.foundation.controller.a.f15376a.concat(":closeSession"));
        }
        ((WeakReference) this.f273c).clear();
    }
}

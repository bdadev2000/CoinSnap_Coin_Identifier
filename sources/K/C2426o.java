package k;

import android.util.Log;
import android.view.View;
import android.view.Window;
import androidx.core.view.ViewCompat;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeoutException;
import p.MenuC2533l;
import p.SubMenuC2521D;
import q.C2605j;
import q.InterfaceC2613n;
import r0.AbstractC2654b;
import u4.AbstractC2755B;
import u4.C2769n;
import u4.CallableC2765j;

/* renamed from: k.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2426o implements p.w, OnSuccessListener, OnFailureListener, OnCanceledListener, InterfaceC2613n, U.t {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public Object f21320c;

    public /* synthetic */ C2426o(Object obj, int i9) {
        this.b = i9;
        this.f21320c = obj;
    }

    public boolean a() {
        if (((AbstractC2654b) this.f21320c) == null) {
            return true;
        }
        return false;
    }

    @Override // p.w
    public void b(MenuC2533l menuC2533l, boolean z8) {
        switch (this.b) {
            case 0:
                ((w) this.f21320c).r(menuC2533l);
                return;
            default:
                if (menuC2533l instanceof SubMenuC2521D) {
                    ((SubMenuC2521D) menuC2533l).f22048B.k().c(false);
                }
                p.w wVar = ((C2605j) this.f21320c).f22663g;
                if (wVar != null) {
                    wVar.b(menuC2533l, z8);
                    return;
                }
                return;
        }
    }

    @Override // U.t
    public boolean c(View view) {
        int width;
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f21320c;
        boolean z8 = false;
        if (!swipeDismissBehavior.v(view)) {
            return false;
        }
        if (ViewCompat.getLayoutDirection(view) == 1) {
            z8 = true;
        }
        int i9 = swipeDismissBehavior.f13909d;
        if ((i9 == 0 && z8) || (i9 == 1 && !z8)) {
            width = -view.getWidth();
        } else {
            width = view.getWidth();
        }
        ViewCompat.offsetLeftAndRight(view, width);
        view.setAlpha(0.0f);
        return true;
    }

    public void d(B4.c cVar, Thread thread, Throwable th) {
        C2769n c2769n = (C2769n) this.f21320c;
        synchronized (c2769n) {
            String str = "Handling uncaught exception \"" + th + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            try {
                try {
                    AbstractC2755B.a(c2769n.f23138e.l(new CallableC2765j(c2769n, System.currentTimeMillis(), th, thread, cVar)));
                } catch (TimeoutException unused) {
                    Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                }
            } catch (Exception e4) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e4);
            }
        }
    }

    @Override // p.w
    public boolean g(MenuC2533l menuC2533l) {
        switch (this.b) {
            case 0:
                Window.Callback callback = ((w) this.f21320c).f21378n.getCallback();
                if (callback != null) {
                    callback.onMenuOpened(108, menuC2533l);
                    return true;
                }
                return true;
            default:
                C2605j c2605j = (C2605j) this.f21320c;
                if (menuC2533l == c2605j.f22661d) {
                    return false;
                }
                ((SubMenuC2521D) menuC2533l).f22049C.getClass();
                c2605j.getClass();
                p.w wVar = c2605j.f22663g;
                if (wVar == null) {
                    return false;
                }
                return wVar.g(menuC2533l);
        }
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public void onCanceled() {
        ((CountDownLatch) this.f21320c).countDown();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        ((CountDownLatch) this.f21320c).countDown();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((CountDownLatch) this.f21320c).countDown();
    }

    public C2426o(int i9) {
        this.b = i9;
        switch (i9) {
            case 2:
                return;
            default:
                this.f21320c = new CountDownLatch(1);
                return;
        }
    }
}

package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.p0;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z {
    public final Runnable a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f625b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public q f626c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f627d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f628e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f629f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f630g;

    public z(Runnable runnable) {
        OnBackInvokedCallback a;
        this.a = runnable;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            if (i10 >= 34) {
                int i11 = 0;
                int i12 = 1;
                a = w.a.a(new r(this, i11), new r(this, i12), new s(this, i11), new s(this, i12));
            } else {
                a = u.a.a(new s(this, 2));
            }
            this.f627d = a;
        }
    }

    public final void a(androidx.lifecycle.v owner, q onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        androidx.lifecycle.p lifecycle = owner.getLifecycle();
        if (((androidx.lifecycle.x) lifecycle).f1835d == androidx.lifecycle.o.DESTROYED) {
            return;
        }
        OnBackPressedDispatcher$LifecycleOnBackPressedCancellable cancellable = new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(this, lifecycle, onBackPressedCallback);
        onBackPressedCallback.getClass();
        Intrinsics.checkNotNullParameter(cancellable, "cancellable");
        onBackPressedCallback.f587b.add(cancellable);
        d();
        onBackPressedCallback.f588c = new y(this, 0);
    }

    public final void b() {
        Object obj;
        ArrayDeque arrayDeque = this.f625b;
        ListIterator<E> listIterator = arrayDeque.listIterator(arrayDeque.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                obj = listIterator.previous();
                if (((q) obj).a) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        q qVar = (q) obj;
        this.f626c = null;
        if (qVar != null) {
            ((p0) qVar).f1702d.handleOnBackPressed();
            return;
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(boolean z10) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f628e;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f627d) != null) {
            u uVar = u.a;
            if (z10 && !this.f629f) {
                uVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
                this.f629f = true;
            } else if (!z10 && this.f629f) {
                uVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
                this.f629f = false;
            }
        }
    }

    public final void d() {
        boolean z10;
        boolean z11 = this.f630g;
        ArrayDeque arrayDeque = this.f625b;
        if (!(arrayDeque instanceof Collection) || !arrayDeque.isEmpty()) {
            Iterator<E> it = arrayDeque.iterator();
            while (it.hasNext()) {
                if (((q) it.next()).a) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        this.f630g = z10;
        if (z10 != z11 && Build.VERSION.SDK_INT >= 33) {
            c(z10);
        }
    }
}

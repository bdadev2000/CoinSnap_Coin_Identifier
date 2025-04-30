package androidx.lifecycle;

import android.app.Dialog;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0487w;
import androidx.fragment.app.FragmentManager;
import java.util.Map;
import r.C2650a;
import s.C2687d;
import s.C2689f;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public abstract class B {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f4818k = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f4819a = new Object();
    public final C2689f b = new C2689f();

    /* renamed from: c, reason: collision with root package name */
    public int f4820c = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4821d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f4822e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f4823f;

    /* renamed from: g, reason: collision with root package name */
    public int f4824g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4825h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4826i;

    /* renamed from: j, reason: collision with root package name */
    public final B3.k f4827j;

    public B() {
        Object obj = f4818k;
        this.f4823f = obj;
        this.f4827j = new B3.k(this, 8);
        this.f4822e = obj;
        this.f4824g = -1;
    }

    public static void a(String str) {
        C2650a.v().f22808a.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
        } else {
            throw new IllegalStateException(AbstractC2914a.e("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(A a6) {
        boolean z8;
        Dialog dialog;
        Dialog dialog2;
        Dialog dialog3;
        if (!a6.b) {
            return;
        }
        int i9 = a6.f4816c;
        int i10 = this.f4824g;
        if (i9 >= i10) {
            return;
        }
        a6.f4816c = i10;
        D d2 = a6.f4815a;
        Object obj = this.f4822e;
        androidx.fragment.app.C c9 = (androidx.fragment.app.C) d2;
        c9.getClass();
        if (((InterfaceC0511v) obj) != null) {
            DialogInterfaceOnCancelListenerC0487w dialogInterfaceOnCancelListenerC0487w = (DialogInterfaceOnCancelListenerC0487w) c9.f4618c;
            z8 = dialogInterfaceOnCancelListenerC0487w.mShowsDialog;
            if (z8) {
                View requireView = dialogInterfaceOnCancelListenerC0487w.requireView();
                if (requireView.getParent() == null) {
                    dialog = dialogInterfaceOnCancelListenerC0487w.mDialog;
                    if (dialog != null) {
                        if (FragmentManager.isLoggingEnabled(3)) {
                            StringBuilder sb = new StringBuilder("DialogFragment ");
                            sb.append(c9);
                            sb.append(" setting the content view on ");
                            dialog3 = dialogInterfaceOnCancelListenerC0487w.mDialog;
                            sb.append(dialog3);
                            Log.d(FragmentManager.TAG, sb.toString());
                        }
                        dialog2 = dialogInterfaceOnCancelListenerC0487w.mDialog;
                        dialog2.setContentView(requireView);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
        }
    }

    public final void c(A a6) {
        if (this.f4825h) {
            this.f4826i = true;
            return;
        }
        this.f4825h = true;
        do {
            this.f4826i = false;
            if (a6 != null) {
                b(a6);
                a6 = null;
            } else {
                C2689f c2689f = this.b;
                c2689f.getClass();
                C2687d c2687d = new C2687d(c2689f);
                c2689f.f22960d.put(c2687d, Boolean.FALSE);
                while (c2687d.hasNext()) {
                    b((A) ((Map.Entry) c2687d.next()).getValue());
                    if (this.f4826i) {
                        break;
                    }
                }
            }
        } while (this.f4826i);
        this.f4825h = false;
    }

    public abstract void d(Object obj);
}

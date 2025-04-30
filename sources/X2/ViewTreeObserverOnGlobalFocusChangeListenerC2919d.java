package x2;

import G7.j;
import O7.g;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import com.facebook.appevents.k;
import g4.AbstractC2292b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* renamed from: x2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalFocusChangeListenerC2919d implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: g, reason: collision with root package name */
    public static final HashMap f24222g = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f24224d;
    public final LinkedHashSet b = new LinkedHashSet();

    /* renamed from: c, reason: collision with root package name */
    public final Handler f24223c = new Handler(Looper.getMainLooper());

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f24225f = new AtomicBoolean(false);

    public ViewTreeObserverOnGlobalFocusChangeListenerC2919d(Activity activity) {
        this.f24224d = new WeakReference(activity);
    }

    public final void a(View view) {
        if (O2.a.b(this)) {
            return;
        }
        try {
            k kVar = new k(22, view, this);
            if (!O2.a.b(this)) {
                try {
                    if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                        kVar.run();
                    } else {
                        this.f24223c.post(kVar);
                    }
                } catch (Throwable th) {
                    O2.a.a(this, th);
                }
            }
        } catch (Throwable th2) {
            O2.a.a(this, th2);
        }
    }

    public final void b(View view) {
        String str;
        String str2;
        if (O2.a.b(this)) {
            return;
        }
        try {
            String obj = ((EditText) view).getText().toString();
            if (obj != null) {
                String obj2 = g.a0(obj).toString();
                if (obj2 != null) {
                    String lowerCase = obj2.toLowerCase();
                    j.d(lowerCase, "(this as java.lang.String).toLowerCase()");
                    if (lowerCase.length() != 0) {
                        LinkedHashSet linkedHashSet = this.b;
                        if (!linkedHashSet.contains(lowerCase) && lowerCase.length() <= 100) {
                            linkedHashSet.add(lowerCase);
                            HashMap hashMap = new HashMap();
                            ArrayList b = C2917b.b(view);
                            CopyOnWriteArraySet copyOnWriteArraySet = C2918c.f24219d;
                            Iterator it = new HashSet(C2918c.a()).iterator();
                            ArrayList arrayList = null;
                            while (it.hasNext()) {
                                C2918c c2918c = (C2918c) it.next();
                                if ("r2".equals(c2918c.c())) {
                                    Pattern compile = Pattern.compile("[^\\d.]");
                                    j.d(compile, "compile(...)");
                                    str = compile.matcher(lowerCase).replaceAll("");
                                    j.d(str, "replaceAll(...)");
                                } else {
                                    str = lowerCase;
                                }
                                boolean b8 = O2.a.b(c2918c);
                                String str3 = c2918c.b;
                                if (b8) {
                                    str2 = null;
                                } else {
                                    str2 = str3;
                                }
                                if (str2.length() > 0) {
                                    if (O2.a.b(c2918c)) {
                                        str3 = null;
                                    }
                                    boolean z8 = false;
                                    if (!O2.a.b(C2917b.class)) {
                                        try {
                                            j.e(str3, "rule");
                                            Pattern compile2 = Pattern.compile(str3);
                                            j.d(compile2, "compile(...)");
                                            z8 = compile2.matcher(str).matches();
                                        } catch (Throwable th) {
                                            O2.a.a(C2917b.class, th);
                                        }
                                    }
                                    if (!z8) {
                                    }
                                }
                                if (C2917b.d(b, c2918c.b())) {
                                    C2916a.a(hashMap, c2918c.c(), str);
                                } else {
                                    if (arrayList == null) {
                                        arrayList = C2917b.a(view);
                                    }
                                    if (C2917b.d(arrayList, c2918c.b())) {
                                        C2916a.a(hashMap, c2918c.c(), str);
                                    }
                                }
                            }
                            AbstractC2292b.l(hashMap);
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
        } catch (Throwable th2) {
            O2.a.a(this, th2);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        if (O2.a.b(this)) {
            return;
        }
        if (view != null) {
            try {
                a(view);
            } catch (Throwable th) {
                O2.a.a(this, th);
                return;
            }
        }
        if (view2 != null) {
            a(view2);
        }
    }
}

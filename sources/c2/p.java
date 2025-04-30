package c2;

import T1.C0300f;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Trace;
import android.util.Log;
import b1.C0552e;
import f2.InterfaceC2265c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import y2.AbstractC2947c;

/* loaded from: classes.dex */
public final class p implements j2.h {

    /* renamed from: g, reason: collision with root package name */
    public static volatile p f5401g;
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final Collection f5402c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5403d;

    /* renamed from: f, reason: collision with root package name */
    public final Object f5404f;

    public p() {
        this.b = 1;
        this.f5404f = Collections.newSetFromMap(new WeakHashMap());
        this.f5402c = new HashSet();
    }

    public static p b(Context context) {
        if (f5401g == null) {
            synchronized (p.class) {
                try {
                    if (f5401g == null) {
                        f5401g = new p(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f5401g;
    }

    public boolean a(InterfaceC2265c interfaceC2265c) {
        boolean z8 = true;
        if (interfaceC2265c == null) {
            return true;
        }
        boolean remove = ((Set) this.f5404f).remove(interfaceC2265c);
        if (!((HashSet) this.f5402c).remove(interfaceC2265c) && !remove) {
            z8 = false;
        }
        if (z8) {
            interfaceC2265c.clear();
        }
        return z8;
    }

    public void c() {
        boolean z8;
        if (!this.f5403d && !((HashSet) this.f5402c).isEmpty()) {
            H0.b bVar = (H0.b) this.f5404f;
            j2.h hVar = (j2.h) bVar.f1346d;
            boolean z9 = false;
            if (((ConnectivityManager) hVar.get()).getActiveNetwork() != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            bVar.b = z8;
            try {
                ((ConnectivityManager) hVar.get()).registerDefaultNetworkCallback((C0552e) bVar.f1347e);
                z9 = true;
            } catch (RuntimeException e4) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e4);
                }
            }
            this.f5403d = z9;
        }
    }

    public void d() {
        Iterator it = j2.n.e((Set) this.f5404f).iterator();
        while (it.hasNext()) {
            InterfaceC2265c interfaceC2265c = (InterfaceC2265c) it.next();
            if (!interfaceC2265c.i() && !interfaceC2265c.g()) {
                interfaceC2265c.clear();
                if (!this.f5403d) {
                    interfaceC2265c.h();
                } else {
                    ((HashSet) this.f5402c).add(interfaceC2265c);
                }
            }
        }
    }

    @Override // j2.h
    public Object get() {
        if (!this.f5403d) {
            Trace.beginSection("Glide registry");
            this.f5403d = true;
            try {
                return com.bumptech.glide.d.J((com.bumptech.glide.b) this.f5404f, (List) this.f5402c);
            } finally {
                this.f5403d = false;
                Trace.endSection();
            }
        }
        throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
    }

    public String toString() {
        switch (this.b) {
            case 1:
                return super.toString() + "{numRequests=" + ((Set) this.f5404f).size() + ", isPaused=" + this.f5403d + "}";
            default:
                return super.toString();
        }
    }

    public p(Context context) {
        this.b = 0;
        this.f5402c = new HashSet();
        this.f5404f = new H0.b(new P1.m(new C0300f(context, 4)), new n(this));
    }

    public p(com.bumptech.glide.b bVar, ArrayList arrayList, AbstractC2947c abstractC2947c) {
        this.b = 2;
        this.f5404f = bVar;
        this.f5402c = arrayList;
    }
}

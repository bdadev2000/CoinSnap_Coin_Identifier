package com.mbridge.msdk.foundation.same.e;

import android.content.Context;
import com.mbridge.msdk.foundation.same.e.a;
import com.mbridge.msdk.foundation.tools.af;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class b {
    ThreadPoolExecutor a;

    /* renamed from: b, reason: collision with root package name */
    HashMap<Long, a> f13351b;

    /* renamed from: c, reason: collision with root package name */
    WeakReference<Context> f13352c;

    public b(Context context, int i10) {
        if (af.a().a("c_t_l_t_p", true)) {
            this.a = c.a();
        } else {
            if (i10 == 0) {
                this.a = new ThreadPoolExecutor(1, 5, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            } else {
                this.a = new ThreadPoolExecutor(i10, (i10 * 2) + 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            }
            this.a.allowCoreThreadTimeOut(true);
        }
        this.f13351b = new HashMap<>();
        this.f13352c = new WeakReference<>(context);
    }

    private synchronized void b(final a aVar, final a.InterfaceC0172a interfaceC0172a) {
        this.f13351b.put(Long.valueOf(aVar.getId()), aVar);
        aVar.setOnStateChangeListener(new a.InterfaceC0172a() { // from class: com.mbridge.msdk.foundation.same.e.b.1
            @Override // com.mbridge.msdk.foundation.same.e.a.InterfaceC0172a
            public final void a(a.b bVar) {
                if (bVar == a.b.CANCEL) {
                    b.this.f13351b.remove(Long.valueOf(aVar.getId()));
                } else if (bVar == a.b.FINISH) {
                    b.this.f13351b.remove(Long.valueOf(aVar.getId()));
                } else if (bVar == a.b.RUNNING && b.this.f13352c.get() == null) {
                    b.this.a();
                }
                a.InterfaceC0172a interfaceC0172a2 = interfaceC0172a;
                if (interfaceC0172a2 != null) {
                    interfaceC0172a2.a(bVar);
                }
            }
        });
    }

    public final void a(a aVar) {
        b(aVar, null);
        this.a.execute(aVar);
    }

    public final synchronized void a() {
        try {
            Iterator<Map.Entry<Long, a>> it = this.f13351b.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().cancel();
            }
            this.f13351b.clear();
        } catch (Exception unused) {
        }
    }

    public final void a(a aVar, a.InterfaceC0172a interfaceC0172a) {
        b(aVar, interfaceC0172a);
        this.a.execute(aVar);
    }

    public b(Context context) {
        if (af.a().a("c_t_l_t_p", true)) {
            this.a = c.a();
        } else {
            if (af.a().a("c_t_p_t_l", true)) {
                int availableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
                this.a = new ThreadPoolExecutor(availableProcessors, availableProcessors, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            } else {
                this.a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            }
            this.a.allowCoreThreadTimeOut(true);
        }
        this.f13351b = new HashMap<>();
        this.f13352c = new WeakReference<>(context);
    }
}

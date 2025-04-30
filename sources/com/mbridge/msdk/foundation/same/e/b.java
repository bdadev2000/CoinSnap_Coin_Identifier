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

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    ThreadPoolExecutor f15757a;
    HashMap<Long, a> b;

    /* renamed from: c, reason: collision with root package name */
    WeakReference<Context> f15758c;

    public b(Context context, int i9) {
        if (af.a().a("c_t_l_t_p", true)) {
            this.f15757a = c.a();
        } else {
            if (i9 == 0) {
                this.f15757a = new ThreadPoolExecutor(1, 5, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            } else {
                this.f15757a = new ThreadPoolExecutor(i9, (i9 * 2) + 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            }
            this.f15757a.allowCoreThreadTimeOut(true);
        }
        this.b = new HashMap<>();
        this.f15758c = new WeakReference<>(context);
    }

    private synchronized void b(final a aVar, final a.InterfaceC0160a interfaceC0160a) {
        this.b.put(Long.valueOf(aVar.getId()), aVar);
        aVar.setOnStateChangeListener(new a.InterfaceC0160a() { // from class: com.mbridge.msdk.foundation.same.e.b.1
            @Override // com.mbridge.msdk.foundation.same.e.a.InterfaceC0160a
            public final void a(a.b bVar) {
                if (bVar == a.b.CANCEL) {
                    b.this.b.remove(Long.valueOf(aVar.getId()));
                } else if (bVar == a.b.FINISH) {
                    b.this.b.remove(Long.valueOf(aVar.getId()));
                } else if (bVar == a.b.RUNNING && b.this.f15758c.get() == null) {
                    b.this.a();
                }
                a.InterfaceC0160a interfaceC0160a2 = interfaceC0160a;
                if (interfaceC0160a2 != null) {
                    interfaceC0160a2.a(bVar);
                }
            }
        });
    }

    public final void a(a aVar) {
        b(aVar, null);
        this.f15757a.execute(aVar);
    }

    public final synchronized void a() {
        try {
            Iterator<Map.Entry<Long, a>> it = this.b.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().cancel();
            }
            this.b.clear();
        } catch (Exception unused) {
        } catch (Throwable th) {
            throw th;
        }
    }

    public b(Context context) {
        if (af.a().a("c_t_l_t_p", true)) {
            this.f15757a = c.a();
        } else {
            if (af.a().a("c_t_p_t_l", true)) {
                int availableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
                this.f15757a = new ThreadPoolExecutor(availableProcessors, availableProcessors, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            } else {
                this.f15757a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            }
            this.f15757a.allowCoreThreadTimeOut(true);
        }
        this.b = new HashMap<>();
        this.f15758c = new WeakReference<>(context);
    }

    public final void a(a aVar, a.InterfaceC0160a interfaceC0160a) {
        b(aVar, interfaceC0160a);
        this.f15757a.execute(aVar);
    }
}

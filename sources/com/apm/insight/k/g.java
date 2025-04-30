package com.apm.insight.k;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.Npth;
import com.apm.insight.l.q;
import com.apm.insight.runtime.o;
import com.apm.insight.runtime.p;
import com.apm.insight.runtime.u;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final ConcurrentHashMap<Object, ConcurrentLinkedQueue<com.apm.insight.entity.c>> f5895a = new ConcurrentHashMap<>();
    private static final HashMap<Object, HashMap<String, ConcurrentLinkedQueue<com.apm.insight.entity.c>>> b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private static volatile g f5896c;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f5898e = false;

    /* renamed from: f, reason: collision with root package name */
    private Runnable f5899f = new Runnable() { // from class: com.apm.insight.k.g.1
        @Override // java.lang.Runnable
        public void run() {
            if (Npth.isStopUpload()) {
                return;
            }
            if (!g.b.isEmpty() && o.e()) {
                g.f();
            }
            g.this.c();
            g.this.f5897d.a(g.this.f5899f, 30000L);
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private final u f5897d = p.b();

    private g() {
    }

    public static g a() {
        if (f5896c == null) {
            synchronized (g.class) {
                try {
                    if (f5896c == null) {
                        f5896c = new g();
                    }
                } finally {
                }
            }
        }
        return f5896c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f() {
        HashMap hashMap;
        HashMap<Object, HashMap<String, ConcurrentLinkedQueue<com.apm.insight.entity.c>>> hashMap2 = b;
        synchronized (hashMap2) {
            hashMap = new HashMap(hashMap2);
            hashMap2.clear();
        }
        if (!com.apm.insight.runtime.a.b()) {
            q.a("EventUploadQueue", "ApmConfig not inited, clear cache.");
            return;
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            for (Map.Entry entry2 : ((HashMap) entry.getValue()).entrySet()) {
                String str = (String) entry2.getKey();
                ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) entry2.getValue();
                if (concurrentLinkedQueue == null || (com.apm.insight.runtime.a.b() && !com.apm.insight.runtime.a.a(entry.getKey(), str))) {
                    q.a("EventUploadQueue", "logType " + str + " not sampled");
                } else {
                    while (!concurrentLinkedQueue.isEmpty()) {
                        try {
                            com.apm.insight.entity.c cVar = (com.apm.insight.entity.c) concurrentLinkedQueue.poll();
                            if (cVar != null) {
                                b(entry.getKey(), cVar);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        }
    }

    private static void g() {
        if (o.e() && !Npth.isStopUpload()) {
            try {
                p.b().a(new Runnable() { // from class: com.apm.insight.k.g.3
                    @Override // java.lang.Runnable
                    public void run() {
                        g.a().c();
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    public void c() {
        synchronized (this.f5897d) {
            try {
                if (this.f5898e) {
                    return;
                }
                this.f5898e = true;
                LinkedList linkedList = new LinkedList();
                for (Map.Entry<Object, ConcurrentLinkedQueue<com.apm.insight.entity.c>> entry : f5895a.entrySet()) {
                    ConcurrentLinkedQueue<com.apm.insight.entity.c> value = entry.getValue();
                    Object key = entry.getKey();
                    while (!value.isEmpty()) {
                        for (int i9 = 0; i9 < 30; i9++) {
                            try {
                                if (value.isEmpty()) {
                                    break;
                                }
                                linkedList.add(value.poll());
                            } catch (Throwable th) {
                                q.b(th);
                            }
                        }
                        if (linkedList.isEmpty()) {
                            break;
                        }
                        com.apm.insight.entity.a a6 = com.apm.insight.runtime.a.f.a().a(linkedList, com.apm.insight.entity.b.a(key));
                        if (a6 != null) {
                            q.a((Object) "upload events");
                            d.a().a(a6.h());
                        }
                        linkedList.clear();
                    }
                }
                this.f5898e = false;
            } finally {
            }
        }
    }

    private static void c(Object obj, com.apm.insight.entity.c cVar) {
        ConcurrentLinkedQueue<com.apm.insight.entity.c> concurrentLinkedQueue;
        try {
            String string = cVar.h().getString("log_type");
            HashMap<Object, HashMap<String, ConcurrentLinkedQueue<com.apm.insight.entity.c>>> hashMap = b;
            synchronized (hashMap) {
                try {
                    HashMap<String, ConcurrentLinkedQueue<com.apm.insight.entity.c>> hashMap2 = hashMap.get(string);
                    if (hashMap2 == null) {
                        hashMap2 = new HashMap<>();
                        hashMap.put(obj, hashMap2);
                    }
                    concurrentLinkedQueue = hashMap2.get(string);
                    if (concurrentLinkedQueue == null) {
                        concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
                        hashMap2.put(string, concurrentLinkedQueue);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            concurrentLinkedQueue.add(cVar);
            if (concurrentLinkedQueue.size() > 100) {
                concurrentLinkedQueue.poll();
            }
        } catch (JSONException e4) {
            e4.printStackTrace();
        }
    }

    public void b() {
        if (f5895a.isEmpty()) {
            this.f5897d.a(this.f5899f, 30000L);
        } else {
            this.f5897d.a(this.f5899f);
        }
    }

    public static void a(@NonNull com.apm.insight.entity.c cVar) {
        a(com.apm.insight.h.a(), cVar);
    }

    private static void b(Object obj, com.apm.insight.entity.c cVar) {
        ConcurrentHashMap<Object, ConcurrentLinkedQueue<com.apm.insight.entity.c>> concurrentHashMap;
        ConcurrentLinkedQueue<com.apm.insight.entity.c> concurrentLinkedQueue;
        synchronized (obj) {
            try {
                concurrentHashMap = f5895a;
                concurrentLinkedQueue = concurrentHashMap.get(obj);
                if (concurrentLinkedQueue == null) {
                    concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
                    concurrentHashMap.put(obj, concurrentLinkedQueue);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        concurrentLinkedQueue.add(cVar);
        int size = concurrentHashMap.size();
        boolean z8 = size >= 30;
        q.b("[enqueue] size=" + size);
        if (z8) {
            g();
        }
    }

    public static void a(@Nullable final Object obj, @NonNull final com.apm.insight.entity.c cVar) {
        String str;
        Handler a6 = p.b().a();
        if (a6 == null || a6.getLooper() != Looper.myLooper()) {
            p.b().a(new Runnable() { // from class: com.apm.insight.k.g.2
                @Override // java.lang.Runnable
                public void run() {
                    g.a(obj, cVar);
                }
            });
            return;
        }
        if (obj == null) {
            obj = com.apm.insight.h.a();
        }
        if (!o.e()) {
            q.a("EventUploadQueue", "enqueue before init.");
            c(obj, cVar);
            return;
        }
        if (!com.apm.insight.runtime.a.a(obj)) {
            a.b();
        }
        f();
        try {
            str = cVar.h().getString("log_type");
        } catch (JSONException e4) {
            e4.printStackTrace();
            str = null;
        }
        if (TextUtils.isEmpty(str) || !com.apm.insight.runtime.a.a(obj, str)) {
            q.a("EventUploadQueue", "logType " + str + " not sampled");
            return;
        }
        q.a("EventUploadQueue", "logType " + str + " enqueued");
        b(obj, cVar);
    }
}

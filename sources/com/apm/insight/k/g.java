package com.apm.insight.k;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.Npth;
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
    private static final ConcurrentHashMap<Object, ConcurrentLinkedQueue<com.apm.insight.entity.c>> a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private static final HashMap<Object, HashMap<String, ConcurrentLinkedQueue<com.apm.insight.entity.c>>> f3207b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private static volatile g f3208c;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f3210e = false;

    /* renamed from: f, reason: collision with root package name */
    private Runnable f3211f = new Runnable() { // from class: com.apm.insight.k.g.1
        @Override // java.lang.Runnable
        public void run() {
            if (Npth.isStopUpload()) {
                return;
            }
            if (!g.f3207b.isEmpty() && o.e()) {
                g.f();
            }
            g.this.c();
            g.this.f3209d.a(g.this.f3211f, 30000L);
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private final u f3209d = p.b();

    private g() {
    }

    public static g a() {
        if (f3208c == null) {
            synchronized (g.class) {
                if (f3208c == null) {
                    f3208c = new g();
                }
            }
        }
        return f3208c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f() {
        HashMap hashMap;
        HashMap<Object, HashMap<String, ConcurrentLinkedQueue<com.apm.insight.entity.c>>> hashMap2 = f3207b;
        synchronized (hashMap2) {
            hashMap = new HashMap(hashMap2);
            hashMap2.clear();
        }
        if (!com.apm.insight.runtime.a.b()) {
            com.apm.insight.l.p.a("EventUploadQueue", "ApmConfig not inited, clear cache.");
            return;
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            for (Map.Entry entry2 : ((HashMap) entry.getValue()).entrySet()) {
                String str = (String) entry2.getKey();
                ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) entry2.getValue();
                if (concurrentLinkedQueue == null || (com.apm.insight.runtime.a.b() && !com.apm.insight.runtime.a.a(entry.getKey(), str))) {
                    com.apm.insight.l.p.a("EventUploadQueue", "logType " + str + " not sampled");
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
        synchronized (this.f3209d) {
            if (this.f3210e) {
                return;
            }
            this.f3210e = true;
            LinkedList linkedList = new LinkedList();
            for (Map.Entry<Object, ConcurrentLinkedQueue<com.apm.insight.entity.c>> entry : a.entrySet()) {
                ConcurrentLinkedQueue<com.apm.insight.entity.c> value = entry.getValue();
                Object key = entry.getKey();
                while (!value.isEmpty()) {
                    for (int i10 = 0; i10 < 30; i10++) {
                        try {
                            if (value.isEmpty()) {
                                break;
                            }
                            linkedList.add(value.poll());
                        } catch (Throwable th2) {
                            com.apm.insight.l.p.b(th2);
                        }
                    }
                    if (linkedList.isEmpty()) {
                        break;
                    }
                    com.apm.insight.entity.a a10 = com.apm.insight.runtime.a.f.a().a(linkedList, com.apm.insight.entity.b.a(key));
                    if (a10 != null) {
                        com.apm.insight.l.p.a((Object) "upload events");
                        d.a().a(a10.h());
                    }
                    linkedList.clear();
                }
            }
            this.f3210e = false;
        }
    }

    private static void c(Object obj, com.apm.insight.entity.c cVar) {
        ConcurrentLinkedQueue<com.apm.insight.entity.c> concurrentLinkedQueue;
        try {
            String string = cVar.h().getString("log_type");
            HashMap<Object, HashMap<String, ConcurrentLinkedQueue<com.apm.insight.entity.c>>> hashMap = f3207b;
            synchronized (hashMap) {
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
            }
            concurrentLinkedQueue.add(cVar);
            if (concurrentLinkedQueue.size() > 100) {
                concurrentLinkedQueue.poll();
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public void b() {
        if (a.isEmpty()) {
            this.f3209d.a(this.f3211f, 30000L);
        } else {
            this.f3209d.a(this.f3211f);
        }
    }

    public static void a(@NonNull com.apm.insight.entity.c cVar) {
        a(com.apm.insight.h.a(), cVar);
    }

    private static void b(Object obj, com.apm.insight.entity.c cVar) {
        ConcurrentHashMap<Object, ConcurrentLinkedQueue<com.apm.insight.entity.c>> concurrentHashMap;
        ConcurrentLinkedQueue<com.apm.insight.entity.c> concurrentLinkedQueue;
        synchronized (obj) {
            concurrentHashMap = a;
            concurrentLinkedQueue = concurrentHashMap.get(obj);
            if (concurrentLinkedQueue == null) {
                concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
                concurrentHashMap.put(obj, concurrentLinkedQueue);
            }
        }
        concurrentLinkedQueue.add(cVar);
        int size = concurrentHashMap.size();
        boolean z10 = size >= 30;
        com.apm.insight.l.p.b("[enqueue] size=" + size);
        if (z10) {
            g();
        }
    }

    public static void a(@Nullable final Object obj, @NonNull final com.apm.insight.entity.c cVar) {
        String str;
        Handler a10 = p.b().a();
        if (a10 == null || a10.getLooper() != Looper.myLooper()) {
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
            com.apm.insight.l.p.a("EventUploadQueue", "enqueue before init.");
            c(obj, cVar);
            return;
        }
        if (!com.apm.insight.runtime.a.a(obj)) {
            a.b();
        }
        f();
        try {
            str = cVar.h().getString("log_type");
        } catch (JSONException e2) {
            e2.printStackTrace();
            str = null;
        }
        if (TextUtils.isEmpty(str) || !com.apm.insight.runtime.a.a(obj, str)) {
            com.apm.insight.l.p.a("EventUploadQueue", "logType " + str + " not sampled");
            return;
        }
        com.apm.insight.l.p.a("EventUploadQueue", "logType " + str + " enqueued");
        b(obj, cVar);
    }
}

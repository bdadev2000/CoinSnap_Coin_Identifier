package com.bykv.vk.openvk.preload.geckox;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.d.b.b.f;
import com.bykv.vk.openvk.preload.geckox.d.d;
import com.bykv.vk.openvk.preload.geckox.d.e;
import com.bykv.vk.openvk.preload.geckox.d.g;
import com.bykv.vk.openvk.preload.geckox.d.h;
import com.bykv.vk.openvk.preload.geckox.model.CheckRequestBodyModel;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    b f9993c;

    /* renamed from: d, reason: collision with root package name */
    File f9994d;

    /* renamed from: e, reason: collision with root package name */
    private final List<String> f9995e = new ArrayList();
    com.bykv.vk.openvk.preload.geckox.e.b a = new com.bykv.vk.openvk.preload.geckox.e.b();

    /* renamed from: b, reason: collision with root package name */
    Queue<String> f9992b = new LinkedBlockingQueue();

    public a(b bVar) {
        this.f9993c = bVar;
        File file = bVar.f10029n;
        this.f9994d = file;
        file.mkdirs();
        b bVar2 = this.f9993c;
        a(e.class, com.bykv.vk.openvk.preload.geckox.statistic.b.a(bVar2));
        a(d.class, com.bykv.vk.openvk.preload.geckox.statistic.b.a(bVar2));
        a(com.bykv.vk.openvk.preload.geckox.d.a.b.c.class, com.bykv.vk.openvk.preload.geckox.statistic.b.b(bVar2.a));
        a(com.bykv.vk.openvk.preload.geckox.d.a.b.b.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.6
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th2) {
                super.a(bVar3, dVar, th2);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a = a.a(dVar.f9973f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                a.f10119i = false;
                a.f10122l = SystemClock.uptimeMillis();
                a.f10129s = th2.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar3, dVar);
                a.a(dVar.f9973f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel()).f10119i = true;
            }
        });
        a(com.bykv.vk.openvk.preload.geckox.d.a.b.d.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.7
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th2) {
                super.a(bVar3, dVar, th2);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a = a.a(dVar.f9973f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                a.f10120j = false;
                a.f10123m = SystemClock.uptimeMillis();
                a.f10130t = th2.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar3, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a = a.a(dVar.f9973f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                a.f10120j = true;
                a.f10123m = SystemClock.uptimeMillis();
            }
        });
        a(com.bykv.vk.openvk.preload.geckox.d.a.b.a.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.8
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th2) {
                super.a(bVar3, dVar, th2);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a = a.a(dVar.f9973f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                a.f10120j = false;
                a.f10124n = SystemClock.uptimeMillis();
                a.f10130t = th2.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar3, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a = a.a(dVar.f9973f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                a.f10120j = true;
                a.f10124n = SystemClock.uptimeMillis();
            }
        });
        a(com.bykv.vk.openvk.preload.geckox.d.a.b.e.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.11
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th2) {
                super.a(bVar3, dVar, th2);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a = a.a(dVar.f9973f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                a.f10121k = false;
                a.u = th2.getMessage();
                a.f10125o = SystemClock.uptimeMillis();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar3, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a = a.a(dVar.f9973f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                a.f10121k = true;
                a.f10125o = SystemClock.uptimeMillis();
            }
        });
        a(com.bykv.vk.openvk.preload.geckox.d.a.a.b.class, com.bykv.vk.openvk.preload.geckox.statistic.b.a(bVar2.a));
        a(com.bykv.vk.openvk.preload.geckox.d.a.a.a.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.9
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th2) {
                super.a(bVar3, dVar, th2);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a = a.a(dVar.f9973f).a(((UpdatePackage) ((Pair) bVar3.b(g.class)).second).getChannel());
                a.C = false;
                a.f10135z = SystemClock.uptimeMillis();
                a.E = th2.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar3, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a = a.a(dVar.f9973f).a(((UpdatePackage) ((Pair) bVar3.b(g.class)).second).getChannel());
                a.C = true;
                a.f10135z = SystemClock.uptimeMillis();
            }
        });
        a(com.bykv.vk.openvk.preload.geckox.d.a.a.c.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.10
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th2) {
                super.a(bVar3, dVar, th2);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a = a.a(dVar.f9973f).a(((UpdatePackage) ((Pair) bVar3.b(g.class)).second).getChannel());
                a.D = false;
                a.A = SystemClock.uptimeMillis();
                a.F = th2.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar3, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a = a.a(dVar.f9973f).a(((UpdatePackage) ((Pair) bVar3.b(g.class)).second).getChannel());
                a.D = true;
                a.A = SystemClock.uptimeMillis();
            }
        });
        a(com.bykv.vk.openvk.preload.geckox.d.b.b.c.class, com.bykv.vk.openvk.preload.geckox.statistic.b.b(bVar2.a));
        a(com.bykv.vk.openvk.preload.geckox.d.b.b.b.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.6
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th2) {
                super.a(bVar3, dVar, th2);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a = a.a(dVar.f9973f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                a.f10119i = false;
                a.f10122l = SystemClock.uptimeMillis();
                a.f10129s = th2.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar3, dVar);
                a.a(dVar.f9973f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel()).f10119i = true;
            }
        });
        a(com.bykv.vk.openvk.preload.geckox.d.b.b.d.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.7
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th2) {
                super.a(bVar3, dVar, th2);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a = a.a(dVar.f9973f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                a.f10120j = false;
                a.f10123m = SystemClock.uptimeMillis();
                a.f10130t = th2.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar3, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a = a.a(dVar.f9973f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                a.f10120j = true;
                a.f10123m = SystemClock.uptimeMillis();
            }
        });
        a(com.bykv.vk.openvk.preload.geckox.d.b.b.a.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.8
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th2) {
                super.a(bVar3, dVar, th2);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a = a.a(dVar.f9973f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                a.f10120j = false;
                a.f10124n = SystemClock.uptimeMillis();
                a.f10130t = th2.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar3, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a = a.a(dVar.f9973f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                a.f10120j = true;
                a.f10124n = SystemClock.uptimeMillis();
            }
        });
        a(f.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.3
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th2) {
                super.a(bVar3, dVar, th2);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a = a.a(dVar.f9973f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                a.f10121k = false;
                a.f10125o = SystemClock.uptimeMillis();
                a.u = th2.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar3, dVar);
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void c(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar) {
                super.c(bVar3, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a = a.a(dVar.f9973f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                a.f10121k = true;
                a.f10125o = SystemClock.uptimeMillis();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th2) {
                super.b(bVar3, dVar, th2);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a = a.a(dVar.f9973f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                a.f10121k = false;
                a.f10125o = SystemClock.uptimeMillis();
                a.F = th2.getMessage();
            }
        });
        a(com.bykv.vk.openvk.preload.geckox.d.b.a.b.class, com.bykv.vk.openvk.preload.geckox.statistic.b.a(bVar2.a));
        a(com.bykv.vk.openvk.preload.geckox.d.b.a.a.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.9
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th2) {
                super.a(bVar3, dVar, th2);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a = a.a(dVar.f9973f).a(((UpdatePackage) ((Pair) bVar3.b(g.class)).second).getChannel());
                a.C = false;
                a.f10135z = SystemClock.uptimeMillis();
                a.E = th2.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar3, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a = a.a(dVar.f9973f).a(((UpdatePackage) ((Pair) bVar3.b(g.class)).second).getChannel());
                a.C = true;
                a.f10135z = SystemClock.uptimeMillis();
            }
        });
        a(com.bykv.vk.openvk.preload.geckox.d.b.a.d.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.2
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th2) {
                super.a(bVar3, dVar, th2);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a = a.a(dVar.f9973f).a(((UpdatePackage) ((Pair) bVar3.b(g.class)).second).getChannel());
                a.D = false;
                a.A = SystemClock.uptimeMillis();
                a.F = th2.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th2) {
                super.b(bVar3, dVar, th2);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a = a.a(dVar.f9973f).a(((UpdatePackage) ((Pair) bVar3.b(g.class)).second).getChannel());
                a.D = false;
                a.A = SystemClock.uptimeMillis();
                a.F = th2.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void c(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar) {
                super.c(bVar3, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a = a.a(dVar.f9973f).a(((UpdatePackage) ((Pair) bVar3.b(g.class)).second).getChannel());
                a.D = true;
                a.A = SystemClock.uptimeMillis();
            }
        });
    }

    public final boolean a(Map<String, List<CheckRequestBodyModel.TargetChannel>> map) {
        if (map.isEmpty()) {
            return true;
        }
        List<String> list = this.f9993c.f10020e;
        for (Map.Entry<String, List<CheckRequestBodyModel.TargetChannel>> entry : map.entrySet()) {
            Iterator<String> it = list.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                if (TextUtils.equals(it.next(), entry.getKey())) {
                    z10 = true;
                }
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    public final boolean a() {
        b bVar = this.f9993c;
        List<String> list = bVar.f10021f;
        List<String> list2 = bVar.f10020e;
        if (list == null || list.isEmpty() || list2 == null || list2.isEmpty()) {
            return false;
        }
        for (String str : list2) {
            Iterator<String> it = list.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                if (TextUtils.equals(str, it.next())) {
                    z10 = true;
                }
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    private void a(Class<? extends com.bykv.vk.openvk.preload.b.d<?, ?>> cls, com.bykv.vk.openvk.preload.b.b.a aVar) {
        this.a.a(cls, aVar);
    }
}

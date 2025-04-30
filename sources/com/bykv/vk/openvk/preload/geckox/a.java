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
    b f13165c;

    /* renamed from: d, reason: collision with root package name */
    File f13166d;

    /* renamed from: e, reason: collision with root package name */
    private final List<String> f13167e = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    com.bykv.vk.openvk.preload.geckox.e.b f13164a = new com.bykv.vk.openvk.preload.geckox.e.b();
    Queue<String> b = new LinkedBlockingQueue();

    public a(b bVar) {
        this.f13165c = bVar;
        File file = bVar.f13202n;
        this.f13166d = file;
        file.mkdirs();
        b bVar2 = this.f13165c;
        a(e.class, com.bykv.vk.openvk.preload.geckox.statistic.b.a(bVar2));
        a(d.class, com.bykv.vk.openvk.preload.geckox.statistic.b.a(bVar2));
        a(com.bykv.vk.openvk.preload.geckox.d.a.b.c.class, com.bykv.vk.openvk.preload.geckox.statistic.b.b(bVar2.f13192a));
        a(com.bykv.vk.openvk.preload.geckox.d.a.b.b.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.6
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th) {
                super.a(bVar3, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a6 = a.a(dVar.f13143f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                a6.f13305i = false;
                a6.l = SystemClock.uptimeMillis();
                a6.f13313s = th.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar3, dVar);
                a.a(dVar.f13143f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel()).f13305i = true;
            }
        });
        a(com.bykv.vk.openvk.preload.geckox.d.a.b.d.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.7
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th) {
                super.a(bVar3, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a6 = a.a(dVar.f13143f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                a6.f13306j = false;
                a6.m = SystemClock.uptimeMillis();
                a6.f13314t = th.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar3, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a6 = a.a(dVar.f13143f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                a6.f13306j = true;
                a6.m = SystemClock.uptimeMillis();
            }
        });
        a(com.bykv.vk.openvk.preload.geckox.d.a.b.a.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.8
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th) {
                super.a(bVar3, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a6 = a.a(dVar.f13143f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                a6.f13306j = false;
                a6.f13308n = SystemClock.uptimeMillis();
                a6.f13314t = th.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar3, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a6 = a.a(dVar.f13143f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                a6.f13306j = true;
                a6.f13308n = SystemClock.uptimeMillis();
            }
        });
        a(com.bykv.vk.openvk.preload.geckox.d.a.b.e.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.11
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th) {
                super.a(bVar3, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a6 = a.a(dVar.f13143f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                a6.f13307k = false;
                a6.f13315u = th.getMessage();
                a6.f13309o = SystemClock.uptimeMillis();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar3, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a6 = a.a(dVar.f13143f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                a6.f13307k = true;
                a6.f13309o = SystemClock.uptimeMillis();
            }
        });
        a(com.bykv.vk.openvk.preload.geckox.d.a.a.b.class, com.bykv.vk.openvk.preload.geckox.statistic.b.a(bVar2.f13192a));
        a(com.bykv.vk.openvk.preload.geckox.d.a.a.a.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.9
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th) {
                super.a(bVar3, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a6 = a.a(dVar.f13143f).a(((UpdatePackage) ((Pair) bVar3.b(g.class)).second).getChannel());
                a6.f13294C = false;
                a6.f13320z = SystemClock.uptimeMillis();
                a6.f13296E = th.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar3, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a6 = a.a(dVar.f13143f).a(((UpdatePackage) ((Pair) bVar3.b(g.class)).second).getChannel());
                a6.f13294C = true;
                a6.f13320z = SystemClock.uptimeMillis();
            }
        });
        a(com.bykv.vk.openvk.preload.geckox.d.a.a.c.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.10
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th) {
                super.a(bVar3, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a6 = a.a(dVar.f13143f).a(((UpdatePackage) ((Pair) bVar3.b(g.class)).second).getChannel());
                a6.f13295D = false;
                a6.f13292A = SystemClock.uptimeMillis();
                a6.f13297F = th.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar3, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a6 = a.a(dVar.f13143f).a(((UpdatePackage) ((Pair) bVar3.b(g.class)).second).getChannel());
                a6.f13295D = true;
                a6.f13292A = SystemClock.uptimeMillis();
            }
        });
        a(com.bykv.vk.openvk.preload.geckox.d.b.b.c.class, com.bykv.vk.openvk.preload.geckox.statistic.b.b(bVar2.f13192a));
        a(com.bykv.vk.openvk.preload.geckox.d.b.b.b.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.6
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th) {
                super.a(bVar3, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a6 = a.a(dVar.f13143f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                a6.f13305i = false;
                a6.l = SystemClock.uptimeMillis();
                a6.f13313s = th.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar3, dVar);
                a.a(dVar.f13143f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel()).f13305i = true;
            }
        });
        a(com.bykv.vk.openvk.preload.geckox.d.b.b.d.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.7
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th) {
                super.a(bVar3, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a6 = a.a(dVar.f13143f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                a6.f13306j = false;
                a6.m = SystemClock.uptimeMillis();
                a6.f13314t = th.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar3, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a6 = a.a(dVar.f13143f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                a6.f13306j = true;
                a6.m = SystemClock.uptimeMillis();
            }
        });
        a(com.bykv.vk.openvk.preload.geckox.d.b.b.a.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.8
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th) {
                super.a(bVar3, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a6 = a.a(dVar.f13143f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                a6.f13306j = false;
                a6.f13308n = SystemClock.uptimeMillis();
                a6.f13314t = th.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar3, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a6 = a.a(dVar.f13143f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                a6.f13306j = true;
                a6.f13308n = SystemClock.uptimeMillis();
            }
        });
        a(f.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.3
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th) {
                super.a(bVar3, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a6 = a.a(dVar.f13143f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                a6.f13307k = false;
                a6.f13309o = SystemClock.uptimeMillis();
                a6.f13315u = th.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar3, dVar);
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void c(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar) {
                super.c(bVar3, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a6 = a.a(dVar.f13143f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                a6.f13307k = true;
                a6.f13309o = SystemClock.uptimeMillis();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th) {
                super.b(bVar3, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a6 = a.a(dVar.f13143f).a(((UpdatePackage) ((Pair) bVar3.b(h.class)).second).getChannel());
                a6.f13307k = false;
                a6.f13309o = SystemClock.uptimeMillis();
                a6.f13297F = th.getMessage();
            }
        });
        a(com.bykv.vk.openvk.preload.geckox.d.b.a.b.class, com.bykv.vk.openvk.preload.geckox.statistic.b.a(bVar2.f13192a));
        a(com.bykv.vk.openvk.preload.geckox.d.b.a.a.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.9
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th) {
                super.a(bVar3, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a6 = a.a(dVar.f13143f).a(((UpdatePackage) ((Pair) bVar3.b(g.class)).second).getChannel());
                a6.f13294C = false;
                a6.f13320z = SystemClock.uptimeMillis();
                a6.f13296E = th.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar) {
                super.b(bVar3, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a6 = a.a(dVar.f13143f).a(((UpdatePackage) ((Pair) bVar3.b(g.class)).second).getChannel());
                a6.f13294C = true;
                a6.f13320z = SystemClock.uptimeMillis();
            }
        });
        a(com.bykv.vk.openvk.preload.geckox.d.b.a.d.class, new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.2
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th) {
                super.a(bVar3, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a6 = a.a(dVar.f13143f).a(((UpdatePackage) ((Pair) bVar3.b(g.class)).second).getChannel());
                a6.f13295D = false;
                a6.f13292A = SystemClock.uptimeMillis();
                a6.f13297F = th.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar, Throwable th) {
                super.b(bVar3, dVar, th);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a6 = a.a(dVar.f13143f).a(((UpdatePackage) ((Pair) bVar3.b(g.class)).second).getChannel());
                a6.f13295D = false;
                a6.f13292A = SystemClock.uptimeMillis();
                a6.f13297F = th.getMessage();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void c(com.bykv.vk.openvk.preload.b.b<T> bVar3, com.bykv.vk.openvk.preload.b.d dVar) {
                super.c(bVar3, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a6 = a.a(dVar.f13143f).a(((UpdatePackage) ((Pair) bVar3.b(g.class)).second).getChannel());
                a6.f13295D = true;
                a6.f13292A = SystemClock.uptimeMillis();
            }
        });
    }

    public final boolean a(Map<String, List<CheckRequestBodyModel.TargetChannel>> map) {
        if (map.isEmpty()) {
            return true;
        }
        List<String> list = this.f13165c.f13195e;
        for (Map.Entry<String, List<CheckRequestBodyModel.TargetChannel>> entry : map.entrySet()) {
            Iterator<String> it = list.iterator();
            boolean z8 = false;
            while (it.hasNext()) {
                if (TextUtils.equals(it.next(), entry.getKey())) {
                    z8 = true;
                }
            }
            if (!z8) {
                return false;
            }
        }
        return true;
    }

    public final boolean a() {
        b bVar = this.f13165c;
        List<String> list = bVar.f13196f;
        List<String> list2 = bVar.f13195e;
        if (list == null || list.isEmpty() || list2 == null || list2.isEmpty()) {
            return false;
        }
        for (String str : list2) {
            Iterator<String> it = list.iterator();
            boolean z8 = false;
            while (it.hasNext()) {
                if (TextUtils.equals(str, it.next())) {
                    z8 = true;
                }
            }
            if (!z8) {
                return false;
            }
        }
        return true;
    }

    private void a(Class<? extends com.bykv.vk.openvk.preload.b.d<?, ?>> cls, com.bykv.vk.openvk.preload.b.b.a aVar) {
        this.f13164a.a(cls, aVar);
    }
}

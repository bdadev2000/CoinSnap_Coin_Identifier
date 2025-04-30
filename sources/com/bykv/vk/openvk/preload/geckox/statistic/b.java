package com.bykv.vk.openvk.preload.geckox.statistic;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bykv.vk.openvk.preload.b.d;
import com.bykv.vk.openvk.preload.geckox.d.e;
import com.bykv.vk.openvk.preload.geckox.d.g;
import com.bykv.vk.openvk.preload.geckox.d.h;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel;
import java.util.Map;

/* loaded from: classes.dex */
public final class b {
    public static com.bykv.vk.openvk.preload.b.b.a a(final com.bykv.vk.openvk.preload.geckox.b bVar) {
        return new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.1
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar2, d dVar) {
                super.a(bVar2, dVar);
                try {
                    com.bykv.vk.openvk.preload.geckox.b.this.f13204p.put(dVar.getClass().getSimpleName().concat("onStart"), "");
                } catch (Throwable unused) {
                }
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar2, d dVar) {
                super.b(bVar2, dVar);
                try {
                    com.bykv.vk.openvk.preload.geckox.b.this.f13204p.put(dVar.getClass().getSimpleName().concat("onEnd"), "");
                    if ((dVar instanceof e) && (dVar.f13140c instanceof Map)) {
                        com.bykv.vk.openvk.preload.geckox.b.this.f13204p.put(dVar.getClass().getSimpleName(), ((Map) dVar.f13140c).get("cca47107bfcbdb211d88f3385aeede40"));
                    }
                } catch (Throwable unused) {
                }
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void c(com.bykv.vk.openvk.preload.b.b<T> bVar2, d dVar) {
                super.c(bVar2, dVar);
                try {
                    c.a(com.bykv.vk.openvk.preload.geckox.b.this, a.a(dVar.f13143f));
                } catch (Throwable unused) {
                }
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar2, d dVar, Throwable th) {
                super.a(bVar2, dVar, th);
                try {
                    com.bykv.vk.openvk.preload.geckox.b.this.f13204p.put(dVar.getClass().getSimpleName().concat("onException"), th.toString());
                    c.a(com.bykv.vk.openvk.preload.geckox.b.this, a.a(dVar.f13143f));
                } catch (Throwable unused) {
                }
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar2, d dVar, Throwable th) {
                super.b(bVar2, dVar, th);
                try {
                    com.bykv.vk.openvk.preload.geckox.b.this.f13204p.put(dVar.getClass().getSimpleName().concat("onChainException"), th.toString());
                    c.a(com.bykv.vk.openvk.preload.geckox.b.this, a.a(dVar.f13143f));
                } catch (Throwable unused) {
                }
            }
        };
    }

    public static com.bykv.vk.openvk.preload.b.b.a b(final Context context) {
        return new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.5
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar, d dVar) {
                super.a(bVar, dVar);
                Pair pair = (Pair) bVar.b(h.class);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a6 = a.a(dVar.f13143f).a(((UpdatePackage) pair.second).getChannel());
                a6.f13300d = ((Uri) pair.first).toString();
                a6.f13310p = com.bykv.vk.openvk.preload.geckox.utils.h.a(context);
                a6.f13302f = SystemClock.uptimeMillis();
                a6.f13311q = Long.valueOf(((UpdatePackage) pair.second).getPatch().getId());
                a6.f13312r = Long.valueOf(((UpdatePackage) pair.second).getFullPackage().getId());
                a6.f13299c = ((UpdatePackage) pair.second).getChannel();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar, d dVar) {
                super.b(bVar, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a6 = a.a(dVar.f13143f).a(((UpdatePackage) ((Pair) bVar.b(h.class)).second).getChannel());
                a6.f13304h = true;
                a6.f13303g = SystemClock.uptimeMillis();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar, d dVar, Throwable th) {
                super.a(bVar, dVar, th);
                Pair pair = (Pair) bVar.b(h.class);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a6 = a.a(dVar.f13143f).a(((UpdatePackage) pair.second).getChannel());
                String uri = ((Uri) pair.first).toString();
                a6.f13304h = false;
                a6.f13303g = SystemClock.uptimeMillis();
                a6.f13301e.add(new StatisticModel.PackageStatisticModel.DownloadFailRecords(uri, th.getMessage()));
            }
        };
    }

    public static com.bykv.vk.openvk.preload.b.b.a a(final Context context) {
        return new com.bykv.vk.openvk.preload.b.b.a() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.b.4
            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar, d dVar) {
                super.a(bVar, dVar);
                Pair pair = (Pair) bVar.b(g.class);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a6 = a.a(dVar.f13143f).a(((UpdatePackage) pair.second).getChannel());
                a6.f13316v = ((Uri) pair.first).toString();
                a6.f13310p = com.bykv.vk.openvk.preload.geckox.utils.h.a(context);
                a6.f13318x = SystemClock.uptimeMillis();
                a6.f13312r = Long.valueOf(((UpdatePackage) pair.second).getFullPackage().getId());
                a6.f13299c = ((UpdatePackage) pair.second).getChannel();
                if (!TextUtils.isEmpty(((UpdatePackage) pair.second).getAccessKey())) {
                    a6.f13298a = ((UpdatePackage) pair.second).getAccessKey();
                }
                if (TextUtils.isEmpty(((UpdatePackage) pair.second).getGroupName())) {
                    return;
                }
                a6.b = ((UpdatePackage) pair.second).getGroupName();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void b(com.bykv.vk.openvk.preload.b.b<T> bVar, d dVar) {
                super.b(bVar, dVar);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a6 = a.a(dVar.f13143f).a(((UpdatePackage) ((Pair) bVar.b(g.class)).second).getChannel());
                a6.f13293B = true;
                a6.f13319y = SystemClock.uptimeMillis();
            }

            @Override // com.bykv.vk.openvk.preload.b.b.a
            public final <T> void a(com.bykv.vk.openvk.preload.b.b<T> bVar, d dVar, Throwable th) {
                super.a(bVar, dVar, th);
                Pair pair = (Pair) bVar.b(g.class);
                com.bykv.vk.openvk.preload.geckox.statistic.model.a a6 = a.a(dVar.f13143f).a(((UpdatePackage) pair.second).getChannel());
                String uri = ((Uri) pair.first).toString();
                a6.f13293B = false;
                a6.f13319y = SystemClock.uptimeMillis();
                a6.f13317w.add(new StatisticModel.PackageStatisticModel.DownloadFailRecords(uri, th.getMessage()));
            }
        };
    }
}

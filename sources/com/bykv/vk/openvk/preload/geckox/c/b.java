package com.bykv.vk.openvk.preload.geckox.c;

import com.bykv.vk.openvk.preload.a.b.a.n;
import com.bykv.vk.openvk.preload.a.f;
import com.bykv.vk.openvk.preload.a.g;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

/* loaded from: classes.dex */
public final class b {
    private static b b = new b();

    /* renamed from: a, reason: collision with root package name */
    public f f13232a;

    private b() {
        com.bykv.vk.openvk.preload.a.a aVar;
        com.bykv.vk.openvk.preload.a.a aVar2;
        com.bykv.vk.openvk.preload.a.a aVar3;
        g gVar = new g();
        gVar.a(Boolean.class, new a());
        gVar.a(Boolean.TYPE, new a());
        ArrayList arrayList = new ArrayList(gVar.f13120f.size() + gVar.f13119e.size() + 3);
        arrayList.addAll(gVar.f13119e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(gVar.f13120f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        String str = gVar.f13122h;
        int i9 = gVar.f13123i;
        int i10 = gVar.f13124j;
        if (str != null && !"".equals(str.trim())) {
            aVar = new com.bykv.vk.openvk.preload.a.a(Date.class, str);
            aVar2 = new com.bykv.vk.openvk.preload.a.a(Timestamp.class, str);
            aVar3 = new com.bykv.vk.openvk.preload.a.a(java.sql.Date.class, str);
        } else {
            if (i9 != 2 && i10 != 2) {
                com.bykv.vk.openvk.preload.a.a aVar4 = new com.bykv.vk.openvk.preload.a.a(Date.class, i9, i10);
                com.bykv.vk.openvk.preload.a.a aVar5 = new com.bykv.vk.openvk.preload.a.a(Timestamp.class, i9, i10);
                com.bykv.vk.openvk.preload.a.a aVar6 = new com.bykv.vk.openvk.preload.a.a(java.sql.Date.class, i9, i10);
                aVar = aVar4;
                aVar2 = aVar5;
                aVar3 = aVar6;
            }
            this.f13232a = new f(gVar.f13116a, gVar.f13117c, gVar.f13118d, gVar.f13121g, gVar.f13125k, gVar.f13127o, gVar.m, gVar.f13126n, gVar.f13128p, gVar.l, gVar.b, gVar.f13122h, gVar.f13123i, gVar.f13124j, gVar.f13119e, gVar.f13120f, arrayList);
        }
        arrayList.add(n.a(Date.class, aVar));
        arrayList.add(n.a(Timestamp.class, aVar2));
        arrayList.add(n.a(java.sql.Date.class, aVar3));
        this.f13232a = new f(gVar.f13116a, gVar.f13117c, gVar.f13118d, gVar.f13121g, gVar.f13125k, gVar.f13127o, gVar.m, gVar.f13126n, gVar.f13128p, gVar.l, gVar.b, gVar.f13122h, gVar.f13123i, gVar.f13124j, gVar.f13119e, gVar.f13120f, arrayList);
    }

    public static b a() {
        return b;
    }
}

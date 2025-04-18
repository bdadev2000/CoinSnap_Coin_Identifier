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

    /* renamed from: b, reason: collision with root package name */
    private static b f10059b = new b();
    public f a;

    private b() {
        com.bykv.vk.openvk.preload.a.a aVar;
        com.bykv.vk.openvk.preload.a.a aVar2;
        com.bykv.vk.openvk.preload.a.a aVar3;
        g gVar = new g();
        gVar.a(Boolean.class, new a());
        gVar.a(Boolean.TYPE, new a());
        ArrayList arrayList = new ArrayList(gVar.f9955f.size() + gVar.f9954e.size() + 3);
        arrayList.addAll(gVar.f9954e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(gVar.f9955f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        String str = gVar.f9957h;
        int i10 = gVar.f9958i;
        int i11 = gVar.f9959j;
        if (str != null && !"".equals(str.trim())) {
            aVar = new com.bykv.vk.openvk.preload.a.a(Date.class, str);
            aVar2 = new com.bykv.vk.openvk.preload.a.a(Timestamp.class, str);
            aVar3 = new com.bykv.vk.openvk.preload.a.a(java.sql.Date.class, str);
        } else {
            if (i10 != 2 && i11 != 2) {
                com.bykv.vk.openvk.preload.a.a aVar4 = new com.bykv.vk.openvk.preload.a.a(Date.class, i10, i11);
                com.bykv.vk.openvk.preload.a.a aVar5 = new com.bykv.vk.openvk.preload.a.a(Timestamp.class, i10, i11);
                com.bykv.vk.openvk.preload.a.a aVar6 = new com.bykv.vk.openvk.preload.a.a(java.sql.Date.class, i10, i11);
                aVar = aVar4;
                aVar2 = aVar5;
                aVar3 = aVar6;
            }
            this.a = new f(gVar.a, gVar.f9952c, gVar.f9953d, gVar.f9956g, gVar.f9960k, gVar.f9964o, gVar.f9962m, gVar.f9963n, gVar.f9965p, gVar.f9961l, gVar.f9951b, gVar.f9957h, gVar.f9958i, gVar.f9959j, gVar.f9954e, gVar.f9955f, arrayList);
        }
        arrayList.add(n.a(Date.class, aVar));
        arrayList.add(n.a(Timestamp.class, aVar2));
        arrayList.add(n.a(java.sql.Date.class, aVar3));
        this.a = new f(gVar.a, gVar.f9952c, gVar.f9953d, gVar.f9956g, gVar.f9960k, gVar.f9964o, gVar.f9962m, gVar.f9963n, gVar.f9965p, gVar.f9961l, gVar.f9951b, gVar.f9957h, gVar.f9958i, gVar.f9959j, gVar.f9954e, gVar.f9955f, arrayList);
    }

    public static b a() {
        return f10059b;
    }
}

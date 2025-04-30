package com.applovin.impl;

import com.applovin.impl.hm;
import com.applovin.impl.jm;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.applovin.impl.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0774x0 implements jm.b, hm.b {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f12091a;
    private final a b;

    /* renamed from: c, reason: collision with root package name */
    private C0766v0 f12092c;

    /* renamed from: d, reason: collision with root package name */
    private String f12093d;

    /* renamed from: com.applovin.impl.x0$a */
    /* loaded from: classes.dex */
    public interface a {
        void a(C0766v0 c0766v0, String str);

        void a(b bVar, String str);
    }

    /* renamed from: com.applovin.impl.x0$b */
    /* loaded from: classes.dex */
    public enum b {
        DEVELOPER_URI_NOT_FOUND,
        APPADSTXT_NOT_FOUND,
        MISSING_APPLOVIN_ENTRIES,
        MISSING_NON_APPLOVIN_ENTRIES
    }

    public C0774x0(com.applovin.impl.sdk.k kVar, a aVar) {
        this.f12091a = kVar;
        this.b = aVar;
    }

    @Override // com.applovin.impl.hm.b
    public void a(b bVar, String str) {
        this.b.a(bVar, str);
    }

    @Override // com.applovin.impl.hm.b
    public void a(String str, String str2) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        String[] split = str.split("\n");
        int length = split.length;
        int i9 = 1;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i9 + 1;
            C0770w0 c0770w0 = new C0770w0(split[i10], i9);
            if (c0770w0.h()) {
                String b8 = c0770w0.b();
                List arrayList2 = hashMap.containsKey(b8) ? (List) hashMap.get(b8) : new ArrayList();
                if (arrayList2 != null) {
                    arrayList2.add(c0770w0);
                    hashMap.put(b8, arrayList2);
                }
            } else {
                arrayList.add(c0770w0);
            }
            i10++;
            i9 = i11;
        }
        this.f12092c = new C0766v0(hashMap, arrayList);
        this.f12093d = str2;
        this.f12091a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.f12091a.L().a("AppAdsTxtService", "app-ads.txt fetched: " + this.f12092c);
        }
        this.b.a(this.f12092c, str2);
    }

    @Override // com.applovin.impl.jm.b
    public void a(b bVar) {
        this.b.a(bVar, (String) null);
    }

    @Override // com.applovin.impl.jm.b
    public void a(String str) {
        this.f12091a.l0().a(new hm(this.f12091a, str, this));
    }

    public void a() {
        C0766v0 c0766v0 = this.f12092c;
        if (c0766v0 != null) {
            this.b.a(c0766v0, this.f12093d);
        } else {
            this.f12091a.l0().a(new jm(this.f12091a, this));
        }
    }
}

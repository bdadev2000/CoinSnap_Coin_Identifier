package com.applovin.impl;

import com.applovin.impl.hm;
import com.applovin.impl.jm;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class x0 implements jm.b, hm.b {
    private final com.applovin.impl.sdk.k a;

    /* renamed from: b, reason: collision with root package name */
    private final a f8897b;

    /* renamed from: c, reason: collision with root package name */
    private v0 f8898c;

    /* renamed from: d, reason: collision with root package name */
    private String f8899d;

    /* loaded from: classes.dex */
    public interface a {
        void a(v0 v0Var, String str);

        void a(b bVar, String str);
    }

    /* loaded from: classes.dex */
    public enum b {
        DEVELOPER_URI_NOT_FOUND,
        APPADSTXT_NOT_FOUND,
        MISSING_APPLOVIN_ENTRIES,
        MISSING_NON_APPLOVIN_ENTRIES
    }

    public x0(com.applovin.impl.sdk.k kVar, a aVar) {
        this.a = kVar;
        this.f8897b = aVar;
    }

    @Override // com.applovin.impl.hm.b
    public void a(b bVar, String str) {
        this.f8897b.a(bVar, str);
    }

    @Override // com.applovin.impl.hm.b
    public void a(String str, String str2) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        String[] split = str.split("\n");
        int length = split.length;
        int i10 = 1;
        int i11 = 0;
        while (i11 < length) {
            int i12 = i10 + 1;
            w0 w0Var = new w0(split[i11], i10);
            if (w0Var.h()) {
                String b3 = w0Var.b();
                List arrayList2 = hashMap.containsKey(b3) ? (List) hashMap.get(b3) : new ArrayList();
                if (arrayList2 != null) {
                    arrayList2.add(w0Var);
                    hashMap.put(b3, arrayList2);
                }
            } else {
                arrayList.add(w0Var);
            }
            i11++;
            i10 = i12;
        }
        this.f8898c = new v0(hashMap, arrayList);
        this.f8899d = str2;
        this.a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.a.L().a("AppAdsTxtService", "app-ads.txt fetched: " + this.f8898c);
        }
        this.f8897b.a(this.f8898c, str2);
    }

    @Override // com.applovin.impl.jm.b
    public void a(b bVar) {
        this.f8897b.a(bVar, (String) null);
    }

    @Override // com.applovin.impl.jm.b
    public void a(String str) {
        this.a.l0().a(new hm(this.a, str, this));
    }

    public void a() {
        v0 v0Var = this.f8898c;
        if (v0Var != null) {
            this.f8897b.a(v0Var, this.f8899d);
        } else {
            this.a.l0().a(new jm(this.a, this));
        }
    }
}

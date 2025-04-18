package com.applovin.impl;

import com.applovin.impl.im;
import com.applovin.impl.km;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public class y0 implements km.b, im.b {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f28021a;

    /* renamed from: b, reason: collision with root package name */
    private final a f28022b;

    /* renamed from: c, reason: collision with root package name */
    private w0 f28023c;
    private String d;

    /* loaded from: classes2.dex */
    public interface a {
        void a(w0 w0Var, String str);

        void a(b bVar, String str);
    }

    /* loaded from: classes2.dex */
    public enum b {
        APP_DETAILS_NOT_FOUND,
        INVALID_DEVELOPER_URI,
        APPADSTXT_NOT_FOUND,
        MISSING_APPLOVIN_ENTRIES,
        MISSING_NON_APPLOVIN_ENTRIES
    }

    public y0(com.applovin.impl.sdk.j jVar, a aVar) {
        this.f28021a = jVar;
        this.f28022b = aVar;
    }

    @Override // com.applovin.impl.im.b
    public void a(b bVar, String str) {
        this.f28022b.a(bVar, str);
    }

    @Override // com.applovin.impl.im.b
    public void a(String str, String str2) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        String[] split = str.split("\n");
        int length = split.length;
        int i2 = 1;
        int i3 = 0;
        while (i3 < length) {
            int i4 = i2 + 1;
            x0 x0Var = new x0(split[i3], i2);
            if (x0Var.h()) {
                String b2 = x0Var.b();
                List arrayList2 = hashMap.containsKey(b2) ? (List) hashMap.get(b2) : new ArrayList();
                if (arrayList2 != null) {
                    arrayList2.add(x0Var);
                    hashMap.put(b2, arrayList2);
                }
            } else {
                arrayList.add(x0Var);
            }
            i3++;
            i2 = i4;
        }
        this.f28023c = new w0(hashMap, arrayList);
        this.d = str2;
        this.f28021a.J();
        if (com.applovin.impl.sdk.n.a()) {
            this.f28021a.J().a("AppAdsTxtService", "app-ads.txt fetched: " + this.f28023c);
        }
        this.f28022b.a(this.f28023c, str2);
    }

    @Override // com.applovin.impl.km.b
    public void a(b bVar) {
        this.f28022b.a(bVar, (String) null);
    }

    @Override // com.applovin.impl.km.b
    public void a(String str) {
        this.f28021a.j0().a(new im(this.f28021a, str, this));
    }

    public void a() {
        w0 w0Var = this.f28023c;
        if (w0Var != null) {
            this.f28022b.a(w0Var, this.d);
        } else {
            this.f28021a.j0().a(new km(this.f28021a, this));
        }
    }
}

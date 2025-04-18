package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.tm;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public abstract class yl implements Runnable {

    /* renamed from: a */
    protected final com.applovin.impl.sdk.j f28216a;

    /* renamed from: b */
    protected final String f28217b;

    /* renamed from: c */
    protected final com.applovin.impl.sdk.n f28218c;
    private final Context d;

    /* renamed from: f */
    private String f28219f;

    /* renamed from: g */
    private boolean f28220g;

    public yl(String str, com.applovin.impl.sdk.j jVar) {
        this(str, jVar, false, null);
    }

    public com.applovin.impl.sdk.j b() {
        return this.f28216a;
    }

    public String c() {
        return this.f28217b;
    }

    public boolean d() {
        return this.f28220g;
    }

    public yl(String str, com.applovin.impl.sdk.j jVar, String str2) {
        this(str, jVar, false, str2);
    }

    public Context a() {
        return this.d;
    }

    public ScheduledFuture b(Thread thread, long j2) {
        if (j2 <= 0) {
            return null;
        }
        return this.f28216a.j0().b(new jn(this.f28216a, "timeout:" + this.f28217b, new aw(this, thread, j2, 2)), tm.b.TIMEOUT, j2);
    }

    public yl(String str, com.applovin.impl.sdk.j jVar, boolean z2) {
        this(str, jVar, z2, null);
    }

    public void a(String str) {
        this.f28219f = str;
    }

    public yl(String str, com.applovin.impl.sdk.j jVar, boolean z2, String str2) {
        this.f28217b = str;
        this.f28216a = jVar;
        this.f28218c = jVar.J();
        this.d = com.applovin.impl.sdk.j.l();
        this.f28220g = z2;
        this.f28219f = str2;
    }

    public void a(boolean z2) {
        this.f28220g = z2;
    }

    public /* synthetic */ void a(Thread thread, long j2) {
        HashMap<String, String> hashMap = CollectionUtils.hashMap("name", thread.getState().name());
        if (StringUtils.isValidString(this.f28219f)) {
            hashMap.put("details", this.f28219f);
        }
        this.f28216a.E().a(la.R, this.f28217b, (Map) hashMap);
        if (com.applovin.impl.sdk.n.a()) {
            this.f28218c.k(this.f28217b, "Task has been executing for over " + TimeUnit.MILLISECONDS.toSeconds(j2) + " seconds");
        }
    }

    public void a(Throwable th) {
        Map map = CollectionUtils.map("source", this.f28217b);
        map.put("top_main_method", th.toString());
        map.put("details", StringUtils.emptyIfNull(this.f28219f));
        this.f28216a.E().a(la.Q, map);
    }
}

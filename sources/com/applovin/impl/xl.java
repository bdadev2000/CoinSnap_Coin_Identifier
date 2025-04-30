package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class xl implements Runnable {

    /* renamed from: a */
    protected final com.applovin.impl.sdk.k f12278a;
    protected final String b;

    /* renamed from: c */
    protected final com.applovin.impl.sdk.t f12279c;

    /* renamed from: d */
    private final Context f12280d;

    /* renamed from: f */
    private String f12281f;

    /* renamed from: g */
    private boolean f12282g;

    public xl(String str, com.applovin.impl.sdk.k kVar) {
        this(str, kVar, false, null);
    }

    public com.applovin.impl.sdk.k b() {
        return this.f12278a;
    }

    public String c() {
        return this.b;
    }

    public boolean d() {
        return this.f12282g;
    }

    public xl(String str, com.applovin.impl.sdk.k kVar, String str2) {
        this(str, kVar, false, str2);
    }

    public Context a() {
        return this.f12280d;
    }

    public ScheduledFuture b(Thread thread, long j7) {
        if (j7 <= 0) {
            return null;
        }
        return this.f12278a.l0().b(new kn(this.f12278a, "timeout:" + this.b, new E2.a(this, thread, j7, 2)), sm.b.TIMEOUT, j7);
    }

    public xl(String str, com.applovin.impl.sdk.k kVar, boolean z8) {
        this(str, kVar, z8, null);
    }

    public /* synthetic */ void a(Thread thread, long j7) {
        HashMap<String, String> hashMap = CollectionUtils.hashMap("name", thread.getState().name());
        if (StringUtils.isValidString(this.f12281f)) {
            hashMap.put("details", this.f12281f);
        }
        this.f12278a.B().a(o.b.TASK_LATENCY_ALERT, this.b, (Map) hashMap);
        if (com.applovin.impl.sdk.t.a()) {
            this.f12279c.k(this.b, "Task has been executing for over " + TimeUnit.MILLISECONDS.toSeconds(j7) + " seconds");
        }
    }

    public xl(String str, com.applovin.impl.sdk.k kVar, boolean z8, String str2) {
        this.b = str;
        this.f12278a = kVar;
        this.f12279c = kVar.L();
        this.f12280d = com.applovin.impl.sdk.k.k();
        this.f12282g = z8;
        this.f12281f = str2;
    }

    public void a(String str) {
        this.f12281f = str;
    }

    public void a(boolean z8) {
        this.f12282g = z8;
    }

    public void a(Throwable th) {
        Map map = CollectionUtils.map("source", this.b);
        map.put("top_main_method", th.toString());
        map.put("details", StringUtils.emptyIfNull(this.f12281f));
        this.f12278a.B().a(o.b.TASK_EXCEPTION, map);
    }
}

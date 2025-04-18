package com.google.android.material.datepicker;

import com.facebook.ads.AdError;
import java.util.Calendar;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final long f11660f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f11661g;
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11662b;

    /* renamed from: c, reason: collision with root package name */
    public Long f11663c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11664d;

    /* renamed from: e, reason: collision with root package name */
    public final b f11665e;

    static {
        n a = n.a(1900, 0);
        Calendar d10 = u.d(null);
        d10.setTimeInMillis(a.f11728h);
        f11660f = u.b(d10).getTimeInMillis();
        n a10 = n.a(AdError.BROKEN_MEDIA_ERROR_CODE, 11);
        Calendar d11 = u.d(null);
        d11.setTimeInMillis(a10.f11728h);
        f11661g = u.b(d11).getTimeInMillis();
    }

    public a(c cVar) {
        this.a = f11660f;
        this.f11662b = f11661g;
        this.f11665e = new d(Long.MIN_VALUE);
        this.a = cVar.f11666b.f11728h;
        this.f11662b = cVar.f11667c.f11728h;
        this.f11663c = Long.valueOf(cVar.f11669f.f11728h);
        this.f11664d = cVar.f11670g;
        this.f11665e = cVar.f11668d;
    }
}

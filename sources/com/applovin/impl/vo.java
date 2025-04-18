package com.applovin.impl;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import com.applovin.exoplayer2.common.base.MoreObjects;
import com.applovin.impl.ab;
import com.applovin.impl.m2;
import java.util.Collection;
import java.util.Locale;

/* loaded from: classes.dex */
public class vo implements m2 {
    public static final m2.a A;

    /* renamed from: y */
    public static final vo f8579y;

    /* renamed from: z */
    public static final vo f8580z;
    public final int a;

    /* renamed from: b */
    public final int f8581b;

    /* renamed from: c */
    public final int f8582c;

    /* renamed from: d */
    public final int f8583d;

    /* renamed from: f */
    public final int f8584f;

    /* renamed from: g */
    public final int f8585g;

    /* renamed from: h */
    public final int f8586h;

    /* renamed from: i */
    public final int f8587i;

    /* renamed from: j */
    public final int f8588j;

    /* renamed from: k */
    public final int f8589k;

    /* renamed from: l */
    public final boolean f8590l;

    /* renamed from: m */
    public final ab f8591m;

    /* renamed from: n */
    public final ab f8592n;

    /* renamed from: o */
    public final int f8593o;

    /* renamed from: p */
    public final int f8594p;

    /* renamed from: q */
    public final int f8595q;

    /* renamed from: r */
    public final ab f8596r;

    /* renamed from: s */
    public final ab f8597s;

    /* renamed from: t */
    public final int f8598t;
    public final boolean u;

    /* renamed from: v */
    public final boolean f8599v;

    /* renamed from: w */
    public final boolean f8600w;

    /* renamed from: x */
    public final eb f8601x;

    /* loaded from: classes.dex */
    public static class a {
        private int a;

        /* renamed from: b */
        private int f8602b;

        /* renamed from: c */
        private int f8603c;

        /* renamed from: d */
        private int f8604d;

        /* renamed from: e */
        private int f8605e;

        /* renamed from: f */
        private int f8606f;

        /* renamed from: g */
        private int f8607g;

        /* renamed from: h */
        private int f8608h;

        /* renamed from: i */
        private int f8609i;

        /* renamed from: j */
        private int f8610j;

        /* renamed from: k */
        private boolean f8611k;

        /* renamed from: l */
        private ab f8612l;

        /* renamed from: m */
        private ab f8613m;

        /* renamed from: n */
        private int f8614n;

        /* renamed from: o */
        private int f8615o;

        /* renamed from: p */
        private int f8616p;

        /* renamed from: q */
        private ab f8617q;

        /* renamed from: r */
        private ab f8618r;

        /* renamed from: s */
        private int f8619s;

        /* renamed from: t */
        private boolean f8620t;
        private boolean u;

        /* renamed from: v */
        private boolean f8621v;

        /* renamed from: w */
        private eb f8622w;

        public a() {
            this.a = Integer.MAX_VALUE;
            this.f8602b = Integer.MAX_VALUE;
            this.f8603c = Integer.MAX_VALUE;
            this.f8604d = Integer.MAX_VALUE;
            this.f8609i = Integer.MAX_VALUE;
            this.f8610j = Integer.MAX_VALUE;
            this.f8611k = true;
            this.f8612l = ab.h();
            this.f8613m = ab.h();
            this.f8614n = 0;
            this.f8615o = Integer.MAX_VALUE;
            this.f8616p = Integer.MAX_VALUE;
            this.f8617q = ab.h();
            this.f8618r = ab.h();
            this.f8619s = 0;
            this.f8620t = false;
            this.u = false;
            this.f8621v = false;
            this.f8622w = eb.h();
        }

        private static ab a(String[] strArr) {
            ab.a f10 = ab.f();
            for (String str : (String[]) a1.a(strArr)) {
                f10.b(yp.f((String) a1.a((Object) str)));
            }
            return f10.a();
        }

        private void b(Context context) {
            CaptioningManager captioningManager;
            if ((yp.a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.f8619s = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.f8618r = ab.a(yp.a(locale));
                }
            }
        }

        public a a(int i10, int i11, boolean z10) {
            this.f8609i = i10;
            this.f8610j = i11;
            this.f8611k = z10;
            return this;
        }

        public a a(Context context, boolean z10) {
            Point c10 = yp.c(context);
            return a(c10.x, c10.y, z10);
        }

        public a a(Context context) {
            if (yp.a >= 19) {
                b(context);
            }
            return this;
        }

        public vo a() {
            return new vo(this);
        }

        public a(Context context) {
            this();
            a(context);
            a(context, true);
        }

        public a(Bundle bundle) {
            String b3 = vo.b(6);
            vo voVar = vo.f8579y;
            this.a = bundle.getInt(b3, voVar.a);
            this.f8602b = bundle.getInt(vo.b(7), voVar.f8581b);
            this.f8603c = bundle.getInt(vo.b(8), voVar.f8582c);
            this.f8604d = bundle.getInt(vo.b(9), voVar.f8583d);
            this.f8605e = bundle.getInt(vo.b(10), voVar.f8584f);
            this.f8606f = bundle.getInt(vo.b(11), voVar.f8585g);
            this.f8607g = bundle.getInt(vo.b(12), voVar.f8586h);
            this.f8608h = bundle.getInt(vo.b(13), voVar.f8587i);
            this.f8609i = bundle.getInt(vo.b(14), voVar.f8588j);
            this.f8610j = bundle.getInt(vo.b(15), voVar.f8589k);
            this.f8611k = bundle.getBoolean(vo.b(16), voVar.f8590l);
            this.f8612l = ab.c((String[]) MoreObjects.firstNonNull(bundle.getStringArray(vo.b(17)), new String[0]));
            this.f8613m = a((String[]) MoreObjects.firstNonNull(bundle.getStringArray(vo.b(1)), new String[0]));
            this.f8614n = bundle.getInt(vo.b(2), voVar.f8593o);
            this.f8615o = bundle.getInt(vo.b(18), voVar.f8594p);
            this.f8616p = bundle.getInt(vo.b(19), voVar.f8595q);
            this.f8617q = ab.c((String[]) MoreObjects.firstNonNull(bundle.getStringArray(vo.b(20)), new String[0]));
            this.f8618r = a((String[]) MoreObjects.firstNonNull(bundle.getStringArray(vo.b(3)), new String[0]));
            this.f8619s = bundle.getInt(vo.b(4), voVar.f8598t);
            this.f8620t = bundle.getBoolean(vo.b(5), voVar.u);
            this.u = bundle.getBoolean(vo.b(21), voVar.f8599v);
            this.f8621v = bundle.getBoolean(vo.b(22), voVar.f8600w);
            this.f8622w = eb.a((Collection) pb.a((int[]) MoreObjects.firstNonNull(bundle.getIntArray(vo.b(23)), new int[0])));
        }
    }

    static {
        vo a10 = new a().a();
        f8579y = a10;
        f8580z = a10;
        A = new lu(14);
    }

    public vo(a aVar) {
        this.a = aVar.a;
        this.f8581b = aVar.f8602b;
        this.f8582c = aVar.f8603c;
        this.f8583d = aVar.f8604d;
        this.f8584f = aVar.f8605e;
        this.f8585g = aVar.f8606f;
        this.f8586h = aVar.f8607g;
        this.f8587i = aVar.f8608h;
        this.f8588j = aVar.f8609i;
        this.f8589k = aVar.f8610j;
        this.f8590l = aVar.f8611k;
        this.f8591m = aVar.f8612l;
        this.f8592n = aVar.f8613m;
        this.f8593o = aVar.f8614n;
        this.f8594p = aVar.f8615o;
        this.f8595q = aVar.f8616p;
        this.f8596r = aVar.f8617q;
        this.f8597s = aVar.f8618r;
        this.f8598t = aVar.f8619s;
        this.u = aVar.f8620t;
        this.f8599v = aVar.u;
        this.f8600w = aVar.f8621v;
        this.f8601x = aVar.f8622w;
    }

    public static String b(int i10) {
        return Integer.toString(i10, 36);
    }

    public static /* synthetic */ vo c(Bundle bundle) {
        return a(bundle);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        vo voVar = (vo) obj;
        if (this.a == voVar.a && this.f8581b == voVar.f8581b && this.f8582c == voVar.f8582c && this.f8583d == voVar.f8583d && this.f8584f == voVar.f8584f && this.f8585g == voVar.f8585g && this.f8586h == voVar.f8586h && this.f8587i == voVar.f8587i && this.f8590l == voVar.f8590l && this.f8588j == voVar.f8588j && this.f8589k == voVar.f8589k && this.f8591m.equals(voVar.f8591m) && this.f8592n.equals(voVar.f8592n) && this.f8593o == voVar.f8593o && this.f8594p == voVar.f8594p && this.f8595q == voVar.f8595q && this.f8596r.equals(voVar.f8596r) && this.f8597s.equals(voVar.f8597s) && this.f8598t == voVar.f8598t && this.u == voVar.u && this.f8599v == voVar.f8599v && this.f8600w == voVar.f8600w && this.f8601x.equals(voVar.f8601x)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f8601x.hashCode() + ((((((((((this.f8597s.hashCode() + ((this.f8596r.hashCode() + ((((((((this.f8592n.hashCode() + ((this.f8591m.hashCode() + ((((((((((((((((((((((this.a + 31) * 31) + this.f8581b) * 31) + this.f8582c) * 31) + this.f8583d) * 31) + this.f8584f) * 31) + this.f8585g) * 31) + this.f8586h) * 31) + this.f8587i) * 31) + (this.f8590l ? 1 : 0)) * 31) + this.f8588j) * 31) + this.f8589k) * 31)) * 31)) * 31) + this.f8593o) * 31) + this.f8594p) * 31) + this.f8595q) * 31)) * 31)) * 31) + this.f8598t) * 31) + (this.u ? 1 : 0)) * 31) + (this.f8599v ? 1 : 0)) * 31) + (this.f8600w ? 1 : 0)) * 31);
    }

    public static /* synthetic */ vo a(Bundle bundle) {
        return new a(bundle).a();
    }
}

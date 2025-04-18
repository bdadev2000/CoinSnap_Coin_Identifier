package com.applovin.impl;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import com.applovin.exoplayer2.common.base.MoreObjects;
import com.applovin.impl.eb;
import com.applovin.impl.o2;
import com.google.android.gms.common.api.Api;
import java.util.Collection;
import java.util.Locale;

/* loaded from: classes2.dex */
public class uo implements o2 {
    public static final o2.a A;

    /* renamed from: y */
    public static final uo f27386y;

    /* renamed from: z */
    public static final uo f27387z;

    /* renamed from: a */
    public final int f27388a;

    /* renamed from: b */
    public final int f27389b;

    /* renamed from: c */
    public final int f27390c;
    public final int d;

    /* renamed from: f */
    public final int f27391f;

    /* renamed from: g */
    public final int f27392g;

    /* renamed from: h */
    public final int f27393h;

    /* renamed from: i */
    public final int f27394i;

    /* renamed from: j */
    public final int f27395j;

    /* renamed from: k */
    public final int f27396k;

    /* renamed from: l */
    public final boolean f27397l;

    /* renamed from: m */
    public final eb f27398m;

    /* renamed from: n */
    public final eb f27399n;

    /* renamed from: o */
    public final int f27400o;

    /* renamed from: p */
    public final int f27401p;

    /* renamed from: q */
    public final int f27402q;

    /* renamed from: r */
    public final eb f27403r;

    /* renamed from: s */
    public final eb f27404s;

    /* renamed from: t */
    public final int f27405t;

    /* renamed from: u */
    public final boolean f27406u;

    /* renamed from: v */
    public final boolean f27407v;
    public final boolean w;
    public final ib x;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        private int f27408a;

        /* renamed from: b */
        private int f27409b;

        /* renamed from: c */
        private int f27410c;
        private int d;
        private int e;

        /* renamed from: f */
        private int f27411f;

        /* renamed from: g */
        private int f27412g;

        /* renamed from: h */
        private int f27413h;

        /* renamed from: i */
        private int f27414i;

        /* renamed from: j */
        private int f27415j;

        /* renamed from: k */
        private boolean f27416k;

        /* renamed from: l */
        private eb f27417l;

        /* renamed from: m */
        private eb f27418m;

        /* renamed from: n */
        private int f27419n;

        /* renamed from: o */
        private int f27420o;

        /* renamed from: p */
        private int f27421p;

        /* renamed from: q */
        private eb f27422q;

        /* renamed from: r */
        private eb f27423r;

        /* renamed from: s */
        private int f27424s;

        /* renamed from: t */
        private boolean f27425t;

        /* renamed from: u */
        private boolean f27426u;

        /* renamed from: v */
        private boolean f27427v;
        private ib w;

        public a() {
            this.f27408a = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f27409b = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f27410c = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.d = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f27414i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f27415j = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f27416k = true;
            this.f27417l = eb.h();
            this.f27418m = eb.h();
            this.f27419n = 0;
            this.f27420o = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f27421p = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f27422q = eb.h();
            this.f27423r = eb.h();
            this.f27424s = 0;
            this.f27425t = false;
            this.f27426u = false;
            this.f27427v = false;
            this.w = ib.h();
        }

        public a a(int i2, int i3, boolean z2) {
            this.f27414i = i2;
            this.f27415j = i3;
            this.f27416k = z2;
            return this;
        }

        private void b(Context context) {
            CaptioningManager captioningManager;
            if ((xp.f27962a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.f27424s = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.f27423r = eb.a(xp.a(locale));
                }
            }
        }

        private static eb a(String[] strArr) {
            eb.a f2 = eb.f();
            for (String str : (String[]) b1.a(strArr)) {
                f2.b(xp.f((String) b1.a((Object) str)));
            }
            return f2.a();
        }

        public a(Context context) {
            this();
            a(context);
            a(context, true);
        }

        public a a(Context context, boolean z2) {
            Point c2 = xp.c(context);
            return a(c2.x, c2.y, z2);
        }

        public a a(Context context) {
            if (xp.f27962a >= 19) {
                b(context);
            }
            return this;
        }

        public a(Bundle bundle) {
            String b2 = uo.b(6);
            uo uoVar = uo.f27386y;
            this.f27408a = bundle.getInt(b2, uoVar.f27388a);
            this.f27409b = bundle.getInt(uo.b(7), uoVar.f27389b);
            this.f27410c = bundle.getInt(uo.b(8), uoVar.f27390c);
            this.d = bundle.getInt(uo.b(9), uoVar.d);
            this.e = bundle.getInt(uo.b(10), uoVar.f27391f);
            this.f27411f = bundle.getInt(uo.b(11), uoVar.f27392g);
            this.f27412g = bundle.getInt(uo.b(12), uoVar.f27393h);
            this.f27413h = bundle.getInt(uo.b(13), uoVar.f27394i);
            this.f27414i = bundle.getInt(uo.b(14), uoVar.f27395j);
            this.f27415j = bundle.getInt(uo.b(15), uoVar.f27396k);
            this.f27416k = bundle.getBoolean(uo.b(16), uoVar.f27397l);
            this.f27417l = eb.c((String[]) MoreObjects.firstNonNull(bundle.getStringArray(uo.b(17)), new String[0]));
            this.f27418m = a((String[]) MoreObjects.firstNonNull(bundle.getStringArray(uo.b(1)), new String[0]));
            this.f27419n = bundle.getInt(uo.b(2), uoVar.f27400o);
            this.f27420o = bundle.getInt(uo.b(18), uoVar.f27401p);
            this.f27421p = bundle.getInt(uo.b(19), uoVar.f27402q);
            this.f27422q = eb.c((String[]) MoreObjects.firstNonNull(bundle.getStringArray(uo.b(20)), new String[0]));
            this.f27423r = a((String[]) MoreObjects.firstNonNull(bundle.getStringArray(uo.b(3)), new String[0]));
            this.f27424s = bundle.getInt(uo.b(4), uoVar.f27405t);
            this.f27425t = bundle.getBoolean(uo.b(5), uoVar.f27406u);
            this.f27426u = bundle.getBoolean(uo.b(21), uoVar.f27407v);
            this.f27427v = bundle.getBoolean(uo.b(22), uoVar.w);
            this.w = ib.a((Collection) ub.a((int[]) MoreObjects.firstNonNull(bundle.getIntArray(uo.b(23)), new int[0])));
        }

        public uo a() {
            return new uo(this);
        }
    }

    static {
        uo a2 = new a().a();
        f27386y = a2;
        f27387z = a2;
        A = new ru(12);
    }

    public uo(a aVar) {
        this.f27388a = aVar.f27408a;
        this.f27389b = aVar.f27409b;
        this.f27390c = aVar.f27410c;
        this.d = aVar.d;
        this.f27391f = aVar.e;
        this.f27392g = aVar.f27411f;
        this.f27393h = aVar.f27412g;
        this.f27394i = aVar.f27413h;
        this.f27395j = aVar.f27414i;
        this.f27396k = aVar.f27415j;
        this.f27397l = aVar.f27416k;
        this.f27398m = aVar.f27417l;
        this.f27399n = aVar.f27418m;
        this.f27400o = aVar.f27419n;
        this.f27401p = aVar.f27420o;
        this.f27402q = aVar.f27421p;
        this.f27403r = aVar.f27422q;
        this.f27404s = aVar.f27423r;
        this.f27405t = aVar.f27424s;
        this.f27406u = aVar.f27425t;
        this.f27407v = aVar.f27426u;
        this.w = aVar.f27427v;
        this.x = aVar.w;
    }

    public static String b(int i2) {
        return Integer.toString(i2, 36);
    }

    public static /* synthetic */ uo c(Bundle bundle) {
        return a(bundle);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        uo uoVar = (uo) obj;
        return this.f27388a == uoVar.f27388a && this.f27389b == uoVar.f27389b && this.f27390c == uoVar.f27390c && this.d == uoVar.d && this.f27391f == uoVar.f27391f && this.f27392g == uoVar.f27392g && this.f27393h == uoVar.f27393h && this.f27394i == uoVar.f27394i && this.f27397l == uoVar.f27397l && this.f27395j == uoVar.f27395j && this.f27396k == uoVar.f27396k && this.f27398m.equals(uoVar.f27398m) && this.f27399n.equals(uoVar.f27399n) && this.f27400o == uoVar.f27400o && this.f27401p == uoVar.f27401p && this.f27402q == uoVar.f27402q && this.f27403r.equals(uoVar.f27403r) && this.f27404s.equals(uoVar.f27404s) && this.f27405t == uoVar.f27405t && this.f27406u == uoVar.f27406u && this.f27407v == uoVar.f27407v && this.w == uoVar.w && this.x.equals(uoVar.x);
    }

    public int hashCode() {
        return this.x.hashCode() + ((((((((((this.f27404s.hashCode() + ((this.f27403r.hashCode() + ((((((((this.f27399n.hashCode() + ((this.f27398m.hashCode() + ((((((((((((((((((((((this.f27388a + 31) * 31) + this.f27389b) * 31) + this.f27390c) * 31) + this.d) * 31) + this.f27391f) * 31) + this.f27392g) * 31) + this.f27393h) * 31) + this.f27394i) * 31) + (this.f27397l ? 1 : 0)) * 31) + this.f27395j) * 31) + this.f27396k) * 31)) * 31)) * 31) + this.f27400o) * 31) + this.f27401p) * 31) + this.f27402q) * 31)) * 31)) * 31) + this.f27405t) * 31) + (this.f27406u ? 1 : 0)) * 31) + (this.f27407v ? 1 : 0)) * 31) + (this.w ? 1 : 0)) * 31);
    }

    public static /* synthetic */ uo a(Bundle bundle) {
        return new a(bundle).a();
    }
}

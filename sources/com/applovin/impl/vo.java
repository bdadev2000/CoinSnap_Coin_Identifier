package com.applovin.impl;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import com.applovin.exoplayer2.common.base.MoreObjects;
import com.applovin.impl.InterfaceC0725m2;
import com.applovin.impl.ab;
import java.util.Collection;
import java.util.Locale;

/* loaded from: classes.dex */
public class vo implements InterfaceC0725m2 {

    /* renamed from: A */
    public static final InterfaceC0725m2.a f11797A;

    /* renamed from: y */
    public static final vo f11798y;

    /* renamed from: z */
    public static final vo f11799z;

    /* renamed from: a */
    public final int f11800a;
    public final int b;

    /* renamed from: c */
    public final int f11801c;

    /* renamed from: d */
    public final int f11802d;

    /* renamed from: f */
    public final int f11803f;

    /* renamed from: g */
    public final int f11804g;

    /* renamed from: h */
    public final int f11805h;

    /* renamed from: i */
    public final int f11806i;

    /* renamed from: j */
    public final int f11807j;

    /* renamed from: k */
    public final int f11808k;
    public final boolean l;
    public final ab m;

    /* renamed from: n */
    public final ab f11809n;

    /* renamed from: o */
    public final int f11810o;

    /* renamed from: p */
    public final int f11811p;

    /* renamed from: q */
    public final int f11812q;

    /* renamed from: r */
    public final ab f11813r;

    /* renamed from: s */
    public final ab f11814s;

    /* renamed from: t */
    public final int f11815t;

    /* renamed from: u */
    public final boolean f11816u;

    /* renamed from: v */
    public final boolean f11817v;

    /* renamed from: w */
    public final boolean f11818w;

    /* renamed from: x */
    public final eb f11819x;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private int f11820a;
        private int b;

        /* renamed from: c */
        private int f11821c;

        /* renamed from: d */
        private int f11822d;

        /* renamed from: e */
        private int f11823e;

        /* renamed from: f */
        private int f11824f;

        /* renamed from: g */
        private int f11825g;

        /* renamed from: h */
        private int f11826h;

        /* renamed from: i */
        private int f11827i;

        /* renamed from: j */
        private int f11828j;

        /* renamed from: k */
        private boolean f11829k;
        private ab l;
        private ab m;

        /* renamed from: n */
        private int f11830n;

        /* renamed from: o */
        private int f11831o;

        /* renamed from: p */
        private int f11832p;

        /* renamed from: q */
        private ab f11833q;

        /* renamed from: r */
        private ab f11834r;

        /* renamed from: s */
        private int f11835s;

        /* renamed from: t */
        private boolean f11836t;

        /* renamed from: u */
        private boolean f11837u;

        /* renamed from: v */
        private boolean f11838v;

        /* renamed from: w */
        private eb f11839w;

        public a() {
            this.f11820a = Integer.MAX_VALUE;
            this.b = Integer.MAX_VALUE;
            this.f11821c = Integer.MAX_VALUE;
            this.f11822d = Integer.MAX_VALUE;
            this.f11827i = Integer.MAX_VALUE;
            this.f11828j = Integer.MAX_VALUE;
            this.f11829k = true;
            this.l = ab.h();
            this.m = ab.h();
            this.f11830n = 0;
            this.f11831o = Integer.MAX_VALUE;
            this.f11832p = Integer.MAX_VALUE;
            this.f11833q = ab.h();
            this.f11834r = ab.h();
            this.f11835s = 0;
            this.f11836t = false;
            this.f11837u = false;
            this.f11838v = false;
            this.f11839w = eb.h();
        }

        private static ab a(String[] strArr) {
            ab.a f9 = ab.f();
            for (String str : (String[]) AbstractC0669a1.a(strArr)) {
                f9.b(yp.f((String) AbstractC0669a1.a((Object) str)));
            }
            return f9.a();
        }

        private void b(Context context) {
            CaptioningManager captioningManager;
            if ((yp.f12451a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.f11835s = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.f11834r = ab.a(yp.a(locale));
                }
            }
        }

        public a a(int i9, int i10, boolean z8) {
            this.f11827i = i9;
            this.f11828j = i10;
            this.f11829k = z8;
            return this;
        }

        public a a(Context context, boolean z8) {
            Point c9 = yp.c(context);
            return a(c9.x, c9.y, z8);
        }

        public a a(Context context) {
            if (yp.f12451a >= 19) {
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
            String b = vo.b(6);
            vo voVar = vo.f11798y;
            this.f11820a = bundle.getInt(b, voVar.f11800a);
            this.b = bundle.getInt(vo.b(7), voVar.b);
            this.f11821c = bundle.getInt(vo.b(8), voVar.f11801c);
            this.f11822d = bundle.getInt(vo.b(9), voVar.f11802d);
            this.f11823e = bundle.getInt(vo.b(10), voVar.f11803f);
            this.f11824f = bundle.getInt(vo.b(11), voVar.f11804g);
            this.f11825g = bundle.getInt(vo.b(12), voVar.f11805h);
            this.f11826h = bundle.getInt(vo.b(13), voVar.f11806i);
            this.f11827i = bundle.getInt(vo.b(14), voVar.f11807j);
            this.f11828j = bundle.getInt(vo.b(15), voVar.f11808k);
            this.f11829k = bundle.getBoolean(vo.b(16), voVar.l);
            this.l = ab.c((String[]) MoreObjects.firstNonNull(bundle.getStringArray(vo.b(17)), new String[0]));
            this.m = a((String[]) MoreObjects.firstNonNull(bundle.getStringArray(vo.b(1)), new String[0]));
            this.f11830n = bundle.getInt(vo.b(2), voVar.f11810o);
            this.f11831o = bundle.getInt(vo.b(18), voVar.f11811p);
            this.f11832p = bundle.getInt(vo.b(19), voVar.f11812q);
            this.f11833q = ab.c((String[]) MoreObjects.firstNonNull(bundle.getStringArray(vo.b(20)), new String[0]));
            this.f11834r = a((String[]) MoreObjects.firstNonNull(bundle.getStringArray(vo.b(3)), new String[0]));
            this.f11835s = bundle.getInt(vo.b(4), voVar.f11815t);
            this.f11836t = bundle.getBoolean(vo.b(5), voVar.f11816u);
            this.f11837u = bundle.getBoolean(vo.b(21), voVar.f11817v);
            this.f11838v = bundle.getBoolean(vo.b(22), voVar.f11818w);
            this.f11839w = eb.a((Collection) pb.a((int[]) MoreObjects.firstNonNull(bundle.getIntArray(vo.b(23)), new int[0])));
        }
    }

    static {
        vo a6 = new a().a();
        f11798y = a6;
        f11799z = a6;
        f11797A = new C1(15);
    }

    public vo(a aVar) {
        this.f11800a = aVar.f11820a;
        this.b = aVar.b;
        this.f11801c = aVar.f11821c;
        this.f11802d = aVar.f11822d;
        this.f11803f = aVar.f11823e;
        this.f11804g = aVar.f11824f;
        this.f11805h = aVar.f11825g;
        this.f11806i = aVar.f11826h;
        this.f11807j = aVar.f11827i;
        this.f11808k = aVar.f11828j;
        this.l = aVar.f11829k;
        this.m = aVar.l;
        this.f11809n = aVar.m;
        this.f11810o = aVar.f11830n;
        this.f11811p = aVar.f11831o;
        this.f11812q = aVar.f11832p;
        this.f11813r = aVar.f11833q;
        this.f11814s = aVar.f11834r;
        this.f11815t = aVar.f11835s;
        this.f11816u = aVar.f11836t;
        this.f11817v = aVar.f11837u;
        this.f11818w = aVar.f11838v;
        this.f11819x = aVar.f11839w;
    }

    public static String b(int i9) {
        return Integer.toString(i9, 36);
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
        if (this.f11800a == voVar.f11800a && this.b == voVar.b && this.f11801c == voVar.f11801c && this.f11802d == voVar.f11802d && this.f11803f == voVar.f11803f && this.f11804g == voVar.f11804g && this.f11805h == voVar.f11805h && this.f11806i == voVar.f11806i && this.l == voVar.l && this.f11807j == voVar.f11807j && this.f11808k == voVar.f11808k && this.m.equals(voVar.m) && this.f11809n.equals(voVar.f11809n) && this.f11810o == voVar.f11810o && this.f11811p == voVar.f11811p && this.f11812q == voVar.f11812q && this.f11813r.equals(voVar.f11813r) && this.f11814s.equals(voVar.f11814s) && this.f11815t == voVar.f11815t && this.f11816u == voVar.f11816u && this.f11817v == voVar.f11817v && this.f11818w == voVar.f11818w && this.f11819x.equals(voVar.f11819x)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f11819x.hashCode() + ((((((((((this.f11814s.hashCode() + ((this.f11813r.hashCode() + ((((((((this.f11809n.hashCode() + ((this.m.hashCode() + ((((((((((((((((((((((this.f11800a + 31) * 31) + this.b) * 31) + this.f11801c) * 31) + this.f11802d) * 31) + this.f11803f) * 31) + this.f11804g) * 31) + this.f11805h) * 31) + this.f11806i) * 31) + (this.l ? 1 : 0)) * 31) + this.f11807j) * 31) + this.f11808k) * 31)) * 31)) * 31) + this.f11810o) * 31) + this.f11811p) * 31) + this.f11812q) * 31)) * 31)) * 31) + this.f11815t) * 31) + (this.f11816u ? 1 : 0)) * 31) + (this.f11817v ? 1 : 0)) * 31) + (this.f11818w ? 1 : 0)) * 31);
    }

    public static /* synthetic */ vo a(Bundle bundle) {
        return new a(bundle).a();
    }
}

package com.applovin.impl;

import android.net.Uri;
import android.os.Bundle;
import com.applovin.impl.o2;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class td implements o2 {

    /* renamed from: g */
    public static final td f27055g = new c().a();

    /* renamed from: h */
    public static final o2.a f27056h = new ru(7);

    /* renamed from: a */
    public final String f27057a;

    /* renamed from: b */
    public final g f27058b;

    /* renamed from: c */
    public final f f27059c;
    public final vd d;

    /* renamed from: f */
    public final d f27060f;

    /* loaded from: classes.dex */
    public static final class b {
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        private String f27061a;

        /* renamed from: b */
        private Uri f27062b;

        /* renamed from: c */
        private String f27063c;
        private long d;
        private long e;

        /* renamed from: f */
        private boolean f27064f;

        /* renamed from: g */
        private boolean f27065g;

        /* renamed from: h */
        private boolean f27066h;

        /* renamed from: i */
        private e.a f27067i;

        /* renamed from: j */
        private List f27068j;

        /* renamed from: k */
        private String f27069k;

        /* renamed from: l */
        private List f27070l;

        /* renamed from: m */
        private Object f27071m;

        /* renamed from: n */
        private vd f27072n;

        /* renamed from: o */
        private f.a f27073o;

        public c() {
            this.e = Long.MIN_VALUE;
            this.f27067i = new e.a();
            this.f27068j = Collections.emptyList();
            this.f27070l = Collections.emptyList();
            this.f27073o = new f.a();
        }

        public c a(Uri uri) {
            this.f27062b = uri;
            return this;
        }

        public c b(String str) {
            this.f27061a = (String) b1.a((Object) str);
            return this;
        }

        public c a(Object obj) {
            this.f27071m = obj;
            return this;
        }

        public c a(String str) {
            this.f27069k = str;
            return this;
        }

        public td a() {
            g gVar;
            b1.b(this.f27067i.f27086b == null || this.f27067i.f27085a != null);
            Uri uri = this.f27062b;
            if (uri != null) {
                gVar = new g(uri, this.f27063c, this.f27067i.f27085a != null ? this.f27067i.a() : null, null, this.f27068j, this.f27069k, this.f27070l, this.f27071m);
            } else {
                gVar = null;
            }
            String str = this.f27061a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            d dVar = new d(this.d, this.e, this.f27064f, this.f27065g, this.f27066h);
            f a2 = this.f27073o.a();
            vd vdVar = this.f27072n;
            if (vdVar == null) {
                vdVar = vd.H;
            }
            return new td(str2, dVar, gVar, a2, vdVar);
        }

        private c(td tdVar) {
            this();
            e.a aVar;
            d dVar = tdVar.f27060f;
            this.e = dVar.f27076b;
            this.f27064f = dVar.f27077c;
            this.f27065g = dVar.d;
            this.d = dVar.f27075a;
            this.f27066h = dVar.f27078f;
            this.f27061a = tdVar.f27057a;
            this.f27072n = tdVar.d;
            this.f27073o = tdVar.f27059c.a();
            g gVar = tdVar.f27058b;
            if (gVar != null) {
                this.f27069k = gVar.e;
                this.f27063c = gVar.f27101b;
                this.f27062b = gVar.f27100a;
                this.f27068j = gVar.d;
                this.f27070l = gVar.f27103f;
                this.f27071m = gVar.f27104g;
                e eVar = gVar.f27102c;
                if (eVar != null) {
                    aVar = eVar.a();
                } else {
                    aVar = new e.a();
                }
                this.f27067i = aVar;
            }
        }

        public /* synthetic */ c(td tdVar, a aVar) {
            this(tdVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements o2 {

        /* renamed from: g */
        public static final o2.a f27074g = new ru(8);

        /* renamed from: a */
        public final long f27075a;

        /* renamed from: b */
        public final long f27076b;

        /* renamed from: c */
        public final boolean f27077c;
        public final boolean d;

        /* renamed from: f */
        public final boolean f27078f;

        private d(long j2, long j3, boolean z2, boolean z3, boolean z4) {
            this.f27075a = j2;
            this.f27076b = j3;
            this.f27077c = z2;
            this.d = z3;
            this.f27078f = z4;
        }

        private static String a(int i2) {
            return Integer.toString(i2, 36);
        }

        public static /* synthetic */ d b(Bundle bundle) {
            return a(bundle);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f27075a == dVar.f27075a && this.f27076b == dVar.f27076b && this.f27077c == dVar.f27077c && this.d == dVar.d && this.f27078f == dVar.f27078f;
        }

        public int hashCode() {
            long j2 = this.f27075a;
            int i2 = ((int) (j2 ^ (j2 >>> 32))) * 31;
            long j3 = this.f27076b;
            return ((((((i2 + ((int) ((j3 >>> 32) ^ j3))) * 31) + (this.f27077c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f27078f ? 1 : 0);
        }

        public /* synthetic */ d(long j2, long j3, boolean z2, boolean z3, boolean z4, a aVar) {
            this(j2, j3, z2, z3, z4);
        }

        public static /* synthetic */ d a(Bundle bundle) {
            return new d(bundle.getLong(a(0), 0L), bundle.getLong(a(1), Long.MIN_VALUE), bundle.getBoolean(a(2), false), bundle.getBoolean(a(3), false), bundle.getBoolean(a(4), false));
        }
    }

    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a */
        public final UUID f27079a;

        /* renamed from: b */
        public final Uri f27080b;

        /* renamed from: c */
        public final gb f27081c;
        public final boolean d;
        public final boolean e;

        /* renamed from: f */
        public final boolean f27082f;

        /* renamed from: g */
        public final eb f27083g;

        /* renamed from: h */
        private final byte[] f27084h;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a */
            private UUID f27085a;

            /* renamed from: b */
            private Uri f27086b;

            /* renamed from: c */
            private gb f27087c;
            private boolean d;
            private boolean e;

            /* renamed from: f */
            private boolean f27088f;

            /* renamed from: g */
            private eb f27089g;

            /* renamed from: h */
            private byte[] f27090h;

            private a() {
                this.f27087c = gb.h();
                this.f27089g = eb.h();
            }

            public e a() {
                return new e(this);
            }

            public /* synthetic */ a(a aVar) {
                this();
            }

            private a(e eVar) {
                this.f27085a = eVar.f27079a;
                this.f27086b = eVar.f27080b;
                this.f27087c = eVar.f27081c;
                this.d = eVar.d;
                this.e = eVar.e;
                this.f27088f = eVar.f27082f;
                this.f27089g = eVar.f27083g;
                this.f27090h = eVar.f27084h;
            }

            public /* synthetic */ a(e eVar, a aVar) {
                this(eVar);
            }
        }

        private e(a aVar) {
            b1.b((aVar.f27088f && aVar.f27086b == null) ? false : true);
            this.f27079a = (UUID) b1.a(aVar.f27085a);
            this.f27080b = aVar.f27086b;
            this.f27081c = aVar.f27087c;
            this.d = aVar.d;
            this.f27082f = aVar.f27088f;
            this.e = aVar.e;
            this.f27083g = aVar.f27089g;
            this.f27084h = aVar.f27090h != null ? Arrays.copyOf(aVar.f27090h, aVar.f27090h.length) : null;
        }

        public byte[] b() {
            byte[] bArr = this.f27084h;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f27079a.equals(eVar.f27079a) && xp.a(this.f27080b, eVar.f27080b) && xp.a(this.f27081c, eVar.f27081c) && this.d == eVar.d && this.f27082f == eVar.f27082f && this.e == eVar.e && this.f27083g.equals(eVar.f27083g) && Arrays.equals(this.f27084h, eVar.f27084h);
        }

        public int hashCode() {
            int hashCode = this.f27079a.hashCode() * 31;
            Uri uri = this.f27080b;
            return Arrays.hashCode(this.f27084h) + ((this.f27083g.hashCode() + ((((((((this.f27081c.hashCode() + ((hashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f27082f ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31)) * 31);
        }

        public a a() {
            return new a();
        }

        public /* synthetic */ e(a aVar, a aVar2) {
            this(aVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements o2 {

        /* renamed from: g */
        public static final f f27091g = new a().a();

        /* renamed from: h */
        public static final o2.a f27092h = new ru(9);

        /* renamed from: a */
        public final long f27093a;

        /* renamed from: b */
        public final long f27094b;

        /* renamed from: c */
        public final long f27095c;
        public final float d;

        /* renamed from: f */
        public final float f27096f;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a */
            private long f27097a;

            /* renamed from: b */
            private long f27098b;

            /* renamed from: c */
            private long f27099c;
            private float d;
            private float e;

            public a() {
                this.f27097a = -9223372036854775807L;
                this.f27098b = -9223372036854775807L;
                this.f27099c = -9223372036854775807L;
                this.d = -3.4028235E38f;
                this.e = -3.4028235E38f;
            }

            private a(f fVar) {
                this.f27097a = fVar.f27093a;
                this.f27098b = fVar.f27094b;
                this.f27099c = fVar.f27095c;
                this.d = fVar.d;
                this.e = fVar.f27096f;
            }

            public f a() {
                return new f(this);
            }

            public /* synthetic */ a(f fVar, a aVar) {
                this(fVar);
            }
        }

        public f(long j2, long j3, long j4, float f2, float f3) {
            this.f27093a = j2;
            this.f27094b = j3;
            this.f27095c = j4;
            this.d = f2;
            this.f27096f = f3;
        }

        private static String a(int i2) {
            return Integer.toString(i2, 36);
        }

        public static /* synthetic */ f b(Bundle bundle) {
            return a(bundle);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f27093a == fVar.f27093a && this.f27094b == fVar.f27094b && this.f27095c == fVar.f27095c && this.d == fVar.d && this.f27096f == fVar.f27096f;
        }

        public int hashCode() {
            long j2 = this.f27093a;
            long j3 = this.f27094b;
            int i2 = ((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            long j4 = this.f27095c;
            int i3 = (i2 + ((int) ((j4 >>> 32) ^ j4))) * 31;
            float f2 = this.d;
            int floatToIntBits = (i3 + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
            float f3 = this.f27096f;
            return floatToIntBits + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0);
        }

        private f(a aVar) {
            this(aVar.f27097a, aVar.f27098b, aVar.f27099c, aVar.d, aVar.e);
        }

        public a a() {
            return new a();
        }

        public static /* synthetic */ f a(Bundle bundle) {
            return new f(bundle.getLong(a(0), -9223372036854775807L), bundle.getLong(a(1), -9223372036854775807L), bundle.getLong(a(2), -9223372036854775807L), bundle.getFloat(a(3), -3.4028235E38f), bundle.getFloat(a(4), -3.4028235E38f));
        }

        public /* synthetic */ f(a aVar, a aVar2) {
            this(aVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a */
        public final Uri f27100a;

        /* renamed from: b */
        public final String f27101b;

        /* renamed from: c */
        public final e f27102c;
        public final List d;
        public final String e;

        /* renamed from: f */
        public final List f27103f;

        /* renamed from: g */
        public final Object f27104g;

        private g(Uri uri, String str, e eVar, b bVar, List list, String str2, List list2, Object obj) {
            this.f27100a = uri;
            this.f27101b = str;
            this.f27102c = eVar;
            this.d = list;
            this.e = str2;
            this.f27103f = list2;
            this.f27104g = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f27100a.equals(gVar.f27100a) && xp.a((Object) this.f27101b, (Object) gVar.f27101b) && xp.a(this.f27102c, gVar.f27102c) && xp.a((Object) null, (Object) null) && this.d.equals(gVar.d) && xp.a((Object) this.e, (Object) gVar.e) && this.f27103f.equals(gVar.f27103f) && xp.a(this.f27104g, gVar.f27104g);
        }

        public int hashCode() {
            int hashCode = this.f27100a.hashCode() * 31;
            String str = this.f27101b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            e eVar = this.f27102c;
            int hashCode3 = (this.d.hashCode() + ((hashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 961)) * 31;
            String str2 = this.e;
            int hashCode4 = (this.f27103f.hashCode() + ((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            Object obj = this.f27104g;
            return hashCode4 + (obj != null ? obj.hashCode() : 0);
        }

        public /* synthetic */ g(Uri uri, String str, e eVar, b bVar, List list, String str2, List list2, Object obj, a aVar) {
            this(uri, str, eVar, bVar, list, str2, list2, obj);
        }
    }

    private td(String str, d dVar, g gVar, f fVar, vd vdVar) {
        this.f27057a = str;
        this.f27058b = gVar;
        this.f27059c = fVar;
        this.d = vdVar;
        this.f27060f = dVar;
    }

    public static td a(Bundle bundle) {
        f fVar;
        vd vdVar;
        d dVar;
        String str = (String) b1.a((Object) bundle.getString(a(0), ""));
        Bundle bundle2 = bundle.getBundle(a(1));
        if (bundle2 == null) {
            fVar = f.f27091g;
        } else {
            fVar = (f) f.f27092h.a(bundle2);
        }
        f fVar2 = fVar;
        Bundle bundle3 = bundle.getBundle(a(2));
        if (bundle3 == null) {
            vdVar = vd.H;
        } else {
            vdVar = (vd) vd.I.a(bundle3);
        }
        vd vdVar2 = vdVar;
        Bundle bundle4 = bundle.getBundle(a(3));
        if (bundle4 == null) {
            dVar = new d(0L, Long.MIN_VALUE, false, false, false);
        } else {
            dVar = (d) d.f27074g.a(bundle4);
        }
        return new td(str, dVar, null, fVar2, vdVar2);
    }

    public static /* synthetic */ td b(Bundle bundle) {
        return a(bundle);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof td)) {
            return false;
        }
        td tdVar = (td) obj;
        return xp.a((Object) this.f27057a, (Object) tdVar.f27057a) && this.f27060f.equals(tdVar.f27060f) && xp.a(this.f27058b, tdVar.f27058b) && xp.a(this.f27059c, tdVar.f27059c) && xp.a(this.d, tdVar.d);
    }

    public int hashCode() {
        int hashCode = this.f27057a.hashCode() * 31;
        g gVar = this.f27058b;
        return this.d.hashCode() + ((this.f27060f.hashCode() + ((this.f27059c.hashCode() + ((hashCode + (gVar != null ? gVar.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public /* synthetic */ td(String str, d dVar, g gVar, f fVar, vd vdVar, a aVar) {
        this(str, dVar, gVar, fVar, vdVar);
    }

    private static String a(int i2) {
        return Integer.toString(i2, 36);
    }

    public static td a(Uri uri) {
        return new c().a(uri).a();
    }

    public c a() {
        return new c();
    }
}

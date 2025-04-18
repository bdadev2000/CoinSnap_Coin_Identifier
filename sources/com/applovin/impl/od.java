package com.applovin.impl;

import android.net.Uri;
import android.os.Bundle;
import com.applovin.impl.m2;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class od implements m2 {

    /* renamed from: g */
    public static final od f6475g = new c().a();

    /* renamed from: h */
    public static final m2.a f6476h = new ss(28);
    public final String a;

    /* renamed from: b */
    public final g f6477b;

    /* renamed from: c */
    public final f f6478c;

    /* renamed from: d */
    public final qd f6479d;

    /* renamed from: f */
    public final d f6480f;

    /* loaded from: classes.dex */
    public static final class b {
    }

    /* loaded from: classes.dex */
    public static final class d implements m2 {

        /* renamed from: g */
        public static final m2.a f6495g = new ss(29);
        public final long a;

        /* renamed from: b */
        public final long f6496b;

        /* renamed from: c */
        public final boolean f6497c;

        /* renamed from: d */
        public final boolean f6498d;

        /* renamed from: f */
        public final boolean f6499f;

        private d(long j3, long j10, boolean z10, boolean z11, boolean z12) {
            this.a = j3;
            this.f6496b = j10;
            this.f6497c = z10;
            this.f6498d = z11;
            this.f6499f = z12;
        }

        private static String a(int i10) {
            return Integer.toString(i10, 36);
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
            if (this.a == dVar.a && this.f6496b == dVar.f6496b && this.f6497c == dVar.f6497c && this.f6498d == dVar.f6498d && this.f6499f == dVar.f6499f) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            long j3 = this.a;
            int i10 = ((int) (j3 ^ (j3 >>> 32))) * 31;
            long j10 = this.f6496b;
            return ((((((i10 + ((int) ((j10 >>> 32) ^ j10))) * 31) + (this.f6497c ? 1 : 0)) * 31) + (this.f6498d ? 1 : 0)) * 31) + (this.f6499f ? 1 : 0);
        }

        public static /* synthetic */ d a(Bundle bundle) {
            return new d(bundle.getLong(a(0), 0L), bundle.getLong(a(1), Long.MIN_VALUE), bundle.getBoolean(a(2), false), bundle.getBoolean(a(3), false), bundle.getBoolean(a(4), false));
        }

        public /* synthetic */ d(long j3, long j10, boolean z10, boolean z11, boolean z12, a aVar) {
            this(j3, j10, z10, z11, z12);
        }
    }

    /* loaded from: classes.dex */
    public static final class e {
        public final UUID a;

        /* renamed from: b */
        public final Uri f6500b;

        /* renamed from: c */
        public final cb f6501c;

        /* renamed from: d */
        public final boolean f6502d;

        /* renamed from: e */
        public final boolean f6503e;

        /* renamed from: f */
        public final boolean f6504f;

        /* renamed from: g */
        public final ab f6505g;

        /* renamed from: h */
        private final byte[] f6506h;

        /* loaded from: classes.dex */
        public static final class a {
            private UUID a;

            /* renamed from: b */
            private Uri f6507b;

            /* renamed from: c */
            private cb f6508c;

            /* renamed from: d */
            private boolean f6509d;

            /* renamed from: e */
            private boolean f6510e;

            /* renamed from: f */
            private boolean f6511f;

            /* renamed from: g */
            private ab f6512g;

            /* renamed from: h */
            private byte[] f6513h;

            private a() {
                this.f6508c = cb.h();
                this.f6512g = ab.h();
            }

            public e a() {
                return new e(this);
            }

            public /* synthetic */ a(a aVar) {
                this();
            }

            private a(e eVar) {
                this.a = eVar.a;
                this.f6507b = eVar.f6500b;
                this.f6508c = eVar.f6501c;
                this.f6509d = eVar.f6502d;
                this.f6510e = eVar.f6503e;
                this.f6511f = eVar.f6504f;
                this.f6512g = eVar.f6505g;
                this.f6513h = eVar.f6506h;
            }

            public /* synthetic */ a(e eVar, a aVar) {
                this(eVar);
            }
        }

        private e(a aVar) {
            a1.b((aVar.f6511f && aVar.f6507b == null) ? false : true);
            this.a = (UUID) a1.a(aVar.a);
            this.f6500b = aVar.f6507b;
            this.f6501c = aVar.f6508c;
            this.f6502d = aVar.f6509d;
            this.f6504f = aVar.f6511f;
            this.f6503e = aVar.f6510e;
            this.f6505g = aVar.f6512g;
            this.f6506h = aVar.f6513h != null ? Arrays.copyOf(aVar.f6513h, aVar.f6513h.length) : null;
        }

        public byte[] b() {
            byte[] bArr = this.f6506h;
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
            if (this.a.equals(eVar.a) && yp.a(this.f6500b, eVar.f6500b) && yp.a(this.f6501c, eVar.f6501c) && this.f6502d == eVar.f6502d && this.f6504f == eVar.f6504f && this.f6503e == eVar.f6503e && this.f6505g.equals(eVar.f6505g) && Arrays.equals(this.f6506h, eVar.f6506h)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i10;
            int hashCode = this.a.hashCode() * 31;
            Uri uri = this.f6500b;
            if (uri != null) {
                i10 = uri.hashCode();
            } else {
                i10 = 0;
            }
            return Arrays.hashCode(this.f6506h) + ((this.f6505g.hashCode() + ((((((((this.f6501c.hashCode() + ((hashCode + i10) * 31)) * 31) + (this.f6502d ? 1 : 0)) * 31) + (this.f6504f ? 1 : 0)) * 31) + (this.f6503e ? 1 : 0)) * 31)) * 31);
        }

        public a a() {
            return new a();
        }

        public /* synthetic */ e(a aVar, a aVar2) {
            this(aVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements m2 {

        /* renamed from: g */
        public static final f f6514g = new a().a();

        /* renamed from: h */
        public static final m2.a f6515h = new lu(0);
        public final long a;

        /* renamed from: b */
        public final long f6516b;

        /* renamed from: c */
        public final long f6517c;

        /* renamed from: d */
        public final float f6518d;

        /* renamed from: f */
        public final float f6519f;

        /* loaded from: classes.dex */
        public static final class a {
            private long a;

            /* renamed from: b */
            private long f6520b;

            /* renamed from: c */
            private long f6521c;

            /* renamed from: d */
            private float f6522d;

            /* renamed from: e */
            private float f6523e;

            public a() {
                this.a = C.TIME_UNSET;
                this.f6520b = C.TIME_UNSET;
                this.f6521c = C.TIME_UNSET;
                this.f6522d = -3.4028235E38f;
                this.f6523e = -3.4028235E38f;
            }

            public f a() {
                return new f(this);
            }

            private a(f fVar) {
                this.a = fVar.a;
                this.f6520b = fVar.f6516b;
                this.f6521c = fVar.f6517c;
                this.f6522d = fVar.f6518d;
                this.f6523e = fVar.f6519f;
            }

            public /* synthetic */ a(f fVar, a aVar) {
                this(fVar);
            }
        }

        public f(long j3, long j10, long j11, float f10, float f11) {
            this.a = j3;
            this.f6516b = j10;
            this.f6517c = j11;
            this.f6518d = f10;
            this.f6519f = f11;
        }

        private static String a(int i10) {
            return Integer.toString(i10, 36);
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
            if (this.a == fVar.a && this.f6516b == fVar.f6516b && this.f6517c == fVar.f6517c && this.f6518d == fVar.f6518d && this.f6519f == fVar.f6519f) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i10;
            long j3 = this.a;
            long j10 = this.f6516b;
            int i11 = ((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f6517c;
            int i12 = (i11 + ((int) ((j11 >>> 32) ^ j11))) * 31;
            float f10 = this.f6518d;
            int i13 = 0;
            if (f10 != 0.0f) {
                i10 = Float.floatToIntBits(f10);
            } else {
                i10 = 0;
            }
            int i14 = (i12 + i10) * 31;
            float f11 = this.f6519f;
            if (f11 != 0.0f) {
                i13 = Float.floatToIntBits(f11);
            }
            return i14 + i13;
        }

        public a a() {
            return new a();
        }

        public static /* synthetic */ f a(Bundle bundle) {
            return new f(bundle.getLong(a(0), C.TIME_UNSET), bundle.getLong(a(1), C.TIME_UNSET), bundle.getLong(a(2), C.TIME_UNSET), bundle.getFloat(a(3), -3.4028235E38f), bundle.getFloat(a(4), -3.4028235E38f));
        }

        private f(a aVar) {
            this(aVar.a, aVar.f6520b, aVar.f6521c, aVar.f6522d, aVar.f6523e);
        }

        public /* synthetic */ f(a aVar, a aVar2) {
            this(aVar);
        }
    }

    private od(String str, d dVar, g gVar, f fVar, qd qdVar) {
        this.a = str;
        this.f6477b = gVar;
        this.f6478c = fVar;
        this.f6479d = qdVar;
        this.f6480f = dVar;
    }

    public static od a(Bundle bundle) {
        f fVar;
        qd qdVar;
        d dVar;
        String str = (String) a1.a((Object) bundle.getString(a(0), ""));
        Bundle bundle2 = bundle.getBundle(a(1));
        if (bundle2 == null) {
            fVar = f.f6514g;
        } else {
            fVar = (f) f.f6515h.a(bundle2);
        }
        f fVar2 = fVar;
        Bundle bundle3 = bundle.getBundle(a(2));
        if (bundle3 == null) {
            qdVar = qd.H;
        } else {
            qdVar = (qd) qd.I.a(bundle3);
        }
        qd qdVar2 = qdVar;
        Bundle bundle4 = bundle.getBundle(a(3));
        if (bundle4 == null) {
            dVar = new d(0L, Long.MIN_VALUE, false, false, false);
        } else {
            dVar = (d) d.f6495g.a(bundle4);
        }
        return new od(str, dVar, null, fVar2, qdVar2);
    }

    public static /* synthetic */ od b(Bundle bundle) {
        return a(bundle);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof od)) {
            return false;
        }
        od odVar = (od) obj;
        if (yp.a((Object) this.a, (Object) odVar.a) && this.f6480f.equals(odVar.f6480f) && yp.a(this.f6477b, odVar.f6477b) && yp.a(this.f6478c, odVar.f6478c) && yp.a(this.f6479d, odVar.f6479d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int hashCode = this.a.hashCode() * 31;
        g gVar = this.f6477b;
        if (gVar != null) {
            i10 = gVar.hashCode();
        } else {
            i10 = 0;
        }
        return this.f6479d.hashCode() + ((this.f6480f.hashCode() + ((this.f6478c.hashCode() + ((hashCode + i10) * 31)) * 31)) * 31);
    }

    /* loaded from: classes.dex */
    public static final class c {
        private String a;

        /* renamed from: b */
        private Uri f6481b;

        /* renamed from: c */
        private String f6482c;

        /* renamed from: d */
        private long f6483d;

        /* renamed from: e */
        private long f6484e;

        /* renamed from: f */
        private boolean f6485f;

        /* renamed from: g */
        private boolean f6486g;

        /* renamed from: h */
        private boolean f6487h;

        /* renamed from: i */
        private e.a f6488i;

        /* renamed from: j */
        private List f6489j;

        /* renamed from: k */
        private String f6490k;

        /* renamed from: l */
        private List f6491l;

        /* renamed from: m */
        private Object f6492m;

        /* renamed from: n */
        private qd f6493n;

        /* renamed from: o */
        private f.a f6494o;

        public c() {
            this.f6484e = Long.MIN_VALUE;
            this.f6488i = new e.a();
            this.f6489j = Collections.emptyList();
            this.f6491l = Collections.emptyList();
            this.f6494o = new f.a();
        }

        public od a() {
            g gVar;
            a1.b(this.f6488i.f6507b == null || this.f6488i.a != null);
            Uri uri = this.f6481b;
            if (uri != null) {
                gVar = new g(uri, this.f6482c, this.f6488i.a != null ? this.f6488i.a() : null, null, this.f6489j, this.f6490k, this.f6491l, this.f6492m);
            } else {
                gVar = null;
            }
            String str = this.a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            d dVar = new d(this.f6483d, this.f6484e, this.f6485f, this.f6486g, this.f6487h);
            f a = this.f6494o.a();
            qd qdVar = this.f6493n;
            if (qdVar == null) {
                qdVar = qd.H;
            }
            return new od(str2, dVar, gVar, a, qdVar);
        }

        public c b(String str) {
            this.a = (String) a1.a((Object) str);
            return this;
        }

        private c(od odVar) {
            this();
            e.a aVar;
            d dVar = odVar.f6480f;
            this.f6484e = dVar.f6496b;
            this.f6485f = dVar.f6497c;
            this.f6486g = dVar.f6498d;
            this.f6483d = dVar.a;
            this.f6487h = dVar.f6499f;
            this.a = odVar.a;
            this.f6493n = odVar.f6479d;
            this.f6494o = odVar.f6478c.a();
            g gVar = odVar.f6477b;
            if (gVar != null) {
                this.f6490k = gVar.f6527e;
                this.f6482c = gVar.f6524b;
                this.f6481b = gVar.a;
                this.f6489j = gVar.f6526d;
                this.f6491l = gVar.f6528f;
                this.f6492m = gVar.f6529g;
                e eVar = gVar.f6525c;
                if (eVar != null) {
                    aVar = eVar.a();
                } else {
                    aVar = new e.a();
                }
                this.f6488i = aVar;
            }
        }

        public c a(String str) {
            this.f6490k = str;
            return this;
        }

        public c a(Object obj) {
            this.f6492m = obj;
            return this;
        }

        public c a(Uri uri) {
            this.f6481b = uri;
            return this;
        }

        public /* synthetic */ c(od odVar, a aVar) {
            this(odVar);
        }
    }

    public /* synthetic */ od(String str, d dVar, g gVar, f fVar, qd qdVar, a aVar) {
        this(str, dVar, gVar, fVar, qdVar);
    }

    /* loaded from: classes.dex */
    public static final class g {
        public final Uri a;

        /* renamed from: b */
        public final String f6524b;

        /* renamed from: c */
        public final e f6525c;

        /* renamed from: d */
        public final List f6526d;

        /* renamed from: e */
        public final String f6527e;

        /* renamed from: f */
        public final List f6528f;

        /* renamed from: g */
        public final Object f6529g;

        private g(Uri uri, String str, e eVar, b bVar, List list, String str2, List list2, Object obj) {
            this.a = uri;
            this.f6524b = str;
            this.f6525c = eVar;
            this.f6526d = list;
            this.f6527e = str2;
            this.f6528f = list2;
            this.f6529g = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            if (this.a.equals(gVar.a) && yp.a((Object) this.f6524b, (Object) gVar.f6524b) && yp.a(this.f6525c, gVar.f6525c) && yp.a((Object) null, (Object) null) && this.f6526d.equals(gVar.f6526d) && yp.a((Object) this.f6527e, (Object) gVar.f6527e) && this.f6528f.equals(gVar.f6528f) && yp.a(this.f6529g, gVar.f6529g)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4 = this.a.hashCode() * 31;
            String str = this.f6524b;
            int i10 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i11 = (hashCode4 + hashCode) * 31;
            e eVar = this.f6525c;
            if (eVar == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = eVar.hashCode();
            }
            int hashCode5 = (this.f6526d.hashCode() + ((i11 + hashCode2) * 961)) * 31;
            String str2 = this.f6527e;
            if (str2 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str2.hashCode();
            }
            int hashCode6 = (this.f6528f.hashCode() + ((hashCode5 + hashCode3) * 31)) * 31;
            Object obj = this.f6529g;
            if (obj != null) {
                i10 = obj.hashCode();
            }
            return hashCode6 + i10;
        }

        public /* synthetic */ g(Uri uri, String str, e eVar, b bVar, List list, String str2, List list2, Object obj, a aVar) {
            this(uri, str, eVar, bVar, list, str2, list2, obj);
        }
    }

    private static String a(int i10) {
        return Integer.toString(i10, 36);
    }

    public static od a(Uri uri) {
        return new c().a(uri).a();
    }

    public c a() {
        return new c();
    }
}

package com.applovin.impl;

import android.net.Uri;
import android.os.Bundle;
import com.applovin.impl.InterfaceC0725m2;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class od implements InterfaceC0725m2 {

    /* renamed from: g */
    public static final od f9410g = new c().a();

    /* renamed from: h */
    public static final InterfaceC0725m2.a f9411h = new I(29);

    /* renamed from: a */
    public final String f9412a;
    public final g b;

    /* renamed from: c */
    public final f f9413c;

    /* renamed from: d */
    public final qd f9414d;

    /* renamed from: f */
    public final d f9415f;

    /* loaded from: classes.dex */
    public static final class b {
    }

    /* loaded from: classes.dex */
    public static final class d implements InterfaceC0725m2 {

        /* renamed from: g */
        public static final InterfaceC0725m2.a f9428g = new C1(0);

        /* renamed from: a */
        public final long f9429a;
        public final long b;

        /* renamed from: c */
        public final boolean f9430c;

        /* renamed from: d */
        public final boolean f9431d;

        /* renamed from: f */
        public final boolean f9432f;

        private d(long j7, long j9, boolean z8, boolean z9, boolean z10) {
            this.f9429a = j7;
            this.b = j9;
            this.f9430c = z8;
            this.f9431d = z9;
            this.f9432f = z10;
        }

        private static String a(int i9) {
            return Integer.toString(i9, 36);
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
            if (this.f9429a == dVar.f9429a && this.b == dVar.b && this.f9430c == dVar.f9430c && this.f9431d == dVar.f9431d && this.f9432f == dVar.f9432f) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            long j7 = this.f9429a;
            int i9 = ((int) (j7 ^ (j7 >>> 32))) * 31;
            long j9 = this.b;
            return ((((((i9 + ((int) ((j9 >>> 32) ^ j9))) * 31) + (this.f9430c ? 1 : 0)) * 31) + (this.f9431d ? 1 : 0)) * 31) + (this.f9432f ? 1 : 0);
        }

        public static /* synthetic */ d a(Bundle bundle) {
            return new d(bundle.getLong(a(0), 0L), bundle.getLong(a(1), Long.MIN_VALUE), bundle.getBoolean(a(2), false), bundle.getBoolean(a(3), false), bundle.getBoolean(a(4), false));
        }

        public /* synthetic */ d(long j7, long j9, boolean z8, boolean z9, boolean z10, a aVar) {
            this(j7, j9, z8, z9, z10);
        }
    }

    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a */
        public final UUID f9433a;
        public final Uri b;

        /* renamed from: c */
        public final cb f9434c;

        /* renamed from: d */
        public final boolean f9435d;

        /* renamed from: e */
        public final boolean f9436e;

        /* renamed from: f */
        public final boolean f9437f;

        /* renamed from: g */
        public final ab f9438g;

        /* renamed from: h */
        private final byte[] f9439h;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a */
            private UUID f9440a;
            private Uri b;

            /* renamed from: c */
            private cb f9441c;

            /* renamed from: d */
            private boolean f9442d;

            /* renamed from: e */
            private boolean f9443e;

            /* renamed from: f */
            private boolean f9444f;

            /* renamed from: g */
            private ab f9445g;

            /* renamed from: h */
            private byte[] f9446h;

            private a() {
                this.f9441c = cb.h();
                this.f9445g = ab.h();
            }

            public e a() {
                return new e(this);
            }

            public /* synthetic */ a(a aVar) {
                this();
            }

            private a(e eVar) {
                this.f9440a = eVar.f9433a;
                this.b = eVar.b;
                this.f9441c = eVar.f9434c;
                this.f9442d = eVar.f9435d;
                this.f9443e = eVar.f9436e;
                this.f9444f = eVar.f9437f;
                this.f9445g = eVar.f9438g;
                this.f9446h = eVar.f9439h;
            }

            public /* synthetic */ a(e eVar, a aVar) {
                this(eVar);
            }
        }

        private e(a aVar) {
            AbstractC0669a1.b((aVar.f9444f && aVar.b == null) ? false : true);
            this.f9433a = (UUID) AbstractC0669a1.a(aVar.f9440a);
            this.b = aVar.b;
            this.f9434c = aVar.f9441c;
            this.f9435d = aVar.f9442d;
            this.f9437f = aVar.f9444f;
            this.f9436e = aVar.f9443e;
            this.f9438g = aVar.f9445g;
            this.f9439h = aVar.f9446h != null ? Arrays.copyOf(aVar.f9446h, aVar.f9446h.length) : null;
        }

        public byte[] b() {
            byte[] bArr = this.f9439h;
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
            if (this.f9433a.equals(eVar.f9433a) && yp.a(this.b, eVar.b) && yp.a(this.f9434c, eVar.f9434c) && this.f9435d == eVar.f9435d && this.f9437f == eVar.f9437f && this.f9436e == eVar.f9436e && this.f9438g.equals(eVar.f9438g) && Arrays.equals(this.f9439h, eVar.f9439h)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i9;
            int hashCode = this.f9433a.hashCode() * 31;
            Uri uri = this.b;
            if (uri != null) {
                i9 = uri.hashCode();
            } else {
                i9 = 0;
            }
            return Arrays.hashCode(this.f9439h) + ((this.f9438g.hashCode() + ((((((((this.f9434c.hashCode() + ((hashCode + i9) * 31)) * 31) + (this.f9435d ? 1 : 0)) * 31) + (this.f9437f ? 1 : 0)) * 31) + (this.f9436e ? 1 : 0)) * 31)) * 31);
        }

        public a a() {
            return new a();
        }

        public /* synthetic */ e(a aVar, a aVar2) {
            this(aVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements InterfaceC0725m2 {

        /* renamed from: g */
        public static final f f9447g = new a().a();

        /* renamed from: h */
        public static final InterfaceC0725m2.a f9448h = new C1(1);

        /* renamed from: a */
        public final long f9449a;
        public final long b;

        /* renamed from: c */
        public final long f9450c;

        /* renamed from: d */
        public final float f9451d;

        /* renamed from: f */
        public final float f9452f;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a */
            private long f9453a;
            private long b;

            /* renamed from: c */
            private long f9454c;

            /* renamed from: d */
            private float f9455d;

            /* renamed from: e */
            private float f9456e;

            public a() {
                this.f9453a = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                this.b = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                this.f9454c = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                this.f9455d = -3.4028235E38f;
                this.f9456e = -3.4028235E38f;
            }

            public f a() {
                return new f(this);
            }

            private a(f fVar) {
                this.f9453a = fVar.f9449a;
                this.b = fVar.b;
                this.f9454c = fVar.f9450c;
                this.f9455d = fVar.f9451d;
                this.f9456e = fVar.f9452f;
            }

            public /* synthetic */ a(f fVar, a aVar) {
                this(fVar);
            }
        }

        public f(long j7, long j9, long j10, float f9, float f10) {
            this.f9449a = j7;
            this.b = j9;
            this.f9450c = j10;
            this.f9451d = f9;
            this.f9452f = f10;
        }

        private static String a(int i9) {
            return Integer.toString(i9, 36);
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
            if (this.f9449a == fVar.f9449a && this.b == fVar.b && this.f9450c == fVar.f9450c && this.f9451d == fVar.f9451d && this.f9452f == fVar.f9452f) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i9;
            long j7 = this.f9449a;
            long j9 = this.b;
            int i10 = ((((int) (j7 ^ (j7 >>> 32))) * 31) + ((int) (j9 ^ (j9 >>> 32)))) * 31;
            long j10 = this.f9450c;
            int i11 = (i10 + ((int) ((j10 >>> 32) ^ j10))) * 31;
            float f9 = this.f9451d;
            int i12 = 0;
            if (f9 != 0.0f) {
                i9 = Float.floatToIntBits(f9);
            } else {
                i9 = 0;
            }
            int i13 = (i11 + i9) * 31;
            float f10 = this.f9452f;
            if (f10 != 0.0f) {
                i12 = Float.floatToIntBits(f10);
            }
            return i13 + i12;
        }

        public a a() {
            return new a();
        }

        public static /* synthetic */ f a(Bundle bundle) {
            return new f(bundle.getLong(a(0), com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET), bundle.getLong(a(1), com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET), bundle.getLong(a(2), com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET), bundle.getFloat(a(3), -3.4028235E38f), bundle.getFloat(a(4), -3.4028235E38f));
        }

        private f(a aVar) {
            this(aVar.f9453a, aVar.b, aVar.f9454c, aVar.f9455d, aVar.f9456e);
        }

        public /* synthetic */ f(a aVar, a aVar2) {
            this(aVar);
        }
    }

    private od(String str, d dVar, g gVar, f fVar, qd qdVar) {
        this.f9412a = str;
        this.b = gVar;
        this.f9413c = fVar;
        this.f9414d = qdVar;
        this.f9415f = dVar;
    }

    public static od a(Bundle bundle) {
        f fVar;
        qd qdVar;
        d dVar;
        String str = (String) AbstractC0669a1.a((Object) bundle.getString(a(0), ""));
        Bundle bundle2 = bundle.getBundle(a(1));
        if (bundle2 == null) {
            fVar = f.f9447g;
        } else {
            fVar = (f) f.f9448h.a(bundle2);
        }
        f fVar2 = fVar;
        Bundle bundle3 = bundle.getBundle(a(2));
        if (bundle3 == null) {
            qdVar = qd.f10229H;
        } else {
            qdVar = (qd) qd.f10230I.a(bundle3);
        }
        qd qdVar2 = qdVar;
        Bundle bundle4 = bundle.getBundle(a(3));
        if (bundle4 == null) {
            dVar = new d(0L, Long.MIN_VALUE, false, false, false);
        } else {
            dVar = (d) d.f9428g.a(bundle4);
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
        if (yp.a((Object) this.f9412a, (Object) odVar.f9412a) && this.f9415f.equals(odVar.f9415f) && yp.a(this.b, odVar.b) && yp.a(this.f9413c, odVar.f9413c) && yp.a(this.f9414d, odVar.f9414d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i9;
        int hashCode = this.f9412a.hashCode() * 31;
        g gVar = this.b;
        if (gVar != null) {
            i9 = gVar.hashCode();
        } else {
            i9 = 0;
        }
        return this.f9414d.hashCode() + ((this.f9415f.hashCode() + ((this.f9413c.hashCode() + ((hashCode + i9) * 31)) * 31)) * 31);
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        private String f9416a;
        private Uri b;

        /* renamed from: c */
        private String f9417c;

        /* renamed from: d */
        private long f9418d;

        /* renamed from: e */
        private long f9419e;

        /* renamed from: f */
        private boolean f9420f;

        /* renamed from: g */
        private boolean f9421g;

        /* renamed from: h */
        private boolean f9422h;

        /* renamed from: i */
        private e.a f9423i;

        /* renamed from: j */
        private List f9424j;

        /* renamed from: k */
        private String f9425k;
        private List l;
        private Object m;

        /* renamed from: n */
        private qd f9426n;

        /* renamed from: o */
        private f.a f9427o;

        public c() {
            this.f9419e = Long.MIN_VALUE;
            this.f9423i = new e.a();
            this.f9424j = Collections.emptyList();
            this.l = Collections.emptyList();
            this.f9427o = new f.a();
        }

        public od a() {
            g gVar;
            AbstractC0669a1.b(this.f9423i.b == null || this.f9423i.f9440a != null);
            Uri uri = this.b;
            if (uri != null) {
                gVar = new g(uri, this.f9417c, this.f9423i.f9440a != null ? this.f9423i.a() : null, null, this.f9424j, this.f9425k, this.l, this.m);
            } else {
                gVar = null;
            }
            String str = this.f9416a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            d dVar = new d(this.f9418d, this.f9419e, this.f9420f, this.f9421g, this.f9422h);
            f a6 = this.f9427o.a();
            qd qdVar = this.f9426n;
            if (qdVar == null) {
                qdVar = qd.f10229H;
            }
            return new od(str2, dVar, gVar, a6, qdVar);
        }

        public c b(String str) {
            this.f9416a = (String) AbstractC0669a1.a((Object) str);
            return this;
        }

        private c(od odVar) {
            this();
            e.a aVar;
            d dVar = odVar.f9415f;
            this.f9419e = dVar.b;
            this.f9420f = dVar.f9430c;
            this.f9421g = dVar.f9431d;
            this.f9418d = dVar.f9429a;
            this.f9422h = dVar.f9432f;
            this.f9416a = odVar.f9412a;
            this.f9426n = odVar.f9414d;
            this.f9427o = odVar.f9413c.a();
            g gVar = odVar.b;
            if (gVar != null) {
                this.f9425k = gVar.f9460e;
                this.f9417c = gVar.b;
                this.b = gVar.f9457a;
                this.f9424j = gVar.f9459d;
                this.l = gVar.f9461f;
                this.m = gVar.f9462g;
                e eVar = gVar.f9458c;
                if (eVar != null) {
                    aVar = eVar.a();
                } else {
                    aVar = new e.a();
                }
                this.f9423i = aVar;
            }
        }

        public c a(String str) {
            this.f9425k = str;
            return this;
        }

        public c a(Object obj) {
            this.m = obj;
            return this;
        }

        public c a(Uri uri) {
            this.b = uri;
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

        /* renamed from: a */
        public final Uri f9457a;
        public final String b;

        /* renamed from: c */
        public final e f9458c;

        /* renamed from: d */
        public final List f9459d;

        /* renamed from: e */
        public final String f9460e;

        /* renamed from: f */
        public final List f9461f;

        /* renamed from: g */
        public final Object f9462g;

        private g(Uri uri, String str, e eVar, b bVar, List list, String str2, List list2, Object obj) {
            this.f9457a = uri;
            this.b = str;
            this.f9458c = eVar;
            this.f9459d = list;
            this.f9460e = str2;
            this.f9461f = list2;
            this.f9462g = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            if (this.f9457a.equals(gVar.f9457a) && yp.a((Object) this.b, (Object) gVar.b) && yp.a(this.f9458c, gVar.f9458c) && yp.a((Object) null, (Object) null) && this.f9459d.equals(gVar.f9459d) && yp.a((Object) this.f9460e, (Object) gVar.f9460e) && this.f9461f.equals(gVar.f9461f) && yp.a(this.f9462g, gVar.f9462g)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4 = this.f9457a.hashCode() * 31;
            String str = this.b;
            int i9 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i10 = (hashCode4 + hashCode) * 31;
            e eVar = this.f9458c;
            if (eVar == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = eVar.hashCode();
            }
            int hashCode5 = (this.f9459d.hashCode() + ((i10 + hashCode2) * 961)) * 31;
            String str2 = this.f9460e;
            if (str2 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str2.hashCode();
            }
            int hashCode6 = (this.f9461f.hashCode() + ((hashCode5 + hashCode3) * 31)) * 31;
            Object obj = this.f9462g;
            if (obj != null) {
                i9 = obj.hashCode();
            }
            return hashCode6 + i9;
        }

        public /* synthetic */ g(Uri uri, String str, e eVar, b bVar, List list, String str2, List list2, Object obj, a aVar) {
            this(uri, str, eVar, bVar, list, str2, list2, obj);
        }
    }

    private static String a(int i9) {
        return Integer.toString(i9, 36);
    }

    public static od a(Uri uri) {
        return new c().a(uri).a();
    }

    public c a() {
        return new c();
    }
}

package com.applovin.impl;

import android.net.Uri;
import android.os.Bundle;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.InterfaceC0725m2;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class qd implements InterfaceC0725m2 {

    /* renamed from: H */
    public static final qd f10229H = new b().a();

    /* renamed from: I */
    public static final InterfaceC0725m2.a f10230I = new C1(5);

    /* renamed from: A */
    public final CharSequence f10231A;

    /* renamed from: B */
    public final CharSequence f10232B;

    /* renamed from: C */
    public final Integer f10233C;

    /* renamed from: D */
    public final Integer f10234D;

    /* renamed from: E */
    public final CharSequence f10235E;

    /* renamed from: F */
    public final CharSequence f10236F;

    /* renamed from: G */
    public final Bundle f10237G;

    /* renamed from: a */
    public final CharSequence f10238a;
    public final CharSequence b;

    /* renamed from: c */
    public final CharSequence f10239c;

    /* renamed from: d */
    public final CharSequence f10240d;

    /* renamed from: f */
    public final CharSequence f10241f;

    /* renamed from: g */
    public final CharSequence f10242g;

    /* renamed from: h */
    public final CharSequence f10243h;

    /* renamed from: i */
    public final Uri f10244i;

    /* renamed from: j */
    public final gi f10245j;

    /* renamed from: k */
    public final gi f10246k;
    public final byte[] l;
    public final Integer m;

    /* renamed from: n */
    public final Uri f10247n;

    /* renamed from: o */
    public final Integer f10248o;

    /* renamed from: p */
    public final Integer f10249p;

    /* renamed from: q */
    public final Integer f10250q;

    /* renamed from: r */
    public final Boolean f10251r;

    /* renamed from: s */
    public final Integer f10252s;

    /* renamed from: t */
    public final Integer f10253t;

    /* renamed from: u */
    public final Integer f10254u;

    /* renamed from: v */
    public final Integer f10255v;

    /* renamed from: w */
    public final Integer f10256w;

    /* renamed from: x */
    public final Integer f10257x;

    /* renamed from: y */
    public final Integer f10258y;

    /* renamed from: z */
    public final CharSequence f10259z;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: A */
        private Integer f10260A;

        /* renamed from: B */
        private Integer f10261B;

        /* renamed from: C */
        private CharSequence f10262C;

        /* renamed from: D */
        private CharSequence f10263D;

        /* renamed from: E */
        private Bundle f10264E;

        /* renamed from: a */
        private CharSequence f10265a;
        private CharSequence b;

        /* renamed from: c */
        private CharSequence f10266c;

        /* renamed from: d */
        private CharSequence f10267d;

        /* renamed from: e */
        private CharSequence f10268e;

        /* renamed from: f */
        private CharSequence f10269f;

        /* renamed from: g */
        private CharSequence f10270g;

        /* renamed from: h */
        private Uri f10271h;

        /* renamed from: i */
        private gi f10272i;

        /* renamed from: j */
        private gi f10273j;

        /* renamed from: k */
        private byte[] f10274k;
        private Integer l;
        private Uri m;

        /* renamed from: n */
        private Integer f10275n;

        /* renamed from: o */
        private Integer f10276o;

        /* renamed from: p */
        private Integer f10277p;

        /* renamed from: q */
        private Boolean f10278q;

        /* renamed from: r */
        private Integer f10279r;

        /* renamed from: s */
        private Integer f10280s;

        /* renamed from: t */
        private Integer f10281t;

        /* renamed from: u */
        private Integer f10282u;

        /* renamed from: v */
        private Integer f10283v;

        /* renamed from: w */
        private Integer f10284w;

        /* renamed from: x */
        private CharSequence f10285x;

        /* renamed from: y */
        private CharSequence f10286y;

        /* renamed from: z */
        private CharSequence f10287z;

        public b() {
        }

        private b(qd qdVar) {
            this.f10265a = qdVar.f10238a;
            this.b = qdVar.b;
            this.f10266c = qdVar.f10239c;
            this.f10267d = qdVar.f10240d;
            this.f10268e = qdVar.f10241f;
            this.f10269f = qdVar.f10242g;
            this.f10270g = qdVar.f10243h;
            this.f10271h = qdVar.f10244i;
            this.f10272i = qdVar.f10245j;
            this.f10273j = qdVar.f10246k;
            this.f10274k = qdVar.l;
            this.l = qdVar.m;
            this.m = qdVar.f10247n;
            this.f10275n = qdVar.f10248o;
            this.f10276o = qdVar.f10249p;
            this.f10277p = qdVar.f10250q;
            this.f10278q = qdVar.f10251r;
            this.f10279r = qdVar.f10253t;
            this.f10280s = qdVar.f10254u;
            this.f10281t = qdVar.f10255v;
            this.f10282u = qdVar.f10256w;
            this.f10283v = qdVar.f10257x;
            this.f10284w = qdVar.f10258y;
            this.f10285x = qdVar.f10259z;
            this.f10286y = qdVar.f10231A;
            this.f10287z = qdVar.f10232B;
            this.f10260A = qdVar.f10233C;
            this.f10261B = qdVar.f10234D;
            this.f10262C = qdVar.f10235E;
            this.f10263D = qdVar.f10236F;
            this.f10264E = qdVar.f10237G;
        }

        public b a(byte[] bArr, int i9) {
            if (this.f10274k == null || yp.a((Object) Integer.valueOf(i9), (Object) 3) || !yp.a((Object) this.l, (Object) 3)) {
                this.f10274k = (byte[]) bArr.clone();
                this.l = Integer.valueOf(i9);
            }
            return this;
        }

        public b b(CharSequence charSequence) {
            this.f10266c = charSequence;
            return this;
        }

        public b c(CharSequence charSequence) {
            this.b = charSequence;
            return this;
        }

        public b d(CharSequence charSequence) {
            this.f10263D = charSequence;
            return this;
        }

        public b e(CharSequence charSequence) {
            this.f10286y = charSequence;
            return this;
        }

        public b f(CharSequence charSequence) {
            this.f10287z = charSequence;
            return this;
        }

        public b g(CharSequence charSequence) {
            this.f10270g = charSequence;
            return this;
        }

        public b h(CharSequence charSequence) {
            this.f10268e = charSequence;
            return this;
        }

        public b i(CharSequence charSequence) {
            this.f10262C = charSequence;
            return this;
        }

        public b j(CharSequence charSequence) {
            this.f10269f = charSequence;
            return this;
        }

        public b k(CharSequence charSequence) {
            this.f10265a = charSequence;
            return this;
        }

        public b l(CharSequence charSequence) {
            this.f10285x = charSequence;
            return this;
        }

        public b b(Integer num) {
            this.f10277p = num;
            return this;
        }

        public b c(Integer num) {
            this.f10281t = num;
            return this;
        }

        public b d(Integer num) {
            this.f10280s = num;
            return this;
        }

        public b e(Integer num) {
            this.f10279r = num;
            return this;
        }

        public b f(Integer num) {
            this.f10284w = num;
            return this;
        }

        public b g(Integer num) {
            this.f10283v = num;
            return this;
        }

        public b h(Integer num) {
            this.f10282u = num;
            return this;
        }

        public b i(Integer num) {
            this.f10261B = num;
            return this;
        }

        public b j(Integer num) {
            this.f10276o = num;
            return this;
        }

        public b k(Integer num) {
            this.f10275n = num;
            return this;
        }

        public b b(Uri uri) {
            this.f10271h = uri;
            return this;
        }

        public b b(gi giVar) {
            this.f10272i = giVar;
            return this;
        }

        public b a(we weVar) {
            for (int i9 = 0; i9 < weVar.c(); i9++) {
                weVar.a(i9).a(this);
            }
            return this;
        }

        public b a(List list) {
            for (int i9 = 0; i9 < list.size(); i9++) {
                we weVar = (we) list.get(i9);
                for (int i10 = 0; i10 < weVar.c(); i10++) {
                    weVar.a(i10).a(this);
                }
            }
            return this;
        }

        public b a(CharSequence charSequence) {
            this.f10267d = charSequence;
            return this;
        }

        public b a(byte[] bArr, Integer num) {
            this.f10274k = bArr == null ? null : (byte[]) bArr.clone();
            this.l = num;
            return this;
        }

        public b a(Uri uri) {
            this.m = uri;
            return this;
        }

        public b a(Integer num) {
            this.f10260A = num;
            return this;
        }

        public b a(Bundle bundle) {
            this.f10264E = bundle;
            return this;
        }

        public b a(Boolean bool) {
            this.f10278q = bool;
            return this;
        }

        public b a(gi giVar) {
            this.f10273j = giVar;
            return this;
        }

        public qd a() {
            return new qd(this);
        }

        public /* synthetic */ b(qd qdVar, a aVar) {
            this(qdVar);
        }
    }

    private qd(b bVar) {
        this.f10238a = bVar.f10265a;
        this.b = bVar.b;
        this.f10239c = bVar.f10266c;
        this.f10240d = bVar.f10267d;
        this.f10241f = bVar.f10268e;
        this.f10242g = bVar.f10269f;
        this.f10243h = bVar.f10270g;
        this.f10244i = bVar.f10271h;
        this.f10245j = bVar.f10272i;
        this.f10246k = bVar.f10273j;
        this.l = bVar.f10274k;
        this.m = bVar.l;
        this.f10247n = bVar.m;
        this.f10248o = bVar.f10275n;
        this.f10249p = bVar.f10276o;
        this.f10250q = bVar.f10277p;
        this.f10251r = bVar.f10278q;
        this.f10252s = bVar.f10279r;
        this.f10253t = bVar.f10279r;
        this.f10254u = bVar.f10280s;
        this.f10255v = bVar.f10281t;
        this.f10256w = bVar.f10282u;
        this.f10257x = bVar.f10283v;
        this.f10258y = bVar.f10284w;
        this.f10259z = bVar.f10285x;
        this.f10231A = bVar.f10286y;
        this.f10232B = bVar.f10287z;
        this.f10233C = bVar.f10260A;
        this.f10234D = bVar.f10261B;
        this.f10235E = bVar.f10262C;
        this.f10236F = bVar.f10263D;
        this.f10237G = bVar.f10264E;
    }

    private static String a(int i9) {
        return Integer.toString(i9, 36);
    }

    public static /* synthetic */ qd b(Bundle bundle) {
        return a(bundle);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qd.class != obj.getClass()) {
            return false;
        }
        qd qdVar = (qd) obj;
        if (yp.a(this.f10238a, qdVar.f10238a) && yp.a(this.b, qdVar.b) && yp.a(this.f10239c, qdVar.f10239c) && yp.a(this.f10240d, qdVar.f10240d) && yp.a(this.f10241f, qdVar.f10241f) && yp.a(this.f10242g, qdVar.f10242g) && yp.a(this.f10243h, qdVar.f10243h) && yp.a(this.f10244i, qdVar.f10244i) && yp.a(this.f10245j, qdVar.f10245j) && yp.a(this.f10246k, qdVar.f10246k) && Arrays.equals(this.l, qdVar.l) && yp.a(this.m, qdVar.m) && yp.a(this.f10247n, qdVar.f10247n) && yp.a(this.f10248o, qdVar.f10248o) && yp.a(this.f10249p, qdVar.f10249p) && yp.a(this.f10250q, qdVar.f10250q) && yp.a(this.f10251r, qdVar.f10251r) && yp.a(this.f10253t, qdVar.f10253t) && yp.a(this.f10254u, qdVar.f10254u) && yp.a(this.f10255v, qdVar.f10255v) && yp.a(this.f10256w, qdVar.f10256w) && yp.a(this.f10257x, qdVar.f10257x) && yp.a(this.f10258y, qdVar.f10258y) && yp.a(this.f10259z, qdVar.f10259z) && yp.a(this.f10231A, qdVar.f10231A) && yp.a(this.f10232B, qdVar.f10232B) && yp.a(this.f10233C, qdVar.f10233C) && yp.a(this.f10234D, qdVar.f10234D) && yp.a(this.f10235E, qdVar.f10235E) && yp.a(this.f10236F, qdVar.f10236F)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.f10238a, this.b, this.f10239c, this.f10240d, this.f10241f, this.f10242g, this.f10243h, this.f10244i, this.f10245j, this.f10246k, Integer.valueOf(Arrays.hashCode(this.l)), this.m, this.f10247n, this.f10248o, this.f10249p, this.f10250q, this.f10251r, this.f10253t, this.f10254u, this.f10255v, this.f10256w, this.f10257x, this.f10258y, this.f10259z, this.f10231A, this.f10232B, this.f10233C, this.f10234D, this.f10235E, this.f10236F);
    }

    public b a() {
        return new b();
    }

    public static qd a(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        b bVar = new b();
        bVar.k(bundle.getCharSequence(a(0))).c(bundle.getCharSequence(a(1))).b(bundle.getCharSequence(a(2))).a(bundle.getCharSequence(a(3))).h(bundle.getCharSequence(a(4))).j(bundle.getCharSequence(a(5))).g(bundle.getCharSequence(a(6))).b((Uri) bundle.getParcelable(a(7))).a(bundle.getByteArray(a(10)), bundle.containsKey(a(29)) ? Integer.valueOf(bundle.getInt(a(29))) : null).a((Uri) bundle.getParcelable(a(11))).l(bundle.getCharSequence(a(22))).e(bundle.getCharSequence(a(23))).f(bundle.getCharSequence(a(24))).i(bundle.getCharSequence(a(27))).d(bundle.getCharSequence(a(28))).a(bundle.getBundle(a(1000)));
        if (bundle.containsKey(a(8)) && (bundle3 = bundle.getBundle(a(8))) != null) {
            bVar.b((gi) gi.f7916a.a(bundle3));
        }
        if (bundle.containsKey(a(9)) && (bundle2 = bundle.getBundle(a(9))) != null) {
            bVar.a((gi) gi.f7916a.a(bundle2));
        }
        if (bundle.containsKey(a(12))) {
            bVar.k(Integer.valueOf(bundle.getInt(a(12))));
        }
        if (bundle.containsKey(a(13))) {
            bVar.j(Integer.valueOf(bundle.getInt(a(13))));
        }
        if (bundle.containsKey(a(14))) {
            bVar.b(Integer.valueOf(bundle.getInt(a(14))));
        }
        if (bundle.containsKey(a(15))) {
            bVar.a(Boolean.valueOf(bundle.getBoolean(a(15))));
        }
        if (bundle.containsKey(a(16))) {
            bVar.e(Integer.valueOf(bundle.getInt(a(16))));
        }
        if (bundle.containsKey(a(17))) {
            bVar.d(Integer.valueOf(bundle.getInt(a(17))));
        }
        if (bundle.containsKey(a(18))) {
            bVar.c(Integer.valueOf(bundle.getInt(a(18))));
        }
        if (bundle.containsKey(a(19))) {
            bVar.h(Integer.valueOf(bundle.getInt(a(19))));
        }
        if (bundle.containsKey(a(20))) {
            bVar.g(Integer.valueOf(bundle.getInt(a(20))));
        }
        if (bundle.containsKey(a(21))) {
            bVar.f(Integer.valueOf(bundle.getInt(a(21))));
        }
        if (bundle.containsKey(a(25))) {
            bVar.a(Integer.valueOf(bundle.getInt(a(25))));
        }
        if (bundle.containsKey(a(26))) {
            bVar.i(Integer.valueOf(bundle.getInt(a(26))));
        }
        return bVar.a();
    }

    public /* synthetic */ qd(b bVar, a aVar) {
        this(bVar);
    }
}

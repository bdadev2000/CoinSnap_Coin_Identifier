package com.applovin.impl;

import android.content.Context;
import android.os.Handler;
import com.applovin.impl.fg;
import com.applovin.impl.y1;
import com.facebook.ads.AdError;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.zxing.client.result.ExpandedProductParsedResult;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class t5 implements y1, xo {

    /* renamed from: p, reason: collision with root package name */
    public static final fb f27008p = b();

    /* renamed from: q, reason: collision with root package name */
    public static final eb f27009q = eb.a(6200000L, 3900000L, 2300000L, 1300000L, 620000L);

    /* renamed from: r, reason: collision with root package name */
    public static final eb f27010r = eb.a(248000L, 160000L, 142000L, 127000L, 113000L);

    /* renamed from: s, reason: collision with root package name */
    public static final eb f27011s = eb.a(2200000L, 1300000L, 950000L, 760000L, 520000L);

    /* renamed from: t, reason: collision with root package name */
    public static final eb f27012t = eb.a(4400000L, 2300000L, 1500000L, 1100000L, 640000L);

    /* renamed from: u, reason: collision with root package name */
    public static final eb f27013u = eb.a(10000000L, 7200000L, 5000000L, 2700000L, 1600000L);

    /* renamed from: v, reason: collision with root package name */
    public static final eb f27014v = eb.a(2600000L, 2200000L, 2000000L, 1500000L, 470000L);
    private static t5 w;

    /* renamed from: a, reason: collision with root package name */
    private final gb f27015a;

    /* renamed from: b, reason: collision with root package name */
    private final y1.a.C0102a f27016b;

    /* renamed from: c, reason: collision with root package name */
    private final ik f27017c;
    private final l3 d;
    private final boolean e;

    /* renamed from: f, reason: collision with root package name */
    private int f27018f;

    /* renamed from: g, reason: collision with root package name */
    private long f27019g;

    /* renamed from: h, reason: collision with root package name */
    private long f27020h;

    /* renamed from: i, reason: collision with root package name */
    private int f27021i;

    /* renamed from: j, reason: collision with root package name */
    private long f27022j;

    /* renamed from: k, reason: collision with root package name */
    private long f27023k;

    /* renamed from: l, reason: collision with root package name */
    private long f27024l;

    /* renamed from: m, reason: collision with root package name */
    private long f27025m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f27026n;

    /* renamed from: o, reason: collision with root package name */
    private int f27027o;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Context f27028a;

        /* renamed from: b, reason: collision with root package name */
        private Map f27029b;

        /* renamed from: c, reason: collision with root package name */
        private int f27030c;
        private l3 d;
        private boolean e;

        public b(Context context) {
            this.f27028a = context == null ? null : context.getApplicationContext();
            this.f27029b = b(xp.b(context));
            this.f27030c = AdError.SERVER_ERROR_CODE;
            this.d = l3.f24977a;
            this.e = true;
        }

        private static Map b(String str) {
            eb a2 = a(str);
            HashMap hashMap = new HashMap(8);
            hashMap.put(0, 1000000L);
            eb ebVar = t5.f27009q;
            hashMap.put(2, (Long) ebVar.get(((Integer) a2.get(0)).intValue()));
            hashMap.put(3, (Long) t5.f27010r.get(((Integer) a2.get(1)).intValue()));
            hashMap.put(4, (Long) t5.f27011s.get(((Integer) a2.get(2)).intValue()));
            hashMap.put(5, (Long) t5.f27012t.get(((Integer) a2.get(3)).intValue()));
            hashMap.put(10, (Long) t5.f27013u.get(((Integer) a2.get(4)).intValue()));
            hashMap.put(9, (Long) t5.f27014v.get(((Integer) a2.get(5)).intValue()));
            hashMap.put(7, (Long) ebVar.get(((Integer) a2.get(0)).intValue()));
            return hashMap;
        }

        public t5 a() {
            return new t5(this.f27028a, this.f27029b, this.f27030c, this.d, this.e);
        }

        private static eb a(String str) {
            eb b2 = t5.f27008p.b(str);
            return b2.isEmpty() ? eb.a(2, 2, 2, 2, 2, 2) : b2;
        }
    }

    private t5(Context context, Map map, int i2, l3 l3Var, boolean z2) {
        this.f27015a = gb.a(map);
        this.f27016b = new y1.a.C0102a();
        this.f27017c = new ik(i2);
        this.d = l3Var;
        this.e = z2;
        if (context != null) {
            fg b2 = fg.b(context);
            int a2 = b2.a();
            this.f27021i = a2;
            this.f27024l = a(a2);
            b2.b(new fg.c() { // from class: com.applovin.impl.yv
                @Override // com.applovin.impl.fg.c
                public final void a(int i3) {
                    t5.this.b(i3);
                }
            });
            return;
        }
        this.f27021i = 0;
        this.f27024l = a(0);
    }

    @Override // com.applovin.impl.xo
    public void b(i5 i5Var, l5 l5Var, boolean z2) {
    }

    @Override // com.applovin.impl.xo
    public synchronized void c(i5 i5Var, l5 l5Var, boolean z2) {
        try {
            if (a(l5Var, z2)) {
                b1.b(this.f27018f > 0);
                long c2 = this.d.c();
                int i2 = (int) (c2 - this.f27019g);
                this.f27022j += i2;
                long j2 = this.f27023k;
                long j3 = this.f27020h;
                this.f27023k = j2 + j3;
                if (i2 > 0) {
                    this.f27017c.a((int) Math.sqrt(j3), (((float) j3) * 8000.0f) / i2);
                    if (this.f27022j < 2000) {
                        if (this.f27023k >= 524288) {
                        }
                        a(i2, this.f27020h, this.f27024l);
                        this.f27019g = c2;
                        this.f27020h = 0L;
                    }
                    this.f27024l = this.f27017c.a(0.5f);
                    a(i2, this.f27020h, this.f27024l);
                    this.f27019g = c2;
                    this.f27020h = 0L;
                }
                this.f27018f--;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(int i2) {
        int i3 = this.f27021i;
        if (i3 == 0 || this.e) {
            if (this.f27026n) {
                i2 = this.f27027o;
            }
            if (i3 == i2) {
                return;
            }
            this.f27021i = i2;
            if (i2 != 1 && i2 != 0 && i2 != 8) {
                this.f27024l = a(i2);
                long c2 = this.d.c();
                a(this.f27018f > 0 ? (int) (c2 - this.f27019g) : 0, this.f27020h, this.f27024l);
                this.f27019g = c2;
                this.f27020h = 0L;
                this.f27023k = 0L;
                this.f27022j = 0L;
                this.f27017c.c();
            }
        }
    }

    @Override // com.applovin.impl.y1
    public xo a() {
        return this;
    }

    @Override // com.applovin.impl.y1
    public void a(Handler handler, y1.a aVar) {
        b1.a(handler);
        b1.a(aVar);
        this.f27016b.a(handler, aVar);
    }

    private long a(int i2) {
        Long l2 = (Long) this.f27015a.get(Integer.valueOf(i2));
        if (l2 == null) {
            l2 = (Long) this.f27015a.get(0);
        }
        if (l2 == null) {
            l2 = 1000000L;
        }
        return l2.longValue();
    }

    private static fb b() {
        return fb.k().b("AD", 1, 2, 0, 0, 2, 2).b("AE", 1, 4, 4, 4, 2, 2).b("AF", 4, 4, 3, 4, 2, 2).b("AG", 4, 2, 1, 4, 2, 2).b("AI", 1, 2, 2, 2, 2, 2).b("AL", 1, 1, 1, 1, 2, 2).b("AM", 2, 2, 1, 3, 2, 2).b("AO", 3, 4, 3, 1, 2, 2).b("AR", 2, 4, 2, 1, 2, 2).b("AS", 2, 2, 3, 3, 2, 2).b("AT", 0, 1, 0, 0, 0, 2).b("AU", 0, 2, 0, 1, 1, 2).b("AW", 1, 2, 0, 4, 2, 2).b("AX", 0, 2, 2, 2, 2, 2).b("AZ", 3, 3, 3, 4, 4, 2).b("BA", 1, 1, 0, 1, 2, 2).b("BB", 0, 2, 0, 0, 2, 2).b("BD", 2, 0, 3, 3, 2, 2).b("BE", 0, 0, 2, 3, 2, 2).b("BF", 4, 4, 4, 2, 2, 2).b("BG", 0, 1, 0, 0, 2, 2).b("BH", 1, 0, 2, 4, 2, 2).b("BI", 4, 4, 4, 4, 2, 2).b("BJ", 4, 4, 4, 4, 2, 2).b("BL", 1, 2, 2, 2, 2, 2).b("BM", 0, 2, 0, 0, 2, 2).b("BN", 3, 2, 1, 0, 2, 2).b("BO", 1, 2, 4, 2, 2, 2).b("BQ", 1, 2, 1, 2, 2, 2).b("BR", 2, 4, 3, 2, 2, 2).b("BS", 2, 2, 1, 3, 2, 2).b("BT", 3, 0, 3, 2, 2, 2).b("BW", 3, 4, 1, 1, 2, 2).b("BY", 1, 1, 1, 2, 2, 2).b("BZ", 2, 2, 2, 2, 2, 2).b("CA", 0, 3, 1, 2, 4, 2).b("CD", 4, 2, 2, 1, 2, 2).b("CF", 4, 2, 3, 2, 2, 2).b("CG", 3, 4, 2, 2, 2, 2).b("CH", 0, 0, 0, 0, 1, 2).b("CI", 3, 3, 3, 3, 2, 2).b("CK", 2, 2, 3, 0, 2, 2).b("CL", 1, 1, 2, 2, 2, 2).b("CM", 3, 4, 3, 2, 2, 2).b("CN", 2, 2, 2, 1, 3, 2).b("CO", 2, 3, 4, 2, 2, 2).b("CR", 2, 3, 4, 4, 2, 2).b("CU", 4, 4, 2, 2, 2, 2).b("CV", 2, 3, 1, 0, 2, 2).b("CW", 1, 2, 0, 0, 2, 2).b("CY", 1, 1, 0, 0, 2, 2).b("CZ", 0, 1, 0, 0, 1, 2).b("DE", 0, 0, 1, 1, 0, 2).b("DJ", 4, 0, 4, 4, 2, 2).b("DK", 0, 0, 1, 0, 0, 2).b("DM", 1, 2, 2, 2, 2, 2).b("DO", 3, 4, 4, 4, 2, 2).b("DZ", 3, 3, 4, 4, 2, 4).b("EC", 2, 4, 3, 1, 2, 2).b("EE", 0, 1, 0, 0, 2, 2).b("EG", 3, 4, 3, 3, 2, 2).b("EH", 2, 2, 2, 2, 2, 2).b("ER", 4, 2, 2, 2, 2, 2).b("ES", 0, 1, 1, 1, 2, 2).b("ET", 4, 4, 4, 1, 2, 2).b("FI", 0, 0, 0, 0, 0, 2).b("FJ", 3, 0, 2, 3, 2, 2).b("FK", 4, 2, 2, 2, 2, 2).b("FM", 3, 2, 4, 4, 2, 2).b("FO", 1, 2, 0, 1, 2, 2).b("FR", 1, 1, 2, 0, 1, 2).b("GA", 3, 4, 1, 1, 2, 2).b("GB", 0, 0, 1, 1, 1, 2).b("GD", 1, 2, 2, 2, 2, 2).b("GE", 1, 1, 1, 2, 2, 2).b("GF", 2, 2, 2, 3, 2, 2).b("GG", 1, 2, 0, 0, 2, 2).b("GH", 3, 1, 3, 2, 2, 2).b("GI", 0, 2, 0, 0, 2, 2).b("GL", 1, 2, 0, 0, 2, 2).b("GM", 4, 3, 2, 4, 2, 2).b("GN", 4, 3, 4, 2, 2, 2).b("GP", 2, 1, 2, 3, 2, 2).b("GQ", 4, 2, 2, 4, 2, 2).b("GR", 1, 2, 0, 0, 2, 2).b("GT", 3, 2, 3, 1, 2, 2).b("GU", 1, 2, 3, 4, 2, 2).b("GW", 4, 4, 4, 4, 2, 2).b("GY", 3, 3, 3, 4, 2, 2).b("HK", 0, 1, 2, 3, 2, 0).b("HN", 3, 1, 3, 3, 2, 2).b("HR", 1, 1, 0, 0, 3, 2).b("HT", 4, 4, 4, 4, 2, 2).b("HU", 0, 0, 0, 0, 0, 2).b("ID", 3, 2, 3, 3, 2, 2).b("IE", 0, 0, 1, 1, 3, 2).b("IL", 1, 0, 2, 3, 4, 2).b("IM", 0, 2, 0, 1, 2, 2).b("IN", 2, 1, 3, 3, 2, 2).b("IO", 4, 2, 2, 4, 2, 2).b("IQ", 3, 3, 4, 4, 2, 2).b("IR", 3, 2, 3, 2, 2, 2).b("IS", 0, 2, 0, 0, 2, 2).b("IT", 0, 4, 0, 1, 2, 2).b("JE", 2, 2, 1, 2, 2, 2).b("JM", 3, 3, 4, 4, 2, 2).b("JO", 2, 2, 1, 1, 2, 2).b("JP", 0, 0, 0, 0, 2, 1).b("KE", 3, 4, 2, 2, 2, 2).b(ExpandedProductParsedResult.KILOGRAM, 2, 0, 1, 1, 2, 2).b("KH", 1, 0, 4, 3, 2, 2).b("KI", 4, 2, 4, 3, 2, 2).b("KM", 4, 3, 2, 3, 2, 2).b("KN", 1, 2, 2, 2, 2, 2).b("KP", 4, 2, 2, 2, 2, 2).b("KR", 0, 0, 1, 3, 1, 2).b("KW", 1, 3, 1, 1, 1, 2).b("KY", 1, 2, 0, 2, 2, 2).b("KZ", 2, 2, 2, 3, 2, 2).b("LA", 1, 2, 1, 1, 2, 2).b(ExpandedProductParsedResult.POUND, 3, 2, 0, 0, 2, 2).b("LC", 1, 2, 0, 0, 2, 2).b("LI", 0, 2, 2, 2, 2, 2).b("LK", 2, 0, 2, 3, 2, 2).b("LR", 3, 4, 4, 3, 2, 2).b("LS", 3, 3, 2, 3, 2, 2).b("LT", 0, 0, 0, 0, 2, 2).b("LU", 1, 0, 1, 1, 2, 2).b("LV", 0, 0, 0, 0, 2, 2).b("LY", 4, 2, 4, 3, 2, 2).b(RequestConfiguration.MAX_AD_CONTENT_RATING_MA, 3, 2, 2, 1, 2, 2).b("MC", 0, 2, 0, 0, 2, 2).b("MD", 1, 2, 0, 0, 2, 2).b("ME", 1, 2, 0, 1, 2, 2).b("MF", 2, 2, 1, 1, 2, 2).b("MG", 3, 4, 2, 2, 2, 2).b("MH", 4, 2, 2, 4, 2, 2).b("MK", 1, 1, 0, 0, 2, 2).b("ML", 4, 4, 2, 2, 2, 2).b("MM", 2, 3, 3, 3, 2, 2).b("MN", 2, 4, 2, 2, 2, 2).b("MO", 0, 2, 4, 4, 2, 2).b("MP", 0, 2, 2, 2, 2, 2).b("MQ", 2, 2, 2, 3, 2, 2).b("MR", 3, 0, 4, 3, 2, 2).b("MS", 1, 2, 2, 2, 2, 2).b("MT", 0, 2, 0, 0, 2, 2).b("MU", 2, 1, 1, 2, 2, 2).b("MV", 4, 3, 2, 4, 2, 2).b("MW", 4, 2, 1, 0, 2, 2).b("MX", 2, 4, 4, 4, 4, 2).b("MY", 1, 0, 3, 2, 2, 2).b("MZ", 3, 3, 2, 1, 2, 2).b("NA", 4, 3, 3, 2, 2, 2).b("NC", 3, 0, 4, 4, 2, 2).b("NE", 4, 4, 4, 4, 2, 2).b("NF", 2, 2, 2, 2, 2, 2).b("NG", 3, 3, 2, 3, 2, 2).b("NI", 2, 1, 4, 4, 2, 2).b("NL", 0, 2, 3, 2, 0, 2).b("NO", 0, 1, 2, 0, 0, 2).b("NP", 2, 0, 4, 2, 2, 2).b("NR", 3, 2, 3, 1, 2, 2).b("NU", 4, 2, 2, 2, 2, 2).b("NZ", 0, 2, 1, 2, 4, 2).b("OM", 2, 2, 1, 3, 3, 2).b("PA", 1, 3, 3, 3, 2, 2).b("PE", 2, 3, 4, 4, 2, 2).b("PF", 2, 2, 2, 1, 2, 2).b(RequestConfiguration.MAX_AD_CONTENT_RATING_PG, 4, 4, 3, 2, 2, 2).b("PH", 2, 1, 3, 3, 3, 2).b("PK", 3, 2, 3, 3, 2, 2).b("PL", 1, 0, 1, 2, 3, 2).b("PM", 0, 2, 2, 2, 2, 2).b("PR", 2, 1, 2, 2, 4, 3).b("PS", 3, 3, 2, 2, 2, 2).b("PT", 0, 1, 1, 0, 2, 2).b("PW", 1, 2, 4, 1, 2, 2).b("PY", 2, 0, 3, 2, 2, 2).b("QA", 2, 3, 1, 2, 3, 2).b("RE", 1, 0, 2, 2, 2, 2).b("RO", 0, 1, 0, 1, 0, 2).b("RS", 1, 2, 0, 0, 2, 2).b("RU", 0, 1, 0, 1, 4, 2).b("RW", 3, 3, 3, 1, 2, 2).b("SA", 2, 2, 2, 1, 1, 2).b("SB", 4, 2, 3, 2, 2, 2).b("SC", 4, 2, 1, 3, 2, 2).b("SD", 4, 4, 4, 4, 2, 2).b("SE", 0, 0, 0, 0, 0, 2).b("SG", 1, 0, 1, 2, 3, 2).b("SH", 4, 2, 2, 2, 2, 2).b("SI", 0, 0, 0, 0, 2, 2).b("SJ", 2, 2, 2, 2, 2, 2).b("SK", 0, 1, 0, 0, 2, 2).b("SL", 4, 3, 4, 0, 2, 2).b("SM", 0, 2, 2, 2, 2, 2).b("SN", 4, 4, 4, 4, 2, 2).b("SO", 3, 3, 3, 4, 2, 2).b("SR", 3, 2, 2, 2, 2, 2).b("SS", 4, 4, 3, 3, 2, 2).b("ST", 2, 2, 1, 2, 2, 2).b("SV", 2, 1, 4, 3, 2, 2).b("SX", 2, 2, 1, 0, 2, 2).b("SY", 4, 3, 3, 2, 2, 2).b("SZ", 3, 3, 2, 4, 2, 2).b("TC", 2, 2, 2, 0, 2, 2).b("TD", 4, 3, 4, 4, 2, 2).b("TG", 3, 2, 2, 4, 2, 2).b("TH", 0, 3, 2, 3, 2, 2).b("TJ", 4, 4, 4, 4, 2, 2).b("TL", 4, 0, 4, 4, 2, 2).b("TM", 4, 2, 4, 3, 2, 2).b("TN", 2, 1, 1, 2, 2, 2).b("TO", 3, 3, 4, 3, 2, 2).b("TR", 1, 2, 1, 1, 2, 2).b("TT", 1, 4, 0, 1, 2, 2).b("TV", 3, 2, 2, 4, 2, 2).b("TW", 0, 0, 0, 0, 1, 0).b("TZ", 3, 3, 3, 2, 2, 2).b("UA", 0, 3, 1, 1, 2, 2).b("UG", 3, 2, 3, 3, 2, 2).b("US", 1, 1, 2, 2, 4, 2).b("UY", 2, 2, 1, 1, 2, 2).b("UZ", 2, 1, 3, 4, 2, 2).b("VC", 1, 2, 2, 2, 2, 2).b("VE", 4, 4, 4, 4, 2, 2).b("VG", 2, 2, 1, 1, 2, 2).b("VI", 1, 2, 1, 2, 2, 2).b("VN", 0, 1, 3, 4, 2, 2).b("VU", 4, 0, 3, 1, 2, 2).b("WF", 4, 2, 2, 4, 2, 2).b("WS", 3, 1, 3, 1, 2, 2).b("XK", 0, 1, 1, 0, 2, 2).b("YE", 4, 4, 4, 3, 2, 2).b("YT", 4, 2, 2, 3, 2, 2).b("ZA", 3, 3, 2, 1, 2, 2).b("ZM", 3, 2, 3, 3, 2, 2).b("ZW", 3, 2, 4, 3, 2, 2).c();
    }

    private static boolean a(l5 l5Var, boolean z2) {
        return z2 && !l5Var.b(8);
    }

    private void a(int i2, long j2, long j3) {
        if (i2 == 0 && j2 == 0 && j3 == this.f27025m) {
            return;
        }
        this.f27025m = j3;
        this.f27016b.a(i2, j2, j3);
    }

    @Override // com.applovin.impl.xo
    public synchronized void a(i5 i5Var, l5 l5Var, boolean z2, int i2) {
        if (a(l5Var, z2)) {
            this.f27020h += i2;
        }
    }

    @Override // com.applovin.impl.xo
    public synchronized void a(i5 i5Var, l5 l5Var, boolean z2) {
        try {
            if (a(l5Var, z2)) {
                if (this.f27018f == 0) {
                    this.f27019g = this.d.c();
                }
                this.f27018f++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.applovin.impl.y1
    public void a(y1.a aVar) {
        this.f27016b.a(aVar);
    }

    public static synchronized t5 a(Context context) {
        t5 t5Var;
        synchronized (t5.class) {
            try {
                if (w == null) {
                    w = new b(context).a();
                }
                t5Var = w;
            } catch (Throwable th) {
                throw th;
            }
        }
        return t5Var;
    }
}

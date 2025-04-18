package com.applovin.impl;

import android.content.Context;
import android.os.Handler;
import com.applovin.impl.ag;
import com.applovin.impl.x1;
import com.google.android.gms.ads.RequestConfiguration;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class r5 implements x1, yo {

    /* renamed from: p, reason: collision with root package name */
    public static final bb f7314p = b();

    /* renamed from: q, reason: collision with root package name */
    public static final ab f7315q = ab.a(6200000L, 3900000L, 2300000L, 1300000L, 620000L);

    /* renamed from: r, reason: collision with root package name */
    public static final ab f7316r = ab.a(248000L, 160000L, 142000L, 127000L, 113000L);

    /* renamed from: s, reason: collision with root package name */
    public static final ab f7317s = ab.a(2200000L, 1300000L, 950000L, 760000L, 520000L);

    /* renamed from: t, reason: collision with root package name */
    public static final ab f7318t = ab.a(4400000L, 2300000L, 1500000L, 1100000L, 640000L);
    public static final ab u = ab.a(10000000L, 7200000L, 5000000L, 2700000L, 1600000L);

    /* renamed from: v, reason: collision with root package name */
    public static final ab f7319v = ab.a(2600000L, 2200000L, 2000000L, 1500000L, 470000L);

    /* renamed from: w, reason: collision with root package name */
    private static r5 f7320w;
    private final cb a;

    /* renamed from: b, reason: collision with root package name */
    private final x1.a.C0042a f7321b;

    /* renamed from: c, reason: collision with root package name */
    private final fk f7322c;

    /* renamed from: d, reason: collision with root package name */
    private final j3 f7323d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f7324e;

    /* renamed from: f, reason: collision with root package name */
    private int f7325f;

    /* renamed from: g, reason: collision with root package name */
    private long f7326g;

    /* renamed from: h, reason: collision with root package name */
    private long f7327h;

    /* renamed from: i, reason: collision with root package name */
    private int f7328i;

    /* renamed from: j, reason: collision with root package name */
    private long f7329j;

    /* renamed from: k, reason: collision with root package name */
    private long f7330k;

    /* renamed from: l, reason: collision with root package name */
    private long f7331l;

    /* renamed from: m, reason: collision with root package name */
    private long f7332m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f7333n;

    /* renamed from: o, reason: collision with root package name */
    private int f7334o;

    /* loaded from: classes.dex */
    public static final class b {
        private final Context a;

        /* renamed from: b, reason: collision with root package name */
        private Map f7335b;

        /* renamed from: c, reason: collision with root package name */
        private int f7336c;

        /* renamed from: d, reason: collision with root package name */
        private j3 f7337d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f7338e;

        public b(Context context) {
            Context applicationContext;
            if (context == null) {
                applicationContext = null;
            } else {
                applicationContext = context.getApplicationContext();
            }
            this.a = applicationContext;
            this.f7335b = b(yp.b(context));
            this.f7336c = 2000;
            this.f7337d = j3.a;
            this.f7338e = true;
        }

        private static Map b(String str) {
            ab a = a(str);
            HashMap hashMap = new HashMap(8);
            hashMap.put(0, 1000000L);
            ab abVar = r5.f7315q;
            hashMap.put(2, (Long) abVar.get(((Integer) a.get(0)).intValue()));
            hashMap.put(3, (Long) r5.f7316r.get(((Integer) a.get(1)).intValue()));
            hashMap.put(4, (Long) r5.f7317s.get(((Integer) a.get(2)).intValue()));
            hashMap.put(5, (Long) r5.f7318t.get(((Integer) a.get(3)).intValue()));
            hashMap.put(10, (Long) r5.u.get(((Integer) a.get(4)).intValue()));
            hashMap.put(9, (Long) r5.f7319v.get(((Integer) a.get(5)).intValue()));
            hashMap.put(7, (Long) abVar.get(((Integer) a.get(0)).intValue()));
            return hashMap;
        }

        public r5 a() {
            return new r5(this.a, this.f7335b, this.f7336c, this.f7337d, this.f7338e);
        }

        private static ab a(String str) {
            ab b3 = r5.f7314p.b(str);
            return b3.isEmpty() ? ab.a(2, 2, 2, 2, 2, 2) : b3;
        }
    }

    private r5(Context context, Map map, int i10, j3 j3Var, boolean z10) {
        this.a = cb.a(map);
        this.f7321b = new x1.a.C0042a();
        this.f7322c = new fk(i10);
        this.f7323d = j3Var;
        this.f7324e = z10;
        if (context != null) {
            ag b3 = ag.b(context);
            int a10 = b3.a();
            this.f7328i = a10;
            this.f7331l = a(a10);
            b3.b(new ag.c() { // from class: com.applovin.impl.nv
                @Override // com.applovin.impl.ag.c
                public final void a(int i11) {
                    r5.this.b(i11);
                }
            });
            return;
        }
        this.f7328i = 0;
        this.f7331l = a(0);
    }

    @Override // com.applovin.impl.yo
    public void b(g5 g5Var, j5 j5Var, boolean z10) {
    }

    @Override // com.applovin.impl.yo
    public synchronized void c(g5 g5Var, j5 j5Var, boolean z10) {
        boolean z11;
        if (!a(j5Var, z10)) {
            return;
        }
        if (this.f7325f > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        a1.b(z11);
        long c10 = this.f7323d.c();
        int i10 = (int) (c10 - this.f7326g);
        this.f7329j += i10;
        long j3 = this.f7330k;
        long j10 = this.f7327h;
        this.f7330k = j3 + j10;
        if (i10 > 0) {
            this.f7322c.a((int) Math.sqrt(j10), (((float) j10) * 8000.0f) / i10);
            if (this.f7329j >= AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS || this.f7330k >= 524288) {
                this.f7331l = this.f7322c.a(0.5f);
            }
            a(i10, this.f7327h, this.f7331l);
            this.f7326g = c10;
            this.f7327h = 0L;
        }
        this.f7325f--;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(int i10) {
        int i11 = this.f7328i;
        if (i11 == 0 || this.f7324e) {
            if (this.f7333n) {
                i10 = this.f7334o;
            }
            if (i11 == i10) {
                return;
            }
            this.f7328i = i10;
            if (i10 != 1 && i10 != 0 && i10 != 8) {
                this.f7331l = a(i10);
                long c10 = this.f7323d.c();
                a(this.f7325f > 0 ? (int) (c10 - this.f7326g) : 0, this.f7327h, this.f7331l);
                this.f7326g = c10;
                this.f7327h = 0L;
                this.f7330k = 0L;
                this.f7329j = 0L;
                this.f7322c.c();
            }
        }
    }

    @Override // com.applovin.impl.x1
    public yo a() {
        return this;
    }

    @Override // com.applovin.impl.x1
    public void a(Handler handler, x1.a aVar) {
        a1.a(handler);
        a1.a(aVar);
        this.f7321b.a(handler, aVar);
    }

    private long a(int i10) {
        Long l10 = (Long) this.a.get(Integer.valueOf(i10));
        if (l10 == null) {
            l10 = (Long) this.a.get(0);
        }
        if (l10 == null) {
            l10 = 1000000L;
        }
        return l10.longValue();
    }

    private static boolean a(j5 j5Var, boolean z10) {
        return z10 && !j5Var.b(8);
    }

    private void a(int i10, long j3, long j10) {
        if (i10 == 0 && j3 == 0 && j10 == this.f7332m) {
            return;
        }
        this.f7332m = j10;
        this.f7321b.a(i10, j3, j10);
    }

    @Override // com.applovin.impl.yo
    public synchronized void a(g5 g5Var, j5 j5Var, boolean z10, int i10) {
        if (a(j5Var, z10)) {
            this.f7327h += i10;
        }
    }

    private static bb b() {
        return bb.k().b("AD", 1, 2, 0, 0, 2, 2).b("AE", 1, 4, 4, 4, 2, 2).b("AF", 4, 4, 3, 4, 2, 2).b("AG", 4, 2, 1, 4, 2, 2).b("AI", 1, 2, 2, 2, 2, 2).b("AL", 1, 1, 1, 1, 2, 2).b("AM", 2, 2, 1, 3, 2, 2).b("AO", 3, 4, 3, 1, 2, 2).b("AR", 2, 4, 2, 1, 2, 2).b("AS", 2, 2, 3, 3, 2, 2).b("AT", 0, 1, 0, 0, 0, 2).b("AU", 0, 2, 0, 1, 1, 2).b("AW", 1, 2, 0, 4, 2, 2).b("AX", 0, 2, 2, 2, 2, 2).b("AZ", 3, 3, 3, 4, 4, 2).b("BA", 1, 1, 0, 1, 2, 2).b("BB", 0, 2, 0, 0, 2, 2).b("BD", 2, 0, 3, 3, 2, 2).b("BE", 0, 0, 2, 3, 2, 2).b("BF", 4, 4, 4, 2, 2, 2).b("BG", 0, 1, 0, 0, 2, 2).b("BH", 1, 0, 2, 4, 2, 2).b("BI", 4, 4, 4, 4, 2, 2).b("BJ", 4, 4, 4, 4, 2, 2).b("BL", 1, 2, 2, 2, 2, 2).b("BM", 0, 2, 0, 0, 2, 2).b("BN", 3, 2, 1, 0, 2, 2).b("BO", 1, 2, 4, 2, 2, 2).b("BQ", 1, 2, 1, 2, 2, 2).b("BR", 2, 4, 3, 2, 2, 2).b("BS", 2, 2, 1, 3, 2, 2).b("BT", 3, 0, 3, 2, 2, 2).b("BW", 3, 4, 1, 1, 2, 2).b("BY", 1, 1, 1, 2, 2, 2).b("BZ", 2, 2, 2, 2, 2, 2).b("CA", 0, 3, 1, 2, 4, 2).b("CD", 4, 2, 2, 1, 2, 2).b("CF", 4, 2, 3, 2, 2, 2).b("CG", 3, 4, 2, 2, 2, 2).b("CH", 0, 0, 0, 0, 1, 2).b("CI", 3, 3, 3, 3, 2, 2).b("CK", 2, 2, 3, 0, 2, 2).b("CL", 1, 1, 2, 2, 2, 2).b("CM", 3, 4, 3, 2, 2, 2).b("CN", 2, 2, 2, 1, 3, 2).b("CO", 2, 3, 4, 2, 2, 2).b("CR", 2, 3, 4, 4, 2, 2).b("CU", 4, 4, 2, 2, 2, 2).b("CV", 2, 3, 1, 0, 2, 2).b("CW", 1, 2, 0, 0, 2, 2).b("CY", 1, 1, 0, 0, 2, 2).b("CZ", 0, 1, 0, 0, 1, 2).b("DE", 0, 0, 1, 1, 0, 2).b("DJ", 4, 0, 4, 4, 2, 2).b("DK", 0, 0, 1, 0, 0, 2).b("DM", 1, 2, 2, 2, 2, 2).b("DO", 3, 4, 4, 4, 2, 2).b("DZ", 3, 3, 4, 4, 2, 4).b("EC", 2, 4, 3, 1, 2, 2).b("EE", 0, 1, 0, 0, 2, 2).b("EG", 3, 4, 3, 3, 2, 2).b("EH", 2, 2, 2, 2, 2, 2).b("ER", 4, 2, 2, 2, 2, 2).b("ES", 0, 1, 1, 1, 2, 2).b("ET", 4, 4, 4, 1, 2, 2).b("FI", 0, 0, 0, 0, 0, 2).b("FJ", 3, 0, 2, 3, 2, 2).b("FK", 4, 2, 2, 2, 2, 2).b("FM", 3, 2, 4, 4, 2, 2).b("FO", 1, 2, 0, 1, 2, 2).b("FR", 1, 1, 2, 0, 1, 2).b("GA", 3, 4, 1, 1, 2, 2).b("GB", 0, 0, 1, 1, 1, 2).b("GD", 1, 2, 2, 2, 2, 2).b("GE", 1, 1, 1, 2, 2, 2).b("GF", 2, 2, 2, 3, 2, 2).b("GG", 1, 2, 0, 0, 2, 2).b("GH", 3, 1, 3, 2, 2, 2).b("GI", 0, 2, 0, 0, 2, 2).b("GL", 1, 2, 0, 0, 2, 2).b("GM", 4, 3, 2, 4, 2, 2).b("GN", 4, 3, 4, 2, 2, 2).b("GP", 2, 1, 2, 3, 2, 2).b("GQ", 4, 2, 2, 4, 2, 2).b("GR", 1, 2, 0, 0, 2, 2).b("GT", 3, 2, 3, 1, 2, 2).b("GU", 1, 2, 3, 4, 2, 2).b("GW", 4, 4, 4, 4, 2, 2).b("GY", 3, 3, 3, 4, 2, 2).b("HK", 0, 1, 2, 3, 2, 0).b("HN", 3, 1, 3, 3, 2, 2).b("HR", 1, 1, 0, 0, 3, 2).b("HT", 4, 4, 4, 4, 2, 2).b("HU", 0, 0, 0, 0, 0, 2).b("ID", 3, 2, 3, 3, 2, 2).b("IE", 0, 0, 1, 1, 3, 2).b("IL", 1, 0, 2, 3, 4, 2).b("IM", 0, 2, 0, 1, 2, 2).b("IN", 2, 1, 3, 3, 2, 2).b("IO", 4, 2, 2, 4, 2, 2).b("IQ", 3, 3, 4, 4, 2, 2).b("IR", 3, 2, 3, 2, 2, 2).b("IS", 0, 2, 0, 0, 2, 2).b("IT", 0, 4, 0, 1, 2, 2).b("JE", 2, 2, 1, 2, 2, 2).b("JM", 3, 3, 4, 4, 2, 2).b("JO", 2, 2, 1, 1, 2, 2).b("JP", 0, 0, 0, 0, 2, 1).b("KE", 3, 4, 2, 2, 2, 2).b("KG", 2, 0, 1, 1, 2, 2).b("KH", 1, 0, 4, 3, 2, 2).b("KI", 4, 2, 4, 3, 2, 2).b("KM", 4, 3, 2, 3, 2, 2).b("KN", 1, 2, 2, 2, 2, 2).b("KP", 4, 2, 2, 2, 2, 2).b("KR", 0, 0, 1, 3, 1, 2).b("KW", 1, 3, 1, 1, 1, 2).b("KY", 1, 2, 0, 2, 2, 2).b("KZ", 2, 2, 2, 3, 2, 2).b("LA", 1, 2, 1, 1, 2, 2).b("LB", 3, 2, 0, 0, 2, 2).b("LC", 1, 2, 0, 0, 2, 2).b("LI", 0, 2, 2, 2, 2, 2).b("LK", 2, 0, 2, 3, 2, 2).b("LR", 3, 4, 4, 3, 2, 2).b("LS", 3, 3, 2, 3, 2, 2).b("LT", 0, 0, 0, 0, 2, 2).b("LU", 1, 0, 1, 1, 2, 2).b("LV", 0, 0, 0, 0, 2, 2).b("LY", 4, 2, 4, 3, 2, 2).b(RequestConfiguration.MAX_AD_CONTENT_RATING_MA, 3, 2, 2, 1, 2, 2).b("MC", 0, 2, 0, 0, 2, 2).b("MD", 1, 2, 0, 0, 2, 2).b("ME", 1, 2, 0, 1, 2, 2).b("MF", 2, 2, 1, 1, 2, 2).b("MG", 3, 4, 2, 2, 2, 2).b("MH", 4, 2, 2, 4, 2, 2).b("MK", 1, 1, 0, 0, 2, 2).b("ML", 4, 4, 2, 2, 2, 2).b("MM", 2, 3, 3, 3, 2, 2).b("MN", 2, 4, 2, 2, 2, 2).b("MO", 0, 2, 4, 4, 2, 2).b("MP", 0, 2, 2, 2, 2, 2).b("MQ", 2, 2, 2, 3, 2, 2).b("MR", 3, 0, 4, 3, 2, 2).b("MS", 1, 2, 2, 2, 2, 2).b("MT", 0, 2, 0, 0, 2, 2).b("MU", 2, 1, 1, 2, 2, 2).b("MV", 4, 3, 2, 4, 2, 2).b("MW", 4, 2, 1, 0, 2, 2).b("MX", 2, 4, 4, 4, 4, 2).b("MY", 1, 0, 3, 2, 2, 2).b("MZ", 3, 3, 2, 1, 2, 2).b("NA", 4, 3, 3, 2, 2, 2).b("NC", 3, 0, 4, 4, 2, 2).b("NE", 4, 4, 4, 4, 2, 2).b("NF", 2, 2, 2, 2, 2, 2).b("NG", 3, 3, 2, 3, 2, 2).b("NI", 2, 1, 4, 4, 2, 2).b("NL", 0, 2, 3, 2, 0, 2).b("NO", 0, 1, 2, 0, 0, 2).b("NP", 2, 0, 4, 2, 2, 2).b("NR", 3, 2, 3, 1, 2, 2).b("NU", 4, 2, 2, 2, 2, 2).b("NZ", 0, 2, 1, 2, 4, 2).b("OM", 2, 2, 1, 3, 3, 2).b("PA", 1, 3, 3, 3, 2, 2).b("PE", 2, 3, 4, 4, 2, 2).b("PF", 2, 2, 2, 1, 2, 2).b(RequestConfiguration.MAX_AD_CONTENT_RATING_PG, 4, 4, 3, 2, 2, 2).b("PH", 2, 1, 3, 3, 3, 2).b("PK", 3, 2, 3, 3, 2, 2).b("PL", 1, 0, 1, 2, 3, 2).b("PM", 0, 2, 2, 2, 2, 2).b("PR", 2, 1, 2, 2, 4, 3).b("PS", 3, 3, 2, 2, 2, 2).b("PT", 0, 1, 1, 0, 2, 2).b("PW", 1, 2, 4, 1, 2, 2).b("PY", 2, 0, 3, 2, 2, 2).b("QA", 2, 3, 1, 2, 3, 2).b("RE", 1, 0, 2, 2, 2, 2).b("RO", 0, 1, 0, 1, 0, 2).b("RS", 1, 2, 0, 0, 2, 2).b("RU", 0, 1, 0, 1, 4, 2).b("RW", 3, 3, 3, 1, 2, 2).b("SA", 2, 2, 2, 1, 1, 2).b("SB", 4, 2, 3, 2, 2, 2).b("SC", 4, 2, 1, 3, 2, 2).b("SD", 4, 4, 4, 4, 2, 2).b("SE", 0, 0, 0, 0, 0, 2).b("SG", 1, 0, 1, 2, 3, 2).b("SH", 4, 2, 2, 2, 2, 2).b("SI", 0, 0, 0, 0, 2, 2).b("SJ", 2, 2, 2, 2, 2, 2).b("SK", 0, 1, 0, 0, 2, 2).b("SL", 4, 3, 4, 0, 2, 2).b("SM", 0, 2, 2, 2, 2, 2).b("SN", 4, 4, 4, 4, 2, 2).b("SO", 3, 3, 3, 4, 2, 2).b("SR", 3, 2, 2, 2, 2, 2).b("SS", 4, 4, 3, 3, 2, 2).b("ST", 2, 2, 1, 2, 2, 2).b("SV", 2, 1, 4, 3, 2, 2).b("SX", 2, 2, 1, 0, 2, 2).b("SY", 4, 3, 3, 2, 2, 2).b("SZ", 3, 3, 2, 4, 2, 2).b("TC", 2, 2, 2, 0, 2, 2).b("TD", 4, 3, 4, 4, 2, 2).b("TG", 3, 2, 2, 4, 2, 2).b("TH", 0, 3, 2, 3, 2, 2).b("TJ", 4, 4, 4, 4, 2, 2).b("TL", 4, 0, 4, 4, 2, 2).b("TM", 4, 2, 4, 3, 2, 2).b("TN", 2, 1, 1, 2, 2, 2).b("TO", 3, 3, 4, 3, 2, 2).b("TR", 1, 2, 1, 1, 2, 2).b("TT", 1, 4, 0, 1, 2, 2).b("TV", 3, 2, 2, 4, 2, 2).b("TW", 0, 0, 0, 0, 1, 0).b("TZ", 3, 3, 3, 2, 2, 2).b("UA", 0, 3, 1, 1, 2, 2).b("UG", 3, 2, 3, 3, 2, 2).b("US", 1, 1, 2, 2, 4, 2).b("UY", 2, 2, 1, 1, 2, 2).b("UZ", 2, 1, 3, 4, 2, 2).b("VC", 1, 2, 2, 2, 2, 2).b("VE", 4, 4, 4, 4, 2, 2).b("VG", 2, 2, 1, 1, 2, 2).b("VI", 1, 2, 1, 2, 2, 2).b("VN", 0, 1, 3, 4, 2, 2).b("VU", 4, 0, 3, 1, 2, 2).b("WF", 4, 2, 2, 4, 2, 2).b("WS", 3, 1, 3, 1, 2, 2).b("XK", 0, 1, 1, 0, 2, 2).b("YE", 4, 4, 4, 3, 2, 2).b("YT", 4, 2, 2, 3, 2, 2).b("ZA", 3, 3, 2, 1, 2, 2).b("ZM", 3, 2, 3, 3, 2, 2).b("ZW", 3, 2, 4, 3, 2, 2).c();
    }

    @Override // com.applovin.impl.yo
    public synchronized void a(g5 g5Var, j5 j5Var, boolean z10) {
        if (a(j5Var, z10)) {
            if (this.f7325f == 0) {
                this.f7326g = this.f7323d.c();
            }
            this.f7325f++;
        }
    }

    @Override // com.applovin.impl.x1
    public void a(x1.a aVar) {
        this.f7321b.a(aVar);
    }

    public static synchronized r5 a(Context context) {
        r5 r5Var;
        synchronized (r5.class) {
            if (f7320w == null) {
                f7320w = new b(context).a();
            }
            r5Var = f7320w;
        }
        return r5Var;
    }
}

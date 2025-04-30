package com.mbridge.msdk.newreward.a;

import android.os.SystemClock;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.newout.RewardVideoListener;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import com.mbridge.msdk.newreward.function.common.MBridgeDailyPlayModel;
import com.mbridge.msdk.newreward.function.common.MBridgeSharedPreferenceModel;
import com.mbridge.msdk.out.MBridgeIds;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedDeque;

/* loaded from: classes3.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    private Deque<e> f16974a;

    /* renamed from: c, reason: collision with root package name */
    private RewardVideoListener f16975c;

    /* renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.f.e f16976d;

    /* renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.c.c f16977e;

    /* renamed from: f, reason: collision with root package name */
    private MBridgeIds f16978f;

    /* renamed from: g, reason: collision with root package name */
    private Map f16979g;

    /* renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.newreward.b.b f16980h;
    private final Object b = new Object();

    /* renamed from: i, reason: collision with root package name */
    private int f16981i = 1;

    /* renamed from: j, reason: collision with root package name */
    private int f16982j = 1;

    public d() {
        if (this.f16974a == null) {
            this.f16974a = new ConcurrentLinkedDeque();
        }
    }

    @Override // com.mbridge.msdk.newreward.a.c
    public final boolean d() {
        Iterator<e> it = this.f16974a.iterator();
        while (it.hasNext()) {
            if (it.next().x().c()) {
                return true;
            }
        }
        return false;
    }

    public final void b(Object obj) {
        for (com.mbridge.msdk.newreward.function.d.a.b bVar : (List) obj) {
            e eVar = new e(false, ((Integer) this.f16979g.get("mb_ad_type")).intValue(), bVar.f(), bVar.c(), bVar.g());
            com.mbridge.msdk.newreward.function.f.a aVar = new com.mbridge.msdk.newreward.function.f.a();
            aVar.a(bVar);
            eVar.a(aVar);
            eVar.a(this.f16976d);
            eVar.b(2);
            eVar.f16997a = new f(this.f16977e);
            eVar.a(this.f16975c);
            this.f16974a.add(eVar);
        }
    }

    @Override // com.mbridge.msdk.newreward.a.c
    public final void c() {
        e peek;
        synchronized (this.b) {
            try {
                if (this.f16974a.size() == 0) {
                    this.f16980h.a(com.mbridge.msdk.newreward.function.h.b.a(""));
                    this.f16977e.a(this.f16980h, com.mbridge.msdk.newreward.function.c.e.REPORT_SHOW_START, (Object) null);
                    this.f16975c.onShowFail(this.f16978f, "no adapter_model");
                    a("no adapter_model");
                    return;
                }
                while (a(2) > this.f16981i) {
                    this.f16974a.pollFirst();
                }
                ConcurrentLinkedDeque concurrentLinkedDeque = new ConcurrentLinkedDeque();
                while (true) {
                    if (this.f16974a.size() == 0) {
                        break;
                    }
                    try {
                        peek = this.f16974a.peek();
                    } catch (Exception e4) {
                        if (this.f16974a.size() == 1) {
                            this.f16980h.a(com.mbridge.msdk.newreward.function.h.b.a(""));
                            this.f16975c.onShowFail(this.f16978f, e4.getMessage());
                            a(e4.getMessage());
                            break;
                        }
                    }
                    if (peek.x().c()) {
                        b(peek);
                        peek.f16997a.b(peek);
                        this.f16980h.a(peek);
                        this.f16974a.poll();
                        break;
                    }
                    if (peek.s() == 2 && !peek.x().c()) {
                        if (this.f16974a.size() == 1) {
                            this.f16980h.a(peek);
                            this.f16975c.onShowFail(this.f16978f, "no isReadyCampaign");
                            a("no isReadyCampaign");
                        }
                        this.f16974a.poll();
                    } else {
                        if (this.f16974a.size() == 1) {
                            this.f16980h.a(peek);
                            this.f16975c.onShowFail(this.f16978f, "all campaign is loading");
                            a("all campaign is loading");
                        }
                        concurrentLinkedDeque.push(this.f16974a.poll());
                    }
                }
                while (concurrentLinkedDeque.size() != 0) {
                    this.f16974a.push((e) concurrentLinkedDeque.poll());
                }
                com.mbridge.msdk.newreward.b.b bVar = this.f16980h;
                if (bVar != null) {
                    if (bVar.a() != null) {
                        this.f16977e.a(this.f16980h.a(), com.mbridge.msdk.newreward.function.c.e.REPORT_SHOW_START, (Object) null);
                    } else {
                        this.f16977e.a(this.f16980h, com.mbridge.msdk.newreward.function.c.e.REPORT_SHOW_START, (Object) null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.a.c
    public final void a(Object obj) {
        this.f16975c = (RewardVideoListener) obj;
    }

    @Override // com.mbridge.msdk.newreward.a.c
    public final void a(Object... objArr) {
        com.mbridge.msdk.newreward.function.c.c cVar = (com.mbridge.msdk.newreward.function.c.c) objArr[0];
        this.f16977e = cVar;
        com.mbridge.msdk.newreward.b.b bVar = (com.mbridge.msdk.newreward.b.b) objArr[1];
        this.f16980h = bVar;
        final Map a6 = cVar.a("mb_ad_type", Integer.valueOf(bVar.e()), "mb_ad_is_header_bidding", Boolean.valueOf(this.f16980h.f()), "mb_ad_pid", this.f16980h.d(), "mb_ad_unit_id", this.f16980h.c());
        this.f16978f = (MBridgeIds) this.f16977e.a(a6, com.mbridge.msdk.newreward.function.c.e.CREATE_BIDS);
        com.mbridge.msdk.newreward.function.c.c cVar2 = this.f16977e;
        cVar2.c(cVar2.a("mb_ad_unit_id", this.f16980h.c(), "command_type", com.mbridge.msdk.newreward.function.c.e.UNIT_INIT), new com.mbridge.msdk.newreward.a.b.b() { // from class: com.mbridge.msdk.newreward.a.d.1
            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(com.mbridge.msdk.foundation.c.b bVar2) {
            }

            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(Object obj) {
            }
        });
        com.mbridge.msdk.newreward.function.e.c.a().b().a(this.f16980h.e(), this.f16980h.d(), this.f16980h.c());
        this.f16977e.a((Object) a6, com.mbridge.msdk.newreward.function.c.e.REQ_SETTING, new com.mbridge.msdk.newreward.a.b.b() { // from class: com.mbridge.msdk.newreward.a.d.2
            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(com.mbridge.msdk.foundation.c.b bVar2) {
            }

            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(Object obj) {
                d.this.f16976d = (com.mbridge.msdk.newreward.function.f.e) obj;
                d.this.f16979g = a6;
                if (d.this.f16980h != null) {
                    d.this.f16980h.a(d.this.f16976d);
                }
                ((MBridgeDailyPlayModel) d.this.f16977e.a(a6, com.mbridge.msdk.newreward.function.c.e.CREATE_DAILY)).setMaxPlayCount(d.this.f16976d.b() == null ? 0 : d.this.f16976d.b().d());
            }
        });
        Map map = this.f16979g;
        map.put("command_type", com.mbridge.msdk.newreward.function.c.e.RESTORE_DB);
        this.f16977e.c(map, new com.mbridge.msdk.newreward.a.b.b() { // from class: com.mbridge.msdk.newreward.a.d.3
            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(com.mbridge.msdk.foundation.c.b bVar2) {
            }

            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(Object obj) {
                d.this.b(obj);
            }
        });
        com.mbridge.msdk.newreward.function.c.c cVar3 = this.f16977e;
        cVar3.e(cVar3.a("controller_model", this.f16980h, "command_manager", cVar3, "adapter_manager", this));
        int a9 = af.a().a(MBridgeCommon.SharedPreference.KEY_LOADING_CAPACITY, 1);
        this.f16982j = a9;
        if (a9 <= 0) {
            this.f16982j = 1;
        }
    }

    private void b(e eVar) {
        e eVar2;
        if (eVar == null || TextUtils.isEmpty(eVar.b())) {
            return;
        }
        try {
            Deque<e> deque = this.f16974a;
            if (deque != null) {
                Iterator<e> it = deque.iterator();
                while (it.hasNext()) {
                    eVar2 = it.next();
                    if (eVar2 != null && eVar2.a() && (eVar2.x() == null || !eVar2.x().c())) {
                        if (eVar.b().equals(eVar2.z())) {
                            break;
                        }
                    }
                }
            }
            eVar2 = null;
            if (eVar2 != null) {
                com.mbridge.msdk.newreward.function.c.c cVar = this.f16977e;
                cVar.c(cVar.a("adapter_model", eVar, "queue_first_adapter_model", eVar2), com.mbridge.msdk.newreward.function.c.e.UPDATE_CAM_TOKEN_RULE);
            }
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                e4.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.a.c
    public final void a(e eVar, b bVar) {
        e peek;
        if (eVar == null || bVar == null) {
            return;
        }
        eVar.a(this.f16976d);
        eVar.a(this.f16975c);
        com.mbridge.msdk.newreward.function.c.c cVar = this.f16977e;
        if (cVar != null) {
            cVar.a(eVar, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_START, (Object) null);
        }
        int integer = MBridgeSharedPreferenceModel.getInstance().getInteger("vcn_" + this.f16980h.c(), 1);
        this.f16981i = integer;
        if (integer <= 0) {
            this.f16981i = 1;
        }
        if (a(1) < this.f16982j) {
            try {
                synchronized (this.b) {
                    try {
                        if (c(eVar)) {
                            return;
                        }
                        if (d() && !eVar.l()) {
                            if (!TextUtils.isEmpty(eVar.C()) && com.mbridge.msdk.newreward.function.h.a.c(eVar.C())) {
                                com.mbridge.msdk.newreward.function.c.c cVar2 = this.f16977e;
                                if (((Boolean) cVar2.b(cVar2.a("adapter_model", eVar, "command_manager", cVar2, "candidate_type", 1, "reason", new com.mbridge.msdk.foundation.c.b(880038)))).booleanValue()) {
                                    eVar.g(true);
                                    com.mbridge.msdk.newreward.function.c.c cVar3 = this.f16977e;
                                    com.mbridge.msdk.newreward.function.a.b bVar2 = (com.mbridge.msdk.newreward.function.a.b) cVar3.b(cVar3.a("adapter_model", eVar, "command_manager", cVar3, "candidate_type", 2, "reason", new com.mbridge.msdk.foundation.c.b(880038)));
                                    if (bVar2 != null && bVar2.h() == com.mbridge.msdk.newreward.function.a.b.f17049d) {
                                        eVar.x().a(bVar2.a());
                                        a(eVar, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_V3_CAMPAIGN_SUCCESS);
                                        this.f16975c.onLoadSuccess(this.f16978f);
                                        eVar.c(true);
                                        a(eVar, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_VIDEO_CAMPAIGN_SUCCESS);
                                        this.f16975c.onVideoLoadSuccess(this.f16978f);
                                        eVar.d(true);
                                        break;
                                    }
                                }
                            }
                            int integer2 = MBridgeSharedPreferenceModel.getInstance().getInteger("vcn_" + eVar.A(), 1);
                            if (this.f16974a.size() != 0 && this.f16974a.size() >= integer2) {
                                if (TextUtils.isEmpty(eVar.C()) && (peek = this.f16974a.peek()) != null && peek.x() != null && peek.x().b() != null) {
                                    eVar.x().a(peek.x().b());
                                } else {
                                    for (e eVar2 : this.f16974a) {
                                        com.mbridge.msdk.newreward.function.d.a.b b = eVar2.x().b();
                                        if (b != null && b.E() == 1) {
                                            eVar2.a(eVar.z());
                                            eVar.a(true);
                                        }
                                    }
                                }
                                a(eVar, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_V3_CAMPAIGN_SUCCESS);
                                this.f16975c.onLoadSuccess(this.f16978f);
                                eVar.c(true);
                                a(eVar, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_VIDEO_CAMPAIGN_SUCCESS);
                                this.f16975c.onVideoLoadSuccess(this.f16978f);
                                eVar.d(true);
                                break;
                            }
                        }
                        for (e eVar3 : this.f16974a) {
                            if (!eVar3.x().c() && eVar3.s() == 2) {
                                this.f16974a.remove(eVar3);
                                com.mbridge.msdk.foundation.same.report.d.c.a().c(eVar3.z());
                            }
                        }
                        try {
                            List<String> e4 = com.mbridge.msdk.newreward.function.e.c.a().b().e(eVar.p(), eVar.w(), eVar.A());
                            if (e4 != null && e4.size() > 0) {
                                Iterator<String> it = e4.iterator();
                                while (it.hasNext()) {
                                    com.mbridge.msdk.foundation.same.report.d.c.a().c(it.next());
                                }
                            }
                        } catch (Exception e9) {
                            if (MBridgeConstans.DEBUG) {
                                e9.printStackTrace();
                            }
                        }
                        while (a(2) > this.f16981i) {
                            this.f16974a.pollFirst();
                        }
                        this.f16974a.add(eVar);
                        eVar.f16997a = bVar;
                        eVar.a(SystemClock.elapsedRealtime());
                        bVar.a(eVar);
                        return;
                    } finally {
                    }
                }
            } catch (Exception e10) {
                this.f16975c.onVideoLoadFail(new MBridgeIds(), e10.getMessage());
                a(eVar, com.mbridge.msdk.foundation.c.a.b(880020, "errorCode: 3501 errorMessage: " + e10.getMessage()));
                com.mbridge.msdk.newreward.function.e.c.a().b().a(eVar.p(), eVar.w(), eVar.A(), eVar.z(), 406);
                return;
            }
        }
        this.f16975c.onVideoLoadFail(new MBridgeIds(), "current unit is loading");
        a(eVar, com.mbridge.msdk.foundation.c.a.b(880016, "errorCode: 3501 errorMessage: current unit is loading"));
    }

    @Override // com.mbridge.msdk.newreward.a.c
    public final e b() {
        e peek;
        Deque<e> deque = this.f16974a;
        if (deque == null || deque.size() == 0 || (peek = this.f16974a.peek()) == null) {
            return null;
        }
        return peek;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007a A[Catch: Exception -> 0x0085, TryCatch #1 {Exception -> 0x0085, blocks: (B:18:0x005e, B:20:0x007a, B:24:0x0092), top: B:17:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2 A[Catch: Exception -> 0x0036, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0036, blocks: (B:3:0x0005, B:5:0x0009, B:7:0x000f, B:9:0x0021, B:11:0x0029, B:12:0x003b, B:14:0x0057, B:36:0x00a2), top: B:2:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean c(com.mbridge.msdk.newreward.a.e r9) {
        /*
            r8 = this;
            java.lang.String r0 = "error_code"
            java.lang.String r1 = "msg"
            r2 = 0
            java.util.Deque<com.mbridge.msdk.newreward.a.e> r3 = r8.f16974a     // Catch: java.lang.Exception -> L36
            if (r3 == 0) goto L39
            java.lang.Object r3 = r3.peek()     // Catch: java.lang.Exception -> L36
            if (r3 == 0) goto L39
            java.util.Deque<com.mbridge.msdk.newreward.a.e> r3 = r8.f16974a     // Catch: java.lang.Exception -> L36
            java.lang.Object r3 = r3.peek()     // Catch: java.lang.Exception -> L36
            com.mbridge.msdk.newreward.a.e r3 = (com.mbridge.msdk.newreward.a.e) r3     // Catch: java.lang.Exception -> L36
            java.lang.String r3 = r3.q()     // Catch: java.lang.Exception -> L36
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L36
            if (r4 != 0) goto L39
            java.lang.String r4 = "-1"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> L36
            if (r3 == 0) goto L39
            java.util.Deque<com.mbridge.msdk.newreward.a.e> r3 = r8.f16974a     // Catch: java.lang.Exception -> L36
            java.lang.Object r3 = r3.peek()     // Catch: java.lang.Exception -> L36
            com.mbridge.msdk.newreward.a.e r3 = (com.mbridge.msdk.newreward.a.e) r3     // Catch: java.lang.Exception -> L36
            long r3 = r3.o()     // Catch: java.lang.Exception -> L36
            goto L3b
        L36:
            r9 = move-exception
            goto Lae
        L39:
            r3 = 0
        L3b:
            com.mbridge.msdk.newreward.function.c.c r5 = r8.f16977e     // Catch: java.lang.Exception -> L36
            java.lang.String r6 = "adapter_model"
            java.lang.String r7 = "last_response_empty_time"
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Exception -> L36
            java.lang.Object[] r3 = new java.lang.Object[]{r6, r9, r7, r3}     // Catch: java.lang.Exception -> L36
            java.util.Map r3 = r5.a(r3)     // Catch: java.lang.Exception -> L36
            com.mbridge.msdk.newreward.function.c.e r4 = com.mbridge.msdk.newreward.function.c.e.CHECK_IS_REQUEST_CONTROL     // Catch: java.lang.Exception -> L36
            java.lang.Object r3 = r5.b(r3, r4)     // Catch: java.lang.Exception -> L36
            java.util.Map r3 = (java.util.Map) r3     // Catch: java.lang.Exception -> L36
            if (r3 == 0) goto La0
            int r4 = r3.size()     // Catch: java.lang.Exception -> L36
            if (r4 <= 0) goto La0
            r4 = 1
            com.mbridge.msdk.newout.RewardVideoListener r5 = r8.f16975c     // Catch: java.lang.Exception -> L85
            com.mbridge.msdk.out.MBridgeIds r6 = new com.mbridge.msdk.out.MBridgeIds     // Catch: java.lang.Exception -> L85
            r6.<init>()     // Catch: java.lang.Exception -> L85
            java.lang.Object r7 = r3.get(r1)     // Catch: java.lang.Exception -> L85
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L85
            r5.onVideoLoadFail(r6, r7)     // Catch: java.lang.Exception -> L85
            java.lang.Object r5 = r3.get(r0)     // Catch: java.lang.Exception -> L85
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch: java.lang.Exception -> L85
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L85
            if (r5 != 0) goto L88
            java.lang.Object r0 = r3.get(r0)     // Catch: java.lang.Exception -> L85
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L85
            int r2 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L85
            goto L88
        L85:
            r9 = move-exception
            r2 = r4
            goto Lae
        L88:
            r0 = -1
            if (r2 != r0) goto L8f
            r0 = 880018(0xd6d92, float:1.233168E-39)
            goto L92
        L8f:
            r0 = 880002(0xd6d82, float:1.233145E-39)
        L92:
            java.lang.Object r1 = r3.get(r1)     // Catch: java.lang.Exception -> L85
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L85
            com.mbridge.msdk.foundation.c.b r0 = com.mbridge.msdk.foundation.c.a.a(r2, r0, r1)     // Catch: java.lang.Exception -> L85
            r8.a(r9, r0)     // Catch: java.lang.Exception -> L85
            r2 = r4
        La0:
            if (r2 == 0) goto Lb5
            com.mbridge.msdk.foundation.same.report.d.c r0 = com.mbridge.msdk.foundation.same.report.d.c.a()     // Catch: java.lang.Exception -> L36
            java.lang.String r9 = r9.z()     // Catch: java.lang.Exception -> L36
            r0.c(r9)     // Catch: java.lang.Exception -> L36
            goto Lb5
        Lae:
            boolean r0 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r0 == 0) goto Lb5
            r9.printStackTrace()
        Lb5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.newreward.a.d.c(com.mbridge.msdk.newreward.a.e):boolean");
    }

    private void a(e eVar, com.mbridge.msdk.newreward.function.c.e eVar2) {
        if (eVar == null) {
            return;
        }
        List<CampaignEx> a6 = eVar.x() != null ? eVar.x().a() : null;
        try {
            com.mbridge.msdk.newreward.function.c.c cVar = this.f16977e;
            cVar.a(eVar, eVar2, cVar.a("metrics_data", a6, "auto_load", Integer.valueOf(eVar.B() ? 2 : 1), "cache", 1));
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                e4.printStackTrace();
            }
        }
    }

    private void a(e eVar, com.mbridge.msdk.foundation.c.b bVar) {
        eVar.b(2);
        eVar.d(true);
        com.mbridge.msdk.newreward.function.c.c cVar = this.f16977e;
        cVar.a(eVar, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_FAILED, cVar.a("metrics_data", bVar));
    }

    private int a(int i9) {
        int i10 = 0;
        if (this.f16974a.size() == 0) {
            return 0;
        }
        for (e eVar : this.f16974a) {
            if (i9 != 1) {
                if (i9 == 2 && eVar.x().c()) {
                    i10++;
                }
            } else if (eVar.s() == 1) {
                i10++;
            }
        }
        return i10;
    }

    private void a(String str) {
        com.mbridge.msdk.newreward.b.b bVar = this.f16980h;
        if (bVar == null) {
            return;
        }
        com.mbridge.msdk.newreward.function.c.c cVar = this.f16977e;
        cVar.a(bVar, com.mbridge.msdk.newreward.function.c.e.REPORT_SHOW_FAIL, cVar.a("reason", str));
    }

    @Override // com.mbridge.msdk.newreward.a.c
    public final List<e> a() {
        ArrayList arrayList = new ArrayList();
        Deque<e> deque = this.f16974a;
        if (deque != null && deque.size() != 0) {
            Iterator<e> it = this.f16974a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return arrayList;
    }

    public final void a(e eVar) {
        Deque<e> deque;
        if (eVar == null || (deque = this.f16974a) == null) {
            return;
        }
        deque.addLast(eVar);
    }
}

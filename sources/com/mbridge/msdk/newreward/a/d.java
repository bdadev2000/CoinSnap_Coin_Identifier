package com.mbridge.msdk.newreward.a;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.newout.RewardVideoListener;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import com.mbridge.msdk.newreward.function.common.MBridgeDailyPlayModel;
import com.mbridge.msdk.out.MBridgeIds;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedDeque;

/* loaded from: classes4.dex */
public final class d implements c {
    private Deque<e> a;

    /* renamed from: c, reason: collision with root package name */
    private RewardVideoListener f14383c;

    /* renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.f.e f14384d;

    /* renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.c.c f14385e;

    /* renamed from: f, reason: collision with root package name */
    private MBridgeIds f14386f;

    /* renamed from: g, reason: collision with root package name */
    private Map f14387g;

    /* renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.newreward.b.b f14388h;

    /* renamed from: b, reason: collision with root package name */
    private final Object f14382b = new Object();

    /* renamed from: i, reason: collision with root package name */
    private int f14389i = 1;

    /* renamed from: j, reason: collision with root package name */
    private int f14390j = 1;

    public d() {
        if (this.a == null) {
            this.a = new ConcurrentLinkedDeque();
        }
    }

    @Override // com.mbridge.msdk.newreward.a.c
    public final boolean d() {
        Iterator<e> it = this.a.iterator();
        while (it.hasNext()) {
            if (it.next().x().c()) {
                return true;
            }
        }
        return false;
    }

    public final void b(Object obj) {
        for (com.mbridge.msdk.newreward.function.d.a.b bVar : (List) obj) {
            e eVar = new e(false, ((Integer) this.f14387g.get("mb_ad_type")).intValue(), bVar.f(), bVar.c(), bVar.g());
            com.mbridge.msdk.newreward.function.f.a aVar = new com.mbridge.msdk.newreward.function.f.a();
            aVar.a(bVar);
            eVar.a(aVar);
            eVar.a(this.f14384d);
            eVar.b(2);
            eVar.a = new f(this.f14385e);
            eVar.a(this.f14383c);
            this.a.add(eVar);
        }
    }

    @Override // com.mbridge.msdk.newreward.a.c
    public final void c() {
        e peek;
        synchronized (this.f14382b) {
            if (this.a.size() == 0) {
                this.f14388h.a(com.mbridge.msdk.newreward.function.h.b.a(""));
                this.f14385e.a(this.f14388h, com.mbridge.msdk.newreward.function.c.e.REPORT_SHOW_START, (Object) null);
                this.f14383c.onShowFail(this.f14386f, "no adapter_model");
                a("no adapter_model");
                return;
            }
            while (a(2) > this.f14389i) {
                this.a.pollFirst();
            }
            ConcurrentLinkedDeque concurrentLinkedDeque = new ConcurrentLinkedDeque();
            while (true) {
                if (this.a.size() == 0) {
                    break;
                }
                try {
                    peek = this.a.peek();
                } catch (Exception e2) {
                    if (this.a.size() == 1) {
                        this.f14388h.a(com.mbridge.msdk.newreward.function.h.b.a(""));
                        this.f14383c.onShowFail(this.f14386f, e2.getMessage());
                        a(e2.getMessage());
                        break;
                    }
                }
                if (peek.x().c()) {
                    b(peek);
                    peek.a.b(peek);
                    this.f14388h.a(peek);
                    this.a.poll();
                    break;
                }
                if (peek.s() == 2 && !peek.x().c()) {
                    if (this.a.size() == 1) {
                        this.f14388h.a(peek);
                        this.f14383c.onShowFail(this.f14386f, "no isReadyCampaign");
                        a("no isReadyCampaign");
                    }
                    this.a.poll();
                } else {
                    if (this.a.size() == 1) {
                        this.f14388h.a(peek);
                        this.f14383c.onShowFail(this.f14386f, "all campaign is loading");
                        a("all campaign is loading");
                    }
                    concurrentLinkedDeque.push(this.a.poll());
                }
            }
            while (concurrentLinkedDeque.size() != 0) {
                this.a.push((e) concurrentLinkedDeque.poll());
            }
            com.mbridge.msdk.newreward.b.b bVar = this.f14388h;
            if (bVar != null) {
                if (bVar.a() != null) {
                    this.f14385e.a(this.f14388h.a(), com.mbridge.msdk.newreward.function.c.e.REPORT_SHOW_START, (Object) null);
                } else {
                    this.f14385e.a(this.f14388h, com.mbridge.msdk.newreward.function.c.e.REPORT_SHOW_START, (Object) null);
                }
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.a.c
    public final void a(Object obj) {
        this.f14383c = (RewardVideoListener) obj;
    }

    @Override // com.mbridge.msdk.newreward.a.c
    public final void a(Object... objArr) {
        com.mbridge.msdk.newreward.function.c.c cVar = (com.mbridge.msdk.newreward.function.c.c) objArr[0];
        this.f14385e = cVar;
        com.mbridge.msdk.newreward.b.b bVar = (com.mbridge.msdk.newreward.b.b) objArr[1];
        this.f14388h = bVar;
        final Map a = cVar.a("mb_ad_type", Integer.valueOf(bVar.e()), "mb_ad_is_header_bidding", Boolean.valueOf(this.f14388h.f()), "mb_ad_pid", this.f14388h.d(), "mb_ad_unit_id", this.f14388h.c());
        this.f14386f = (MBridgeIds) this.f14385e.a(a, com.mbridge.msdk.newreward.function.c.e.CREATE_BIDS);
        com.mbridge.msdk.newreward.function.c.c cVar2 = this.f14385e;
        cVar2.c(cVar2.a("mb_ad_unit_id", this.f14388h.c(), "command_type", com.mbridge.msdk.newreward.function.c.e.UNIT_INIT), new com.mbridge.msdk.newreward.a.b.b() { // from class: com.mbridge.msdk.newreward.a.d.1
            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(com.mbridge.msdk.foundation.c.b bVar2) {
            }

            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(Object obj) {
            }
        });
        com.mbridge.msdk.newreward.function.e.c.a().b().a(this.f14388h.e(), this.f14388h.d(), this.f14388h.c());
        this.f14385e.a((Object) a, com.mbridge.msdk.newreward.function.c.e.REQ_SETTING, new com.mbridge.msdk.newreward.a.b.b() { // from class: com.mbridge.msdk.newreward.a.d.2
            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(com.mbridge.msdk.foundation.c.b bVar2) {
            }

            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(Object obj) {
                d.this.f14384d = (com.mbridge.msdk.newreward.function.f.e) obj;
                d.this.f14387g = a;
                if (d.this.f14388h != null) {
                    d.this.f14388h.a(d.this.f14384d);
                }
                ((MBridgeDailyPlayModel) d.this.f14385e.a(a, com.mbridge.msdk.newreward.function.c.e.CREATE_DAILY)).setMaxPlayCount(d.this.f14384d.b() == null ? 0 : d.this.f14384d.b().d());
            }
        });
        Map map = this.f14387g;
        map.put("command_type", com.mbridge.msdk.newreward.function.c.e.RESTORE_DB);
        this.f14385e.c(map, new com.mbridge.msdk.newreward.a.b.b() { // from class: com.mbridge.msdk.newreward.a.d.3
            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(com.mbridge.msdk.foundation.c.b bVar2) {
            }

            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(Object obj) {
                d.this.b(obj);
            }
        });
        com.mbridge.msdk.newreward.function.c.c cVar3 = this.f14385e;
        cVar3.e(cVar3.a("controller_model", this.f14388h, "command_manager", cVar3, "adapter_manager", this));
        int a10 = af.a().a(MBridgeCommon.SharedPreference.KEY_LOADING_CAPACITY, 1);
        this.f14390j = a10;
        if (a10 <= 0) {
            this.f14390j = 1;
        }
    }

    private void b(e eVar) {
        e eVar2;
        if (eVar == null || TextUtils.isEmpty(eVar.b())) {
            return;
        }
        try {
            Deque<e> deque = this.a;
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
                com.mbridge.msdk.newreward.function.c.c cVar = this.f14385e;
                cVar.c(cVar.a("adapter_model", eVar, "queue_first_adapter_model", eVar2), com.mbridge.msdk.newreward.function.c.e.UPDATE_CAM_TOKEN_RULE);
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0189, code lost:
    
        a(r18, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_V3_CAMPAIGN_SUCCESS);
        r17.f14383c.onLoadSuccess(r17.f14386f);
        r18.c(true);
        a(r18, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_VIDEO_CAMPAIGN_SUCCESS);
        r17.f14383c.onVideoLoadSuccess(r17.f14386f);
        r18.d(true);
     */
    @Override // com.mbridge.msdk.newreward.a.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.mbridge.msdk.newreward.a.e r18, com.mbridge.msdk.newreward.a.b r19) {
        /*
            Method dump skipped, instructions count: 673
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.newreward.a.d.a(com.mbridge.msdk.newreward.a.e, com.mbridge.msdk.newreward.a.b):void");
    }

    @Override // com.mbridge.msdk.newreward.a.c
    public final e b() {
        e peek;
        Deque<e> deque = this.a;
        if (deque == null || deque.size() == 0 || (peek = this.a.peek()) == null) {
            return null;
        }
        return peek;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0080 A[Catch: Exception -> 0x00a3, TryCatch #1 {Exception -> 0x00a3, blocks: (B:17:0x0064, B:19:0x0080, B:23:0x0094), top: B:16:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8 A[Catch: Exception -> 0x00b4, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00b4, blocks: (B:3:0x0005, B:5:0x0009, B:7:0x000f, B:9:0x0021, B:11:0x0029, B:12:0x0038, B:14:0x005e, B:35:0x00a8), top: B:2:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean c(com.mbridge.msdk.newreward.a.e r11) {
        /*
            r10 = this;
            java.lang.String r0 = "error_code"
            java.lang.String r1 = "msg"
            r2 = 0
            java.util.Deque<com.mbridge.msdk.newreward.a.e> r3 = r10.a     // Catch: java.lang.Exception -> Lb4
            if (r3 == 0) goto L36
            java.lang.Object r3 = r3.peek()     // Catch: java.lang.Exception -> Lb4
            if (r3 == 0) goto L36
            java.util.Deque<com.mbridge.msdk.newreward.a.e> r3 = r10.a     // Catch: java.lang.Exception -> Lb4
            java.lang.Object r3 = r3.peek()     // Catch: java.lang.Exception -> Lb4
            com.mbridge.msdk.newreward.a.e r3 = (com.mbridge.msdk.newreward.a.e) r3     // Catch: java.lang.Exception -> Lb4
            java.lang.String r3 = r3.q()     // Catch: java.lang.Exception -> Lb4
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> Lb4
            if (r4 != 0) goto L36
            java.lang.String r4 = "-1"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> Lb4
            if (r3 == 0) goto L36
            java.util.Deque<com.mbridge.msdk.newreward.a.e> r3 = r10.a     // Catch: java.lang.Exception -> Lb4
            java.lang.Object r3 = r3.peek()     // Catch: java.lang.Exception -> Lb4
            com.mbridge.msdk.newreward.a.e r3 = (com.mbridge.msdk.newreward.a.e) r3     // Catch: java.lang.Exception -> Lb4
            long r3 = r3.o()     // Catch: java.lang.Exception -> Lb4
            goto L38
        L36:
            r3 = 0
        L38:
            com.mbridge.msdk.newreward.function.c.c r5 = r10.f14385e     // Catch: java.lang.Exception -> Lb4
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> Lb4
            java.lang.String r7 = "adapter_model"
            r6[r2] = r7     // Catch: java.lang.Exception -> Lb4
            r7 = 1
            r6[r7] = r11     // Catch: java.lang.Exception -> Lb4
            java.lang.String r8 = "last_response_empty_time"
            r9 = 2
            r6[r9] = r8     // Catch: java.lang.Exception -> Lb4
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Exception -> Lb4
            r4 = 3
            r6[r4] = r3     // Catch: java.lang.Exception -> Lb4
            java.util.Map r3 = r5.a(r6)     // Catch: java.lang.Exception -> Lb4
            com.mbridge.msdk.newreward.function.c.e r4 = com.mbridge.msdk.newreward.function.c.e.CHECK_IS_REQUEST_CONTROL     // Catch: java.lang.Exception -> Lb4
            java.lang.Object r3 = r5.b(r3, r4)     // Catch: java.lang.Exception -> Lb4
            java.util.Map r3 = (java.util.Map) r3     // Catch: java.lang.Exception -> Lb4
            if (r3 == 0) goto La6
            int r4 = r3.size()     // Catch: java.lang.Exception -> Lb4
            if (r4 <= 0) goto La6
            com.mbridge.msdk.newout.RewardVideoListener r4 = r10.f14383c     // Catch: java.lang.Exception -> La3
            com.mbridge.msdk.out.MBridgeIds r5 = new com.mbridge.msdk.out.MBridgeIds     // Catch: java.lang.Exception -> La3
            r5.<init>()     // Catch: java.lang.Exception -> La3
            java.lang.Object r6 = r3.get(r1)     // Catch: java.lang.Exception -> La3
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> La3
            r4.onVideoLoadFail(r5, r6)     // Catch: java.lang.Exception -> La3
            java.lang.Object r4 = r3.get(r0)     // Catch: java.lang.Exception -> La3
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch: java.lang.Exception -> La3
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> La3
            if (r4 != 0) goto L8a
            java.lang.Object r0 = r3.get(r0)     // Catch: java.lang.Exception -> La3
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> La3
            int r2 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> La3
        L8a:
            r0 = -1
            if (r2 != r0) goto L91
            r0 = 880018(0xd6d92, float:1.233168E-39)
            goto L94
        L91:
            r0 = 880002(0xd6d82, float:1.233145E-39)
        L94:
            java.lang.Object r1 = r3.get(r1)     // Catch: java.lang.Exception -> La3
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> La3
            com.mbridge.msdk.foundation.c.b r0 = com.mbridge.msdk.foundation.c.a.a(r2, r0, r1)     // Catch: java.lang.Exception -> La3
            r10.a(r11, r0)     // Catch: java.lang.Exception -> La3
            r2 = r7
            goto La6
        La3:
            r11 = move-exception
            r2 = r7
            goto Lb5
        La6:
            if (r2 == 0) goto Lbc
            com.mbridge.msdk.foundation.same.report.d.c r0 = com.mbridge.msdk.foundation.same.report.d.c.a()     // Catch: java.lang.Exception -> Lb4
            java.lang.String r11 = r11.z()     // Catch: java.lang.Exception -> Lb4
            r0.c(r11)     // Catch: java.lang.Exception -> Lb4
            goto Lbc
        Lb4:
            r11 = move-exception
        Lb5:
            boolean r0 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r0 == 0) goto Lbc
            r11.printStackTrace()
        Lbc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.newreward.a.d.c(com.mbridge.msdk.newreward.a.e):boolean");
    }

    private void a(e eVar, com.mbridge.msdk.newreward.function.c.e eVar2) {
        if (eVar == null) {
            return;
        }
        List<CampaignEx> a = eVar.x() != null ? eVar.x().a() : null;
        try {
            com.mbridge.msdk.newreward.function.c.c cVar = this.f14385e;
            Object[] objArr = new Object[6];
            objArr[0] = "metrics_data";
            objArr[1] = a;
            int i10 = 2;
            objArr[2] = "auto_load";
            if (!eVar.B()) {
                i10 = 1;
            }
            objArr[3] = Integer.valueOf(i10);
            objArr[4] = "cache";
            objArr[5] = 1;
            cVar.a(eVar, eVar2, cVar.a(objArr));
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    private void a(e eVar, com.mbridge.msdk.foundation.c.b bVar) {
        eVar.b(2);
        eVar.d(true);
        com.mbridge.msdk.newreward.function.c.c cVar = this.f14385e;
        cVar.a(eVar, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_FAILED, cVar.a("metrics_data", bVar));
    }

    private int a(int i10) {
        int i11 = 0;
        if (this.a.size() == 0) {
            return 0;
        }
        for (e eVar : this.a) {
            if (i10 != 1) {
                if (i10 == 2 && eVar.x().c()) {
                    i11++;
                }
            } else if (eVar.s() == 1) {
                i11++;
            }
        }
        return i11;
    }

    private void a(String str) {
        com.mbridge.msdk.newreward.b.b bVar = this.f14388h;
        if (bVar == null) {
            return;
        }
        com.mbridge.msdk.newreward.function.c.c cVar = this.f14385e;
        cVar.a(bVar, com.mbridge.msdk.newreward.function.c.e.REPORT_SHOW_FAIL, cVar.a("reason", str));
    }

    @Override // com.mbridge.msdk.newreward.a.c
    public final List<e> a() {
        ArrayList arrayList = new ArrayList();
        Deque<e> deque = this.a;
        if (deque != null && deque.size() != 0) {
            Iterator<e> it = this.a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return arrayList;
    }

    public final void a(e eVar) {
        Deque<e> deque;
        if (eVar == null || (deque = this.a) == null) {
            return;
        }
        deque.addLast(eVar);
    }
}

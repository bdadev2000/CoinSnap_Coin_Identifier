package com.mbridge.msdk.mbnative.controller;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.entity.k;
import com.mbridge.msdk.foundation.same.c;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.nativex.view.MBMediaView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.tracker.network.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class d extends com.mbridge.msdk.mbnative.controller.b {

    /* renamed from: e, reason: collision with root package name */
    private static final String f16512e = "d";

    /* renamed from: f, reason: collision with root package name */
    private static Map<String, Map<Long, Object>> f16513f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private static Map<String, Boolean> f16514g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private static Map<String, k> f16515h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    private static Map<String, Integer> f16516i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    private static Map<String, Integer> f16517j = new HashMap();

    /* renamed from: k, reason: collision with root package name */
    private static d f16518k = null;

    /* renamed from: u, reason: collision with root package name */
    private static int f16519u = -1;

    /* renamed from: v, reason: collision with root package name */
    private static int f16520v = -2;

    /* renamed from: d, reason: collision with root package name */
    protected List<Integer> f16522d;
    private j l;
    private com.mbridge.msdk.click.a m;

    /* renamed from: n, reason: collision with root package name */
    private com.mbridge.msdk.c.k f16523n;

    /* renamed from: o, reason: collision with root package name */
    private String f16524o;

    /* renamed from: q, reason: collision with root package name */
    private Map<String, Object> f16526q;

    /* renamed from: r, reason: collision with root package name */
    private List<Integer> f16527r;

    /* renamed from: s, reason: collision with root package name */
    private List<Integer> f16528s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f16529t;

    /* renamed from: w, reason: collision with root package name */
    private boolean f16530w;

    /* renamed from: x, reason: collision with root package name */
    private int f16531x;

    /* renamed from: y, reason: collision with root package name */
    private int f16532y;
    Queue<Integer> b = null;

    /* renamed from: c, reason: collision with root package name */
    Queue<Long> f16521c = null;

    /* renamed from: p, reason: collision with root package name */
    private int f16525p = 0;

    /* renamed from: z, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.e.b f16533z = new com.mbridge.msdk.foundation.same.e.b(com.mbridge.msdk.foundation.controller.c.m().c());

    /* loaded from: classes3.dex */
    public class a extends com.mbridge.msdk.mbnative.f.a.b implements com.mbridge.msdk.foundation.same.e.d {
        private int b;

        /* renamed from: c, reason: collision with root package name */
        private int f16536c;

        /* renamed from: d, reason: collision with root package name */
        private int f16537d;

        /* renamed from: e, reason: collision with root package name */
        private int f16538e;

        /* renamed from: f, reason: collision with root package name */
        private int f16539f;

        /* renamed from: i, reason: collision with root package name */
        private Runnable f16542i;

        /* renamed from: k, reason: collision with root package name */
        private com.mbridge.msdk.b.a.a f16544k;

        /* renamed from: g, reason: collision with root package name */
        private List<String> f16540g = null;

        /* renamed from: h, reason: collision with root package name */
        private boolean f16541h = false;

        /* renamed from: j, reason: collision with root package name */
        private boolean f16543j = true;

        public a(int i9) {
            this.b = i9;
        }

        public final void b(int i9) {
            this.f16537d = i9;
        }

        public final void c(int i9) {
            this.f16538e = i9;
        }

        public final void d(int i9) {
            this.f16536c = i9;
        }

        public final void a(List<String> list) {
            this.f16540g = list;
        }

        public final void b(boolean z8) {
            this.f16543j = z8;
        }

        public final void a(int i9) {
            this.f16539f = i9;
        }

        @Override // com.mbridge.msdk.mbnative.f.a.b
        public final void b(final List<Frame> list) {
            d.this.a(new Thread(new Runnable() { // from class: com.mbridge.msdk.mbnative.controller.d.a.4
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z8;
                    if (MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD && Looper.myLooper() == null) {
                        Looper.prepare();
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (!a.this.f16541h && a.this.f16542i != null) {
                        a aVar = a.this;
                        d.this.f16502a.removeCallbacks(aVar.f16542i);
                    }
                    List list2 = list;
                    if (list2 != null && list2.size() > 0) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            for (CampaignEx campaignEx : ((Frame) it.next()).getCampaigns()) {
                                d dVar = d.this;
                                dVar.a(dVar.f16529t, campaignEx);
                            }
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put(Long.valueOf(System.currentTimeMillis()), list);
                        if (d.f16513f.containsKey("1_" + a.this.unitId)) {
                            d.f16513f.remove("1_" + a.this.unitId);
                        }
                        d.f16513f.put("1_" + a.this.unitId, hashMap);
                    }
                    if (Looper.myLooper() != null && z8) {
                        Looper.loop();
                    }
                }
            }));
        }

        public final void a(com.mbridge.msdk.b.a.a aVar) {
            this.f16544k = aVar;
        }

        @Override // com.mbridge.msdk.foundation.same.e.d
        public final void a(boolean z8) {
            this.f16541h = z8;
        }

        @Override // com.mbridge.msdk.mbnative.f.a.b
        public final void a(List<h> list, final CampaignUnit campaignUnit) {
            d.this.f16530w = true;
            d.this.a(true, this.f16544k, (String) null);
            d.this.a(new Thread(new Runnable() { // from class: com.mbridge.msdk.mbnative.controller.d.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z8;
                    int i9;
                    int i10 = 1;
                    if (MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD && Looper.myLooper() == null) {
                        Looper.prepare();
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (a.this.f16542i != null) {
                        a aVar = a.this;
                        d.this.f16502a.removeCallbacks(aVar.f16542i);
                    }
                    if (com.mbridge.msdk.e.b.a()) {
                        d dVar = d.this;
                    }
                    if (d.f16513f.containsKey("0_" + a.this.unitId)) {
                        d.f16513f.remove("0_" + a.this.unitId);
                    }
                    if (a.this.f16539f > 0) {
                        if (campaignUnit.ads.size() <= a.this.f16539f) {
                            a.this.f16536c = campaignUnit.ads.size();
                        } else {
                            a aVar2 = a.this;
                            aVar2.f16536c = aVar2.f16539f;
                        }
                    } else if (a.this.f16539f == -1) {
                        a.this.f16536c = 0;
                    } else if (a.this.f16539f == -3) {
                        a.this.f16536c = campaignUnit.ads.size();
                    } else if (a.this.f16539f == -2) {
                        if (campaignUnit.getTemplate() == 3) {
                            if (a.this.f16538e != 0) {
                                a aVar3 = a.this;
                                aVar3.f16536c = aVar3.f16538e;
                            }
                        } else if (a.this.f16537d != 0) {
                            a aVar4 = a.this;
                            aVar4.f16536c = aVar4.f16537d;
                        }
                        if (a.this.f16536c <= 0) {
                            a.this.f16536c = ((Integer) d.f16516i.get(a.this.unitId)).intValue();
                        }
                    }
                    if (campaignUnit.ads.size() < a.this.f16536c) {
                        a.this.f16536c = campaignUnit.ads.size();
                    }
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i11 = 0; i11 < campaignUnit.ads.size(); i11++) {
                        CampaignEx campaignEx = campaignUnit.ads.get(i11);
                        campaignEx.setCampaignUnitId(a.this.unitId);
                        boolean c9 = ai.c(com.mbridge.msdk.foundation.controller.c.m().c(), campaignEx.getPackageName());
                        d dVar2 = d.this;
                        com.mbridge.msdk.foundation.controller.c.m().c();
                        if (arrayList.size() < a.this.f16536c && campaignEx.getOfferType() != 99) {
                            if (ai.c(campaignEx)) {
                                if (c9) {
                                    i9 = 1;
                                } else {
                                    i9 = 2;
                                }
                                campaignEx.setRtinsType(i9);
                            }
                            if (com.mbridge.msdk.foundation.same.c.a(com.mbridge.msdk.foundation.controller.c.m().c(), campaignEx)) {
                                arrayList.add(campaignEx);
                                if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                                    arrayList2.add(campaignEx);
                                }
                            } else {
                                ai.a(a.this.unitId, campaignEx, com.mbridge.msdk.foundation.same.a.f15696x);
                            }
                            a.a(a.this, campaignEx, null, null);
                        }
                        d dVar3 = d.this;
                        dVar3.a(dVar3.f16529t, campaignEx);
                    }
                    a aVar5 = a.this;
                    d.a(d.this, arrayList2, aVar5.unitId);
                    if (campaignUnit.getAds().get(0) != null) {
                        i10 = campaignUnit.getAds().get(0).getType();
                    }
                    com.mbridge.msdk.mbnative.a.b<String, List<Campaign>> a6 = com.mbridge.msdk.mbnative.a.c.a(i10);
                    if (a6 != null) {
                        a6.a((com.mbridge.msdk.mbnative.a.b<String, List<Campaign>>) a.this.unitId, (String) arrayList);
                    }
                    d.a(a.this.b, a.this.unitId);
                    if (Looper.myLooper() != null && z8) {
                        Looper.loop();
                    }
                    if (campaignUnit.getAds().get(0) != null) {
                        com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.m().c(), campaignUnit.getAds().get(0).getMaitve(), campaignUnit.getAds().get(0).getMaitve_src());
                    }
                }
            }));
        }

        @Override // com.mbridge.msdk.mbnative.f.a.b
        public final void a(final int i9, final String str) {
            d.this.a(new Thread(new Runnable() { // from class: com.mbridge.msdk.mbnative.controller.d.a.3
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z8;
                    if (MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD && Looper.myLooper() == null) {
                        Looper.prepare();
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (!a.this.f16541h) {
                        if (a.this.f16542i != null) {
                            a aVar = a.this;
                            d.this.f16502a.removeCallbacks(aVar.f16542i);
                        }
                        if (a.this.b() == 1 || a.this.f16543j) {
                            a aVar2 = a.this;
                            d dVar = d.this;
                            String str2 = str;
                            int b = aVar2.b();
                            a aVar3 = a.this;
                            dVar.a(str2, b, aVar3.unitId, aVar3.placementId, aVar3.f16544k);
                        }
                    } else if (a.this.f16543j) {
                        a aVar4 = a.this;
                        d dVar2 = d.this;
                        String str3 = str;
                        int b8 = aVar4.b();
                        a aVar5 = a.this;
                        dVar2.a(str3, b8, aVar5.unitId, aVar5.placementId, aVar5.f16544k);
                    }
                    if (i9 == -1) {
                        d.b(a.this.b, a.this.unitId);
                    }
                    if (Looper.myLooper() != null && z8) {
                        Looper.loop();
                    }
                }
            }));
        }

        public final void a(Runnable runnable) {
            this.f16542i = runnable;
        }

        public static /* synthetic */ void a(a aVar, final CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.d.b bVar, final com.mbridge.msdk.foundation.same.report.d.a.a aVar2) {
            try {
                final Context c9 = com.mbridge.msdk.foundation.controller.c.m().c();
                com.mbridge.msdk.foundation.same.c.a(campaignEx, c9, bVar, new c.a() { // from class: com.mbridge.msdk.mbnative.controller.d.a.2
                    @Override // com.mbridge.msdk.foundation.same.c.a
                    public final void a(String str, com.mbridge.msdk.foundation.same.report.d.b bVar2) {
                        com.mbridge.msdk.mbnative.e.a.a(str, bVar2, campaignEx, c9, aVar2);
                    }
                });
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    e4.printStackTrace();
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Runnable {
        private int b;

        /* renamed from: c, reason: collision with root package name */
        private com.mbridge.msdk.foundation.same.e.d f16553c;

        /* renamed from: d, reason: collision with root package name */
        private int f16554d;

        /* renamed from: e, reason: collision with root package name */
        private String f16555e;

        /* renamed from: f, reason: collision with root package name */
        private String f16556f;

        /* renamed from: g, reason: collision with root package name */
        private com.mbridge.msdk.b.a.a f16557g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f16558h = false;

        public b(int i9, com.mbridge.msdk.foundation.same.e.d dVar, int i10, String str, String str2) {
            this.b = i9;
            this.f16553c = dVar;
            this.f16554d = i10;
            this.f16555e = str;
            this.f16556f = str2;
        }

        public final void a(boolean z8) {
            this.f16558h = z8;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f16553c.a(true);
            int i9 = this.b;
            if (i9 != 1) {
                if (i9 == 2) {
                    d.this.a("REQUEST_TIMEOUT", this.f16554d, this.f16555e, this.f16556f, this.f16557g);
                }
            } else {
                d.this.f16530w = true;
                if (this.f16558h || this.f16554d == 1) {
                    d.this.a("REQUEST_TIMEOUT", this.f16554d, this.f16555e, this.f16556f, this.f16557g);
                }
            }
        }

        public final void a(com.mbridge.msdk.b.a.a aVar) {
            this.f16557g = aVar;
        }

        public final void a(String str) {
            this.f16555e = str;
        }
    }

    public d() {
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        this.f16502a = new Handler() { // from class: com.mbridge.msdk.mbnative.controller.d.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
            }
        };
    }

    public static /* synthetic */ void a(d dVar, List list, String str) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    try {
                        int i9 = MBMediaView.f16787a0;
                        Object invoke = com.mbridge.msdk.videocommon.download.b.class.getMethod("getInstance", null).invoke(null, null);
                        if (invoke != null) {
                            com.mbridge.msdk.videocommon.download.b.class.getMethod("createUnitCache", Context.class, String.class, CopyOnWriteArrayList.class, Integer.TYPE, com.mbridge.msdk.videocommon.listener.a.class).invoke(invoke, com.mbridge.msdk.foundation.controller.c.m().c(), str, new CopyOnWriteArrayList(list), 1, null);
                            com.mbridge.msdk.videocommon.download.b.class.getMethod("load", String.class).invoke(invoke, str);
                        }
                    } catch (Exception unused) {
                        ad.b(f16512e, "please import the videocommon aar");
                    }
                }
            } catch (Exception e4) {
                ad.b(f16512e, com.mbridge.msdk.mbnative.b.a.a(e4));
            }
        }
    }

    public static void b(int i9, String str) {
        if (f16515h.containsKey(str)) {
            k kVar = f16515h.get(str);
            if (i9 == 1) {
                kVar.a(0);
            } else if (i9 == 2) {
                kVar.b(0);
            }
            f16515h.put(str, kVar);
        }
    }

    public static Map<String, k> c() {
        return f16515h;
    }

    public static Map<String, Integer> d() {
        return f16516i;
    }

    public static Map<String, Integer> e() {
        return f16517j;
    }

    public static Map<String, Boolean> b() {
        return f16514g;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x02ec A[Catch: Exception -> 0x006a, TryCatch #2 {Exception -> 0x006a, blocks: (B:3:0x001d, B:7:0x0029, B:9:0x004f, B:12:0x006d, B:15:0x0074, B:17:0x007a, B:18:0x0086, B:20:0x008a, B:21:0x009d, B:23:0x00a3, B:24:0x00af, B:26:0x00b5, B:27:0x00bd, B:29:0x00c5, B:31:0x00d3, B:33:0x00ff, B:35:0x0105, B:37:0x0119, B:38:0x0120, B:40:0x0131, B:44:0x0139, B:55:0x016a, B:57:0x017b, B:59:0x0181, B:60:0x018b, B:62:0x01a1, B:64:0x01a7, B:66:0x01af, B:67:0x01bd, B:69:0x01c1, B:70:0x01c8, B:72:0x01e1, B:73:0x01e7, B:76:0x01f1, B:78:0x01f9, B:82:0x020d, B:84:0x0229, B:86:0x022f, B:87:0x023c, B:89:0x0242, B:91:0x024e, B:93:0x0252, B:95:0x0258, B:96:0x0265, B:98:0x026b, B:100:0x0282, B:115:0x02db, B:117:0x02ec, B:118:0x02f5, B:161:0x03f3, B:169:0x03fd, B:174:0x0163, B:175:0x009a, B:120:0x02fe, B:122:0x0314, B:124:0x032d, B:125:0x0335, B:127:0x033b, B:128:0x033d, B:130:0x034b, B:131:0x0351, B:133:0x035b, B:135:0x0361, B:137:0x036e, B:139:0x0374, B:141:0x037e, B:142:0x0384, B:144:0x038a, B:146:0x039a, B:148:0x039d, B:151:0x03a0, B:153:0x03a6, B:46:0x0143, B:48:0x0149, B:50:0x0158, B:51:0x015a, B:53:0x0160), top: B:2:0x001d, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0314 A[Catch: all -> 0x03f3, TryCatch #0 {all -> 0x03f3, blocks: (B:120:0x02fe, B:122:0x0314, B:124:0x032d, B:125:0x0335, B:127:0x033b, B:128:0x033d, B:130:0x034b, B:131:0x0351, B:133:0x035b, B:135:0x0361, B:137:0x036e, B:139:0x0374, B:141:0x037e, B:142:0x0384, B:144:0x038a, B:146:0x039a, B:148:0x039d, B:151:0x03a0, B:153:0x03a6), top: B:119:0x02fe, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03fd A[Catch: Exception -> 0x006a, TRY_LEAVE, TryCatch #2 {Exception -> 0x006a, blocks: (B:3:0x001d, B:7:0x0029, B:9:0x004f, B:12:0x006d, B:15:0x0074, B:17:0x007a, B:18:0x0086, B:20:0x008a, B:21:0x009d, B:23:0x00a3, B:24:0x00af, B:26:0x00b5, B:27:0x00bd, B:29:0x00c5, B:31:0x00d3, B:33:0x00ff, B:35:0x0105, B:37:0x0119, B:38:0x0120, B:40:0x0131, B:44:0x0139, B:55:0x016a, B:57:0x017b, B:59:0x0181, B:60:0x018b, B:62:0x01a1, B:64:0x01a7, B:66:0x01af, B:67:0x01bd, B:69:0x01c1, B:70:0x01c8, B:72:0x01e1, B:73:0x01e7, B:76:0x01f1, B:78:0x01f9, B:82:0x020d, B:84:0x0229, B:86:0x022f, B:87:0x023c, B:89:0x0242, B:91:0x024e, B:93:0x0252, B:95:0x0258, B:96:0x0265, B:98:0x026b, B:100:0x0282, B:115:0x02db, B:117:0x02ec, B:118:0x02f5, B:161:0x03f3, B:169:0x03fd, B:174:0x0163, B:175:0x009a, B:120:0x02fe, B:122:0x0314, B:124:0x032d, B:125:0x0335, B:127:0x033b, B:128:0x033d, B:130:0x034b, B:131:0x0351, B:133:0x035b, B:135:0x0361, B:137:0x036e, B:139:0x0374, B:141:0x037e, B:142:0x0384, B:144:0x038a, B:146:0x039a, B:148:0x039d, B:151:0x03a0, B:153:0x03a6, B:46:0x0143, B:48:0x0149, B:50:0x0158, B:51:0x015a, B:53:0x0160), top: B:2:0x001d, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.util.Map<java.lang.String, java.lang.Object> r22, int r23) {
        /*
            Method dump skipped, instructions count: 1037
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbnative.controller.d.a(java.util.Map, int):void");
    }

    private int a(String str) {
        if (str == null) {
            return 0;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() > 0) {
                for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                    JSONObject jSONObject = (JSONObject) jSONArray.opt(i9);
                    if (2 == jSONObject.optInt("id", 0)) {
                        return jSONObject.optInt("ad_num");
                    }
                }
            }
        } catch (Exception e4) {
            ad.b(f16512e, com.mbridge.msdk.mbnative.b.a.a(e4));
        }
        return 0;
    }

    private void a(int i9, com.mbridge.msdk.c.k kVar, String str, String str2, com.mbridge.msdk.b.a.a aVar) {
        Queue<Integer> queue = this.b;
        if (queue == null || queue.size() <= 0) {
            return;
        }
        try {
            int intValue = this.b.poll().intValue();
            long j7 = MBridgeConstans.REQUEST_TIME_OUT;
            Queue<Long> queue2 = this.f16521c;
            if (queue2 != null && queue2.size() > 0) {
                j7 = this.f16521c.poll().longValue();
            }
            ad.c(f16512e, "preload start queue adsource = " + intValue);
            a(intValue, j7, str, str2, this.f16526q, i9, kVar, aVar);
        } catch (Throwable unused) {
            ad.b(f16512e, "queue poll exception");
        }
    }

    private void a(int i9, long j7, String str, String str2, Map<String, Object> map, int i10, com.mbridge.msdk.c.k kVar, com.mbridge.msdk.b.a.a aVar) {
        com.mbridge.msdk.mbnative.a.b<String, List<Campaign>> a6;
        if (i9 != 1 && (a6 = com.mbridge.msdk.mbnative.a.c.a(i9)) != null) {
            List<Campaign> b8 = a6.b(str, this.f16532y);
            if (b8 != null && b8.size() > 0) {
                a(true, aVar, (String) null);
                return;
            }
        }
        if (i9 == 1) {
            a(i9, j7, i10, kVar, str, str2, true, aVar);
        } else if (i9 != 2) {
            a(i9, j7, i10, kVar, str, str2, aVar, false);
        } else {
            a(2, j7, i10, kVar, str, str2, aVar, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02a4 A[Catch: Exception -> 0x00a0, TryCatch #1 {Exception -> 0x00a0, blocks: (B:3:0x001e, B:6:0x006d, B:8:0x0073, B:10:0x007b, B:12:0x0083, B:14:0x008b, B:16:0x0095, B:17:0x00a3, B:19:0x00ad, B:20:0x00b7, B:22:0x00c1, B:23:0x00cb, B:25:0x00d1, B:27:0x00da, B:29:0x00f3, B:30:0x00fa, B:32:0x0100, B:33:0x0105, B:35:0x012c, B:36:0x0131, B:42:0x014c, B:45:0x0154, B:47:0x015c, B:49:0x0162, B:52:0x0167, B:54:0x016b, B:59:0x017f, B:61:0x0187, B:63:0x018d, B:67:0x0198, B:68:0x01aa, B:70:0x01ae, B:71:0x01c4, B:73:0x01cc, B:75:0x01db, B:77:0x01ec, B:81:0x01fd, B:83:0x0203, B:86:0x020b, B:88:0x0215, B:91:0x021b, B:96:0x025a, B:97:0x0267, B:99:0x027b, B:101:0x02a4, B:102:0x02aa, B:104:0x02b2, B:106:0x02c4, B:107:0x02cd, B:109:0x02d5, B:115:0x02e5, B:116:0x02f5, B:121:0x0302, B:122:0x032e, B:124:0x0369, B:125:0x036e, B:127:0x0378, B:129:0x0382, B:130:0x03a2, B:132:0x03ac, B:134:0x03b6, B:135:0x03d6, B:138:0x040a, B:140:0x0439, B:141:0x046b, B:145:0x0452, B:146:0x0407, B:148:0x031a, B:150:0x02ea, B:151:0x02ef, B:156:0x0228, B:158:0x022e, B:167:0x0245, B:179:0x0270, B:185:0x0471), top: B:2:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02b2 A[Catch: Exception -> 0x00a0, TryCatch #1 {Exception -> 0x00a0, blocks: (B:3:0x001e, B:6:0x006d, B:8:0x0073, B:10:0x007b, B:12:0x0083, B:14:0x008b, B:16:0x0095, B:17:0x00a3, B:19:0x00ad, B:20:0x00b7, B:22:0x00c1, B:23:0x00cb, B:25:0x00d1, B:27:0x00da, B:29:0x00f3, B:30:0x00fa, B:32:0x0100, B:33:0x0105, B:35:0x012c, B:36:0x0131, B:42:0x014c, B:45:0x0154, B:47:0x015c, B:49:0x0162, B:52:0x0167, B:54:0x016b, B:59:0x017f, B:61:0x0187, B:63:0x018d, B:67:0x0198, B:68:0x01aa, B:70:0x01ae, B:71:0x01c4, B:73:0x01cc, B:75:0x01db, B:77:0x01ec, B:81:0x01fd, B:83:0x0203, B:86:0x020b, B:88:0x0215, B:91:0x021b, B:96:0x025a, B:97:0x0267, B:99:0x027b, B:101:0x02a4, B:102:0x02aa, B:104:0x02b2, B:106:0x02c4, B:107:0x02cd, B:109:0x02d5, B:115:0x02e5, B:116:0x02f5, B:121:0x0302, B:122:0x032e, B:124:0x0369, B:125:0x036e, B:127:0x0378, B:129:0x0382, B:130:0x03a2, B:132:0x03ac, B:134:0x03b6, B:135:0x03d6, B:138:0x040a, B:140:0x0439, B:141:0x046b, B:145:0x0452, B:146:0x0407, B:148:0x031a, B:150:0x02ea, B:151:0x02ef, B:156:0x0228, B:158:0x022e, B:167:0x0245, B:179:0x0270, B:185:0x0471), top: B:2:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02d5 A[Catch: Exception -> 0x00a0, TryCatch #1 {Exception -> 0x00a0, blocks: (B:3:0x001e, B:6:0x006d, B:8:0x0073, B:10:0x007b, B:12:0x0083, B:14:0x008b, B:16:0x0095, B:17:0x00a3, B:19:0x00ad, B:20:0x00b7, B:22:0x00c1, B:23:0x00cb, B:25:0x00d1, B:27:0x00da, B:29:0x00f3, B:30:0x00fa, B:32:0x0100, B:33:0x0105, B:35:0x012c, B:36:0x0131, B:42:0x014c, B:45:0x0154, B:47:0x015c, B:49:0x0162, B:52:0x0167, B:54:0x016b, B:59:0x017f, B:61:0x0187, B:63:0x018d, B:67:0x0198, B:68:0x01aa, B:70:0x01ae, B:71:0x01c4, B:73:0x01cc, B:75:0x01db, B:77:0x01ec, B:81:0x01fd, B:83:0x0203, B:86:0x020b, B:88:0x0215, B:91:0x021b, B:96:0x025a, B:97:0x0267, B:99:0x027b, B:101:0x02a4, B:102:0x02aa, B:104:0x02b2, B:106:0x02c4, B:107:0x02cd, B:109:0x02d5, B:115:0x02e5, B:116:0x02f5, B:121:0x0302, B:122:0x032e, B:124:0x0369, B:125:0x036e, B:127:0x0378, B:129:0x0382, B:130:0x03a2, B:132:0x03ac, B:134:0x03b6, B:135:0x03d6, B:138:0x040a, B:140:0x0439, B:141:0x046b, B:145:0x0452, B:146:0x0407, B:148:0x031a, B:150:0x02ea, B:151:0x02ef, B:156:0x0228, B:158:0x022e, B:167:0x0245, B:179:0x0270, B:185:0x0471), top: B:2:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0369 A[Catch: Exception -> 0x00a0, TryCatch #1 {Exception -> 0x00a0, blocks: (B:3:0x001e, B:6:0x006d, B:8:0x0073, B:10:0x007b, B:12:0x0083, B:14:0x008b, B:16:0x0095, B:17:0x00a3, B:19:0x00ad, B:20:0x00b7, B:22:0x00c1, B:23:0x00cb, B:25:0x00d1, B:27:0x00da, B:29:0x00f3, B:30:0x00fa, B:32:0x0100, B:33:0x0105, B:35:0x012c, B:36:0x0131, B:42:0x014c, B:45:0x0154, B:47:0x015c, B:49:0x0162, B:52:0x0167, B:54:0x016b, B:59:0x017f, B:61:0x0187, B:63:0x018d, B:67:0x0198, B:68:0x01aa, B:70:0x01ae, B:71:0x01c4, B:73:0x01cc, B:75:0x01db, B:77:0x01ec, B:81:0x01fd, B:83:0x0203, B:86:0x020b, B:88:0x0215, B:91:0x021b, B:96:0x025a, B:97:0x0267, B:99:0x027b, B:101:0x02a4, B:102:0x02aa, B:104:0x02b2, B:106:0x02c4, B:107:0x02cd, B:109:0x02d5, B:115:0x02e5, B:116:0x02f5, B:121:0x0302, B:122:0x032e, B:124:0x0369, B:125:0x036e, B:127:0x0378, B:129:0x0382, B:130:0x03a2, B:132:0x03ac, B:134:0x03b6, B:135:0x03d6, B:138:0x040a, B:140:0x0439, B:141:0x046b, B:145:0x0452, B:146:0x0407, B:148:0x031a, B:150:0x02ea, B:151:0x02ef, B:156:0x0228, B:158:0x022e, B:167:0x0245, B:179:0x0270, B:185:0x0471), top: B:2:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0378 A[Catch: Exception -> 0x00a0, TryCatch #1 {Exception -> 0x00a0, blocks: (B:3:0x001e, B:6:0x006d, B:8:0x0073, B:10:0x007b, B:12:0x0083, B:14:0x008b, B:16:0x0095, B:17:0x00a3, B:19:0x00ad, B:20:0x00b7, B:22:0x00c1, B:23:0x00cb, B:25:0x00d1, B:27:0x00da, B:29:0x00f3, B:30:0x00fa, B:32:0x0100, B:33:0x0105, B:35:0x012c, B:36:0x0131, B:42:0x014c, B:45:0x0154, B:47:0x015c, B:49:0x0162, B:52:0x0167, B:54:0x016b, B:59:0x017f, B:61:0x0187, B:63:0x018d, B:67:0x0198, B:68:0x01aa, B:70:0x01ae, B:71:0x01c4, B:73:0x01cc, B:75:0x01db, B:77:0x01ec, B:81:0x01fd, B:83:0x0203, B:86:0x020b, B:88:0x0215, B:91:0x021b, B:96:0x025a, B:97:0x0267, B:99:0x027b, B:101:0x02a4, B:102:0x02aa, B:104:0x02b2, B:106:0x02c4, B:107:0x02cd, B:109:0x02d5, B:115:0x02e5, B:116:0x02f5, B:121:0x0302, B:122:0x032e, B:124:0x0369, B:125:0x036e, B:127:0x0378, B:129:0x0382, B:130:0x03a2, B:132:0x03ac, B:134:0x03b6, B:135:0x03d6, B:138:0x040a, B:140:0x0439, B:141:0x046b, B:145:0x0452, B:146:0x0407, B:148:0x031a, B:150:0x02ea, B:151:0x02ef, B:156:0x0228, B:158:0x022e, B:167:0x0245, B:179:0x0270, B:185:0x0471), top: B:2:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03ac A[Catch: Exception -> 0x00a0, TryCatch #1 {Exception -> 0x00a0, blocks: (B:3:0x001e, B:6:0x006d, B:8:0x0073, B:10:0x007b, B:12:0x0083, B:14:0x008b, B:16:0x0095, B:17:0x00a3, B:19:0x00ad, B:20:0x00b7, B:22:0x00c1, B:23:0x00cb, B:25:0x00d1, B:27:0x00da, B:29:0x00f3, B:30:0x00fa, B:32:0x0100, B:33:0x0105, B:35:0x012c, B:36:0x0131, B:42:0x014c, B:45:0x0154, B:47:0x015c, B:49:0x0162, B:52:0x0167, B:54:0x016b, B:59:0x017f, B:61:0x0187, B:63:0x018d, B:67:0x0198, B:68:0x01aa, B:70:0x01ae, B:71:0x01c4, B:73:0x01cc, B:75:0x01db, B:77:0x01ec, B:81:0x01fd, B:83:0x0203, B:86:0x020b, B:88:0x0215, B:91:0x021b, B:96:0x025a, B:97:0x0267, B:99:0x027b, B:101:0x02a4, B:102:0x02aa, B:104:0x02b2, B:106:0x02c4, B:107:0x02cd, B:109:0x02d5, B:115:0x02e5, B:116:0x02f5, B:121:0x0302, B:122:0x032e, B:124:0x0369, B:125:0x036e, B:127:0x0378, B:129:0x0382, B:130:0x03a2, B:132:0x03ac, B:134:0x03b6, B:135:0x03d6, B:138:0x040a, B:140:0x0439, B:141:0x046b, B:145:0x0452, B:146:0x0407, B:148:0x031a, B:150:0x02ea, B:151:0x02ef, B:156:0x0228, B:158:0x022e, B:167:0x0245, B:179:0x0270, B:185:0x0471), top: B:2:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0405 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0439 A[Catch: Exception -> 0x00a0, TryCatch #1 {Exception -> 0x00a0, blocks: (B:3:0x001e, B:6:0x006d, B:8:0x0073, B:10:0x007b, B:12:0x0083, B:14:0x008b, B:16:0x0095, B:17:0x00a3, B:19:0x00ad, B:20:0x00b7, B:22:0x00c1, B:23:0x00cb, B:25:0x00d1, B:27:0x00da, B:29:0x00f3, B:30:0x00fa, B:32:0x0100, B:33:0x0105, B:35:0x012c, B:36:0x0131, B:42:0x014c, B:45:0x0154, B:47:0x015c, B:49:0x0162, B:52:0x0167, B:54:0x016b, B:59:0x017f, B:61:0x0187, B:63:0x018d, B:67:0x0198, B:68:0x01aa, B:70:0x01ae, B:71:0x01c4, B:73:0x01cc, B:75:0x01db, B:77:0x01ec, B:81:0x01fd, B:83:0x0203, B:86:0x020b, B:88:0x0215, B:91:0x021b, B:96:0x025a, B:97:0x0267, B:99:0x027b, B:101:0x02a4, B:102:0x02aa, B:104:0x02b2, B:106:0x02c4, B:107:0x02cd, B:109:0x02d5, B:115:0x02e5, B:116:0x02f5, B:121:0x0302, B:122:0x032e, B:124:0x0369, B:125:0x036e, B:127:0x0378, B:129:0x0382, B:130:0x03a2, B:132:0x03ac, B:134:0x03b6, B:135:0x03d6, B:138:0x040a, B:140:0x0439, B:141:0x046b, B:145:0x0452, B:146:0x0407, B:148:0x031a, B:150:0x02ea, B:151:0x02ef, B:156:0x0228, B:158:0x022e, B:167:0x0245, B:179:0x0270, B:185:0x0471), top: B:2:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x031a A[Catch: Exception -> 0x00a0, TryCatch #1 {Exception -> 0x00a0, blocks: (B:3:0x001e, B:6:0x006d, B:8:0x0073, B:10:0x007b, B:12:0x0083, B:14:0x008b, B:16:0x0095, B:17:0x00a3, B:19:0x00ad, B:20:0x00b7, B:22:0x00c1, B:23:0x00cb, B:25:0x00d1, B:27:0x00da, B:29:0x00f3, B:30:0x00fa, B:32:0x0100, B:33:0x0105, B:35:0x012c, B:36:0x0131, B:42:0x014c, B:45:0x0154, B:47:0x015c, B:49:0x0162, B:52:0x0167, B:54:0x016b, B:59:0x017f, B:61:0x0187, B:63:0x018d, B:67:0x0198, B:68:0x01aa, B:70:0x01ae, B:71:0x01c4, B:73:0x01cc, B:75:0x01db, B:77:0x01ec, B:81:0x01fd, B:83:0x0203, B:86:0x020b, B:88:0x0215, B:91:0x021b, B:96:0x025a, B:97:0x0267, B:99:0x027b, B:101:0x02a4, B:102:0x02aa, B:104:0x02b2, B:106:0x02c4, B:107:0x02cd, B:109:0x02d5, B:115:0x02e5, B:116:0x02f5, B:121:0x0302, B:122:0x032e, B:124:0x0369, B:125:0x036e, B:127:0x0378, B:129:0x0382, B:130:0x03a2, B:132:0x03ac, B:134:0x03b6, B:135:0x03d6, B:138:0x040a, B:140:0x0439, B:141:0x046b, B:145:0x0452, B:146:0x0407, B:148:0x031a, B:150:0x02ea, B:151:0x02ef, B:156:0x0228, B:158:0x022e, B:167:0x0245, B:179:0x0270, B:185:0x0471), top: B:2:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0317  */
    @Override // com.mbridge.msdk.mbnative.controller.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(int r26, long r27, int r29, com.mbridge.msdk.c.k r30, java.lang.String r31, java.lang.String r32, com.mbridge.msdk.b.a.a r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 1170
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbnative.controller.d.a(int, long, int, com.mbridge.msdk.c.k, java.lang.String, java.lang.String, com.mbridge.msdk.b.a.a, boolean):void");
    }

    public static void a(int i9, String str) {
        k kVar;
        if (f16515h.containsKey(str)) {
            kVar = f16515h.get(str);
        } else {
            kVar = new k();
        }
        int intValue = f16516i.get(str).intValue();
        int intValue2 = f16517j.containsKey(str) ? f16517j.get(str).intValue() : 1;
        if (i9 == 1) {
            int a6 = kVar.a() + intValue;
            kVar.a(a6 <= intValue2 ? a6 : 0);
        } else if (i9 == 2) {
            int b8 = kVar.b() + intValue;
            kVar.b(b8 <= intValue2 ? b8 : 0);
        }
        f16515h.put(str, kVar);
    }

    public final void a(String str, int i9, String str2, String str3, com.mbridge.msdk.b.a.a aVar) {
        Log.e(f16512e, str);
        try {
            Queue<Integer> queue = this.b;
            if (queue != null) {
                if (queue.size() > 0) {
                }
                a(false, aVar, str);
            }
            if (this.b != null) {
                a(i9, this.f16523n, str2, str3, aVar);
                return;
            }
            a(false, aVar, str);
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                e4.printStackTrace();
            }
        }
    }

    public static Map<String, Map<Long, Object>> a() {
        return f16513f;
    }

    public final void a(boolean z8, com.mbridge.msdk.b.a.a aVar, String str) {
        if (z8) {
            if (aVar == null || aVar.a()) {
                return;
            }
            aVar.a(true);
            aVar.onPreloadSucceed();
            return;
        }
        if (aVar == null || aVar.a()) {
            return;
        }
        aVar.a(true);
        aVar.onPreloadFaild(str);
    }

    public final void a(boolean z8, Campaign campaign) {
        if (campaign == null) {
            return;
        }
        if (z8 && campaign.getIconDrawable() == null) {
            campaign.loadIconUrlAsyncWithBlock(null);
        }
        if (z8 && campaign.getBigDrawable() == null) {
            campaign.loadImageUrlAsyncWithBlock(null);
        }
    }

    public final void a(Thread thread) {
        if (!MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD) {
            thread.run();
        } else {
            thread.start();
        }
    }
}

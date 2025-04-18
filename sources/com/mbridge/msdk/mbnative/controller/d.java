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

/* loaded from: classes4.dex */
public class d extends com.mbridge.msdk.mbnative.controller.b {

    /* renamed from: e, reason: collision with root package name */
    private static final String f14007e = "d";

    /* renamed from: f, reason: collision with root package name */
    private static Map<String, Map<Long, Object>> f14008f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private static Map<String, Boolean> f14009g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private static Map<String, k> f14010h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    private static Map<String, Integer> f14011i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    private static Map<String, Integer> f14012j = new HashMap();

    /* renamed from: k, reason: collision with root package name */
    private static d f14013k = null;
    private static int u = -1;

    /* renamed from: v, reason: collision with root package name */
    private static int f14014v = -2;

    /* renamed from: d, reason: collision with root package name */
    protected List<Integer> f14017d;

    /* renamed from: l, reason: collision with root package name */
    private j f14018l;

    /* renamed from: m, reason: collision with root package name */
    private com.mbridge.msdk.click.a f14019m;

    /* renamed from: n, reason: collision with root package name */
    private com.mbridge.msdk.c.k f14020n;

    /* renamed from: o, reason: collision with root package name */
    private String f14021o;

    /* renamed from: q, reason: collision with root package name */
    private Map<String, Object> f14023q;

    /* renamed from: r, reason: collision with root package name */
    private List<Integer> f14024r;

    /* renamed from: s, reason: collision with root package name */
    private List<Integer> f14025s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f14026t;

    /* renamed from: w, reason: collision with root package name */
    private boolean f14027w;

    /* renamed from: x, reason: collision with root package name */
    private int f14028x;

    /* renamed from: y, reason: collision with root package name */
    private int f14029y;

    /* renamed from: b, reason: collision with root package name */
    Queue<Integer> f14015b = null;

    /* renamed from: c, reason: collision with root package name */
    Queue<Long> f14016c = null;

    /* renamed from: p, reason: collision with root package name */
    private int f14022p = 0;

    /* renamed from: z, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.e.b f14030z = new com.mbridge.msdk.foundation.same.e.b(com.mbridge.msdk.foundation.controller.c.m().c());

    /* loaded from: classes4.dex */
    public class a extends com.mbridge.msdk.mbnative.f.a.b implements com.mbridge.msdk.foundation.same.e.d {

        /* renamed from: b, reason: collision with root package name */
        private int f14031b;

        /* renamed from: c, reason: collision with root package name */
        private int f14032c;

        /* renamed from: d, reason: collision with root package name */
        private int f14033d;

        /* renamed from: e, reason: collision with root package name */
        private int f14034e;

        /* renamed from: f, reason: collision with root package name */
        private int f14035f;

        /* renamed from: i, reason: collision with root package name */
        private Runnable f14038i;

        /* renamed from: k, reason: collision with root package name */
        private com.mbridge.msdk.b.a.a f14040k;

        /* renamed from: g, reason: collision with root package name */
        private List<String> f14036g = null;

        /* renamed from: h, reason: collision with root package name */
        private boolean f14037h = false;

        /* renamed from: j, reason: collision with root package name */
        private boolean f14039j = true;

        public a(int i10) {
            this.f14031b = i10;
        }

        public final void b(int i10) {
            this.f14033d = i10;
        }

        public final void c(int i10) {
            this.f14034e = i10;
        }

        public final void d(int i10) {
            this.f14032c = i10;
        }

        public final void a(List<String> list) {
            this.f14036g = list;
        }

        public final void b(boolean z10) {
            this.f14039j = z10;
        }

        public final void a(int i10) {
            this.f14035f = i10;
        }

        @Override // com.mbridge.msdk.mbnative.f.a.b
        public final void b(final List<Frame> list) {
            d.this.a(new Thread(new Runnable() { // from class: com.mbridge.msdk.mbnative.controller.d.a.4
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z10;
                    if (MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD && Looper.myLooper() == null) {
                        Looper.prepare();
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!a.this.f14037h && a.this.f14038i != null) {
                        a aVar = a.this;
                        d.this.a.removeCallbacks(aVar.f14038i);
                    }
                    List list2 = list;
                    if (list2 != null && list2.size() > 0) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            for (CampaignEx campaignEx : ((Frame) it.next()).getCampaigns()) {
                                d dVar = d.this;
                                dVar.a(dVar.f14026t, campaignEx);
                            }
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put(Long.valueOf(System.currentTimeMillis()), list);
                        if (d.f14008f.containsKey("1_" + a.this.unitId)) {
                            d.f14008f.remove("1_" + a.this.unitId);
                        }
                        d.f14008f.put("1_" + a.this.unitId, hashMap);
                    }
                    if (Looper.myLooper() != null && z10) {
                        Looper.loop();
                    }
                }
            }));
        }

        public final void a(com.mbridge.msdk.b.a.a aVar) {
            this.f14040k = aVar;
        }

        @Override // com.mbridge.msdk.foundation.same.e.d
        public final void a(boolean z10) {
            this.f14037h = z10;
        }

        @Override // com.mbridge.msdk.mbnative.f.a.b
        public final void a(List<h> list, final CampaignUnit campaignUnit) {
            d.this.f14027w = true;
            d.this.a(true, this.f14040k, (String) null);
            d.this.a(new Thread(new Runnable() { // from class: com.mbridge.msdk.mbnative.controller.d.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z10;
                    int i10;
                    int i11 = 1;
                    if (MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD && Looper.myLooper() == null) {
                        Looper.prepare();
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (a.this.f14038i != null) {
                        a aVar = a.this;
                        d.this.a.removeCallbacks(aVar.f14038i);
                    }
                    if (com.mbridge.msdk.e.b.a()) {
                        d dVar = d.this;
                    }
                    if (d.f14008f.containsKey("0_" + a.this.unitId)) {
                        d.f14008f.remove("0_" + a.this.unitId);
                    }
                    if (a.this.f14035f > 0) {
                        if (campaignUnit.ads.size() <= a.this.f14035f) {
                            a.this.f14032c = campaignUnit.ads.size();
                        } else {
                            a aVar2 = a.this;
                            aVar2.f14032c = aVar2.f14035f;
                        }
                    } else if (a.this.f14035f == -1) {
                        a.this.f14032c = 0;
                    } else if (a.this.f14035f == -3) {
                        a.this.f14032c = campaignUnit.ads.size();
                    } else if (a.this.f14035f == -2) {
                        if (campaignUnit.getTemplate() == 3) {
                            if (a.this.f14034e != 0) {
                                a aVar3 = a.this;
                                aVar3.f14032c = aVar3.f14034e;
                            }
                        } else if (a.this.f14033d != 0) {
                            a aVar4 = a.this;
                            aVar4.f14032c = aVar4.f14033d;
                        }
                        if (a.this.f14032c <= 0) {
                            a.this.f14032c = ((Integer) d.f14011i.get(a.this.unitId)).intValue();
                        }
                    }
                    if (campaignUnit.ads.size() < a.this.f14032c) {
                        a.this.f14032c = campaignUnit.ads.size();
                    }
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i12 = 0; i12 < campaignUnit.ads.size(); i12++) {
                        CampaignEx campaignEx = campaignUnit.ads.get(i12);
                        campaignEx.setCampaignUnitId(a.this.unitId);
                        boolean c10 = ai.c(com.mbridge.msdk.foundation.controller.c.m().c(), campaignEx.getPackageName());
                        d dVar2 = d.this;
                        com.mbridge.msdk.foundation.controller.c.m().c();
                        if (arrayList.size() < a.this.f14032c && campaignEx.getOfferType() != 99) {
                            if (ai.c(campaignEx)) {
                                if (c10) {
                                    i10 = 1;
                                } else {
                                    i10 = 2;
                                }
                                campaignEx.setRtinsType(i10);
                            }
                            if (com.mbridge.msdk.foundation.same.c.a(com.mbridge.msdk.foundation.controller.c.m().c(), campaignEx)) {
                                arrayList.add(campaignEx);
                                if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                                    arrayList2.add(campaignEx);
                                }
                            } else {
                                ai.a(a.this.unitId, campaignEx, com.mbridge.msdk.foundation.same.a.f13292x);
                            }
                            a.a(a.this, campaignEx, null, null);
                        }
                        d dVar3 = d.this;
                        dVar3.a(dVar3.f14026t, campaignEx);
                    }
                    a aVar5 = a.this;
                    d.a(d.this, arrayList2, aVar5.unitId);
                    if (campaignUnit.getAds().get(0) != null) {
                        i11 = campaignUnit.getAds().get(0).getType();
                    }
                    com.mbridge.msdk.mbnative.a.b<String, List<Campaign>> a = com.mbridge.msdk.mbnative.a.c.a(i11);
                    if (a != null) {
                        a.a((com.mbridge.msdk.mbnative.a.b<String, List<Campaign>>) a.this.unitId, (String) arrayList);
                    }
                    d.a(a.this.f14031b, a.this.unitId);
                    if (Looper.myLooper() != null && z10) {
                        Looper.loop();
                    }
                    if (campaignUnit.getAds().get(0) != null) {
                        com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.m().c(), campaignUnit.getAds().get(0).getMaitve(), campaignUnit.getAds().get(0).getMaitve_src());
                    }
                }
            }));
        }

        @Override // com.mbridge.msdk.mbnative.f.a.b
        public final void a(final int i10, final String str) {
            d.this.a(new Thread(new Runnable() { // from class: com.mbridge.msdk.mbnative.controller.d.a.3
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z10;
                    if (MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD && Looper.myLooper() == null) {
                        Looper.prepare();
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!a.this.f14037h) {
                        if (a.this.f14038i != null) {
                            a aVar = a.this;
                            d.this.a.removeCallbacks(aVar.f14038i);
                        }
                        if (a.this.b() == 1 || a.this.f14039j) {
                            a aVar2 = a.this;
                            d dVar = d.this;
                            String str2 = str;
                            int b3 = aVar2.b();
                            a aVar3 = a.this;
                            dVar.a(str2, b3, aVar3.unitId, aVar3.placementId, aVar3.f14040k);
                        }
                    } else if (a.this.f14039j) {
                        a aVar4 = a.this;
                        d dVar2 = d.this;
                        String str3 = str;
                        int b10 = aVar4.b();
                        a aVar5 = a.this;
                        dVar2.a(str3, b10, aVar5.unitId, aVar5.placementId, aVar5.f14040k);
                    }
                    if (i10 == -1) {
                        d.b(a.this.f14031b, a.this.unitId);
                    }
                    if (Looper.myLooper() != null && z10) {
                        Looper.loop();
                    }
                }
            }));
        }

        public final void a(Runnable runnable) {
            this.f14038i = runnable;
        }

        public static /* synthetic */ void a(a aVar, final CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.d.b bVar, final com.mbridge.msdk.foundation.same.report.d.a.a aVar2) {
            try {
                final Context c10 = com.mbridge.msdk.foundation.controller.c.m().c();
                com.mbridge.msdk.foundation.same.c.a(campaignEx, c10, bVar, new c.a() { // from class: com.mbridge.msdk.mbnative.controller.d.a.2
                    @Override // com.mbridge.msdk.foundation.same.c.a
                    public final void a(String str, com.mbridge.msdk.foundation.same.report.d.b bVar2) {
                        com.mbridge.msdk.mbnative.e.a.a(str, bVar2, campaignEx, c10, aVar2);
                    }
                });
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private int f14048b;

        /* renamed from: c, reason: collision with root package name */
        private com.mbridge.msdk.foundation.same.e.d f14049c;

        /* renamed from: d, reason: collision with root package name */
        private int f14050d;

        /* renamed from: e, reason: collision with root package name */
        private String f14051e;

        /* renamed from: f, reason: collision with root package name */
        private String f14052f;

        /* renamed from: g, reason: collision with root package name */
        private com.mbridge.msdk.b.a.a f14053g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f14054h = false;

        public b(int i10, com.mbridge.msdk.foundation.same.e.d dVar, int i11, String str, String str2) {
            this.f14048b = i10;
            this.f14049c = dVar;
            this.f14050d = i11;
            this.f14051e = str;
            this.f14052f = str2;
        }

        public final void a(boolean z10) {
            this.f14054h = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f14049c.a(true);
            int i10 = this.f14048b;
            if (i10 != 1) {
                if (i10 == 2) {
                    d.this.a("REQUEST_TIMEOUT", this.f14050d, this.f14051e, this.f14052f, this.f14053g);
                }
            } else {
                d.this.f14027w = true;
                if (this.f14054h || this.f14050d == 1) {
                    d.this.a("REQUEST_TIMEOUT", this.f14050d, this.f14051e, this.f14052f, this.f14053g);
                }
            }
        }

        public final void a(com.mbridge.msdk.b.a.a aVar) {
            this.f14053g = aVar;
        }

        public final void a(String str) {
            this.f14051e = str;
        }
    }

    public d() {
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        this.a = new Handler() { // from class: com.mbridge.msdk.mbnative.controller.d.1
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
                        int i10 = MBMediaView.f14220a0;
                        Object invoke = com.mbridge.msdk.videocommon.download.b.class.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                        if (invoke != null) {
                            com.mbridge.msdk.videocommon.download.b.class.getMethod("createUnitCache", Context.class, String.class, CopyOnWriteArrayList.class, Integer.TYPE, com.mbridge.msdk.videocommon.listener.a.class).invoke(invoke, com.mbridge.msdk.foundation.controller.c.m().c(), str, new CopyOnWriteArrayList(list), 1, null);
                            com.mbridge.msdk.videocommon.download.b.class.getMethod("load", String.class).invoke(invoke, str);
                        }
                    } catch (Exception unused) {
                        ad.b(f14007e, "please import the videocommon aar");
                    }
                }
            } catch (Exception e2) {
                ad.b(f14007e, com.mbridge.msdk.mbnative.b.a.a(e2));
            }
        }
    }

    public static void b(int i10, String str) {
        if (f14010h.containsKey(str)) {
            k kVar = f14010h.get(str);
            if (i10 == 1) {
                kVar.a(0);
            } else if (i10 == 2) {
                kVar.b(0);
            }
            f14010h.put(str, kVar);
        }
    }

    public static Map<String, k> c() {
        return f14010h;
    }

    public static Map<String, Integer> d() {
        return f14011i;
    }

    public static Map<String, Integer> e() {
        return f14012j;
    }

    public static Map<String, Boolean> b() {
        return f14009g;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x02f1 A[Catch: Exception -> 0x0420, TryCatch #1 {Exception -> 0x0420, blocks: (B:3:0x001c, B:7:0x0028, B:9:0x0051, B:12:0x006c, B:15:0x0073, B:17:0x0079, B:18:0x0085, B:20:0x0089, B:21:0x009c, B:23:0x00a2, B:24:0x00ae, B:26:0x00b4, B:27:0x00bc, B:29:0x00c5, B:31:0x00d3, B:33:0x00ff, B:35:0x0105, B:37:0x0119, B:38:0x0120, B:40:0x0131, B:43:0x0138, B:54:0x0167, B:56:0x0178, B:58:0x017e, B:59:0x0188, B:61:0x019e, B:63:0x01a4, B:65:0x01ac, B:66:0x01ba, B:68:0x01be, B:69:0x01c5, B:71:0x01de, B:72:0x01e4, B:75:0x01ee, B:77:0x01f6, B:81:0x020a, B:83:0x0226, B:85:0x022c, B:86:0x0239, B:88:0x023f, B:90:0x024b, B:92:0x024f, B:94:0x0255, B:95:0x0262, B:97:0x0268, B:99:0x027f, B:115:0x02e1, B:117:0x02f1, B:118:0x02fa, B:161:0x040f, B:174:0x041a, B:179:0x0160, B:180:0x0099, B:45:0x0141, B:47:0x0147, B:49:0x0155, B:50:0x0157, B:52:0x015d, B:120:0x0303, B:122:0x0319, B:124:0x0332, B:125:0x033a, B:127:0x0340, B:128:0x0342, B:130:0x0350, B:131:0x0356, B:133:0x0360, B:135:0x0366, B:137:0x0372, B:139:0x0378, B:141:0x0382, B:142:0x0388, B:144:0x038e, B:146:0x039e, B:148:0x03a1, B:151:0x03a4, B:153:0x03aa), top: B:2:0x001c, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0319 A[Catch: all -> 0x040f, TryCatch #4 {all -> 0x040f, blocks: (B:120:0x0303, B:122:0x0319, B:124:0x0332, B:125:0x033a, B:127:0x0340, B:128:0x0342, B:130:0x0350, B:131:0x0356, B:133:0x0360, B:135:0x0366, B:137:0x0372, B:139:0x0378, B:141:0x0382, B:142:0x0388, B:144:0x038e, B:146:0x039e, B:148:0x03a1, B:151:0x03a4, B:153:0x03aa), top: B:119:0x0303, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x041a A[Catch: Exception -> 0x0420, TRY_LEAVE, TryCatch #1 {Exception -> 0x0420, blocks: (B:3:0x001c, B:7:0x0028, B:9:0x0051, B:12:0x006c, B:15:0x0073, B:17:0x0079, B:18:0x0085, B:20:0x0089, B:21:0x009c, B:23:0x00a2, B:24:0x00ae, B:26:0x00b4, B:27:0x00bc, B:29:0x00c5, B:31:0x00d3, B:33:0x00ff, B:35:0x0105, B:37:0x0119, B:38:0x0120, B:40:0x0131, B:43:0x0138, B:54:0x0167, B:56:0x0178, B:58:0x017e, B:59:0x0188, B:61:0x019e, B:63:0x01a4, B:65:0x01ac, B:66:0x01ba, B:68:0x01be, B:69:0x01c5, B:71:0x01de, B:72:0x01e4, B:75:0x01ee, B:77:0x01f6, B:81:0x020a, B:83:0x0226, B:85:0x022c, B:86:0x0239, B:88:0x023f, B:90:0x024b, B:92:0x024f, B:94:0x0255, B:95:0x0262, B:97:0x0268, B:99:0x027f, B:115:0x02e1, B:117:0x02f1, B:118:0x02fa, B:161:0x040f, B:174:0x041a, B:179:0x0160, B:180:0x0099, B:45:0x0141, B:47:0x0147, B:49:0x0155, B:50:0x0157, B:52:0x015d, B:120:0x0303, B:122:0x0319, B:124:0x0332, B:125:0x033a, B:127:0x0340, B:128:0x0342, B:130:0x0350, B:131:0x0356, B:133:0x0360, B:135:0x0366, B:137:0x0372, B:139:0x0378, B:141:0x0382, B:142:0x0388, B:144:0x038e, B:146:0x039e, B:148:0x03a1, B:151:0x03a4, B:153:0x03aa), top: B:2:0x001c, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.util.Map<java.lang.String, java.lang.Object> r24, int r25) {
        /*
            Method dump skipped, instructions count: 1067
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
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject = (JSONObject) jSONArray.opt(i10);
                    if (2 == jSONObject.optInt("id", 0)) {
                        return jSONObject.optInt("ad_num");
                    }
                }
            }
        } catch (Exception e2) {
            ad.b(f14007e, com.mbridge.msdk.mbnative.b.a.a(e2));
        }
        return 0;
    }

    private void a(int i10, com.mbridge.msdk.c.k kVar, String str, String str2, com.mbridge.msdk.b.a.a aVar) {
        Queue<Integer> queue = this.f14015b;
        if (queue == null || queue.size() <= 0) {
            return;
        }
        try {
            int intValue = this.f14015b.poll().intValue();
            long j3 = MBridgeConstans.REQUEST_TIME_OUT;
            Queue<Long> queue2 = this.f14016c;
            if (queue2 != null && queue2.size() > 0) {
                j3 = this.f14016c.poll().longValue();
            }
            ad.c(f14007e, "preload start queue adsource = " + intValue);
            a(intValue, j3, str, str2, this.f14023q, i10, kVar, aVar);
        } catch (Throwable unused) {
            ad.b(f14007e, "queue poll exception");
        }
    }

    private void a(int i10, long j3, String str, String str2, Map<String, Object> map, int i11, com.mbridge.msdk.c.k kVar, com.mbridge.msdk.b.a.a aVar) {
        com.mbridge.msdk.mbnative.a.b<String, List<Campaign>> a10;
        if (i10 != 1 && (a10 = com.mbridge.msdk.mbnative.a.c.a(i10)) != null) {
            List<Campaign> b3 = a10.b(str, this.f14029y);
            if (b3 != null && b3.size() > 0) {
                a(true, aVar, (String) null);
                return;
            }
        }
        if (i10 == 1) {
            a(i10, j3, i11, kVar, str, str2, true, aVar);
        } else if (i10 != 2) {
            a(i10, j3, i11, kVar, str, str2, aVar, false);
        } else {
            a(2, j3, i11, kVar, str, str2, aVar, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x029b A[Catch: Exception -> 0x047a, TryCatch #1 {Exception -> 0x047a, blocks: (B:3:0x001e, B:6:0x006d, B:8:0x0073, B:10:0x007b, B:12:0x0083, B:14:0x008b, B:16:0x0095, B:17:0x009f, B:19:0x00a9, B:20:0x00b3, B:22:0x00bd, B:23:0x00c7, B:25:0x00cd, B:27:0x00d6, B:29:0x00ef, B:30:0x00f6, B:32:0x00fc, B:33:0x0101, B:35:0x0128, B:36:0x012d, B:43:0x0146, B:46:0x014e, B:48:0x0156, B:50:0x015c, B:53:0x0161, B:55:0x0165, B:60:0x0179, B:62:0x0181, B:64:0x0187, B:68:0x0192, B:69:0x01a4, B:71:0x01a8, B:72:0x01be, B:74:0x01c6, B:76:0x01d5, B:78:0x01e6, B:83:0x01f7, B:85:0x01fd, B:88:0x0205, B:90:0x020f, B:93:0x0215, B:98:0x0252, B:99:0x025f, B:101:0x0272, B:103:0x029b, B:104:0x02a1, B:106:0x02a9, B:108:0x02bb, B:109:0x02c4, B:111:0x02cc, B:117:0x02dc, B:118:0x02ec, B:123:0x02f9, B:124:0x0325, B:126:0x0360, B:127:0x0365, B:129:0x036f, B:131:0x0379, B:132:0x0399, B:134:0x03a3, B:136:0x03ad, B:137:0x03cd, B:140:0x0401, B:142:0x0430, B:143:0x0462, B:147:0x0449, B:148:0x03fe, B:150:0x0311, B:152:0x02e1, B:153:0x02e6, B:158:0x021e, B:160:0x0224, B:169:0x023d, B:181:0x0268, B:187:0x0468), top: B:2:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02a9 A[Catch: Exception -> 0x047a, TryCatch #1 {Exception -> 0x047a, blocks: (B:3:0x001e, B:6:0x006d, B:8:0x0073, B:10:0x007b, B:12:0x0083, B:14:0x008b, B:16:0x0095, B:17:0x009f, B:19:0x00a9, B:20:0x00b3, B:22:0x00bd, B:23:0x00c7, B:25:0x00cd, B:27:0x00d6, B:29:0x00ef, B:30:0x00f6, B:32:0x00fc, B:33:0x0101, B:35:0x0128, B:36:0x012d, B:43:0x0146, B:46:0x014e, B:48:0x0156, B:50:0x015c, B:53:0x0161, B:55:0x0165, B:60:0x0179, B:62:0x0181, B:64:0x0187, B:68:0x0192, B:69:0x01a4, B:71:0x01a8, B:72:0x01be, B:74:0x01c6, B:76:0x01d5, B:78:0x01e6, B:83:0x01f7, B:85:0x01fd, B:88:0x0205, B:90:0x020f, B:93:0x0215, B:98:0x0252, B:99:0x025f, B:101:0x0272, B:103:0x029b, B:104:0x02a1, B:106:0x02a9, B:108:0x02bb, B:109:0x02c4, B:111:0x02cc, B:117:0x02dc, B:118:0x02ec, B:123:0x02f9, B:124:0x0325, B:126:0x0360, B:127:0x0365, B:129:0x036f, B:131:0x0379, B:132:0x0399, B:134:0x03a3, B:136:0x03ad, B:137:0x03cd, B:140:0x0401, B:142:0x0430, B:143:0x0462, B:147:0x0449, B:148:0x03fe, B:150:0x0311, B:152:0x02e1, B:153:0x02e6, B:158:0x021e, B:160:0x0224, B:169:0x023d, B:181:0x0268, B:187:0x0468), top: B:2:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02cc A[Catch: Exception -> 0x047a, TryCatch #1 {Exception -> 0x047a, blocks: (B:3:0x001e, B:6:0x006d, B:8:0x0073, B:10:0x007b, B:12:0x0083, B:14:0x008b, B:16:0x0095, B:17:0x009f, B:19:0x00a9, B:20:0x00b3, B:22:0x00bd, B:23:0x00c7, B:25:0x00cd, B:27:0x00d6, B:29:0x00ef, B:30:0x00f6, B:32:0x00fc, B:33:0x0101, B:35:0x0128, B:36:0x012d, B:43:0x0146, B:46:0x014e, B:48:0x0156, B:50:0x015c, B:53:0x0161, B:55:0x0165, B:60:0x0179, B:62:0x0181, B:64:0x0187, B:68:0x0192, B:69:0x01a4, B:71:0x01a8, B:72:0x01be, B:74:0x01c6, B:76:0x01d5, B:78:0x01e6, B:83:0x01f7, B:85:0x01fd, B:88:0x0205, B:90:0x020f, B:93:0x0215, B:98:0x0252, B:99:0x025f, B:101:0x0272, B:103:0x029b, B:104:0x02a1, B:106:0x02a9, B:108:0x02bb, B:109:0x02c4, B:111:0x02cc, B:117:0x02dc, B:118:0x02ec, B:123:0x02f9, B:124:0x0325, B:126:0x0360, B:127:0x0365, B:129:0x036f, B:131:0x0379, B:132:0x0399, B:134:0x03a3, B:136:0x03ad, B:137:0x03cd, B:140:0x0401, B:142:0x0430, B:143:0x0462, B:147:0x0449, B:148:0x03fe, B:150:0x0311, B:152:0x02e1, B:153:0x02e6, B:158:0x021e, B:160:0x0224, B:169:0x023d, B:181:0x0268, B:187:0x0468), top: B:2:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0360 A[Catch: Exception -> 0x047a, TryCatch #1 {Exception -> 0x047a, blocks: (B:3:0x001e, B:6:0x006d, B:8:0x0073, B:10:0x007b, B:12:0x0083, B:14:0x008b, B:16:0x0095, B:17:0x009f, B:19:0x00a9, B:20:0x00b3, B:22:0x00bd, B:23:0x00c7, B:25:0x00cd, B:27:0x00d6, B:29:0x00ef, B:30:0x00f6, B:32:0x00fc, B:33:0x0101, B:35:0x0128, B:36:0x012d, B:43:0x0146, B:46:0x014e, B:48:0x0156, B:50:0x015c, B:53:0x0161, B:55:0x0165, B:60:0x0179, B:62:0x0181, B:64:0x0187, B:68:0x0192, B:69:0x01a4, B:71:0x01a8, B:72:0x01be, B:74:0x01c6, B:76:0x01d5, B:78:0x01e6, B:83:0x01f7, B:85:0x01fd, B:88:0x0205, B:90:0x020f, B:93:0x0215, B:98:0x0252, B:99:0x025f, B:101:0x0272, B:103:0x029b, B:104:0x02a1, B:106:0x02a9, B:108:0x02bb, B:109:0x02c4, B:111:0x02cc, B:117:0x02dc, B:118:0x02ec, B:123:0x02f9, B:124:0x0325, B:126:0x0360, B:127:0x0365, B:129:0x036f, B:131:0x0379, B:132:0x0399, B:134:0x03a3, B:136:0x03ad, B:137:0x03cd, B:140:0x0401, B:142:0x0430, B:143:0x0462, B:147:0x0449, B:148:0x03fe, B:150:0x0311, B:152:0x02e1, B:153:0x02e6, B:158:0x021e, B:160:0x0224, B:169:0x023d, B:181:0x0268, B:187:0x0468), top: B:2:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x036f A[Catch: Exception -> 0x047a, TryCatch #1 {Exception -> 0x047a, blocks: (B:3:0x001e, B:6:0x006d, B:8:0x0073, B:10:0x007b, B:12:0x0083, B:14:0x008b, B:16:0x0095, B:17:0x009f, B:19:0x00a9, B:20:0x00b3, B:22:0x00bd, B:23:0x00c7, B:25:0x00cd, B:27:0x00d6, B:29:0x00ef, B:30:0x00f6, B:32:0x00fc, B:33:0x0101, B:35:0x0128, B:36:0x012d, B:43:0x0146, B:46:0x014e, B:48:0x0156, B:50:0x015c, B:53:0x0161, B:55:0x0165, B:60:0x0179, B:62:0x0181, B:64:0x0187, B:68:0x0192, B:69:0x01a4, B:71:0x01a8, B:72:0x01be, B:74:0x01c6, B:76:0x01d5, B:78:0x01e6, B:83:0x01f7, B:85:0x01fd, B:88:0x0205, B:90:0x020f, B:93:0x0215, B:98:0x0252, B:99:0x025f, B:101:0x0272, B:103:0x029b, B:104:0x02a1, B:106:0x02a9, B:108:0x02bb, B:109:0x02c4, B:111:0x02cc, B:117:0x02dc, B:118:0x02ec, B:123:0x02f9, B:124:0x0325, B:126:0x0360, B:127:0x0365, B:129:0x036f, B:131:0x0379, B:132:0x0399, B:134:0x03a3, B:136:0x03ad, B:137:0x03cd, B:140:0x0401, B:142:0x0430, B:143:0x0462, B:147:0x0449, B:148:0x03fe, B:150:0x0311, B:152:0x02e1, B:153:0x02e6, B:158:0x021e, B:160:0x0224, B:169:0x023d, B:181:0x0268, B:187:0x0468), top: B:2:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03a3 A[Catch: Exception -> 0x047a, TryCatch #1 {Exception -> 0x047a, blocks: (B:3:0x001e, B:6:0x006d, B:8:0x0073, B:10:0x007b, B:12:0x0083, B:14:0x008b, B:16:0x0095, B:17:0x009f, B:19:0x00a9, B:20:0x00b3, B:22:0x00bd, B:23:0x00c7, B:25:0x00cd, B:27:0x00d6, B:29:0x00ef, B:30:0x00f6, B:32:0x00fc, B:33:0x0101, B:35:0x0128, B:36:0x012d, B:43:0x0146, B:46:0x014e, B:48:0x0156, B:50:0x015c, B:53:0x0161, B:55:0x0165, B:60:0x0179, B:62:0x0181, B:64:0x0187, B:68:0x0192, B:69:0x01a4, B:71:0x01a8, B:72:0x01be, B:74:0x01c6, B:76:0x01d5, B:78:0x01e6, B:83:0x01f7, B:85:0x01fd, B:88:0x0205, B:90:0x020f, B:93:0x0215, B:98:0x0252, B:99:0x025f, B:101:0x0272, B:103:0x029b, B:104:0x02a1, B:106:0x02a9, B:108:0x02bb, B:109:0x02c4, B:111:0x02cc, B:117:0x02dc, B:118:0x02ec, B:123:0x02f9, B:124:0x0325, B:126:0x0360, B:127:0x0365, B:129:0x036f, B:131:0x0379, B:132:0x0399, B:134:0x03a3, B:136:0x03ad, B:137:0x03cd, B:140:0x0401, B:142:0x0430, B:143:0x0462, B:147:0x0449, B:148:0x03fe, B:150:0x0311, B:152:0x02e1, B:153:0x02e6, B:158:0x021e, B:160:0x0224, B:169:0x023d, B:181:0x0268, B:187:0x0468), top: B:2:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0430 A[Catch: Exception -> 0x047a, TryCatch #1 {Exception -> 0x047a, blocks: (B:3:0x001e, B:6:0x006d, B:8:0x0073, B:10:0x007b, B:12:0x0083, B:14:0x008b, B:16:0x0095, B:17:0x009f, B:19:0x00a9, B:20:0x00b3, B:22:0x00bd, B:23:0x00c7, B:25:0x00cd, B:27:0x00d6, B:29:0x00ef, B:30:0x00f6, B:32:0x00fc, B:33:0x0101, B:35:0x0128, B:36:0x012d, B:43:0x0146, B:46:0x014e, B:48:0x0156, B:50:0x015c, B:53:0x0161, B:55:0x0165, B:60:0x0179, B:62:0x0181, B:64:0x0187, B:68:0x0192, B:69:0x01a4, B:71:0x01a8, B:72:0x01be, B:74:0x01c6, B:76:0x01d5, B:78:0x01e6, B:83:0x01f7, B:85:0x01fd, B:88:0x0205, B:90:0x020f, B:93:0x0215, B:98:0x0252, B:99:0x025f, B:101:0x0272, B:103:0x029b, B:104:0x02a1, B:106:0x02a9, B:108:0x02bb, B:109:0x02c4, B:111:0x02cc, B:117:0x02dc, B:118:0x02ec, B:123:0x02f9, B:124:0x0325, B:126:0x0360, B:127:0x0365, B:129:0x036f, B:131:0x0379, B:132:0x0399, B:134:0x03a3, B:136:0x03ad, B:137:0x03cd, B:140:0x0401, B:142:0x0430, B:143:0x0462, B:147:0x0449, B:148:0x03fe, B:150:0x0311, B:152:0x02e1, B:153:0x02e6, B:158:0x021e, B:160:0x0224, B:169:0x023d, B:181:0x0268, B:187:0x0468), top: B:2:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0311 A[Catch: Exception -> 0x047a, TryCatch #1 {Exception -> 0x047a, blocks: (B:3:0x001e, B:6:0x006d, B:8:0x0073, B:10:0x007b, B:12:0x0083, B:14:0x008b, B:16:0x0095, B:17:0x009f, B:19:0x00a9, B:20:0x00b3, B:22:0x00bd, B:23:0x00c7, B:25:0x00cd, B:27:0x00d6, B:29:0x00ef, B:30:0x00f6, B:32:0x00fc, B:33:0x0101, B:35:0x0128, B:36:0x012d, B:43:0x0146, B:46:0x014e, B:48:0x0156, B:50:0x015c, B:53:0x0161, B:55:0x0165, B:60:0x0179, B:62:0x0181, B:64:0x0187, B:68:0x0192, B:69:0x01a4, B:71:0x01a8, B:72:0x01be, B:74:0x01c6, B:76:0x01d5, B:78:0x01e6, B:83:0x01f7, B:85:0x01fd, B:88:0x0205, B:90:0x020f, B:93:0x0215, B:98:0x0252, B:99:0x025f, B:101:0x0272, B:103:0x029b, B:104:0x02a1, B:106:0x02a9, B:108:0x02bb, B:109:0x02c4, B:111:0x02cc, B:117:0x02dc, B:118:0x02ec, B:123:0x02f9, B:124:0x0325, B:126:0x0360, B:127:0x0365, B:129:0x036f, B:131:0x0379, B:132:0x0399, B:134:0x03a3, B:136:0x03ad, B:137:0x03cd, B:140:0x0401, B:142:0x0430, B:143:0x0462, B:147:0x0449, B:148:0x03fe, B:150:0x0311, B:152:0x02e1, B:153:0x02e6, B:158:0x021e, B:160:0x0224, B:169:0x023d, B:181:0x0268, B:187:0x0468), top: B:2:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x030e  */
    @Override // com.mbridge.msdk.mbnative.controller.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(int r26, long r27, int r29, com.mbridge.msdk.c.k r30, java.lang.String r31, java.lang.String r32, com.mbridge.msdk.b.a.a r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 1164
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbnative.controller.d.a(int, long, int, com.mbridge.msdk.c.k, java.lang.String, java.lang.String, com.mbridge.msdk.b.a.a, boolean):void");
    }

    public static void a(int i10, String str) {
        k kVar;
        if (f14010h.containsKey(str)) {
            kVar = f14010h.get(str);
        } else {
            kVar = new k();
        }
        int intValue = f14011i.get(str).intValue();
        int intValue2 = f14012j.containsKey(str) ? f14012j.get(str).intValue() : 1;
        if (i10 == 1) {
            int a10 = kVar.a() + intValue;
            kVar.a(a10 <= intValue2 ? a10 : 0);
        } else if (i10 == 2) {
            int b3 = kVar.b() + intValue;
            kVar.b(b3 <= intValue2 ? b3 : 0);
        }
        f14010h.put(str, kVar);
    }

    public final void a(String str, int i10, String str2, String str3, com.mbridge.msdk.b.a.a aVar) {
        Log.e(f14007e, str);
        try {
            Queue<Integer> queue = this.f14015b;
            if ((queue != null && queue.size() <= 0) || this.f14015b == null) {
                a(false, aVar, str);
            } else {
                a(i10, this.f14020n, str2, str3, aVar);
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    public static Map<String, Map<Long, Object>> a() {
        return f14008f;
    }

    public final void a(boolean z10, com.mbridge.msdk.b.a.a aVar, String str) {
        if (z10) {
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

    public final void a(boolean z10, Campaign campaign) {
        if (campaign == null) {
            return;
        }
        if (z10 && campaign.getIconDrawable() == null) {
            campaign.loadIconUrlAsyncWithBlock(null);
        }
        if (z10 && campaign.getBigDrawable() == null) {
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

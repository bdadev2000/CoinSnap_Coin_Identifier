package com.mbridge.msdk.reward.b;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.b.a;
import com.mbridge.msdk.foundation.db.e;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.h;
import com.mbridge.msdk.foundation.db.i;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.f;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.al;
import com.mbridge.msdk.foundation.tools.an;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.reward.adapter.b;
import com.mbridge.msdk.videocommon.a;
import com.mbridge.msdk.videocommon.listener.InterVideoOutListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    public static String f14951b = "";

    /* renamed from: d, reason: collision with root package name */
    public static String f14952d = null;

    /* renamed from: e, reason: collision with root package name */
    public static String f14953e = "";
    private int A;
    private int B;
    private int C;
    private boolean H;
    private Queue<Integer> P;
    private String Q;
    private CopyOnWriteArrayList<CampaignEx> Z;
    b a;

    /* renamed from: aa, reason: collision with root package name */
    private List<CampaignEx> f14955aa;

    /* renamed from: l, reason: collision with root package name */
    private Context f14962l;

    /* renamed from: m, reason: collision with root package name */
    private com.mbridge.msdk.reward.adapter.c f14963m;

    /* renamed from: n, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.d.c f14964n;

    /* renamed from: o, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.d.a f14965o;

    /* renamed from: p, reason: collision with root package name */
    private volatile InterVideoOutListener f14966p;

    /* renamed from: q, reason: collision with root package name */
    private volatile c f14967q;

    /* renamed from: r, reason: collision with root package name */
    private String f14968r;

    /* renamed from: s, reason: collision with root package name */
    private String f14969s;

    /* renamed from: t, reason: collision with root package name */
    private MBridgeIds f14970t;
    private String u;

    /* renamed from: v, reason: collision with root package name */
    private volatile String f14971v;

    /* renamed from: w, reason: collision with root package name */
    private String f14972w;
    private static ConcurrentHashMap<String, Integer> N = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, String> O = new ConcurrentHashMap<>();

    /* renamed from: f, reason: collision with root package name */
    public static ConcurrentHashMap<String, d> f14954f = new ConcurrentHashMap<>();

    /* renamed from: x, reason: collision with root package name */
    private int f14973x = 0;

    /* renamed from: z, reason: collision with root package name */
    private int f14975z = 2;
    private boolean D = false;
    private boolean E = false;
    private boolean F = false;
    private boolean G = false;
    private boolean I = false;
    private ArrayList<Integer> J = new ArrayList<>(7);
    private boolean K = false;
    private final Object L = new Object();

    /* renamed from: c, reason: collision with root package name */
    public boolean f14956c = false;
    private List<CampaignEx> M = new ArrayList();
    private g R = null;
    private volatile boolean S = true;
    private volatile boolean T = false;
    private volatile boolean U = false;
    private volatile boolean V = false;
    private volatile boolean W = false;
    private volatile boolean X = false;
    private volatile boolean Y = false;

    /* renamed from: g, reason: collision with root package name */
    volatile boolean f14957g = false;

    /* renamed from: h, reason: collision with root package name */
    volatile boolean f14958h = false;

    /* renamed from: i, reason: collision with root package name */
    volatile boolean f14959i = false;

    /* renamed from: j, reason: collision with root package name */
    volatile boolean f14960j = false;

    /* renamed from: k, reason: collision with root package name */
    volatile boolean f14961k = false;

    /* renamed from: y, reason: collision with root package name */
    private Handler f14974y = new com.mbridge.msdk.reward.b.b(this);

    /* renamed from: com.mbridge.msdk.reward.b.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class RunnableC0199a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final com.mbridge.msdk.reward.adapter.c f15004b;

        /* renamed from: c, reason: collision with root package name */
        private final int f15005c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f15006d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f15007e = false;

        /* renamed from: f, reason: collision with root package name */
        private int f15008f;

        /* renamed from: g, reason: collision with root package name */
        private String f15009g;

        /* renamed from: h, reason: collision with root package name */
        private com.mbridge.msdk.foundation.same.report.d.b f15010h;

        public RunnableC0199a(com.mbridge.msdk.reward.adapter.c cVar, int i10, boolean z10, String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
            this.f15004b = cVar;
            this.f15005c = i10;
            this.f15006d = z10;
            if (cVar != null) {
                cVar.e(false);
            }
            this.f15009g = str;
            this.f15010h = bVar;
        }

        public final void a() {
            this.f15007e = true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f15007e) {
                return;
            }
            com.mbridge.msdk.reward.adapter.c cVar = this.f15004b;
            if (cVar != null) {
                cVar.e(true);
            }
            ad.b("RewardVideoController", "adSource=" + this.f15005c + " CommonCancelTimeTask mIsDevCall：" + this.f15006d);
            a.this.a(com.mbridge.msdk.foundation.c.a.b(880023, "v3 is timeout"), this.f15010h);
        }

        public final void a(int i10) {
            this.f15008f = i10;
        }
    }

    /* loaded from: classes4.dex */
    public class b implements com.mbridge.msdk.reward.adapter.a {

        /* renamed from: b, reason: collision with root package name */
        private com.mbridge.msdk.reward.adapter.c f15011b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f15012c;

        /* renamed from: d, reason: collision with root package name */
        private RunnableC0199a f15013d;

        public b(com.mbridge.msdk.reward.adapter.c cVar, boolean z10) {
            this.f15011b = cVar;
            this.f15012c = z10;
        }

        public final void a(RunnableC0199a runnableC0199a) {
            this.f15013d = runnableC0199a;
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public final void a(String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
            RunnableC0199a runnableC0199a = this.f15013d;
            if (runnableC0199a != null) {
                runnableC0199a.a();
                a.this.f14974y.removeCallbacks(this.f15013d);
            }
            if (a.this.f14967q != null) {
                c.b(a.this.f14967q, a.this.f14971v, a.this.f14969s, bVar);
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public final void a(List<CampaignEx> list, com.mbridge.msdk.foundation.same.report.d.b bVar) {
            RunnableC0199a runnableC0199a = this.f15013d;
            if (runnableC0199a != null) {
                runnableC0199a.a();
                a.this.f14974y.removeCallbacks(this.f15013d);
            }
            a.this.a(list);
            if (a.this.f14967q != null) {
                a.this.f14967q.a(a.this.f14971v, a.this.f14969s, bVar);
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public final void a(List<CampaignEx> list, com.mbridge.msdk.foundation.c.b bVar, com.mbridge.msdk.foundation.same.report.d.b bVar2) {
            RunnableC0199a runnableC0199a = this.f15013d;
            if (runnableC0199a != null) {
                runnableC0199a.a();
                a.this.f14974y.removeCallbacks(this.f15013d);
            }
            com.mbridge.msdk.reward.adapter.c cVar = this.f15011b;
            if (cVar != null) {
                cVar.a((com.mbridge.msdk.reward.adapter.a) null);
                this.f15011b = null;
            }
            a.this.a(list);
            if (a.this.f14967q != null) {
                a.this.f14967q.a(bVar, bVar2);
            }
        }
    }

    /* loaded from: classes4.dex */
    public final class c {

        /* renamed from: b, reason: collision with root package name */
        private WeakReference<InterVideoOutListener> f15014b;

        /* renamed from: c, reason: collision with root package name */
        private volatile AtomicInteger f15015c;

        /* renamed from: d, reason: collision with root package name */
        private Handler f15016d;

        /* renamed from: e, reason: collision with root package name */
        private String f15017e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f15018f;

        public final void a(String str, String str2, com.mbridge.msdk.foundation.same.report.d.b bVar) {
            Handler handler = this.f15016d;
            if (handler != null) {
                handler.removeMessages(1001002);
            }
            WeakReference<InterVideoOutListener> weakReference = this.f15014b;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (this.f15015c.get() == 2 || this.f15016d == null) {
                return;
            }
            this.f15015c.set(2);
            if (a.this.V) {
                return;
            }
            a.this.V = true;
            if (bVar == null) {
                bVar = new com.mbridge.msdk.foundation.same.report.d.b();
            }
            bVar.b(a.this.M);
            a.a(a.this, "2000048", bVar, interVideoOutListener);
            if (interVideoOutListener != null) {
                Message obtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                bundle.putString("metrics_data_lrid", bVar.f());
                obtain.setData(bundle);
                obtain.obj = str2;
                obtain.what = 9;
                this.f15016d.sendMessage(obtain);
            }
        }

        private c(InterVideoOutListener interVideoOutListener, Handler handler, String str) {
            this.f15014b = new WeakReference<>(interVideoOutListener);
            this.f15015c = new AtomicInteger(0);
            this.f15016d = handler;
            this.f15017e = str;
        }

        public final void b(String str, String str2, com.mbridge.msdk.foundation.same.report.d.b bVar) {
            Handler handler = this.f15016d;
            if (handler != null) {
                handler.removeMessages(1001002);
            }
            WeakReference<InterVideoOutListener> weakReference = this.f15014b;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (this.f15015c.get() == 2 || this.f15016d == null) {
                return;
            }
            if (this.f15015c.get() == 1) {
                this.f15015c.set(3);
            }
            if (a.this.V) {
                return;
            }
            a.this.V = true;
            if (bVar == null) {
                bVar = new com.mbridge.msdk.foundation.same.report.d.b();
            }
            bVar.a(true);
            bVar.b(a.this.M);
            a.a(a.this, "2000048", bVar, interVideoOutListener);
            if (interVideoOutListener != null) {
                Message obtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                bundle.putSerializable("metrics_data_lrid", bVar.f());
                obtain.setData(bundle);
                obtain.obj = str2;
                obtain.what = 9;
                this.f15016d.sendMessage(obtain);
            }
            if (a.this.W) {
                this.f15015c.set(2);
            }
        }

        public final void a(com.mbridge.msdk.foundation.c.b bVar, com.mbridge.msdk.foundation.same.report.d.b bVar2) {
            String str;
            if (bVar == null || bVar2 == null) {
                str = "";
            } else {
                str = bVar.b();
                bVar2.a(bVar);
            }
            if (a.this.f14963m != null) {
                a.this.f14963m.a(a.this.a);
                CopyOnWriteArrayList<CampaignEx> e2 = a.this.f14963m.e();
                CampaignEx campaignEx = (a.this.M == null || a.this.M.size() == 0) ? null : (CampaignEx) a.this.M.get(0);
                if (campaignEx == null) {
                    campaignEx = (e2 == null || e2.size() == 0) ? null : e2.get(0);
                }
                CampaignEx campaignEx2 = campaignEx;
                if (a.this.E && ((campaignEx2 == null || TextUtils.isEmpty(campaignEx2.getNLRid())) && ((e2 == null || e2.size() == 0) && a.this.f14963m.a(campaignEx2, true, bVar, 2, bVar2)))) {
                    return;
                } else {
                    a.this.f14963m.a((com.mbridge.msdk.reward.adapter.a) null);
                }
            }
            Handler handler = this.f15016d;
            if (handler != null) {
                handler.removeMessages(1001002);
            }
            WeakReference<InterVideoOutListener> weakReference = this.f15014b;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (this.f15015c.get() == 2 || this.f15016d == null) {
                return;
            }
            a.this.W = true;
            if (!a.this.Y || str.contains("resource load timeout")) {
                a.this.X = true;
            }
            if (a.this.V) {
                this.f15015c.set(2);
            }
            if (a.this.W && a.this.X && !a.this.V) {
                this.f15015c.set(2);
                a.a(a.this, "2000047", bVar2, interVideoOutListener);
                if (interVideoOutListener != null) {
                    Message obtain = Message.obtain();
                    obtain.obj = str;
                    obtain.what = 16;
                    if (bVar2 != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("metrics_data_lrid", bVar2.f());
                        obtain.setData(bundle);
                    }
                    this.f15016d.sendMessage(obtain);
                }
            }
        }

        public static /* synthetic */ void b(c cVar, String str, String str2, com.mbridge.msdk.foundation.same.report.d.b bVar) {
            WeakReference<InterVideoOutListener> weakReference = cVar.f15014b;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if ((cVar.f15015c.get() != 1 && cVar.f15015c.get() != 3) || cVar.f15016d == null || a.this.U) {
                return;
            }
            a.this.U = true;
            a.a(a.this, "2000127", bVar, interVideoOutListener);
            if (interVideoOutListener != null) {
                Message obtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                bundle.putBoolean(MBridgeConstans.PROPERTIES_IS_CACHED_CAMPAIGN, false);
                if (bVar != null) {
                    bundle.putString("metrics_data_lrid", bVar.f());
                }
                obtain.setData(bundle);
                obtain.obj = str2;
                obtain.what = 17;
                cVar.f15016d.sendMessage(obtain);
                if (af.a().a("l_s_i_l_v_s", false)) {
                    cVar.a(str, str2, bVar);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
            WeakReference<InterVideoOutListener> weakReference = this.f15014b;
            a.a(a.this, "2000047", bVar, weakReference != null ? weakReference.get() : null);
            if (this.f15016d != null) {
                Message obtain = Message.obtain();
                obtain.obj = str;
                obtain.what = 18;
                if (bVar != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("metrics_data_lrid", bVar.f());
                    obtain.setData(bundle);
                }
                this.f15016d.sendMessage(obtain);
            }
        }

        public final void a(boolean z10) {
            this.f15018f = z10;
        }

        public static /* synthetic */ int a(c cVar) {
            return cVar.f15015c.get();
        }

        public static /* synthetic */ void a(c cVar, int i10) {
            cVar.f15015c.set(i10);
        }

        public static /* synthetic */ void a(c cVar, String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
            cVar.f15015c.set(2);
            cVar.a(str, bVar);
        }

        public static /* synthetic */ void a(c cVar, String str, String str2, com.mbridge.msdk.foundation.same.report.d.b bVar) {
            WeakReference<InterVideoOutListener> weakReference = cVar.f15014b;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (cVar.f15016d == null || a.this.U) {
                return;
            }
            a.this.U = true;
            a.a(a.this, "2000127", bVar, interVideoOutListener);
            if (interVideoOutListener != null) {
                Message obtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                bundle.putBoolean(MBridgeConstans.PROPERTIES_IS_CACHED_CAMPAIGN, true);
                if (bVar != null) {
                    bundle.putString("metrics_data_lrid", bVar.f());
                }
                obtain.setData(bundle);
                obtain.obj = str2;
                obtain.what = 17;
                cVar.f15016d.sendMessage(obtain);
                if (af.a().a("l_s_i_l_v_s", false)) {
                    cVar.b(str, str2, bVar);
                }
            }
        }

        public static /* synthetic */ void a(c cVar, com.mbridge.msdk.foundation.c.b bVar, com.mbridge.msdk.foundation.same.report.d.b bVar2) {
            WeakReference<InterVideoOutListener> weakReference = cVar.f15014b;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (cVar.f15015c.get() == 2 || cVar.f15016d == null) {
                return;
            }
            a.this.X = true;
            String b3 = bVar != null ? bVar.b() : "";
            if (b3.contains("resource load timeout")) {
                a.this.W = true;
            }
            if (a.this.X && a.this.W && !a.this.V) {
                cVar.f15015c.set(2);
                if (interVideoOutListener != null) {
                    Message obtain = Message.obtain();
                    obtain.obj = b3;
                    obtain.what = 16;
                    if (bVar2 != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("metrics_data_lrid", bVar2.f());
                        obtain.setData(bundle);
                    }
                    cVar.f15016d.sendMessage(obtain);
                }
                if (bVar2 == null) {
                    bVar2 = new com.mbridge.msdk.foundation.same.report.d.b();
                }
                bVar2.a(true);
                a.a(a.this, "2000047", bVar2, interVideoOutListener);
            }
        }
    }

    /* loaded from: classes4.dex */
    public final class d extends com.mbridge.msdk.video.bt.module.b.b {

        /* renamed from: d, reason: collision with root package name */
        private a f15019d;

        /* renamed from: e, reason: collision with root package name */
        private Handler f15020e;

        /* renamed from: f, reason: collision with root package name */
        private int f15021f;

        @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
        public final void b(String str, String str2) {
            try {
                a aVar = this.f15019d;
                if (aVar != null && aVar.f14966p != null) {
                    try {
                        this.f15019d.f14966p.onEndcardShow(a.this.f14970t);
                        com.mbridge.msdk.foundation.d.b.a().a(str2 + "_2", 2);
                    } catch (Exception e2) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("RewardVideoController", e2.getMessage());
                        }
                    }
                    this.f15021f = 6;
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", e10.getMessage());
                }
            }
        }

        private d(a aVar, Handler handler) {
            this.f15021f = 0;
            this.f15019d = aVar;
            this.f15020e = handler;
        }

        @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
        public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar) {
            a aVar = a.this;
            aVar.f14956c = false;
            try {
                com.mbridge.msdk.reward.a.a aVar2 = new com.mbridge.msdk.reward.a.a(aVar.f14969s, a.this.D);
                a aVar3 = this.f15019d;
                aVar2.a(bVar.f(), (aVar3 == null || aVar3.f14963m == null) ? "" : this.f15019d.f14963m.f14889c, 3, a.f14951b);
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", e2.getMessage());
                }
            }
            try {
                a aVar4 = this.f15019d;
                if (aVar4 != null) {
                    aVar4.K = true;
                    if (this.f15019d.f14963m != null) {
                        this.f15019d.f14963m.f14889c = "";
                    }
                    final a aVar5 = this.f15019d;
                    com.mbridge.msdk.foundation.same.f.b.b().execute(new Runnable() { // from class: com.mbridge.msdk.reward.b.a.5
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                if (a.this.R == null) {
                                    a.this.R = g.a(com.mbridge.msdk.foundation.controller.c.m().c());
                                }
                                h a = h.a(a.this.R);
                                if (a != null) {
                                    a.a(a.this.f14969s);
                                }
                            } catch (Throwable unused) {
                                ad.b("RewardVideoController", "can't find DailyPlayCapDao");
                            }
                        }
                    });
                    if (a.this.E) {
                        a.this.c();
                    }
                    a aVar6 = a.this;
                    aVar6.a("2000130", bVar, aVar6.f14966p, "");
                    this.f15689b = true;
                    if (this.f15019d.f14966p != null) {
                        this.f15019d.f14966p.onAdShow(a.this.f14970t);
                        this.f15021f = 2;
                    }
                }
            } catch (Throwable th2) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", th2.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
        public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar, boolean z10, com.mbridge.msdk.videocommon.b.c cVar) {
            try {
                a aVar = this.f15019d;
                if (aVar != null && aVar.f14966p != null) {
                    if (cVar == null) {
                        cVar = com.mbridge.msdk.videocommon.b.c.b(this.f15019d.f14972w);
                    }
                    if (a.this.E) {
                        a.this.c();
                        a.this.b();
                        com.mbridge.msdk.foundation.same.a.b.d(a.this.f14969s, a.this.a());
                    }
                    this.f15019d.f14966p.onAdClose(a.this.f14970t, new RewardInfo(z10, cVar.a(), String.valueOf(cVar.b())));
                    this.f15021f = 7;
                    this.f15019d.K = false;
                    a.this.J.clear();
                    this.f15019d = null;
                }
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000152", bVar, (com.mbridge.msdk.foundation.same.report.d.a.a) null);
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", e2.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
        public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar, String str) {
            try {
                a aVar = a.this;
                aVar.f14956c = false;
                if (this.f15019d != null) {
                    if (aVar.E) {
                        a.this.c();
                    }
                    this.f15019d.K = false;
                    a.this.a("2000131", bVar, this.f15019d.f14966p, str);
                    this.f15690c = true;
                    if (this.f15019d.f14966p != null) {
                        try {
                            this.f15019d.f14966p.onShowFail(bVar, a.this.f14970t, str);
                        } catch (Exception e2) {
                            if (MBridgeConstans.DEBUG) {
                                ad.b("RewardVideoController", e2.getMessage());
                            }
                        }
                        this.f15021f = 4;
                    }
                }
            } catch (Exception e10) {
                this.f15021f = 0;
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", e10.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
        public final void a(boolean z10, String str, String str2) {
            try {
                a aVar = this.f15019d;
                if (aVar == null || aVar.f14966p == null) {
                    return;
                }
                if (a.this.E) {
                    a.this.c();
                }
                this.f15019d.K = false;
                try {
                    this.f15019d.f14966p.onVideoAdClicked(z10, a.this.f14970t);
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardVideoController", e2.getMessage());
                    }
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", e10.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
        public final void a(String str, String str2) {
            try {
                a aVar = this.f15019d;
                if (aVar == null || aVar.f14966p == null) {
                    return;
                }
                try {
                    this.f15019d.f14966p.onVideoComplete(a.this.f14970t);
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardVideoController", e2.getMessage());
                    }
                }
                this.f15021f = 5;
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", e10.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
        public final void a(boolean z10, int i10) {
            try {
                a aVar = this.f15019d;
                if (aVar != null && aVar.f14966p != null) {
                    try {
                        this.f15019d.f14966p.onAdCloseWithIVReward(a.this.f14970t, new RewardInfo(z10, i10));
                    } catch (Exception e2) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("RewardVideoController", e2.getMessage());
                        }
                    }
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", e10.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
        public final void a(int i10, String str, String str2) {
            this.f15021f = i10;
            a aVar = this.f15019d;
            if (aVar == null || aVar.E || this.f15019d.D || this.f15019d.f14964n == null || !this.f15019d.f14964n.s(this.f15021f) || this.f15019d.f14967q == null || c.a(this.f15019d.f14967q) == 1 || c.a(this.f15019d.f14967q) == 3 || a.this.J.contains(Integer.valueOf(this.f15021f))) {
                return;
            }
            a.this.J.add(Integer.valueOf(this.f15021f));
            int A = this.f15019d.f14964n.A() * 1000;
            if (this.f15021f == 4) {
                A = 3000;
            }
            Handler handler = this.f15020e;
            if (handler != null) {
                handler.removeMessages(1001001);
                this.f15020e.sendEmptyMessageDelayed(1001001, A);
            } else {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.mbridge.msdk.reward.b.a.d.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11;
                        if (d.this.f15019d != null) {
                            com.mbridge.msdk.foundation.same.report.d.c a = com.mbridge.msdk.foundation.same.report.d.c.a();
                            if (a.this.D) {
                                i11 = 287;
                            } else {
                                i11 = 94;
                            }
                            d.this.f15019d.a(false, a.a(0, i11, a.this.f14969s, true, 1));
                        }
                    }
                }, A);
            }
        }
    }

    public static void insertExcludeId(String str, CampaignEx campaignEx) {
        if (!TextUtils.isEmpty(str) && campaignEx != null && com.mbridge.msdk.foundation.controller.c.m().c() != null) {
            i a = i.a(g.a(com.mbridge.msdk.foundation.controller.c.m().c()));
            f fVar = new f();
            fVar.a(System.currentTimeMillis());
            fVar.b(str);
            fVar.a(campaignEx.getId());
            a.a(fVar);
        }
    }

    private void p() {
        e.a(g.a(this.f14962l)).a(this.f14969s);
    }

    private void q() {
        try {
            List<CampaignEx> b3 = e.a(g.a(this.f14962l)).b(this.f14969s);
            if (b3 == null || b3.size() <= 0) {
                return;
            }
            for (CampaignEx campaignEx : b3) {
                if (!TextUtils.isEmpty(campaignEx.getCMPTEntryUrl())) {
                    com.mbridge.msdk.videocommon.a.b(this.f14969s + "_" + campaignEx.getRequestId() + "_" + campaignEx.getCMPTEntryUrl());
                    if (campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().e())) {
                        com.mbridge.msdk.videocommon.a.b(this.f14969s + "_" + campaignEx.getId() + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().e());
                    }
                } else {
                    com.mbridge.msdk.videocommon.a.b(campaignEx.getAdType(), campaignEx);
                }
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardVideoController", e2.getMessage());
            }
        }
    }

    private void r() {
        com.mbridge.msdk.reward.adapter.c cVar = new com.mbridge.msdk.reward.adapter.c(this.f14962l, this.f14971v, this.f14969s);
        this.f14963m = cVar;
        cVar.b(this.D);
        this.f14963m.c(this.E);
        if (this.D) {
            this.f14963m.a(this.A, this.B, this.C);
        }
        this.f14963m.a(this.f14964n);
    }

    private boolean s() {
        try {
            if (this.R == null) {
                this.R = g.a(com.mbridge.msdk.foundation.controller.c.m().c());
            }
            h a = h.a(this.R);
            if (this.f14964n == null) {
                this.f14964n = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.f14969s, this.D);
            }
            int d10 = this.f14964n.d();
            if (a != null) {
                return a.a(this.f14969s, d10);
            }
            return false;
        } catch (Throwable unused) {
            ad.b("RewardVideoController", "cap check error");
            return false;
        }
    }

    public final List<CampaignEx> f() {
        return this.f14955aa;
    }

    public final com.mbridge.msdk.reward.adapter.c g() {
        return this.f14963m;
    }

    public final boolean h() {
        return this.H;
    }

    public final String i() {
        return this.f14969s;
    }

    public final String j() {
        return this.f14971v;
    }

    public final c k() {
        return this.f14967q;
    }

    public final InterVideoOutListener l() {
        return this.f14966p;
    }

    public final boolean m() {
        return this.E;
    }

    public final MBridgeIds n() {
        return this.f14970t;
    }

    public final boolean o() {
        return this.D;
    }

    private boolean e(boolean z10) {
        if (z10) {
            d("is_ready_start", "");
        }
        if (this.f14963m == null) {
            r();
        }
        List<com.mbridge.msdk.foundation.entity.c> a = com.mbridge.msdk.videocommon.a.a.a().a(this.f14969s);
        if (a == null || a.size() <= 0) {
            if (!z10) {
                return false;
            }
            d("is_ready_ctir_false", "no effective campaign list");
            return false;
        }
        String b3 = com.mbridge.msdk.foundation.same.a.b.b(this.f14969s);
        boolean a10 = TextUtils.isEmpty(b3) ? false : a(a, b3);
        if (z10) {
            d("is_ready_ctir_" + a10, "");
        }
        if (a10) {
            return a10;
        }
        for (com.mbridge.msdk.foundation.entity.c cVar : a) {
            if (cVar != null) {
                this.f14963m.a(cVar.a());
                this.f14963m.f14890d = cVar.d();
                if (this.f14963m.d(z10)) {
                    return true;
                }
            }
        }
        return a10;
    }

    public final void b(boolean z10) {
        this.E = z10;
    }

    public final void c(boolean z10) {
        this.I = z10;
    }

    public final boolean d(boolean z10) {
        try {
            if (s()) {
                if (!z10) {
                    return false;
                }
                d("is_ready_start", "over cap check error");
                return false;
            }
            if (this.E) {
                try {
                    return e(z10);
                } catch (Exception e2) {
                    if (!MBridgeConstans.DEBUG) {
                        return false;
                    }
                    ad.b("RewardVideoController", e2.getMessage());
                    return false;
                }
            }
            if (this.f14963m == null) {
                r();
            }
            com.mbridge.msdk.reward.adapter.c cVar = this.f14963m;
            if (cVar != null) {
                return cVar.b();
            }
            return false;
        } catch (Throwable th2) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            ad.b("RewardVideoController", th2.getMessage());
            return false;
        }
    }

    /* renamed from: com.mbridge.msdk.reward.b.a$4, reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass4 implements b.i {
        com.mbridge.msdk.foundation.same.report.d.b a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f14995b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CopyOnWriteArrayList f14996c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.reward.adapter.c f14997d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f14998e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f14999f;

        public AnonymousClass4(CampaignEx campaignEx, CopyOnWriteArrayList copyOnWriteArrayList, com.mbridge.msdk.reward.adapter.c cVar, boolean z10, int i10) {
            this.f14995b = campaignEx;
            this.f14996c = copyOnWriteArrayList;
            this.f14997d = cVar;
            this.f14998e = z10;
            this.f14999f = i10;
            this.a = com.mbridge.msdk.foundation.same.report.d.c.a().b().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.i
        public final void a(final String str, final String str2, final String str3, String str4) {
            a.this.f14958h = true;
            if (!a.this.f14957g || a.this.f14959i || a.this.f14974y == null) {
                return;
            }
            a.this.f14959i = true;
            a.this.f14974y.post(new Runnable() { // from class: com.mbridge.msdk.reward.b.a.4.1
                @Override // java.lang.Runnable
                public final void run() {
                    com.mbridge.msdk.reward.adapter.b a = com.mbridge.msdk.reward.adapter.b.a();
                    boolean z10 = a.this.I;
                    Handler handler = a.this.f14974y;
                    boolean z11 = a.this.D;
                    boolean z12 = a.this.E;
                    String str5 = str3;
                    String requestIdNotice = AnonymousClass4.this.f14995b.getRequestIdNotice();
                    String str6 = str;
                    String str7 = str2;
                    String cMPTEntryUrl = AnonymousClass4.this.f14995b.getCMPTEntryUrl();
                    int i10 = a.this.f14975z;
                    AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                    a.a(z10, handler, z11, z12, str5, requestIdNotice, str6, str7, cMPTEntryUrl, i10, anonymousClass4.f14995b, anonymousClass4.f14996c, H5DownLoadManager.getInstance().getH5ResAddress(AnonymousClass4.this.f14995b.getCMPTEntryUrl()), str2, a.this.f14964n, new b.j() { // from class: com.mbridge.msdk.reward.b.a.4.1.1
                        @Override // com.mbridge.msdk.reward.adapter.b.j
                        public final void a(String str8, String str9, String str10, String str11, String str12, a.C0214a c0214a) {
                            AnonymousClass4 anonymousClass42 = AnonymousClass4.this;
                            com.mbridge.msdk.reward.adapter.c cVar = anonymousClass42.f14997d;
                            if (cVar != null && cVar.a(anonymousClass42.f14996c, anonymousClass42.f14998e, anonymousClass42.f14999f)) {
                                if (a.this.f14967q == null || a.this.f14961k) {
                                    return;
                                }
                                a.this.f14961k = true;
                                ad.a("RewardVideoController", "Cache onVideoLoadSuccess");
                                AnonymousClass4 anonymousClass43 = AnonymousClass4.this;
                                a.this.a(anonymousClass43.f14996c);
                                AnonymousClass4 anonymousClass44 = AnonymousClass4.this;
                                com.mbridge.msdk.foundation.same.report.d.b bVar = anonymousClass44.a;
                                if (bVar != null) {
                                    bVar.b(anonymousClass44.f14996c);
                                }
                                a.this.f14967q.b(str9, str10, AnonymousClass4.this.a);
                                return;
                            }
                            a aVar = a.this;
                            a.a(aVar, str10, aVar.f14955aa);
                            if (a.this.f14967q == null || a.this.f14960j) {
                                return;
                            }
                            a.this.f14960j = true;
                            com.mbridge.msdk.foundation.c.b b3 = com.mbridge.msdk.foundation.c.a.b(880015, "errorCode: 3505 errorMessage: tpl temp preload success but isReady false");
                            AnonymousClass4 anonymousClass45 = AnonymousClass4.this;
                            if (anonymousClass45.a == null) {
                                anonymousClass45.a = new com.mbridge.msdk.foundation.same.report.d.b();
                            }
                            AnonymousClass4 anonymousClass46 = AnonymousClass4.this;
                            anonymousClass46.a.b(anonymousClass46.f14996c);
                            AnonymousClass4.this.a.a(b3);
                            c.a(a.this.f14967q, b3, AnonymousClass4.this.a);
                        }

                        @Override // com.mbridge.msdk.reward.adapter.b.j
                        public final void a(String str8, String str9, String str10, a.C0214a c0214a, com.mbridge.msdk.foundation.c.b bVar) {
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            a aVar = a.this;
                            a.a(aVar, str2, aVar.f14955aa);
                            if (a.this.f14967q == null || a.this.f14960j) {
                                return;
                            }
                            a.this.f14960j = true;
                            if (bVar != null) {
                                bVar.a("errorCode: 3303 errorMessage: tpl temp preload failed");
                            }
                            AnonymousClass4 anonymousClass42 = AnonymousClass4.this;
                            if (anonymousClass42.a == null) {
                                anonymousClass42.a = new com.mbridge.msdk.foundation.same.report.d.b();
                            }
                            AnonymousClass4 anonymousClass43 = AnonymousClass4.this;
                            anonymousClass43.a.b(anonymousClass43.f14996c);
                            AnonymousClass4.this.a.a(bVar);
                            c.a(a.this.f14967q, bVar, AnonymousClass4.this.a);
                        }
                    }, true);
                }
            });
        }

        @Override // com.mbridge.msdk.reward.adapter.b.i
        public final void a(String str, String str2, com.mbridge.msdk.foundation.c.b bVar) {
            String str3;
            if (bVar != null) {
                str3 = bVar.d().getUnitId();
                bVar.a("errorCode: 3203 errorMessage: tpl temp resource download failed");
            } else {
                str3 = "";
            }
            a aVar = a.this;
            a.a(aVar, str3, aVar.f14955aa);
            if (this.a == null) {
                this.a = new com.mbridge.msdk.foundation.same.report.d.b();
            }
            this.a.a(bVar);
            this.a.b(this.f14996c);
            a.this.f14958h = false;
            if (a.this.f14967q == null || a.this.f14960j) {
                return;
            }
            a.this.f14960j = true;
            c.a(a.this.f14967q, bVar, this.a);
        }
    }

    public final void b() {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (!this.K || (concurrentHashMap = O) == null || concurrentHashMap.containsKey(a())) {
            return;
        }
        O.remove(a());
    }

    public final void c() {
        try {
            String str = "";
            MBridgeIds mBridgeIds = this.f14970t;
            if (mBridgeIds != null) {
                if (!this.K) {
                    mBridgeIds.setBidToken("");
                    return;
                }
                String a = a();
                if (TextUtils.isEmpty(a)) {
                    return;
                }
                ConcurrentHashMap<String, String> concurrentHashMap = O;
                if (concurrentHashMap != null && concurrentHashMap.containsKey(a) && !TextUtils.isEmpty(O.get(a))) {
                    str = O.get(a);
                }
                this.f14970t.setBidToken(str);
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    public final void a(boolean z10) {
        this.D = z10;
        if (z10) {
            this.f14975z = com.mbridge.msdk.foundation.same.a.W;
        } else {
            this.f14975z = com.mbridge.msdk.foundation.same.a.V;
        }
    }

    public final void b(String str, String str2) {
        try {
            this.f14962l = com.mbridge.msdk.foundation.controller.c.m().c();
            this.f14969s = str2;
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            this.f14971v = str;
            this.f14970t = new MBridgeIds(this.f14971v, this.f14969s);
            this.f14965o = com.mbridge.msdk.videocommon.d.b.a().b();
            com.mbridge.msdk.foundation.same.f.b.b().execute(new com.mbridge.msdk.reward.b.c(this.f14962l, this.f14969s));
            if (this.R == null) {
                this.R = g.a(com.mbridge.msdk.foundation.controller.c.m().c());
            }
        } catch (Throwable th2) {
            ad.b("RewardVideoController", th2.getMessage(), th2);
        }
    }

    public final void a(int i10) {
        this.f14975z = i10;
    }

    public final String a() {
        com.mbridge.msdk.reward.adapter.c cVar = this.f14963m;
        return cVar != null ? cVar.a(this.K) : "";
    }

    public final void a(String str, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str)) {
            al.b(this.f14962l, "MBridge_ConfirmTitle" + this.f14969s, str.trim());
        }
        if (!TextUtils.isEmpty(str2)) {
            al.b(this.f14962l, "MBridge_ConfirmContent" + this.f14969s, str2.trim());
        }
        if (!TextUtils.isEmpty(str4)) {
            al.b(this.f14962l, "MBridge_CancelText" + this.f14969s, str4.trim());
        }
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        al.b(this.f14962l, "MBridge_ConfirmText" + this.f14969s, str3.trim());
    }

    private boolean c(String str, String str2) {
        try {
            com.mbridge.msdk.reward.adapter.c cVar = this.f14963m;
            if (cVar == null || !str.equals(cVar.a())) {
                com.mbridge.msdk.reward.adapter.c cVar2 = new com.mbridge.msdk.reward.adapter.c(this.f14962l, this.f14971v, str);
                this.f14963m = cVar2;
                cVar2.b(this.D);
                this.f14963m.c(this.E);
            }
            this.f14963m.a(this.f14975z);
            this.f14963m.a(this.f14964n);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardVideoController", e2.getMessage());
            }
        }
        List<CampaignEx> a = com.mbridge.msdk.videocommon.a.a.a().a(str, 1, this.E);
        this.f14955aa = com.mbridge.msdk.videocommon.a.a.a().b(str, 1, this.E);
        if (a != null && a.size() > 0) {
            com.mbridge.msdk.videocommon.a.a.a().a(str, a, str2);
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.Z;
            if (copyOnWriteArrayList == null) {
                this.Z = new CopyOnWriteArrayList<>();
            } else {
                copyOnWriteArrayList.clear();
            }
            for (CampaignEx campaignEx : a) {
                campaignEx.setLocalRequestId(str2);
                this.Z.add(campaignEx);
            }
            a(this.Z);
            return true;
        }
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = this.Z;
        if (copyOnWriteArrayList2 == null) {
            return false;
        }
        copyOnWriteArrayList2.clear();
        return false;
    }

    public final String d() {
        com.mbridge.msdk.reward.adapter.c cVar = this.f14963m;
        return cVar != null ? cVar.f() : "";
    }

    private com.mbridge.msdk.foundation.same.report.d.b b(boolean z10, String str, com.mbridge.msdk.foundation.same.report.d.d dVar) {
        List<String> e2;
        String a;
        com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
        try {
            if (z10) {
                try {
                    e a10 = e.a(g.a(this.f14962l));
                    if (a10 != null && (e2 = a10.e(this.f14969s)) != null && e2.size() > 0) {
                        Iterator<String> it = e2.iterator();
                        while (it.hasNext()) {
                            com.mbridge.msdk.foundation.same.report.d.c.a().c(it.next());
                        }
                    }
                    LinkedHashMap<String, com.mbridge.msdk.foundation.same.report.d.b> b3 = com.mbridge.msdk.foundation.same.report.d.c.a().b();
                    if (b3 != null && b3.size() > 0) {
                        Iterator<Map.Entry<String, com.mbridge.msdk.foundation.same.report.d.b>> it2 = b3.entrySet().iterator();
                        while (it2.hasNext()) {
                            Map.Entry<String, com.mbridge.msdk.foundation.same.report.d.b> next = it2.next();
                            if (next != null && next.getValue().s()) {
                                it2.remove();
                            }
                        }
                    }
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        e10.printStackTrace();
                    }
                }
            }
            if (TextUtils.isEmpty(str)) {
                a = SameMD5.getMD5(ai.d());
            } else {
                a = a(str);
            }
            bVar = com.mbridge.msdk.foundation.same.report.d.c.a().b(a);
            if (bVar == null) {
                com.mbridge.msdk.foundation.same.report.d.b bVar2 = new com.mbridge.msdk.foundation.same.report.d.b();
                try {
                    com.mbridge.msdk.foundation.same.report.d.c.a().b().put(a, bVar2);
                    bVar2.d(true);
                    bVar = bVar2;
                } catch (Exception e11) {
                    e = e11;
                    bVar = bVar2;
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardVideoController", e.getMessage());
                    }
                    return bVar;
                }
            }
            bVar.c(a);
            bVar.d(this.f14969s);
            if (dVar != null) {
                if (dVar.a("adtp")) {
                    bVar.b(Integer.parseInt((String) dVar.b("adtp")));
                }
                if (dVar.a(CampaignEx.JSON_KEY_HB)) {
                    String str2 = (String) dVar.b(CampaignEx.JSON_KEY_HB);
                    bVar.i(str2);
                    if (str2.equals("1")) {
                        bVar.e(str);
                    }
                }
            }
            bVar.b(z10 ? MBridgeConstans.API_REUQEST_CATEGORY_APP : "1");
            if (z10) {
                com.mbridge.msdk.reward.c.a.a.a().a("2000123", bVar);
            }
        } catch (Exception e12) {
            e = e12;
        }
        return bVar;
    }

    private void d(String str, String str2) {
        try {
            com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
            bVar.d(this.f14969s);
            bVar.b(this.D ? 287 : 94);
            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
            dVar.a("event_name", str);
            dVar.a("reason", str2);
            bVar.a("m_temp_is_ready_check", dVar);
            com.mbridge.msdk.reward.c.a.a.a().a("m_temp_is_ready_check", bVar);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    public final CopyOnWriteArrayList<CampaignEx> e() {
        return this.Z;
    }

    public final void a(int i10, int i11, int i12) {
        this.A = i10;
        this.B = i11;
        if (i11 == com.mbridge.msdk.foundation.same.a.J) {
            this.C = i12 < 0 ? 5 : i12;
        }
        if (i11 == com.mbridge.msdk.foundation.same.a.I) {
            this.C = i12 < 0 ? 80 : i12;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ivRewardEnable", 1);
            jSONObject.put("ivRewardMode", i10 == com.mbridge.msdk.foundation.same.a.G ? 0 : 1);
            jSONObject.put("ivRewardPlayValueMode", i11 == com.mbridge.msdk.foundation.same.a.I ? 0 : 1);
            jSONObject.put("ivRewardPlayValue", i12);
            com.mbridge.msdk.c.h.a().f(this.f14969s, jSONObject.toString());
        } catch (Exception unused) {
            ad.b("RewardVideoController", "setIVRewardEnable to SP was ERROR");
        }
    }

    /* renamed from: com.mbridge.msdk.reward.b.a$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass2 implements b.c {
        com.mbridge.msdk.foundation.same.report.d.b a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f14976b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f14977c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.reward.adapter.c f14978d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f14979e;

        public AnonymousClass2(CampaignEx campaignEx, boolean z10, com.mbridge.msdk.reward.adapter.c cVar, int i10) {
            this.f14976b = campaignEx;
            this.f14977c = z10;
            this.f14978d = cVar;
            this.f14979e = i10;
            this.a = com.mbridge.msdk.foundation.same.report.d.c.a().b().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.c
        public final void a(final String str, final String str2, final String str3, final CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            a.this.f14957g = true;
            if (!this.f14977c) {
                Iterator<CampaignEx> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    final CampaignEx next = it.next();
                    if (next != null && next.getRewardTemplateMode() != null && !TextUtils.isEmpty(next.getRewardTemplateMode().e()) && !next.getRewardTemplateMode().e().contains(CampaignEx.KEY_IS_CMPT_ENTRY) && a.this.f14974y != null) {
                        a.this.f14974y.post(new Runnable() { // from class: com.mbridge.msdk.reward.b.a.2.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.mbridge.msdk.reward.adapter.b.a().a(a.this.I, a.this.f14974y, a.this.D, a.this.E, null, next.getRewardTemplateMode().e(), a.this.f14975z, AnonymousClass2.this.f14976b, copyOnWriteArrayList, H5DownLoadManager.getInstance().getH5ResAddress(next.getRewardTemplateMode().e()), str, str2, str3, next.getRequestIdNotice(), a.this.f14964n, new b.j() { // from class: com.mbridge.msdk.reward.b.a.2.1.1
                                    @Override // com.mbridge.msdk.reward.adapter.b.j
                                    public final void a(String str4, String str5, String str6, String str7, String str8, a.C0214a c0214a) {
                                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                        com.mbridge.msdk.reward.adapter.c cVar = anonymousClass2.f14978d;
                                        if (cVar != null && cVar.a(copyOnWriteArrayList, anonymousClass2.f14977c, anonymousClass2.f14979e)) {
                                            if (a.this.f14967q == null || a.this.f14961k) {
                                                return;
                                            }
                                            a.this.f14961k = true;
                                            AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                                            a.this.a(copyOnWriteArrayList);
                                            a.this.f14967q.b(str5, str6, AnonymousClass2.this.a);
                                            return;
                                        }
                                        a aVar = a.this;
                                        a.a(aVar, str6, aVar.f14955aa);
                                        if (a.this.f14967q == null || a.this.f14960j) {
                                            return;
                                        }
                                        a.this.f14960j = true;
                                        com.mbridge.msdk.foundation.c.b b3 = com.mbridge.msdk.foundation.c.a.b(880015, "errorCode: 3502 errorMessage: temp preload success but isReady false");
                                        AnonymousClass2 anonymousClass22 = AnonymousClass2.this;
                                        if (anonymousClass22.a == null) {
                                            anonymousClass22.a = new com.mbridge.msdk.foundation.same.report.d.b();
                                        }
                                        AnonymousClass1 anonymousClass13 = AnonymousClass1.this;
                                        AnonymousClass2.this.a.b(copyOnWriteArrayList);
                                        AnonymousClass2.this.a.a(b3);
                                        c.a(a.this.f14967q, b3, AnonymousClass2.this.a);
                                    }

                                    @Override // com.mbridge.msdk.reward.adapter.b.j
                                    public final void a(String str4, String str5, String str6, a.C0214a c0214a, com.mbridge.msdk.foundation.c.b bVar) {
                                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                        a aVar = a.this;
                                        a.a(aVar, str2, aVar.f14955aa);
                                        if (a.this.f14967q == null || a.this.f14960j) {
                                            return;
                                        }
                                        a.this.f14960j = true;
                                        bVar.a("errorCode: 3301 errorMessage: temp preload failed");
                                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                        if (anonymousClass2.a == null) {
                                            anonymousClass2.a = new com.mbridge.msdk.foundation.same.report.d.b();
                                        }
                                        AnonymousClass2 anonymousClass22 = AnonymousClass2.this;
                                        anonymousClass22.a.b(a.this.Z);
                                        AnonymousClass2.this.a.a(bVar);
                                        c.a(a.this.f14967q, bVar, AnonymousClass2.this.a);
                                    }
                                });
                            }
                        });
                    } else {
                        com.mbridge.msdk.reward.adapter.c cVar = this.f14978d;
                        if (cVar != null && cVar.a(copyOnWriteArrayList, this.f14977c, this.f14979e)) {
                            if (a.this.f14967q != null && !a.this.f14961k) {
                                a.this.f14961k = true;
                                ad.a("RewardVideoController", "Cache onVideoLoadSuccessForCache");
                                a.this.a(copyOnWriteArrayList);
                                com.mbridge.msdk.foundation.same.report.d.b bVar = this.a;
                                if (bVar != null) {
                                    bVar.b(copyOnWriteArrayList);
                                }
                                a.this.f14967q.b(str, str2, this.a);
                            }
                        } else {
                            a aVar = a.this;
                            a.a(aVar, str2, aVar.f14955aa);
                            if (a.this.f14967q != null && !a.this.f14960j) {
                                a.this.f14960j = true;
                                com.mbridge.msdk.foundation.c.b b3 = com.mbridge.msdk.foundation.c.a.b(880015, "errorCode: 3503 errorMessage: have no temp but isReady false");
                                if (this.a == null) {
                                    this.a = new com.mbridge.msdk.foundation.same.report.d.b();
                                }
                                this.a.b(a.this.Z);
                                this.a.a(b3);
                                c.a(a.this.f14967q, b3, this.a);
                            }
                        }
                    }
                }
                return;
            }
            if (!a.this.f14958h || a.this.f14959i || a.this.f14974y == null) {
                return;
            }
            a.this.f14959i = true;
            a.this.f14974y.post(new Runnable() { // from class: com.mbridge.msdk.reward.b.a.2.2
                @Override // java.lang.Runnable
                public final void run() {
                    com.mbridge.msdk.reward.adapter.b.a().a(a.this.I, a.this.f14974y, a.this.D, a.this.E, str3, AnonymousClass2.this.f14976b.getRequestIdNotice(), str, str2, AnonymousClass2.this.f14976b.getCMPTEntryUrl(), a.this.f14975z, AnonymousClass2.this.f14976b, copyOnWriteArrayList, H5DownLoadManager.getInstance().getH5ResAddress(AnonymousClass2.this.f14976b.getCMPTEntryUrl()), str2, a.this.f14964n, new b.j() { // from class: com.mbridge.msdk.reward.b.a.2.2.1
                        @Override // com.mbridge.msdk.reward.adapter.b.j
                        public final void a(String str4, String str5, String str6, String str7, String str8, a.C0214a c0214a) {
                            RunnableC01972 runnableC01972 = RunnableC01972.this;
                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                            com.mbridge.msdk.reward.adapter.c cVar2 = anonymousClass2.f14978d;
                            if (cVar2 != null && cVar2.a(copyOnWriteArrayList, anonymousClass2.f14977c, anonymousClass2.f14979e)) {
                                if (a.this.f14967q == null || a.this.f14961k) {
                                    return;
                                }
                                a.this.f14961k = true;
                                ad.a("RewardVideoController", "Cache onVideoLoadSuccessForCache");
                                RunnableC01972 runnableC019722 = RunnableC01972.this;
                                a.this.a(copyOnWriteArrayList);
                                RunnableC01972 runnableC019723 = RunnableC01972.this;
                                com.mbridge.msdk.foundation.same.report.d.b bVar2 = AnonymousClass2.this.a;
                                if (bVar2 != null) {
                                    bVar2.b(copyOnWriteArrayList);
                                }
                                a.this.f14967q.b(str5, str6, AnonymousClass2.this.a);
                                return;
                            }
                            a aVar2 = a.this;
                            a.a(aVar2, str6, aVar2.f14955aa);
                            if (a.this.f14967q == null || a.this.f14960j) {
                                return;
                            }
                            a.this.f14960j = true;
                            com.mbridge.msdk.foundation.c.b b10 = com.mbridge.msdk.foundation.c.a.b(880015, "errorCode: 3504 errorMessage: tpl temp preload success but isReady false");
                            AnonymousClass2 anonymousClass22 = AnonymousClass2.this;
                            if (anonymousClass22.a == null) {
                                anonymousClass22.a = new com.mbridge.msdk.foundation.same.report.d.b();
                            }
                            AnonymousClass2.this.a.a(b10);
                            RunnableC01972 runnableC019724 = RunnableC01972.this;
                            AnonymousClass2.this.a.b(copyOnWriteArrayList);
                            c.a(a.this.f14967q, b10, AnonymousClass2.this.a);
                        }

                        @Override // com.mbridge.msdk.reward.adapter.b.j
                        public final void a(String str4, String str5, String str6, a.C0214a c0214a, com.mbridge.msdk.foundation.c.b bVar2) {
                            RunnableC01972 runnableC01972 = RunnableC01972.this;
                            a aVar2 = a.this;
                            a.a(aVar2, str2, aVar2.f14955aa);
                            if (a.this.f14967q == null || a.this.f14960j) {
                                return;
                            }
                            a.this.f14960j = true;
                            if (bVar2 != null) {
                                bVar2.a("errorCode: 3302 errorMessage: tpl preload failed");
                            }
                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                            if (anonymousClass2.a == null) {
                                anonymousClass2.a = new com.mbridge.msdk.foundation.same.report.d.b();
                            }
                            RunnableC01972 runnableC019722 = RunnableC01972.this;
                            AnonymousClass2.this.a.b(copyOnWriteArrayList);
                            AnonymousClass2.this.a.a(bVar2);
                            c.a(a.this.f14967q, bVar2, AnonymousClass2.this.a);
                        }
                    }, true);
                }
            });
        }

        @Override // com.mbridge.msdk.reward.adapter.b.c
        public final void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.foundation.c.b bVar) {
            a.this.f14957g = false;
            a aVar = a.this;
            a.a(aVar, aVar.f14969s, a.this.f14955aa);
            if (a.this.f14967q == null || a.this.f14960j) {
                return;
            }
            a.this.f14960j = true;
            if (this.a == null) {
                this.a = new com.mbridge.msdk.foundation.same.report.d.b();
            }
            this.a.b(copyOnWriteArrayList);
            if (bVar != null) {
                bVar.a("errorCode: 3201 errorMessage: campaign resource download failed");
            }
            this.a.a(bVar);
            c.a(a.this.f14967q, bVar, this.a);
        }
    }

    public static void a(String str, int i10) {
        try {
            if (N == null || !an.b(str)) {
                return;
            }
            N.put(str, Integer.valueOf(i10));
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardVideoController", e2.getMessage());
            }
        }
    }

    public static void a(String str, String str2) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (concurrentHashMap = O) == null || concurrentHashMap.containsKey(str)) {
            return;
        }
        O.put(str, str2);
    }

    public final void a(InterVideoOutListener interVideoOutListener) {
        this.f14966p = interVideoOutListener;
        this.f14967q = new c(interVideoOutListener, this.f14974y, this.f14969s);
    }

    public final void a(boolean z10, com.mbridge.msdk.foundation.same.report.d.d dVar) {
        a(z10, "", dVar);
    }

    public final void a(boolean z10, String str, com.mbridge.msdk.foundation.same.report.d.d dVar) {
        com.mbridge.msdk.foundation.same.report.d.b b3 = b(z10, str, dVar);
        if (this.f14967q == null) {
            this.f14967q = new c(null, this.f14974y, this.f14969s);
        }
        if (this.f14967q != null && c.a(this.f14967q) == 1) {
            a(z10, b3);
            return;
        }
        if (this.f14967q != null && c.a(this.f14967q) == 3) {
            this.S = false;
        } else {
            this.S = true;
            if (this.f14967q != null) {
                c.a(this.f14967q, 1);
            }
        }
        this.H = z10;
        this.f14974y.removeMessages(1001001);
        this.V = false;
        this.U = false;
        this.W = false;
        this.X = false;
        q();
        p();
        com.mbridge.msdk.reward.adapter.b.a();
        try {
            if (TextUtils.isEmpty(str)) {
                if (this.D) {
                    com.mbridge.msdk.d.b.getInstance().addInterstitialList(this.f14971v, this.f14969s);
                } else {
                    com.mbridge.msdk.d.b.getInstance().addRewardList(this.f14971v, this.f14969s);
                }
            }
            if (this.E && TextUtils.isEmpty(str)) {
                b(b3);
                return;
            }
            if (com.mbridge.msdk.system.a.map == null) {
                a(b3);
                return;
            }
            com.mbridge.msdk.videocommon.d.c a = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.f14969s);
            this.f14964n = a;
            if (a == null) {
                this.Q = com.mbridge.msdk.foundation.controller.c.m().k();
                com.mbridge.msdk.videocommon.d.b.a().a(this.Q, com.mbridge.msdk.foundation.controller.c.m().b(), this.f14969s, new com.mbridge.msdk.videocommon.c.c() { // from class: com.mbridge.msdk.reward.b.a.1
                    @Override // com.mbridge.msdk.videocommon.c.c
                    public final void a(String str2) {
                    }

                    @Override // com.mbridge.msdk.videocommon.c.c
                    public final void b(String str2) {
                    }
                });
                this.f14964n = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.f14969s, this.D);
            }
            if (!TextUtils.isEmpty(this.f14971v)) {
                this.f14964n.b(this.f14971v);
            }
            int F = this.f14964n.F() * 1000;
            if (this.f14974y != null) {
                Message obtain = Message.obtain();
                obtain.what = 1001002;
                if (b3 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("metrics_data_lrid", b3.f());
                    obtain.setData(bundle);
                }
                this.f14974y.sendMessageDelayed(obtain, F);
            }
            this.P = this.f14964n.B();
            try {
                a(z10, str, b3);
            } catch (Exception e2) {
                if (this.f14967q != null) {
                    com.mbridge.msdk.foundation.c.b b10 = com.mbridge.msdk.foundation.c.a.b(880020, "load exception");
                    if (b3 != null) {
                        b3.a(b10);
                        b3.c(true);
                    }
                    this.f14967q.a(b10, b3);
                }
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", e2.getMessage());
                }
            }
        } catch (Exception e10) {
            if (this.f14967q != null) {
                com.mbridge.msdk.foundation.c.b b11 = com.mbridge.msdk.foundation.c.a.b(880001, "");
                if (b3 != null) {
                    b3.a(b11);
                    b3.c(true);
                }
                this.f14967q.a(b11, b3);
            }
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardVideoController", e10.getMessage());
            }
        }
    }

    private void b(com.mbridge.msdk.foundation.same.report.d.b bVar) {
        if (this.f14967q != null) {
            com.mbridge.msdk.foundation.c.b b3 = com.mbridge.msdk.foundation.c.a.b(880035, "");
            if (bVar != null) {
                bVar.a(b3);
                bVar.c(true);
            }
            c.a(this.f14967q, "bidToken is empty", bVar);
        }
    }

    private void a(com.mbridge.msdk.foundation.same.report.d.b bVar) {
        if (this.f14967q != null) {
            String a = com.mbridge.msdk.foundation.c.a.a(880001, "");
            com.mbridge.msdk.foundation.c.b b3 = com.mbridge.msdk.foundation.c.a.b(880001, "");
            if (bVar != null) {
                bVar.a(b3);
                bVar.c(true);
            }
            c.a(this.f14967q, a, bVar);
        }
    }

    private void a(boolean z10, com.mbridge.msdk.foundation.same.report.d.b bVar) {
        if (!this.H) {
            if (z10) {
                this.H = z10;
            }
        } else if (z10) {
            String a = com.mbridge.msdk.foundation.c.a.a(880016, "errorCode: 3501 errorMessage: current unit is loading");
            com.mbridge.msdk.foundation.c.b b3 = com.mbridge.msdk.foundation.c.a.b(880016, "errorCode: 3501 errorMessage: current unit is loading");
            if (bVar != null) {
                bVar.a(b3);
                bVar.c(true);
            }
            this.f14967q.a(a, bVar);
        }
    }

    private void a(boolean z10, String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
        com.mbridge.msdk.reward.a.a aVar;
        com.mbridge.msdk.reward.a.a aVar2;
        if (this.f14967q != null) {
            if (!this.E) {
                this.Y = c(this.f14969s, bVar.f());
                if (this.Y) {
                    if (!s()) {
                        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.Z;
                        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
                            return;
                        }
                        try {
                            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                            dVar.a("cache", 1);
                            bVar.a("2000127", dVar);
                            bVar.a("2000048", dVar);
                            bVar.a(copyOnWriteArrayList);
                        } catch (Exception e2) {
                            if (MBridgeConstans.DEBUG) {
                                ad.b("RewardVideoController", e2.getMessage());
                            }
                        }
                        c.a(this.f14967q, this.f14971v, this.f14969s, bVar);
                        CampaignEx campaignEx = copyOnWriteArrayList.get(0);
                        this.f14967q.a(this.E);
                        com.mbridge.msdk.reward.adapter.c cVar = this.f14963m;
                        if (cVar != null && cVar.a(copyOnWriteArrayList, !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()), campaignEx.getNscpt())) {
                            a(copyOnWriteArrayList);
                            this.f14967q.b(this.f14971v, this.f14969s, bVar);
                        } else {
                            a(copyOnWriteArrayList, this.f14963m);
                        }
                        if (this.S) {
                            com.mbridge.msdk.reward.adapter.c cVar2 = this.f14963m;
                            if (cVar2 != null) {
                                cVar2.a(this.Z);
                            }
                            a(this.P, z10, str, bVar);
                            return;
                        }
                        return;
                    }
                    ad.a("RewardVideoController", "非BID，本地存在可用的缓存，超过上限");
                    CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = this.Z;
                    if (copyOnWriteArrayList2 != null && copyOnWriteArrayList2.size() > 0) {
                        Iterator<CampaignEx> it = this.Z.iterator();
                        while (it.hasNext()) {
                            com.mbridge.msdk.videocommon.a.a.a().a(it.next(), this.f14969s);
                        }
                    }
                    com.mbridge.msdk.reward.adapter.c cVar3 = this.f14963m;
                    if (cVar3 != null) {
                        cVar3.a(this.Z);
                    }
                    if (z10) {
                        if (this.f14967q != null) {
                            String a = com.mbridge.msdk.foundation.c.a.a(880019, "");
                            bVar.a(com.mbridge.msdk.foundation.c.a.b(880019, ""));
                            bVar.c(true);
                            c.a(this.f14967q, a, bVar);
                            return;
                        }
                        return;
                    }
                    this.Y = false;
                    this.f14967q.a(this.E);
                    a(this.P, z10, str, bVar);
                    return;
                }
                if (!s()) {
                    this.Y = false;
                    com.mbridge.msdk.reward.adapter.c cVar4 = this.f14963m;
                    if (cVar4 != null) {
                        cVar4.a(this.Z);
                    }
                    this.f14967q.a(this.E);
                    a(this.P, z10, str, bVar);
                    return;
                }
                if (z10) {
                    if (this.f14967q != null) {
                        String a10 = com.mbridge.msdk.foundation.c.a.a(880019, "");
                        bVar.a(com.mbridge.msdk.foundation.c.a.b(880019, ""));
                        bVar.c(true);
                        c.a(this.f14967q, a10, bVar);
                        return;
                    }
                    return;
                }
                this.Y = false;
                com.mbridge.msdk.reward.adapter.c cVar5 = this.f14963m;
                if (cVar5 != null) {
                    cVar5.a(this.Z);
                }
                this.f14967q.a(this.E);
                a(this.P, z10, str, bVar);
                return;
            }
            CopyOnWriteArrayList<CampaignEx> a11 = com.mbridge.msdk.videocommon.a.a.a().a(this.f14969s, 1, this.E, "");
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList3 = null;
            if (a11 != null && a11.size() > 0) {
                if (!s()) {
                    CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList4 = new CopyOnWriteArrayList<>();
                    if (a11.size() > 0 && !TextUtils.isEmpty(str)) {
                        for (CampaignEx campaignEx2 : a11) {
                            if (campaignEx2 != null && str.equals(campaignEx2.getBidToken())) {
                                copyOnWriteArrayList4.add(campaignEx2);
                            }
                        }
                    }
                    if (copyOnWriteArrayList4.size() > 0) {
                        a(copyOnWriteArrayList4, str, bVar);
                        return;
                    }
                    try {
                        com.mbridge.msdk.reward.a.a aVar3 = new com.mbridge.msdk.reward.a.a(this.f14969s, this.D);
                        com.mbridge.msdk.foundation.b.c cVar6 = new com.mbridge.msdk.foundation.b.c();
                        if (aVar3.a(str)) {
                            if (this.f14963m == null) {
                                com.mbridge.msdk.reward.adapter.c cVar7 = new com.mbridge.msdk.reward.adapter.c(this.f14962l, this.f14971v, this.f14969s);
                                this.f14963m = cVar7;
                                cVar7.b(this.D);
                                this.f14963m.c(this.E);
                                if (this.D) {
                                    this.f14963m.a(this.A, this.B, this.C);
                                }
                                this.f14963m.a(this.f14975z);
                                this.f14963m.a(this.f14964n);
                            }
                            aVar2 = aVar3;
                            cVar6 = aVar3.a(str, bVar, (CampaignEx) null, new com.mbridge.msdk.foundation.c.b(880038), 1, this.f14963m);
                            if (cVar6 != null && cVar6.g() == com.mbridge.msdk.foundation.b.c.f12994d && cVar6.a() != null && cVar6.a().size() > 0 && this.f14963m != null) {
                                CopyOnWriteArrayList<CampaignEx> a12 = cVar6.a();
                                ArrayList arrayList = new ArrayList();
                                Iterator<CampaignEx> it2 = a11.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    CampaignEx next = it2.next();
                                    if (next != null) {
                                        String requestId = next.getRequestId();
                                        if (!TextUtils.isEmpty(requestId)) {
                                            for (int i10 = 0; i10 < a12.size(); i10++) {
                                                CampaignEx campaignEx3 = a12.get(i10);
                                                if (campaignEx3 != null) {
                                                    if (requestId.equals(campaignEx3.getRequestId())) {
                                                        break;
                                                    } else if (i10 == a12.size() - 1) {
                                                        arrayList.add(next);
                                                    }
                                                }
                                            }
                                            if (a12.size() == 0) {
                                                arrayList.add(next);
                                            }
                                        }
                                    }
                                }
                                this.f14963m.a(arrayList);
                                this.f14963m.a(cVar6.a(), false, true);
                                copyOnWriteArrayList3 = new CopyOnWriteArrayList<>(cVar6.a());
                            }
                        } else {
                            aVar2 = aVar3;
                            copyOnWriteArrayList3 = a(str, a11);
                            if (copyOnWriteArrayList3.size() > 0) {
                                com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).a(str, copyOnWriteArrayList3);
                            }
                            cVar6.d("cb is closed");
                            cVar6.a(com.mbridge.msdk.foundation.b.c.f12993c);
                        }
                        aVar2.a(bVar, str, cVar6, (List<a.C0167a>) null, (JSONObject) null, 1);
                        if (copyOnWriteArrayList3 != null && copyOnWriteArrayList3.size() > 0) {
                            a(copyOnWriteArrayList3, str, bVar);
                            if (this.f14963m != null && !aVar2.a(str)) {
                                this.f14963m.a(copyOnWriteArrayList3);
                            }
                        }
                    } catch (Exception e10) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("RewardVideoController", e10.getMessage());
                        }
                    }
                    this.Y = false;
                    this.f14967q.a(this.E);
                    a(this.P, z10, str, bVar);
                    return;
                }
                com.mbridge.msdk.videocommon.a.a.a().a(this.f14969s, str);
                if (!z10 || this.f14967q == null) {
                    return;
                }
                String a13 = com.mbridge.msdk.foundation.c.a.a(880019, "");
                com.mbridge.msdk.foundation.c.b b3 = com.mbridge.msdk.foundation.c.a.b(880019, "");
                if (bVar != null) {
                    bVar.a(b3);
                    bVar.c(true);
                }
                c.a(this.f14967q, a13, bVar);
                return;
            }
            if (!s()) {
                try {
                    com.mbridge.msdk.reward.a.a aVar4 = new com.mbridge.msdk.reward.a.a(this.f14969s, this.D);
                    com.mbridge.msdk.foundation.b.c cVar8 = new com.mbridge.msdk.foundation.b.c();
                    if (aVar4.a(str)) {
                        if (this.f14963m == null) {
                            com.mbridge.msdk.reward.adapter.c cVar9 = new com.mbridge.msdk.reward.adapter.c(this.f14962l, this.f14971v, this.f14969s);
                            this.f14963m = cVar9;
                            cVar9.b(this.D);
                            this.f14963m.c(this.E);
                            if (this.D) {
                                this.f14963m.a(this.A, this.B, this.C);
                            }
                            this.f14963m.a(this.f14975z);
                            this.f14963m.a(this.f14964n);
                        }
                        aVar = aVar4;
                        cVar8 = aVar4.a(str, bVar, (CampaignEx) null, new com.mbridge.msdk.foundation.c.b(880038), 1, this.f14963m);
                        if (cVar8 != null && cVar8.g() == com.mbridge.msdk.foundation.b.c.f12994d && cVar8.a() != null && cVar8.a().size() > 0 && this.f14963m != null) {
                            CopyOnWriteArrayList<CampaignEx> a14 = cVar8.a();
                            if (a11 != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Iterator<CampaignEx> it3 = a11.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    CampaignEx next2 = it3.next();
                                    if (next2 != null) {
                                        String requestId2 = next2.getRequestId();
                                        if (!TextUtils.isEmpty(requestId2)) {
                                            for (int i11 = 0; i11 < a14.size(); i11++) {
                                                CampaignEx campaignEx4 = a14.get(i11);
                                                if (campaignEx4 != null) {
                                                    if (requestId2.equals(campaignEx4.getRequestId())) {
                                                        break;
                                                    } else if (i11 == a14.size() - 1) {
                                                        arrayList2.add(next2);
                                                    }
                                                }
                                            }
                                            if (a14.size() == 0) {
                                                arrayList2.add(next2);
                                            }
                                        }
                                    }
                                }
                                this.f14963m.a(arrayList2);
                            }
                            this.f14963m.a(cVar8.a(), false, true);
                            copyOnWriteArrayList3 = new CopyOnWriteArrayList<>(cVar8.a());
                        }
                    } else {
                        aVar = aVar4;
                        copyOnWriteArrayList3 = a(str, a11);
                        if (copyOnWriteArrayList3.size() > 0) {
                            com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).a(str, copyOnWriteArrayList3);
                        }
                        cVar8.d("cb is closed 2");
                        cVar8.a(com.mbridge.msdk.foundation.b.c.f12993c);
                    }
                    aVar.a(bVar, str, cVar8, (List<a.C0167a>) null, (JSONObject) null, 1);
                    if (copyOnWriteArrayList3 != null && copyOnWriteArrayList3.size() > 0) {
                        a(copyOnWriteArrayList3, str, bVar);
                        if (this.f14963m != null && !aVar.a(str)) {
                            this.f14963m.a(copyOnWriteArrayList3);
                        }
                    }
                } catch (Exception e11) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardVideoController", e11.getMessage());
                    }
                }
                this.Y = false;
                this.f14967q.a(this.E);
                a(this.P, z10, str, bVar);
                return;
            }
            com.mbridge.msdk.videocommon.a.a.a().a(this.f14969s, str);
            if (!z10 || this.f14967q == null) {
                return;
            }
            String a15 = com.mbridge.msdk.foundation.c.a.a(880019, "");
            com.mbridge.msdk.foundation.c.b b10 = com.mbridge.msdk.foundation.c.a.b(880019, "");
            if (bVar != null) {
                bVar.a(b10);
                bVar.c(true);
            }
            c.a(this.f14967q, a15, bVar);
        }
    }

    private void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        try {
            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
            dVar.a("cache", 1);
            bVar.a("2000127", dVar);
            bVar.a("2000048", dVar);
            bVar.a(copyOnWriteArrayList);
        } catch (Exception e2) {
            ad.b("RewardVideoController", e2.getMessage());
        }
        this.Y = true;
        this.f14967q.a(this.E);
        c.a(this.f14967q, this.f14971v, this.f14969s, bVar);
        CampaignEx campaignEx = copyOnWriteArrayList.get(0);
        a(campaignEx.getRequestId(), str);
        com.mbridge.msdk.reward.adapter.c cVar = this.f14963m;
        if (cVar != null && cVar.a(copyOnWriteArrayList, true ^ TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()), campaignEx.getNscpt())) {
            a(copyOnWriteArrayList);
            this.f14967q.b(this.f14971v, this.f14969s, bVar);
        } else {
            a(copyOnWriteArrayList, this.f14963m);
        }
    }

    private CopyOnWriteArrayList<CampaignEx> a(String str, List<CampaignEx> list) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (list != null) {
            try {
                if (list.size() > 0) {
                    int i10 = 1;
                    for (CampaignEx campaignEx : list) {
                        if (campaignEx != null) {
                            if (campaignEx.getVcn() > i10) {
                                i10 = campaignEx.getVcn();
                            }
                            if (campaignEx.getTokenRule() == 1) {
                                String requestId = campaignEx.getRequestId();
                                if (!TextUtils.isEmpty(requestId)) {
                                    if (linkedHashMap.containsKey(requestId)) {
                                        List list2 = (List) linkedHashMap.get(requestId);
                                        if (list2 != null) {
                                            list2.add(campaignEx);
                                        }
                                    } else {
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(campaignEx);
                                        linkedHashMap.put(requestId, arrayList);
                                    }
                                }
                            } else {
                                String requestId2 = campaignEx.getRequestId();
                                if (!TextUtils.isEmpty(requestId2)) {
                                    if (linkedHashMap2.containsKey(requestId2)) {
                                        List list3 = (List) linkedHashMap2.get(requestId2);
                                        if (list3 != null) {
                                            list3.add(campaignEx);
                                        }
                                    } else {
                                        ArrayList arrayList2 = new ArrayList();
                                        arrayList2.add(campaignEx);
                                        linkedHashMap2.put(requestId2, arrayList2);
                                    }
                                }
                            }
                        }
                    }
                    if (linkedHashMap2.size() + linkedHashMap.size() >= i10 && linkedHashMap.size() > 0 && linkedHashMap.entrySet() != null && linkedHashMap.entrySet().iterator() != null && linkedHashMap.entrySet().iterator().next() != null && ((Map.Entry) linkedHashMap.entrySet().iterator().next()).getValue() != null) {
                        copyOnWriteArrayList.addAll((Collection) ((Map.Entry) linkedHashMap.entrySet().iterator().next()).getValue());
                        com.mbridge.msdk.foundation.same.a.b.a(this.f14969s, str, i10);
                    }
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", e2.getMessage());
                }
            }
        }
        return copyOnWriteArrayList;
    }

    private void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.reward.adapter.c cVar) {
        CampaignEx campaignEx = copyOnWriteArrayList.get(0);
        boolean z10 = !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl());
        int nscpt = campaignEx.getNscpt();
        this.f14957g = false;
        this.f14958h = false;
        this.f14959i = false;
        this.f14960j = false;
        this.f14961k = false;
        com.mbridge.msdk.reward.adapter.b.a().a(this.f14962l, z10, nscpt, this.E, this.D ? 287 : 94, this.f14971v, this.f14969s, campaignEx.getRequestId(), copyOnWriteArrayList, new AnonymousClass2(campaignEx, z10, cVar, nscpt), new b.i(campaignEx, copyOnWriteArrayList, z10, nscpt) { // from class: com.mbridge.msdk.reward.b.a.3
            com.mbridge.msdk.foundation.same.report.d.b a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ CampaignEx f14990b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ CopyOnWriteArrayList f14991c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f14992d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f14993e;

            {
                this.f14990b = campaignEx;
                this.f14991c = copyOnWriteArrayList;
                this.f14992d = z10;
                this.f14993e = nscpt;
                this.a = com.mbridge.msdk.foundation.same.report.d.c.a().b().get(campaignEx.getLocalRequestId());
            }

            @Override // com.mbridge.msdk.reward.adapter.b.i
            public final void a(String str, String str2, String str3, String str4) {
            }

            @Override // com.mbridge.msdk.reward.adapter.b.i
            public final void a(String str, String str2, com.mbridge.msdk.foundation.c.b bVar) {
                String unitId = bVar == null ? "" : bVar.d().getUnitId();
                a aVar = a.this;
                a.a(aVar, unitId, aVar.f14955aa);
                if (bVar != null) {
                    bVar.a("errorCode: 3202 errorMessage: temp resource download failed");
                }
                if (this.a == null) {
                    this.a = new com.mbridge.msdk.foundation.same.report.d.b();
                }
                this.a.b(this.f14991c);
                this.a.a(bVar);
                if (!this.f14992d && a.this.f14967q != null) {
                    if (a.this.f14960j) {
                        return;
                    }
                    a.this.f14960j = true;
                    c.a(a.this.f14967q, bVar, this.a);
                    return;
                }
                if (this.f14993e != 1 || a.this.f14960j || a.this.f14967q == null) {
                    return;
                }
                a.this.f14960j = true;
                c.a(a.this.f14967q, bVar, this.a);
            }
        });
        if (z10) {
            com.mbridge.msdk.reward.adapter.b.a().a(this.f14962l, campaignEx, this.f14971v, this.f14969s, campaignEx.getRequestId(), new AnonymousClass4(campaignEx, copyOnWriteArrayList, cVar, z10, nscpt));
        }
    }

    private void a(Queue<Integer> queue, boolean z10, String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
        Integer poll;
        int intValue;
        try {
            if (queue != null) {
                try {
                    if (queue.size() > 0 && (poll = queue.poll()) != null) {
                        intValue = poll.intValue();
                        a(1, intValue, z10, str, bVar);
                        return;
                    }
                } catch (Exception e2) {
                    com.mbridge.msdk.foundation.c.b b3 = com.mbridge.msdk.foundation.c.a.b(880020, "load mv api error:" + e2.getMessage());
                    if (bVar != null) {
                        bVar.a(b3);
                        bVar.c(true);
                    }
                    a(b3, bVar);
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardVideoController", e2.getMessage());
                        return;
                    }
                    return;
                }
            }
            a(1, intValue, z10, str, bVar);
            return;
        } catch (Exception e10) {
            com.mbridge.msdk.foundation.c.b b10 = com.mbridge.msdk.foundation.c.a.b(880020, "load mv api error:" + e10.getMessage());
            if (bVar != null) {
                bVar.a(b10);
                bVar.c(true);
            }
            a(b10, bVar);
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardVideoController", e10.getMessage());
                return;
            }
            return;
        }
        intValue = 25;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.foundation.c.b bVar, com.mbridge.msdk.foundation.same.report.d.b bVar2) {
        if (this.f14967q != null) {
            this.X = true;
            this.f14967q.a(bVar, bVar2);
        }
    }

    private void a(int i10, int i11, boolean z10, String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
        try {
            com.mbridge.msdk.reward.adapter.c cVar = this.f14963m;
            if (cVar == null || !this.f14969s.equals(cVar.a())) {
                com.mbridge.msdk.reward.adapter.c cVar2 = new com.mbridge.msdk.reward.adapter.c(this.f14962l, this.f14971v, this.f14969s);
                this.f14963m = cVar2;
                cVar2.b(this.D);
                this.f14963m.c(this.E);
            }
            if (this.D) {
                this.f14963m.a(this.A, this.B, this.C);
            }
            this.f14963m.a(this.f14975z);
            this.f14963m.a(this.f14964n);
            RunnableC0199a runnableC0199a = new RunnableC0199a(this.f14963m, i10, z10, str, bVar);
            runnableC0199a.a(i11);
            b bVar2 = new b(this.f14963m, z10);
            this.a = bVar2;
            bVar2.a(runnableC0199a);
            this.f14963m.a(this.a);
            this.f14963m.a(i10, i11, z10, str, this.I, bVar);
            this.f14974y.postDelayed(runnableC0199a, i11 * 1000);
        } catch (Exception e2) {
            com.mbridge.msdk.foundation.c.b b3 = com.mbridge.msdk.foundation.c.a.b(880020, e2.getMessage());
            if (bVar != null) {
                bVar.a(b3);
                bVar.c(true);
            }
            a(b3, bVar);
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardVideoController", e2.getMessage());
            }
        }
    }

    private void a(String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
        com.mbridge.msdk.videocommon.d.c cVar;
        com.mbridge.msdk.videocommon.d.c cVar2;
        boolean b3;
        boolean c10;
        try {
            if (this.f14963m == null) {
                r();
            }
            if (this.f14963m != null) {
                ad.b("RewardVideoController", "controller 819");
                if (this.E) {
                    b3 = e(false);
                } else {
                    b3 = this.f14963m.b();
                }
                if (b3) {
                    ad.c("RewardVideoController", "invoke adapter show isReady");
                    d dVar = new d(this, this.f14974y);
                    f14954f.put(this.f14969s, dVar);
                    this.f14963m.a(dVar, str, this.f14968r, this.f14975z, this.u, bVar);
                    this.f14956c = false;
                    return;
                }
                if (this.E) {
                    if (this.f14963m == null) {
                        r();
                    }
                    List<com.mbridge.msdk.foundation.entity.c> a = com.mbridge.msdk.videocommon.a.a.a().a(this.f14969s);
                    if (a != null && a.size() > 0) {
                        for (com.mbridge.msdk.foundation.entity.c cVar3 : a) {
                            if (cVar3 != null) {
                                this.f14963m.a(cVar3.a());
                                this.f14963m.f14890d = cVar3.d();
                                if (this.f14963m.c()) {
                                    c10 = true;
                                    break;
                                }
                                com.mbridge.msdk.videocommon.a.a.a().c(this.f14969s, cVar3.a());
                            }
                        }
                    }
                    c10 = false;
                } else {
                    c10 = this.f14963m.c();
                }
                if (c10) {
                    ad.c("RewardVideoController", "invoke adapter show isSpareOfferReady");
                    d dVar2 = new d(this, this.f14974y);
                    f14954f.put(this.f14969s, dVar2);
                    this.f14963m.a(dVar2, str, this.f14968r, this.f14975z, this.u, bVar);
                    this.f14956c = false;
                    return;
                }
            }
            this.f14956c = false;
            a("2000131", bVar, this.f14966p, "can't show because load is failed");
            if (this.f14966p != null) {
                try {
                    this.f14966p.onShowFail(bVar, this.f14970t, "can't show because load is failed");
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardVideoController", e2.getMessage());
                    }
                }
            }
            if (this.D || this.E || (cVar2 = this.f14964n) == null || !cVar2.s(4) || this.f14967q == null || c.a(this.f14967q) == 1 || c.a(this.f14967q) == 3) {
                return;
            }
            a(false, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, 94, this.f14969s, true, 1));
        } catch (Exception e10) {
            this.f14956c = false;
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardVideoController", e10.getLocalizedMessage());
            }
            a("2000131", bVar, this.f14966p, "show exception");
            if (this.f14966p != null) {
                try {
                    this.f14966p.onShowFail(bVar, this.f14970t, "show exception");
                } catch (Exception unused) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardVideoController", e10.getMessage());
                    }
                }
            }
            if (this.D || this.E || (cVar = this.f14964n) == null || !cVar.s(4) || this.f14967q == null || c.a(this.f14967q) == 1 || c.a(this.f14967q) == 3) {
                return;
            }
            a(false, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, 94, this.f14969s, true, 1));
        }
    }

    private boolean a(List<com.mbridge.msdk.foundation.entity.c> list, String str) {
        if (list == null) {
            return false;
        }
        for (com.mbridge.msdk.foundation.entity.c cVar : list) {
            if (cVar != null && str.equals(cVar.b())) {
                this.f14963m.a(cVar.a());
                this.f14963m.f14890d = cVar.d();
                if (this.f14963m.b()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r11, java.lang.String r12, java.lang.String r13, com.mbridge.msdk.foundation.same.report.d.d r14) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.b.a.a(java.lang.String, java.lang.String, java.lang.String, com.mbridge.msdk.foundation.same.report.d.d):void");
    }

    private com.mbridge.msdk.foundation.same.report.d.b a(com.mbridge.msdk.foundation.same.report.d.d dVar) {
        CampaignEx campaignEx;
        try {
            CopyOnWriteArrayList<CampaignEx> a = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f14969s);
            String str = "";
            if (a != null && a.size() > 0 && (campaignEx = a.get(0)) != null) {
                str = campaignEx.getCurrentLocalRid();
            }
            r0 = TextUtils.isEmpty(str) ? null : com.mbridge.msdk.foundation.same.report.d.c.a().b().get(str);
            if (r0 != null) {
                r0.b(a);
                r0.a("2000128", dVar);
                r0.c(str);
                r0.d(this.f14969s);
                com.mbridge.msdk.reward.c.a.a.a().a("2000128", r0);
                return r0;
            }
            com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
            try {
                bVar.d(this.f14969s);
                dVar.a("metrics_data_reason", "未获取到待展示的campaign信息 本地new metricsData");
                bVar.a("2000128", dVar);
                if (TextUtils.isEmpty(str)) {
                    bVar.c(SameMD5.getMD5(ai.d()));
                } else {
                    bVar.c(str);
                    bVar.b(a);
                    com.mbridge.msdk.foundation.same.report.d.c.a().b().put(str, bVar);
                }
                com.mbridge.msdk.reward.c.a.a.a().a("2000128", bVar);
                return bVar;
            } catch (Exception e2) {
                e = e2;
                r0 = bVar;
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", e.getMessage());
                }
                return r0;
            }
        } catch (Exception e10) {
            e = e10;
        }
    }

    public final void a(List<CampaignEx> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.M = list;
    }

    private String a(String str) {
        try {
            String md5 = TextUtils.isEmpty(str) ? SameMD5.getMD5(ai.d()) : "";
            String[] split = str.split("_");
            if (split != null && split.length >= 3) {
                md5 = split[2];
            }
            return TextUtils.isEmpty(md5) ? SameMD5.getMD5(ai.d()) : md5;
        } catch (Exception e2) {
            if (!MBridgeConstans.DEBUG) {
                return "";
            }
            e2.printStackTrace();
            return "";
        }
    }

    public final com.mbridge.msdk.foundation.same.report.d.b a(Message message) {
        com.mbridge.msdk.foundation.same.report.d.b bVar = null;
        if (message != null) {
            try {
                Bundle data = message.getData();
                if (data != null) {
                    bVar = com.mbridge.msdk.foundation.same.report.d.c.a().b(data.getString("metrics_data_lrid"));
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        }
        return bVar == null ? new com.mbridge.msdk.foundation.same.report.d.b() : bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, com.mbridge.msdk.foundation.same.report.d.b bVar, InterVideoOutListener interVideoOutListener, String str2) {
        if (bVar == null) {
            try {
                bVar = new com.mbridge.msdk.foundation.same.report.d.b();
                bVar.b(this.M);
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                    return;
                }
                return;
            }
        }
        com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
        if (!TextUtils.isEmpty(str2)) {
            dVar.a("reason", str2);
        }
        if (interVideoOutListener != null) {
            dVar.a("listener_state", 1);
        } else {
            dVar.a("listener_state", 2);
        }
        bVar.a(str, dVar);
        com.mbridge.msdk.reward.c.a.a.a().a(str, bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003d A[Catch: Exception -> 0x009f, TryCatch #0 {Exception -> 0x009f, blocks: (B:24:0x0009, B:26:0x000f, B:28:0x0016, B:29:0x002c, B:4:0x0036, B:8:0x003d, B:11:0x0072, B:13:0x0085, B:15:0x0093), top: B:23:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.mbridge.msdk.foundation.same.report.d.b a(java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r5, com.mbridge.msdk.foundation.same.report.d.b r6) {
        /*
            r4 = this;
            com.mbridge.msdk.foundation.same.report.d.b r0 = new com.mbridge.msdk.foundation.same.report.d.b
            r0.<init>()
            java.lang.String r1 = ""
            if (r5 == 0) goto L35
            int r2 = r5.size()     // Catch: java.lang.Exception -> L9f
            if (r2 <= 0) goto L35
            r2 = 0
            java.lang.Object r3 = r5.get(r2)     // Catch: java.lang.Exception -> L9f
            if (r3 == 0) goto L2b
            java.lang.Object r1 = r5.get(r2)     // Catch: java.lang.Exception -> L9f
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = (com.mbridge.msdk.foundation.entity.CampaignEx) r1     // Catch: java.lang.Exception -> L9f
            java.lang.String r1 = r1.getLocalRequestId()     // Catch: java.lang.Exception -> L9f
            java.lang.Object r2 = r5.get(r2)     // Catch: java.lang.Exception -> L9f
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = (com.mbridge.msdk.foundation.entity.CampaignEx) r2     // Catch: java.lang.Exception -> L9f
            java.lang.String r2 = r2.getNLRid()     // Catch: java.lang.Exception -> L9f
            goto L2c
        L2b:
            r2 = r1
        L2c:
            r0.c(r1)     // Catch: java.lang.Exception -> L9f
            r0.b(r5)     // Catch: java.lang.Exception -> L9f
            r5 = r1
            r1 = r2
            goto L36
        L35:
            r5 = r1
        L36:
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L9f
            if (r1 == 0) goto L3d
            return r6
        L3d:
            com.mbridge.msdk.foundation.same.report.d.d r6 = new com.mbridge.msdk.foundation.same.report.d.d     // Catch: java.lang.Exception -> L9f
            r6.<init>()     // Catch: java.lang.Exception -> L9f
            java.lang.String r1 = "cache"
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L9f
            r6.a(r1, r3)     // Catch: java.lang.Exception -> L9f
            java.lang.String r1 = "hb"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L9f
            r6.a(r1, r2)     // Catch: java.lang.Exception -> L9f
            java.lang.String r1 = "auto_load"
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L9f
            r6.a(r1, r2)     // Catch: java.lang.Exception -> L9f
            java.lang.String r1 = "2000127"
            r0.a(r1, r6)     // Catch: java.lang.Exception -> L9f
            java.lang.String r1 = "2000048"
            r0.a(r1, r6)     // Catch: java.lang.Exception -> L9f
            boolean r6 = r4.D     // Catch: java.lang.Exception -> L9f
            if (r6 == 0) goto L70
            r6 = 287(0x11f, float:4.02E-43)
            goto L72
        L70:
            r6 = 94
        L72:
            r0.b(r6)     // Catch: java.lang.Exception -> L9f
            java.lang.String r6 = "1"
            r0.i(r6)     // Catch: java.lang.Exception -> L9f
            java.lang.String r6 = "2"
            r0.b(r6)     // Catch: java.lang.Exception -> L9f
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L9f
            if (r6 != 0) goto La7
            com.mbridge.msdk.foundation.same.report.d.c r6 = com.mbridge.msdk.foundation.same.report.d.c.a()     // Catch: java.lang.Exception -> L9f
            java.util.LinkedHashMap r6 = r6.b()     // Catch: java.lang.Exception -> L9f
            boolean r6 = r6.containsKey(r5)     // Catch: java.lang.Exception -> L9f
            if (r6 != 0) goto La7
            com.mbridge.msdk.foundation.same.report.d.c r6 = com.mbridge.msdk.foundation.same.report.d.c.a()     // Catch: java.lang.Exception -> L9f
            java.util.LinkedHashMap r6 = r6.b()     // Catch: java.lang.Exception -> L9f
            r6.put(r5, r0)     // Catch: java.lang.Exception -> L9f
            goto La7
        L9f:
            r5 = move-exception
            boolean r6 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r6 == 0) goto La7
            r5.printStackTrace()
        La7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.b.a.a(java.util.List, com.mbridge.msdk.foundation.same.report.d.b):com.mbridge.msdk.foundation.same.report.d.b");
    }

    public static /* synthetic */ void a(a aVar, String str, List list) {
        if (list != null) {
            try {
                if (list.size() <= 0 || aVar.V) {
                    return;
                }
                e.a(g.a(com.mbridge.msdk.foundation.controller.c.m().c())).a((List<CampaignEx>) list, str);
            } catch (Throwable th2) {
                ad.b("RewardVideoController", th2.getMessage());
            }
        }
    }

    public static /* synthetic */ void a(a aVar, String str, com.mbridge.msdk.foundation.same.report.d.b bVar, InterVideoOutListener interVideoOutListener) {
        if (aVar.H) {
            if (bVar == null) {
                bVar = new com.mbridge.msdk.foundation.same.report.d.b();
                bVar.b(aVar.M);
            }
            try {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                if (interVideoOutListener != null) {
                    dVar.a("listener_state", 1);
                } else {
                    dVar.a("listener_state", 2);
                }
                bVar.a(str, dVar);
                com.mbridge.msdk.reward.c.a.a.a().a(str, bVar);
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        }
    }
}

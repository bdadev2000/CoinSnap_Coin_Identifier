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

/* loaded from: classes3.dex */
public class a {
    public static String b = "";

    /* renamed from: d, reason: collision with root package name */
    public static String f17586d = null;

    /* renamed from: e, reason: collision with root package name */
    public static String f17587e = "";

    /* renamed from: A, reason: collision with root package name */
    private int f17589A;

    /* renamed from: B, reason: collision with root package name */
    private int f17590B;

    /* renamed from: C, reason: collision with root package name */
    private int f17591C;

    /* renamed from: H, reason: collision with root package name */
    private boolean f17596H;

    /* renamed from: P, reason: collision with root package name */
    private Queue<Integer> f17602P;

    /* renamed from: Q, reason: collision with root package name */
    private String f17603Q;

    /* renamed from: Z, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f17612Z;

    /* renamed from: a, reason: collision with root package name */
    b f17613a;
    private List<CampaignEx> aa;
    private Context l;
    private com.mbridge.msdk.reward.adapter.c m;

    /* renamed from: n, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.d.c f17620n;

    /* renamed from: o, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.d.a f17621o;

    /* renamed from: p, reason: collision with root package name */
    private volatile InterVideoOutListener f17622p;

    /* renamed from: q, reason: collision with root package name */
    private volatile c f17623q;

    /* renamed from: r, reason: collision with root package name */
    private String f17624r;

    /* renamed from: s, reason: collision with root package name */
    private String f17625s;

    /* renamed from: t, reason: collision with root package name */
    private MBridgeIds f17626t;

    /* renamed from: u, reason: collision with root package name */
    private String f17627u;

    /* renamed from: v, reason: collision with root package name */
    private volatile String f17628v;

    /* renamed from: w, reason: collision with root package name */
    private String f17629w;

    /* renamed from: N, reason: collision with root package name */
    private static ConcurrentHashMap<String, Integer> f17585N = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, String> O = new ConcurrentHashMap<>();

    /* renamed from: f, reason: collision with root package name */
    public static ConcurrentHashMap<String, d> f17588f = new ConcurrentHashMap<>();

    /* renamed from: x, reason: collision with root package name */
    private int f17630x = 0;

    /* renamed from: z, reason: collision with root package name */
    private int f17632z = 2;

    /* renamed from: D, reason: collision with root package name */
    private boolean f17592D = false;

    /* renamed from: E, reason: collision with root package name */
    private boolean f17593E = false;

    /* renamed from: F, reason: collision with root package name */
    private boolean f17594F = false;

    /* renamed from: G, reason: collision with root package name */
    private boolean f17595G = false;

    /* renamed from: I, reason: collision with root package name */
    private boolean f17597I = false;

    /* renamed from: J, reason: collision with root package name */
    private ArrayList<Integer> f17598J = new ArrayList<>(7);

    /* renamed from: K, reason: collision with root package name */
    private boolean f17599K = false;

    /* renamed from: L, reason: collision with root package name */
    private final Object f17600L = new Object();

    /* renamed from: c, reason: collision with root package name */
    public boolean f17614c = false;

    /* renamed from: M, reason: collision with root package name */
    private List<CampaignEx> f17601M = new ArrayList();

    /* renamed from: R, reason: collision with root package name */
    private g f17604R = null;

    /* renamed from: S, reason: collision with root package name */
    private volatile boolean f17605S = true;

    /* renamed from: T, reason: collision with root package name */
    private volatile boolean f17606T = false;

    /* renamed from: U, reason: collision with root package name */
    private volatile boolean f17607U = false;

    /* renamed from: V, reason: collision with root package name */
    private volatile boolean f17608V = false;

    /* renamed from: W, reason: collision with root package name */
    private volatile boolean f17609W = false;

    /* renamed from: X, reason: collision with root package name */
    private volatile boolean f17610X = false;

    /* renamed from: Y, reason: collision with root package name */
    private volatile boolean f17611Y = false;

    /* renamed from: g, reason: collision with root package name */
    volatile boolean f17615g = false;

    /* renamed from: h, reason: collision with root package name */
    volatile boolean f17616h = false;

    /* renamed from: i, reason: collision with root package name */
    volatile boolean f17617i = false;

    /* renamed from: j, reason: collision with root package name */
    volatile boolean f17618j = false;

    /* renamed from: k, reason: collision with root package name */
    volatile boolean f17619k = false;

    /* renamed from: y, reason: collision with root package name */
    private Handler f17631y = new com.mbridge.msdk.reward.b.b(this);

    /* renamed from: com.mbridge.msdk.reward.b.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class RunnableC0187a implements Runnable {
        private final com.mbridge.msdk.reward.adapter.c b;

        /* renamed from: c, reason: collision with root package name */
        private final int f17667c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f17668d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f17669e = false;

        /* renamed from: f, reason: collision with root package name */
        private int f17670f;

        /* renamed from: g, reason: collision with root package name */
        private String f17671g;

        /* renamed from: h, reason: collision with root package name */
        private com.mbridge.msdk.foundation.same.report.d.b f17672h;

        public RunnableC0187a(com.mbridge.msdk.reward.adapter.c cVar, int i9, boolean z8, String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
            this.b = cVar;
            this.f17667c = i9;
            this.f17668d = z8;
            if (cVar != null) {
                cVar.e(false);
            }
            this.f17671g = str;
            this.f17672h = bVar;
        }

        public final void a() {
            this.f17669e = true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f17669e) {
                return;
            }
            com.mbridge.msdk.reward.adapter.c cVar = this.b;
            if (cVar != null) {
                cVar.e(true);
            }
            ad.b("RewardVideoController", "adSource=" + this.f17667c + " CommonCancelTimeTask mIsDevCall：" + this.f17668d);
            a.this.a(com.mbridge.msdk.foundation.c.a.b(880023, "v3 is timeout"), this.f17672h);
        }

        public final void a(int i9) {
            this.f17670f = i9;
        }
    }

    /* loaded from: classes3.dex */
    public class b implements com.mbridge.msdk.reward.adapter.a {
        private com.mbridge.msdk.reward.adapter.c b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f17674c;

        /* renamed from: d, reason: collision with root package name */
        private RunnableC0187a f17675d;

        public b(com.mbridge.msdk.reward.adapter.c cVar, boolean z8) {
            this.b = cVar;
            this.f17674c = z8;
        }

        public final void a(RunnableC0187a runnableC0187a) {
            this.f17675d = runnableC0187a;
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public final void a(String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
            RunnableC0187a runnableC0187a = this.f17675d;
            if (runnableC0187a != null) {
                runnableC0187a.a();
                a.this.f17631y.removeCallbacks(this.f17675d);
            }
            if (a.this.f17623q != null) {
                c.b(a.this.f17623q, a.this.f17628v, a.this.f17625s, bVar);
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public final void a(List<CampaignEx> list, com.mbridge.msdk.foundation.same.report.d.b bVar) {
            RunnableC0187a runnableC0187a = this.f17675d;
            if (runnableC0187a != null) {
                runnableC0187a.a();
                a.this.f17631y.removeCallbacks(this.f17675d);
            }
            a.this.a(list);
            if (a.this.f17623q != null) {
                a.this.f17623q.a(a.this.f17628v, a.this.f17625s, bVar);
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public final void a(List<CampaignEx> list, com.mbridge.msdk.foundation.c.b bVar, com.mbridge.msdk.foundation.same.report.d.b bVar2) {
            RunnableC0187a runnableC0187a = this.f17675d;
            if (runnableC0187a != null) {
                runnableC0187a.a();
                a.this.f17631y.removeCallbacks(this.f17675d);
            }
            com.mbridge.msdk.reward.adapter.c cVar = this.b;
            if (cVar != null) {
                cVar.a((com.mbridge.msdk.reward.adapter.a) null);
                this.b = null;
            }
            a.this.a(list);
            if (a.this.f17623q != null) {
                a.this.f17623q.a(bVar, bVar2);
            }
        }
    }

    /* loaded from: classes3.dex */
    public final class c {
        private WeakReference<InterVideoOutListener> b;

        /* renamed from: c, reason: collision with root package name */
        private volatile AtomicInteger f17677c;

        /* renamed from: d, reason: collision with root package name */
        private Handler f17678d;

        /* renamed from: e, reason: collision with root package name */
        private String f17679e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f17680f;

        public final void a(String str, String str2, com.mbridge.msdk.foundation.same.report.d.b bVar) {
            Handler handler = this.f17678d;
            if (handler != null) {
                handler.removeMessages(1001002);
            }
            WeakReference<InterVideoOutListener> weakReference = this.b;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (this.f17677c.get() == 2 || this.f17678d == null) {
                return;
            }
            this.f17677c.set(2);
            if (a.this.f17608V) {
                return;
            }
            a.this.f17608V = true;
            if (bVar == null) {
                bVar = new com.mbridge.msdk.foundation.same.report.d.b();
            }
            bVar.b(a.this.f17601M);
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
                this.f17678d.sendMessage(obtain);
            }
        }

        private c(InterVideoOutListener interVideoOutListener, Handler handler, String str) {
            this.b = new WeakReference<>(interVideoOutListener);
            this.f17677c = new AtomicInteger(0);
            this.f17678d = handler;
            this.f17679e = str;
        }

        public final void b(String str, String str2, com.mbridge.msdk.foundation.same.report.d.b bVar) {
            Handler handler = this.f17678d;
            if (handler != null) {
                handler.removeMessages(1001002);
            }
            WeakReference<InterVideoOutListener> weakReference = this.b;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (this.f17677c.get() == 2 || this.f17678d == null) {
                return;
            }
            if (this.f17677c.get() == 1) {
                this.f17677c.set(3);
            }
            if (a.this.f17608V) {
                return;
            }
            a.this.f17608V = true;
            if (bVar == null) {
                bVar = new com.mbridge.msdk.foundation.same.report.d.b();
            }
            bVar.a(true);
            bVar.b(a.this.f17601M);
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
                this.f17678d.sendMessage(obtain);
            }
            if (a.this.f17609W) {
                this.f17677c.set(2);
            }
        }

        public final void a(com.mbridge.msdk.foundation.c.b bVar, com.mbridge.msdk.foundation.same.report.d.b bVar2) {
            String str;
            if (bVar != null && bVar2 != null) {
                str = bVar.b();
                bVar2.a(bVar);
            } else {
                str = "";
            }
            if (a.this.m != null) {
                a.this.m.a(a.this.f17613a);
                CopyOnWriteArrayList<CampaignEx> e4 = a.this.m.e();
                CampaignEx campaignEx = (a.this.f17601M == null || a.this.f17601M.size() == 0) ? null : (CampaignEx) a.this.f17601M.get(0);
                if (campaignEx == null) {
                    campaignEx = (e4 == null || e4.size() == 0) ? null : e4.get(0);
                }
                CampaignEx campaignEx2 = campaignEx;
                if (a.this.f17593E && ((campaignEx2 == null || TextUtils.isEmpty(campaignEx2.getNLRid())) && ((e4 == null || e4.size() == 0) && a.this.m.a(campaignEx2, true, bVar, 2, bVar2)))) {
                    return;
                } else {
                    a.this.m.a((com.mbridge.msdk.reward.adapter.a) null);
                }
            }
            Handler handler = this.f17678d;
            if (handler != null) {
                handler.removeMessages(1001002);
            }
            WeakReference<InterVideoOutListener> weakReference = this.b;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (this.f17677c.get() == 2 || this.f17678d == null) {
                return;
            }
            a.this.f17609W = true;
            if (!a.this.f17611Y || str.contains("resource load timeout")) {
                a.this.f17610X = true;
            }
            if (a.this.f17608V) {
                this.f17677c.set(2);
            }
            if (a.this.f17609W && a.this.f17610X && !a.this.f17608V) {
                this.f17677c.set(2);
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
                    this.f17678d.sendMessage(obtain);
                }
            }
        }

        public static /* synthetic */ void b(c cVar, String str, String str2, com.mbridge.msdk.foundation.same.report.d.b bVar) {
            WeakReference<InterVideoOutListener> weakReference = cVar.b;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if ((cVar.f17677c.get() != 1 && cVar.f17677c.get() != 3) || cVar.f17678d == null || a.this.f17607U) {
                return;
            }
            a.this.f17607U = true;
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
                cVar.f17678d.sendMessage(obtain);
                if (af.a().a("l_s_i_l_v_s", false)) {
                    cVar.a(str, str2, bVar);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
            WeakReference<InterVideoOutListener> weakReference = this.b;
            a.a(a.this, "2000047", bVar, weakReference != null ? weakReference.get() : null);
            if (this.f17678d != null) {
                Message obtain = Message.obtain();
                obtain.obj = str;
                obtain.what = 18;
                if (bVar != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("metrics_data_lrid", bVar.f());
                    obtain.setData(bundle);
                }
                this.f17678d.sendMessage(obtain);
            }
        }

        public final void a(boolean z8) {
            this.f17680f = z8;
        }

        public static /* synthetic */ int a(c cVar) {
            return cVar.f17677c.get();
        }

        public static /* synthetic */ void a(c cVar, int i9) {
            cVar.f17677c.set(i9);
        }

        public static /* synthetic */ void a(c cVar, String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
            cVar.f17677c.set(2);
            cVar.a(str, bVar);
        }

        public static /* synthetic */ void a(c cVar, String str, String str2, com.mbridge.msdk.foundation.same.report.d.b bVar) {
            WeakReference<InterVideoOutListener> weakReference = cVar.b;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (cVar.f17678d == null || a.this.f17607U) {
                return;
            }
            a.this.f17607U = true;
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
                cVar.f17678d.sendMessage(obtain);
                if (af.a().a("l_s_i_l_v_s", false)) {
                    cVar.b(str, str2, bVar);
                }
            }
        }

        public static /* synthetic */ void a(c cVar, com.mbridge.msdk.foundation.c.b bVar, com.mbridge.msdk.foundation.same.report.d.b bVar2) {
            String str;
            WeakReference<InterVideoOutListener> weakReference = cVar.b;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (cVar.f17677c.get() == 2 || cVar.f17678d == null) {
                return;
            }
            a.this.f17610X = true;
            if (bVar != null) {
                str = bVar.b();
            } else {
                str = "";
            }
            if (str.contains("resource load timeout")) {
                a.this.f17609W = true;
            }
            if (a.this.f17610X && a.this.f17609W && !a.this.f17608V) {
                cVar.f17677c.set(2);
                if (interVideoOutListener != null) {
                    Message obtain = Message.obtain();
                    obtain.obj = str;
                    obtain.what = 16;
                    if (bVar2 != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("metrics_data_lrid", bVar2.f());
                        obtain.setData(bundle);
                    }
                    cVar.f17678d.sendMessage(obtain);
                }
                if (bVar2 == null) {
                    bVar2 = new com.mbridge.msdk.foundation.same.report.d.b();
                }
                bVar2.a(true);
                a.a(a.this, "2000047", bVar2, interVideoOutListener);
            }
        }
    }

    /* loaded from: classes3.dex */
    public final class d extends com.mbridge.msdk.video.bt.module.b.b {

        /* renamed from: d, reason: collision with root package name */
        private a f17682d;

        /* renamed from: e, reason: collision with root package name */
        private Handler f17683e;

        /* renamed from: f, reason: collision with root package name */
        private int f17684f;

        @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
        public final void b(String str, String str2) {
            try {
                a aVar = this.f17682d;
                if (aVar != null && aVar.f17622p != null) {
                    try {
                        this.f17682d.f17622p.onEndcardShow(a.this.f17626t);
                        com.mbridge.msdk.foundation.d.b.a().a(str2 + "_2", 2);
                    } catch (Exception e4) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("RewardVideoController", e4.getMessage());
                        }
                    }
                    this.f17684f = 6;
                }
            } catch (Exception e9) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", e9.getMessage());
                }
            }
        }

        private d(a aVar, Handler handler) {
            this.f17684f = 0;
            this.f17682d = aVar;
            this.f17683e = handler;
        }

        @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
        public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar) {
            a aVar = a.this;
            aVar.f17614c = false;
            try {
                com.mbridge.msdk.reward.a.a aVar2 = new com.mbridge.msdk.reward.a.a(aVar.f17625s, a.this.f17592D);
                a aVar3 = this.f17682d;
                aVar2.a(bVar.f(), (aVar3 == null || aVar3.m == null) ? "" : this.f17682d.m.f17519c, 3, a.b);
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", e4.getMessage());
                }
            }
            try {
                a aVar4 = this.f17682d;
                if (aVar4 != null) {
                    aVar4.f17599K = true;
                    if (this.f17682d.m != null) {
                        this.f17682d.m.f17519c = "";
                    }
                    final a aVar5 = this.f17682d;
                    com.mbridge.msdk.foundation.same.f.b.b().execute(new Runnable() { // from class: com.mbridge.msdk.reward.b.a.5
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                if (a.this.f17604R == null) {
                                    a.this.f17604R = g.a(com.mbridge.msdk.foundation.controller.c.m().c());
                                }
                                h a6 = h.a(a.this.f17604R);
                                if (a6 != null) {
                                    a6.a(a.this.f17625s);
                                }
                            } catch (Throwable unused) {
                                ad.b("RewardVideoController", "can't find DailyPlayCapDao");
                            }
                        }
                    });
                    if (a.this.f17593E) {
                        a.this.c();
                    }
                    a aVar6 = a.this;
                    aVar6.a("2000130", bVar, aVar6.f17622p, "");
                    this.b = true;
                    if (this.f17682d.f17622p != null) {
                        this.f17682d.f17622p.onAdShow(a.this.f17626t);
                        this.f17684f = 2;
                    }
                }
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", th.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
        public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar, boolean z8, com.mbridge.msdk.videocommon.b.c cVar) {
            try {
                a aVar = this.f17682d;
                if (aVar != null && aVar.f17622p != null) {
                    if (cVar == null) {
                        cVar = com.mbridge.msdk.videocommon.b.c.b(this.f17682d.f17629w);
                    }
                    if (a.this.f17593E) {
                        a.this.c();
                        a.this.b();
                        com.mbridge.msdk.foundation.same.a.b.d(a.this.f17625s, a.this.a());
                    }
                    this.f17682d.f17622p.onAdClose(a.this.f17626t, new RewardInfo(z8, cVar.a(), String.valueOf(cVar.b())));
                    this.f17684f = 7;
                    this.f17682d.f17599K = false;
                    a.this.f17598J.clear();
                    this.f17682d = null;
                }
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000152", bVar, (com.mbridge.msdk.foundation.same.report.d.a.a) null);
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", e4.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
        public final void a(com.mbridge.msdk.foundation.same.report.d.b bVar, String str) {
            try {
                a aVar = a.this;
                aVar.f17614c = false;
                if (this.f17682d != null) {
                    if (aVar.f17593E) {
                        a.this.c();
                    }
                    this.f17682d.f17599K = false;
                    a.this.a("2000131", bVar, this.f17682d.f17622p, str);
                    this.f18548c = true;
                    if (this.f17682d.f17622p != null) {
                        try {
                            this.f17682d.f17622p.onShowFail(bVar, a.this.f17626t, str);
                        } catch (Exception e4) {
                            if (MBridgeConstans.DEBUG) {
                                ad.b("RewardVideoController", e4.getMessage());
                            }
                        }
                        this.f17684f = 4;
                    }
                }
            } catch (Exception e9) {
                this.f17684f = 0;
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", e9.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
        public final void a(boolean z8, String str, String str2) {
            try {
                a aVar = this.f17682d;
                if (aVar == null || aVar.f17622p == null) {
                    return;
                }
                if (a.this.f17593E) {
                    a.this.c();
                }
                this.f17682d.f17599K = false;
                try {
                    this.f17682d.f17622p.onVideoAdClicked(z8, a.this.f17626t);
                } catch (Exception e4) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardVideoController", e4.getMessage());
                    }
                }
            } catch (Exception e9) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", e9.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
        public final void a(String str, String str2) {
            try {
                a aVar = this.f17682d;
                if (aVar == null || aVar.f17622p == null) {
                    return;
                }
                try {
                    this.f17682d.f17622p.onVideoComplete(a.this.f17626t);
                } catch (Exception e4) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardVideoController", e4.getMessage());
                    }
                }
                this.f17684f = 5;
            } catch (Exception e9) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", e9.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
        public final void a(boolean z8, int i9) {
            try {
                a aVar = this.f17682d;
                if (aVar != null && aVar.f17622p != null) {
                    try {
                        this.f17682d.f17622p.onAdCloseWithIVReward(a.this.f17626t, new RewardInfo(z8, i9));
                    } catch (Exception e4) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("RewardVideoController", e4.getMessage());
                        }
                    }
                }
            } catch (Exception e9) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", e9.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.b.b, com.mbridge.msdk.video.bt.module.b.h
        public final void a(int i9, String str, String str2) {
            this.f17684f = i9;
            a aVar = this.f17682d;
            if (aVar == null || aVar.f17593E || this.f17682d.f17592D || this.f17682d.f17620n == null || !this.f17682d.f17620n.s(this.f17684f) || this.f17682d.f17623q == null || c.a(this.f17682d.f17623q) == 1 || c.a(this.f17682d.f17623q) == 3 || a.this.f17598J.contains(Integer.valueOf(this.f17684f))) {
                return;
            }
            a.this.f17598J.add(Integer.valueOf(this.f17684f));
            int A8 = this.f17682d.f17620n.A() * 1000;
            if (this.f17684f == 4) {
                A8 = 3000;
            }
            Handler handler = this.f17683e;
            if (handler != null) {
                handler.removeMessages(1001001);
                this.f17683e.sendEmptyMessageDelayed(1001001, A8);
            } else {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.mbridge.msdk.reward.b.a.d.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10;
                        if (d.this.f17682d != null) {
                            com.mbridge.msdk.foundation.same.report.d.c a6 = com.mbridge.msdk.foundation.same.report.d.c.a();
                            if (a.this.f17592D) {
                                i10 = 287;
                            } else {
                                i10 = 94;
                            }
                            d.this.f17682d.a(false, a6.a(0, i10, a.this.f17625s, true, 1));
                        }
                    }
                }, A8);
            }
        }
    }

    public static void insertExcludeId(String str, CampaignEx campaignEx) {
        if (!TextUtils.isEmpty(str) && campaignEx != null && com.mbridge.msdk.foundation.controller.c.m().c() != null) {
            i a6 = i.a(g.a(com.mbridge.msdk.foundation.controller.c.m().c()));
            f fVar = new f();
            fVar.a(System.currentTimeMillis());
            fVar.b(str);
            fVar.a(campaignEx.getId());
            a6.a(fVar);
        }
    }

    private void p() {
        e.a(g.a(this.l)).a(this.f17625s);
    }

    private void q() {
        try {
            List<CampaignEx> b8 = e.a(g.a(this.l)).b(this.f17625s);
            if (b8 == null || b8.size() <= 0) {
                return;
            }
            for (CampaignEx campaignEx : b8) {
                if (!TextUtils.isEmpty(campaignEx.getCMPTEntryUrl())) {
                    com.mbridge.msdk.videocommon.a.b(this.f17625s + "_" + campaignEx.getRequestId() + "_" + campaignEx.getCMPTEntryUrl());
                    if (campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().e())) {
                        com.mbridge.msdk.videocommon.a.b(this.f17625s + "_" + campaignEx.getId() + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().e());
                    }
                } else {
                    com.mbridge.msdk.videocommon.a.b(campaignEx.getAdType(), campaignEx);
                }
            }
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardVideoController", e4.getMessage());
            }
        }
    }

    private void r() {
        com.mbridge.msdk.reward.adapter.c cVar = new com.mbridge.msdk.reward.adapter.c(this.l, this.f17628v, this.f17625s);
        this.m = cVar;
        cVar.b(this.f17592D);
        this.m.c(this.f17593E);
        if (this.f17592D) {
            this.m.a(this.f17589A, this.f17590B, this.f17591C);
        }
        this.m.a(this.f17620n);
    }

    private boolean s() {
        try {
            if (this.f17604R == null) {
                this.f17604R = g.a(com.mbridge.msdk.foundation.controller.c.m().c());
            }
            h a6 = h.a(this.f17604R);
            if (this.f17620n == null) {
                this.f17620n = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.f17625s, this.f17592D);
            }
            int d2 = this.f17620n.d();
            if (a6 != null) {
                return a6.a(this.f17625s, d2);
            }
            return false;
        } catch (Throwable unused) {
            ad.b("RewardVideoController", "cap check error");
            return false;
        }
    }

    public final List<CampaignEx> f() {
        return this.aa;
    }

    public final com.mbridge.msdk.reward.adapter.c g() {
        return this.m;
    }

    public final boolean h() {
        return this.f17596H;
    }

    public final String i() {
        return this.f17625s;
    }

    public final String j() {
        return this.f17628v;
    }

    public final c k() {
        return this.f17623q;
    }

    public final InterVideoOutListener l() {
        return this.f17622p;
    }

    public final boolean m() {
        return this.f17593E;
    }

    public final MBridgeIds n() {
        return this.f17626t;
    }

    public final boolean o() {
        return this.f17592D;
    }

    private boolean e(boolean z8) {
        if (z8) {
            d("is_ready_start", "");
        }
        if (this.m == null) {
            r();
        }
        List<com.mbridge.msdk.foundation.entity.c> a6 = com.mbridge.msdk.videocommon.a.a.a().a(this.f17625s);
        if (a6 == null || a6.size() <= 0) {
            if (!z8) {
                return false;
            }
            d("is_ready_ctir_false", "no effective campaign list");
            return false;
        }
        String b8 = com.mbridge.msdk.foundation.same.a.b.b(this.f17625s);
        boolean a9 = TextUtils.isEmpty(b8) ? false : a(a6, b8);
        if (z8) {
            d("is_ready_ctir_" + a9, "");
        }
        if (a9) {
            return a9;
        }
        for (com.mbridge.msdk.foundation.entity.c cVar : a6) {
            if (cVar != null) {
                this.m.a(cVar.a());
                this.m.f17520d = cVar.d();
                if (this.m.d(z8)) {
                    return true;
                }
            }
        }
        return a9;
    }

    public final void b(boolean z8) {
        this.f17593E = z8;
    }

    public final void c(boolean z8) {
        this.f17597I = z8;
    }

    public final boolean d(boolean z8) {
        try {
            if (s()) {
                if (!z8) {
                    return false;
                }
                d("is_ready_start", "over cap check error");
                return false;
            }
            if (this.f17593E) {
                try {
                    return e(z8);
                } catch (Exception e4) {
                    if (!MBridgeConstans.DEBUG) {
                        return false;
                    }
                    ad.b("RewardVideoController", e4.getMessage());
                    return false;
                }
            }
            if (this.m == null) {
                r();
            }
            com.mbridge.msdk.reward.adapter.c cVar = this.m;
            if (cVar != null) {
                return cVar.b();
            }
            return false;
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            ad.b("RewardVideoController", th.getMessage());
            return false;
        }
    }

    /* renamed from: com.mbridge.msdk.reward.b.a$4, reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass4 implements b.i {

        /* renamed from: a, reason: collision with root package name */
        com.mbridge.msdk.foundation.same.report.d.b f17655a;
        final /* synthetic */ CampaignEx b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CopyOnWriteArrayList f17656c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.reward.adapter.c f17657d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f17658e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f17659f;

        public AnonymousClass4(CampaignEx campaignEx, CopyOnWriteArrayList copyOnWriteArrayList, com.mbridge.msdk.reward.adapter.c cVar, boolean z8, int i9) {
            this.b = campaignEx;
            this.f17656c = copyOnWriteArrayList;
            this.f17657d = cVar;
            this.f17658e = z8;
            this.f17659f = i9;
            this.f17655a = com.mbridge.msdk.foundation.same.report.d.c.a().b().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.i
        public final void a(final String str, final String str2, final String str3, String str4) {
            a.this.f17616h = true;
            if (!a.this.f17615g || a.this.f17617i || a.this.f17631y == null) {
                return;
            }
            a.this.f17617i = true;
            a.this.f17631y.post(new Runnable() { // from class: com.mbridge.msdk.reward.b.a.4.1
                @Override // java.lang.Runnable
                public final void run() {
                    com.mbridge.msdk.reward.adapter.b a6 = com.mbridge.msdk.reward.adapter.b.a();
                    boolean z8 = a.this.f17597I;
                    Handler handler = a.this.f17631y;
                    boolean z9 = a.this.f17592D;
                    boolean z10 = a.this.f17593E;
                    String str5 = str3;
                    String requestIdNotice = AnonymousClass4.this.b.getRequestIdNotice();
                    String str6 = str;
                    String str7 = str2;
                    String cMPTEntryUrl = AnonymousClass4.this.b.getCMPTEntryUrl();
                    int i9 = a.this.f17632z;
                    AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                    a6.a(z8, handler, z9, z10, str5, requestIdNotice, str6, str7, cMPTEntryUrl, i9, anonymousClass4.b, anonymousClass4.f17656c, H5DownLoadManager.getInstance().getH5ResAddress(AnonymousClass4.this.b.getCMPTEntryUrl()), str2, a.this.f17620n, new b.j() { // from class: com.mbridge.msdk.reward.b.a.4.1.1
                        @Override // com.mbridge.msdk.reward.adapter.b.j
                        public final void a(String str8, String str9, String str10, String str11, String str12, a.C0202a c0202a) {
                            AnonymousClass4 anonymousClass42 = AnonymousClass4.this;
                            com.mbridge.msdk.reward.adapter.c cVar = anonymousClass42.f17657d;
                            if (cVar != null && cVar.a(anonymousClass42.f17656c, anonymousClass42.f17658e, anonymousClass42.f17659f)) {
                                if (a.this.f17623q == null || a.this.f17619k) {
                                    return;
                                }
                                a.this.f17619k = true;
                                ad.a("RewardVideoController", "Cache onVideoLoadSuccess");
                                AnonymousClass4 anonymousClass43 = AnonymousClass4.this;
                                a.this.a(anonymousClass43.f17656c);
                                AnonymousClass4 anonymousClass44 = AnonymousClass4.this;
                                com.mbridge.msdk.foundation.same.report.d.b bVar = anonymousClass44.f17655a;
                                if (bVar != null) {
                                    bVar.b(anonymousClass44.f17656c);
                                }
                                a.this.f17623q.b(str9, str10, AnonymousClass4.this.f17655a);
                                return;
                            }
                            a aVar = a.this;
                            a.a(aVar, str10, aVar.aa);
                            if (a.this.f17623q == null || a.this.f17618j) {
                                return;
                            }
                            a.this.f17618j = true;
                            com.mbridge.msdk.foundation.c.b b = com.mbridge.msdk.foundation.c.a.b(880015, "errorCode: 3505 errorMessage: tpl temp preload success but isReady false");
                            AnonymousClass4 anonymousClass45 = AnonymousClass4.this;
                            if (anonymousClass45.f17655a == null) {
                                anonymousClass45.f17655a = new com.mbridge.msdk.foundation.same.report.d.b();
                            }
                            AnonymousClass4 anonymousClass46 = AnonymousClass4.this;
                            anonymousClass46.f17655a.b(anonymousClass46.f17656c);
                            AnonymousClass4.this.f17655a.a(b);
                            c.a(a.this.f17623q, b, AnonymousClass4.this.f17655a);
                        }

                        @Override // com.mbridge.msdk.reward.adapter.b.j
                        public final void a(String str8, String str9, String str10, a.C0202a c0202a, com.mbridge.msdk.foundation.c.b bVar) {
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            a aVar = a.this;
                            a.a(aVar, str2, aVar.aa);
                            if (a.this.f17623q == null || a.this.f17618j) {
                                return;
                            }
                            a.this.f17618j = true;
                            if (bVar != null) {
                                bVar.a("errorCode: 3303 errorMessage: tpl temp preload failed");
                            }
                            AnonymousClass4 anonymousClass42 = AnonymousClass4.this;
                            if (anonymousClass42.f17655a == null) {
                                anonymousClass42.f17655a = new com.mbridge.msdk.foundation.same.report.d.b();
                            }
                            AnonymousClass4 anonymousClass43 = AnonymousClass4.this;
                            anonymousClass43.f17655a.b(anonymousClass43.f17656c);
                            AnonymousClass4.this.f17655a.a(bVar);
                            c.a(a.this.f17623q, bVar, AnonymousClass4.this.f17655a);
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
            a.a(aVar, str3, aVar.aa);
            if (this.f17655a == null) {
                this.f17655a = new com.mbridge.msdk.foundation.same.report.d.b();
            }
            this.f17655a.a(bVar);
            this.f17655a.b(this.f17656c);
            a.this.f17616h = false;
            if (a.this.f17623q == null || a.this.f17618j) {
                return;
            }
            a.this.f17618j = true;
            c.a(a.this.f17623q, bVar, this.f17655a);
        }
    }

    public final void b() {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (!this.f17599K || (concurrentHashMap = O) == null || concurrentHashMap.containsKey(a())) {
            return;
        }
        O.remove(a());
    }

    public final void c() {
        try {
            String str = "";
            MBridgeIds mBridgeIds = this.f17626t;
            if (mBridgeIds != null) {
                if (!this.f17599K) {
                    mBridgeIds.setBidToken("");
                    return;
                }
                String a6 = a();
                if (TextUtils.isEmpty(a6)) {
                    return;
                }
                ConcurrentHashMap<String, String> concurrentHashMap = O;
                if (concurrentHashMap != null && concurrentHashMap.containsKey(a6) && !TextUtils.isEmpty(O.get(a6))) {
                    str = O.get(a6);
                }
                this.f17626t.setBidToken(str);
            }
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                e4.printStackTrace();
            }
        }
    }

    public final void a(boolean z8) {
        this.f17592D = z8;
        if (z8) {
            this.f17632z = com.mbridge.msdk.foundation.same.a.f15675W;
        } else {
            this.f17632z = com.mbridge.msdk.foundation.same.a.f15674V;
        }
    }

    public final void b(String str, String str2) {
        try {
            this.l = com.mbridge.msdk.foundation.controller.c.m().c();
            this.f17625s = str2;
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            this.f17628v = str;
            this.f17626t = new MBridgeIds(this.f17628v, this.f17625s);
            this.f17621o = com.mbridge.msdk.videocommon.d.b.a().b();
            com.mbridge.msdk.foundation.same.f.b.b().execute(new com.mbridge.msdk.reward.b.c(this.l, this.f17625s));
            if (this.f17604R == null) {
                this.f17604R = g.a(com.mbridge.msdk.foundation.controller.c.m().c());
            }
        } catch (Throwable th) {
            ad.b("RewardVideoController", th.getMessage(), th);
        }
    }

    public final void a(int i9) {
        this.f17632z = i9;
    }

    public final String a() {
        com.mbridge.msdk.reward.adapter.c cVar = this.m;
        if (cVar != null) {
            return cVar.a(this.f17599K);
        }
        return "";
    }

    public final void a(String str, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str)) {
            al.b(this.l, "MBridge_ConfirmTitle" + this.f17625s, str.trim());
        }
        if (!TextUtils.isEmpty(str2)) {
            al.b(this.l, "MBridge_ConfirmContent" + this.f17625s, str2.trim());
        }
        if (!TextUtils.isEmpty(str4)) {
            al.b(this.l, "MBridge_CancelText" + this.f17625s, str4.trim());
        }
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        al.b(this.l, "MBridge_ConfirmText" + this.f17625s, str3.trim());
    }

    private com.mbridge.msdk.foundation.same.report.d.b b(boolean z8, String str, com.mbridge.msdk.foundation.same.report.d.d dVar) {
        List<String> e4;
        String a6;
        com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
        try {
            if (z8) {
                try {
                    e a9 = e.a(g.a(this.l));
                    if (a9 != null && (e4 = a9.e(this.f17625s)) != null && e4.size() > 0) {
                        Iterator<String> it = e4.iterator();
                        while (it.hasNext()) {
                            com.mbridge.msdk.foundation.same.report.d.c.a().c(it.next());
                        }
                    }
                    LinkedHashMap<String, com.mbridge.msdk.foundation.same.report.d.b> b8 = com.mbridge.msdk.foundation.same.report.d.c.a().b();
                    if (b8 != null && b8.size() > 0) {
                        Iterator<Map.Entry<String, com.mbridge.msdk.foundation.same.report.d.b>> it2 = b8.entrySet().iterator();
                        while (it2.hasNext()) {
                            Map.Entry<String, com.mbridge.msdk.foundation.same.report.d.b> next = it2.next();
                            if (next != null && next.getValue().s()) {
                                it2.remove();
                            }
                        }
                    }
                } catch (Exception e9) {
                    if (MBridgeConstans.DEBUG) {
                        e9.printStackTrace();
                    }
                }
            }
            if (TextUtils.isEmpty(str)) {
                a6 = SameMD5.getMD5(ai.d());
            } else {
                a6 = a(str);
            }
            bVar = com.mbridge.msdk.foundation.same.report.d.c.a().b(a6);
            if (bVar == null) {
                com.mbridge.msdk.foundation.same.report.d.b bVar2 = new com.mbridge.msdk.foundation.same.report.d.b();
                try {
                    com.mbridge.msdk.foundation.same.report.d.c.a().b().put(a6, bVar2);
                    bVar2.d(true);
                    bVar = bVar2;
                } catch (Exception e10) {
                    e = e10;
                    bVar = bVar2;
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardVideoController", e.getMessage());
                    }
                    return bVar;
                }
            }
            bVar.c(a6);
            bVar.d(this.f17625s);
            String str2 = "1";
            if (dVar != null) {
                if (dVar.a("adtp")) {
                    bVar.b(Integer.parseInt((String) dVar.b("adtp")));
                }
                if (dVar.a(CampaignEx.JSON_KEY_HB)) {
                    String str3 = (String) dVar.b(CampaignEx.JSON_KEY_HB);
                    bVar.i(str3);
                    if (str3.equals("1")) {
                        bVar.e(str);
                    }
                }
            }
            if (z8) {
                str2 = MBridgeConstans.API_REUQEST_CATEGORY_APP;
            }
            bVar.b(str2);
            if (z8) {
                com.mbridge.msdk.reward.c.a.a.a().a("2000123", bVar);
            }
        } catch (Exception e11) {
            e = e11;
        }
        return bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean c(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            com.mbridge.msdk.reward.adapter.c r0 = r4.m     // Catch: java.lang.Exception -> Lf
            if (r0 == 0) goto L11
            java.lang.String r0 = r0.a()     // Catch: java.lang.Exception -> Lf
            boolean r0 = r5.equals(r0)     // Catch: java.lang.Exception -> Lf
            if (r0 != 0) goto L28
            goto L11
        Lf:
            r0 = move-exception
            goto L37
        L11:
            com.mbridge.msdk.reward.adapter.c r0 = new com.mbridge.msdk.reward.adapter.c     // Catch: java.lang.Exception -> Lf
            android.content.Context r1 = r4.l     // Catch: java.lang.Exception -> Lf
            java.lang.String r2 = r4.f17628v     // Catch: java.lang.Exception -> Lf
            r0.<init>(r1, r2, r5)     // Catch: java.lang.Exception -> Lf
            r4.m = r0     // Catch: java.lang.Exception -> Lf
            boolean r1 = r4.f17592D     // Catch: java.lang.Exception -> Lf
            r0.b(r1)     // Catch: java.lang.Exception -> Lf
            com.mbridge.msdk.reward.adapter.c r0 = r4.m     // Catch: java.lang.Exception -> Lf
            boolean r1 = r4.f17593E     // Catch: java.lang.Exception -> Lf
            r0.c(r1)     // Catch: java.lang.Exception -> Lf
        L28:
            com.mbridge.msdk.reward.adapter.c r0 = r4.m     // Catch: java.lang.Exception -> Lf
            int r1 = r4.f17632z     // Catch: java.lang.Exception -> Lf
            r0.a(r1)     // Catch: java.lang.Exception -> Lf
            com.mbridge.msdk.reward.adapter.c r0 = r4.m     // Catch: java.lang.Exception -> Lf
            com.mbridge.msdk.videocommon.d.c r1 = r4.f17620n     // Catch: java.lang.Exception -> Lf
            r0.a(r1)     // Catch: java.lang.Exception -> Lf
            goto L44
        L37:
            boolean r1 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r1 == 0) goto L44
            java.lang.String r1 = "RewardVideoController"
            java.lang.String r0 = r0.getMessage()
            com.mbridge.msdk.foundation.tools.ad.b(r1, r0)
        L44:
            com.mbridge.msdk.videocommon.a.a r0 = com.mbridge.msdk.videocommon.a.a.a()
            boolean r1 = r4.f17593E
            r2 = 1
            java.util.List r0 = r0.a(r5, r2, r1)
            com.mbridge.msdk.videocommon.a.a r1 = com.mbridge.msdk.videocommon.a.a.a()
            boolean r3 = r4.f17593E
            java.util.List r1 = r1.b(r5, r2, r3)
            r4.aa = r1
            if (r0 == 0) goto L98
            int r1 = r0.size()
            if (r1 <= 0) goto L98
            com.mbridge.msdk.videocommon.a.a r1 = com.mbridge.msdk.videocommon.a.a.a()
            r1.a(r5, r0, r6)
            java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r5 = r4.f17612Z
            if (r5 != 0) goto L76
            java.util.concurrent.CopyOnWriteArrayList r5 = new java.util.concurrent.CopyOnWriteArrayList
            r5.<init>()
            r4.f17612Z = r5
            goto L79
        L76:
            r5.clear()
        L79:
            java.util.Iterator r5 = r0.iterator()
        L7d:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L92
            java.lang.Object r0 = r5.next()
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = (com.mbridge.msdk.foundation.entity.CampaignEx) r0
            r0.setLocalRequestId(r6)
            java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r1 = r4.f17612Z
            r1.add(r0)
            goto L7d
        L92:
            java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r5 = r4.f17612Z
            r4.a(r5)
            return r2
        L98:
            java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r5 = r4.f17612Z
            if (r5 == 0) goto L9f
            r5.clear()
        L9f:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.b.a.c(java.lang.String, java.lang.String):boolean");
    }

    public final String d() {
        com.mbridge.msdk.reward.adapter.c cVar = this.m;
        if (cVar != null) {
            return cVar.f();
        }
        return "";
    }

    private void d(String str, String str2) {
        try {
            com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
            bVar.d(this.f17625s);
            bVar.b(this.f17592D ? 287 : 94);
            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
            dVar.a("event_name", str);
            dVar.a("reason", str2);
            bVar.a("m_temp_is_ready_check", dVar);
            com.mbridge.msdk.reward.c.a.a.a().a("m_temp_is_ready_check", bVar);
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                e4.printStackTrace();
            }
        }
    }

    public final CopyOnWriteArrayList<CampaignEx> e() {
        return this.f17612Z;
    }

    public final void a(int i9, int i10, int i11) {
        this.f17589A = i9;
        this.f17590B = i10;
        if (i10 == com.mbridge.msdk.foundation.same.a.f15663J) {
            this.f17591C = i11 < 0 ? 5 : i11;
        }
        if (i10 == com.mbridge.msdk.foundation.same.a.f15662I) {
            this.f17591C = i11 < 0 ? 80 : i11;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ivRewardEnable", 1);
            jSONObject.put("ivRewardMode", i9 == com.mbridge.msdk.foundation.same.a.f15660G ? 0 : 1);
            jSONObject.put("ivRewardPlayValueMode", i10 == com.mbridge.msdk.foundation.same.a.f15662I ? 0 : 1);
            jSONObject.put("ivRewardPlayValue", i11);
            com.mbridge.msdk.c.h.a().f(this.f17625s, jSONObject.toString());
        } catch (Exception unused) {
            ad.b("RewardVideoController", "setIVRewardEnable to SP was ERROR");
        }
    }

    /* renamed from: com.mbridge.msdk.reward.b.a$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass2 implements b.c {

        /* renamed from: a, reason: collision with root package name */
        com.mbridge.msdk.foundation.same.report.d.b f17634a;
        final /* synthetic */ CampaignEx b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f17635c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.reward.adapter.c f17636d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f17637e;

        public AnonymousClass2(CampaignEx campaignEx, boolean z8, com.mbridge.msdk.reward.adapter.c cVar, int i9) {
            this.b = campaignEx;
            this.f17635c = z8;
            this.f17636d = cVar;
            this.f17637e = i9;
            this.f17634a = com.mbridge.msdk.foundation.same.report.d.c.a().b().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.c
        public final void a(final String str, final String str2, final String str3, final CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            a.this.f17615g = true;
            if (!this.f17635c) {
                Iterator<CampaignEx> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    final CampaignEx next = it.next();
                    if (next != null && next.getRewardTemplateMode() != null && !TextUtils.isEmpty(next.getRewardTemplateMode().e()) && !next.getRewardTemplateMode().e().contains(CampaignEx.KEY_IS_CMPT_ENTRY) && a.this.f17631y != null) {
                        a.this.f17631y.post(new Runnable() { // from class: com.mbridge.msdk.reward.b.a.2.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.mbridge.msdk.reward.adapter.b.a().a(a.this.f17597I, a.this.f17631y, a.this.f17592D, a.this.f17593E, null, next.getRewardTemplateMode().e(), a.this.f17632z, AnonymousClass2.this.b, copyOnWriteArrayList, H5DownLoadManager.getInstance().getH5ResAddress(next.getRewardTemplateMode().e()), str, str2, str3, next.getRequestIdNotice(), a.this.f17620n, new b.j() { // from class: com.mbridge.msdk.reward.b.a.2.1.1
                                    @Override // com.mbridge.msdk.reward.adapter.b.j
                                    public final void a(String str4, String str5, String str6, String str7, String str8, a.C0202a c0202a) {
                                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                        com.mbridge.msdk.reward.adapter.c cVar = anonymousClass2.f17636d;
                                        if (cVar != null && cVar.a(copyOnWriteArrayList, anonymousClass2.f17635c, anonymousClass2.f17637e)) {
                                            if (a.this.f17623q == null || a.this.f17619k) {
                                                return;
                                            }
                                            a.this.f17619k = true;
                                            AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                                            a.this.a(copyOnWriteArrayList);
                                            a.this.f17623q.b(str5, str6, AnonymousClass2.this.f17634a);
                                            return;
                                        }
                                        a aVar = a.this;
                                        a.a(aVar, str6, aVar.aa);
                                        if (a.this.f17623q == null || a.this.f17618j) {
                                            return;
                                        }
                                        a.this.f17618j = true;
                                        com.mbridge.msdk.foundation.c.b b = com.mbridge.msdk.foundation.c.a.b(880015, "errorCode: 3502 errorMessage: temp preload success but isReady false");
                                        AnonymousClass2 anonymousClass22 = AnonymousClass2.this;
                                        if (anonymousClass22.f17634a == null) {
                                            anonymousClass22.f17634a = new com.mbridge.msdk.foundation.same.report.d.b();
                                        }
                                        AnonymousClass1 anonymousClass13 = AnonymousClass1.this;
                                        AnonymousClass2.this.f17634a.b(copyOnWriteArrayList);
                                        AnonymousClass2.this.f17634a.a(b);
                                        c.a(a.this.f17623q, b, AnonymousClass2.this.f17634a);
                                    }

                                    @Override // com.mbridge.msdk.reward.adapter.b.j
                                    public final void a(String str4, String str5, String str6, a.C0202a c0202a, com.mbridge.msdk.foundation.c.b bVar) {
                                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                        a aVar = a.this;
                                        a.a(aVar, str2, aVar.aa);
                                        if (a.this.f17623q == null || a.this.f17618j) {
                                            return;
                                        }
                                        a.this.f17618j = true;
                                        bVar.a("errorCode: 3301 errorMessage: temp preload failed");
                                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                        if (anonymousClass2.f17634a == null) {
                                            anonymousClass2.f17634a = new com.mbridge.msdk.foundation.same.report.d.b();
                                        }
                                        AnonymousClass2 anonymousClass22 = AnonymousClass2.this;
                                        anonymousClass22.f17634a.b(a.this.f17612Z);
                                        AnonymousClass2.this.f17634a.a(bVar);
                                        c.a(a.this.f17623q, bVar, AnonymousClass2.this.f17634a);
                                    }
                                });
                            }
                        });
                    } else {
                        com.mbridge.msdk.reward.adapter.c cVar = this.f17636d;
                        if (cVar != null && cVar.a(copyOnWriteArrayList, this.f17635c, this.f17637e)) {
                            if (a.this.f17623q != null && !a.this.f17619k) {
                                a.this.f17619k = true;
                                ad.a("RewardVideoController", "Cache onVideoLoadSuccessForCache");
                                a.this.a(copyOnWriteArrayList);
                                com.mbridge.msdk.foundation.same.report.d.b bVar = this.f17634a;
                                if (bVar != null) {
                                    bVar.b(copyOnWriteArrayList);
                                }
                                a.this.f17623q.b(str, str2, this.f17634a);
                            }
                        } else {
                            a aVar = a.this;
                            a.a(aVar, str2, aVar.aa);
                            if (a.this.f17623q != null && !a.this.f17618j) {
                                a.this.f17618j = true;
                                com.mbridge.msdk.foundation.c.b b = com.mbridge.msdk.foundation.c.a.b(880015, "errorCode: 3503 errorMessage: have no temp but isReady false");
                                if (this.f17634a == null) {
                                    this.f17634a = new com.mbridge.msdk.foundation.same.report.d.b();
                                }
                                this.f17634a.b(a.this.f17612Z);
                                this.f17634a.a(b);
                                c.a(a.this.f17623q, b, this.f17634a);
                            }
                        }
                    }
                }
                return;
            }
            if (!a.this.f17616h || a.this.f17617i || a.this.f17631y == null) {
                return;
            }
            a.this.f17617i = true;
            a.this.f17631y.post(new Runnable() { // from class: com.mbridge.msdk.reward.b.a.2.2
                @Override // java.lang.Runnable
                public final void run() {
                    com.mbridge.msdk.reward.adapter.b.a().a(a.this.f17597I, a.this.f17631y, a.this.f17592D, a.this.f17593E, str3, AnonymousClass2.this.b.getRequestIdNotice(), str, str2, AnonymousClass2.this.b.getCMPTEntryUrl(), a.this.f17632z, AnonymousClass2.this.b, copyOnWriteArrayList, H5DownLoadManager.getInstance().getH5ResAddress(AnonymousClass2.this.b.getCMPTEntryUrl()), str2, a.this.f17620n, new b.j() { // from class: com.mbridge.msdk.reward.b.a.2.2.1
                        @Override // com.mbridge.msdk.reward.adapter.b.j
                        public final void a(String str4, String str5, String str6, String str7, String str8, a.C0202a c0202a) {
                            RunnableC01852 runnableC01852 = RunnableC01852.this;
                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                            com.mbridge.msdk.reward.adapter.c cVar2 = anonymousClass2.f17636d;
                            if (cVar2 != null && cVar2.a(copyOnWriteArrayList, anonymousClass2.f17635c, anonymousClass2.f17637e)) {
                                if (a.this.f17623q == null || a.this.f17619k) {
                                    return;
                                }
                                a.this.f17619k = true;
                                ad.a("RewardVideoController", "Cache onVideoLoadSuccessForCache");
                                RunnableC01852 runnableC018522 = RunnableC01852.this;
                                a.this.a(copyOnWriteArrayList);
                                RunnableC01852 runnableC018523 = RunnableC01852.this;
                                com.mbridge.msdk.foundation.same.report.d.b bVar2 = AnonymousClass2.this.f17634a;
                                if (bVar2 != null) {
                                    bVar2.b(copyOnWriteArrayList);
                                }
                                a.this.f17623q.b(str5, str6, AnonymousClass2.this.f17634a);
                                return;
                            }
                            a aVar2 = a.this;
                            a.a(aVar2, str6, aVar2.aa);
                            if (a.this.f17623q == null || a.this.f17618j) {
                                return;
                            }
                            a.this.f17618j = true;
                            com.mbridge.msdk.foundation.c.b b8 = com.mbridge.msdk.foundation.c.a.b(880015, "errorCode: 3504 errorMessage: tpl temp preload success but isReady false");
                            AnonymousClass2 anonymousClass22 = AnonymousClass2.this;
                            if (anonymousClass22.f17634a == null) {
                                anonymousClass22.f17634a = new com.mbridge.msdk.foundation.same.report.d.b();
                            }
                            AnonymousClass2.this.f17634a.a(b8);
                            RunnableC01852 runnableC018524 = RunnableC01852.this;
                            AnonymousClass2.this.f17634a.b(copyOnWriteArrayList);
                            c.a(a.this.f17623q, b8, AnonymousClass2.this.f17634a);
                        }

                        @Override // com.mbridge.msdk.reward.adapter.b.j
                        public final void a(String str4, String str5, String str6, a.C0202a c0202a, com.mbridge.msdk.foundation.c.b bVar2) {
                            RunnableC01852 runnableC01852 = RunnableC01852.this;
                            a aVar2 = a.this;
                            a.a(aVar2, str2, aVar2.aa);
                            if (a.this.f17623q == null || a.this.f17618j) {
                                return;
                            }
                            a.this.f17618j = true;
                            if (bVar2 != null) {
                                bVar2.a("errorCode: 3302 errorMessage: tpl preload failed");
                            }
                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                            if (anonymousClass2.f17634a == null) {
                                anonymousClass2.f17634a = new com.mbridge.msdk.foundation.same.report.d.b();
                            }
                            RunnableC01852 runnableC018522 = RunnableC01852.this;
                            AnonymousClass2.this.f17634a.b(copyOnWriteArrayList);
                            AnonymousClass2.this.f17634a.a(bVar2);
                            c.a(a.this.f17623q, bVar2, AnonymousClass2.this.f17634a);
                        }
                    }, true);
                }
            });
        }

        @Override // com.mbridge.msdk.reward.adapter.b.c
        public final void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.foundation.c.b bVar) {
            a.this.f17615g = false;
            a aVar = a.this;
            a.a(aVar, aVar.f17625s, a.this.aa);
            if (a.this.f17623q == null || a.this.f17618j) {
                return;
            }
            a.this.f17618j = true;
            if (this.f17634a == null) {
                this.f17634a = new com.mbridge.msdk.foundation.same.report.d.b();
            }
            this.f17634a.b(copyOnWriteArrayList);
            if (bVar != null) {
                bVar.a("errorCode: 3201 errorMessage: campaign resource download failed");
            }
            this.f17634a.a(bVar);
            c.a(a.this.f17623q, bVar, this.f17634a);
        }
    }

    public static void a(String str, int i9) {
        try {
            if (f17585N == null || !an.b(str)) {
                return;
            }
            f17585N.put(str, Integer.valueOf(i9));
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardVideoController", e4.getMessage());
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
        this.f17622p = interVideoOutListener;
        this.f17623q = new c(interVideoOutListener, this.f17631y, this.f17625s);
    }

    public final void a(boolean z8, com.mbridge.msdk.foundation.same.report.d.d dVar) {
        a(z8, "", dVar);
    }

    public final void a(boolean z8, String str, com.mbridge.msdk.foundation.same.report.d.d dVar) {
        com.mbridge.msdk.foundation.same.report.d.b b8 = b(z8, str, dVar);
        if (this.f17623q == null) {
            this.f17623q = new c(null, this.f17631y, this.f17625s);
        }
        if (this.f17623q != null && c.a(this.f17623q) == 1) {
            a(z8, b8);
            return;
        }
        if (this.f17623q != null && c.a(this.f17623q) == 3) {
            this.f17605S = false;
        } else {
            this.f17605S = true;
            if (this.f17623q != null) {
                c.a(this.f17623q, 1);
            }
        }
        this.f17596H = z8;
        this.f17631y.removeMessages(1001001);
        this.f17608V = false;
        this.f17607U = false;
        this.f17609W = false;
        this.f17610X = false;
        q();
        p();
        com.mbridge.msdk.reward.adapter.b.a();
        try {
            if (TextUtils.isEmpty(str)) {
                if (this.f17592D) {
                    com.mbridge.msdk.d.b.getInstance().addInterstitialList(this.f17628v, this.f17625s);
                } else {
                    com.mbridge.msdk.d.b.getInstance().addRewardList(this.f17628v, this.f17625s);
                }
            }
            if (this.f17593E && TextUtils.isEmpty(str)) {
                b(b8);
                return;
            }
            if (com.mbridge.msdk.system.a.map == null) {
                a(b8);
                return;
            }
            com.mbridge.msdk.videocommon.d.c a6 = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.f17625s);
            this.f17620n = a6;
            if (a6 == null) {
                this.f17603Q = com.mbridge.msdk.foundation.controller.c.m().k();
                com.mbridge.msdk.videocommon.d.b.a().a(this.f17603Q, com.mbridge.msdk.foundation.controller.c.m().b(), this.f17625s, new com.mbridge.msdk.videocommon.c.c() { // from class: com.mbridge.msdk.reward.b.a.1
                    @Override // com.mbridge.msdk.videocommon.c.c
                    public final void a(String str2) {
                    }

                    @Override // com.mbridge.msdk.videocommon.c.c
                    public final void b(String str2) {
                    }
                });
                this.f17620n = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.f17625s, this.f17592D);
            }
            if (!TextUtils.isEmpty(this.f17628v)) {
                this.f17620n.b(this.f17628v);
            }
            int F4 = this.f17620n.F() * 1000;
            if (this.f17631y != null) {
                Message obtain = Message.obtain();
                obtain.what = 1001002;
                if (b8 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("metrics_data_lrid", b8.f());
                    obtain.setData(bundle);
                }
                this.f17631y.sendMessageDelayed(obtain, F4);
            }
            this.f17602P = this.f17620n.B();
            try {
                a(z8, str, b8);
            } catch (Exception e4) {
                if (this.f17623q != null) {
                    com.mbridge.msdk.foundation.c.b b9 = com.mbridge.msdk.foundation.c.a.b(880020, "load exception");
                    if (b8 != null) {
                        b8.a(b9);
                        b8.c(true);
                    }
                    this.f17623q.a(b9, b8);
                }
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", e4.getMessage());
                }
            }
        } catch (Exception e9) {
            if (this.f17623q != null) {
                com.mbridge.msdk.foundation.c.b b10 = com.mbridge.msdk.foundation.c.a.b(880001, "");
                if (b8 != null) {
                    b8.a(b10);
                    b8.c(true);
                }
                this.f17623q.a(b10, b8);
            }
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardVideoController", e9.getMessage());
            }
        }
    }

    private void b(com.mbridge.msdk.foundation.same.report.d.b bVar) {
        if (this.f17623q != null) {
            com.mbridge.msdk.foundation.c.b b8 = com.mbridge.msdk.foundation.c.a.b(880035, "");
            if (bVar != null) {
                bVar.a(b8);
                bVar.c(true);
            }
            c.a(this.f17623q, "bidToken is empty", bVar);
        }
    }

    private void a(com.mbridge.msdk.foundation.same.report.d.b bVar) {
        if (this.f17623q != null) {
            String a6 = com.mbridge.msdk.foundation.c.a.a(880001, "");
            com.mbridge.msdk.foundation.c.b b8 = com.mbridge.msdk.foundation.c.a.b(880001, "");
            if (bVar != null) {
                bVar.a(b8);
                bVar.c(true);
            }
            c.a(this.f17623q, a6, bVar);
        }
    }

    private void a(boolean z8, com.mbridge.msdk.foundation.same.report.d.b bVar) {
        if (!this.f17596H) {
            if (z8) {
                this.f17596H = z8;
            }
        } else if (z8) {
            String a6 = com.mbridge.msdk.foundation.c.a.a(880016, "errorCode: 3501 errorMessage: current unit is loading");
            com.mbridge.msdk.foundation.c.b b8 = com.mbridge.msdk.foundation.c.a.b(880016, "errorCode: 3501 errorMessage: current unit is loading");
            if (bVar != null) {
                bVar.a(b8);
                bVar.c(true);
            }
            this.f17623q.a(a6, bVar);
        }
    }

    private void a(boolean z8, String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
        com.mbridge.msdk.reward.a.a aVar;
        com.mbridge.msdk.reward.a.a aVar2;
        if (this.f17623q != null) {
            if (!this.f17593E) {
                this.f17611Y = c(this.f17625s, bVar.f());
                if (this.f17611Y) {
                    if (!s()) {
                        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f17612Z;
                        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
                            return;
                        }
                        try {
                            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                            dVar.a("cache", 1);
                            bVar.a("2000127", dVar);
                            bVar.a("2000048", dVar);
                            bVar.a(copyOnWriteArrayList);
                        } catch (Exception e4) {
                            if (MBridgeConstans.DEBUG) {
                                ad.b("RewardVideoController", e4.getMessage());
                            }
                        }
                        c.a(this.f17623q, this.f17628v, this.f17625s, bVar);
                        CampaignEx campaignEx = copyOnWriteArrayList.get(0);
                        this.f17623q.a(this.f17593E);
                        com.mbridge.msdk.reward.adapter.c cVar = this.m;
                        if (cVar != null && cVar.a(copyOnWriteArrayList, !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()), campaignEx.getNscpt())) {
                            a(copyOnWriteArrayList);
                            this.f17623q.b(this.f17628v, this.f17625s, bVar);
                        } else {
                            a(copyOnWriteArrayList, this.m);
                        }
                        if (this.f17605S) {
                            com.mbridge.msdk.reward.adapter.c cVar2 = this.m;
                            if (cVar2 != null) {
                                cVar2.a(this.f17612Z);
                            }
                            a(this.f17602P, z8, str, bVar);
                            return;
                        }
                        return;
                    }
                    ad.a("RewardVideoController", "非BID，本地存在可用的缓存，超过上限");
                    CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = this.f17612Z;
                    if (copyOnWriteArrayList2 != null && copyOnWriteArrayList2.size() > 0) {
                        Iterator<CampaignEx> it = this.f17612Z.iterator();
                        while (it.hasNext()) {
                            com.mbridge.msdk.videocommon.a.a.a().a(it.next(), this.f17625s);
                        }
                    }
                    com.mbridge.msdk.reward.adapter.c cVar3 = this.m;
                    if (cVar3 != null) {
                        cVar3.a(this.f17612Z);
                    }
                    if (z8) {
                        if (this.f17623q != null) {
                            String a6 = com.mbridge.msdk.foundation.c.a.a(880019, "");
                            bVar.a(com.mbridge.msdk.foundation.c.a.b(880019, ""));
                            bVar.c(true);
                            c.a(this.f17623q, a6, bVar);
                            return;
                        }
                        return;
                    }
                    this.f17611Y = false;
                    this.f17623q.a(this.f17593E);
                    a(this.f17602P, z8, str, bVar);
                    return;
                }
                if (!s()) {
                    this.f17611Y = false;
                    com.mbridge.msdk.reward.adapter.c cVar4 = this.m;
                    if (cVar4 != null) {
                        cVar4.a(this.f17612Z);
                    }
                    this.f17623q.a(this.f17593E);
                    a(this.f17602P, z8, str, bVar);
                    return;
                }
                if (z8) {
                    if (this.f17623q != null) {
                        String a9 = com.mbridge.msdk.foundation.c.a.a(880019, "");
                        bVar.a(com.mbridge.msdk.foundation.c.a.b(880019, ""));
                        bVar.c(true);
                        c.a(this.f17623q, a9, bVar);
                        return;
                    }
                    return;
                }
                this.f17611Y = false;
                com.mbridge.msdk.reward.adapter.c cVar5 = this.m;
                if (cVar5 != null) {
                    cVar5.a(this.f17612Z);
                }
                this.f17623q.a(this.f17593E);
                a(this.f17602P, z8, str, bVar);
                return;
            }
            CopyOnWriteArrayList<CampaignEx> a10 = com.mbridge.msdk.videocommon.a.a.a().a(this.f17625s, 1, this.f17593E, "");
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList3 = null;
            if (a10 != null && a10.size() > 0) {
                if (!s()) {
                    CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList4 = new CopyOnWriteArrayList<>();
                    if (a10.size() > 0 && !TextUtils.isEmpty(str)) {
                        for (CampaignEx campaignEx2 : a10) {
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
                        com.mbridge.msdk.reward.a.a aVar3 = new com.mbridge.msdk.reward.a.a(this.f17625s, this.f17592D);
                        com.mbridge.msdk.foundation.b.c cVar6 = new com.mbridge.msdk.foundation.b.c();
                        if (aVar3.a(str)) {
                            if (this.m == null) {
                                com.mbridge.msdk.reward.adapter.c cVar7 = new com.mbridge.msdk.reward.adapter.c(this.l, this.f17628v, this.f17625s);
                                this.m = cVar7;
                                cVar7.b(this.f17592D);
                                this.m.c(this.f17593E);
                                if (this.f17592D) {
                                    this.m.a(this.f17589A, this.f17590B, this.f17591C);
                                }
                                this.m.a(this.f17632z);
                                this.m.a(this.f17620n);
                            }
                            aVar2 = aVar3;
                            cVar6 = aVar3.a(str, bVar, (CampaignEx) null, new com.mbridge.msdk.foundation.c.b(880038), 1, this.m);
                            if (cVar6 != null && cVar6.g() == com.mbridge.msdk.foundation.b.c.f15353d && cVar6.a() != null && cVar6.a().size() > 0 && this.m != null) {
                                CopyOnWriteArrayList<CampaignEx> a11 = cVar6.a();
                                ArrayList arrayList = new ArrayList();
                                Iterator<CampaignEx> it2 = a10.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    CampaignEx next = it2.next();
                                    if (next != null) {
                                        String requestId = next.getRequestId();
                                        if (!TextUtils.isEmpty(requestId)) {
                                            for (int i9 = 0; i9 < a11.size(); i9++) {
                                                CampaignEx campaignEx3 = a11.get(i9);
                                                if (campaignEx3 != null) {
                                                    if (requestId.equals(campaignEx3.getRequestId())) {
                                                        break;
                                                    } else if (i9 == a11.size() - 1) {
                                                        arrayList.add(next);
                                                    }
                                                }
                                            }
                                            if (a11.size() == 0) {
                                                arrayList.add(next);
                                            }
                                        }
                                    }
                                }
                                this.m.a(arrayList);
                                this.m.a(cVar6.a(), false, true);
                                copyOnWriteArrayList3 = new CopyOnWriteArrayList<>(cVar6.a());
                            }
                        } else {
                            aVar2 = aVar3;
                            copyOnWriteArrayList3 = a(str, a10);
                            if (copyOnWriteArrayList3.size() > 0) {
                                com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).a(str, copyOnWriteArrayList3);
                            }
                            cVar6.d("cb is closed");
                            cVar6.a(com.mbridge.msdk.foundation.b.c.f15352c);
                        }
                        aVar2.a(bVar, str, cVar6, (List<a.C0155a>) null, (JSONObject) null, 1);
                        if (copyOnWriteArrayList3 != null && copyOnWriteArrayList3.size() > 0) {
                            a(copyOnWriteArrayList3, str, bVar);
                            if (this.m != null && !aVar2.a(str)) {
                                this.m.a(copyOnWriteArrayList3);
                            }
                        }
                    } catch (Exception e9) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("RewardVideoController", e9.getMessage());
                        }
                    }
                    this.f17611Y = false;
                    this.f17623q.a(this.f17593E);
                    a(this.f17602P, z8, str, bVar);
                    return;
                }
                com.mbridge.msdk.videocommon.a.a.a().a(this.f17625s, str);
                if (!z8 || this.f17623q == null) {
                    return;
                }
                String a12 = com.mbridge.msdk.foundation.c.a.a(880019, "");
                com.mbridge.msdk.foundation.c.b b8 = com.mbridge.msdk.foundation.c.a.b(880019, "");
                if (bVar != null) {
                    bVar.a(b8);
                    bVar.c(true);
                }
                c.a(this.f17623q, a12, bVar);
                return;
            }
            if (!s()) {
                try {
                    com.mbridge.msdk.reward.a.a aVar4 = new com.mbridge.msdk.reward.a.a(this.f17625s, this.f17592D);
                    com.mbridge.msdk.foundation.b.c cVar8 = new com.mbridge.msdk.foundation.b.c();
                    if (aVar4.a(str)) {
                        if (this.m == null) {
                            com.mbridge.msdk.reward.adapter.c cVar9 = new com.mbridge.msdk.reward.adapter.c(this.l, this.f17628v, this.f17625s);
                            this.m = cVar9;
                            cVar9.b(this.f17592D);
                            this.m.c(this.f17593E);
                            if (this.f17592D) {
                                this.m.a(this.f17589A, this.f17590B, this.f17591C);
                            }
                            this.m.a(this.f17632z);
                            this.m.a(this.f17620n);
                        }
                        aVar = aVar4;
                        cVar8 = aVar4.a(str, bVar, (CampaignEx) null, new com.mbridge.msdk.foundation.c.b(880038), 1, this.m);
                        if (cVar8 != null && cVar8.g() == com.mbridge.msdk.foundation.b.c.f15353d && cVar8.a() != null && cVar8.a().size() > 0 && this.m != null) {
                            CopyOnWriteArrayList<CampaignEx> a13 = cVar8.a();
                            if (a10 != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Iterator<CampaignEx> it3 = a10.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    CampaignEx next2 = it3.next();
                                    if (next2 != null) {
                                        String requestId2 = next2.getRequestId();
                                        if (!TextUtils.isEmpty(requestId2)) {
                                            for (int i10 = 0; i10 < a13.size(); i10++) {
                                                CampaignEx campaignEx4 = a13.get(i10);
                                                if (campaignEx4 != null) {
                                                    if (requestId2.equals(campaignEx4.getRequestId())) {
                                                        break;
                                                    } else if (i10 == a13.size() - 1) {
                                                        arrayList2.add(next2);
                                                    }
                                                }
                                            }
                                            if (a13.size() == 0) {
                                                arrayList2.add(next2);
                                            }
                                        }
                                    }
                                }
                                this.m.a(arrayList2);
                            }
                            this.m.a(cVar8.a(), false, true);
                            copyOnWriteArrayList3 = new CopyOnWriteArrayList<>(cVar8.a());
                        }
                    } else {
                        aVar = aVar4;
                        copyOnWriteArrayList3 = a(str, a10);
                        if (copyOnWriteArrayList3.size() > 0) {
                            com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).a(str, copyOnWriteArrayList3);
                        }
                        cVar8.d("cb is closed 2");
                        cVar8.a(com.mbridge.msdk.foundation.b.c.f15352c);
                    }
                    aVar.a(bVar, str, cVar8, (List<a.C0155a>) null, (JSONObject) null, 1);
                    if (copyOnWriteArrayList3 != null && copyOnWriteArrayList3.size() > 0) {
                        a(copyOnWriteArrayList3, str, bVar);
                        if (this.m != null && !aVar.a(str)) {
                            this.m.a(copyOnWriteArrayList3);
                        }
                    }
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardVideoController", e10.getMessage());
                    }
                }
                this.f17611Y = false;
                this.f17623q.a(this.f17593E);
                a(this.f17602P, z8, str, bVar);
                return;
            }
            com.mbridge.msdk.videocommon.a.a.a().a(this.f17625s, str);
            if (!z8 || this.f17623q == null) {
                return;
            }
            String a14 = com.mbridge.msdk.foundation.c.a.a(880019, "");
            com.mbridge.msdk.foundation.c.b b9 = com.mbridge.msdk.foundation.c.a.b(880019, "");
            if (bVar != null) {
                bVar.a(b9);
                bVar.c(true);
            }
            c.a(this.f17623q, a14, bVar);
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
        } catch (Exception e4) {
            ad.b("RewardVideoController", e4.getMessage());
        }
        this.f17611Y = true;
        this.f17623q.a(this.f17593E);
        c.a(this.f17623q, this.f17628v, this.f17625s, bVar);
        CampaignEx campaignEx = copyOnWriteArrayList.get(0);
        a(campaignEx.getRequestId(), str);
        com.mbridge.msdk.reward.adapter.c cVar = this.m;
        if (cVar != null && cVar.a(copyOnWriteArrayList, true ^ TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()), campaignEx.getNscpt())) {
            a(copyOnWriteArrayList);
            this.f17623q.b(this.f17628v, this.f17625s, bVar);
        } else {
            a(copyOnWriteArrayList, this.m);
        }
    }

    private CopyOnWriteArrayList<CampaignEx> a(String str, List<CampaignEx> list) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (list != null) {
            try {
                if (list.size() > 0) {
                    int i9 = 1;
                    for (CampaignEx campaignEx : list) {
                        if (campaignEx != null) {
                            if (campaignEx.getVcn() > i9) {
                                i9 = campaignEx.getVcn();
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
                    if (linkedHashMap2.size() + linkedHashMap.size() >= i9 && linkedHashMap.size() > 0 && linkedHashMap.entrySet() != null && linkedHashMap.entrySet().iterator() != null && linkedHashMap.entrySet().iterator().next() != null && ((Map.Entry) linkedHashMap.entrySet().iterator().next()).getValue() != null) {
                        copyOnWriteArrayList.addAll((Collection) ((Map.Entry) linkedHashMap.entrySet().iterator().next()).getValue());
                        com.mbridge.msdk.foundation.same.a.b.a(this.f17625s, str, i9);
                    }
                }
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", e4.getMessage());
                }
            }
        }
        return copyOnWriteArrayList;
    }

    private void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.reward.adapter.c cVar) {
        CampaignEx campaignEx = copyOnWriteArrayList.get(0);
        boolean z8 = !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl());
        int nscpt = campaignEx.getNscpt();
        this.f17615g = false;
        this.f17616h = false;
        this.f17617i = false;
        this.f17618j = false;
        this.f17619k = false;
        com.mbridge.msdk.reward.adapter.b.a().a(this.l, z8, nscpt, this.f17593E, this.f17592D ? 287 : 94, this.f17628v, this.f17625s, campaignEx.getRequestId(), copyOnWriteArrayList, new AnonymousClass2(campaignEx, z8, cVar, nscpt), new b.i(campaignEx, copyOnWriteArrayList, z8, nscpt) { // from class: com.mbridge.msdk.reward.b.a.3

            /* renamed from: a, reason: collision with root package name */
            com.mbridge.msdk.foundation.same.report.d.b f17650a;
            final /* synthetic */ CampaignEx b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ CopyOnWriteArrayList f17651c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f17652d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f17653e;

            {
                this.b = campaignEx;
                this.f17651c = copyOnWriteArrayList;
                this.f17652d = z8;
                this.f17653e = nscpt;
                this.f17650a = com.mbridge.msdk.foundation.same.report.d.c.a().b().get(campaignEx.getLocalRequestId());
            }

            @Override // com.mbridge.msdk.reward.adapter.b.i
            public final void a(String str, String str2, String str3, String str4) {
            }

            @Override // com.mbridge.msdk.reward.adapter.b.i
            public final void a(String str, String str2, com.mbridge.msdk.foundation.c.b bVar) {
                String unitId = bVar == null ? "" : bVar.d().getUnitId();
                a aVar = a.this;
                a.a(aVar, unitId, aVar.aa);
                if (bVar != null) {
                    bVar.a("errorCode: 3202 errorMessage: temp resource download failed");
                }
                if (this.f17650a == null) {
                    this.f17650a = new com.mbridge.msdk.foundation.same.report.d.b();
                }
                this.f17650a.b(this.f17651c);
                this.f17650a.a(bVar);
                if (!this.f17652d && a.this.f17623q != null) {
                    if (a.this.f17618j) {
                        return;
                    }
                    a.this.f17618j = true;
                    c.a(a.this.f17623q, bVar, this.f17650a);
                    return;
                }
                if (this.f17653e != 1 || a.this.f17618j || a.this.f17623q == null) {
                    return;
                }
                a.this.f17618j = true;
                c.a(a.this.f17623q, bVar, this.f17650a);
            }
        });
        if (z8) {
            com.mbridge.msdk.reward.adapter.b.a().a(this.l, campaignEx, this.f17628v, this.f17625s, campaignEx.getRequestId(), new AnonymousClass4(campaignEx, copyOnWriteArrayList, cVar, z8, nscpt));
        }
    }

    private void a(Queue<Integer> queue, boolean z8, String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
        Integer poll;
        int intValue;
        try {
            if (queue != null) {
                try {
                    if (queue.size() > 0 && (poll = queue.poll()) != null) {
                        intValue = poll.intValue();
                        a(1, intValue, z8, str, bVar);
                        return;
                    }
                } catch (Exception e4) {
                    com.mbridge.msdk.foundation.c.b b8 = com.mbridge.msdk.foundation.c.a.b(880020, "load mv api error:" + e4.getMessage());
                    if (bVar != null) {
                        bVar.a(b8);
                        bVar.c(true);
                    }
                    a(b8, bVar);
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardVideoController", e4.getMessage());
                        return;
                    }
                    return;
                }
            }
            a(1, intValue, z8, str, bVar);
            return;
        } catch (Exception e9) {
            com.mbridge.msdk.foundation.c.b b9 = com.mbridge.msdk.foundation.c.a.b(880020, "load mv api error:" + e9.getMessage());
            if (bVar != null) {
                bVar.a(b9);
                bVar.c(true);
            }
            a(b9, bVar);
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardVideoController", e9.getMessage());
                return;
            }
            return;
        }
        intValue = 25;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.foundation.c.b bVar, com.mbridge.msdk.foundation.same.report.d.b bVar2) {
        if (this.f17623q != null) {
            this.f17610X = true;
            this.f17623q.a(bVar, bVar2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0031 A[Catch: Exception -> 0x0011, TryCatch #0 {Exception -> 0x0011, blocks: (B:2:0x0000, B:4:0x0004, B:7:0x002d, B:9:0x0031, B:10:0x003c, B:14:0x0014), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(int r11, int r12, boolean r13, java.lang.String r14, com.mbridge.msdk.foundation.same.report.d.b r15) {
        /*
            r10 = this;
            com.mbridge.msdk.reward.adapter.c r0 = r10.m     // Catch: java.lang.Exception -> L11
            if (r0 == 0) goto L14
            java.lang.String r1 = r10.f17625s     // Catch: java.lang.Exception -> L11
            java.lang.String r0 = r0.a()     // Catch: java.lang.Exception -> L11
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Exception -> L11
            if (r0 != 0) goto L2d
            goto L14
        L11:
            r11 = move-exception
            goto L82
        L14:
            com.mbridge.msdk.reward.adapter.c r0 = new com.mbridge.msdk.reward.adapter.c     // Catch: java.lang.Exception -> L11
            android.content.Context r1 = r10.l     // Catch: java.lang.Exception -> L11
            java.lang.String r2 = r10.f17628v     // Catch: java.lang.Exception -> L11
            java.lang.String r3 = r10.f17625s     // Catch: java.lang.Exception -> L11
            r0.<init>(r1, r2, r3)     // Catch: java.lang.Exception -> L11
            r10.m = r0     // Catch: java.lang.Exception -> L11
            boolean r1 = r10.f17592D     // Catch: java.lang.Exception -> L11
            r0.b(r1)     // Catch: java.lang.Exception -> L11
            com.mbridge.msdk.reward.adapter.c r0 = r10.m     // Catch: java.lang.Exception -> L11
            boolean r1 = r10.f17593E     // Catch: java.lang.Exception -> L11
            r0.c(r1)     // Catch: java.lang.Exception -> L11
        L2d:
            boolean r0 = r10.f17592D     // Catch: java.lang.Exception -> L11
            if (r0 == 0) goto L3c
            com.mbridge.msdk.reward.adapter.c r0 = r10.m     // Catch: java.lang.Exception -> L11
            int r1 = r10.f17589A     // Catch: java.lang.Exception -> L11
            int r2 = r10.f17590B     // Catch: java.lang.Exception -> L11
            int r3 = r10.f17591C     // Catch: java.lang.Exception -> L11
            r0.a(r1, r2, r3)     // Catch: java.lang.Exception -> L11
        L3c:
            com.mbridge.msdk.reward.adapter.c r0 = r10.m     // Catch: java.lang.Exception -> L11
            int r1 = r10.f17632z     // Catch: java.lang.Exception -> L11
            r0.a(r1)     // Catch: java.lang.Exception -> L11
            com.mbridge.msdk.reward.adapter.c r0 = r10.m     // Catch: java.lang.Exception -> L11
            com.mbridge.msdk.videocommon.d.c r1 = r10.f17620n     // Catch: java.lang.Exception -> L11
            r0.a(r1)     // Catch: java.lang.Exception -> L11
            com.mbridge.msdk.reward.b.a$a r0 = new com.mbridge.msdk.reward.b.a$a     // Catch: java.lang.Exception -> L11
            com.mbridge.msdk.reward.adapter.c r4 = r10.m     // Catch: java.lang.Exception -> L11
            r2 = r0
            r3 = r10
            r5 = r11
            r6 = r13
            r7 = r14
            r8 = r15
            r2.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L11
            r0.a(r12)     // Catch: java.lang.Exception -> L11
            com.mbridge.msdk.reward.b.a$b r1 = new com.mbridge.msdk.reward.b.a$b     // Catch: java.lang.Exception -> L11
            com.mbridge.msdk.reward.adapter.c r2 = r10.m     // Catch: java.lang.Exception -> L11
            r1.<init>(r2, r13)     // Catch: java.lang.Exception -> L11
            r10.f17613a = r1     // Catch: java.lang.Exception -> L11
            r1.a(r0)     // Catch: java.lang.Exception -> L11
            com.mbridge.msdk.reward.adapter.c r1 = r10.m     // Catch: java.lang.Exception -> L11
            com.mbridge.msdk.reward.b.a$b r2 = r10.f17613a     // Catch: java.lang.Exception -> L11
            r1.a(r2)     // Catch: java.lang.Exception -> L11
            com.mbridge.msdk.reward.adapter.c r3 = r10.m     // Catch: java.lang.Exception -> L11
            boolean r8 = r10.f17597I     // Catch: java.lang.Exception -> L11
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r9 = r15
            r3.a(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L11
            android.os.Handler r11 = r10.f17631y     // Catch: java.lang.Exception -> L11
            int r12 = r12 * 1000
            long r12 = (long) r12     // Catch: java.lang.Exception -> L11
            r11.postDelayed(r0, r12)     // Catch: java.lang.Exception -> L11
            goto La6
        L82:
            r12 = 880020(0xd6d94, float:1.23317E-39)
            java.lang.String r13 = r11.getMessage()
            com.mbridge.msdk.foundation.c.b r12 = com.mbridge.msdk.foundation.c.a.b(r12, r13)
            if (r15 == 0) goto L96
            r15.a(r12)
            r13 = 1
            r15.c(r13)
        L96:
            r10.a(r12, r15)
            boolean r12 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r12 == 0) goto La6
            java.lang.String r12 = "RewardVideoController"
            java.lang.String r11 = r11.getMessage()
            com.mbridge.msdk.foundation.tools.ad.b(r12, r11)
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.b.a.a(int, int, boolean, java.lang.String, com.mbridge.msdk.foundation.same.report.d.b):void");
    }

    private void a(String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
        com.mbridge.msdk.videocommon.d.c cVar;
        com.mbridge.msdk.videocommon.d.c cVar2;
        boolean b8;
        boolean c9;
        try {
            if (this.m == null) {
                r();
            }
            if (this.m != null) {
                ad.b("RewardVideoController", "controller 819");
                if (this.f17593E) {
                    b8 = e(false);
                } else {
                    b8 = this.m.b();
                }
                if (b8) {
                    ad.c("RewardVideoController", "invoke adapter show isReady");
                    d dVar = new d(this, this.f17631y);
                    f17588f.put(this.f17625s, dVar);
                    this.m.a(dVar, str, this.f17624r, this.f17632z, this.f17627u, bVar);
                    this.f17614c = false;
                    return;
                }
                if (this.f17593E) {
                    if (this.m == null) {
                        r();
                    }
                    List<com.mbridge.msdk.foundation.entity.c> a6 = com.mbridge.msdk.videocommon.a.a.a().a(this.f17625s);
                    if (a6 != null && a6.size() > 0) {
                        for (com.mbridge.msdk.foundation.entity.c cVar3 : a6) {
                            if (cVar3 != null) {
                                this.m.a(cVar3.a());
                                this.m.f17520d = cVar3.d();
                                if (this.m.c()) {
                                    c9 = true;
                                    break;
                                }
                                com.mbridge.msdk.videocommon.a.a.a().c(this.f17625s, cVar3.a());
                            }
                        }
                    }
                    c9 = false;
                } else {
                    c9 = this.m.c();
                }
                if (c9) {
                    ad.c("RewardVideoController", "invoke adapter show isSpareOfferReady");
                    d dVar2 = new d(this, this.f17631y);
                    f17588f.put(this.f17625s, dVar2);
                    this.m.a(dVar2, str, this.f17624r, this.f17632z, this.f17627u, bVar);
                    this.f17614c = false;
                    return;
                }
            }
            this.f17614c = false;
            a("2000131", bVar, this.f17622p, "can't show because load is failed");
            if (this.f17622p != null) {
                try {
                    this.f17622p.onShowFail(bVar, this.f17626t, "can't show because load is failed");
                } catch (Exception e4) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardVideoController", e4.getMessage());
                    }
                }
            }
            if (this.f17592D || this.f17593E || (cVar2 = this.f17620n) == null || !cVar2.s(4) || this.f17623q == null || c.a(this.f17623q) == 1 || c.a(this.f17623q) == 3) {
                return;
            }
            a(false, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, 94, this.f17625s, true, 1));
        } catch (Exception e9) {
            this.f17614c = false;
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardVideoController", e9.getLocalizedMessage());
            }
            a("2000131", bVar, this.f17622p, "show exception");
            if (this.f17622p != null) {
                try {
                    this.f17622p.onShowFail(bVar, this.f17626t, "show exception");
                } catch (Exception unused) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardVideoController", e9.getMessage());
                    }
                }
            }
            if (this.f17592D || this.f17593E || (cVar = this.f17620n) == null || !cVar.s(4) || this.f17623q == null || c.a(this.f17623q) == 1 || c.a(this.f17623q) == 3) {
                return;
            }
            a(false, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, 94, this.f17625s, true, 1));
        }
    }

    private boolean a(List<com.mbridge.msdk.foundation.entity.c> list, String str) {
        if (list == null) {
            return false;
        }
        for (com.mbridge.msdk.foundation.entity.c cVar : list) {
            if (cVar != null && str.equals(cVar.b())) {
                this.m.a(cVar.a());
                this.m.f17520d = cVar.d();
                if (this.m.b()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r11, java.lang.String r12, java.lang.String r13, com.mbridge.msdk.foundation.same.report.d.d r14) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.b.a.a(java.lang.String, java.lang.String, java.lang.String, com.mbridge.msdk.foundation.same.report.d.d):void");
    }

    private com.mbridge.msdk.foundation.same.report.d.b a(com.mbridge.msdk.foundation.same.report.d.d dVar) {
        CampaignEx campaignEx;
        try {
            CopyOnWriteArrayList<CampaignEx> a6 = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f17625s);
            String str = "";
            if (a6 != null && a6.size() > 0 && (campaignEx = a6.get(0)) != null) {
                str = campaignEx.getCurrentLocalRid();
            }
            r0 = TextUtils.isEmpty(str) ? null : com.mbridge.msdk.foundation.same.report.d.c.a().b().get(str);
            if (r0 != null) {
                r0.b(a6);
                r0.a("2000128", dVar);
                r0.c(str);
                r0.d(this.f17625s);
                com.mbridge.msdk.reward.c.a.a.a().a("2000128", r0);
                return r0;
            }
            com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
            try {
                bVar.d(this.f17625s);
                dVar.a("metrics_data_reason", "未获取到待展示的campaign信息 本地new metricsData");
                bVar.a("2000128", dVar);
                if (TextUtils.isEmpty(str)) {
                    bVar.c(SameMD5.getMD5(ai.d()));
                } else {
                    bVar.c(str);
                    bVar.b(a6);
                    com.mbridge.msdk.foundation.same.report.d.c.a().b().put(str, bVar);
                }
                com.mbridge.msdk.reward.c.a.a.a().a("2000128", bVar);
                return bVar;
            } catch (Exception e4) {
                e = e4;
                r0 = bVar;
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardVideoController", e.getMessage());
                }
                return r0;
            }
        } catch (Exception e9) {
            e = e9;
        }
    }

    public final void a(List<CampaignEx> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f17601M = list;
    }

    private String a(String str) {
        String str2 = "";
        try {
            if (TextUtils.isEmpty(str)) {
                str2 = SameMD5.getMD5(ai.d());
            }
            String[] split = str.split("_");
            if (split != null && split.length >= 3) {
                str2 = split[2];
            }
            return TextUtils.isEmpty(str2) ? SameMD5.getMD5(ai.d()) : str2;
        } catch (Exception e4) {
            if (!MBridgeConstans.DEBUG) {
                return "";
            }
            e4.printStackTrace();
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
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    e4.printStackTrace();
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
                bVar.b(this.f17601M);
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    e4.printStackTrace();
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

    /* JADX WARN: Removed duplicated region for block: B:6:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0040 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:25:0x0009, B:27:0x000f, B:29:0x0016, B:30:0x002f, B:4:0x0039, B:8:0x0040, B:11:0x0075, B:13:0x0088, B:15:0x0096), top: B:24:0x0009 }] */
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
            if (r5 == 0) goto L38
            int r2 = r5.size()     // Catch: java.lang.Exception -> L2b
            if (r2 <= 0) goto L38
            r2 = 0
            java.lang.Object r3 = r5.get(r2)     // Catch: java.lang.Exception -> L2b
            if (r3 == 0) goto L2e
            java.lang.Object r1 = r5.get(r2)     // Catch: java.lang.Exception -> L2b
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = (com.mbridge.msdk.foundation.entity.CampaignEx) r1     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = r1.getLocalRequestId()     // Catch: java.lang.Exception -> L2b
            java.lang.Object r2 = r5.get(r2)     // Catch: java.lang.Exception -> L2b
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = (com.mbridge.msdk.foundation.entity.CampaignEx) r2     // Catch: java.lang.Exception -> L2b
            java.lang.String r2 = r2.getNLRid()     // Catch: java.lang.Exception -> L2b
            goto L2f
        L2b:
            r5 = move-exception
            goto La2
        L2e:
            r2 = r1
        L2f:
            r0.c(r1)     // Catch: java.lang.Exception -> L2b
            r0.b(r5)     // Catch: java.lang.Exception -> L2b
            r5 = r1
            r1 = r2
            goto L39
        L38:
            r5 = r1
        L39:
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L2b
            if (r1 == 0) goto L40
            return r6
        L40:
            com.mbridge.msdk.foundation.same.report.d.d r6 = new com.mbridge.msdk.foundation.same.report.d.d     // Catch: java.lang.Exception -> L2b
            r6.<init>()     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = "cache"
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L2b
            r6.a(r1, r3)     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = "hb"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L2b
            r6.a(r1, r2)     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = "auto_load"
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L2b
            r6.a(r1, r2)     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = "2000127"
            r0.a(r1, r6)     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = "2000048"
            r0.a(r1, r6)     // Catch: java.lang.Exception -> L2b
            boolean r6 = r4.f17592D     // Catch: java.lang.Exception -> L2b
            if (r6 == 0) goto L73
            r6 = 287(0x11f, float:4.02E-43)
            goto L75
        L73:
            r6 = 94
        L75:
            r0.b(r6)     // Catch: java.lang.Exception -> L2b
            java.lang.String r6 = "1"
            r0.i(r6)     // Catch: java.lang.Exception -> L2b
            java.lang.String r6 = "2"
            r0.b(r6)     // Catch: java.lang.Exception -> L2b
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L2b
            if (r6 != 0) goto La9
            com.mbridge.msdk.foundation.same.report.d.c r6 = com.mbridge.msdk.foundation.same.report.d.c.a()     // Catch: java.lang.Exception -> L2b
            java.util.LinkedHashMap r6 = r6.b()     // Catch: java.lang.Exception -> L2b
            boolean r6 = r6.containsKey(r5)     // Catch: java.lang.Exception -> L2b
            if (r6 != 0) goto La9
            com.mbridge.msdk.foundation.same.report.d.c r6 = com.mbridge.msdk.foundation.same.report.d.c.a()     // Catch: java.lang.Exception -> L2b
            java.util.LinkedHashMap r6 = r6.b()     // Catch: java.lang.Exception -> L2b
            r6.put(r5, r0)     // Catch: java.lang.Exception -> L2b
            goto La9
        La2:
            boolean r6 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r6 == 0) goto La9
            r5.printStackTrace()
        La9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.b.a.a(java.util.List, com.mbridge.msdk.foundation.same.report.d.b):com.mbridge.msdk.foundation.same.report.d.b");
    }

    public static /* synthetic */ void a(a aVar, String str, List list) {
        if (list != null) {
            try {
                if (list.size() <= 0 || aVar.f17608V) {
                    return;
                }
                e.a(g.a(com.mbridge.msdk.foundation.controller.c.m().c())).a((List<CampaignEx>) list, str);
            } catch (Throwable th) {
                ad.b("RewardVideoController", th.getMessage());
            }
        }
    }

    public static /* synthetic */ void a(a aVar, String str, com.mbridge.msdk.foundation.same.report.d.b bVar, InterVideoOutListener interVideoOutListener) {
        if (aVar.f17596H) {
            if (bVar == null) {
                bVar = new com.mbridge.msdk.foundation.same.report.d.b();
                bVar.b(aVar.f17601M);
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
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    e4.printStackTrace();
                }
            }
        }
    }
}

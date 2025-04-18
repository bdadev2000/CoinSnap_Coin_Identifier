package com.mbridge.msdk.mbnative.controller;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.j;
import com.mbridge.msdk.c.k;
import com.mbridge.msdk.foundation.db.o;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.same.c;
import com.mbridge.msdk.foundation.same.e.a;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.foundation.same.report.i;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.x;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.mbridge.msdk.mbnative.controller.c;
import com.mbridge.msdk.nativex.view.MBMediaView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class NativeController extends com.mbridge.msdk.mbnative.controller.a {

    /* renamed from: b, reason: collision with root package name */
    public static Map<String, Long> f13928b = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private static final String f13929f = "NativeController";

    /* renamed from: g, reason: collision with root package name */
    private static boolean f13930g;
    private boolean A;
    private int B;
    private int C;
    private int D;
    private int E;
    private com.mbridge.msdk.foundation.same.e.b F;
    private List<com.mbridge.msdk.mbnative.controller.c> G;
    private List<c.a> H;
    private CopyOnWriteArrayList<com.mbridge.msdk.foundation.same.e.a> I;
    private Hashtable<String, kd.b> J;
    private int K;
    private int L;
    private a M;
    private boolean N;
    private boolean O;
    private Timer P;
    private String Q;
    private String R;
    private ViewTreeObserver.OnGlobalLayoutListener S;
    private k T;
    private long U;
    private int V;
    private int W;
    private boolean X;
    private int Y;
    private int Z;

    /* renamed from: aa, reason: collision with root package name */
    private boolean f13931aa;

    /* renamed from: ab, reason: collision with root package name */
    private List<Campaign> f13932ab;

    /* renamed from: ac, reason: collision with root package name */
    private String f13933ac;

    /* renamed from: ad, reason: collision with root package name */
    private kd.a f13934ad;

    /* renamed from: c, reason: collision with root package name */
    protected List<Integer> f13935c;

    /* renamed from: d, reason: collision with root package name */
    protected List<Integer> f13936d;

    /* renamed from: e, reason: collision with root package name */
    Map<String, Object> f13937e;

    /* renamed from: h, reason: collision with root package name */
    private j f13938h;

    /* renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.mbnative.d.a f13939i;

    /* renamed from: j, reason: collision with root package name */
    private NativeListener.NativeTrackingListener f13940j;

    /* renamed from: k, reason: collision with root package name */
    private Context f13941k;

    /* renamed from: l, reason: collision with root package name */
    private String f13942l;

    /* renamed from: m, reason: collision with root package name */
    private String f13943m;

    /* renamed from: n, reason: collision with root package name */
    private Queue<Integer> f13944n;

    /* renamed from: o, reason: collision with root package name */
    private Queue<Long> f13945o;

    /* renamed from: p, reason: collision with root package name */
    private String f13946p;

    /* renamed from: q, reason: collision with root package name */
    private h f13947q;

    /* renamed from: r, reason: collision with root package name */
    private String f13948r;

    /* renamed from: s, reason: collision with root package name */
    private com.mbridge.msdk.click.a f13949s;

    /* renamed from: t, reason: collision with root package name */
    private int f13950t;
    private int u;

    /* renamed from: v, reason: collision with root package name */
    private int f13951v;

    /* renamed from: w, reason: collision with root package name */
    private int f13952w;

    /* renamed from: x, reason: collision with root package name */
    private String f13953x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f13954y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f13955z;

    /* loaded from: classes4.dex */
    public class a extends com.mbridge.msdk.mbnative.f.a.b implements com.mbridge.msdk.foundation.same.e.d {

        /* renamed from: c, reason: collision with root package name */
        private Runnable f13981c;

        /* renamed from: b, reason: collision with root package name */
        private boolean f13980b = false;

        /* renamed from: d, reason: collision with root package name */
        private boolean f13982d = true;

        /* renamed from: e, reason: collision with root package name */
        private List<String> f13983e = null;

        public a() {
        }

        @Override // com.mbridge.msdk.foundation.same.e.d
        public final void a(boolean z10) {
            this.f13980b = z10;
        }

        public final void b(boolean z10) {
            this.f13982d = z10;
        }

        public final void a(List<String> list) {
            this.f13983e = list;
        }

        @Override // com.mbridge.msdk.mbnative.f.a.b
        public final void b(List<Frame> list) {
            if (this.f13980b) {
                return;
            }
            Runnable runnable = this.f13981c;
            if (runnable != null) {
                NativeController.this.a.removeCallbacks(runnable);
            }
            if (list == null || list.size() == 0) {
                if (NativeController.this.f13939i != null) {
                    NativeController.this.f13954y = true;
                    NativeController.this.f13939i.onAdLoadError("frame is empty");
                    return;
                }
                return;
            }
            Iterator<Frame> it = list.iterator();
            while (it.hasNext()) {
                List<CampaignEx> campaigns = it.next().getCampaigns();
                if (campaigns == null || campaigns.size() == 0) {
                    if (NativeController.this.f13939i != null) {
                        NativeController.this.f13954y = true;
                        NativeController.this.f13939i.onAdLoadError("ads in frame is empty");
                        return;
                    }
                    return;
                }
                for (CampaignEx campaignEx : campaigns) {
                    if (NativeController.f13930g) {
                        campaignEx.loadImageUrlAsyncWithBlock(null);
                        campaignEx.loadIconUrlAsyncWithBlock(null);
                    }
                }
            }
            if (NativeController.this.f13939i != null) {
                NativeController.this.f13939i.onAdFramesLoaded(list);
            }
        }

        @Override // com.mbridge.msdk.mbnative.f.a.b
        public final void a(List<com.mbridge.msdk.tracker.network.h> list, CampaignUnit campaignUnit) {
            Integer num;
            int i10 = 1;
            NativeController.this.X = true;
            com.mbridge.msdk.foundation.db.j a = com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(NativeController.this.f13941k));
            a.a();
            Runnable runnable = this.f13981c;
            if (runnable != null) {
                NativeController.this.a.removeCallbacks(runnable);
            }
            com.mbridge.msdk.e.b.a();
            if (campaignUnit != null && campaignUnit.getAds() != null && campaignUnit.getAds().size() > 0) {
                NativeController.this.f13948r = campaignUnit.getSessionId();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                if (NativeController.this.V <= 0) {
                    if (NativeController.this.V == -3) {
                        NativeController.this.V = campaignUnit.getAds().size();
                    } else {
                        NativeController nativeController = NativeController.this;
                        nativeController.V = nativeController.u;
                    }
                    if (NativeController.this.Y != 0 && campaignUnit.getTemplate() == 2) {
                        NativeController nativeController2 = NativeController.this;
                        nativeController2.V = nativeController2.Y;
                    }
                    if (NativeController.this.Z != 0 && campaignUnit.getTemplate() == 3) {
                        NativeController nativeController3 = NativeController.this;
                        nativeController3.V = nativeController3.Z;
                    }
                }
                for (int i11 = 0; i11 < campaignUnit.getAds().size(); i11++) {
                    final CampaignEx campaignEx = campaignUnit.getAds().get(i11);
                    campaignEx.setCampaignUnitId(this.unitId);
                    if (!TextUtils.isEmpty(NativeController.this.Q)) {
                        campaignEx.setBidToken(NativeController.this.Q);
                        campaignEx.setIsBidCampaign(true);
                    }
                    final com.mbridge.msdk.foundation.same.report.d.a.a aVar = null;
                    if (NativeController.f13930g) {
                        campaignEx.loadIconUrlAsyncWithBlock(null);
                        campaignEx.loadImageUrlAsyncWithBlock(null);
                    }
                    boolean c10 = ai.c(NativeController.this.f13941k, campaignEx.getPackageName());
                    Context unused = NativeController.this.f13941k;
                    if (i11 < NativeController.this.u && campaignEx.getOfferType() != 99) {
                        if (ai.c(campaignEx)) {
                            campaignEx.setRtinsType(c10 ? 1 : 2);
                        }
                        if (com.mbridge.msdk.foundation.same.c.a(NativeController.this.f13941k, campaignEx)) {
                            arrayList.add(campaignEx);
                            if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                                arrayList3.add(campaignEx);
                            }
                        } else {
                            ai.a(this.unitId, campaignEx, com.mbridge.msdk.foundation.same.a.f13292x);
                            NativeController.this.f13933ac = "APP ALREADY INSTALLED";
                        }
                        try {
                            com.mbridge.msdk.foundation.same.c.a(campaignEx, NativeController.this.f13941k, null, new c.a() { // from class: com.mbridge.msdk.mbnative.controller.NativeController.a.1
                                @Override // com.mbridge.msdk.foundation.same.c.a
                                public final void a(String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
                                    com.mbridge.msdk.mbnative.e.a.a(str, bVar, campaignEx, NativeController.this.f13941k, aVar);
                                }
                            });
                        } catch (Exception e2) {
                            if (MBridgeConstans.DEBUG) {
                                e2.printStackTrace();
                            }
                        }
                    }
                    if (i11 < NativeController.this.V && campaignEx.getOfferType() != 99) {
                        if (ai.c(campaignEx)) {
                            campaignEx.setRtinsType(c10 ? 1 : 2);
                        }
                        if (!c10) {
                            arrayList2.add(campaignEx);
                        } else if (ai.c(campaignEx)) {
                            arrayList2.add(campaignEx);
                        }
                    }
                    if (!a.b(campaignEx.getId())) {
                        com.mbridge.msdk.foundation.entity.g gVar = new com.mbridge.msdk.foundation.entity.g();
                        gVar.a(campaignEx.getId());
                        gVar.b(campaignEx.getFca());
                        gVar.c(campaignEx.getFcb());
                        gVar.a(0);
                        gVar.d(0);
                        gVar.a(System.currentTimeMillis());
                        a.a(gVar);
                    }
                    com.mbridge.msdk.click.c.a(NativeController.this.f13941k, campaignEx.getMaitve(), campaignEx.getMaitve_src());
                }
                NativeController.c(NativeController.this, arrayList3);
                int type = campaignUnit.getAds().get(0) != null ? campaignUnit.getAds().get(0).getType() : 1;
                com.mbridge.msdk.mbnative.a.b<String, List<Campaign>> a10 = com.mbridge.msdk.mbnative.a.c.a(type);
                if (a10 != null) {
                    a10.a((com.mbridge.msdk.mbnative.a.b<String, List<Campaign>>) this.unitId, (String) arrayList2, NativeController.this.Q);
                }
                if (arrayList.size() == 0) {
                    if (NativeController.this.f13933ac.contains("INSTALLED")) {
                        NativeController.this.a("APP ALREADY INSTALLED", b(), a(), campaignUnit.getAds().get(0));
                        new com.mbridge.msdk.foundation.c.b(880021, "APP ALREADY INSTALLED");
                        return;
                    } else {
                        NativeController.this.a("v3 response error", b(), a(), campaignUnit.getAds().get(0));
                        new com.mbridge.msdk.foundation.c.b(880003);
                        return;
                    }
                }
                NativeController nativeController4 = NativeController.this;
                nativeController4.a((List<Campaign>) nativeController4.a(type, (List<Campaign>) nativeController4.d(arrayList)));
                if (com.mbridge.msdk.mbnative.controller.d.b().containsKey(this.unitId) && Boolean.TRUE.equals(com.mbridge.msdk.mbnative.controller.d.b().get(this.unitId))) {
                    com.mbridge.msdk.mbnative.controller.d.a(NativeController.this.f13951v, this.unitId);
                    return;
                }
                if (com.mbridge.msdk.mbnative.controller.d.e().containsKey(this.unitId) && (num = com.mbridge.msdk.mbnative.controller.d.e().get(this.unitId)) != null) {
                    i10 = num.intValue();
                }
                int i12 = NativeController.this.f13952w + NativeController.this.u;
                NativeController.this.f13952w = i12 <= i10 ? i12 : 0;
                return;
            }
            this.unitId = "0_" + this.unitId;
            com.mbridge.msdk.mbnative.controller.d.b(NativeController.this.f13951v, this.unitId);
            NativeController.this.f13952w = 0;
        }

        @Override // com.mbridge.msdk.mbnative.f.a.b
        public final void a(int i10, String str) {
            NativeController.this.X = true;
            if (!this.f13980b) {
                if (i10 == -1) {
                    com.mbridge.msdk.mbnative.controller.d.b(NativeController.this.f13951v, this.unitId);
                    NativeController.this.f13952w = 0;
                }
                Runnable runnable = this.f13981c;
                if (runnable != null) {
                    NativeController.this.a.removeCallbacks(runnable);
                }
                if (NativeController.this.f13954y) {
                    return;
                }
                if (b() == 1 || this.f13982d) {
                    NativeController.this.a(str, b(), a(), (CampaignEx) null);
                    return;
                }
                return;
            }
            if (NativeController.this.f13954y || !this.f13982d) {
                return;
            }
            NativeController.this.a(str, b(), a(), (CampaignEx) null);
        }

        public final void a(Runnable runnable) {
            this.f13981c = runnable;
        }
    }

    /* loaded from: classes4.dex */
    public interface b {
        void a();
    }

    /* loaded from: classes4.dex */
    public class c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private int f13986b;

        /* renamed from: c, reason: collision with root package name */
        private com.mbridge.msdk.foundation.same.e.d f13987c;

        /* renamed from: d, reason: collision with root package name */
        private int f13988d;

        /* renamed from: e, reason: collision with root package name */
        private String f13989e;

        public c(int i10, com.mbridge.msdk.foundation.same.e.d dVar, int i11, String str) {
            this.f13986b = i10;
            this.f13987c = dVar;
            this.f13988d = i11;
            this.f13989e = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f13987c.a(true);
            int i10 = this.f13986b;
            if (i10 != 1) {
                if (i10 == 2) {
                    if (!NativeController.this.f13954y || this.f13988d == 1) {
                        NativeController.this.a("REQUEST_TIMEOUT", this.f13988d, this.f13989e, (CampaignEx) null);
                        return;
                    }
                    return;
                }
                return;
            }
            NativeController.this.X = true;
            NativeController.this.a("REQUEST_TIMEOUT", this.f13988d, this.f13989e, (CampaignEx) null);
        }
    }

    /* loaded from: classes4.dex */
    public static class d implements H5DownLoadManager.IH5SourceDownloadListener {
        private String a;

        /* renamed from: b, reason: collision with root package name */
        private CampaignEx f13990b;

        /* renamed from: c, reason: collision with root package name */
        private long f13991c = System.currentTimeMillis();

        /* renamed from: d, reason: collision with root package name */
        private boolean f13992d;

        public d(String str, CampaignEx campaignEx, boolean z10) {
            this.f13992d = true;
            this.a = str;
            this.f13990b = campaignEx;
            this.f13992d = z10;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public final void onFailed(String str, String str2) {
            try {
                if (this.f13992d) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f13991c;
                    o.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().c()));
                    n nVar = new n("2000043", 3, currentTimeMillis + "", str, this.f13990b.getId(), this.a, str2, MBridgeConstans.API_REUQEST_CATEGORY_APP);
                    nVar.f(this.f13990b.getRequestId());
                    nVar.s(this.f13990b.getCurrentLocalRid());
                    nVar.g(this.f13990b.getRequestIdNotice());
                    CampaignEx campaignEx = this.f13990b;
                    if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getId())) {
                        nVar.e(this.f13990b.getId());
                    }
                    CampaignEx campaignEx2 = this.f13990b;
                    if (campaignEx2 != null) {
                        nVar.c(campaignEx2.getAdSpaceT());
                    }
                    nVar.d("1");
                    com.mbridge.msdk.foundation.same.report.g.a(nVar, this.a, this.f13990b);
                }
            } catch (Exception e2) {
                ad.b(NativeController.f13929f, com.mbridge.msdk.mbnative.b.a.a(e2));
            }
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public final void onSuccess(String str, String str2, boolean z10) {
            try {
                if (this.f13992d) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f13991c;
                    o.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().c()));
                    n nVar = new n("2000043", 1, currentTimeMillis + "", str, this.f13990b.getId(), this.a, "", MBridgeConstans.API_REUQEST_CATEGORY_APP);
                    CampaignEx campaignEx = this.f13990b;
                    if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getId())) {
                        nVar.e(this.f13990b.getId());
                    }
                    CampaignEx campaignEx2 = this.f13990b;
                    if (campaignEx2 != null) {
                        nVar.f(campaignEx2.getRequestId());
                        nVar.g(this.f13990b.getRequestIdNotice());
                        nVar.s(this.f13990b.getCurrentLocalRid());
                        nVar.c(this.f13990b.getAdSpaceT());
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        nVar.t(str2);
                    }
                    nVar.d("1");
                    com.mbridge.msdk.foundation.same.report.g.a(nVar, this.a, this.f13990b);
                }
            } catch (Exception e2) {
                ad.b(NativeController.f13929f, com.mbridge.msdk.mbnative.b.a.a(e2));
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class e extends Handler {
        private WeakReference<NativeController> a;

        public e(NativeController nativeController) {
            this.a = new WeakReference<>(nativeController);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            WeakReference<NativeController> weakReference;
            NativeController nativeController;
            super.handleMessage(message);
            try {
                NativeController nativeController2 = null;
                if (message.what == 0 && (weakReference = this.a) != null && (nativeController = weakReference.get()) != null) {
                    h unused = nativeController.f13947q;
                    int i10 = message.arg1;
                    com.mbridge.msdk.foundation.same.report.d.c.a().d(i.a((Campaign) null, i10, com.vungle.ads.internal.ui.i.REQUEST_KEY_EXTRA));
                }
                if (message.what == 1) {
                    WeakReference<NativeController> weakReference2 = this.a;
                    if (weakReference2 != null && weakReference2.get() != null) {
                        nativeController2 = this.a.get();
                    }
                    if (nativeController2 != null) {
                        nativeController2.f13955z = true;
                        List<Campaign> a = nativeController2.a(nativeController2.f13942l, nativeController2.u, nativeController2.Q);
                        if (!nativeController2.f13954y) {
                            nativeController2.a(a);
                        }
                    }
                }
            } catch (Exception e2) {
                ad.b(NativeController.f13929f, com.mbridge.msdk.mbnative.b.a.a(e2));
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class f extends com.mbridge.msdk.foundation.same.e.a {
        private CampaignEx a;

        /* renamed from: b, reason: collision with root package name */
        private WeakReference<View> f13993b;

        /* renamed from: c, reason: collision with root package name */
        private WeakReference<List<View>> f13994c;

        /* renamed from: d, reason: collision with root package name */
        private WeakReference<NativeController> f13995d;

        /* renamed from: e, reason: collision with root package name */
        private WeakReference<kd.b> f13996e;

        public f(CampaignEx campaignEx, View view, List<View> list, NativeController nativeController, kd.b bVar) {
            this.a = campaignEx;
            this.f13993b = new WeakReference<>(view);
            this.f13994c = new WeakReference<>(list);
            this.f13995d = new WeakReference<>(nativeController);
            this.f13996e = new WeakReference<>(bVar);
        }

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void cancelTask() {
        }

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void pauseTask(boolean z10) {
        }

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void runTask() {
            WeakReference<View> weakReference;
            kd.b bVar;
            try {
                if (this.f13995d != null && (weakReference = this.f13993b) != null && this.f13994c != null) {
                    View view = weakReference.get();
                    List<View> list = this.f13994c.get();
                    NativeController nativeController = this.f13995d.get();
                    WeakReference<kd.b> weakReference2 = this.f13996e;
                    if (weakReference2 != null) {
                        bVar = weakReference2.get();
                    } else {
                        bVar = null;
                    }
                    if (view != null && nativeController != null) {
                        NativeController.a(nativeController, this.a, view, list, bVar);
                    }
                }
            } catch (Exception e2) {
                ad.b(NativeController.f13929f, com.mbridge.msdk.mbnative.b.a.a(e2));
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class g implements H5DownLoadManager.ZipDownloadListener {
        String a;

        /* renamed from: b, reason: collision with root package name */
        CampaignEx f13997b;

        /* renamed from: c, reason: collision with root package name */
        private long f13998c = System.currentTimeMillis();

        /* renamed from: d, reason: collision with root package name */
        private boolean f13999d;

        public g(String str, CampaignEx campaignEx, boolean z10) {
            this.f13999d = true;
            this.a = str;
            this.f13997b = campaignEx;
            this.f13999d = z10;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public final void onFailed(String str, String str2) {
            try {
                if (this.f13999d) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f13998c;
                    o.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().c()));
                    n nVar = new n("2000043", 3, currentTimeMillis + "", str2, this.f13997b.getId(), this.a, str, "1");
                    CampaignEx campaignEx = this.f13997b;
                    if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getId())) {
                        nVar.e(this.f13997b.getId());
                    }
                    CampaignEx campaignEx2 = this.f13997b;
                    if (campaignEx2 != null) {
                        nVar.f(campaignEx2.getRequestId());
                        nVar.s(this.f13997b.getCurrentLocalRid());
                        nVar.g(this.f13997b.getRequestIdNotice());
                        nVar.c(this.f13997b.getAdSpaceT());
                    }
                    nVar.d(MBridgeConstans.API_REUQEST_CATEGORY_APP);
                    com.mbridge.msdk.foundation.same.report.g.a(nVar, this.a, this.f13997b);
                }
            } catch (Exception e2) {
                ad.b(NativeController.f13929f, com.mbridge.msdk.mbnative.b.a.a(e2));
            }
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public final void onSuccess(String str, String str2, boolean z10) {
            try {
                if (this.f13999d) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f13998c;
                    o.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().c()));
                    n nVar = new n("2000043", 1, currentTimeMillis + "", str, this.f13997b.getId(), this.a, "", "1");
                    CampaignEx campaignEx = this.f13997b;
                    if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getId())) {
                        nVar.e(this.f13997b.getId());
                    }
                    CampaignEx campaignEx2 = this.f13997b;
                    if (campaignEx2 != null) {
                        nVar.f(campaignEx2.getRequestId());
                        nVar.s(this.f13997b.getCurrentLocalRid());
                        nVar.g(this.f13997b.getRequestIdNotice());
                        nVar.c(this.f13997b.getAdSpaceT());
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        nVar.t(str2);
                    }
                    nVar.d(MBridgeConstans.API_REUQEST_CATEGORY_APP);
                    com.mbridge.msdk.foundation.same.report.g.a(nVar, this.a, this.f13997b);
                }
            } catch (Exception e2) {
                ad.b(NativeController.f13929f, com.mbridge.msdk.mbnative.b.a.a(e2));
            }
        }
    }

    public NativeController(com.mbridge.msdk.mbnative.d.a aVar, NativeListener.NativeTrackingListener nativeTrackingListener, Map<String, Object> map, Context context) {
        com.mbridge.msdk.mbnative.a.b<String, List<Campaign>> a10;
        int i10;
        Object obj;
        this.f13950t = 1;
        this.u = 1;
        this.f13951v = -1;
        this.f13952w = 0;
        this.f13954y = false;
        this.f13955z = false;
        this.A = false;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.I = new CopyOnWriteArrayList<>();
        this.J = new Hashtable<>();
        this.K = 1;
        this.L = 2;
        this.Q = "";
        this.R = "";
        this.f13933ac = "";
        this.f13941k = context;
        this.f13937e = map;
        this.f13938h = new j();
        this.f13939i = aVar;
        this.f13940j = nativeTrackingListener;
        this.G = new ArrayList();
        this.H = new ArrayList();
        String str = (String) map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
        this.f13942l = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (map.containsKey(MBridgeConstans.PLACEMENT_ID) && map.get(MBridgeConstans.PLACEMENT_ID) != null) {
            this.f13943m = (String) map.get(MBridgeConstans.PLACEMENT_ID);
        } else {
            this.f13943m = "";
        }
        if (map.containsKey(MBridgeConstans.PREIMAGE) && (obj = map.get(MBridgeConstans.PREIMAGE)) != null) {
            f13930g = ((Boolean) obj).booleanValue();
        }
        this.f13944n = new LinkedList();
        this.f13945o = new LinkedList();
        this.F = new com.mbridge.msdk.foundation.same.e.b(this.f13941k);
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        this.a = new e(this);
        if (map.containsKey(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY)) {
            this.f13953x = (String) map.get(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY);
        }
        try {
            boolean equals = com.mbridge.msdk.mbnative.controller.d.b().containsKey(this.f13942l) ? Boolean.TRUE.equals(com.mbridge.msdk.mbnative.controller.d.b().get(this.f13942l)) : false;
            Object obj2 = map.get("ad_num");
            Object obj3 = map.get(MBridgeConstans.PROPERTIES_AD_FRAME_NUM);
            if (!equals) {
                if (map.containsKey("ad_num") && obj2 != null) {
                    try {
                        i10 = ((Integer) obj2).intValue();
                    } catch (Exception e2) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b(f13929f, e2.getMessage());
                        }
                        i10 = 1;
                    }
                    i10 = i10 < 1 ? 1 : i10;
                    i10 = i10 > 10 ? 10 : i10;
                    this.u = i10;
                    this.f13950t = i10;
                }
                if (map.containsKey(MBridgeConstans.PROPERTIES_AD_FRAME_NUM) && obj3 != null) {
                    try {
                        this.D = ((Integer) obj3).intValue();
                    } catch (Exception e10) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b(f13929f, e10.getMessage());
                        }
                    }
                }
            } else if (com.mbridge.msdk.mbnative.controller.d.d().containsKey(this.f13942l)) {
                Integer num = com.mbridge.msdk.mbnative.controller.d.d().get(this.f13942l);
                if (num != null) {
                    this.u = num.intValue();
                }
                if (map.containsKey("ad_num") && obj2 != null) {
                    int intValue = ((Integer) obj2).intValue();
                    this.B = intValue;
                    this.f13950t = intValue;
                }
                if (map.containsKey(MBridgeConstans.PROPERTIES_AD_FRAME_NUM) && obj3 != null) {
                    int intValue2 = ((Integer) obj3).intValue();
                    this.C = intValue2;
                    this.D = intValue2;
                }
            }
        } catch (Exception e11) {
            ad.b(f13929f, com.mbridge.msdk.mbnative.b.a.a(e11));
        }
        this.f13947q = new h(this.f13941k);
        this.f13949s = new com.mbridge.msdk.click.a(this.f13941k, this.f13942l);
        try {
            int i11 = MBMediaView.f14220a0;
            this.O = true;
            Map<String, Object> map2 = this.f13937e;
            if (map2 != null && (map2.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH) || this.f13937e.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT) || map.containsKey(MBridgeConstans.NATIVE_VIDEO_SUPPORT))) {
                this.N = true;
            }
            com.mbridge.msdk.mbnative.controller.e.a(this.f13941k, this.f13942l);
            ab.a();
            if (TextUtils.isEmpty(this.f13942l)) {
                return;
            }
            com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(this.f13941k)).a();
            int a11 = a(map.containsKey(MBridgeConstans.NATIVE_INFO) ? (String) map.get(MBridgeConstans.NATIVE_INFO) : null);
            String str2 = this.f13942l;
            a11 = a11 <= 0 ? this.f13950t : a11;
            k d10 = com.mbridge.msdk.c.h.a().d("", str2);
            this.T = d10;
            if (d10 == null) {
                this.T = k.d(str2);
            }
            List<Integer> b3 = this.T.b();
            this.f13935c = b3;
            List<Campaign> b10 = (b3 == null || b3.size() <= 0 || !this.f13935c.contains(1) || (a10 = com.mbridge.msdk.mbnative.a.c.a(1)) == null) ? null : a10.b(str2, a11);
            if (b10 != null) {
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < b10.size(); i12++) {
                    CampaignEx campaignEx = (CampaignEx) b10.get(i12);
                    if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                        arrayList.add(campaignEx);
                    }
                }
                if (arrayList.size() > 0) {
                    Object invoke = com.mbridge.msdk.videocommon.download.b.class.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                    com.mbridge.msdk.videocommon.download.b.class.getMethod("createUnitCache", Context.class, String.class, CopyOnWriteArrayList.class, Integer.TYPE, com.mbridge.msdk.videocommon.listener.a.class).invoke(invoke, context, this.f13942l, new CopyOnWriteArrayList(arrayList), 1, null);
                    com.mbridge.msdk.videocommon.download.b.class.getMethod("load", String.class).invoke(invoke, this.f13942l);
                }
            }
        } catch (Throwable unused) {
            ad.b(f13929f, "please import the nativex aar");
        }
    }

    public static void insertExcludeId(String str, CampaignEx campaignEx) {
        if (!TextUtils.isEmpty(str) && campaignEx != null && com.mbridge.msdk.foundation.controller.c.m().c() != null) {
            com.mbridge.msdk.foundation.db.i a10 = com.mbridge.msdk.foundation.db.i.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().c()));
            com.mbridge.msdk.foundation.entity.f fVar = new com.mbridge.msdk.foundation.entity.f();
            fVar.a(System.currentTimeMillis());
            fVar.b(str);
            fVar.a(campaignEx.getId());
            a10.a(fVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public k f() {
        k d10 = com.mbridge.msdk.c.h.a().d("", this.f13942l);
        this.T = d10;
        if (d10 == null) {
            this.T = k.d(this.f13942l);
        }
        return this.T;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        Timer timer = this.P;
        if (timer != null) {
            timer.cancel();
            this.P = null;
        }
    }

    public static /* synthetic */ void c(NativeController nativeController, List list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    try {
                        int i10 = MBMediaView.f14220a0;
                        Object invoke = com.mbridge.msdk.videocommon.download.b.class.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                        if (invoke != null) {
                            com.mbridge.msdk.videocommon.download.b.class.getMethod("createUnitCache", Context.class, String.class, CopyOnWriteArrayList.class, Integer.TYPE, com.mbridge.msdk.videocommon.listener.a.class).invoke(invoke, nativeController.f13941k, nativeController.f13942l, new CopyOnWriteArrayList(list), 1, null);
                            com.mbridge.msdk.videocommon.download.b.class.getMethod("load", String.class).invoke(invoke, nativeController.f13942l);
                        }
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            CampaignEx campaignEx = (CampaignEx) it.next();
                            if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getImageUrl())) {
                                com.mbridge.msdk.foundation.same.c.b.a(com.mbridge.msdk.foundation.controller.c.m().c()).a(campaignEx.getImageUrl(), new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.mbnative.controller.NativeController.4
                                    @Override // com.mbridge.msdk.foundation.same.c.c
                                    public final void onFailedLoad(String str, String str2) {
                                    }

                                    @Override // com.mbridge.msdk.foundation.same.c.c
                                    public final void onSuccessLoad(Bitmap bitmap, String str) {
                                    }
                                });
                            }
                            String str = "";
                            if (campaignEx != null) {
                                try {
                                    str = campaignEx.getendcard_url();
                                } catch (Exception unused) {
                                }
                            }
                            com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
                            bVar.a(campaignEx);
                            if (!TextUtils.isEmpty(str)) {
                                bVar.c((campaignEx == null || campaignEx.getAabEntity() == null) ? 0 : campaignEx.getAabEntity().h3c);
                                if (str.contains(".zip") && str.contains(ResourceManager.KEY_MD5FILENAME)) {
                                    H5DownLoadManager.getInstance().downloadH5Res(bVar, str, new g(nativeController.f13942l, campaignEx, TextUtils.isEmpty(H5DownLoadManager.getInstance().getH5ResAddress(str))));
                                } else {
                                    H5DownLoadManager.getInstance().downloadH5Res(bVar, str, new d(nativeController.f13942l, campaignEx, TextUtils.isEmpty(HTMLResourceManager.getInstance().getHtmlContentFromUrl(str))));
                                }
                            }
                        }
                    } catch (Throwable unused2) {
                        ad.b(f13929f, "please import the videocommon and nativex aar");
                    }
                }
            } catch (Throwable th2) {
                if (MBridgeConstans.DEBUG) {
                    th2.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<Campaign> d(List<Campaign> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        for (Campaign campaign : list) {
            if (campaign instanceof CampaignEx) {
                CampaignEx campaignEx = (CampaignEx) campaign;
                if (TextUtils.isEmpty(this.Q) && TextUtils.isEmpty(campaignEx.getBidToken()) && !campaignEx.isBidCampaign()) {
                    arrayList2.add(campaignEx);
                } else if (!TextUtils.isEmpty(this.Q) && TextUtils.equals(campaignEx.getBidToken(), this.Q)) {
                    arrayList.add(campaign);
                }
            } else {
                arrayList2.add(campaign);
            }
        }
        return TextUtils.isEmpty(this.Q) ? arrayList2 : arrayList;
    }

    public static List<String> b(Map<String, Object> map) {
        ArrayList arrayList = null;
        try {
            if (!(map.get(MBridgeConstans.KEY_WORD) instanceof String)) {
                return null;
            }
            String str = (String) map.get(MBridgeConstans.KEY_WORD);
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() == 0) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                try {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString(TtmlNode.TAG_P);
                        if (!TextUtils.isEmpty(optString)) {
                            arrayList2.add(optString);
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    arrayList = arrayList2;
                    ad.b(f13929f, com.mbridge.msdk.mbnative.b.a.a(e));
                    return arrayList;
                }
            }
            return arrayList2;
        } catch (Exception e10) {
            e = e10;
        }
    }

    public static boolean a(Map<String, Object> map) {
        if (map == null) {
            return false;
        }
        try {
            if (map.containsKey(MBridgeConstans.APP_ID) && map.containsKey(MBridgeConstans.APP_KEY) && map.containsKey(MBridgeConstans.KEY_WORD)) {
                return map.get(MBridgeConstans.KEY_WORD) != null;
            }
            return false;
        } catch (Exception e2) {
            ad.b(f13929f, com.mbridge.msdk.mbnative.b.a.a(e2));
            return false;
        }
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
            ad.b(f13929f, com.mbridge.msdk.mbnative.b.a.a(e2));
        }
        return 0;
    }

    private void b(int i10, String str) {
        com.mbridge.msdk.mbnative.d.a aVar;
        Long poll;
        Queue<Integer> queue = this.f13944n;
        if (queue != null && queue.size() > 0) {
            Integer poll2 = this.f13944n.poll();
            int intValue = poll2 != null ? poll2.intValue() : 1;
            this.U = MBridgeConstans.REQUEST_TIME_OUT;
            Queue<Long> queue2 = this.f13945o;
            if (queue2 != null && queue2.size() > 0 && (poll = this.f13945o.poll()) != null) {
                this.U = poll.longValue();
            }
            b(intValue, this.U, i10, str);
            return;
        }
        if (this.f13954y || (aVar = this.f13939i) == null) {
            return;
        }
        this.f13954y = true;
        aVar.onAdLoadError("no ad source");
    }

    public final void a(int i10, String str) {
        boolean z10;
        this.f13954y = false;
        this.f13955z = false;
        this.A = false;
        this.X = false;
        this.Q = str;
        this.f13939i.a(!TextUtils.isEmpty(str));
        this.M = null;
        Map<String, Long> map = f13928b;
        if (map != null && map.size() > 0) {
            f13928b.clear();
        }
        if (((com.mbridge.msdk.mbnative.controller.d.b() == null || !com.mbridge.msdk.mbnative.controller.d.b().containsKey(this.f13942l)) ? false : Boolean.TRUE.equals(com.mbridge.msdk.mbnative.controller.d.b().get(this.f13942l))) && i10 == 1 && a(i10)) {
            return;
        }
        String k10 = com.mbridge.msdk.foundation.controller.c.m().k();
        String b3 = com.mbridge.msdk.foundation.controller.c.m().b();
        if (this.f13937e.containsKey(MBridgeConstans.APP_ID) && this.f13937e.containsKey(MBridgeConstans.APP_KEY) && this.f13937e.containsKey(MBridgeConstans.KEY_WORD)) {
            k10 = (String) this.f13937e.get(MBridgeConstans.APP_ID);
            b3 = (String) this.f13937e.get(MBridgeConstans.APP_KEY);
        }
        this.f13938h.a(this.f13941k, k10, b3, this.f13942l);
        k d10 = com.mbridge.msdk.c.h.a().d(k10, this.f13942l);
        this.T = d10;
        if (d10 == null) {
            this.T = k.d(this.f13942l);
        }
        com.mbridge.msdk.mbnative.controller.d.e().put(this.f13942l, Integer.valueOf(this.T.w() * this.u));
        this.f13935c = this.T.b();
        this.f13936d = this.T.c();
        this.W = this.T.e();
        this.V = this.T.d();
        this.u = this.f13950t;
        List<Integer> list = this.f13935c;
        if (list != null && list.size() != 0) {
            try {
                z10 = com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.a(com.mbridge.msdk.foundation.controller.c.m().c());
            } catch (Exception unused) {
                z10 = false;
            }
            if (!z10) {
                com.mbridge.msdk.mbnative.d.a aVar = this.f13939i;
                if (aVar != null) {
                    aVar.onAdLoadError("webview is not available");
                    return;
                }
                return;
            }
            if (this.f13937e.containsKey(MBridgeConstans.NATIVE_INFO) && this.f13946p == null) {
                String str2 = (String) this.f13937e.get(MBridgeConstans.NATIVE_INFO);
                this.f13946p = str2;
                if (str2 != null) {
                    try {
                        JSONArray jSONArray = new JSONArray(this.f13946p);
                        if (jSONArray.length() > 0) {
                            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                                JSONObject jSONObject = (JSONObject) jSONArray.opt(i11);
                                int optInt = jSONObject.optInt("id", 0);
                                if (2 == optInt) {
                                    this.Y = jSONObject.optInt("ad_num");
                                    if (this.W > 0) {
                                        jSONObject.remove("ad_num");
                                        jSONObject.put("ad_num", this.W);
                                    }
                                } else if (3 == optInt) {
                                    this.Z = jSONObject.optInt("ad_num");
                                    if (this.W > 0) {
                                        jSONObject.remove("ad_num");
                                        jSONObject.put("ad_num", this.W);
                                    }
                                }
                            }
                        }
                        this.K = Math.max(this.Y, this.Z);
                        this.f13946p = jSONArray.toString();
                    } catch (JSONException e2) {
                        ad.b(f13929f, com.mbridge.msdk.mbnative.b.a.a(e2));
                    }
                }
            }
            if ((!this.f13935c.contains(1) || this.f13935c.get(0).intValue() == 1) && i10 == 0 && a(a(this.f13942l, this.u, this.Q))) {
                return;
            }
            this.f13931aa = true;
            if (this.f13935c.contains(1) && i10 == 0 && this.f13935c.get(0).intValue() != 1) {
                int intValue = this.f13935c.get(0).intValue();
                com.mbridge.msdk.mbnative.a.b<String, List<Campaign>> a10 = com.mbridge.msdk.mbnative.a.c.a(intValue);
                if (intValue == 2 && this.f13937e.containsKey(MBridgeConstans.NATIVE_INFO)) {
                    this.u = this.K;
                } else {
                    this.u = this.f13950t;
                }
                if (a10 != null && a(a(intValue, d(a10.b(this.f13942l, this.u))))) {
                    return;
                }
                this.f13931aa = false;
                try {
                    a(this.f13936d.get(this.f13935c.indexOf(1)).intValue() * 1000, i10, false, this.f13942l, this.Q);
                } catch (Exception unused2) {
                }
            }
            this.a.sendEmptyMessageDelayed(1, this.T.u() * 1000);
            List<Integer> list2 = this.f13935c;
            if (list2 != null && list2.size() > 0) {
                Queue<Integer> queue = this.f13944n;
                if (queue != null && queue.size() > 0) {
                    this.f13944n.clear();
                }
                for (Integer num : this.f13935c) {
                    Queue<Integer> queue2 = this.f13944n;
                    if (queue2 != null) {
                        queue2.add(num);
                    }
                }
            }
            List<Integer> list3 = this.f13936d;
            if (list3 != null && list3.size() > 0) {
                Queue<Long> queue3 = this.f13945o;
                if (queue3 != null && queue3.size() > 0) {
                    this.f13945o.clear();
                }
                for (Integer num2 : this.f13936d) {
                    Queue<Long> queue4 = this.f13945o;
                    if (queue4 != null) {
                        queue4.add(Long.valueOf(num2.intValue() * 1000));
                    }
                }
            }
            b(i10, this.Q);
            return;
        }
        com.mbridge.msdk.mbnative.d.a aVar2 = this.f13939i;
        if (aVar2 != null) {
            this.f13954y = true;
            aVar2.onAdLoadError("do not have sorceList");
        }
    }

    private void b(int i10, long j3, int i11, String str) {
        com.mbridge.msdk.mbnative.a.b<String, List<Campaign>> a10;
        if (i11 == 0 && (a10 = com.mbridge.msdk.mbnative.a.c.a(i10)) != null) {
            if ((i10 == 1 || i10 == 2) && this.f13937e.containsKey(MBridgeConstans.NATIVE_INFO)) {
                this.u = this.K;
            } else {
                this.u = this.f13950t;
            }
            if (a(a(i10, d(a10.b(this.f13942l, this.u))))) {
                return;
            }
        }
        if (i10 == 1) {
            a(j3, i11, true, this.f13942l, str);
        } else if (i10 != 2) {
            a(i10, j3, i11, str);
        } else {
            a(2, j3, i11, str);
        }
    }

    private List<Campaign> c(List<Campaign> list) {
        ArrayList arrayList = null;
        if (list != null) {
            for (Campaign campaign : list) {
                if (campaign instanceof CampaignEx) {
                    CampaignEx campaignEx = (CampaignEx) campaign;
                    if (TextUtils.isEmpty(campaignEx.getImageUrl()) && !TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(campaign);
                    }
                }
            }
        }
        return arrayList;
    }

    private kd.b b(CampaignEx campaignEx) {
        if (this.J == null) {
            this.J = new Hashtable<>();
        }
        String requestIdNotice = campaignEx.getRequestIdNotice();
        kd.b bVar = this.J.get(requestIdNotice);
        if (bVar == null && campaignEx.isActiveOm() && TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
            bVar = com.mbridge.msdk.a.b.a(this.f13941k, true, campaignEx.getOmid(), campaignEx.getRequestId(), campaignEx.getId(), this.f13942l, "", campaignEx.getRequestIdNotice());
        }
        if (bVar != null) {
            this.J.put(requestIdNotice, bVar);
        }
        return bVar;
    }

    public final String c() {
        ArrayList arrayList = new ArrayList();
        List<Campaign> list = this.f13932ab;
        if (list != null) {
            for (Campaign campaign : list) {
                CampaignEx campaignEx = new CampaignEx();
                campaignEx.setCreativeId(campaign.getCreativeId());
                arrayList.add(campaignEx);
            }
        }
        return com.mbridge.msdk.foundation.same.c.a(arrayList);
    }

    public final void b(Campaign campaign, View view) {
        b(campaign, view, null);
    }

    public final void b(Campaign campaign, View view, List<View> list) {
        Class<MBMediaView> cls;
        if (view != null && this.S != null) {
            try {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this.S);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        if (campaign != null) {
            int type = campaign.getType();
            if (type == 1 || type == 2) {
                try {
                    cls = MBMediaView.class;
                    int i10 = MBMediaView.f14220a0;
                } catch (Throwable unused) {
                    cls = null;
                }
                if (list == null || list.size() <= 0) {
                    if (view != null) {
                        a(view, cls);
                    }
                } else {
                    Iterator<View> it = list.iterator();
                    while (it.hasNext()) {
                        a(it.next(), cls);
                    }
                }
            }
        }
    }

    private List<Campaign> b(List<Campaign> list) {
        if (list != null) {
            CampaignEx campaignEx = null;
            for (int size = list.size() - 1; size >= 0; size--) {
                try {
                    campaignEx = (CampaignEx) list.get(size);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
                if (campaignEx != null && TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                    Campaign remove = list.remove(size);
                    com.mbridge.msdk.mbnative.a.c.a(campaignEx.getType()).a(this.f13942l, remove, this.Q);
                    ad.a(f13929f, "remove no videoURL ads:" + remove);
                }
            }
        }
        return list;
    }

    public final String b() {
        return this.R;
    }

    public NativeController() {
        this.f13950t = 1;
        this.u = 1;
        this.f13951v = -1;
        this.f13952w = 0;
        this.f13954y = false;
        this.f13955z = false;
        this.A = false;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.I = new CopyOnWriteArrayList<>();
        this.J = new Hashtable<>();
        this.K = 1;
        this.L = 2;
        this.Q = "";
        this.R = "";
        this.f13933ac = "";
    }

    private boolean a(int i10) {
        int i11;
        int i12;
        int i13;
        com.mbridge.msdk.mbnative.d.a aVar;
        int i14 = 0;
        if (com.mbridge.msdk.mbnative.controller.d.b().containsKey(this.f13942l) && Boolean.TRUE.equals(com.mbridge.msdk.mbnative.controller.d.b().get(this.f13942l))) {
            Map<String, Map<Long, Object>> a10 = com.mbridge.msdk.mbnative.controller.d.a();
            Map<Long, Object> map = a10.get(i10 + "_" + this.f13942l);
            Integer num = com.mbridge.msdk.mbnative.controller.d.d().get(this.f13942l);
            com.mbridge.msdk.c.g d10 = com.applovin.impl.mediation.ads.e.d(com.mbridge.msdk.c.h.a());
            if (num != null) {
                this.u = num.intValue();
            }
            if (map != null && map.size() > 0) {
                Long next = map.keySet().iterator().next();
                long currentTimeMillis = System.currentTimeMillis();
                if (d10 == null) {
                    com.mbridge.msdk.c.h.a();
                    d10 = com.mbridge.msdk.c.i.a();
                }
                if (currentTimeMillis - next.longValue() >= d10.Z() * 1000) {
                    a10.remove(i10 + "_" + this.f13942l);
                } else {
                    if (i10 == 1) {
                        List<Frame> list = (List) map.get(next);
                        if (list == null || list.size() <= 0 || (aVar = this.f13939i) == null) {
                            return false;
                        }
                        if (this.D >= list.size()) {
                            a10.remove(i10 + "_" + this.f13942l);
                            aVar.onAdFramesLoaded(list);
                            return true;
                        }
                        if (this.D == 0) {
                            return false;
                        }
                        List<Frame> subList = list.subList(0, this.C);
                        aVar.onAdFramesLoaded(list);
                        list.removeAll(subList);
                        map.put(next, subList);
                        ArrayList arrayList = new ArrayList();
                        for (Frame frame : list) {
                            if (i14 >= this.D) {
                                arrayList.add(frame);
                            }
                            i14++;
                        }
                        map.put(next, arrayList);
                        a10.put(i10 + "_" + this.f13942l, map);
                        aVar.onAdFramesLoaded(subList);
                        return true;
                    }
                    List list2 = (List) map.get(next);
                    if (list2 != null && list2.size() > 0) {
                        ArrayList arrayList2 = new ArrayList();
                        if (((CampaignEx) list2.get(0)).getType() == 1) {
                            if (TextUtils.isEmpty(this.f13946p)) {
                                i11 = Math.min(this.B, list2.size());
                            } else {
                                try {
                                    JSONArray jSONArray = new JSONArray(this.f13946p);
                                    if (jSONArray.length() > 0) {
                                        i12 = 0;
                                        i13 = 0;
                                        for (int i15 = 0; i15 < jSONArray.length(); i15++) {
                                            JSONObject jSONObject = (JSONObject) jSONArray.opt(i15);
                                            int optInt = jSONObject.optInt("id", 0);
                                            if (2 == optInt) {
                                                i12 = jSONObject.optInt("ad_num");
                                            } else if (3 == optInt) {
                                                i13 = jSONObject.optInt("ad_num");
                                            }
                                        }
                                    } else {
                                        i12 = 0;
                                        i13 = 0;
                                    }
                                    if (3 == ((CampaignEx) list2.get(0)).getTemplate()) {
                                        i11 = Math.min(i13, list2.size());
                                    } else {
                                        i11 = Math.min(i12, list2.size());
                                    }
                                } catch (Exception unused) {
                                    ad.b(f13929f, "load from catch error in get nativeinfo adnum");
                                    i11 = 0;
                                }
                            }
                            if (i11 <= 0) {
                                return false;
                            }
                            Iterator it = list2.iterator();
                            while (it.hasNext() && i14 != i11) {
                                CampaignEx campaignEx = (CampaignEx) it.next();
                                campaignEx.getTemplate();
                                arrayList2.add(campaignEx);
                                it.remove();
                                i14++;
                            }
                        } else {
                            int min = Math.min(this.B, list2.size());
                            if (min > 0) {
                                Iterator it2 = list2.iterator();
                                while (it2.hasNext() && i14 != min) {
                                    CampaignEx campaignEx2 = (CampaignEx) it2.next();
                                    campaignEx2.getTemplate();
                                    arrayList2.add(campaignEx2);
                                    it2.remove();
                                    i14++;
                                }
                            }
                        }
                        a(arrayList2);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void a(String str, int i10, String str2, CampaignEx campaignEx) {
        Queue<Integer> queue = this.f13944n;
        if ((queue != null && queue.size() <= 0) || this.f13944n == null) {
            com.mbridge.msdk.mbnative.d.a aVar = this.f13939i;
            if (aVar == null || this.f13954y) {
                return;
            }
            this.f13954y = true;
            aVar.a(campaignEx, str);
            return;
        }
        b(i10, str2);
    }

    @Override // com.mbridge.msdk.mbnative.controller.a
    public final synchronized void a(int i10, long j3, int i11, String str) {
        a aVar;
        com.mbridge.msdk.foundation.same.net.f.e eVar;
        com.mbridge.msdk.mbnative.f.a.a aVar2;
        c cVar;
        int i12;
        com.mbridge.msdk.foundation.entity.k kVar;
        try {
            if (this.f13937e.containsKey(MBridgeConstans.NATIVE_INFO)) {
                this.u = Math.max(this.Y, this.Z);
            }
            if (i11 == 0) {
                com.mbridge.msdk.mbnative.a.b<String, List<Campaign>> a10 = com.mbridge.msdk.mbnative.a.c.a(i10);
                if (a10 != null && a(a(1, d(a10.b(this.f13942l, this.u))))) {
                    return;
                }
                a aVar3 = this.M;
                if (aVar3 != null && !this.X) {
                    aVar3.b(true);
                }
                if (this.X && !this.f13954y) {
                    a("mb load failed", i11, str, (CampaignEx) null);
                }
                if (!this.f13931aa) {
                    return;
                }
            }
            int i13 = this.f13951v;
            if (i13 == -1) {
                this.f13951v = i10;
            } else if (i13 != i10) {
                this.f13952w = 0;
            }
            com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(this.f13941k)).a();
            com.mbridge.msdk.mbnative.f.a.a aVar4 = new com.mbridge.msdk.mbnative.f.a.a(this.f13941k);
            com.mbridge.msdk.foundation.same.net.f.e eVar2 = new com.mbridge.msdk.foundation.same.net.f.e();
            String k10 = com.mbridge.msdk.foundation.controller.c.m().k();
            String b3 = com.mbridge.msdk.foundation.controller.c.m().b();
            Map<String, Object> map = this.f13937e;
            if (map != null && map.containsKey(MBridgeConstans.APP_ID) && this.f13937e.containsKey(MBridgeConstans.APP_KEY) && this.f13937e.containsKey(MBridgeConstans.KEY_WORD) && this.f13937e.get(MBridgeConstans.KEY_WORD) != null) {
                if (this.f13937e.get(MBridgeConstans.APP_ID) instanceof String) {
                    k10 = (String) this.f13937e.get(MBridgeConstans.APP_ID);
                }
                if (this.f13937e.get(MBridgeConstans.APP_KEY) instanceof String) {
                    b3 = (String) this.f13937e.get(MBridgeConstans.APP_KEY);
                }
                String str2 = this.f13937e.get(MBridgeConstans.KEY_WORD) instanceof String ? (String) this.f13937e.get(MBridgeConstans.KEY_WORD) : null;
                if (!TextUtils.isEmpty(str2)) {
                    eVar2.a("smart", x.b(str2));
                }
            }
            eVar2.a(MBridgeConstans.APP_ID, k10);
            eVar2.a(MBridgeConstans.PROPERTIES_UNIT_ID, this.f13942l);
            if (!TextUtils.isEmpty(this.f13943m)) {
                eVar2.a(MBridgeConstans.PLACEMENT_ID, this.f13943m);
            }
            eVar2.a("req_type", MBridgeConstans.API_REUQEST_CATEGORY_APP);
            if (!TextUtils.isEmpty(this.f13953x)) {
                eVar2.a("category", this.f13953x);
            }
            eVar2.a("sign", SameMD5.getMD5(k10 + b3));
            if (this.W > 0 && i11 == 0) {
                eVar2.a("ad_num", this.W + "");
            } else {
                eVar2.a("ad_num", this.f13950t + "");
            }
            String d10 = ai.d(this.f13942l);
            if (!TextUtils.isEmpty(d10)) {
                eVar2.a("j", d10);
            }
            eVar2.a("only_impression", "1");
            eVar2.a("ping_mode", "1");
            if (this.D != 0) {
                eVar2.a("frame_num", this.D + "");
            }
            if (!TextUtils.isEmpty(this.f13946p)) {
                eVar2.a(MBridgeConstans.NATIVE_INFO, this.f13946p);
                if (i10 == 1) {
                    eVar2.a("tnum", this.K + "");
                }
            } else if (i10 == 1) {
                eVar2.a("tnum", this.f13950t + "");
            }
            String a11 = com.mbridge.msdk.foundation.same.a.b.a(this.f13942l, "native");
            if (!TextUtils.isEmpty(a11)) {
                eVar2.a(com.mbridge.msdk.foundation.same.net.f.e.f13418d, a11);
            }
            if (this.f13937e.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH) && (this.f13937e.get(MBridgeConstans.NATIVE_VIDEO_WIDTH) instanceof Integer)) {
                eVar2.a("video_width", ((Integer) this.f13937e.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
            }
            if (this.f13937e.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT) && (this.f13937e.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT) instanceof Integer)) {
                eVar2.a("video_height", ((Integer) this.f13937e.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
            }
            if (this.f13937e.containsKey(MBridgeConstans.NATIVE_VIDEO_SUPPORT) && (this.f13937e.get(MBridgeConstans.NATIVE_VIDEO_SUPPORT) instanceof Boolean)) {
                ((Boolean) this.f13937e.get(MBridgeConstans.NATIVE_VIDEO_SUPPORT)).booleanValue();
            }
            eVar2.a("video_version", MBridgeConstans.NATIVE_VIDEO_VERSION);
            if (com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k()) == null) {
                com.mbridge.msdk.c.h.a();
                com.mbridge.msdk.c.i.a();
            }
            if (!a(this.f13937e)) {
                JSONArray b10 = ai.b(this.f13941k, this.f13942l);
                if (b10.length() > 0) {
                    eVar2.a(com.mbridge.msdk.foundation.same.net.f.e.f13419e, ai.a(b10));
                }
            }
            if (com.mbridge.msdk.mbnative.controller.d.b().containsKey(this.f13942l) && com.mbridge.msdk.mbnative.controller.d.b().get(this.f13942l).booleanValue() && com.mbridge.msdk.mbnative.controller.d.c().get(this.f13942l) != null && (kVar = com.mbridge.msdk.mbnative.controller.d.c().get(this.f13942l)) != null) {
                if (i10 == 1) {
                    this.f13952w = kVar.a();
                } else if (i10 == 2) {
                    this.f13952w = kVar.b();
                }
            }
            eVar2.a("offset", this.f13952w + "");
            eVar2.a("ad_type", "42");
            eVar2.a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i10 + "");
            if (!TextUtils.isEmpty(this.f13948r)) {
                eVar2.a(com.mbridge.msdk.foundation.same.net.f.e.f13420f, this.f13948r);
            }
            a aVar5 = new a();
            aVar5.a(b(this.f13937e));
            aVar5.setUnitId(this.f13942l);
            aVar5.setPlacementId(this.f13943m);
            aVar5.setAdType(42);
            aVar5.b(true);
            c cVar2 = new c(1, aVar5, i11, str);
            aVar5.a(cVar2);
            aVar5.e(i11);
            aVar5.a(str);
            if (i11 == 0) {
                if (!TextUtils.isEmpty(str)) {
                    eVar2.a(BidResponsed.KEY_TOKEN, str);
                }
                aVar = aVar5;
                eVar = eVar2;
                aVar2 = aVar4;
                cVar = cVar2;
                i12 = 1;
                aVar4.choiceV3OrV5BySetting(1, eVar, aVar, str, com.mbridge.msdk.foundation.same.c.a(j3, 30000L));
            } else {
                aVar = aVar5;
                eVar = eVar2;
                aVar2 = aVar4;
                cVar = cVar2;
                i12 = 1;
            }
            if (i11 == i12) {
                aVar2.getLoadOrSetting(1, com.mbridge.msdk.foundation.same.net.e.d.f().N, eVar, aVar, "campaign", com.mbridge.msdk.foundation.same.c.a(j3, 30000L));
            }
            this.a.postDelayed(cVar, j3);
        } catch (Exception e2) {
            String str3 = f13929f;
            ad.b(str3, com.mbridge.msdk.mbnative.b.a.a(e2));
            ad.b(str3, e2.getMessage());
        }
    }

    private void a(final View view, CampaignEx campaignEx) {
        BitmapDrawable a10;
        final ImageView imageView;
        if (!(view instanceof FrameLayout) || (a10 = com.mbridge.msdk.foundation.controller.c.m().a(this.f13942l, campaignEx.getAdType())) == null) {
            return;
        }
        try {
            int childCount = ((ViewGroup) view).getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    imageView = null;
                    break;
                }
                View childAt = ((ViewGroup) view).getChildAt(i10);
                if ((childAt instanceof ImageView) && childAt.getTag() != null && "mb_wm".equals((String) childAt.getTag())) {
                    ((ImageView) childAt).setLayoutParams(new FrameLayout.LayoutParams(view.getWidth(), view.getHeight()));
                    imageView = (ImageView) childAt;
                    break;
                }
                i10++;
            }
            if (imageView == null) {
                imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.m().c());
                imageView.setTag("mb_wm");
                ai.a(imageView, a10, view.getResources().getDisplayMetrics());
                if (imageView.getParent() == null) {
                    ((FrameLayout) view).addView(imageView, new FrameLayout.LayoutParams(view.getWidth(), view.getHeight()));
                }
            }
            this.S = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.mbridge.msdk.mbnative.controller.NativeController.1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    if (imageView != null) {
                        imageView.setLayoutParams(new FrameLayout.LayoutParams(view.getWidth(), view.getHeight()));
                    }
                }
            };
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.S);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void a(Campaign campaign, View view, List<View> list) {
        Class<MBMediaView> cls;
        try {
            a(view, (CampaignEx) campaign);
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f13940j;
            if (nativeTrackingListener != null) {
                this.f13949s.a(nativeTrackingListener);
            }
            com.mbridge.msdk.mbnative.a.c.a(campaign.getType()).a(this.f13942l, campaign, this.Q);
            final CampaignEx campaignEx = (CampaignEx) campaign;
            try {
                cls = MBMediaView.class;
                int i10 = MBMediaView.f14220a0;
            } catch (Throwable unused) {
                cls = null;
            }
            com.mbridge.msdk.foundation.same.a.b.a(this.f13942l, campaignEx, "native");
            if (view != null) {
                if (cls != null && cls.isInstance(view)) {
                    return;
                } else {
                    view.setOnClickListener(new com.mbridge.msdk.widget.a() { // from class: com.mbridge.msdk.mbnative.controller.NativeController.6
                        @Override // com.mbridge.msdk.widget.a
                        public final void a(View view2) {
                            NativeController.a(NativeController.this, view2.getContext(), campaignEx);
                        }
                    });
                }
            }
            if (list != null && list.size() > 0) {
                for (View view2 : list) {
                    if (cls != null && cls.isInstance(view2)) {
                        break;
                    } else {
                        view2.setOnClickListener(new com.mbridge.msdk.widget.a() { // from class: com.mbridge.msdk.mbnative.controller.NativeController.7
                            @Override // com.mbridge.msdk.widget.a
                            public final void a(View view3) {
                                NativeController.a(NativeController.this, view3.getContext(), campaignEx);
                            }
                        });
                    }
                }
            }
            if (campaignEx.isReport()) {
                return;
            }
            a(campaignEx, view, list);
            Log.e(f13929f, "sendImpression" + campaignEx);
        } catch (Exception unused2) {
            ad.b(f13929f, "registerview exception!");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx) {
        if (campaignEx == null || campaignEx.isReportClick()) {
            return;
        }
        campaignEx.setReportClick(true);
        if (campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().l() == null) {
            return;
        }
        com.mbridge.msdk.click.a.a(this.f13941k, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().l(), false, false);
    }

    public final void a(Campaign campaign, View view) {
        try {
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f13940j;
            if (nativeTrackingListener != null) {
                this.f13949s.a(nativeTrackingListener);
            }
            com.mbridge.msdk.mbnative.a.c.a(campaign.getType()).a(this.f13942l, campaign, this.Q);
            final CampaignEx campaignEx = (CampaignEx) campaign;
            com.mbridge.msdk.foundation.same.a.b.a(this.f13942l, campaignEx, "native");
            View.OnClickListener onClickListener = new com.mbridge.msdk.widget.a() { // from class: com.mbridge.msdk.mbnative.controller.NativeController.9
                @Override // com.mbridge.msdk.widget.a
                public final void a(View view2) {
                    NativeController.a(NativeController.this, view2.getContext(), campaignEx);
                }
            };
            try {
                int i10 = MBMediaView.f14220a0;
                a(view, onClickListener, MBMediaView.class);
            } catch (Throwable unused) {
                a(view, onClickListener, (Class) null);
            }
            if (!com.mbridge.msdk.e.b.a()) {
                a(view, (CampaignEx) campaign);
            }
            if (campaignEx.isReport()) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            a(campaignEx, view, (List<View>) arrayList);
            ad.c(f13929f, "sendImpression" + campaignEx);
        } catch (Exception unused2) {
            ad.b(f13929f, "registerview exception!");
        }
    }

    private void a(CampaignEx campaignEx, View view, List<View> list) {
        kd.b bVar;
        try {
            if (this.f13941k == null || campaignEx == null) {
                bVar = null;
            } else {
                bVar = b(campaignEx);
                if (bVar != null) {
                    bVar.d(view);
                    bVar.f();
                }
            }
            kd.b bVar2 = bVar;
            k kVar = this.T;
            int l10 = kVar != null ? kVar.l() : 0;
            if (campaignEx != null && campaignEx.getImpReportType() == 1) {
                l10 = 0;
            }
            final f fVar = new f(campaignEx, view, list, this, bVar2);
            if (this.I == null) {
                this.I = new CopyOnWriteArrayList<>();
            }
            this.I.add(fVar);
            fVar.setOnStateChangeListener(new a.InterfaceC0172a() { // from class: com.mbridge.msdk.mbnative.controller.NativeController.10
                @Override // com.mbridge.msdk.foundation.same.e.a.InterfaceC0172a
                public final void a(a.b bVar3) {
                    if (bVar3 == a.b.FINISH && NativeController.this.I != null && NativeController.this.I.size() > 0 && NativeController.this.I.contains(fVar)) {
                        NativeController.this.I.remove(fVar);
                    }
                }
            });
            Handler handler = this.a;
            if (handler != null) {
                handler.postDelayed(fVar, l10 * 1000);
            }
        } catch (Exception e2) {
            ad.b(f13929f, com.mbridge.msdk.mbnative.b.a.a(e2));
        }
    }

    private void a(View view, View.OnClickListener onClickListener, Class cls) {
        if (view == null || onClickListener == null) {
            return;
        }
        if (cls != null) {
            try {
                if (cls.isInstance(view)) {
                    return;
                }
            } catch (Throwable unused) {
                return;
            }
        }
        view.setOnClickListener(onClickListener);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                a(viewGroup.getChildAt(i10), onClickListener, cls);
            }
        }
    }

    private void a(View view, Class cls) {
        if (view == null) {
            return;
        }
        if (cls != null) {
            try {
                if (cls.isInstance(view)) {
                    return;
                }
            } catch (Throwable unused) {
                return;
            }
        }
        view.setOnClickListener(null);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                a(viewGroup.getChildAt(i10), cls);
            }
        }
    }

    public final void a() {
        com.mbridge.msdk.foundation.same.e.a next;
        com.mbridge.msdk.foundation.same.e.b bVar = this.F;
        if (bVar != null) {
            bVar.a();
            this.F = null;
        }
        Hashtable<String, kd.b> hashtable = this.J;
        if (hashtable != null) {
            for (kd.b bVar2 : hashtable.values()) {
                if (bVar2 != null) {
                    bVar2.c();
                }
            }
            this.J.clear();
        }
        Handler handler = this.a;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f13940j = null;
        this.f13949s.a();
        try {
            Context context = this.f13941k;
            if (context != null) {
                com.mbridge.msdk.foundation.same.c.b.a(context);
            }
            List<com.mbridge.msdk.mbnative.controller.c> list = this.G;
            if (list != null && list.size() > 0) {
                Iterator<com.mbridge.msdk.mbnative.controller.c> it = this.G.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
                this.G.clear();
                this.G = null;
            }
            List<c.a> list2 = this.H;
            if (list2 != null && list2.size() > 0) {
                for (c.a aVar : this.H) {
                }
                this.H.clear();
                this.H = null;
            }
            CopyOnWriteArrayList<com.mbridge.msdk.foundation.same.e.a> copyOnWriteArrayList = this.I;
            if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
                return;
            }
            Iterator<com.mbridge.msdk.foundation.same.e.a> it2 = this.I.iterator();
            if (it2.hasNext() && (next = it2.next()) != null) {
                next.cancel();
                this.a.removeCallbacks(next);
            }
            this.I.clear();
        } catch (Exception unused) {
        }
    }

    public final List<Campaign> a(String str, int i10, String str2) {
        int i11;
        int i12;
        List<Campaign> list = null;
        if (this.f13935c != null) {
            ArrayList arrayList = new ArrayList(this.f13935c);
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                com.mbridge.msdk.mbnative.a.b<String, List<Campaign>> a10 = com.mbridge.msdk.mbnative.a.c.a(((Integer) arrayList.get(i13)).intValue());
                if (a10 != null) {
                    if ((((Integer) arrayList.get(i13)).intValue() == 1 || ((Integer) arrayList.get(i13)).intValue() == 2) && this.f13937e.containsKey(MBridgeConstans.NATIVE_INFO)) {
                        i12 = this.K;
                    } else {
                        i12 = this.f13950t;
                    }
                    list = a(((Integer) arrayList.get(i13)).intValue(), a10.b(str, i12));
                    if (list != null) {
                        break;
                    }
                }
            }
            if (list == null) {
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    com.mbridge.msdk.mbnative.a.b<String, List<Campaign>> a11 = com.mbridge.msdk.mbnative.a.c.a(((Integer) arrayList.get(i14)).intValue());
                    if ((((Integer) arrayList.get(i14)).intValue() == 1 || ((Integer) arrayList.get(i14)).intValue() == 2) && this.f13937e.containsKey(MBridgeConstans.NATIVE_INFO)) {
                        i11 = this.K;
                    } else {
                        i11 = this.f13950t;
                    }
                    list = a(((Integer) arrayList.get(i14)).intValue(), a11.a((com.mbridge.msdk.mbnative.a.b<String, List<Campaign>>) str, i11));
                    if (list != null) {
                        break;
                    }
                }
            }
        }
        return d(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(final List<Campaign> list) {
        kd.b b3;
        if ((!TextUtils.isEmpty(this.Q) && list != null && list.size() == 0) || list == null || list.size() <= 0) {
            return false;
        }
        final com.mbridge.msdk.mbnative.d.a aVar = this.f13939i;
        if (aVar == null) {
            return true;
        }
        CampaignEx campaignEx = (CampaignEx) list.get(0);
        if (campaignEx != null && campaignEx.isActiveOm() && (b3 = b(campaignEx)) != null) {
            b3.f();
            kd.a a10 = kd.a.a(b3);
            this.f13934ad = a10;
            a10.c();
        }
        final int template = campaignEx != null ? campaignEx.getTemplate() : 2;
        com.mbridge.msdk.foundation.db.j a11 = com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(this.f13941k));
        a11.a();
        for (int i10 = 0; i10 < list.size(); i10++) {
            CampaignEx campaignEx2 = (CampaignEx) list.get(i10);
            if (!a11.b(campaignEx2.getId())) {
                com.mbridge.msdk.foundation.entity.g gVar = new com.mbridge.msdk.foundation.entity.g();
                gVar.a(campaignEx2.getId());
                gVar.b(campaignEx2.getFca());
                gVar.c(campaignEx2.getFcb());
                gVar.a(0);
                gVar.d(0);
                gVar.a(System.currentTimeMillis());
                a11.a(gVar);
            }
        }
        if (this.O && this.N) {
            if (f().h() == 3) {
                final List<Campaign> b10 = b(list);
                if (list.size() > 0) {
                    a(list, new b() { // from class: com.mbridge.msdk.mbnative.controller.NativeController.12
                        @Override // com.mbridge.msdk.mbnative.controller.NativeController.b
                        public final void a() {
                            List a12 = NativeController.a(NativeController.this, b10, true);
                            if (a12 == null || a12.size() <= 0) {
                                NativeController.this.a(aVar, "has no ads", (CampaignEx) list.get(0));
                            } else {
                                NativeController.this.a((List<Campaign>) a12, template, aVar);
                            }
                        }
                    });
                    return true;
                }
                a(aVar, "has no ads", (CampaignEx) null);
                return true;
            }
            List<Campaign> c10 = c(list);
            if (c10 != null && c10.size() > 0) {
                a(c10, new b() { // from class: com.mbridge.msdk.mbnative.controller.NativeController.13
                    @Override // com.mbridge.msdk.mbnative.controller.NativeController.b
                    public final void a() {
                        List a12 = NativeController.a(NativeController.this, list, false);
                        if (a12 == null || a12.size() <= 0) {
                            NativeController.this.a(aVar, "has no ads", (CampaignEx) null);
                        } else {
                            NativeController.this.a((List<Campaign>) a12, template, aVar);
                        }
                    }
                });
                return true;
            }
            a(list, template, aVar);
            return true;
        }
        if (list.size() > 0) {
            Iterator<Campaign> it = list.iterator();
            while (it.hasNext()) {
                it.next().setVideoLength(0);
            }
            a(list, template, aVar);
            return true;
        }
        a(aVar, "has no ads", (CampaignEx) null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final List<Campaign> list, final int i10, final NativeListener.NativeAdListener nativeAdListener) {
        this.a.post(new Runnable() { // from class: com.mbridge.msdk.mbnative.controller.NativeController.2
            @Override // java.lang.Runnable
            public final void run() {
                List list2 = list;
                if (list2 != null && list2.size() > 0) {
                    NativeController.this.R = ((CampaignEx) list.get(0)).getRequestId();
                    NativeController.this.f13932ab = list;
                }
                NativeController.this.f13954y = true;
                nativeAdListener.onAdLoaded(list, i10);
                Context context = NativeController.this.f13941k;
                List list3 = list;
                String str = NativeController.this.f13942l;
                if (context != null && list3 != null) {
                    try {
                        if (list3.size() > 0 && !TextUtils.isEmpty(str)) {
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append("key=2000048&");
                            stringBuffer.append("st=" + System.currentTimeMillis() + "&");
                            if (list3.size() > 0) {
                                stringBuffer.append("cid=" + ((Campaign) list3.get(0)).getId() + "&");
                            }
                            stringBuffer.append("network_type=" + z.l(context) + "&");
                            stringBuffer.append("unit_id=" + str + "&");
                            if (list3.size() > 1) {
                                CampaignEx campaignEx = (CampaignEx) list3.get(0);
                                if (campaignEx.isBidCampaign()) {
                                    stringBuffer.append("hb=1&");
                                }
                                if (ai.c(campaignEx)) {
                                    stringBuffer.append("rtins_type=");
                                    stringBuffer.append(campaignEx.getRtinsType());
                                    stringBuffer.append("&");
                                }
                                stringBuffer.append("rid=" + campaignEx.getRequestId() + "&");
                                stringBuffer.append("rid_n=" + campaignEx.getRequestIdNotice());
                            } else if (list3.size() == 1) {
                                CampaignEx campaignEx2 = (CampaignEx) list3.get(0);
                                if (campaignEx2.isBidCampaign()) {
                                    stringBuffer.append("hb=1&");
                                }
                                if (ai.c(campaignEx2)) {
                                    stringBuffer.append("rtins_type=");
                                    stringBuffer.append(campaignEx2.getRtinsType());
                                    stringBuffer.append("&");
                                }
                                stringBuffer.append("rid=" + campaignEx2.getRequestId() + "&");
                                stringBuffer.append("rid_n=" + campaignEx2.getRequestIdNotice());
                            }
                            com.mbridge.msdk.foundation.same.report.d.c.a().d(stringBuffer.toString());
                        }
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final com.mbridge.msdk.mbnative.d.a aVar, final String str, final CampaignEx campaignEx) {
        this.a.post(new Runnable() { // from class: com.mbridge.msdk.mbnative.controller.NativeController.3
            @Override // java.lang.Runnable
            public final void run() {
                aVar.a(campaignEx, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<Campaign> a(int i10, List<Campaign> list) {
        if (i10 != 1 || !this.f13937e.containsKey(MBridgeConstans.NATIVE_INFO) || list == null || list.size() <= 0) {
            return list;
        }
        CampaignEx campaignEx = (CampaignEx) list.get(0);
        int template = campaignEx != null ? campaignEx.getTemplate() : 1;
        if (template == 2) {
            int size = list.size();
            int i11 = this.Y;
            return size >= i11 ? list.subList(0, i11) : list;
        }
        if (template != 3) {
            return list;
        }
        int size2 = list.size();
        int i12 = this.Z;
        return size2 >= i12 ? list.subList(0, i12) : list;
    }

    private void a(final List<Campaign> list, final b bVar) {
        g();
        final long currentTimeMillis = System.currentTimeMillis();
        Timer timer = new Timer();
        this.P = timer;
        timer.schedule(new TimerTask() { // from class: com.mbridge.msdk.mbnative.controller.NativeController.5
            @Override // java.util.TimerTask, java.lang.Runnable
            public final void run() {
                boolean z10;
                if (System.currentTimeMillis() - currentTimeMillis >= ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) {
                    bVar.a();
                    NativeController.this.g();
                    return;
                }
                int l10 = z.l(NativeController.this.f13941k);
                int k10 = NativeController.this.f().k();
                if (l10 != 9 && k10 == 2) {
                    bVar.a();
                    NativeController.this.g();
                    return;
                }
                if (k10 == 3) {
                    bVar.a();
                    NativeController.this.g();
                    return;
                }
                loop0: while (true) {
                    z10 = false;
                    for (Campaign campaign : list) {
                        String id2 = campaign.getId();
                        if (campaign instanceof CampaignEx) {
                            StringBuilder m10 = eb.j.m(id2);
                            CampaignEx campaignEx = (CampaignEx) campaign;
                            m10.append(campaignEx.getVideoUrlEncode());
                            m10.append(campaignEx.getBidToken());
                            id2 = m10.toString();
                        }
                        com.mbridge.msdk.videocommon.download.a a10 = com.mbridge.msdk.videocommon.download.b.getInstance().a(NativeController.this.f13942l, id2);
                        if (a10 != null && com.mbridge.msdk.videocommon.download.j.a(a10, NativeController.this.f().p())) {
                            z10 = true;
                        }
                    }
                    break loop0;
                }
                if (z10) {
                    bVar.a();
                    NativeController.this.g();
                }
            }
        }, 0L, 1000L);
    }

    public static /* synthetic */ void a(NativeController nativeController, Context context, final CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                if (campaignEx.needShowIDialog() && com.mbridge.msdk.e.b.a()) {
                    new com.mbridge.msdk.widget.dialog.a() { // from class: com.mbridge.msdk.mbnative.controller.NativeController.8
                        @Override // com.mbridge.msdk.widget.dialog.a
                        public final void a() {
                            NativeController.this.f13949s.a(campaignEx, NativeController.this.f13939i);
                            NativeController.this.a(campaignEx);
                        }

                        @Override // com.mbridge.msdk.widget.dialog.a
                        public final void b() {
                        }

                        @Override // com.mbridge.msdk.widget.dialog.a
                        public final void c() {
                        }
                    };
                    if (com.mbridge.msdk.click.c.a(campaignEx) && campaignEx.needShowIDialog()) {
                        com.mbridge.msdk.click.a aVar = nativeController.f13949s;
                        nativeController.a(campaignEx);
                        nativeController.f13939i.onAdClick(campaignEx);
                        return;
                    }
                }
            } catch (Throwable th2) {
                ad.a(f13929f, th2.getMessage());
            }
        }
        nativeController.f13949s.a(campaignEx, nativeController.f13939i);
        nativeController.a(campaignEx);
    }

    public static /* synthetic */ List a(NativeController nativeController, List list, boolean z10) {
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                Campaign campaign = (Campaign) list.get(size);
                String id2 = campaign.getId();
                boolean z11 = campaign instanceof CampaignEx;
                if (z11) {
                    StringBuilder m10 = eb.j.m(id2);
                    CampaignEx campaignEx = (CampaignEx) campaign;
                    m10.append(campaignEx.getVideoUrlEncode());
                    m10.append(campaignEx.getBidToken());
                    id2 = m10.toString();
                }
                com.mbridge.msdk.videocommon.download.a a10 = com.mbridge.msdk.videocommon.download.b.getInstance().a(nativeController.f13942l, id2);
                if (z10) {
                    if (a10 == null || !com.mbridge.msdk.videocommon.download.j.a(a10, nativeController.f().p())) {
                        com.mbridge.msdk.mbnative.a.c.a(campaign.getType()).a(nativeController.f13942l, (Campaign) list.remove(size), nativeController.Q);
                    }
                } else if (z11) {
                    CampaignEx campaignEx2 = (CampaignEx) campaign;
                    if (TextUtils.isEmpty(campaignEx2.getImageUrl()) && !TextUtils.isEmpty(campaignEx2.getVideoUrlEncode()) && (a10 == null || !com.mbridge.msdk.videocommon.download.j.a(a10, nativeController.f().p()))) {
                        com.mbridge.msdk.mbnative.a.c.a(campaign.getType()).a(nativeController.f13942l, (Campaign) list.remove(size), nativeController.Q);
                    }
                }
            }
        }
        return list;
    }

    public static /* synthetic */ void a(NativeController nativeController, final CampaignEx campaignEx, View view, List list, kd.b bVar) {
        try {
            c.a aVar = new c.a() { // from class: com.mbridge.msdk.mbnative.controller.NativeController.11
                @Override // com.mbridge.msdk.mbnative.controller.c.a
                public final void a(ArrayList<View> arrayList, ArrayList<View> arrayList2) {
                    if (arrayList != null && arrayList.size() > 0) {
                        com.mbridge.msdk.mbnative.e.b.a(campaignEx, NativeController.this.f13941k, NativeController.this.f13942l, NativeController.this.f13939i);
                    }
                }
            };
            com.mbridge.msdk.mbnative.controller.c cVar = new com.mbridge.msdk.mbnative.controller.c(list, aVar, new Handler(Looper.getMainLooper()), campaignEx.getImpReportType());
            cVar.a(view);
            List<com.mbridge.msdk.mbnative.controller.c> list2 = nativeController.G;
            if (list2 != null) {
                list2.add(cVar);
            }
            List<c.a> list3 = nativeController.H;
            if (list3 != null) {
                list3.add(aVar);
            }
            kd.a aVar2 = nativeController.f13934ad;
            if (aVar2 != null) {
                aVar2.b();
            }
        } catch (Exception unused) {
        }
    }
}

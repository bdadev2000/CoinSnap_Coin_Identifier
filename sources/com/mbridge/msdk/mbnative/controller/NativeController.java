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
import com.applovin.impl.L;
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
import z.AbstractC2965e;

/* loaded from: classes3.dex */
public class NativeController extends com.mbridge.msdk.mbnative.controller.a {
    public static Map<String, Long> b = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private static final String f16408f = "NativeController";

    /* renamed from: g, reason: collision with root package name */
    private static boolean f16409g;

    /* renamed from: A, reason: collision with root package name */
    private boolean f16410A;

    /* renamed from: B, reason: collision with root package name */
    private int f16411B;

    /* renamed from: C, reason: collision with root package name */
    private int f16412C;

    /* renamed from: D, reason: collision with root package name */
    private int f16413D;

    /* renamed from: E, reason: collision with root package name */
    private int f16414E;

    /* renamed from: F, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.e.b f16415F;

    /* renamed from: G, reason: collision with root package name */
    private List<com.mbridge.msdk.mbnative.controller.c> f16416G;

    /* renamed from: H, reason: collision with root package name */
    private List<c.a> f16417H;

    /* renamed from: I, reason: collision with root package name */
    private CopyOnWriteArrayList<com.mbridge.msdk.foundation.same.e.a> f16418I;

    /* renamed from: J, reason: collision with root package name */
    private Hashtable<String, O5.b> f16419J;

    /* renamed from: K, reason: collision with root package name */
    private int f16420K;

    /* renamed from: L, reason: collision with root package name */
    private int f16421L;

    /* renamed from: M, reason: collision with root package name */
    private a f16422M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f16423N;
    private boolean O;

    /* renamed from: P, reason: collision with root package name */
    private Timer f16424P;

    /* renamed from: Q, reason: collision with root package name */
    private String f16425Q;

    /* renamed from: R, reason: collision with root package name */
    private String f16426R;

    /* renamed from: S, reason: collision with root package name */
    private ViewTreeObserver.OnGlobalLayoutListener f16427S;

    /* renamed from: T, reason: collision with root package name */
    private k f16428T;

    /* renamed from: U, reason: collision with root package name */
    private long f16429U;

    /* renamed from: V, reason: collision with root package name */
    private int f16430V;

    /* renamed from: W, reason: collision with root package name */
    private int f16431W;

    /* renamed from: X, reason: collision with root package name */
    private boolean f16432X;

    /* renamed from: Y, reason: collision with root package name */
    private int f16433Y;

    /* renamed from: Z, reason: collision with root package name */
    private int f16434Z;
    private boolean aa;
    private List<Campaign> ab;
    private String ac;
    private O5.a ad;

    /* renamed from: c, reason: collision with root package name */
    protected List<Integer> f16435c;

    /* renamed from: d, reason: collision with root package name */
    protected List<Integer> f16436d;

    /* renamed from: e, reason: collision with root package name */
    Map<String, Object> f16437e;

    /* renamed from: h, reason: collision with root package name */
    private j f16438h;

    /* renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.mbnative.d.a f16439i;

    /* renamed from: j, reason: collision with root package name */
    private NativeListener.NativeTrackingListener f16440j;

    /* renamed from: k, reason: collision with root package name */
    private Context f16441k;
    private String l;
    private String m;

    /* renamed from: n, reason: collision with root package name */
    private Queue<Integer> f16442n;

    /* renamed from: o, reason: collision with root package name */
    private Queue<Long> f16443o;

    /* renamed from: p, reason: collision with root package name */
    private String f16444p;

    /* renamed from: q, reason: collision with root package name */
    private h f16445q;

    /* renamed from: r, reason: collision with root package name */
    private String f16446r;

    /* renamed from: s, reason: collision with root package name */
    private com.mbridge.msdk.click.a f16447s;

    /* renamed from: t, reason: collision with root package name */
    private int f16448t;

    /* renamed from: u, reason: collision with root package name */
    private int f16449u;

    /* renamed from: v, reason: collision with root package name */
    private int f16450v;

    /* renamed from: w, reason: collision with root package name */
    private int f16451w;

    /* renamed from: x, reason: collision with root package name */
    private String f16452x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f16453y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f16454z;

    /* loaded from: classes3.dex */
    public class a extends com.mbridge.msdk.mbnative.f.a.b implements com.mbridge.msdk.foundation.same.e.d {

        /* renamed from: c, reason: collision with root package name */
        private Runnable f16481c;
        private boolean b = false;

        /* renamed from: d, reason: collision with root package name */
        private boolean f16482d = true;

        /* renamed from: e, reason: collision with root package name */
        private List<String> f16483e = null;

        public a() {
        }

        @Override // com.mbridge.msdk.foundation.same.e.d
        public final void a(boolean z8) {
            this.b = z8;
        }

        public final void b(boolean z8) {
            this.f16482d = z8;
        }

        public final void a(List<String> list) {
            this.f16483e = list;
        }

        @Override // com.mbridge.msdk.mbnative.f.a.b
        public final void b(List<Frame> list) {
            if (this.b) {
                return;
            }
            Runnable runnable = this.f16481c;
            if (runnable != null) {
                NativeController.this.f16501a.removeCallbacks(runnable);
            }
            if (list == null || list.size() == 0) {
                if (NativeController.this.f16439i != null) {
                    NativeController.this.f16453y = true;
                    NativeController.this.f16439i.onAdLoadError("frame is empty");
                    return;
                }
                return;
            }
            Iterator<Frame> it = list.iterator();
            while (it.hasNext()) {
                List<CampaignEx> campaigns = it.next().getCampaigns();
                if (campaigns == null || campaigns.size() == 0) {
                    if (NativeController.this.f16439i != null) {
                        NativeController.this.f16453y = true;
                        NativeController.this.f16439i.onAdLoadError("ads in frame is empty");
                        return;
                    }
                    return;
                }
                for (CampaignEx campaignEx : campaigns) {
                    if (NativeController.f16409g) {
                        campaignEx.loadImageUrlAsyncWithBlock(null);
                        campaignEx.loadIconUrlAsyncWithBlock(null);
                    }
                }
            }
            if (NativeController.this.f16439i != null) {
                NativeController.this.f16439i.onAdFramesLoaded(list);
            }
        }

        @Override // com.mbridge.msdk.mbnative.f.a.b
        public final void a(List<com.mbridge.msdk.tracker.network.h> list, CampaignUnit campaignUnit) {
            Integer num;
            int i9 = 1;
            NativeController.this.f16432X = true;
            com.mbridge.msdk.foundation.db.j a6 = com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(NativeController.this.f16441k));
            a6.a();
            Runnable runnable = this.f16481c;
            if (runnable != null) {
                NativeController.this.f16501a.removeCallbacks(runnable);
            }
            com.mbridge.msdk.e.b.a();
            if (campaignUnit != null && campaignUnit.getAds() != null && campaignUnit.getAds().size() > 0) {
                NativeController.this.f16446r = campaignUnit.getSessionId();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                if (NativeController.this.f16430V <= 0) {
                    if (NativeController.this.f16430V == -3) {
                        NativeController.this.f16430V = campaignUnit.getAds().size();
                    } else {
                        NativeController nativeController = NativeController.this;
                        nativeController.f16430V = nativeController.f16449u;
                    }
                    if (NativeController.this.f16433Y != 0 && campaignUnit.getTemplate() == 2) {
                        NativeController nativeController2 = NativeController.this;
                        nativeController2.f16430V = nativeController2.f16433Y;
                    }
                    if (NativeController.this.f16434Z != 0 && campaignUnit.getTemplate() == 3) {
                        NativeController nativeController3 = NativeController.this;
                        nativeController3.f16430V = nativeController3.f16434Z;
                    }
                }
                for (int i10 = 0; i10 < campaignUnit.getAds().size(); i10++) {
                    final CampaignEx campaignEx = campaignUnit.getAds().get(i10);
                    campaignEx.setCampaignUnitId(this.unitId);
                    if (!TextUtils.isEmpty(NativeController.this.f16425Q)) {
                        campaignEx.setBidToken(NativeController.this.f16425Q);
                        campaignEx.setIsBidCampaign(true);
                    }
                    final com.mbridge.msdk.foundation.same.report.d.a.a aVar = null;
                    if (NativeController.f16409g) {
                        campaignEx.loadIconUrlAsyncWithBlock(null);
                        campaignEx.loadImageUrlAsyncWithBlock(null);
                    }
                    boolean c9 = ai.c(NativeController.this.f16441k, campaignEx.getPackageName());
                    Context unused = NativeController.this.f16441k;
                    if (i10 < NativeController.this.f16449u && campaignEx.getOfferType() != 99) {
                        if (ai.c(campaignEx)) {
                            campaignEx.setRtinsType(c9 ? 1 : 2);
                        }
                        if (com.mbridge.msdk.foundation.same.c.a(NativeController.this.f16441k, campaignEx)) {
                            arrayList.add(campaignEx);
                            if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                                arrayList3.add(campaignEx);
                            }
                        } else {
                            ai.a(this.unitId, campaignEx, com.mbridge.msdk.foundation.same.a.f15696x);
                            NativeController.this.ac = "APP ALREADY INSTALLED";
                        }
                        try {
                            com.mbridge.msdk.foundation.same.c.a(campaignEx, NativeController.this.f16441k, null, new c.a() { // from class: com.mbridge.msdk.mbnative.controller.NativeController.a.1
                                @Override // com.mbridge.msdk.foundation.same.c.a
                                public final void a(String str, com.mbridge.msdk.foundation.same.report.d.b bVar) {
                                    com.mbridge.msdk.mbnative.e.a.a(str, bVar, campaignEx, NativeController.this.f16441k, aVar);
                                }
                            });
                        } catch (Exception e4) {
                            if (MBridgeConstans.DEBUG) {
                                e4.printStackTrace();
                            }
                        }
                    }
                    if (i10 < NativeController.this.f16430V && campaignEx.getOfferType() != 99) {
                        if (ai.c(campaignEx)) {
                            campaignEx.setRtinsType(c9 ? 1 : 2);
                        }
                        if (!c9) {
                            arrayList2.add(campaignEx);
                        } else if (ai.c(campaignEx)) {
                            arrayList2.add(campaignEx);
                        }
                    }
                    if (!a6.b(campaignEx.getId())) {
                        com.mbridge.msdk.foundation.entity.g gVar = new com.mbridge.msdk.foundation.entity.g();
                        gVar.a(campaignEx.getId());
                        gVar.b(campaignEx.getFca());
                        gVar.c(campaignEx.getFcb());
                        gVar.a(0);
                        gVar.d(0);
                        gVar.a(System.currentTimeMillis());
                        a6.a(gVar);
                    }
                    com.mbridge.msdk.click.c.a(NativeController.this.f16441k, campaignEx.getMaitve(), campaignEx.getMaitve_src());
                }
                NativeController.c(NativeController.this, arrayList3);
                int type = campaignUnit.getAds().get(0) != null ? campaignUnit.getAds().get(0).getType() : 1;
                com.mbridge.msdk.mbnative.a.b<String, List<Campaign>> a9 = com.mbridge.msdk.mbnative.a.c.a(type);
                if (a9 != null) {
                    a9.a((com.mbridge.msdk.mbnative.a.b<String, List<Campaign>>) this.unitId, (String) arrayList2, NativeController.this.f16425Q);
                }
                if (arrayList.size() == 0) {
                    if (NativeController.this.ac.contains("INSTALLED")) {
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
                    com.mbridge.msdk.mbnative.controller.d.a(NativeController.this.f16450v, this.unitId);
                    return;
                }
                if (com.mbridge.msdk.mbnative.controller.d.e().containsKey(this.unitId) && (num = com.mbridge.msdk.mbnative.controller.d.e().get(this.unitId)) != null) {
                    i9 = num.intValue();
                }
                int i11 = NativeController.this.f16451w + NativeController.this.f16449u;
                NativeController.this.f16451w = i11 <= i9 ? i11 : 0;
                return;
            }
            this.unitId = "0_" + this.unitId;
            com.mbridge.msdk.mbnative.controller.d.b(NativeController.this.f16450v, this.unitId);
            NativeController.this.f16451w = 0;
        }

        @Override // com.mbridge.msdk.mbnative.f.a.b
        public final void a(int i9, String str) {
            NativeController.this.f16432X = true;
            if (this.b) {
                if (NativeController.this.f16453y || !this.f16482d) {
                    return;
                }
                NativeController.this.a(str, b(), a(), (CampaignEx) null);
                return;
            }
            if (i9 == -1) {
                com.mbridge.msdk.mbnative.controller.d.b(NativeController.this.f16450v, this.unitId);
                NativeController.this.f16451w = 0;
            }
            Runnable runnable = this.f16481c;
            if (runnable != null) {
                NativeController.this.f16501a.removeCallbacks(runnable);
            }
            if (NativeController.this.f16453y) {
                return;
            }
            if (b() == 1 || this.f16482d) {
                NativeController.this.a(str, b(), a(), (CampaignEx) null);
            }
        }

        public final void a(Runnable runnable) {
            this.f16481c = runnable;
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        void a();
    }

    /* loaded from: classes3.dex */
    public class c implements Runnable {
        private int b;

        /* renamed from: c, reason: collision with root package name */
        private com.mbridge.msdk.foundation.same.e.d f16487c;

        /* renamed from: d, reason: collision with root package name */
        private int f16488d;

        /* renamed from: e, reason: collision with root package name */
        private String f16489e;

        public c(int i9, com.mbridge.msdk.foundation.same.e.d dVar, int i10, String str) {
            this.b = i9;
            this.f16487c = dVar;
            this.f16488d = i10;
            this.f16489e = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f16487c.a(true);
            int i9 = this.b;
            if (i9 != 1) {
                if (i9 == 2) {
                    if (!NativeController.this.f16453y || this.f16488d == 1) {
                        NativeController.this.a("REQUEST_TIMEOUT", this.f16488d, this.f16489e, (CampaignEx) null);
                        return;
                    }
                    return;
                }
                return;
            }
            NativeController.this.f16432X = true;
            NativeController.this.a("REQUEST_TIMEOUT", this.f16488d, this.f16489e, (CampaignEx) null);
        }
    }

    /* loaded from: classes3.dex */
    public static class d implements H5DownLoadManager.IH5SourceDownloadListener {

        /* renamed from: a, reason: collision with root package name */
        private String f16490a;
        private CampaignEx b;

        /* renamed from: c, reason: collision with root package name */
        private long f16491c = System.currentTimeMillis();

        /* renamed from: d, reason: collision with root package name */
        private boolean f16492d;

        public d(String str, CampaignEx campaignEx, boolean z8) {
            this.f16492d = true;
            this.f16490a = str;
            this.b = campaignEx;
            this.f16492d = z8;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public final void onFailed(String str, String str2) {
            try {
                if (this.f16492d) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f16491c;
                    o.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().c()));
                    n nVar = new n("2000043", 3, currentTimeMillis + "", str, this.b.getId(), this.f16490a, str2, MBridgeConstans.API_REUQEST_CATEGORY_APP);
                    nVar.f(this.b.getRequestId());
                    nVar.s(this.b.getCurrentLocalRid());
                    nVar.g(this.b.getRequestIdNotice());
                    CampaignEx campaignEx = this.b;
                    if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getId())) {
                        nVar.e(this.b.getId());
                    }
                    CampaignEx campaignEx2 = this.b;
                    if (campaignEx2 != null) {
                        nVar.c(campaignEx2.getAdSpaceT());
                    }
                    nVar.d("1");
                    com.mbridge.msdk.foundation.same.report.g.a(nVar, this.f16490a, this.b);
                }
            } catch (Exception e4) {
                ad.b(NativeController.f16408f, com.mbridge.msdk.mbnative.b.a.a(e4));
            }
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public final void onSuccess(String str, String str2, boolean z8) {
            try {
                if (this.f16492d) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f16491c;
                    o.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().c()));
                    n nVar = new n("2000043", 1, currentTimeMillis + "", str, this.b.getId(), this.f16490a, "", MBridgeConstans.API_REUQEST_CATEGORY_APP);
                    CampaignEx campaignEx = this.b;
                    if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getId())) {
                        nVar.e(this.b.getId());
                    }
                    CampaignEx campaignEx2 = this.b;
                    if (campaignEx2 != null) {
                        nVar.f(campaignEx2.getRequestId());
                        nVar.g(this.b.getRequestIdNotice());
                        nVar.s(this.b.getCurrentLocalRid());
                        nVar.c(this.b.getAdSpaceT());
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        nVar.t(str2);
                    }
                    nVar.d("1");
                    com.mbridge.msdk.foundation.same.report.g.a(nVar, this.f16490a, this.b);
                }
            } catch (Exception e4) {
                ad.b(NativeController.f16408f, com.mbridge.msdk.mbnative.b.a.a(e4));
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class e extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<NativeController> f16493a;

        public e(NativeController nativeController) {
            this.f16493a = new WeakReference<>(nativeController);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            WeakReference<NativeController> weakReference;
            NativeController nativeController;
            super.handleMessage(message);
            try {
                NativeController nativeController2 = null;
                if (message.what == 0 && (weakReference = this.f16493a) != null && (nativeController = weakReference.get()) != null) {
                    h unused = nativeController.f16445q;
                    int i9 = message.arg1;
                    com.mbridge.msdk.foundation.same.report.d.c.a().d(i.a((Campaign) null, i9, com.vungle.ads.internal.ui.i.REQUEST_KEY_EXTRA));
                }
                if (message.what == 1) {
                    WeakReference<NativeController> weakReference2 = this.f16493a;
                    if (weakReference2 != null && weakReference2.get() != null) {
                        nativeController2 = this.f16493a.get();
                    }
                    if (nativeController2 != null) {
                        nativeController2.f16454z = true;
                        List<Campaign> a6 = nativeController2.a(nativeController2.l, nativeController2.f16449u, nativeController2.f16425Q);
                        if (!nativeController2.f16453y) {
                            nativeController2.a(a6);
                        }
                    }
                }
            } catch (Exception e4) {
                ad.b(NativeController.f16408f, com.mbridge.msdk.mbnative.b.a.a(e4));
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class f extends com.mbridge.msdk.foundation.same.e.a {

        /* renamed from: a, reason: collision with root package name */
        private CampaignEx f16494a;
        private WeakReference<View> b;

        /* renamed from: c, reason: collision with root package name */
        private WeakReference<List<View>> f16495c;

        /* renamed from: d, reason: collision with root package name */
        private WeakReference<NativeController> f16496d;

        /* renamed from: e, reason: collision with root package name */
        private WeakReference<O5.b> f16497e;

        public f(CampaignEx campaignEx, View view, List<View> list, NativeController nativeController, O5.b bVar) {
            this.f16494a = campaignEx;
            this.b = new WeakReference<>(view);
            this.f16495c = new WeakReference<>(list);
            this.f16496d = new WeakReference<>(nativeController);
            this.f16497e = new WeakReference<>(bVar);
        }

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void cancelTask() {
        }

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void pauseTask(boolean z8) {
        }

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void runTask() {
            WeakReference<View> weakReference;
            O5.b bVar;
            try {
                if (this.f16496d != null && (weakReference = this.b) != null && this.f16495c != null) {
                    View view = weakReference.get();
                    List<View> list = this.f16495c.get();
                    NativeController nativeController = this.f16496d.get();
                    WeakReference<O5.b> weakReference2 = this.f16497e;
                    if (weakReference2 != null) {
                        bVar = weakReference2.get();
                    } else {
                        bVar = null;
                    }
                    if (view != null && nativeController != null) {
                        NativeController.a(nativeController, this.f16494a, view, list, bVar);
                    }
                }
            } catch (Exception e4) {
                ad.b(NativeController.f16408f, com.mbridge.msdk.mbnative.b.a.a(e4));
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class g implements H5DownLoadManager.ZipDownloadListener {

        /* renamed from: a, reason: collision with root package name */
        String f16498a;
        CampaignEx b;

        /* renamed from: c, reason: collision with root package name */
        private long f16499c = System.currentTimeMillis();

        /* renamed from: d, reason: collision with root package name */
        private boolean f16500d;

        public g(String str, CampaignEx campaignEx, boolean z8) {
            this.f16500d = true;
            this.f16498a = str;
            this.b = campaignEx;
            this.f16500d = z8;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public final void onFailed(String str, String str2) {
            try {
                if (this.f16500d) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f16499c;
                    o.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().c()));
                    n nVar = new n("2000043", 3, currentTimeMillis + "", str2, this.b.getId(), this.f16498a, str, "1");
                    CampaignEx campaignEx = this.b;
                    if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getId())) {
                        nVar.e(this.b.getId());
                    }
                    CampaignEx campaignEx2 = this.b;
                    if (campaignEx2 != null) {
                        nVar.f(campaignEx2.getRequestId());
                        nVar.s(this.b.getCurrentLocalRid());
                        nVar.g(this.b.getRequestIdNotice());
                        nVar.c(this.b.getAdSpaceT());
                    }
                    nVar.d(MBridgeConstans.API_REUQEST_CATEGORY_APP);
                    com.mbridge.msdk.foundation.same.report.g.a(nVar, this.f16498a, this.b);
                }
            } catch (Exception e4) {
                ad.b(NativeController.f16408f, com.mbridge.msdk.mbnative.b.a.a(e4));
            }
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public final void onSuccess(String str, String str2, boolean z8) {
            try {
                if (this.f16500d) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f16499c;
                    o.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().c()));
                    n nVar = new n("2000043", 1, currentTimeMillis + "", str, this.b.getId(), this.f16498a, "", "1");
                    CampaignEx campaignEx = this.b;
                    if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getId())) {
                        nVar.e(this.b.getId());
                    }
                    CampaignEx campaignEx2 = this.b;
                    if (campaignEx2 != null) {
                        nVar.f(campaignEx2.getRequestId());
                        nVar.s(this.b.getCurrentLocalRid());
                        nVar.g(this.b.getRequestIdNotice());
                        nVar.c(this.b.getAdSpaceT());
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        nVar.t(str2);
                    }
                    nVar.d(MBridgeConstans.API_REUQEST_CATEGORY_APP);
                    com.mbridge.msdk.foundation.same.report.g.a(nVar, this.f16498a, this.b);
                }
            } catch (Exception e4) {
                ad.b(NativeController.f16408f, com.mbridge.msdk.mbnative.b.a.a(e4));
            }
        }
    }

    public NativeController(com.mbridge.msdk.mbnative.d.a aVar, NativeListener.NativeTrackingListener nativeTrackingListener, Map<String, Object> map, Context context) {
        com.mbridge.msdk.mbnative.a.b<String, List<Campaign>> a6;
        int i9;
        Object obj;
        this.f16448t = 1;
        this.f16449u = 1;
        this.f16450v = -1;
        this.f16451w = 0;
        this.f16453y = false;
        this.f16454z = false;
        this.f16410A = false;
        this.f16411B = 0;
        this.f16412C = 0;
        this.f16413D = 0;
        this.f16414E = 0;
        this.f16418I = new CopyOnWriteArrayList<>();
        this.f16419J = new Hashtable<>();
        this.f16420K = 1;
        this.f16421L = 2;
        this.f16425Q = "";
        this.f16426R = "";
        this.ac = "";
        this.f16441k = context;
        this.f16437e = map;
        this.f16438h = new j();
        this.f16439i = aVar;
        this.f16440j = nativeTrackingListener;
        this.f16416G = new ArrayList();
        this.f16417H = new ArrayList();
        String str = (String) map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
        this.l = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (map.containsKey(MBridgeConstans.PLACEMENT_ID) && map.get(MBridgeConstans.PLACEMENT_ID) != null) {
            this.m = (String) map.get(MBridgeConstans.PLACEMENT_ID);
        } else {
            this.m = "";
        }
        if (map.containsKey(MBridgeConstans.PREIMAGE) && (obj = map.get(MBridgeConstans.PREIMAGE)) != null) {
            f16409g = ((Boolean) obj).booleanValue();
        }
        this.f16442n = new LinkedList();
        this.f16443o = new LinkedList();
        this.f16415F = new com.mbridge.msdk.foundation.same.e.b(this.f16441k);
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        this.f16501a = new e(this);
        if (map.containsKey(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY)) {
            this.f16452x = (String) map.get(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY);
        }
        try {
            boolean equals = com.mbridge.msdk.mbnative.controller.d.b().containsKey(this.l) ? Boolean.TRUE.equals(com.mbridge.msdk.mbnative.controller.d.b().get(this.l)) : false;
            Object obj2 = map.get("ad_num");
            Object obj3 = map.get(MBridgeConstans.PROPERTIES_AD_FRAME_NUM);
            if (!equals) {
                if (map.containsKey("ad_num") && obj2 != null) {
                    try {
                        i9 = ((Integer) obj2).intValue();
                    } catch (Exception e4) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b(f16408f, e4.getMessage());
                        }
                        i9 = 1;
                    }
                    i9 = i9 < 1 ? 1 : i9;
                    i9 = i9 > 10 ? 10 : i9;
                    this.f16449u = i9;
                    this.f16448t = i9;
                }
                if (map.containsKey(MBridgeConstans.PROPERTIES_AD_FRAME_NUM) && obj3 != null) {
                    try {
                        this.f16413D = ((Integer) obj3).intValue();
                    } catch (Exception e9) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b(f16408f, e9.getMessage());
                        }
                    }
                }
            } else if (com.mbridge.msdk.mbnative.controller.d.d().containsKey(this.l)) {
                Integer num = com.mbridge.msdk.mbnative.controller.d.d().get(this.l);
                if (num != null) {
                    this.f16449u = num.intValue();
                }
                if (map.containsKey("ad_num") && obj2 != null) {
                    int intValue = ((Integer) obj2).intValue();
                    this.f16411B = intValue;
                    this.f16448t = intValue;
                }
                if (map.containsKey(MBridgeConstans.PROPERTIES_AD_FRAME_NUM) && obj3 != null) {
                    int intValue2 = ((Integer) obj3).intValue();
                    this.f16412C = intValue2;
                    this.f16413D = intValue2;
                }
            }
        } catch (Exception e10) {
            ad.b(f16408f, com.mbridge.msdk.mbnative.b.a.a(e10));
        }
        this.f16445q = new h(this.f16441k);
        this.f16447s = new com.mbridge.msdk.click.a(this.f16441k, this.l);
        try {
            int i10 = MBMediaView.f16787a0;
            this.O = true;
            Map<String, Object> map2 = this.f16437e;
            if (map2 != null && (map2.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH) || this.f16437e.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT) || map.containsKey(MBridgeConstans.NATIVE_VIDEO_SUPPORT))) {
                this.f16423N = true;
            }
            com.mbridge.msdk.mbnative.controller.e.a(this.f16441k, this.l);
            ab.a();
            if (TextUtils.isEmpty(this.l)) {
                return;
            }
            com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(this.f16441k)).a();
            int a9 = a(map.containsKey(MBridgeConstans.NATIVE_INFO) ? (String) map.get(MBridgeConstans.NATIVE_INFO) : null);
            String str2 = this.l;
            a9 = a9 <= 0 ? this.f16448t : a9;
            k d2 = com.mbridge.msdk.c.h.a().d("", str2);
            this.f16428T = d2;
            if (d2 == null) {
                this.f16428T = k.d(str2);
            }
            List<Integer> b8 = this.f16428T.b();
            this.f16435c = b8;
            List<Campaign> b9 = (b8 == null || b8.size() <= 0 || !this.f16435c.contains(1) || (a6 = com.mbridge.msdk.mbnative.a.c.a(1)) == null) ? null : a6.b(str2, a9);
            if (b9 != null) {
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < b9.size(); i11++) {
                    CampaignEx campaignEx = (CampaignEx) b9.get(i11);
                    if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                        arrayList.add(campaignEx);
                    }
                }
                if (arrayList.size() > 0) {
                    Object invoke = com.mbridge.msdk.videocommon.download.b.class.getMethod("getInstance", null).invoke(null, null);
                    com.mbridge.msdk.videocommon.download.b.class.getMethod("createUnitCache", Context.class, String.class, CopyOnWriteArrayList.class, Integer.TYPE, com.mbridge.msdk.videocommon.listener.a.class).invoke(invoke, context, this.l, new CopyOnWriteArrayList(arrayList), 1, null);
                    com.mbridge.msdk.videocommon.download.b.class.getMethod("load", String.class).invoke(invoke, this.l);
                }
            }
        } catch (Throwable unused) {
            ad.b(f16408f, "please import the nativex aar");
        }
    }

    public static void insertExcludeId(String str, CampaignEx campaignEx) {
        if (!TextUtils.isEmpty(str) && campaignEx != null && com.mbridge.msdk.foundation.controller.c.m().c() != null) {
            com.mbridge.msdk.foundation.db.i a6 = com.mbridge.msdk.foundation.db.i.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().c()));
            com.mbridge.msdk.foundation.entity.f fVar = new com.mbridge.msdk.foundation.entity.f();
            fVar.a(System.currentTimeMillis());
            fVar.b(str);
            fVar.a(campaignEx.getId());
            a6.a(fVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public k f() {
        k d2 = com.mbridge.msdk.c.h.a().d("", this.l);
        this.f16428T = d2;
        if (d2 == null) {
            this.f16428T = k.d(this.l);
        }
        return this.f16428T;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        Timer timer = this.f16424P;
        if (timer != null) {
            timer.cancel();
            this.f16424P = null;
        }
    }

    public static /* synthetic */ void c(NativeController nativeController, List list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    try {
                        int i9 = MBMediaView.f16787a0;
                        Object invoke = com.mbridge.msdk.videocommon.download.b.class.getMethod("getInstance", null).invoke(null, null);
                        if (invoke != null) {
                            com.mbridge.msdk.videocommon.download.b.class.getMethod("createUnitCache", Context.class, String.class, CopyOnWriteArrayList.class, Integer.TYPE, com.mbridge.msdk.videocommon.listener.a.class).invoke(invoke, nativeController.f16441k, nativeController.l, new CopyOnWriteArrayList(list), 1, null);
                            com.mbridge.msdk.videocommon.download.b.class.getMethod("load", String.class).invoke(invoke, nativeController.l);
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
                                    H5DownLoadManager.getInstance().downloadH5Res(bVar, str, new g(nativeController.l, campaignEx, TextUtils.isEmpty(H5DownLoadManager.getInstance().getH5ResAddress(str))));
                                } else {
                                    H5DownLoadManager.getInstance().downloadH5Res(bVar, str, new d(nativeController.l, campaignEx, TextUtils.isEmpty(HTMLResourceManager.getInstance().getHtmlContentFromUrl(str))));
                                }
                            }
                        }
                    } catch (Throwable unused2) {
                        ad.b(f16408f, "please import the videocommon and nativex aar");
                    }
                }
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    th.printStackTrace();
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
                if (TextUtils.isEmpty(this.f16425Q) && TextUtils.isEmpty(campaignEx.getBidToken()) && !campaignEx.isBidCampaign()) {
                    arrayList2.add(campaignEx);
                } else if (!TextUtils.isEmpty(this.f16425Q) && TextUtils.equals(campaignEx.getBidToken(), this.f16425Q)) {
                    arrayList.add(campaign);
                }
            } else {
                arrayList2.add(campaign);
            }
        }
        return TextUtils.isEmpty(this.f16425Q) ? arrayList2 : arrayList;
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
            for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                try {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i9);
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString(TtmlNode.TAG_P);
                        if (!TextUtils.isEmpty(optString)) {
                            arrayList2.add(optString);
                        }
                    }
                } catch (Exception e4) {
                    e = e4;
                    arrayList = arrayList2;
                    ad.b(f16408f, com.mbridge.msdk.mbnative.b.a.a(e));
                    return arrayList;
                }
            }
            return arrayList2;
        } catch (Exception e9) {
            e = e9;
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
        } catch (Exception e4) {
            ad.b(f16408f, com.mbridge.msdk.mbnative.b.a.a(e4));
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
                for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                    JSONObject jSONObject = (JSONObject) jSONArray.opt(i9);
                    if (2 == jSONObject.optInt("id", 0)) {
                        return jSONObject.optInt("ad_num");
                    }
                }
            }
        } catch (Exception e4) {
            ad.b(f16408f, com.mbridge.msdk.mbnative.b.a.a(e4));
        }
        return 0;
    }

    private void b(int i9, String str) {
        com.mbridge.msdk.mbnative.d.a aVar;
        Long poll;
        Queue<Integer> queue = this.f16442n;
        if (queue != null && queue.size() > 0) {
            Integer poll2 = this.f16442n.poll();
            int intValue = poll2 != null ? poll2.intValue() : 1;
            this.f16429U = MBridgeConstans.REQUEST_TIME_OUT;
            Queue<Long> queue2 = this.f16443o;
            if (queue2 != null && queue2.size() > 0 && (poll = this.f16443o.poll()) != null) {
                this.f16429U = poll.longValue();
            }
            b(intValue, this.f16429U, i9, str);
            return;
        }
        if (this.f16453y || (aVar = this.f16439i) == null) {
            return;
        }
        this.f16453y = true;
        aVar.onAdLoadError("no ad source");
    }

    public final void a(int i9, String str) {
        boolean z8;
        this.f16453y = false;
        this.f16454z = false;
        this.f16410A = false;
        this.f16432X = false;
        this.f16425Q = str;
        this.f16439i.a(!TextUtils.isEmpty(str));
        this.f16422M = null;
        Map<String, Long> map = b;
        if (map != null && map.size() > 0) {
            b.clear();
        }
        if (((com.mbridge.msdk.mbnative.controller.d.b() == null || !com.mbridge.msdk.mbnative.controller.d.b().containsKey(this.l)) ? false : Boolean.TRUE.equals(com.mbridge.msdk.mbnative.controller.d.b().get(this.l))) && i9 == 1 && a(i9)) {
            return;
        }
        String k6 = com.mbridge.msdk.foundation.controller.c.m().k();
        String b8 = com.mbridge.msdk.foundation.controller.c.m().b();
        if (this.f16437e.containsKey(MBridgeConstans.APP_ID) && this.f16437e.containsKey(MBridgeConstans.APP_KEY) && this.f16437e.containsKey(MBridgeConstans.KEY_WORD)) {
            k6 = (String) this.f16437e.get(MBridgeConstans.APP_ID);
            b8 = (String) this.f16437e.get(MBridgeConstans.APP_KEY);
        }
        this.f16438h.a(this.f16441k, k6, b8, this.l);
        k d2 = com.mbridge.msdk.c.h.a().d(k6, this.l);
        this.f16428T = d2;
        if (d2 == null) {
            this.f16428T = k.d(this.l);
        }
        com.mbridge.msdk.mbnative.controller.d.e().put(this.l, Integer.valueOf(this.f16428T.w() * this.f16449u));
        this.f16435c = this.f16428T.b();
        this.f16436d = this.f16428T.c();
        this.f16431W = this.f16428T.e();
        this.f16430V = this.f16428T.d();
        this.f16449u = this.f16448t;
        List<Integer> list = this.f16435c;
        if (list != null && list.size() != 0) {
            try {
                z8 = com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.a(com.mbridge.msdk.foundation.controller.c.m().c());
            } catch (Exception unused) {
                z8 = false;
            }
            if (!z8) {
                com.mbridge.msdk.mbnative.d.a aVar = this.f16439i;
                if (aVar != null) {
                    aVar.onAdLoadError("webview is not available");
                    return;
                }
                return;
            }
            if (this.f16437e.containsKey(MBridgeConstans.NATIVE_INFO) && this.f16444p == null) {
                String str2 = (String) this.f16437e.get(MBridgeConstans.NATIVE_INFO);
                this.f16444p = str2;
                if (str2 != null) {
                    try {
                        JSONArray jSONArray = new JSONArray(this.f16444p);
                        if (jSONArray.length() > 0) {
                            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                                JSONObject jSONObject = (JSONObject) jSONArray.opt(i10);
                                int optInt = jSONObject.optInt("id", 0);
                                if (2 == optInt) {
                                    this.f16433Y = jSONObject.optInt("ad_num");
                                    if (this.f16431W > 0) {
                                        jSONObject.remove("ad_num");
                                        jSONObject.put("ad_num", this.f16431W);
                                    }
                                } else if (3 == optInt) {
                                    this.f16434Z = jSONObject.optInt("ad_num");
                                    if (this.f16431W > 0) {
                                        jSONObject.remove("ad_num");
                                        jSONObject.put("ad_num", this.f16431W);
                                    }
                                }
                            }
                        }
                        this.f16420K = Math.max(this.f16433Y, this.f16434Z);
                        this.f16444p = jSONArray.toString();
                    } catch (JSONException e4) {
                        ad.b(f16408f, com.mbridge.msdk.mbnative.b.a.a(e4));
                    }
                }
            }
            if ((!this.f16435c.contains(1) || this.f16435c.get(0).intValue() == 1) && i9 == 0 && a(a(this.l, this.f16449u, this.f16425Q))) {
                return;
            }
            this.aa = true;
            if (this.f16435c.contains(1) && i9 == 0 && this.f16435c.get(0).intValue() != 1) {
                int intValue = this.f16435c.get(0).intValue();
                com.mbridge.msdk.mbnative.a.b<String, List<Campaign>> a6 = com.mbridge.msdk.mbnative.a.c.a(intValue);
                if (intValue == 2 && this.f16437e.containsKey(MBridgeConstans.NATIVE_INFO)) {
                    this.f16449u = this.f16420K;
                } else {
                    this.f16449u = this.f16448t;
                }
                if (a6 != null && a(a(intValue, d(a6.b(this.l, this.f16449u))))) {
                    return;
                }
                this.aa = false;
                try {
                    a(this.f16436d.get(this.f16435c.indexOf(1)).intValue() * 1000, i9, false, this.l, this.f16425Q);
                } catch (Exception unused2) {
                }
            }
            this.f16501a.sendEmptyMessageDelayed(1, this.f16428T.u() * 1000);
            List<Integer> list2 = this.f16435c;
            if (list2 != null && list2.size() > 0) {
                Queue<Integer> queue = this.f16442n;
                if (queue != null && queue.size() > 0) {
                    this.f16442n.clear();
                }
                for (Integer num : this.f16435c) {
                    Queue<Integer> queue2 = this.f16442n;
                    if (queue2 != null) {
                        queue2.add(num);
                    }
                }
            }
            List<Integer> list3 = this.f16436d;
            if (list3 != null && list3.size() > 0) {
                Queue<Long> queue3 = this.f16443o;
                if (queue3 != null && queue3.size() > 0) {
                    this.f16443o.clear();
                }
                for (Integer num2 : this.f16436d) {
                    Queue<Long> queue4 = this.f16443o;
                    if (queue4 != null) {
                        queue4.add(Long.valueOf(num2.intValue() * 1000));
                    }
                }
            }
            b(i9, this.f16425Q);
            return;
        }
        com.mbridge.msdk.mbnative.d.a aVar2 = this.f16439i;
        if (aVar2 != null) {
            this.f16453y = true;
            aVar2.onAdLoadError("do not have sorceList");
        }
    }

    private void b(int i9, long j7, int i10, String str) {
        com.mbridge.msdk.mbnative.a.b<String, List<Campaign>> a6;
        if (i10 == 0 && (a6 = com.mbridge.msdk.mbnative.a.c.a(i9)) != null) {
            if ((i9 == 1 || i9 == 2) && this.f16437e.containsKey(MBridgeConstans.NATIVE_INFO)) {
                this.f16449u = this.f16420K;
            } else {
                this.f16449u = this.f16448t;
            }
            if (a(a(i9, d(a6.b(this.l, this.f16449u))))) {
                return;
            }
        }
        if (i9 == 1) {
            a(j7, i10, true, this.l, str);
        } else if (i9 != 2) {
            a(i9, j7, i10, str);
        } else {
            a(2, j7, i10, str);
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

    private O5.b b(CampaignEx campaignEx) {
        if (this.f16419J == null) {
            this.f16419J = new Hashtable<>();
        }
        String requestIdNotice = campaignEx.getRequestIdNotice();
        O5.b bVar = this.f16419J.get(requestIdNotice);
        if (bVar == null && campaignEx.isActiveOm() && TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
            bVar = com.mbridge.msdk.a.b.a(this.f16441k, true, campaignEx.getOmid(), campaignEx.getRequestId(), campaignEx.getId(), this.l, "", campaignEx.getRequestIdNotice());
        }
        if (bVar != null) {
            this.f16419J.put(requestIdNotice, bVar);
        }
        return bVar;
    }

    public final String c() {
        ArrayList arrayList = new ArrayList();
        List<Campaign> list = this.ab;
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
        if (view != null && this.f16427S != null) {
            try {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this.f16427S);
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
        if (campaign != null) {
            int type = campaign.getType();
            if (type == 1 || type == 2) {
                try {
                    cls = MBMediaView.class;
                    int i9 = MBMediaView.f16787a0;
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
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                if (campaignEx != null && TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                    Campaign remove = list.remove(size);
                    com.mbridge.msdk.mbnative.a.c.a(campaignEx.getType()).a(this.l, remove, this.f16425Q);
                    ad.a(f16408f, "remove no videoURL ads:" + remove);
                }
            }
        }
        return list;
    }

    public final String b() {
        return this.f16426R;
    }

    public NativeController() {
        this.f16448t = 1;
        this.f16449u = 1;
        this.f16450v = -1;
        this.f16451w = 0;
        this.f16453y = false;
        this.f16454z = false;
        this.f16410A = false;
        this.f16411B = 0;
        this.f16412C = 0;
        this.f16413D = 0;
        this.f16414E = 0;
        this.f16418I = new CopyOnWriteArrayList<>();
        this.f16419J = new Hashtable<>();
        this.f16420K = 1;
        this.f16421L = 2;
        this.f16425Q = "";
        this.f16426R = "";
        this.ac = "";
    }

    private boolean a(int i9) {
        int i10;
        int i11;
        int i12;
        com.mbridge.msdk.mbnative.d.a aVar;
        int i13 = 0;
        if (com.mbridge.msdk.mbnative.controller.d.b().containsKey(this.l) && Boolean.TRUE.equals(com.mbridge.msdk.mbnative.controller.d.b().get(this.l))) {
            Map<String, Map<Long, Object>> a6 = com.mbridge.msdk.mbnative.controller.d.a();
            Map<Long, Object> map = a6.get(i9 + "_" + this.l);
            Integer num = com.mbridge.msdk.mbnative.controller.d.d().get(this.l);
            com.mbridge.msdk.c.g f9 = L.f(com.mbridge.msdk.c.h.a());
            if (num != null) {
                this.f16449u = num.intValue();
            }
            if (map != null && map.size() > 0) {
                Long next = map.keySet().iterator().next();
                long currentTimeMillis = System.currentTimeMillis();
                if (f9 == null) {
                    com.mbridge.msdk.c.h.a();
                    f9 = com.mbridge.msdk.c.i.a();
                }
                if (currentTimeMillis - next.longValue() >= f9.Z() * 1000) {
                    a6.remove(i9 + "_" + this.l);
                } else {
                    if (i9 == 1) {
                        List<Frame> list = (List) map.get(next);
                        if (list == null || list.size() <= 0 || (aVar = this.f16439i) == null) {
                            return false;
                        }
                        if (this.f16413D >= list.size()) {
                            a6.remove(i9 + "_" + this.l);
                            aVar.onAdFramesLoaded(list);
                            return true;
                        }
                        if (this.f16413D == 0) {
                            return false;
                        }
                        List<Frame> subList = list.subList(0, this.f16412C);
                        aVar.onAdFramesLoaded(list);
                        list.removeAll(subList);
                        map.put(next, subList);
                        ArrayList arrayList = new ArrayList();
                        for (Frame frame : list) {
                            if (i13 >= this.f16413D) {
                                arrayList.add(frame);
                            }
                            i13++;
                        }
                        map.put(next, arrayList);
                        a6.put(i9 + "_" + this.l, map);
                        aVar.onAdFramesLoaded(subList);
                        return true;
                    }
                    List list2 = (List) map.get(next);
                    if (list2 != null && list2.size() > 0) {
                        ArrayList arrayList2 = new ArrayList();
                        if (((CampaignEx) list2.get(0)).getType() == 1) {
                            if (TextUtils.isEmpty(this.f16444p)) {
                                i10 = Math.min(this.f16411B, list2.size());
                            } else {
                                try {
                                    JSONArray jSONArray = new JSONArray(this.f16444p);
                                    if (jSONArray.length() > 0) {
                                        i11 = 0;
                                        i12 = 0;
                                        for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                                            JSONObject jSONObject = (JSONObject) jSONArray.opt(i14);
                                            int optInt = jSONObject.optInt("id", 0);
                                            if (2 == optInt) {
                                                i11 = jSONObject.optInt("ad_num");
                                            } else if (3 == optInt) {
                                                i12 = jSONObject.optInt("ad_num");
                                            }
                                        }
                                    } else {
                                        i11 = 0;
                                        i12 = 0;
                                    }
                                    if (3 == ((CampaignEx) list2.get(0)).getTemplate()) {
                                        i10 = Math.min(i12, list2.size());
                                    } else {
                                        i10 = Math.min(i11, list2.size());
                                    }
                                } catch (Exception unused) {
                                    ad.b(f16408f, "load from catch error in get nativeinfo adnum");
                                    i10 = 0;
                                }
                            }
                            if (i10 <= 0) {
                                return false;
                            }
                            Iterator it = list2.iterator();
                            while (it.hasNext() && i13 != i10) {
                                CampaignEx campaignEx = (CampaignEx) it.next();
                                campaignEx.getTemplate();
                                arrayList2.add(campaignEx);
                                it.remove();
                                i13++;
                            }
                        } else {
                            int min = Math.min(this.f16411B, list2.size());
                            if (min > 0) {
                                Iterator it2 = list2.iterator();
                                while (it2.hasNext() && i13 != min) {
                                    CampaignEx campaignEx2 = (CampaignEx) it2.next();
                                    campaignEx2.getTemplate();
                                    arrayList2.add(campaignEx2);
                                    it2.remove();
                                    i13++;
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

    public final void a(String str, int i9, String str2, CampaignEx campaignEx) {
        Queue<Integer> queue = this.f16442n;
        if ((queue != null && queue.size() <= 0) || this.f16442n == null) {
            com.mbridge.msdk.mbnative.d.a aVar = this.f16439i;
            if (aVar == null || this.f16453y) {
                return;
            }
            this.f16453y = true;
            aVar.a(campaignEx, str);
            return;
        }
        b(i9, str2);
    }

    @Override // com.mbridge.msdk.mbnative.controller.a
    public final synchronized void a(int i9, long j7, int i10, String str) {
        a aVar;
        com.mbridge.msdk.foundation.same.net.f.e eVar;
        com.mbridge.msdk.mbnative.f.a.a aVar2;
        c cVar;
        int i11;
        com.mbridge.msdk.foundation.entity.k kVar;
        try {
            try {
                if (this.f16437e.containsKey(MBridgeConstans.NATIVE_INFO)) {
                    this.f16449u = Math.max(this.f16433Y, this.f16434Z);
                }
                if (i10 == 0) {
                    com.mbridge.msdk.mbnative.a.b<String, List<Campaign>> a6 = com.mbridge.msdk.mbnative.a.c.a(i9);
                    if (a6 != null && a(a(1, d(a6.b(this.l, this.f16449u))))) {
                        return;
                    }
                    a aVar3 = this.f16422M;
                    if (aVar3 != null && !this.f16432X) {
                        aVar3.b(true);
                    }
                    if (this.f16432X && !this.f16453y) {
                        a("mb load failed", i10, str, (CampaignEx) null);
                    }
                    if (!this.aa) {
                        return;
                    }
                }
                int i12 = this.f16450v;
                if (i12 == -1) {
                    this.f16450v = i9;
                } else if (i12 != i9) {
                    this.f16451w = 0;
                }
                com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(this.f16441k)).a();
                com.mbridge.msdk.mbnative.f.a.a aVar4 = new com.mbridge.msdk.mbnative.f.a.a(this.f16441k);
                com.mbridge.msdk.foundation.same.net.f.e eVar2 = new com.mbridge.msdk.foundation.same.net.f.e();
                String k6 = com.mbridge.msdk.foundation.controller.c.m().k();
                String b8 = com.mbridge.msdk.foundation.controller.c.m().b();
                Map<String, Object> map = this.f16437e;
                if (map != null && map.containsKey(MBridgeConstans.APP_ID) && this.f16437e.containsKey(MBridgeConstans.APP_KEY) && this.f16437e.containsKey(MBridgeConstans.KEY_WORD) && this.f16437e.get(MBridgeConstans.KEY_WORD) != null) {
                    if (this.f16437e.get(MBridgeConstans.APP_ID) instanceof String) {
                        k6 = (String) this.f16437e.get(MBridgeConstans.APP_ID);
                    }
                    if (this.f16437e.get(MBridgeConstans.APP_KEY) instanceof String) {
                        b8 = (String) this.f16437e.get(MBridgeConstans.APP_KEY);
                    }
                    String str2 = this.f16437e.get(MBridgeConstans.KEY_WORD) instanceof String ? (String) this.f16437e.get(MBridgeConstans.KEY_WORD) : null;
                    if (!TextUtils.isEmpty(str2)) {
                        eVar2.a("smart", x.b(str2));
                    }
                }
                eVar2.a(MBridgeConstans.APP_ID, k6);
                eVar2.a(MBridgeConstans.PROPERTIES_UNIT_ID, this.l);
                if (!TextUtils.isEmpty(this.m)) {
                    eVar2.a(MBridgeConstans.PLACEMENT_ID, this.m);
                }
                eVar2.a("req_type", MBridgeConstans.API_REUQEST_CATEGORY_APP);
                if (!TextUtils.isEmpty(this.f16452x)) {
                    eVar2.a("category", this.f16452x);
                }
                eVar2.a("sign", SameMD5.getMD5(k6 + b8));
                if (this.f16431W > 0 && i10 == 0) {
                    eVar2.a("ad_num", this.f16431W + "");
                } else {
                    eVar2.a("ad_num", this.f16448t + "");
                }
                String d2 = ai.d(this.l);
                if (!TextUtils.isEmpty(d2)) {
                    eVar2.a("j", d2);
                }
                eVar2.a("only_impression", "1");
                eVar2.a("ping_mode", "1");
                if (this.f16413D != 0) {
                    eVar2.a("frame_num", this.f16413D + "");
                }
                if (!TextUtils.isEmpty(this.f16444p)) {
                    eVar2.a(MBridgeConstans.NATIVE_INFO, this.f16444p);
                    if (i9 == 1) {
                        eVar2.a("tnum", this.f16420K + "");
                    }
                } else if (i9 == 1) {
                    eVar2.a("tnum", this.f16448t + "");
                }
                String a9 = com.mbridge.msdk.foundation.same.a.b.a(this.l, "native");
                if (!TextUtils.isEmpty(a9)) {
                    eVar2.a(com.mbridge.msdk.foundation.same.net.f.e.f15853d, a9);
                }
                if (this.f16437e.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH) && (this.f16437e.get(MBridgeConstans.NATIVE_VIDEO_WIDTH) instanceof Integer)) {
                    eVar2.a("video_width", ((Integer) this.f16437e.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
                }
                if (this.f16437e.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT) && (this.f16437e.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT) instanceof Integer)) {
                    eVar2.a("video_height", ((Integer) this.f16437e.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
                }
                if (this.f16437e.containsKey(MBridgeConstans.NATIVE_VIDEO_SUPPORT) && (this.f16437e.get(MBridgeConstans.NATIVE_VIDEO_SUPPORT) instanceof Boolean)) {
                    ((Boolean) this.f16437e.get(MBridgeConstans.NATIVE_VIDEO_SUPPORT)).getClass();
                }
                eVar2.a("video_version", MBridgeConstans.NATIVE_VIDEO_VERSION);
                if (com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k()) == null) {
                    com.mbridge.msdk.c.h.a();
                    com.mbridge.msdk.c.i.a();
                }
                if (!a(this.f16437e)) {
                    JSONArray b9 = ai.b(this.f16441k, this.l);
                    if (b9.length() > 0) {
                        eVar2.a(com.mbridge.msdk.foundation.same.net.f.e.f15854e, ai.a(b9));
                    }
                }
                if (com.mbridge.msdk.mbnative.controller.d.b().containsKey(this.l) && com.mbridge.msdk.mbnative.controller.d.b().get(this.l).booleanValue() && com.mbridge.msdk.mbnative.controller.d.c().get(this.l) != null && (kVar = com.mbridge.msdk.mbnative.controller.d.c().get(this.l)) != null) {
                    if (i9 == 1) {
                        this.f16451w = kVar.a();
                    } else if (i9 == 2) {
                        this.f16451w = kVar.b();
                    }
                }
                eVar2.a("offset", this.f16451w + "");
                eVar2.a("ad_type", "42");
                eVar2.a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i9 + "");
                if (!TextUtils.isEmpty(this.f16446r)) {
                    eVar2.a(com.mbridge.msdk.foundation.same.net.f.e.f15855f, this.f16446r);
                }
                a aVar5 = new a();
                aVar5.a(b(this.f16437e));
                aVar5.setUnitId(this.l);
                aVar5.setPlacementId(this.m);
                aVar5.setAdType(42);
                aVar5.b(true);
                c cVar2 = new c(1, aVar5, i10, str);
                aVar5.a(cVar2);
                aVar5.e(i10);
                aVar5.a(str);
                if (i10 == 0) {
                    if (!TextUtils.isEmpty(str)) {
                        eVar2.a(BidResponsed.KEY_TOKEN, str);
                    }
                    aVar = aVar5;
                    eVar = eVar2;
                    aVar2 = aVar4;
                    cVar = cVar2;
                    i11 = 1;
                    aVar4.choiceV3OrV5BySetting(1, eVar, aVar, str, com.mbridge.msdk.foundation.same.c.a(j7, 30000L));
                } else {
                    aVar = aVar5;
                    eVar = eVar2;
                    aVar2 = aVar4;
                    cVar = cVar2;
                    i11 = 1;
                }
                if (i10 == i11) {
                    aVar2.getLoadOrSetting(1, com.mbridge.msdk.foundation.same.net.e.d.f().f15814N, eVar, aVar, "campaign", com.mbridge.msdk.foundation.same.c.a(j7, 30000L));
                }
                this.f16501a.postDelayed(cVar, j7);
            } catch (Exception e4) {
                String str3 = f16408f;
                ad.b(str3, com.mbridge.msdk.mbnative.b.a.a(e4));
                ad.b(str3, e4.getMessage());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void a(final View view, CampaignEx campaignEx) {
        BitmapDrawable a6;
        final ImageView imageView;
        if (!(view instanceof FrameLayout) || (a6 = com.mbridge.msdk.foundation.controller.c.m().a(this.l, campaignEx.getAdType())) == null) {
            return;
        }
        try {
            int childCount = ((ViewGroup) view).getChildCount();
            int i9 = 0;
            while (true) {
                if (i9 >= childCount) {
                    imageView = null;
                    break;
                }
                View childAt = ((ViewGroup) view).getChildAt(i9);
                if ((childAt instanceof ImageView) && childAt.getTag() != null && "mb_wm".equals((String) childAt.getTag())) {
                    ((ImageView) childAt).setLayoutParams(new FrameLayout.LayoutParams(view.getWidth(), view.getHeight()));
                    imageView = (ImageView) childAt;
                    break;
                }
                i9++;
            }
            if (imageView == null) {
                imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.m().c());
                imageView.setTag("mb_wm");
                ai.a(imageView, a6, view.getResources().getDisplayMetrics());
                if (imageView.getParent() == null) {
                    ((FrameLayout) view).addView(imageView, new FrameLayout.LayoutParams(view.getWidth(), view.getHeight()));
                }
            }
            this.f16427S = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.mbridge.msdk.mbnative.controller.NativeController.1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    if (imageView != null) {
                        imageView.setLayoutParams(new FrameLayout.LayoutParams(view.getWidth(), view.getHeight()));
                    }
                }
            };
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.f16427S);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public final void a(Campaign campaign, View view, List<View> list) {
        Class<MBMediaView> cls;
        try {
            a(view, (CampaignEx) campaign);
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f16440j;
            if (nativeTrackingListener != null) {
                this.f16447s.a(nativeTrackingListener);
            }
            com.mbridge.msdk.mbnative.a.c.a(campaign.getType()).a(this.l, campaign, this.f16425Q);
            final CampaignEx campaignEx = (CampaignEx) campaign;
            try {
                cls = MBMediaView.class;
                int i9 = MBMediaView.f16787a0;
            } catch (Throwable unused) {
                cls = null;
            }
            com.mbridge.msdk.foundation.same.a.b.a(this.l, campaignEx, "native");
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
            Log.e(f16408f, "sendImpression" + campaignEx);
        } catch (Exception unused2) {
            ad.b(f16408f, "registerview exception!");
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
        com.mbridge.msdk.click.a.a(this.f16441k, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().l(), false, false);
    }

    public final void a(Campaign campaign, View view) {
        try {
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f16440j;
            if (nativeTrackingListener != null) {
                this.f16447s.a(nativeTrackingListener);
            }
            com.mbridge.msdk.mbnative.a.c.a(campaign.getType()).a(this.l, campaign, this.f16425Q);
            final CampaignEx campaignEx = (CampaignEx) campaign;
            com.mbridge.msdk.foundation.same.a.b.a(this.l, campaignEx, "native");
            View.OnClickListener onClickListener = new com.mbridge.msdk.widget.a() { // from class: com.mbridge.msdk.mbnative.controller.NativeController.9
                @Override // com.mbridge.msdk.widget.a
                public final void a(View view2) {
                    NativeController.a(NativeController.this, view2.getContext(), campaignEx);
                }
            };
            try {
                int i9 = MBMediaView.f16787a0;
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
            ad.c(f16408f, "sendImpression" + campaignEx);
        } catch (Exception unused2) {
            ad.b(f16408f, "registerview exception!");
        }
    }

    private void a(CampaignEx campaignEx, View view, List<View> list) {
        O5.b bVar;
        try {
            if (this.f16441k == null || campaignEx == null) {
                bVar = null;
            } else {
                bVar = b(campaignEx);
                if (bVar != null) {
                    bVar.d(view);
                    bVar.f();
                }
            }
            O5.b bVar2 = bVar;
            k kVar = this.f16428T;
            int l = kVar != null ? kVar.l() : 0;
            if (campaignEx != null && campaignEx.getImpReportType() == 1) {
                l = 0;
            }
            final f fVar = new f(campaignEx, view, list, this, bVar2);
            if (this.f16418I == null) {
                this.f16418I = new CopyOnWriteArrayList<>();
            }
            this.f16418I.add(fVar);
            fVar.setOnStateChangeListener(new a.InterfaceC0160a() { // from class: com.mbridge.msdk.mbnative.controller.NativeController.10
                @Override // com.mbridge.msdk.foundation.same.e.a.InterfaceC0160a
                public final void a(a.b bVar3) {
                    if (bVar3 == a.b.FINISH && NativeController.this.f16418I != null && NativeController.this.f16418I.size() > 0 && NativeController.this.f16418I.contains(fVar)) {
                        NativeController.this.f16418I.remove(fVar);
                    }
                }
            });
            Handler handler = this.f16501a;
            if (handler != null) {
                handler.postDelayed(fVar, l * 1000);
            }
        } catch (Exception e4) {
            ad.b(f16408f, com.mbridge.msdk.mbnative.b.a.a(e4));
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
            for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                a(viewGroup.getChildAt(i9), onClickListener, cls);
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
            for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                a(viewGroup.getChildAt(i9), cls);
            }
        }
    }

    public final void a() {
        com.mbridge.msdk.foundation.same.e.a next;
        com.mbridge.msdk.foundation.same.e.b bVar = this.f16415F;
        if (bVar != null) {
            bVar.a();
            this.f16415F = null;
        }
        Hashtable<String, O5.b> hashtable = this.f16419J;
        if (hashtable != null) {
            for (O5.b bVar2 : hashtable.values()) {
                if (bVar2 != null) {
                    bVar2.c();
                }
            }
            this.f16419J.clear();
        }
        Handler handler = this.f16501a;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f16440j = null;
        this.f16447s.a();
        try {
            Context context = this.f16441k;
            if (context != null) {
                com.mbridge.msdk.foundation.same.c.b.a(context);
            }
            List<com.mbridge.msdk.mbnative.controller.c> list = this.f16416G;
            if (list != null && list.size() > 0) {
                Iterator<com.mbridge.msdk.mbnative.controller.c> it = this.f16416G.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
                this.f16416G.clear();
                this.f16416G = null;
            }
            List<c.a> list2 = this.f16417H;
            if (list2 != null && list2.size() > 0) {
                for (c.a aVar : this.f16417H) {
                }
                this.f16417H.clear();
                this.f16417H = null;
            }
            CopyOnWriteArrayList<com.mbridge.msdk.foundation.same.e.a> copyOnWriteArrayList = this.f16418I;
            if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
                return;
            }
            Iterator<com.mbridge.msdk.foundation.same.e.a> it2 = this.f16418I.iterator();
            if (it2.hasNext() && (next = it2.next()) != null) {
                next.cancel();
                this.f16501a.removeCallbacks(next);
            }
            this.f16418I.clear();
        } catch (Exception unused) {
        }
    }

    public final List<Campaign> a(String str, int i9, String str2) {
        int i10;
        int i11;
        List<Campaign> list = null;
        if (this.f16435c != null) {
            ArrayList arrayList = new ArrayList(this.f16435c);
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                com.mbridge.msdk.mbnative.a.b<String, List<Campaign>> a6 = com.mbridge.msdk.mbnative.a.c.a(((Integer) arrayList.get(i12)).intValue());
                if (a6 != null) {
                    if ((((Integer) arrayList.get(i12)).intValue() == 1 || ((Integer) arrayList.get(i12)).intValue() == 2) && this.f16437e.containsKey(MBridgeConstans.NATIVE_INFO)) {
                        i11 = this.f16420K;
                    } else {
                        i11 = this.f16448t;
                    }
                    list = a(((Integer) arrayList.get(i12)).intValue(), a6.b(str, i11));
                    if (list != null) {
                        break;
                    }
                }
            }
            if (list == null) {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    com.mbridge.msdk.mbnative.a.b<String, List<Campaign>> a9 = com.mbridge.msdk.mbnative.a.c.a(((Integer) arrayList.get(i13)).intValue());
                    if ((((Integer) arrayList.get(i13)).intValue() == 1 || ((Integer) arrayList.get(i13)).intValue() == 2) && this.f16437e.containsKey(MBridgeConstans.NATIVE_INFO)) {
                        i10 = this.f16420K;
                    } else {
                        i10 = this.f16448t;
                    }
                    list = a(((Integer) arrayList.get(i13)).intValue(), a9.a((com.mbridge.msdk.mbnative.a.b<String, List<Campaign>>) str, i10));
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
        O5.b b8;
        if ((!TextUtils.isEmpty(this.f16425Q) && list != null && list.size() == 0) || list == null || list.size() <= 0) {
            return false;
        }
        final com.mbridge.msdk.mbnative.d.a aVar = this.f16439i;
        if (aVar == null) {
            return true;
        }
        CampaignEx campaignEx = (CampaignEx) list.get(0);
        if (campaignEx != null && campaignEx.isActiveOm() && (b8 = b(campaignEx)) != null) {
            b8.f();
            O5.a a6 = O5.a.a(b8);
            this.ad = a6;
            a6.c();
        }
        final int template = campaignEx != null ? campaignEx.getTemplate() : 2;
        com.mbridge.msdk.foundation.db.j a9 = com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(this.f16441k));
        a9.a();
        for (int i9 = 0; i9 < list.size(); i9++) {
            CampaignEx campaignEx2 = (CampaignEx) list.get(i9);
            if (!a9.b(campaignEx2.getId())) {
                com.mbridge.msdk.foundation.entity.g gVar = new com.mbridge.msdk.foundation.entity.g();
                gVar.a(campaignEx2.getId());
                gVar.b(campaignEx2.getFca());
                gVar.c(campaignEx2.getFcb());
                gVar.a(0);
                gVar.d(0);
                gVar.a(System.currentTimeMillis());
                a9.a(gVar);
            }
        }
        if (this.O && this.f16423N) {
            if (f().h() == 3) {
                final List<Campaign> b9 = b(list);
                if (list.size() > 0) {
                    a(list, new b() { // from class: com.mbridge.msdk.mbnative.controller.NativeController.12
                        @Override // com.mbridge.msdk.mbnative.controller.NativeController.b
                        public final void a() {
                            List a10 = NativeController.a(NativeController.this, b9, true);
                            if (a10 == null || a10.size() <= 0) {
                                NativeController.this.a(aVar, "has no ads", (CampaignEx) list.get(0));
                            } else {
                                NativeController.this.a((List<Campaign>) a10, template, aVar);
                            }
                        }
                    });
                    return true;
                }
                a(aVar, "has no ads", (CampaignEx) null);
                return true;
            }
            List<Campaign> c9 = c(list);
            if (c9 != null && c9.size() > 0) {
                a(c9, new b() { // from class: com.mbridge.msdk.mbnative.controller.NativeController.13
                    @Override // com.mbridge.msdk.mbnative.controller.NativeController.b
                    public final void a() {
                        List a10 = NativeController.a(NativeController.this, list, false);
                        if (a10 == null || a10.size() <= 0) {
                            NativeController.this.a(aVar, "has no ads", (CampaignEx) null);
                        } else {
                            NativeController.this.a((List<Campaign>) a10, template, aVar);
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
    public void a(final List<Campaign> list, final int i9, final NativeListener.NativeAdListener nativeAdListener) {
        this.f16501a.post(new Runnable() { // from class: com.mbridge.msdk.mbnative.controller.NativeController.2
            @Override // java.lang.Runnable
            public final void run() {
                List list2 = list;
                if (list2 != null && list2.size() > 0) {
                    NativeController.this.f16426R = ((CampaignEx) list.get(0)).getRequestId();
                    NativeController.this.ab = list;
                }
                NativeController.this.f16453y = true;
                nativeAdListener.onAdLoaded(list, i9);
                Context context = NativeController.this.f16441k;
                List list3 = list;
                String str = NativeController.this.l;
                if (context != null && list3 != null) {
                    try {
                        if (list3.size() > 0 && !TextUtils.isEmpty(str)) {
                            StringBuffer stringBuffer = new StringBuffer("key=2000048&");
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
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final com.mbridge.msdk.mbnative.d.a aVar, final String str, final CampaignEx campaignEx) {
        this.f16501a.post(new Runnable() { // from class: com.mbridge.msdk.mbnative.controller.NativeController.3
            @Override // java.lang.Runnable
            public final void run() {
                aVar.a(campaignEx, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<Campaign> a(int i9, List<Campaign> list) {
        if (i9 != 1 || !this.f16437e.containsKey(MBridgeConstans.NATIVE_INFO) || list == null || list.size() <= 0) {
            return list;
        }
        CampaignEx campaignEx = (CampaignEx) list.get(0);
        int template = campaignEx != null ? campaignEx.getTemplate() : 1;
        if (template == 2) {
            int size = list.size();
            int i10 = this.f16433Y;
            return size >= i10 ? list.subList(0, i10) : list;
        }
        if (template != 3) {
            return list;
        }
        int size2 = list.size();
        int i11 = this.f16434Z;
        return size2 >= i11 ? list.subList(0, i11) : list;
    }

    private void a(final List<Campaign> list, final b bVar) {
        g();
        final long currentTimeMillis = System.currentTimeMillis();
        Timer timer = new Timer();
        this.f16424P = timer;
        timer.schedule(new TimerTask() { // from class: com.mbridge.msdk.mbnative.controller.NativeController.5
            @Override // java.util.TimerTask, java.lang.Runnable
            public final void run() {
                boolean z8;
                if (System.currentTimeMillis() - currentTimeMillis >= ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) {
                    bVar.a();
                    NativeController.this.g();
                    return;
                }
                int l = z.l(NativeController.this.f16441k);
                int k6 = NativeController.this.f().k();
                if (l != 9 && k6 == 2) {
                    bVar.a();
                    NativeController.this.g();
                    return;
                }
                if (k6 == 3) {
                    bVar.a();
                    NativeController.this.g();
                    return;
                }
                loop0: while (true) {
                    z8 = false;
                    for (Campaign campaign : list) {
                        String id = campaign.getId();
                        if (campaign instanceof CampaignEx) {
                            StringBuilder b8 = AbstractC2965e.b(id);
                            CampaignEx campaignEx = (CampaignEx) campaign;
                            b8.append(campaignEx.getVideoUrlEncode());
                            b8.append(campaignEx.getBidToken());
                            id = b8.toString();
                        }
                        com.mbridge.msdk.videocommon.download.a a6 = com.mbridge.msdk.videocommon.download.b.getInstance().a(NativeController.this.l, id);
                        if (a6 != null && com.mbridge.msdk.videocommon.download.j.a(a6, NativeController.this.f().p())) {
                            z8 = true;
                        }
                    }
                    break loop0;
                }
                if (z8) {
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
                            NativeController.this.f16447s.a(campaignEx, NativeController.this.f16439i);
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
                        com.mbridge.msdk.click.a aVar = nativeController.f16447s;
                        nativeController.a(campaignEx);
                        nativeController.f16439i.onAdClick(campaignEx);
                        return;
                    }
                }
            } catch (Throwable th) {
                ad.a(f16408f, th.getMessage());
            }
        }
        nativeController.f16447s.a(campaignEx, nativeController.f16439i);
        nativeController.a(campaignEx);
    }

    public static /* synthetic */ List a(NativeController nativeController, List list, boolean z8) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                Campaign campaign = (Campaign) list.get(size);
                String id = campaign.getId();
                boolean z9 = campaign instanceof CampaignEx;
                if (z9) {
                    StringBuilder b8 = AbstractC2965e.b(id);
                    CampaignEx campaignEx = (CampaignEx) campaign;
                    b8.append(campaignEx.getVideoUrlEncode());
                    b8.append(campaignEx.getBidToken());
                    id = b8.toString();
                }
                com.mbridge.msdk.videocommon.download.a a6 = com.mbridge.msdk.videocommon.download.b.getInstance().a(nativeController.l, id);
                if (z8) {
                    if (a6 == null || !com.mbridge.msdk.videocommon.download.j.a(a6, nativeController.f().p())) {
                        com.mbridge.msdk.mbnative.a.c.a(campaign.getType()).a(nativeController.l, (Campaign) list.remove(size), nativeController.f16425Q);
                    }
                } else if (z9) {
                    CampaignEx campaignEx2 = (CampaignEx) campaign;
                    if (TextUtils.isEmpty(campaignEx2.getImageUrl()) && !TextUtils.isEmpty(campaignEx2.getVideoUrlEncode()) && (a6 == null || !com.mbridge.msdk.videocommon.download.j.a(a6, nativeController.f().p()))) {
                        com.mbridge.msdk.mbnative.a.c.a(campaign.getType()).a(nativeController.l, (Campaign) list.remove(size), nativeController.f16425Q);
                    }
                }
            }
        }
        return list;
    }

    public static /* synthetic */ void a(NativeController nativeController, final CampaignEx campaignEx, View view, List list, O5.b bVar) {
        try {
            c.a aVar = new c.a() { // from class: com.mbridge.msdk.mbnative.controller.NativeController.11
                @Override // com.mbridge.msdk.mbnative.controller.c.a
                public final void a(ArrayList<View> arrayList, ArrayList<View> arrayList2) {
                    if (arrayList != null && arrayList.size() > 0) {
                        com.mbridge.msdk.mbnative.e.b.a(campaignEx, NativeController.this.f16441k, NativeController.this.l, NativeController.this.f16439i);
                    }
                }
            };
            com.mbridge.msdk.mbnative.controller.c cVar = new com.mbridge.msdk.mbnative.controller.c(list, aVar, new Handler(Looper.getMainLooper()), campaignEx.getImpReportType());
            cVar.a(view);
            List<com.mbridge.msdk.mbnative.controller.c> list2 = nativeController.f16416G;
            if (list2 != null) {
                list2.add(cVar);
            }
            List<c.a> list3 = nativeController.f16417H;
            if (list3 != null) {
                list3.add(aVar);
            }
            O5.a aVar2 = nativeController.ad;
            if (aVar2 != null) {
                aVar2.b();
            }
        } catch (Exception unused) {
        }
    }
}

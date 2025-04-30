package com.mbridge.msdk.click;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.click.m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.e.a;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ah;
import java.util.concurrent.Semaphore;

/* loaded from: classes3.dex */
public final class n extends e implements a.InterfaceC0160a {

    /* renamed from: a, reason: collision with root package name */
    private f f14874a;
    private JumpLoaderResult b;

    /* renamed from: d, reason: collision with root package name */
    private boolean f14876d;

    /* renamed from: e, reason: collision with root package name */
    private Context f14877e;

    /* renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.e.b f14878f;

    /* renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.click.entity.a f14879g;

    /* renamed from: c, reason: collision with root package name */
    private boolean f14875c = true;

    /* renamed from: h, reason: collision with root package name */
    private Handler f14880h = new Handler(Looper.getMainLooper());

    public n(Context context) {
        this.f14877e = context;
        this.f14878f = new com.mbridge.msdk.foundation.same.e.b(context, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(String str, f fVar, boolean z8, String str2, String str3, CampaignEx campaignEx, boolean z9, boolean z10, int i9) {
        a aVar;
        this.f14874a = fVar;
        this.f14876d = z8;
        com.mbridge.msdk.click.entity.b bVar = new com.mbridge.msdk.click.entity.b();
        bVar.a(this.f14877e);
        bVar.a(str);
        bVar.c(z8);
        bVar.b(str2);
        bVar.c(str3);
        bVar.a(campaignEx);
        bVar.a(z9);
        bVar.b(z10);
        bVar.a(i9);
        if (str.startsWith("tcp")) {
            k kVar = new k(bVar);
            kVar.a(this.f14874a);
            kVar.a(new j() { // from class: com.mbridge.msdk.click.n.1
                @Override // com.mbridge.msdk.click.j
                public final void a(JumpLoaderResult jumpLoaderResult) {
                    n.this.b = jumpLoaderResult;
                }
            });
            aVar = kVar;
        } else {
            aVar = new a(this.f14877e, str, str2, str3, campaignEx, z9, z10, i9);
        }
        this.f14878f.a(aVar, this);
    }

    @Override // com.mbridge.msdk.click.e
    public final void a() {
        this.f14875c = false;
    }

    @Override // com.mbridge.msdk.foundation.same.e.a.InterfaceC0160a
    public final void a(a.b bVar) {
        if (bVar == a.b.FINISH && this.f14875c) {
            this.f14880h.post(new Runnable() { // from class: com.mbridge.msdk.click.n.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (n.this.f14874a != null) {
                        if (n.this.b.isSuccess()) {
                            n.this.f14874a.b(n.this.b);
                        } else {
                            n.this.f14874a.a(n.this.b, n.this.b.getMsg());
                        }
                    }
                }
            });
        }
    }

    /* loaded from: classes3.dex */
    public class a extends com.mbridge.msdk.foundation.same.e.a {

        /* renamed from: c, reason: collision with root package name */
        private final Context f14884c;

        /* renamed from: d, reason: collision with root package name */
        private String f14885d;

        /* renamed from: e, reason: collision with root package name */
        private String f14886e;

        /* renamed from: f, reason: collision with root package name */
        private String f14887f;

        /* renamed from: g, reason: collision with root package name */
        private CampaignEx f14888g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f14889h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f14890i;

        /* renamed from: j, reason: collision with root package name */
        private int f14891j;
        private final Semaphore b = new Semaphore(0);

        /* renamed from: k, reason: collision with root package name */
        private m.a f14892k = new m.a() { // from class: com.mbridge.msdk.click.n.a.1
            @Override // com.mbridge.msdk.click.m.a
            public final boolean a(String str) {
                boolean a6 = a.a(a.this, str);
                if (a6) {
                    a();
                }
                return a6;
            }

            @Override // com.mbridge.msdk.click.m.a
            public final boolean b(String str) {
                boolean a6 = a.a(a.this, str);
                if (a6) {
                    a();
                }
                return a6;
            }

            @Override // com.mbridge.msdk.click.m.a
            public final boolean c(String str) {
                return false;
            }

            @Override // com.mbridge.msdk.click.m.a
            public final void a(String str, boolean z8, String str2) {
                a.a(a.this, str);
                n.this.b.setContent(str2);
                a();
            }

            @Override // com.mbridge.msdk.click.m.a
            public final void a(int i9, String str, String str2, String str3) {
                if (!TextUtils.isEmpty(str2)) {
                    n.this.b.setExceptionMsg(str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    n.this.b.setContent(str3);
                }
                a.a(a.this, str);
                a();
            }

            private void a() {
                synchronized (n.this) {
                    n.this.b.setSuccess(true);
                    a.a(a.this);
                }
            }
        };

        public a(Context context, String str, String str2, String str3, CampaignEx campaignEx, boolean z8, boolean z9, int i9) {
            this.f14884c = context;
            this.f14885d = str;
            this.f14886e = str2;
            this.f14887f = str3;
            this.f14888g = campaignEx;
            this.f14889h = z8;
            this.f14890i = z9;
            this.f14891j = i9;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x01c6 A[EDGE_INSN: B:85:0x01c6->B:34:0x01c6 BREAK  A[LOOP:0: B:16:0x004f->B:58:0x01bf], SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private com.mbridge.msdk.click.entity.JumpLoaderResult a(java.lang.String r16, boolean r17, boolean r18, com.mbridge.msdk.foundation.entity.CampaignEx r19, int r20) {
            /*
                Method dump skipped, instructions count: 455
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.n.a.a(java.lang.String, boolean, boolean, com.mbridge.msdk.foundation.entity.CampaignEx, int):com.mbridge.msdk.click.entity.JumpLoaderResult");
        }

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void cancelTask() {
        }

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void pauseTask(boolean z8) {
        }

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void runTask() {
            if (n.this.f14874a != null) {
                n.this.f14874a.a(null);
            }
            n.this.b = new JumpLoaderResult();
            n.this.b.setUrl(this.f14885d);
            n.this.b = a(this.f14885d, this.f14889h, this.f14890i, this.f14888g, this.f14891j);
            if (!TextUtils.isEmpty(n.this.b.getExceptionMsg())) {
                n.this.b.setSuccess(true);
            }
            if (!n.this.f14875c || !n.this.b.isSuccess()) {
                return;
            }
            if (n.this.f14879g != null) {
                n.this.b.setStatusCode(n.this.f14879g.f14814f);
            }
            CampaignEx campaignEx = this.f14888g;
            JumpLoaderResult jumpLoaderResult = n.this.b;
            com.mbridge.msdk.click.entity.a aVar = n.this.f14879g;
            String str = this.f14886e;
            String str2 = this.f14887f;
            Context context = this.f14884c;
            m.a aVar2 = this.f14892k;
            Semaphore semaphore = this.b;
            if (!ah.a.b(jumpLoaderResult.getUrl()) && 200 == aVar.f14814f && !TextUtils.isEmpty(jumpLoaderResult.getContent()) && !jumpLoaderResult.getContent().contains("EXCEPTION_CAMPAIGN_NOT_ACTIVE")) {
                jumpLoaderResult.setType(2);
                if (!TextUtils.isEmpty(jumpLoaderResult.getContent())) {
                    new m().a(str, str2, context, jumpLoaderResult.getUrl(), jumpLoaderResult.getContent(), aVar2);
                } else {
                    try {
                        new m().a(str, str2, context, jumpLoaderResult.getUrl(), aVar2);
                    } catch (Exception e4) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("WebViewSpiderLoaderDiff", e4.getMessage());
                        }
                    }
                }
                semaphore.acquireUninterruptibly();
                return;
            }
            if (aVar != null) {
                jumpLoaderResult.setType(1);
                jumpLoaderResult.setExceptionMsg(aVar.f14816h);
                jumpLoaderResult.setStatusCode(aVar.f14814f);
                jumpLoaderResult.setHeader(aVar.a());
                jumpLoaderResult.setContent(aVar.f14815g);
            }
            o.a(jumpLoaderResult.getUrl(), campaignEx, jumpLoaderResult);
        }

        private boolean a(String str) {
            return !URLUtil.isNetworkUrl(str);
        }

        public static /* synthetic */ boolean a(a aVar, String str) {
            return o.a(str, aVar.f14888g, n.this.b);
        }

        public static /* synthetic */ void a(a aVar) {
            aVar.b.release();
        }
    }
}

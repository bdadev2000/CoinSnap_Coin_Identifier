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

/* loaded from: classes4.dex */
public final class n extends e implements a.InterfaceC0172a {
    private f a;

    /* renamed from: b, reason: collision with root package name */
    private JumpLoaderResult f12582b;

    /* renamed from: d, reason: collision with root package name */
    private boolean f12584d;

    /* renamed from: e, reason: collision with root package name */
    private Context f12585e;

    /* renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.e.b f12586f;

    /* renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.click.entity.a f12587g;

    /* renamed from: c, reason: collision with root package name */
    private boolean f12583c = true;

    /* renamed from: h, reason: collision with root package name */
    private Handler f12588h = new Handler(Looper.getMainLooper());

    public n(Context context) {
        this.f12585e = context;
        this.f12586f = new com.mbridge.msdk.foundation.same.e.b(context, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(String str, f fVar, boolean z10, String str2, String str3, CampaignEx campaignEx, boolean z11, boolean z12, int i10) {
        a aVar;
        this.a = fVar;
        this.f12584d = z10;
        com.mbridge.msdk.click.entity.b bVar = new com.mbridge.msdk.click.entity.b();
        bVar.a(this.f12585e);
        bVar.a(str);
        bVar.c(z10);
        bVar.b(str2);
        bVar.c(str3);
        bVar.a(campaignEx);
        bVar.a(z11);
        bVar.b(z12);
        bVar.a(i10);
        if (str.startsWith("tcp")) {
            k kVar = new k(bVar);
            kVar.a(this.a);
            kVar.a(new j() { // from class: com.mbridge.msdk.click.n.1
                @Override // com.mbridge.msdk.click.j
                public final void a(JumpLoaderResult jumpLoaderResult) {
                    n.this.f12582b = jumpLoaderResult;
                }
            });
            aVar = kVar;
        } else {
            aVar = new a(this.f12585e, str, str2, str3, campaignEx, z11, z12, i10);
        }
        this.f12586f.a(aVar, this);
    }

    @Override // com.mbridge.msdk.click.e
    public final void a() {
        this.f12583c = false;
    }

    @Override // com.mbridge.msdk.foundation.same.e.a.InterfaceC0172a
    public final void a(a.b bVar) {
        if (bVar == a.b.FINISH && this.f12583c) {
            this.f12588h.post(new Runnable() { // from class: com.mbridge.msdk.click.n.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (n.this.a != null) {
                        if (n.this.f12582b.isSuccess()) {
                            n.this.a.b(n.this.f12582b);
                        } else {
                            n.this.a.a(n.this.f12582b, n.this.f12582b.getMsg());
                        }
                    }
                }
            });
        }
    }

    /* loaded from: classes4.dex */
    public class a extends com.mbridge.msdk.foundation.same.e.a {

        /* renamed from: c, reason: collision with root package name */
        private final Context f12590c;

        /* renamed from: d, reason: collision with root package name */
        private String f12591d;

        /* renamed from: e, reason: collision with root package name */
        private String f12592e;

        /* renamed from: f, reason: collision with root package name */
        private String f12593f;

        /* renamed from: g, reason: collision with root package name */
        private CampaignEx f12594g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f12595h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f12596i;

        /* renamed from: j, reason: collision with root package name */
        private int f12597j;

        /* renamed from: b, reason: collision with root package name */
        private final Semaphore f12589b = new Semaphore(0);

        /* renamed from: k, reason: collision with root package name */
        private m.a f12598k = new m.a() { // from class: com.mbridge.msdk.click.n.a.1
            @Override // com.mbridge.msdk.click.m.a
            public final boolean a(String str) {
                boolean a = a.a(a.this, str);
                if (a) {
                    a();
                }
                return a;
            }

            @Override // com.mbridge.msdk.click.m.a
            public final boolean b(String str) {
                boolean a = a.a(a.this, str);
                if (a) {
                    a();
                }
                return a;
            }

            @Override // com.mbridge.msdk.click.m.a
            public final boolean c(String str) {
                return false;
            }

            @Override // com.mbridge.msdk.click.m.a
            public final void a(String str, boolean z10, String str2) {
                a.a(a.this, str);
                n.this.f12582b.setContent(str2);
                a();
            }

            @Override // com.mbridge.msdk.click.m.a
            public final void a(int i10, String str, String str2, String str3) {
                if (!TextUtils.isEmpty(str2)) {
                    n.this.f12582b.setExceptionMsg(str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    n.this.f12582b.setContent(str3);
                }
                a.a(a.this, str);
                a();
            }

            private void a() {
                synchronized (n.this) {
                    n.this.f12582b.setSuccess(true);
                    a.a(a.this);
                }
            }
        };

        public a(Context context, String str, String str2, String str3, CampaignEx campaignEx, boolean z10, boolean z11, int i10) {
            this.f12590c = context;
            this.f12591d = str;
            this.f12592e = str2;
            this.f12593f = str3;
            this.f12594g = campaignEx;
            this.f12595h = z10;
            this.f12596i = z11;
            this.f12597j = i10;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x01e0 A[EDGE_INSN: B:91:0x01e0->B:56:0x01e0 BREAK  A[LOOP:0: B:16:0x004f->B:51:0x0187], SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private com.mbridge.msdk.click.entity.JumpLoaderResult a(java.lang.String r16, boolean r17, boolean r18, com.mbridge.msdk.foundation.entity.CampaignEx r19, int r20) {
            /*
                Method dump skipped, instructions count: 481
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.n.a.a(java.lang.String, boolean, boolean, com.mbridge.msdk.foundation.entity.CampaignEx, int):com.mbridge.msdk.click.entity.JumpLoaderResult");
        }

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void cancelTask() {
        }

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void pauseTask(boolean z10) {
        }

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void runTask() {
            if (n.this.a != null) {
                n.this.a.a(null);
            }
            n.this.f12582b = new JumpLoaderResult();
            n.this.f12582b.setUrl(this.f12591d);
            n.this.f12582b = a(this.f12591d, this.f12595h, this.f12596i, this.f12594g, this.f12597j);
            if (!TextUtils.isEmpty(n.this.f12582b.getExceptionMsg())) {
                n.this.f12582b.setSuccess(true);
            }
            if (!n.this.f12583c || !n.this.f12582b.isSuccess()) {
                return;
            }
            if (n.this.f12587g != null) {
                n.this.f12582b.setStatusCode(n.this.f12587g.f12522f);
            }
            CampaignEx campaignEx = this.f12594g;
            JumpLoaderResult jumpLoaderResult = n.this.f12582b;
            com.mbridge.msdk.click.entity.a aVar = n.this.f12587g;
            String str = this.f12592e;
            String str2 = this.f12593f;
            Context context = this.f12590c;
            m.a aVar2 = this.f12598k;
            Semaphore semaphore = this.f12589b;
            if (!ah.a.b(jumpLoaderResult.getUrl()) && 200 == aVar.f12522f && !TextUtils.isEmpty(jumpLoaderResult.getContent()) && !jumpLoaderResult.getContent().contains("EXCEPTION_CAMPAIGN_NOT_ACTIVE")) {
                jumpLoaderResult.setType(2);
                if (!TextUtils.isEmpty(jumpLoaderResult.getContent())) {
                    new m().a(str, str2, context, jumpLoaderResult.getUrl(), jumpLoaderResult.getContent(), aVar2);
                } else {
                    try {
                        new m().a(str, str2, context, jumpLoaderResult.getUrl(), aVar2);
                    } catch (Exception e2) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("WebViewSpiderLoaderDiff", e2.getMessage());
                        }
                    }
                }
                semaphore.acquireUninterruptibly();
                return;
            }
            if (aVar != null) {
                jumpLoaderResult.setType(1);
                jumpLoaderResult.setExceptionMsg(aVar.f12524h);
                jumpLoaderResult.setStatusCode(aVar.f12522f);
                jumpLoaderResult.setHeader(aVar.a());
                jumpLoaderResult.setContent(aVar.f12523g);
            }
            o.a(jumpLoaderResult.getUrl(), campaignEx, jumpLoaderResult);
        }

        private boolean a(String str) {
            return !URLUtil.isNetworkUrl(str);
        }

        public static /* synthetic */ boolean a(a aVar, String str) {
            return o.a(str, aVar.f12594g, n.this.f12582b);
        }

        public static /* synthetic */ void a(a aVar) {
            aVar.f12589b.release();
        }
    }
}

package com.mbridge.msdk.click;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.click.m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.e.a;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ah;
import java.util.concurrent.Semaphore;

/* loaded from: classes4.dex */
public final class k extends com.mbridge.msdk.foundation.same.e.a {

    /* renamed from: b, reason: collision with root package name */
    private Context f12541b;

    /* renamed from: c, reason: collision with root package name */
    private String f12542c;

    /* renamed from: d, reason: collision with root package name */
    private String f12543d;

    /* renamed from: e, reason: collision with root package name */
    private String f12544e;

    /* renamed from: f, reason: collision with root package name */
    private CampaignEx f12545f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f12546g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f12547h;

    /* renamed from: i, reason: collision with root package name */
    private int f12548i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f12549j;

    /* renamed from: k, reason: collision with root package name */
    private com.mbridge.msdk.click.entity.a f12550k;

    /* renamed from: l, reason: collision with root package name */
    private JumpLoaderResult f12551l;

    /* renamed from: m, reason: collision with root package name */
    private f f12552m;

    /* renamed from: n, reason: collision with root package name */
    private j f12553n;
    private final Semaphore a = new Semaphore(0);

    /* renamed from: o, reason: collision with root package name */
    private final m.a f12554o = new m.a() { // from class: com.mbridge.msdk.click.k.1
        @Override // com.mbridge.msdk.click.m.a
        public final boolean a(String str) {
            boolean a = k.a(k.this, str);
            if (a) {
                a();
            }
            return a;
        }

        @Override // com.mbridge.msdk.click.m.a
        public final boolean b(String str) {
            boolean a = k.a(k.this, str);
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
            k.a(k.this, str);
            k.this.f12551l.setContent(str2);
            a();
        }

        private void a() {
            synchronized (this) {
                k.this.f12551l.setSuccess(true);
                if (k.this.f12553n != null) {
                    k.this.f12553n.a(k.this.f12551l);
                }
                k.c(k.this);
            }
        }

        @Override // com.mbridge.msdk.click.m.a
        public final void a(int i10, String str, String str2, String str3) {
            if (!TextUtils.isEmpty(str2)) {
                k.this.f12551l.setExceptionMsg(str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                k.this.f12551l.setContent(str3);
            }
            k.a(k.this, str);
            a();
        }
    };

    public k(com.mbridge.msdk.click.entity.b bVar) {
        this.f12541b = bVar.a();
        this.f12542c = bVar.b();
        this.f12543d = bVar.c();
        this.f12544e = bVar.d();
        this.f12545f = bVar.e();
        this.f12546g = bVar.f();
        this.f12547h = bVar.g();
        this.f12548i = bVar.i();
        this.f12549j = bVar.h();
    }

    public static /* synthetic */ void c(k kVar) {
        kVar.a.release();
    }

    @Override // com.mbridge.msdk.foundation.same.e.a
    public final void cancelTask() {
    }

    @Override // com.mbridge.msdk.foundation.same.e.a
    public final void pauseTask(boolean z10) {
    }

    @Override // com.mbridge.msdk.foundation.same.e.a
    public final void runTask() {
        f fVar = this.f12552m;
        if (fVar != null) {
            fVar.a(null);
        }
        JumpLoaderResult jumpLoaderResult = new JumpLoaderResult();
        this.f12551l = jumpLoaderResult;
        jumpLoaderResult.setUrl(this.f12542c);
        JumpLoaderResult a = a(this.f12542c);
        this.f12551l = a;
        if (a != null && !TextUtils.isEmpty(a.getExceptionMsg())) {
            this.f12551l.setSuccess(true);
        }
        if (this.mState != a.b.RUNNING) {
            j jVar = this.f12553n;
            if (jVar != null) {
                jVar.a(this.f12551l);
                return;
            }
            return;
        }
        if (!this.f12551l.isSuccess()) {
            j jVar2 = this.f12553n;
            if (jVar2 != null) {
                jVar2.a(this.f12551l);
                return;
            }
            return;
        }
        com.mbridge.msdk.click.entity.a aVar = this.f12550k;
        if (aVar != null) {
            this.f12551l.setStatusCode(aVar.f12522f);
        }
        JumpLoaderResult jumpLoaderResult2 = this.f12551l;
        com.mbridge.msdk.click.entity.a aVar2 = this.f12550k;
        String str = this.f12543d;
        String str2 = this.f12544e;
        Context context = this.f12541b;
        m.a aVar3 = this.f12554o;
        j jVar3 = this.f12553n;
        Semaphore semaphore = this.a;
        if (!ah.a.b(jumpLoaderResult2.getUrl()) && 200 == aVar2.f12522f && !TextUtils.isEmpty(jumpLoaderResult2.getContent()) && !jumpLoaderResult2.getContent().contains("EXCEPTION_CAMPAIGN_NOT_ACTIVE")) {
            jumpLoaderResult2.setType(2);
            if (!TextUtils.isEmpty(jumpLoaderResult2.getContent())) {
                new m().a(str, str2, context, jumpLoaderResult2.getUrl(), jumpLoaderResult2.getContent(), aVar3);
            } else {
                try {
                    new m().a(str, str2, context, jumpLoaderResult2.getUrl(), aVar3);
                } catch (Exception unused) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("TAG", "webview spider start error");
                    }
                }
            }
            semaphore.acquireUninterruptibly();
            return;
        }
        if (aVar2 != null) {
            jumpLoaderResult2.setType(1);
            jumpLoaderResult2.setExceptionMsg(aVar2.f12524h);
            jumpLoaderResult2.setStatusCode(aVar2.f12522f);
            jumpLoaderResult2.setHeader(aVar2.a());
            jumpLoaderResult2.setContent(aVar2.f12523g);
        }
        String url = jumpLoaderResult2.getUrl();
        if (ah.a.b(url)) {
            jumpLoaderResult2.setCode(1);
            jumpLoaderResult2.setUrl(url);
            jumpLoaderResult2.setjumpDone(true);
        } else {
            jumpLoaderResult2.setCode(2);
            jumpLoaderResult2.setUrl(url);
        }
        if (jVar3 != null) {
            jVar3.a(jumpLoaderResult2);
        }
    }

    private String b(String str) {
        if (this.f12549j) {
            String a = com.mbridge.msdk.c.b.a(this.f12541b, str);
            if (!TextUtils.isEmpty(a)) {
                str = eb.j.k(str, a);
            }
        }
        com.mbridge.msdk.e.b.a();
        return str;
    }

    public final void a(f fVar) {
        this.f12552m = fVar;
    }

    public final void a(j jVar) {
        this.f12553n = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0169 A[EDGE_INSN: B:72:0x0169->B:34:0x0169 BREAK  A[LOOP:0: B:11:0x003c->B:53:0x0161], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.mbridge.msdk.click.entity.JumpLoaderResult a(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.k.a(java.lang.String):com.mbridge.msdk.click.entity.JumpLoaderResult");
    }

    public static /* synthetic */ boolean a(k kVar, String str) {
        CampaignEx campaignEx = kVar.f12545f;
        JumpLoaderResult jumpLoaderResult = kVar.f12551l;
        if (ah.a.b(jumpLoaderResult.getUrl())) {
            jumpLoaderResult.setCode(1);
            jumpLoaderResult.setUrl(str);
            jumpLoaderResult.setjumpDone(true);
            return true;
        }
        jumpLoaderResult.setCode(2);
        jumpLoaderResult.setUrl(str);
        return false;
    }
}

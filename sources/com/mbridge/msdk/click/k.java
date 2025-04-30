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

/* loaded from: classes3.dex */
public final class k extends com.mbridge.msdk.foundation.same.e.a {
    private Context b;

    /* renamed from: c, reason: collision with root package name */
    private String f14834c;

    /* renamed from: d, reason: collision with root package name */
    private String f14835d;

    /* renamed from: e, reason: collision with root package name */
    private String f14836e;

    /* renamed from: f, reason: collision with root package name */
    private CampaignEx f14837f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f14838g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f14839h;

    /* renamed from: i, reason: collision with root package name */
    private int f14840i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f14841j;

    /* renamed from: k, reason: collision with root package name */
    private com.mbridge.msdk.click.entity.a f14842k;
    private JumpLoaderResult l;
    private f m;

    /* renamed from: n, reason: collision with root package name */
    private j f14843n;

    /* renamed from: a, reason: collision with root package name */
    private final Semaphore f14833a = new Semaphore(0);

    /* renamed from: o, reason: collision with root package name */
    private final m.a f14844o = new m.a() { // from class: com.mbridge.msdk.click.k.1
        @Override // com.mbridge.msdk.click.m.a
        public final boolean a(String str) {
            boolean a6 = k.a(k.this, str);
            if (a6) {
                a();
            }
            return a6;
        }

        @Override // com.mbridge.msdk.click.m.a
        public final boolean b(String str) {
            boolean a6 = k.a(k.this, str);
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
            k.a(k.this, str);
            k.this.l.setContent(str2);
            a();
        }

        private void a() {
            synchronized (this) {
                try {
                    k.this.l.setSuccess(true);
                    if (k.this.f14843n != null) {
                        k.this.f14843n.a(k.this.l);
                    }
                    k.c(k.this);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.mbridge.msdk.click.m.a
        public final void a(int i9, String str, String str2, String str3) {
            if (!TextUtils.isEmpty(str2)) {
                k.this.l.setExceptionMsg(str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                k.this.l.setContent(str3);
            }
            k.a(k.this, str);
            a();
        }
    };

    public k(com.mbridge.msdk.click.entity.b bVar) {
        this.b = bVar.a();
        this.f14834c = bVar.b();
        this.f14835d = bVar.c();
        this.f14836e = bVar.d();
        this.f14837f = bVar.e();
        this.f14838g = bVar.f();
        this.f14839h = bVar.g();
        this.f14840i = bVar.i();
        this.f14841j = bVar.h();
    }

    public static /* synthetic */ void c(k kVar) {
        kVar.f14833a.release();
    }

    @Override // com.mbridge.msdk.foundation.same.e.a
    public final void cancelTask() {
    }

    @Override // com.mbridge.msdk.foundation.same.e.a
    public final void pauseTask(boolean z8) {
    }

    @Override // com.mbridge.msdk.foundation.same.e.a
    public final void runTask() {
        f fVar = this.m;
        if (fVar != null) {
            fVar.a(null);
        }
        JumpLoaderResult jumpLoaderResult = new JumpLoaderResult();
        this.l = jumpLoaderResult;
        jumpLoaderResult.setUrl(this.f14834c);
        JumpLoaderResult a6 = a(this.f14834c);
        this.l = a6;
        if (a6 != null && !TextUtils.isEmpty(a6.getExceptionMsg())) {
            this.l.setSuccess(true);
        }
        if (this.mState != a.b.RUNNING) {
            j jVar = this.f14843n;
            if (jVar != null) {
                jVar.a(this.l);
                return;
            }
            return;
        }
        if (!this.l.isSuccess()) {
            j jVar2 = this.f14843n;
            if (jVar2 != null) {
                jVar2.a(this.l);
                return;
            }
            return;
        }
        com.mbridge.msdk.click.entity.a aVar = this.f14842k;
        if (aVar != null) {
            this.l.setStatusCode(aVar.f14814f);
        }
        JumpLoaderResult jumpLoaderResult2 = this.l;
        com.mbridge.msdk.click.entity.a aVar2 = this.f14842k;
        String str = this.f14835d;
        String str2 = this.f14836e;
        Context context = this.b;
        m.a aVar3 = this.f14844o;
        j jVar3 = this.f14843n;
        Semaphore semaphore = this.f14833a;
        if (!ah.a.b(jumpLoaderResult2.getUrl()) && 200 == aVar2.f14814f && !TextUtils.isEmpty(jumpLoaderResult2.getContent()) && !jumpLoaderResult2.getContent().contains("EXCEPTION_CAMPAIGN_NOT_ACTIVE")) {
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
            jumpLoaderResult2.setExceptionMsg(aVar2.f14816h);
            jumpLoaderResult2.setStatusCode(aVar2.f14814f);
            jumpLoaderResult2.setHeader(aVar2.a());
            jumpLoaderResult2.setContent(aVar2.f14815g);
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
        if (this.f14841j) {
            String a6 = com.mbridge.msdk.c.b.a(this.b, str);
            if (!TextUtils.isEmpty(a6)) {
                str = com.mbridge.msdk.foundation.entity.o.j(str, a6);
            }
        }
        com.mbridge.msdk.e.b.a();
        return str;
    }

    public final void a(f fVar) {
        this.m = fVar;
    }

    public final void a(j jVar) {
        this.f14843n = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0158 A[EDGE_INSN: B:72:0x0158->B:34:0x0158 BREAK  A[LOOP:0: B:11:0x003d->B:53:0x0150], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.mbridge.msdk.click.entity.JumpLoaderResult a(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.k.a(java.lang.String):com.mbridge.msdk.click.entity.JumpLoaderResult");
    }

    public static /* synthetic */ boolean a(k kVar, String str) {
        CampaignEx campaignEx = kVar.f14837f;
        JumpLoaderResult jumpLoaderResult = kVar.l;
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

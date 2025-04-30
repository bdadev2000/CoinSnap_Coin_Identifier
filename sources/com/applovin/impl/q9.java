package com.applovin.impl;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.impl.bq;
import com.applovin.impl.t4;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class q9 extends s9 {

    /* renamed from: l0, reason: collision with root package name */
    private final bq f10217l0;

    /* renamed from: m0, reason: collision with root package name */
    private final Set f10218m0;

    /* loaded from: classes.dex */
    public class a implements t4.b {
        public a() {
        }

        @Override // com.applovin.impl.t4.b
        public void a() {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(q9.this.f10595c0 - (q9.this.f10581N.getDuration() - q9.this.f10581N.getCurrentPosition()));
            int E8 = q9.this.E();
            HashSet hashSet = new HashSet();
            Iterator it = new HashSet(q9.this.f10218m0).iterator();
            while (it.hasNext()) {
                lq lqVar = (lq) it.next();
                if (lqVar.a(seconds, E8)) {
                    hashSet.add(lqVar);
                    q9.this.f10218m0.remove(lqVar);
                }
            }
            q9.this.a(hashSet);
            if (E8 >= 25 && E8 < 50) {
                q9.this.f10217l0.getAdEventTracker().x();
                return;
            }
            if (E8 >= 50 && E8 < 75) {
                q9.this.f10217l0.getAdEventTracker().y();
            } else if (E8 >= 75) {
                q9.this.f10217l0.getAdEventTracker().C();
            }
        }

        @Override // com.applovin.impl.t4.b
        public boolean b() {
            return !q9.this.f10597e0;
        }
    }

    public q9(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        HashSet hashSet = new HashSet();
        this.f10218m0 = hashSet;
        bq bqVar = (bq) bVar;
        this.f10217l0 = bqVar;
        bq.d dVar = bq.d.VIDEO;
        hashSet.addAll(bqVar.a(dVar, mq.f9229a));
        a(bq.d.IMPRESSION);
        a(dVar, "creativeView");
        bqVar.getAdEventTracker().g();
    }

    private void b0() {
        if (I() && !this.f10218m0.isEmpty()) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f9298c.k("AppLovinFullscreenActivity", "Firing " + this.f10218m0.size() + " un-fired video progress trackers when video was completed.");
            }
            a(this.f10218m0);
        }
    }

    @Override // com.applovin.impl.s9, com.applovin.impl.n9
    public void A() {
        a((ViewGroup) null);
    }

    @Override // com.applovin.impl.s9
    public void F() {
        a(bq.d.VIDEO, "skip");
        this.f10217l0.getAdEventTracker().B();
        super.F();
    }

    @Override // com.applovin.impl.s9
    public void G() {
        super.G();
        bq bqVar = this.f10217l0;
        if (bqVar != null) {
            bqVar.getAdEventTracker().i();
        }
    }

    @Override // com.applovin.impl.s9
    public void Q() {
        long V8;
        int p2;
        long j7 = 0;
        if (this.f10217l0.U() >= 0 || this.f10217l0.V() >= 0) {
            if (this.f10217l0.U() >= 0) {
                V8 = this.f10217l0.U();
            } else {
                bq bqVar = this.f10217l0;
                oq o12 = bqVar.o1();
                if (o12 != null && o12.c() > 0) {
                    j7 = TimeUnit.SECONDS.toMillis(o12.c());
                } else {
                    long j9 = this.f10595c0;
                    if (j9 > 0) {
                        j7 = j9;
                    }
                }
                if (bqVar.T0() && (p2 = (int) bqVar.p()) > 0) {
                    j7 += TimeUnit.SECONDS.toMillis(p2);
                }
                V8 = (long) ((this.f10217l0.V() / 100.0d) * j7);
            }
            b(V8);
        }
    }

    @Override // com.applovin.impl.s9
    public void W() {
        super.W();
        bq bqVar = this.f10217l0;
        if (bqVar != null) {
            bqVar.getAdEventTracker().j();
        }
    }

    @Override // com.applovin.impl.s9
    public void X() {
        b0();
        if (nq.a(this.f10217l0)) {
            if (!this.f10597e0) {
                a(bq.d.COMPANION, "creativeView");
                this.f10217l0.getAdEventTracker().w();
                super.X();
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.f9298c.a("AppLovinFullscreenActivity", "VAST ad does not have valid companion ad - dismissing...");
        }
        f();
    }

    @Override // com.applovin.impl.s9
    public void a0() {
        String str;
        super.a0();
        bq.d dVar = bq.d.VIDEO;
        if (this.f10594b0) {
            str = CampaignEx.JSON_NATIVE_VIDEO_MUTE;
        } else {
            str = CampaignEx.JSON_NATIVE_VIDEO_UNMUTE;
        }
        a(dVar, str);
        this.f10217l0.getAdEventTracker().b(this.f10594b0);
    }

    @Override // com.applovin.impl.s9
    public void c(long j7) {
        super.c(j7);
        this.f10217l0.getAdEventTracker().b((float) TimeUnit.MILLISECONDS.toSeconds(j7), zp.e(this.b));
    }

    @Override // com.applovin.impl.s9
    public void d(String str) {
        a(bq.d.ERROR, gq.MEDIA_FILE_ERROR);
        this.f10217l0.getAdEventTracker().b(str);
        super.d(str);
    }

    @Override // com.applovin.impl.s9, com.applovin.impl.n9
    public void f() {
        if (this.f10217l0 != null) {
            a(bq.d.VIDEO, "close");
            a(bq.d.COMPANION, "close");
        }
        super.f();
    }

    @Override // com.applovin.impl.n9
    public void w() {
        bq.d dVar;
        super.w();
        if (this.f10597e0) {
            dVar = bq.d.COMPANION;
        } else {
            dVar = bq.d.VIDEO;
        }
        a(dVar, CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
        this.f10217l0.getAdEventTracker().z();
    }

    @Override // com.applovin.impl.n9
    public void x() {
        bq.d dVar;
        super.x();
        if (this.f10597e0) {
            dVar = bq.d.COMPANION;
        } else {
            dVar = bq.d.VIDEO;
        }
        a(dVar, CampaignEx.JSON_NATIVE_VIDEO_RESUME);
        this.f10217l0.getAdEventTracker().A();
    }

    @Override // com.applovin.impl.s9, com.applovin.impl.n9
    public void z() {
        this.f10591Y.c();
        super.z();
    }

    @Override // com.applovin.impl.s9
    public void a(MotionEvent motionEvent, Bundle bundle) {
        a(bq.d.VIDEO_CLICK);
        this.f10217l0.getAdEventTracker().v();
        super.a(motionEvent, bundle);
    }

    private void a(bq.d dVar) {
        a(dVar, gq.UNSPECIFIED);
    }

    private void a(bq.d dVar, gq gqVar) {
        a(dVar, "", gqVar);
    }

    private void a(bq.d dVar, String str) {
        a(dVar, str, gq.UNSPECIFIED);
    }

    private void a(bq.d dVar, String str, gq gqVar) {
        a(this.f10217l0.a(dVar, str), gqVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Set set) {
        a(set, gq.UNSPECIFIED);
    }

    private void a(Set set, gq gqVar) {
        if (set == null || set.isEmpty()) {
            return;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.f10581N.getCurrentPosition());
        pq p12 = this.f10217l0.p1();
        Uri c9 = p12 != null ? p12.c() : null;
        if (com.applovin.impl.sdk.t.a()) {
            this.f9298c.a("AppLovinFullscreenActivity", "Firing " + set.size() + " tracker(s): " + set);
        }
        nq.a(set, seconds, c9, gqVar, this.b);
    }

    @Override // com.applovin.impl.s9, com.applovin.impl.n9
    public void a(ViewGroup viewGroup) {
        super.a(viewGroup);
        this.f10591Y.a("PROGRESS_TRACKING", TimeUnit.SECONDS.toMillis(1L), new a());
        ArrayList arrayList = new ArrayList();
        C0730o c0730o = this.O;
        if (c0730o != null) {
            arrayList.add(new kg(c0730o, FriendlyObstructionPurpose.OTHER, "video stream buffering indicator"));
        }
        com.applovin.impl.adview.g gVar = this.f10582P;
        if (gVar != null) {
            arrayList.add(new kg(gVar, FriendlyObstructionPurpose.CLOSE_AD, "skip button"));
        }
        C0696f3 c0696f3 = this.f10583Q;
        if (c0696f3 != null) {
            arrayList.add(new kg(c0696f3, FriendlyObstructionPurpose.OTHER, "countdown clock"));
        }
        ProgressBar progressBar = this.f10586T;
        if (progressBar != null) {
            arrayList.add(new kg(progressBar, FriendlyObstructionPurpose.OTHER, "progress bar"));
        }
        ProgressBar progressBar2 = this.f10587U;
        if (progressBar2 != null) {
            arrayList.add(new kg(progressBar2, FriendlyObstructionPurpose.OTHER, "postitial progress bar"));
        }
        ImageView imageView = this.f10584R;
        if (imageView != null) {
            arrayList.add(new kg(imageView, FriendlyObstructionPurpose.VIDEO_CONTROLS, "mute button"));
        }
        com.applovin.impl.adview.l lVar = this.f10585S;
        if (lVar != null) {
            arrayList.add(new kg(lVar, FriendlyObstructionPurpose.VIDEO_CONTROLS, "generic webview overlay containing HTML controls"));
        }
        com.applovin.impl.adview.k kVar = this.f9304j;
        if (kVar != null && kVar.a()) {
            com.applovin.impl.adview.k kVar2 = this.f9304j;
            arrayList.add(new kg(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier()));
        }
        this.f10217l0.getAdEventTracker().b(this.f10580M, arrayList);
    }
}

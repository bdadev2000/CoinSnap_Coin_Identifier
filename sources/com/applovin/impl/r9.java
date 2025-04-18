package com.applovin.impl;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
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
public class r9 extends t9 {

    /* renamed from: n0, reason: collision with root package name */
    private final bq f7341n0;

    /* renamed from: o0, reason: collision with root package name */
    private final Set f7342o0;

    /* loaded from: classes.dex */
    public class a implements t4.b {
        public a() {
        }

        @Override // com.applovin.impl.t4.b
        public void a() {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(r9.this.f8173e0 - (r9.this.N.getDuration() - r9.this.N.getCurrentPosition()));
            int E = r9.this.E();
            HashSet hashSet = new HashSet();
            Iterator it = new HashSet(r9.this.f7342o0).iterator();
            while (it.hasNext()) {
                lq lqVar = (lq) it.next();
                if (lqVar.a(seconds, E)) {
                    hashSet.add(lqVar);
                    r9.this.f7342o0.remove(lqVar);
                }
            }
            r9.this.a(hashSet);
            if (E >= 25 && E < 50) {
                r9.this.f7341n0.getAdEventTracker().x();
                return;
            }
            if (E >= 50 && E < 75) {
                r9.this.f7341n0.getAdEventTracker().y();
            } else if (E >= 75) {
                r9.this.f7341n0.getAdEventTracker().C();
            }
        }

        @Override // com.applovin.impl.t4.b
        public boolean b() {
            return !r9.this.f8176h0;
        }
    }

    public r9(com.applovin.impl.sdk.ad.b bVar, final Activity activity, Map map, final com.applovin.impl.sdk.k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        HashSet hashSet = new HashSet();
        this.f7342o0 = hashSet;
        bq bqVar = (bq) bVar;
        this.f7341n0 = bqVar;
        if (bqVar.q1()) {
            ImageView a10 = hq.a(bqVar.k1().d(), activity, kVar);
            this.V = a10;
            a10.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.ov
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    r9.this.a(activity, kVar, view);
                }
            });
        }
        bq.d dVar = bq.d.VIDEO;
        hashSet.addAll(bqVar.a(dVar, mq.a));
        a(bq.d.IMPRESSION);
        a(dVar, "creativeView");
        bqVar.getAdEventTracker().g();
    }

    private void b0() {
        if (I() && !this.f7342o0.isEmpty()) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f6365c.k("AppLovinFullscreenActivity", "Firing " + this.f7342o0.size() + " un-fired video progress trackers when video was completed.");
            }
            a(this.f7342o0);
        }
    }

    @Override // com.applovin.impl.t9, com.applovin.impl.n9
    public void A() {
        a((ViewGroup) null);
    }

    @Override // com.applovin.impl.t9
    public void F() {
        a(bq.d.VIDEO, "skip");
        this.f7341n0.getAdEventTracker().B();
        super.F();
    }

    @Override // com.applovin.impl.t9
    public void G() {
        super.G();
        bq bqVar = this.f7341n0;
        if (bqVar != null) {
            bqVar.getAdEventTracker().i();
        }
    }

    @Override // com.applovin.impl.t9
    public void R() {
        long V;
        int p10;
        long j3 = 0;
        if (this.f7341n0.U() >= 0 || this.f7341n0.V() >= 0) {
            if (this.f7341n0.U() >= 0) {
                V = this.f7341n0.U();
            } else {
                bq bqVar = this.f7341n0;
                oq o12 = bqVar.o1();
                if (o12 != null && o12.c() > 0) {
                    j3 = TimeUnit.SECONDS.toMillis(o12.c());
                } else {
                    long j10 = this.f8173e0;
                    if (j10 > 0) {
                        j3 = j10;
                    }
                }
                if (bqVar.T0() && (p10 = (int) bqVar.p()) > 0) {
                    j3 += TimeUnit.SECONDS.toMillis(p10);
                }
                V = (long) ((this.f7341n0.V() / 100.0d) * j3);
            }
            b(V);
        }
    }

    @Override // com.applovin.impl.t9
    public void W() {
        super.W();
        bq bqVar = this.f7341n0;
        if (bqVar != null) {
            bqVar.getAdEventTracker().j();
        }
    }

    @Override // com.applovin.impl.t9
    public void X() {
        b0();
        if (nq.a(this.f7341n0)) {
            if (!this.f8176h0) {
                a(bq.d.COMPANION, "creativeView");
                this.f7341n0.getAdEventTracker().w();
                super.X();
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.f6365c.a("AppLovinFullscreenActivity", "VAST ad does not have valid companion ad - dismissing...");
        }
        f();
    }

    @Override // com.applovin.impl.t9
    public void Z() {
        String str;
        super.Z();
        bq.d dVar = bq.d.VIDEO;
        if (this.f8172d0) {
            str = CampaignEx.JSON_NATIVE_VIDEO_MUTE;
        } else {
            str = CampaignEx.JSON_NATIVE_VIDEO_UNMUTE;
        }
        a(dVar, str);
        this.f7341n0.getAdEventTracker().b(this.f8172d0);
    }

    @Override // com.applovin.impl.t9
    public void c(long j3) {
        super.c(j3);
        this.f7341n0.getAdEventTracker().b((float) TimeUnit.MILLISECONDS.toSeconds(j3), zp.e(this.f6364b));
    }

    @Override // com.applovin.impl.t9
    public void d(String str) {
        a(bq.d.ERROR, gq.MEDIA_FILE_ERROR);
        this.f7341n0.getAdEventTracker().b(str);
        super.d(str);
    }

    @Override // com.applovin.impl.t9, com.applovin.impl.n9
    public void f() {
        if (this.f7341n0 != null) {
            a(bq.d.VIDEO, "close");
            a(bq.d.COMPANION, "close");
        }
        super.f();
    }

    @Override // com.applovin.impl.n9
    public void w() {
        bq.d dVar;
        super.w();
        if (this.f8176h0) {
            dVar = bq.d.COMPANION;
        } else {
            dVar = bq.d.VIDEO;
        }
        a(dVar, CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
        this.f7341n0.getAdEventTracker().z();
    }

    @Override // com.applovin.impl.n9
    public void x() {
        bq.d dVar;
        super.x();
        if (this.f8176h0) {
            dVar = bq.d.COMPANION;
        } else {
            dVar = bq.d.VIDEO;
        }
        a(dVar, CampaignEx.JSON_NATIVE_VIDEO_RESUME);
        this.f7341n0.getAdEventTracker().A();
    }

    @Override // com.applovin.impl.t9, com.applovin.impl.n9
    public void z() {
        this.f8169a0.c();
        super.z();
    }

    private boolean a0() {
        return this.V != null && this.f7341n0.q1();
    }

    @Override // com.applovin.impl.t9
    public void a(MotionEvent motionEvent, Bundle bundle) {
        a(bq.d.VIDEO_CLICK);
        this.f7341n0.getAdEventTracker().v();
        super.a(motionEvent, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity, com.applovin.impl.sdk.k kVar, View view) {
        Uri b3 = this.f7341n0.k1().b();
        if (b3 != null) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f6365c.a("AppLovinFullscreenActivity", "Industry Icon clicked, opening URL: " + b3);
            }
            a(bq.d.INDUSTRY_ICON_CLICK);
            up.a(b3, activity, kVar);
        }
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
        a(this.f7341n0.a(dVar, str), gqVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Set set) {
        a(set, gq.UNSPECIFIED);
    }

    private void a(Set set, gq gqVar) {
        if (set == null || set.isEmpty()) {
            return;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.N.getCurrentPosition());
        pq p12 = this.f7341n0.p1();
        Uri c10 = p12 != null ? p12.c() : null;
        if (com.applovin.impl.sdk.t.a()) {
            this.f6365c.a("AppLovinFullscreenActivity", "Firing " + set.size() + " tracker(s): " + set);
        }
        nq.a(set, seconds, c10, gqVar, this.f6364b);
    }

    @Override // com.applovin.impl.t9, com.applovin.impl.n9
    public void a(ViewGroup viewGroup) {
        super.a(viewGroup);
        if (a0()) {
            a(bq.d.INDUSTRY_ICON_IMPRESSION);
            this.V.setVisibility(0);
        }
        this.f8169a0.a("PROGRESS_TRACKING", TimeUnit.SECONDS.toMillis(1L), new a());
        ArrayList arrayList = new ArrayList();
        o oVar = this.O;
        if (oVar != null) {
            arrayList.add(new kg(oVar, FriendlyObstructionPurpose.OTHER, "video stream buffering indicator"));
        }
        com.applovin.impl.adview.g gVar = this.P;
        if (gVar != null) {
            arrayList.add(new kg(gVar, FriendlyObstructionPurpose.CLOSE_AD, "skip button"));
        }
        f3 f3Var = this.Q;
        if (f3Var != null) {
            arrayList.add(new kg(f3Var, FriendlyObstructionPurpose.OTHER, "countdown clock"));
        }
        ProgressBar progressBar = this.T;
        if (progressBar != null) {
            arrayList.add(new kg(progressBar, FriendlyObstructionPurpose.OTHER, "progress bar"));
        }
        ProgressBar progressBar2 = this.U;
        if (progressBar2 != null) {
            arrayList.add(new kg(progressBar2, FriendlyObstructionPurpose.OTHER, "postitial progress bar"));
        }
        ImageView imageView = this.R;
        if (imageView != null) {
            arrayList.add(new kg(imageView, FriendlyObstructionPurpose.VIDEO_CONTROLS, "mute button"));
        }
        com.applovin.impl.adview.l lVar = this.S;
        if (lVar != null) {
            arrayList.add(new kg(lVar, FriendlyObstructionPurpose.VIDEO_CONTROLS, "generic webview overlay containing HTML controls"));
        }
        com.applovin.impl.adview.k kVar = this.f6371j;
        if (kVar != null && kVar.a()) {
            com.applovin.impl.adview.k kVar2 = this.f6371j;
            arrayList.add(new kg(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier()));
        }
        this.f7341n0.getAdEventTracker().b(this.N, arrayList);
    }
}

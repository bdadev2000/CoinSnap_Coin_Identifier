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
    private final bq f10474n0;

    /* renamed from: o0, reason: collision with root package name */
    private final Set f10475o0;

    /* loaded from: classes.dex */
    public class a implements t4.b {
        public a() {
        }

        @Override // com.applovin.impl.t4.b
        public void a() {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(r9.this.f11339e0 - (r9.this.f11323N.getDuration() - r9.this.f11323N.getCurrentPosition()));
            int E8 = r9.this.E();
            HashSet hashSet = new HashSet();
            Iterator it = new HashSet(r9.this.f10475o0).iterator();
            while (it.hasNext()) {
                lq lqVar = (lq) it.next();
                if (lqVar.a(seconds, E8)) {
                    hashSet.add(lqVar);
                    r9.this.f10475o0.remove(lqVar);
                }
            }
            r9.this.a(hashSet);
            if (E8 >= 25 && E8 < 50) {
                r9.this.f10474n0.getAdEventTracker().x();
                return;
            }
            if (E8 >= 50 && E8 < 75) {
                r9.this.f10474n0.getAdEventTracker().y();
            } else if (E8 >= 75) {
                r9.this.f10474n0.getAdEventTracker().C();
            }
        }

        @Override // com.applovin.impl.t4.b
        public boolean b() {
            return !r9.this.f11341h0;
        }
    }

    public r9(com.applovin.impl.sdk.ad.b bVar, final Activity activity, Map map, final com.applovin.impl.sdk.k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        HashSet hashSet = new HashSet();
        this.f10475o0 = hashSet;
        bq bqVar = (bq) bVar;
        this.f10474n0 = bqVar;
        if (bqVar.q1()) {
            ImageView a6 = hq.a(bqVar.k1().d(), activity, kVar);
            this.f11330V = a6;
            a6.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.E2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    r9.this.a(activity, kVar, view);
                }
            });
        }
        bq.d dVar = bq.d.VIDEO;
        hashSet.addAll(bqVar.a(dVar, mq.f9229a));
        a(bq.d.IMPRESSION);
        a(dVar, "creativeView");
        bqVar.getAdEventTracker().g();
    }

    private void b0() {
        if (I() && !this.f10475o0.isEmpty()) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f9298c.k("AppLovinFullscreenActivity", "Firing " + this.f10475o0.size() + " un-fired video progress trackers when video was completed.");
            }
            a(this.f10475o0);
        }
    }

    @Override // com.applovin.impl.t9, com.applovin.impl.n9
    public void A() {
        a((ViewGroup) null);
    }

    @Override // com.applovin.impl.t9
    public void F() {
        a(bq.d.VIDEO, "skip");
        this.f10474n0.getAdEventTracker().B();
        super.F();
    }

    @Override // com.applovin.impl.t9
    public void G() {
        super.G();
        bq bqVar = this.f10474n0;
        if (bqVar != null) {
            bqVar.getAdEventTracker().i();
        }
    }

    @Override // com.applovin.impl.t9
    public void R() {
        long V8;
        int p2;
        long j7 = 0;
        if (this.f10474n0.U() >= 0 || this.f10474n0.V() >= 0) {
            if (this.f10474n0.U() >= 0) {
                V8 = this.f10474n0.U();
            } else {
                bq bqVar = this.f10474n0;
                oq o12 = bqVar.o1();
                if (o12 != null && o12.c() > 0) {
                    j7 = TimeUnit.SECONDS.toMillis(o12.c());
                } else {
                    long j9 = this.f11339e0;
                    if (j9 > 0) {
                        j7 = j9;
                    }
                }
                if (bqVar.T0() && (p2 = (int) bqVar.p()) > 0) {
                    j7 += TimeUnit.SECONDS.toMillis(p2);
                }
                V8 = (long) ((this.f10474n0.V() / 100.0d) * j7);
            }
            b(V8);
        }
    }

    @Override // com.applovin.impl.t9
    public void W() {
        super.W();
        bq bqVar = this.f10474n0;
        if (bqVar != null) {
            bqVar.getAdEventTracker().j();
        }
    }

    @Override // com.applovin.impl.t9
    public void X() {
        b0();
        if (nq.a(this.f10474n0)) {
            if (!this.f11341h0) {
                a(bq.d.COMPANION, "creativeView");
                this.f10474n0.getAdEventTracker().w();
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

    @Override // com.applovin.impl.t9
    public void Z() {
        String str;
        super.Z();
        bq.d dVar = bq.d.VIDEO;
        if (this.f11338d0) {
            str = CampaignEx.JSON_NATIVE_VIDEO_MUTE;
        } else {
            str = CampaignEx.JSON_NATIVE_VIDEO_UNMUTE;
        }
        a(dVar, str);
        this.f10474n0.getAdEventTracker().b(this.f11338d0);
    }

    @Override // com.applovin.impl.t9
    public void c(long j7) {
        super.c(j7);
        this.f10474n0.getAdEventTracker().b((float) TimeUnit.MILLISECONDS.toSeconds(j7), zp.e(this.b));
    }

    @Override // com.applovin.impl.t9
    public void d(String str) {
        a(bq.d.ERROR, gq.MEDIA_FILE_ERROR);
        this.f10474n0.getAdEventTracker().b(str);
        super.d(str);
    }

    @Override // com.applovin.impl.t9, com.applovin.impl.n9
    public void f() {
        if (this.f10474n0 != null) {
            a(bq.d.VIDEO, "close");
            a(bq.d.COMPANION, "close");
        }
        super.f();
    }

    @Override // com.applovin.impl.n9
    public void w() {
        bq.d dVar;
        super.w();
        if (this.f11341h0) {
            dVar = bq.d.COMPANION;
        } else {
            dVar = bq.d.VIDEO;
        }
        a(dVar, CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
        this.f10474n0.getAdEventTracker().z();
    }

    @Override // com.applovin.impl.n9
    public void x() {
        bq.d dVar;
        super.x();
        if (this.f11341h0) {
            dVar = bq.d.COMPANION;
        } else {
            dVar = bq.d.VIDEO;
        }
        a(dVar, CampaignEx.JSON_NATIVE_VIDEO_RESUME);
        this.f10474n0.getAdEventTracker().A();
    }

    @Override // com.applovin.impl.t9, com.applovin.impl.n9
    public void z() {
        this.f11335a0.c();
        super.z();
    }

    private boolean a0() {
        return this.f11330V != null && this.f10474n0.q1();
    }

    @Override // com.applovin.impl.t9
    public void a(MotionEvent motionEvent, Bundle bundle) {
        a(bq.d.VIDEO_CLICK);
        this.f10474n0.getAdEventTracker().v();
        super.a(motionEvent, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity, com.applovin.impl.sdk.k kVar, View view) {
        Uri b = this.f10474n0.k1().b();
        if (b != null) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f9298c.a("AppLovinFullscreenActivity", "Industry Icon clicked, opening URL: " + b);
            }
            a(bq.d.INDUSTRY_ICON_CLICK);
            up.a(b, activity, kVar);
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
        a(this.f10474n0.a(dVar, str), gqVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Set set) {
        a(set, gq.UNSPECIFIED);
    }

    private void a(Set set, gq gqVar) {
        if (set == null || set.isEmpty()) {
            return;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.f11323N.getCurrentPosition());
        pq p12 = this.f10474n0.p1();
        Uri c9 = p12 != null ? p12.c() : null;
        if (com.applovin.impl.sdk.t.a()) {
            this.f9298c.a("AppLovinFullscreenActivity", "Firing " + set.size() + " tracker(s): " + set);
        }
        nq.a(set, seconds, c9, gqVar, this.b);
    }

    @Override // com.applovin.impl.t9, com.applovin.impl.n9
    public void a(ViewGroup viewGroup) {
        super.a(viewGroup);
        if (a0()) {
            a(bq.d.INDUSTRY_ICON_IMPRESSION);
            this.f11330V.setVisibility(0);
        }
        this.f11335a0.a("PROGRESS_TRACKING", TimeUnit.SECONDS.toMillis(1L), new a());
        ArrayList arrayList = new ArrayList();
        C0730o c0730o = this.O;
        if (c0730o != null) {
            arrayList.add(new kg(c0730o, FriendlyObstructionPurpose.OTHER, "video stream buffering indicator"));
        }
        com.applovin.impl.adview.g gVar = this.f11324P;
        if (gVar != null) {
            arrayList.add(new kg(gVar, FriendlyObstructionPurpose.CLOSE_AD, "skip button"));
        }
        C0696f3 c0696f3 = this.f11325Q;
        if (c0696f3 != null) {
            arrayList.add(new kg(c0696f3, FriendlyObstructionPurpose.OTHER, "countdown clock"));
        }
        ProgressBar progressBar = this.f11328T;
        if (progressBar != null) {
            arrayList.add(new kg(progressBar, FriendlyObstructionPurpose.OTHER, "progress bar"));
        }
        ProgressBar progressBar2 = this.f11329U;
        if (progressBar2 != null) {
            arrayList.add(new kg(progressBar2, FriendlyObstructionPurpose.OTHER, "postitial progress bar"));
        }
        ImageView imageView = this.f11326R;
        if (imageView != null) {
            arrayList.add(new kg(imageView, FriendlyObstructionPurpose.VIDEO_CONTROLS, "mute button"));
        }
        com.applovin.impl.adview.l lVar = this.f11327S;
        if (lVar != null) {
            arrayList.add(new kg(lVar, FriendlyObstructionPurpose.VIDEO_CONTROLS, "generic webview overlay containing HTML controls"));
        }
        com.applovin.impl.adview.k kVar = this.f9304j;
        if (kVar != null && kVar.a()) {
            com.applovin.impl.adview.k kVar2 = this.f9304j;
            arrayList.add(new kg(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier()));
        }
        this.f10474n0.getAdEventTracker().b(this.f11323N, arrayList);
    }
}

package com.applovin.impl;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.impl.aq;
import com.applovin.impl.v4;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class t9 extends v9 {

    /* renamed from: m0, reason: collision with root package name */
    private final aq f27033m0;

    /* renamed from: n0, reason: collision with root package name */
    private final Set f27034n0;

    /* loaded from: classes2.dex */
    public class a implements v4.b {
        public a() {
        }

        @Override // com.applovin.impl.v4.b
        public void a() {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(t9.this.f27493d0 - (t9.this.M.getDuration() - t9.this.M.getCurrentPosition()));
            int A = t9.this.A();
            HashSet hashSet = new HashSet();
            Iterator it = new HashSet(t9.this.f27034n0).iterator();
            while (it.hasNext()) {
                kq kqVar = (kq) it.next();
                if (kqVar.a(seconds, A)) {
                    hashSet.add(kqVar);
                    t9.this.f27034n0.remove(kqVar);
                }
            }
            t9.this.a(hashSet);
            if (A >= 25 && A < 50) {
                t9.this.f27033m0.getAdEventTracker().x();
                return;
            }
            if (A >= 50 && A < 75) {
                t9.this.f27033m0.getAdEventTracker().y();
            } else if (A >= 75) {
                t9.this.f27033m0.getAdEventTracker().C();
            }
        }

        @Override // com.applovin.impl.v4.b
        public boolean b() {
            return !t9.this.f27496g0;
        }
    }

    public t9(com.applovin.impl.sdk.ad.b bVar, final Activity activity, Map map, final com.applovin.impl.sdk.j jVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, jVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        HashSet hashSet = new HashSet();
        this.f27034n0 = hashSet;
        aq aqVar = (aq) bVar;
        this.f27033m0 = aqVar;
        if (aqVar.v1()) {
            ImageView a2 = gq.a(aqVar.p1().d(), activity, jVar);
            this.U = a2;
            a2.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.zv
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    t9.this.a(activity, jVar, view);
                }
            });
        }
        aq.d dVar = aq.d.VIDEO;
        hashSet.addAll(aqVar.a(dVar, lq.f25126a));
        a(aq.d.IMPRESSION);
        a(dVar, "creativeView");
        aqVar.getAdEventTracker().g();
    }

    private void X() {
        if (!E() || this.f27034n0.isEmpty()) {
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.f25978c.k("AppLovinFullscreenActivity", "Firing " + this.f27034n0.size() + " un-fired video progress trackers when video was completed.");
        }
        a(this.f27034n0);
    }

    @Override // com.applovin.impl.v9
    public void B() {
        a(aq.d.VIDEO, "skip");
        this.f27033m0.getAdEventTracker().B();
        super.B();
    }

    @Override // com.applovin.impl.v9
    public void C() {
        super.C();
        aq aqVar = this.f27033m0;
        if (aqVar != null) {
            aqVar.getAdEventTracker().i();
        }
    }

    @Override // com.applovin.impl.v9
    public void N() {
        long V;
        int o2;
        long j2 = 0;
        if (this.f27033m0.U() >= 0 || this.f27033m0.V() >= 0) {
            if (this.f27033m0.U() >= 0) {
                V = this.f27033m0.U();
            } else {
                aq aqVar = this.f27033m0;
                nq t1 = aqVar.t1();
                if (t1 == null || t1.c() <= 0) {
                    long j3 = this.f27493d0;
                    if (j3 > 0) {
                        j2 = j3;
                    }
                } else {
                    j2 = TimeUnit.SECONDS.toMillis(t1.c());
                }
                if (aqVar.X0() && (o2 = (int) aqVar.o()) > 0) {
                    j2 += TimeUnit.SECONDS.toMillis(o2);
                }
                V = (long) ((this.f27033m0.V() / 100.0d) * j2);
            }
            b(V);
        }
    }

    @Override // com.applovin.impl.v9
    public void S() {
        super.S();
        aq aqVar = this.f27033m0;
        if (aqVar != null) {
            aqVar.getAdEventTracker().j();
        }
    }

    @Override // com.applovin.impl.v9
    public void T() {
        X();
        if (!mq.a(this.f27033m0)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f25978c.a("AppLovinFullscreenActivity", "VAST ad does not have valid companion ad - dismissing...");
            }
            f();
        } else {
            if (this.f27496g0) {
                return;
            }
            a(aq.d.COMPANION, "creativeView");
            this.f27033m0.getAdEventTracker().w();
            super.T();
        }
    }

    @Override // com.applovin.impl.v9
    public void V() {
        super.V();
        a(aq.d.VIDEO, this.f27492c0 ? "mute" : "unmute");
        this.f27033m0.getAdEventTracker().b(this.f27492c0);
    }

    @Override // com.applovin.impl.v9
    public void c(long j2) {
        super.c(j2);
        this.f27033m0.getAdEventTracker().b((float) TimeUnit.MILLISECONDS.toSeconds(j2), yp.e(this.f25977b));
    }

    @Override // com.applovin.impl.v9
    public void d(String str) {
        a(aq.d.ERROR, fq.MEDIA_FILE_ERROR);
        this.f27033m0.getAdEventTracker().b(str);
        super.d(str);
    }

    @Override // com.applovin.impl.v9, com.applovin.impl.p9
    public void f() {
        if (this.f27033m0 != null) {
            a(aq.d.VIDEO, "close");
            a(aq.d.COMPANION, "close");
        }
        super.f();
    }

    @Override // com.applovin.impl.p9
    public void u() {
        super.u();
        a(this.f27496g0 ? aq.d.COMPANION : aq.d.VIDEO, "pause");
        this.f27033m0.getAdEventTracker().z();
    }

    @Override // com.applovin.impl.p9
    public void v() {
        super.v();
        a(this.f27496g0 ? aq.d.COMPANION : aq.d.VIDEO, "resume");
        this.f27033m0.getAdEventTracker().A();
    }

    @Override // com.applovin.impl.v9, com.applovin.impl.p9
    public void x() {
        this.Z.c();
        super.x();
    }

    @Override // com.applovin.impl.v9, com.applovin.impl.p9
    public void y() {
        a((ViewGroup) null);
    }

    private boolean W() {
        return this.U != null && this.f27033m0.v1();
    }

    @Override // com.applovin.impl.v9
    public void a(MotionEvent motionEvent, Bundle bundle) {
        a(aq.d.VIDEO_CLICK);
        this.f27033m0.getAdEventTracker().v();
        super.a(motionEvent, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity, com.applovin.impl.sdk.j jVar, View view) {
        Uri b2 = this.f27033m0.p1().b();
        if (b2 != null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f25978c.a("AppLovinFullscreenActivity", "Industry Icon clicked, opening URL: " + b2);
            }
            a(aq.d.INDUSTRY_ICON_CLICK);
            tp.a(b2, activity, jVar);
        }
    }

    private void a(aq.d dVar) {
        a(dVar, fq.UNSPECIFIED);
    }

    private void a(aq.d dVar, fq fqVar) {
        a(dVar, "", fqVar);
    }

    private void a(aq.d dVar, String str) {
        a(dVar, str, fq.UNSPECIFIED);
    }

    private void a(aq.d dVar, String str, fq fqVar) {
        a(this.f27033m0.a(dVar, str), fqVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Set set) {
        a(set, fq.UNSPECIFIED);
    }

    private void a(Set set, fq fqVar) {
        if (set == null || set.isEmpty()) {
            return;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.M.getCurrentPosition());
        oq u1 = this.f27033m0.u1();
        Uri c2 = u1 != null ? u1.c() : null;
        if (com.applovin.impl.sdk.n.a()) {
            this.f25978c.a("AppLovinFullscreenActivity", "Firing " + set.size() + " tracker(s): " + set);
        }
        mq.a(set, seconds, c2, fqVar, this.f25977b);
    }

    @Override // com.applovin.impl.v9, com.applovin.impl.p9
    public void a(ViewGroup viewGroup) {
        super.a(viewGroup);
        if (W()) {
            a(aq.d.INDUSTRY_ICON_IMPRESSION);
            this.U.setVisibility(0);
        }
        this.Z.a("PROGRESS_TRACKING", TimeUnit.SECONDS.toMillis(1L), new a());
        ArrayList arrayList = new ArrayList();
        o oVar = this.N;
        if (oVar != null) {
            arrayList.add(new og(oVar, FriendlyObstructionPurpose.OTHER, "video stream buffering indicator"));
        }
        com.applovin.impl.adview.g gVar = this.O;
        if (gVar != null) {
            arrayList.add(new og(gVar, FriendlyObstructionPurpose.CLOSE_AD, "skip button"));
        }
        h3 h3Var = this.P;
        if (h3Var != null) {
            arrayList.add(new og(h3Var, FriendlyObstructionPurpose.OTHER, "countdown clock"));
        }
        ProgressBar progressBar = this.S;
        if (progressBar != null) {
            arrayList.add(new og(progressBar, FriendlyObstructionPurpose.OTHER, "progress bar"));
        }
        ProgressBar progressBar2 = this.T;
        if (progressBar2 != null) {
            arrayList.add(new og(progressBar2, FriendlyObstructionPurpose.OTHER, "postitial progress bar"));
        }
        ImageView imageView = this.Q;
        if (imageView != null) {
            arrayList.add(new og(imageView, FriendlyObstructionPurpose.VIDEO_CONTROLS, "mute button"));
        }
        com.applovin.impl.adview.l lVar = this.R;
        if (lVar != null) {
            arrayList.add(new og(lVar, FriendlyObstructionPurpose.VIDEO_CONTROLS, "generic webview overlay containing HTML controls"));
        }
        com.applovin.impl.adview.k kVar = this.f25983j;
        if (kVar != null && kVar.a()) {
            com.applovin.impl.adview.k kVar2 = this.f25983j;
            arrayList.add(new og(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier()));
        }
        this.f27033m0.getAdEventTracker().b(this.M, arrayList);
    }
}

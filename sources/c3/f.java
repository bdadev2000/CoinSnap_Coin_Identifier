package c3;

import android.content.Context;
import com.ads.control.admob.AppOpenManager;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* loaded from: classes.dex */
public final class f extends AdListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jb.g f2550b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f2551c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f2552d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j f2553f;

    public f(j jVar, jb.g gVar, Context context, String str) {
        this.f2553f = jVar;
        this.f2550b = gVar;
        this.f2551c = context;
        this.f2552d = str;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        super.onAdClicked();
        if (this.f2553f.f2570f) {
            AppOpenManager.f().f2916m = true;
        }
        jb.g gVar = this.f2550b;
        if (gVar != null) {
            gVar.o();
        }
        d6.g.t(this.f2551c, this.f2552d);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f2550b.q(loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        super.onAdImpression();
        jb.g gVar = this.f2550b;
        if (gVar != null) {
            gVar.s();
        }
    }
}

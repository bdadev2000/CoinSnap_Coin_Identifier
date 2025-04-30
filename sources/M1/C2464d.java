package m1;

import android.content.Context;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import w4.v0;

/* renamed from: m1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2464d extends AdListener {
    public final /* synthetic */ F2.h b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f21717c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f21718d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f21719f;

    public C2464d(g gVar, F2.h hVar, Context context, String str) {
        this.f21719f = gVar;
        this.b = hVar;
        this.f21717c = context;
        this.f21718d = str;
    }

    @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        super.onAdClicked();
        if (this.f21719f.f21733f) {
            k.f().f21749j = true;
        }
        F2.h hVar = this.b;
        if (hVar != null) {
            hVar.E();
        }
        v0.s(this.f21717c, this.f21718d);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.b.G(loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        super.onAdImpression();
        F2.h hVar = this.b;
        if (hVar != null) {
            hVar.I();
        }
    }
}

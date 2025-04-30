package e3;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.widget.RelativeLayout;
import c3.InterfaceC0604b;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.vungle.ads.C;
import com.vungle.ads.C2149y;

/* renamed from: e3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2218b implements InterfaceC0604b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f20072a;
    public final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdSize f20073c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C f20074d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f20075e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f20076f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2219c f20077g;

    public C2218b(C2219c c2219c, Context context, String str, AdSize adSize, C c9, String str2, String str3) {
        this.f20077g = c2219c;
        this.f20072a = context;
        this.b = str;
        this.f20073c = adSize;
        this.f20074d = c9;
        this.f20075e = str2;
        this.f20076f = str3;
    }

    @Override // c3.InterfaceC0604b
    public final void a(AdError adError) {
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        this.f20077g.b.onFailure(adError);
    }

    @Override // c3.InterfaceC0604b
    public final void b() {
        C2219c c2219c = this.f20077g;
        c2219c.getClass();
        Context context = this.f20072a;
        c2219c.f20080f = new RelativeLayout(context);
        AdSize adSize = this.f20073c;
        int heightInPixels = adSize.getHeightInPixels(context);
        C c9 = this.f20074d;
        if (heightInPixels <= 0) {
            heightInPixels = Math.round(c9.getHeight() * context.getResources().getDisplayMetrics().density);
        }
        c2219c.f20080f.setLayoutParams(new RelativeLayout.LayoutParams(adSize.getWidthInPixels(context), heightInPixels));
        c2219c.f20081g.getClass();
        G7.j.e(context, "context");
        String str = this.b;
        G7.j.e(str, "placementId");
        G7.j.e(c9, "adSize");
        C2149y c2149y = new C2149y(context, str, c9);
        c2219c.f20079d = c2149y;
        c2149y.setAdListener(c2219c);
        String str2 = this.f20076f;
        if (!TextUtils.isEmpty(str2)) {
            c2219c.f20079d.getAdConfig().setWatermark(str2);
        }
        c2219c.f20079d.load(this.f20075e);
    }
}

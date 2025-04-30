package e3;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import c3.InterfaceC0604b;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.vungle.ads.C2144v0;

/* loaded from: classes.dex */
public final class f implements InterfaceC0604b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f20090a;
    public final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f20091c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f20092d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f20093e;

    public f(h hVar, Context context, String str, int i9, String str2) {
        this.f20093e = hVar;
        this.f20090a = context;
        this.b = str;
        this.f20091c = i9;
        this.f20092d = str2;
    }

    @Override // c3.InterfaceC0604b
    public final void a(AdError adError) {
        Log.d(VungleMediationAdapter.TAG, adError.toString());
        this.f20093e.f20095c.onFailure(adError);
    }

    @Override // c3.InterfaceC0604b
    public final void b() {
        h hVar = this.f20093e;
        hVar.f20100i.getClass();
        Context context = this.f20090a;
        G7.j.e(context, "context");
        String str = this.b;
        G7.j.e(str, "placementId");
        hVar.f20097f = new C2144v0(context, str);
        hVar.f20097f.setAdOptionsPosition(this.f20091c);
        hVar.f20097f.setAdListener(hVar);
        hVar.f20098g = new i7.g(context);
        String str2 = this.f20092d;
        if (!TextUtils.isEmpty(str2)) {
            hVar.f20097f.getAdConfig().setWatermark(str2);
        }
        hVar.f20097f.load(hVar.f20099h);
    }
}

package d3;

import G7.j;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import c3.InterfaceC0604b;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.vungle.ads.C2073d;
import com.vungle.ads.C2076e0;

/* renamed from: d3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2170a implements InterfaceC0604b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC2171b f19817a;
    public final /* synthetic */ Bundle b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f19818c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f19819d;

    public C2170a(AbstractC2171b abstractC2171b, Bundle bundle, Context context, String str) {
        this.f19817a = abstractC2171b;
        this.b = bundle;
        this.f19818c = context;
        this.f19819d = str;
    }

    @Override // c3.InterfaceC0604b
    public final void a(AdError adError) {
        j.e(adError, "error");
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        this.f19817a.f19820c.onFailure(adError);
    }

    @Override // c3.InterfaceC0604b
    public final void b() {
        AbstractC2171b abstractC2171b = this.f19817a;
        abstractC2171b.f19821d.getClass();
        C2073d c2073d = new C2073d();
        Bundle bundle = this.b;
        if (bundle.containsKey("adOrientation")) {
            c2073d.setAdOrientation(bundle.getInt("adOrientation", 2));
        }
        MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration = abstractC2171b.b;
        abstractC2171b.b(c2073d, mediationAppOpenAdConfiguration);
        String str = this.f19819d;
        j.b(str);
        abstractC2171b.f19821d.getClass();
        Context context = this.f19818c;
        j.e(context, "context");
        C2076e0 c2076e0 = new C2076e0(context, str, c2073d);
        abstractC2171b.f19822f = c2076e0;
        c2076e0.setAdListener(abstractC2171b);
        C2076e0 c2076e02 = abstractC2171b.f19822f;
        if (c2076e02 != null) {
            c2076e02.load(abstractC2171b.a(mediationAppOpenAdConfiguration));
        } else {
            j.k("appOpenAd");
            throw null;
        }
    }
}

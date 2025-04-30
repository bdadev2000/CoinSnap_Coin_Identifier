package e3;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import c3.InterfaceC0604b;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.vungle.ads.C2073d;
import com.vungle.ads.J0;

/* loaded from: classes.dex */
public final class i implements InterfaceC0604b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f20101a;
    public final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2073d f20102c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f20103d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f20104e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j f20105f;

    public i(j jVar, Context context, String str, C2073d c2073d, String str2, String str3) {
        this.f20105f = jVar;
        this.f20101a = context;
        this.b = str;
        this.f20102c = c2073d;
        this.f20103d = str2;
        this.f20104e = str3;
    }

    @Override // c3.InterfaceC0604b
    public final void a(AdError adError) {
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        this.f20105f.f20106c.onFailure(adError);
    }

    @Override // c3.InterfaceC0604b
    public final void b() {
        j jVar = this.f20105f;
        jVar.f20109g.getClass();
        Context context = this.f20101a;
        G7.j.e(context, "context");
        String str = this.b;
        G7.j.e(str, "placementId");
        C2073d c2073d = this.f20102c;
        G7.j.e(c2073d, "adConfig");
        J0 j02 = new J0(context, str, c2073d);
        jVar.f20108f = j02;
        j02.setAdListener(jVar);
        String str2 = this.f20103d;
        if (!TextUtils.isEmpty(str2)) {
            jVar.f20108f.setUserId(str2);
        }
        jVar.f20108f.load(this.f20104e);
    }
}

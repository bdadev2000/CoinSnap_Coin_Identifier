package a7;

import android.content.Context;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import com.vungle.ads.VungleAds$WrapperFramework;
import com.vungle.ads.a1;
import com.vungle.ads.k3;
import com.vungle.ads.l3;
import com.vungle.ads.n3;
import com.vungle.ads.o3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c implements a1 {

    /* renamed from: c, reason: collision with root package name */
    public static final c f306c = new c();
    public final AtomicBoolean a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f307b = new ArrayList();

    public c() {
        l3.setIntegrationName(VungleAds$WrapperFramework.admob, "7.3.2.0".replace('.', '_'));
    }

    public static void b(int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                o3.setCOPPAStatus(true);
                return;
            }
            return;
        }
        o3.setCOPPAStatus(false);
    }

    public final void a(String appId, Context context, b bVar) {
        k3 k3Var = l3.Companion;
        if (k3Var.isInitialized()) {
            bVar.b();
            return;
        }
        boolean andSet = this.a.getAndSet(true);
        ArrayList arrayList = this.f307b;
        if (andSet) {
            arrayList.add(bVar);
            return;
        }
        b(MobileAds.getRequestConfiguration().getTagForChildDirectedTreatment());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(this, "initializationListener");
        k3Var.init(context, appId, this);
        arrayList.add(bVar);
    }

    @Override // com.vungle.ads.a1
    public final void onError(n3 n3Var) {
        AdError adError = VungleMediationAdapter.getAdError(n3Var);
        ArrayList arrayList = this.f307b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(adError);
        }
        arrayList.clear();
        this.a.set(false);
    }

    @Override // com.vungle.ads.a1
    public final void onSuccess() {
        ArrayList arrayList = this.f307b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((b) it.next()).b();
        }
        arrayList.clear();
        this.a.set(false);
    }
}

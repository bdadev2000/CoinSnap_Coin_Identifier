package c3;

import G7.j;
import android.content.Context;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import com.vungle.ads.InterfaceC2072c0;
import com.vungle.ads.VungleAds$WrapperFramework;
import com.vungle.ads.l1;
import com.vungle.ads.m1;
import com.vungle.ads.o1;
import com.vungle.ads.p1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: c3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0605c implements InterfaceC2072c0 {

    /* renamed from: c, reason: collision with root package name */
    public static final C0605c f5405c = new C0605c();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f5406a = new AtomicBoolean(false);
    public final ArrayList b = new ArrayList();

    public C0605c() {
        m1.setIntegrationName(VungleAds$WrapperFramework.admob, "7.3.2.0".replace('.', '_'));
    }

    public static void b(int i9) {
        if (i9 != 0) {
            if (i9 == 1) {
                p1.setCOPPAStatus(true);
                return;
            }
            return;
        }
        p1.setCOPPAStatus(false);
    }

    public final void a(String str, Context context, InterfaceC0604b interfaceC0604b) {
        l1 l1Var = m1.Companion;
        if (l1Var.isInitialized()) {
            interfaceC0604b.b();
            return;
        }
        boolean andSet = this.f5406a.getAndSet(true);
        ArrayList arrayList = this.b;
        if (andSet) {
            arrayList.add(interfaceC0604b);
            return;
        }
        b(MobileAds.getRequestConfiguration().getTagForChildDirectedTreatment());
        j.e(context, "context");
        j.e(str, "appId");
        l1Var.init(context, str, this);
        arrayList.add(interfaceC0604b);
    }

    @Override // com.vungle.ads.InterfaceC2072c0
    public final void onError(o1 o1Var) {
        AdError adError = VungleMediationAdapter.getAdError(o1Var);
        ArrayList arrayList = this.b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC0604b) it.next()).a(adError);
        }
        arrayList.clear();
        this.f5406a.set(false);
    }

    @Override // com.vungle.ads.InterfaceC2072c0
    public final void onSuccess() {
        ArrayList arrayList = this.b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC0604b) it.next()).b();
        }
        arrayList.clear();
        this.f5406a.set(false);
    }
}

package com.facebook.internal;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.vungle.ads.P;
import com.vungle.ads.o1;
import com.vungle.mediation.VungleInterstitialAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Callable;
import k4.C2434c;
import k4.InterfaceC2433b;
import org.json.JSONObject;
import p1.C2537a;
import p1.C2538b;
import p1.C2541e;
import q.InterfaceC2600g0;
import q.X;
import s4.InterfaceC2699a;

/* renamed from: com.facebook.internal.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1838g implements com.vungle.ads.B, InterfaceC2600g0, J1.n, J1.o, X, InterfaceC2699a, Continuation {
    public Object b;

    public /* synthetic */ C1838g(Object obj) {
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, p1.e] */
    @Override // J1.o
    public void a(J1.g gVar, List list) {
        int i9 = gVar.f1520a;
        C2538b c2538b = (C2538b) this.b;
        if (i9 == 0 && list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Purchase purchase = (Purchase) it.next();
                Iterator it2 = c2538b.f22174a.iterator();
                while (it2.hasNext()) {
                    J1.q qVar = (J1.q) it2.next();
                    if (purchase.a().contains(qVar.f1538a)) {
                        JSONObject jSONObject = purchase.f5615c;
                        jSONObject.optString("packageName");
                        ArrayList a6 = purchase.a();
                        jSONObject.optInt("purchaseState", 1);
                        jSONObject.optBoolean("autoRenewing");
                        ?? obj = new Object();
                        obj.f22206a = a6;
                        ArrayList arrayList = c2538b.f22184n;
                        Iterator it3 = arrayList.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                C2541e c2541e = (C2541e) it3.next();
                                if (c2541e.f22206a.contains(qVar.f1538a)) {
                                    arrayList.remove(c2541e);
                                    arrayList.add(obj);
                                    break;
                                }
                            } else {
                                arrayList.add(obj);
                                break;
                            }
                        }
                        c2538b.m = true;
                    }
                }
            }
            c2538b.l = true;
            return;
        }
        c2538b.l = true;
    }

    @Override // J1.n
    public void e(ArrayList arrayList) {
        Log.d("PurchaseEG", "onSkuSubsDetailsResponse: " + arrayList.size());
        C2538b c2538b = ((C2537a) this.b).f22172a;
        c2538b.f22179g = arrayList;
        c2538b.getClass();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            J1.m mVar = (J1.m) it.next();
            c2538b.f22181i.put(mVar.f1529c, mVar);
        }
    }

    public f8.v f() {
        return new f8.v((LinkedHashMap) this.b);
    }

    public f8.j g(f8.j jVar, String str) {
        G7.j.e(str, "key");
        return (f8.j) ((LinkedHashMap) this.b).put(str, jVar);
    }

    @Override // s4.InterfaceC2699a
    public void h(Bundle bundle) {
        ((C2434c) ((InterfaceC2433b) this.b)).a("clx", "_ae", bundle);
    }

    @Override // com.vungle.ads.B, com.vungle.ads.Q
    public void onAdClicked(P p2) {
        VungleInterstitialAdapter vungleInterstitialAdapter = (VungleInterstitialAdapter) this.b;
        if (VungleInterstitialAdapter.d(vungleInterstitialAdapter) != null) {
            VungleInterstitialAdapter.d(vungleInterstitialAdapter).onAdClicked(vungleInterstitialAdapter);
            VungleInterstitialAdapter.d(vungleInterstitialAdapter).onAdOpened(vungleInterstitialAdapter);
        }
    }

    @Override // com.vungle.ads.B, com.vungle.ads.Q
    public void onAdFailedToLoad(P p2, o1 o1Var) {
        AdError adError = VungleMediationAdapter.getAdError(o1Var);
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        VungleInterstitialAdapter vungleInterstitialAdapter = (VungleInterstitialAdapter) this.b;
        if (VungleInterstitialAdapter.d(vungleInterstitialAdapter) != null) {
            VungleInterstitialAdapter.d(vungleInterstitialAdapter).onAdFailedToLoad(vungleInterstitialAdapter, adError);
        }
    }

    @Override // com.vungle.ads.B, com.vungle.ads.Q
    public void onAdFailedToPlay(P p2, o1 o1Var) {
        Log.w(VungleMediationAdapter.TAG, VungleMediationAdapter.getAdError(o1Var).toString());
    }

    @Override // com.vungle.ads.B, com.vungle.ads.Q
    public void onAdLeftApplication(P p2) {
        VungleInterstitialAdapter vungleInterstitialAdapter = (VungleInterstitialAdapter) this.b;
        if (VungleInterstitialAdapter.d(vungleInterstitialAdapter) != null) {
            VungleInterstitialAdapter.d(vungleInterstitialAdapter).onAdLeftApplication(vungleInterstitialAdapter);
        }
    }

    @Override // com.vungle.ads.B, com.vungle.ads.Q
    public void onAdLoaded(P p2) {
        VungleInterstitialAdapter.i((VungleInterstitialAdapter) this.b);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return ((Callable) this.b).call();
    }

    public C1838g(String str, Bundle bundle) {
        Uri a6;
        bundle = bundle == null ? new Bundle() : bundle;
        x[] valuesCustom = x.valuesCustom();
        ArrayList arrayList = new ArrayList(valuesCustom.length);
        for (x xVar : valuesCustom) {
            arrayList.add(xVar.b);
        }
        if (arrayList.contains(str)) {
            com.facebook.r rVar = com.facebook.r.f13801a;
            a6 = H.a(String.format("%s", Arrays.copyOf(new Object[]{"fb.gg"}, 1)), G7.j.j(str, "/dialog/"), bundle);
        } else {
            a6 = H.a(H.o(), com.facebook.r.d() + "/dialog/" + str, bundle);
        }
        this.b = a6;
    }

    public C1838g(int i9) {
        switch (i9) {
            case 8:
                this.b = new LinkedHashSet();
                return;
            default:
                this.b = new LinkedHashMap();
                return;
        }
    }

    @Override // q.X
    public void b(int i9) {
    }

    @Override // q.X
    public void c(int i9) {
    }

    @Override // com.vungle.ads.B, com.vungle.ads.Q
    public void onAdEnd(P p2) {
    }

    @Override // com.vungle.ads.B, com.vungle.ads.Q
    public void onAdImpression(P p2) {
    }

    @Override // com.vungle.ads.B, com.vungle.ads.Q
    public void onAdStart(P p2) {
    }

    @Override // q.X
    public void d(int i9, float f9) {
    }
}

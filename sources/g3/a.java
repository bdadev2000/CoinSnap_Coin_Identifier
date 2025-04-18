package g3;

import a4.l;
import a4.r;
import a4.t;
import a4.u;
import a4.x;
import android.text.TextUtils;
import android.util.Log;
import c6.k;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustEvent;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a implements x {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f18003b;

    public /* synthetic */ a(c cVar) {
        this.f18003b = cVar;
    }

    public static void b(l lVar) {
        Log.d("PurchaseEG", "onAcknowledgePurchaseResponse: " + lVar.f152b);
    }

    @Override // a4.x
    public final void a(l lVar, List list) {
        HashMap hashMap;
        long j3;
        double d10;
        String str;
        Log.e("PurchaseEG", "onPurchasesUpdated code: " + lVar.a);
        int i10 = lVar.a;
        c cVar = this.f18003b;
        if (i10 == 0 && list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Purchase purchase = (Purchase) it.next();
                purchase.c();
                String str2 = cVar.f18015j;
                int i11 = cVar.f18016k;
                HashMap hashMap2 = cVar.f18013h;
                HashMap hashMap3 = cVar.f18014i;
                if (i11 == 1) {
                    hashMap = hashMap2;
                } else {
                    hashMap = hashMap3;
                }
                u uVar = (u) hashMap.get(str2);
                if (uVar == null) {
                    d10 = 0.0d;
                } else {
                    if (i11 == 1) {
                        j3 = uVar.a().f155b;
                    } else {
                        ArrayList arrayList = uVar.f168i;
                        ArrayList arrayList2 = ((t) arrayList.get(arrayList.size() - 1)).f160b.a;
                        j3 = ((r) arrayList2.get(arrayList2.size() - 1)).f158b;
                    }
                    d10 = j3;
                }
                String str3 = cVar.f18015j;
                int i12 = cVar.f18016k;
                if (i12 != 1) {
                    hashMap2 = hashMap3;
                }
                u uVar2 = (u) hashMap2.get(str3);
                if (uVar2 == null) {
                    str = "";
                } else if (i12 == 1) {
                    str = uVar2.a().f156c;
                } else {
                    ArrayList arrayList3 = uVar2.f168i;
                    ArrayList arrayList4 = ((t) arrayList3.get(arrayList3.size() - 1)).f160b.a;
                    str = ((r) arrayList4.get(arrayList4.size() - 1)).f159c;
                }
                float f10 = (float) d10;
                if (k.f2645e) {
                    AdjustEvent adjustEvent = new AdjustEvent("");
                    adjustEvent.setRevenue(f10 / 1000000.0d, str);
                    Adjust.trackEvent(adjustEvent);
                }
                k3.a aVar = cVar.f18008c;
                JSONObject jSONObject = purchase.f2943c;
                if (aVar != null) {
                    cVar.f18018m = true;
                    String optString = jSONObject.optString("orderId");
                    if (TextUtils.isEmpty(optString)) {
                        optString = null;
                    }
                    ((ag.b) aVar).e(optString, purchase.a);
                }
                if (purchase.a() == 1) {
                    int i13 = 0;
                    a4.a aVar2 = new a4.a(i13);
                    String b3 = purchase.b();
                    aVar2.f77b = b3;
                    if (b3 != null) {
                        a4.b bVar = new a4.b(i13);
                        bVar.a = b3;
                        if (!jSONObject.optBoolean("acknowledged", true)) {
                            cVar.f18010e.E(bVar, new a(cVar));
                        }
                    } else {
                        throw new IllegalArgumentException("Purchase token must be set");
                    }
                }
            }
            return;
        }
        if (i10 == 1) {
            k3.a aVar3 = cVar.f18008c;
            Log.d("PurchaseEG", "onPurchasesUpdated:USER_CANCELED ");
        } else {
            Log.d("PurchaseEG", "onPurchasesUpdated:... ");
        }
    }
}

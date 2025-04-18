package g3;

import a4.l;
import a4.w;
import a4.z;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b implements w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18004b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f18005c;

    public /* synthetic */ b(c cVar, int i10) {
        this.f18004b = i10;
        this.f18005c = cVar;
    }

    @Override // a4.w
    public final void d(l lVar, List list) {
        boolean z10;
        int i10 = this.f18004b;
        c cVar = this.f18005c;
        switch (i10) {
            case 0:
                if (lVar.a == 0 && list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        Purchase purchase = (Purchase) it.next();
                        Iterator it2 = cVar.f18007b.iterator();
                        while (it2.hasNext()) {
                            z zVar = (z) it2.next();
                            if (purchase.c().contains(zVar.a)) {
                                Log.d("PurchaseEG", "verifyPurchased INAPP: true");
                                cVar.f18020o.add(zVar.a);
                                cVar.f18018m = true;
                            }
                        }
                    }
                    cVar.getClass();
                    return;
                }
                cVar.getClass();
                if (!cVar.f18017l) {
                    return;
                } else {
                    throw null;
                }
            default:
                if (lVar.a == 0 && list != null) {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        Purchase purchase2 = (Purchase) it3.next();
                        Iterator it4 = cVar.a.iterator();
                        while (it4.hasNext()) {
                            z zVar2 = (z) it4.next();
                            if (purchase2.c().contains(zVar2.a)) {
                                JSONObject jSONObject = purchase2.f2943c;
                                jSONObject.optString("packageName");
                                ArrayList c10 = purchase2.c();
                                purchase2.a();
                                jSONObject.optBoolean("autoRenewing");
                                f fVar = new f(c10);
                                ArrayList arrayList = cVar.f18019n;
                                Iterator it5 = arrayList.iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        f fVar2 = (f) it5.next();
                                        if (fVar2.a.contains(zVar2.a)) {
                                            arrayList.remove(fVar2);
                                            arrayList.add(fVar);
                                            z10 = true;
                                        }
                                    } else {
                                        z10 = false;
                                    }
                                }
                                if (!z10) {
                                    arrayList.add(fVar);
                                }
                                cVar.f18018m = true;
                            }
                        }
                    }
                    cVar.f18017l = true;
                    return;
                }
                cVar.f18017l = true;
                return;
        }
    }
}

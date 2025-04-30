package C0;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer;
import java.io.Serializable;
import java.util.Collection;
import u.InterfaceC2745n;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f386c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f387d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f388f;

    public /* synthetic */ a(int i9, Object obj, Object obj2, int i10) {
        this.b = i10;
        this.f387d = obj;
        this.f386c = i9;
        this.f388f = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h.b bVar;
        switch (this.b) {
            case 0:
                ((b) this.f387d).b.a(this.f386c, (Serializable) this.f388f);
                return;
            case 1:
                ((MaxAdPlacer) this.f387d).a(this.f386c, (Collection) this.f388f);
                return;
            case 2:
                f.k kVar = (f.k) this.f387d;
                G7.j.e(kVar, "this$0");
                Object obj = ((com.bumptech.glide.f) this.f388f).f12819c;
                String str = (String) kVar.f20560a.get(Integer.valueOf(this.f386c));
                if (str != null) {
                    h.e eVar = (h.e) kVar.f20563e.get(str);
                    if (eVar != null) {
                        bVar = eVar.f20555a;
                    } else {
                        bVar = null;
                    }
                    if (bVar == null) {
                        kVar.f20565g.remove(str);
                        kVar.f20564f.put(str, obj);
                        return;
                    }
                    h.b bVar2 = eVar.f20555a;
                    G7.j.c(bVar2, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
                    if (kVar.f20562d.remove(str)) {
                        bVar2.b(obj);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                f.k kVar2 = (f.k) this.f387d;
                G7.j.e(kVar2, "this$0");
                IntentSender.SendIntentException sendIntentException = (IntentSender.SendIntentException) this.f388f;
                G7.j.e(sendIntentException, "$e");
                kVar2.a(this.f386c, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", sendIntentException));
                return;
            default:
                ((InterfaceC2745n) this.f387d).onGreatestScrollPercentageIncreased(this.f386c, (Bundle) this.f388f);
                return;
        }
    }
}

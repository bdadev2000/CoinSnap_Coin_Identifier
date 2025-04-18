package ka;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CountDownLatch;
import net.premiumads.sdk.admob.PremiumRewardedAd;
import org.json.JSONException;
import org.json.JSONObject;
import wh.y0;

/* loaded from: classes3.dex */
public final class f implements hb.b, ib.a, SuccessContinuation, OnSuccessListener, OnFailureListener, OnCanceledListener, ad.e, xd.b, Continuation, OnUserEarnedRewardListener, ni.l {

    /* renamed from: b, reason: collision with root package name */
    public Object f20532b;

    public f(int i10) {
        if (i10 == 5) {
            this.f20532b = new CountDownLatch(1);
        } else if (i10 == 6) {
            this.f20532b = new fd.g(0);
        } else {
            if (i10 != 7) {
                return;
            }
            this.f20532b = new int[2];
        }
    }

    public static String e(Bundle bundle, String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // xd.b
    public final JSONObject a(View view) {
        if (view == null) {
            return zd.b.a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen((int[]) this.f20532b);
        int[] iArr = (int[]) this.f20532b;
        return zd.b.a(iArr[0], iArr[1], width, height);
    }

    @Override // hb.b
    public final void b(Bundle bundle, String str) {
        jb.o oVar = (jb.o) this.f20532b;
        if (oVar != null) {
            try {
                String str2 = "$A$:" + e(bundle, str);
                jb.q qVar = oVar.a;
                qVar.getClass();
                qVar.f19941o.a.a(new jb.p(qVar, System.currentTimeMillis() - qVar.f19930d, str2, 0));
            } catch (JSONException unused) {
                b6.a.f2288f.i("Unable to serialize Firebase Analytics event to breadcrumb.", null);
            }
        }
    }

    @Override // ad.e
    public final cd.b c(String str, ad.a aVar, int i10, int i11, Map map) {
        if (aVar == ad.a.UPC_A) {
            return ((fd.g) this.f20532b).c("0".concat(String.valueOf(str)), ad.a.EAN_13, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(aVar)));
    }

    @Override // ni.l
    public final Object convert(Object obj) {
        return Optional.ofNullable(((ni.l) this.f20532b).convert((y0) obj));
    }

    @Override // xd.b
    public final void d(View view, JSONObject jSONObject, xd.a aVar, boolean z10, boolean z11) {
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i10 = 0;
        if (z10) {
            HashMap hashMap = new HashMap();
            while (i10 < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i10);
                ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
                }
                arrayList.add(childAt);
                i10++;
            }
            ArrayList arrayList2 = new ArrayList(hashMap.keySet());
            Collections.sort(arrayList2);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Iterator it2 = ((ArrayList) hashMap.get((Float) it.next())).iterator();
                while (it2.hasNext()) {
                    ((ae.a) aVar).a((View) it2.next(), this, jSONObject, z11);
                }
            }
            return;
        }
        while (i10 < viewGroup.getChildCount()) {
            ((ae.a) aVar).a(viewGroup.getChildAt(i10), this, jSONObject, z11);
            i10++;
        }
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        ((CountDownLatch) this.f20532b).countDown();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        ((CountDownLatch) this.f20532b).countDown();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        ((CountDownLatch) this.f20532b).countDown();
    }

    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
    public final void onUserEarnedReward(RewardItem rewardItem) {
        if (PremiumRewardedAd.access$000((PremiumRewardedAd) this.f20532b) != null) {
            PremiumRewardedAd.access$000((PremiumRewardedAd) this.f20532b).onUserEarnedReward(rewardItem);
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        if (task.isSuccessful() || ((pe.h) this.f20532b).f23625e) {
            pe.h hVar = (pe.h) this.f20532b;
            hVar.f23626f.f23631f = hVar.f23623c;
        }
        return task;
    }

    @Override // ib.a
    public final void a(jb.o oVar) {
        this.f20532b = oVar;
        b6.a.f2288f.d("Registered Firebase Analytics event receiver for breadcrumbs", null);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        if (((qb.a) obj) == null) {
            b6.a.f2288f.i("Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.forResult(null);
        }
        jb.m.a((jb.m) ((qa.a) this.f20532b).f23737d);
        jb.m mVar = (jb.m) ((qa.a) this.f20532b).f23737d;
        mVar.f19916m.t(null, mVar.f19908e.a);
        ((jb.m) ((qa.a) this.f20532b).f23737d).f19920q.trySetResult(null);
        return Tasks.forResult(null);
    }

    public /* synthetic */ f(Object obj) {
        this.f20532b = obj;
    }

    public f(Field field) {
        this.f20532b = field;
        field.setAccessible(true);
    }
}

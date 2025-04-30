package p1;

import J1.C0209b;
import J1.g;
import J1.j;
import J1.l;
import J1.m;
import J1.s;
import J1.x;
import J1.z;
import android.text.TextUtils;
import android.util.Log;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustEvent;
import com.android.billingclient.api.Purchase;
import com.bumptech.glide.f;
import com.facebook.internal.C1838g;
import com.google.android.gms.internal.play_billing.zzb;
import com.mbridge.msdk.foundation.entity.o;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.tools.arruler.ui.component.iap.IAPActivity;
import j5.C2400c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import n1.C2475f;
import org.json.JSONObject;
import q4.C2645d;
import r8.k;

/* renamed from: p1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2537a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2538b f22172a;

    public /* synthetic */ C2537a(C2538b c2538b) {
        this.f22172a = c2538b;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [J1.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [J1.r, java.lang.Object] */
    public void a(g gVar) {
        Log.d("PurchaseEG", "onBillingSetupFinished:  " + gVar.f1520a);
        C2538b c2538b = this.f22172a;
        if (!c2538b.f22176d.booleanValue()) {
            Log.d("PurchaseEG", "isPurchased : " + c2538b.f22174a.size());
            if (c2538b.b != null) {
                C0209b c0209b = c2538b.f22177e;
                ?? obj = new Object();
                obj.f1539a = "inapp";
                c0209b.d(new H0.a(obj), new f(c2538b, 11));
            }
            if (c2538b.f22174a != null) {
                C0209b c0209b2 = c2538b.f22177e;
                ?? obj2 = new Object();
                obj2.f1539a = "subs";
                c0209b2.d(new H0.a(obj2), new C1838g(c2538b));
            }
        }
        c2538b.f22176d = Boolean.TRUE;
        int i9 = gVar.f1520a;
        if (i9 == 0) {
            if (c2538b.b.size() > 0) {
                C2475f c2475f = new C2475f(4, false);
                c2475f.w(c2538b.b);
                c2538b.f22177e.c(new E1.c(c2475f), new f(this, 10));
            }
            if (c2538b.f22174a.size() > 0) {
                C2475f c2475f2 = new C2475f(4, false);
                c2475f2.w(c2538b.f22174a);
                c2538b.f22177e.c(new E1.c(c2475f2), new C1838g(this));
                return;
            }
            return;
        }
        if (i9 == 2 || i9 == 6) {
            Log.e("PurchaseEG", "onBillingSetupFinished:ERROR ");
        }
    }

    /* JADX WARN: Type inference failed for: r5v8, types: [J1.a, java.lang.Object] */
    public void b(g gVar, List list) {
        Object obj;
        long j7;
        double d2;
        Object obj2;
        String str;
        int i9 = 3;
        Log.e("PurchaseEG", "onPurchasesUpdated code: " + gVar.f1520a);
        int i10 = gVar.f1520a;
        C2538b c2538b = this.f22172a;
        if (i10 == 0 && list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Purchase purchase = (Purchase) it.next();
                purchase.a();
                String str2 = c2538b.f22182j;
                int i11 = c2538b.f22183k;
                HashMap hashMap = c2538b.f22181i;
                HashMap hashMap2 = c2538b.f22180h;
                if (i11 == 1) {
                    obj = hashMap2.get(str2);
                } else {
                    obj = hashMap.get(str2);
                }
                m mVar = (m) obj;
                if (mVar == null) {
                    d2 = 0.0d;
                } else {
                    if (i11 == 1) {
                        j7 = mVar.a().b;
                    } else {
                        ArrayList arrayList = mVar.f1535i;
                        j7 = ((j) o.g(((l) arrayList.get(arrayList.size() - 1)).b.f1526a, 1)).b;
                    }
                    d2 = j7;
                }
                String str3 = c2538b.f22182j;
                int i12 = c2538b.f22183k;
                if (i12 == 1) {
                    obj2 = hashMap2.get(str3);
                } else {
                    obj2 = hashMap.get(str3);
                }
                m mVar2 = (m) obj2;
                if (mVar2 == null) {
                    str = "";
                } else if (i12 == 1) {
                    str = mVar2.a().f1522c;
                } else {
                    ArrayList arrayList2 = mVar2.f1535i;
                    str = ((j) o.g(((l) arrayList2.get(arrayList2.size() - 1)).b.f1526a, 1)).f1525c;
                }
                float f9 = (float) d2;
                if (k.b) {
                    AdjustEvent adjustEvent = new AdjustEvent("");
                    adjustEvent.setRevenue(f9 / 1000000.0d, str);
                    Adjust.trackEvent(adjustEvent);
                }
                C2400c c2400c = c2538b.f22175c;
                JSONObject jSONObject = purchase.f5615c;
                if (c2400c != null) {
                    c2538b.m = true;
                    TextUtils.isEmpty(jSONObject.optString("orderId"));
                    int i13 = IAPActivity.f19655h;
                    ((IAPActivity) c2400c.f21107c).t();
                }
                if (jSONObject.optInt("purchaseState", 1) != 4) {
                    String optString = jSONObject.optString(BidResponsed.KEY_TOKEN, jSONObject.optString("purchaseToken"));
                    if (optString != null) {
                        ?? obj3 = new Object();
                        obj3.b = optString;
                        if (!jSONObject.optBoolean("acknowledged", true)) {
                            C0209b c0209b = c2538b.f22177e;
                            Object obj4 = new Object();
                            if (!c0209b.a()) {
                                g gVar2 = z.f1562j;
                                c0209b.i(x.a(2, 3, gVar2));
                                C2645d.y(gVar2);
                            } else if (TextUtils.isEmpty(obj3.b)) {
                                zzb.zzk("BillingClient", "Please provide a valid purchase token.");
                                g gVar3 = z.f1559g;
                                c0209b.i(x.a(26, 3, gVar3));
                                C2645d.y(gVar3);
                            } else if (!c0209b.l) {
                                g gVar4 = z.b;
                                c0209b.i(x.a(27, 3, gVar4));
                                C2645d.y(gVar4);
                            } else if (c0209b.h(new s(c0209b, obj3, obj4, i9), 30000L, new f4.b(4, c0209b, obj4), c0209b.e()) == null) {
                                g g9 = c0209b.g();
                                c0209b.i(x.a(25, 3, g9));
                                C2645d.y(g9);
                            }
                        }
                    } else {
                        throw new IllegalArgumentException("Purchase token must be set");
                    }
                }
            }
            return;
        }
        if (i10 == 1) {
            C2400c c2400c2 = c2538b.f22175c;
            Log.d("PurchaseEG", "onPurchasesUpdated:USER_CANCELED ");
        } else {
            Log.d("PurchaseEG", "onPurchasesUpdated:... ");
        }
    }
}

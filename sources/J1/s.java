package J1;

import android.os.Bundle;
import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.play_billing.zzaa;
import com.google.android.gms.internal.play_billing.zzai;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzs;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
import q4.C2645d;

/* loaded from: classes.dex */
public final /* synthetic */ class s implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1540a;
    public final /* synthetic */ C0209b b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1541c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1542d;

    public /* synthetic */ s(C0209b c0209b, Object obj, Object obj2, int i9) {
        this.f1540a = i9;
        this.b = c0209b;
        this.f1541c = obj;
        this.f1542d = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        int i9;
        int i10;
        int i11;
        int i12;
        zzai zzaiVar;
        int i13;
        a7.b bVar;
        Bundle zzi;
        B3.g gVar;
        int i14;
        switch (this.f1540a) {
            case 0:
                C0209b c0209b = this.b;
                E1.c cVar = (E1.c) this.f1541c;
                n nVar = (n) this.f1542d;
                c0209b.getClass();
                ArrayList arrayList = new ArrayList();
                String E8 = cVar.E();
                zzai zzaiVar2 = (zzai) cVar.f972c;
                int size = zzaiVar2.size();
                int i15 = 0;
                while (true) {
                    if (i15 < size) {
                        int i16 = i15 + 20;
                        if (i16 > size) {
                            i10 = size;
                        } else {
                            i10 = i16;
                        }
                        ArrayList arrayList2 = new ArrayList(zzaiVar2.subList(i15, i10));
                        ArrayList<String> arrayList3 = new ArrayList<>();
                        int size2 = arrayList2.size();
                        for (int i17 = 0; i17 < size2; i17++) {
                            arrayList3.add(((q) arrayList2.get(i17)).f1538a);
                        }
                        Bundle bundle = new Bundle();
                        bundle.putStringArrayList("ITEM_ID_LIST", arrayList3);
                        bundle.putString("playBillingLibraryVersion", c0209b.b);
                        try {
                            zzs zzsVar = c0209b.f1497g;
                            if (true != c0209b.f1506r) {
                                i12 = 17;
                            } else {
                                i12 = 20;
                            }
                            String packageName = c0209b.f1495e.getPackageName();
                            if (c0209b.f1505q) {
                                c0209b.f1508t.getClass();
                            }
                            String str2 = c0209b.b;
                            if (!TextUtils.isEmpty(null)) {
                                zzaiVar = zzaiVar2;
                            } else {
                                zzaiVar = zzaiVar2;
                                c0209b.f1495e.getPackageName();
                            }
                            if (TextUtils.isEmpty(null)) {
                                c0209b.f1495e.getPackageName();
                            }
                            if (TextUtils.isEmpty(null)) {
                                c0209b.f1495e.getPackageName();
                            }
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("playBillingLibraryVersion", str2);
                            bundle2.putBoolean("enablePendingPurchases", true);
                            bundle2.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
                            ArrayList<String> arrayList4 = new ArrayList<>();
                            ArrayList<String> arrayList5 = new ArrayList<>();
                            int size3 = arrayList2.size();
                            int i18 = 0;
                            boolean z8 = false;
                            boolean z9 = false;
                            while (i18 < size3) {
                                int i19 = size3;
                                q qVar = (q) arrayList2.get(i18);
                                ArrayList arrayList6 = arrayList2;
                                arrayList4.add(null);
                                z9 |= !TextUtils.isEmpty(null);
                                if (qVar.b.equals("first_party")) {
                                    zzaa.zzc(null, "Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                                    arrayList5.add(null);
                                    z8 = true;
                                }
                                i18++;
                                arrayList2 = arrayList6;
                                size3 = i19;
                            }
                            if (z9) {
                                bundle2.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                            }
                            if (!arrayList5.isEmpty()) {
                                bundle2.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                            }
                            if (z8 && !TextUtils.isEmpty(null)) {
                                bundle2.putString("accountName", null);
                            }
                            i11 = 7;
                            i9 = 6;
                            try {
                                Bundle zzl = zzsVar.zzl(i12, packageName, E8, bundle, bundle2);
                                i13 = 4;
                                str = "Item is unavailable for purchase.";
                                if (zzl == null) {
                                    zzb.zzk("BillingClient", "queryProductDetailsAsync got empty product details response.");
                                    c0209b.i(x.a(44, 7, z.f1566p));
                                } else if (!zzl.containsKey("DETAILS_LIST")) {
                                    i13 = zzb.zzb(zzl, "BillingClient");
                                    str = zzb.zzg(zzl, "BillingClient");
                                    if (i13 != 0) {
                                        zzb.zzk("BillingClient", "getSkuDetails() failed for queryProductDetailsAsync. Response code: " + i13);
                                        c0209b.i(x.a(23, 7, z.a(i13, str)));
                                    } else {
                                        zzb.zzk("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.");
                                        c0209b.i(x.a(45, 7, z.a(6, str)));
                                    }
                                } else {
                                    ArrayList<String> stringArrayList = zzl.getStringArrayList("DETAILS_LIST");
                                    if (stringArrayList == null) {
                                        zzb.zzk("BillingClient", "queryProductDetailsAsync got null response list");
                                        c0209b.i(x.a(46, 7, z.f1566p));
                                    } else {
                                        for (int i20 = 0; i20 < stringArrayList.size(); i20++) {
                                            try {
                                                m mVar = new m(stringArrayList.get(i20));
                                                zzb.zzj("BillingClient", "Got product details: ".concat(mVar.toString()));
                                                arrayList.add(mVar);
                                            } catch (JSONException e4) {
                                                zzb.zzl("BillingClient", "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e4);
                                                str = "Error trying to decode SkuDetails.";
                                                c0209b.i(x.a(47, 7, z.a(6, "Error trying to decode SkuDetails.")));
                                            }
                                        }
                                        i15 = i16;
                                        zzaiVar2 = zzaiVar;
                                    }
                                }
                            } catch (Exception e9) {
                                e = e9;
                                zzb.zzl("BillingClient", "queryProductDetailsAsync got a remote exception (try to reconnect).", e);
                                c0209b.i(x.a(43, i11, z.f1560h));
                                str = "An internal error occurred.";
                                z.a(i9, str);
                                nVar.e(arrayList);
                                return null;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            i11 = 7;
                            i9 = 6;
                        }
                    } else {
                        str = "";
                        i9 = 0;
                    }
                }
                i9 = i13;
                z.a(i9, str);
                nVar.e(arrayList);
                return null;
            case 1:
                C0209b c0209b2 = this.b;
                String str3 = (String) this.f1541c;
                zzb.zzj("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str3)));
                ArrayList arrayList7 = new ArrayList();
                boolean z10 = c0209b2.l;
                boolean z11 = c0209b2.f1505q;
                c0209b2.f1508t.getClass();
                c0209b2.f1508t.getClass();
                int i21 = 1;
                Bundle zzc = zzb.zzc(z10, z11, true, false, c0209b2.b);
                String str4 = null;
                while (true) {
                    int i22 = 9;
                    try {
                        if (c0209b2.l) {
                            zzs zzsVar2 = c0209b2.f1497g;
                            if (i21 != c0209b2.f1505q) {
                                i14 = 9;
                            } else {
                                i14 = 19;
                            }
                            zzi = zzsVar2.zzj(i14, c0209b2.f1495e.getPackageName(), str3, str4, zzc);
                        } else {
                            zzi = c0209b2.f1497g.zzi(3, c0209b2.f1495e.getPackageName(), str3, str4);
                        }
                        g gVar2 = z.f1560h;
                        if (zzi == null) {
                            zzb.zzk("BillingClient", "getPurchase() got null owned items list");
                            gVar = new B3.g(54, 1, gVar2);
                        } else {
                            int zzb = zzb.zzb(zzi, "BillingClient");
                            String zzg = zzb.zzg(zzi, "BillingClient");
                            f a6 = g.a();
                            a6.f1519a = zzb;
                            a6.b = zzg;
                            g a9 = a6.a();
                            if (zzb != 0) {
                                zzb.zzk("BillingClient", "getPurchase() failed. Response code: " + zzb);
                                gVar = new B3.g(23, 1, a9);
                            } else if (zzi.containsKey("INAPP_PURCHASE_ITEM_LIST") && zzi.containsKey("INAPP_PURCHASE_DATA_LIST") && zzi.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                                ArrayList<String> stringArrayList2 = zzi.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                                ArrayList<String> stringArrayList3 = zzi.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                                ArrayList<String> stringArrayList4 = zzi.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                                if (stringArrayList2 == null) {
                                    zzb.zzk("BillingClient", "Bundle returned from getPurchase() contains null SKUs list.");
                                    gVar = new B3.g(56, 1, gVar2);
                                } else if (stringArrayList3 == null) {
                                    zzb.zzk("BillingClient", "Bundle returned from getPurchase() contains null purchases list.");
                                    gVar = new B3.g(57, 1, gVar2);
                                } else if (stringArrayList4 == null) {
                                    zzb.zzk("BillingClient", "Bundle returned from getPurchase() contains null signatures list.");
                                    gVar = new B3.g(58, 1, gVar2);
                                } else {
                                    gVar = new B3.g(i21, 1, z.f1561i);
                                }
                            } else {
                                zzb.zzk("BillingClient", "Bundle returned from getPurchase() doesn't contain required fields.");
                                gVar = new B3.g(55, 1, gVar2);
                            }
                        }
                        g gVar3 = (g) gVar.f286d;
                        if (gVar3 != z.f1561i) {
                            c0209b2.i(x.a(gVar.f285c, 9, gVar3));
                            bVar = new a7.b(5, gVar3, null, false);
                        } else {
                            ArrayList<String> stringArrayList5 = zzi.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                            ArrayList<String> stringArrayList6 = zzi.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                            ArrayList<String> stringArrayList7 = zzi.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                            int i23 = 0;
                            boolean z12 = false;
                            while (i23 < stringArrayList6.size()) {
                                String str5 = stringArrayList6.get(i23);
                                String str6 = stringArrayList7.get(i23);
                                zzb.zzj("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList5.get(i23))));
                                try {
                                    Purchase purchase = new Purchase(str5, str6);
                                    JSONObject jSONObject = purchase.f5615c;
                                    if (TextUtils.isEmpty(jSONObject.optString(BidResponsed.KEY_TOKEN, jSONObject.optString("purchaseToken")))) {
                                        zzb.zzk("BillingClient", "BUG: empty/null token!");
                                        z12 = true;
                                    }
                                    arrayList7.add(purchase);
                                    i23++;
                                    i22 = 9;
                                } catch (JSONException e11) {
                                    zzb.zzl("BillingClient", "Got an exception trying to decode the purchase!", e11);
                                    g gVar4 = z.f1560h;
                                    c0209b2.i(x.a(51, 9, gVar4));
                                    bVar = new a7.b(5, gVar4, null, false);
                                }
                            }
                            int i24 = i22;
                            if (z12) {
                                c0209b2.i(x.a(26, i24, z.f1560h));
                            }
                            str4 = zzi.getString("INAPP_CONTINUATION_TOKEN");
                            zzb.zzj("BillingClient", "Continuation token: ".concat(String.valueOf(str4)));
                            if (TextUtils.isEmpty(str4)) {
                                bVar = new a7.b(5, z.f1561i, arrayList7, false);
                            } else {
                                i21 = 1;
                            }
                        }
                    } catch (Exception e12) {
                        g gVar5 = z.f1562j;
                        c0209b2.i(x.a(52, 9, gVar5));
                        zzb.zzl("BillingClient", "Got exception trying to get purchasesm try to reconnect", e12);
                        bVar = new a7.b(5, gVar5, null, false);
                    }
                }
                List list = (List) bVar.f4077c;
                if (list != null) {
                    ((o) this.f1542d).a((g) bVar.f4078d, list);
                    return null;
                }
                ((o) this.f1542d).a((g) bVar.f4078d, zzai.zzk());
                return null;
            case 2:
                C0209b c0209b3 = this.b;
                return c0209b3.f1497g.zzf(3, c0209b3.f1495e.getPackageName(), (String) this.f1541c, (String) this.f1542d, null);
            default:
                C0209b c0209b4 = this.b;
                C0208a c0208a = (C0208a) this.f1541c;
                C2645d c2645d = (C2645d) this.f1542d;
                c0209b4.getClass();
                try {
                    zzs zzsVar3 = c0209b4.f1497g;
                    String packageName2 = c0209b4.f1495e.getPackageName();
                    String str7 = c0208a.b;
                    String str8 = c0209b4.b;
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("playBillingLibraryVersion", str8);
                    Bundle zzd = zzsVar3.zzd(9, packageName2, str7, bundle3);
                    g a10 = z.a(zzb.zzb(zzd, "BillingClient"), zzb.zzg(zzd, "BillingClient"));
                    c2645d.getClass();
                    C2645d.y(a10);
                    return null;
                } catch (Exception e13) {
                    zzb.zzl("BillingClient", "Error acknowledge purchase!", e13);
                    g gVar6 = z.f1562j;
                    c0209b4.i(x.a(28, 3, gVar6));
                    c2645d.getClass();
                    C2645d.y(gVar6);
                    return null;
                }
        }
    }
}

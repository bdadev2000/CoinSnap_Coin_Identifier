package com.google.android.gms.internal.play_billing;

import a4.k;
import a4.l;
import a4.o;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class zzb {
    public static final int zza = Runtime.getRuntime().availableProcessors();

    public static int zza(Intent intent, String str) {
        if (intent == null) {
            zzk("ProxyBillingActivity", "Got null intent!");
            return 0;
        }
        return zzm(intent.getExtras(), "ProxyBillingActivity");
    }

    public static int zzb(Bundle bundle, String str) {
        if (bundle == null) {
            zzk(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            zzj(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        zzk(str, "Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
        return 6;
    }

    public static Bundle zzc(boolean z10, boolean z11, boolean z12, boolean z13, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (z10 && z12) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (z11 && z13) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        return bundle;
    }

    public static Bundle zzd(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        return bundle;
    }

    public static l zze(Intent intent, String str) {
        if (intent == null) {
            zzk("BillingHelper", "Got null intent!");
            k a = l.a();
            a.f151c = 6;
            a.f150b = "An internal error occurred.";
            return a.a();
        }
        k a10 = l.a();
        a10.f151c = zzb(intent.getExtras(), str);
        a10.f150b = zzg(intent.getExtras(), str);
        return a10.a();
    }

    public static o zzf(Bundle bundle, String str) {
        if (bundle == null) {
            return new o();
        }
        zzm(bundle, "BillingClient");
        bundle.getString("IN_APP_MESSAGE_PURCHASE_TOKEN");
        return new o();
    }

    public static String zzg(Bundle bundle, String str) {
        if (bundle == null) {
            zzk(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            zzj(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        zzk(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
        return "";
    }

    public static String zzh(int i10) {
        return zza.zza(i10).toString();
    }

    @Nullable
    public static List zzi(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList != null && stringArrayList2 != null) {
            zzj("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
            for (int i10 = 0; i10 < stringArrayList.size() && i10 < stringArrayList2.size(); i10++) {
                Purchase zzn = zzn(stringArrayList.get(i10), stringArrayList2.get(i10));
                if (zzn != null) {
                    arrayList.add(zzn);
                }
            }
        } else {
            Purchase zzn2 = zzn(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (zzn2 == null) {
                zzj("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(zzn2);
        }
        return arrayList;
    }

    public static void zzj(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            if (!str2.isEmpty()) {
                int i10 = 40000;
                while (!str2.isEmpty() && i10 > 0) {
                    int min = Math.min(str2.length(), Math.min(4000, i10));
                    Log.v(str, str2.substring(0, min));
                    str2 = str2.substring(min);
                    i10 -= min;
                }
                return;
            }
            Log.v(str, str2);
        }
    }

    public static void zzk(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void zzl(String str, String str2, Throwable th2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2, th2);
        }
    }

    private static int zzm(Bundle bundle, String str) {
        if (bundle == null) {
            zzk(str, "Unexpected null bundle received!");
            return 0;
        }
        return bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
    }

    @Nullable
    private static Purchase zzn(String str, String str2) {
        if (str != null && str2 != null) {
            try {
                return new Purchase(str, str2);
            } catch (JSONException e2) {
                zzk("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e2.toString()));
                return null;
            }
        }
        zzj("BillingHelper", "Received a null purchase data.");
        return null;
    }
}

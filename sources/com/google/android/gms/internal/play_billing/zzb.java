package com.google.android.gms.internal.play_billing;

import J1.f;
import J1.g;
import J1.h;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes2.dex */
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

    public static Bundle zzc(boolean z8, boolean z9, boolean z10, boolean z11, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (z8 && z10) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (z9 && z11) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        return bundle;
    }

    public static Bundle zzd(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        return bundle;
    }

    public static g zze(Intent intent, String str) {
        if (intent == null) {
            zzk("BillingHelper", "Got null intent!");
            f a6 = g.a();
            a6.f1519a = 6;
            a6.b = "An internal error occurred.";
            return a6.a();
        }
        f a9 = g.a();
        a9.f1519a = zzb(intent.getExtras(), str);
        a9.b = zzg(intent.getExtras(), str);
        return a9.a();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [J1.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [J1.h, java.lang.Object] */
    public static h zzf(Bundle bundle, String str) {
        if (bundle == null) {
            return new Object();
        }
        zzm(bundle, "BillingClient");
        bundle.getString("IN_APP_MESSAGE_PURCHASE_TOKEN");
        return new Object();
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

    public static String zzh(int i9) {
        return zza.zza(i9).toString();
    }

    @Nullable
    public static List zzi(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList != null && stringArrayList2 != null) {
            zzj("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
            for (int i9 = 0; i9 < stringArrayList.size() && i9 < stringArrayList2.size(); i9++) {
                Purchase zzn = zzn(stringArrayList.get(i9), stringArrayList2.get(i9));
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
                int i9 = 40000;
                while (!str2.isEmpty() && i9 > 0) {
                    int min = Math.min(str2.length(), Math.min(4000, i9));
                    Log.v(str, str2.substring(0, min));
                    str2 = str2.substring(min);
                    i9 -= min;
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

    public static void zzl(String str, String str2, Throwable th) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2, th);
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
            } catch (JSONException e4) {
                zzk("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e4.toString()));
                return null;
            }
        }
        zzj("BillingHelper", "Received a null purchase data.");
        return null;
    }
}

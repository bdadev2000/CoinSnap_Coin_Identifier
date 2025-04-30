package com.google.android.gms.ads.internal.util.client;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.adjust.sdk.Constants;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.search.SearchAdView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbgt;
import com.google.android.gms.internal.ads.zzfuv;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzf {
    public static final Handler zza = new zzfuv(Looper.getMainLooper());
    private static final String zzb = AdView.class.getName();
    private static final String zzc = InterstitialAd.class.getName();
    private static final String zzd = AdManagerAdView.class.getName();
    private static final String zze = AdManagerInterstitialAd.class.getName();
    private static final String zzf = SearchAdView.class.getName();
    private static final String zzg = AdLoader.class.getName();
    private float zzh = -1.0f;

    @Nullable
    private static String zzA(String str, String str2) {
        for (int i9 = 0; i9 < 2; i9++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str2);
                messageDigest.update(str.getBytes());
                return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return null;
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return null;
    }

    private final JSONArray zzB(Collection collection) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zzC(jSONArray, it.next());
        }
        return jSONArray;
    }

    private final void zzC(JSONArray jSONArray, @Nullable Object obj) throws JSONException {
        if (obj instanceof Bundle) {
            jSONArray.put(zzi((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONArray.put(zzj((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            jSONArray.put(zzB((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONArray.put(zzh((Object[]) obj));
        } else {
            jSONArray.put(obj);
        }
    }

    private final void zzD(JSONObject jSONObject, String str, @Nullable Object obj) throws JSONException {
        Boolean[] boolArr;
        Long[] lArr;
        Double[] dArr;
        Integer[] numArr;
        if (((Boolean) zzba.zzc().zza(zzbep.zzt)).booleanValue()) {
            str = String.valueOf(str);
        }
        if (obj instanceof Bundle) {
            jSONObject.put(str, zzi((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONObject.put(str, zzj((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            jSONObject.put(String.valueOf(str), zzB((Collection) obj));
            return;
        }
        if (obj instanceof Object[]) {
            jSONObject.put(str, zzB(Arrays.asList((Object[]) obj)));
            return;
        }
        int i9 = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            if (iArr == null) {
                numArr = new Integer[0];
            } else {
                int length = iArr.length;
                Integer[] numArr2 = new Integer[length];
                while (i9 < length) {
                    numArr2[i9] = Integer.valueOf(iArr[i9]);
                    i9++;
                }
                numArr = numArr2;
            }
            jSONObject.put(str, zzh(numArr));
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr2 = (double[]) obj;
            if (dArr2 == null) {
                dArr = new Double[0];
            } else {
                int length2 = dArr2.length;
                Double[] dArr3 = new Double[length2];
                while (i9 < length2) {
                    dArr3[i9] = Double.valueOf(dArr2[i9]);
                    i9++;
                }
                dArr = dArr3;
            }
            jSONObject.put(str, zzh(dArr));
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            if (jArr == null) {
                lArr = new Long[0];
            } else {
                int length3 = jArr.length;
                Long[] lArr2 = new Long[length3];
                while (i9 < length3) {
                    lArr2[i9] = Long.valueOf(jArr[i9]);
                    i9++;
                }
                lArr = lArr2;
            }
            jSONObject.put(str, zzh(lArr));
            return;
        }
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            if (zArr == null) {
                boolArr = new Boolean[0];
            } else {
                int length4 = zArr.length;
                Boolean[] boolArr2 = new Boolean[length4];
                while (i9 < length4) {
                    boolArr2[i9] = Boolean.valueOf(zArr[i9]);
                    i9++;
                }
                boolArr = boolArr2;
            }
            jSONObject.put(str, zzh(boolArr));
            return;
        }
        jSONObject.put(str, obj);
    }

    private static final void zzE(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzq zzqVar, @Nullable String str, int i9, int i10) {
        if (viewGroup.getChildCount() != 0) {
            return;
        }
        Context context = viewGroup.getContext();
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setText(str);
        textView.setTextColor(i9);
        textView.setBackgroundColor(i10);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i9);
        int zzy = zzy(context, 3);
        frameLayout.addView(textView, new FrameLayout.LayoutParams(zzqVar.zzf - zzy, zzqVar.zzc - zzy, 17));
        viewGroup.addView(frameLayout, zzqVar.zzf, zzqVar.zzc);
    }

    public static int zza(Context context, int i9) {
        DisplayMetrics displayMetrics;
        Configuration configuration;
        if (context != null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            Resources resources = context.getResources();
            if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null && (configuration = resources.getConfiguration()) != null) {
                int i10 = configuration.orientation;
                if (i9 == 0) {
                    i9 = i10;
                }
                if (i9 == i10) {
                    return Math.round(displayMetrics.heightPixels / displayMetrics.density);
                }
                return Math.round(displayMetrics.widthPixels / displayMetrics.density);
            }
            return -1;
        }
        return -1;
    }

    @Nullable
    public static ActivityManager.MemoryInfo zzc(Context context) {
        ActivityManager activityManager;
        if (context != null && (activityManager = (ActivityManager) context.getSystemService("activity")) != null) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo;
        }
        return null;
    }

    public static AdSize zzd(Context context, int i9, int i10, int i11) {
        int round;
        int zza2 = zza(context, i11);
        if (zza2 == -1) {
            return AdSize.INVALID;
        }
        int min = Math.min(90, Math.round(zza2 * 0.15f));
        if (i9 > 655) {
            round = Math.round((i9 / 728.0f) * 90.0f);
        } else if (i9 > 632) {
            round = 81;
        } else if (i9 > 526) {
            round = Math.round((i9 / 468.0f) * 60.0f);
        } else if (i9 > 432) {
            round = 68;
        } else {
            round = Math.round((i9 / 320.0f) * 50.0f);
        }
        return new AdSize(i9, Math.max(Math.min(round, min), 50));
    }

    public static String zze() {
        UUID randomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, byteArray).toString();
        for (int i9 = 0; i9 < 2; i9++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                bigInteger = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return bigInteger;
    }

    @Nullable
    public static String zzf(String str) {
        return zzA(str, SameMD5.TAG);
    }

    @Nullable
    public static String zzg(String str) {
        return zzA(str, Constants.SHA256);
    }

    public static boolean zzp(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith((String) zzbgt.zzd.zze());
    }

    public static final int zzq(DisplayMetrics displayMetrics, int i9) {
        return (int) TypedValue.applyDimension(1, i9, displayMetrics);
    }

    @Nullable
    public static final String zzr(StackTraceElement[] stackTraceElementArr, String str) {
        int i9;
        String str2;
        int i10 = 0;
        while (true) {
            i9 = i10 + 1;
            if (i9 < stackTraceElementArr.length) {
                StackTraceElement stackTraceElement = stackTraceElementArr[i10];
                String className = stackTraceElement.getClassName();
                if (!"loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) || (!zzb.equalsIgnoreCase(className) && !zzc.equalsIgnoreCase(className) && !zzd.equalsIgnoreCase(className) && !zze.equalsIgnoreCase(className) && !zzf.equalsIgnoreCase(className) && !zzg.equalsIgnoreCase(className))) {
                    i10 = i9;
                }
            } else {
                str2 = null;
                break;
            }
        }
        str2 = stackTraceElementArr[i9].getClassName();
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            StringBuilder sb = new StringBuilder();
            if (stringTokenizer.hasMoreElements()) {
                sb.append(stringTokenizer.nextToken());
                for (int i11 = 2; i11 > 0 && stringTokenizer.hasMoreElements(); i11--) {
                    sb.append(".");
                    sb.append(stringTokenizer.nextToken());
                }
                str = sb.toString();
            }
            if (str2 != null && !str2.contains(str)) {
                return str2;
            }
        }
        return null;
    }

    public static final boolean zzs() {
        boolean booleanValue = ((Boolean) zzba.zzc().zza(zzbep.zzlt)).booleanValue();
        if (Build.VERSION.SDK_INT >= 31) {
            String str = Build.FINGERPRINT;
            if (str.contains("generic") || str.contains("emulator")) {
                return true;
            }
            if (booleanValue && Build.HARDWARE.contains("ranchu")) {
                return true;
            }
            return false;
        }
        return Build.DEVICE.startsWith("generic");
    }

    public static final boolean zzt(Context context, int i9) {
        if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, i9) == 0) {
            return true;
        }
        return false;
    }

    public static final boolean zzu(Context context) {
        int isGooglePlayServicesAvailable = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        if (isGooglePlayServicesAvailable != 0 && isGooglePlayServicesAvailable != 2) {
            return false;
        }
        return true;
    }

    public static final boolean zzv() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    public static final int zzw(DisplayMetrics displayMetrics, int i9) {
        return Math.round(i9 / displayMetrics.density);
    }

    public static final void zzx(Context context, @Nullable String str, String str2, Bundle bundle, boolean z8, zze zzeVar) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString("os", Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            str = GoogleApiAvailabilityLight.getInstance().getApkVersion(context) + ".241806000";
        }
        bundle.putString("js", str);
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme(Constants.SCHEME).path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps");
        for (String str3 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        zzeVar.zza(appendQueryParameter.toString());
    }

    public static final int zzy(Context context, int i9) {
        return zzq(context.getResources().getDisplayMetrics(), i9);
    }

    @Nullable
    public static final String zzz(Context context) {
        String string;
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            string = null;
        } else {
            string = Settings.Secure.getString(contentResolver, "android_id");
        }
        if (string == null || zzs()) {
            string = "emulator";
        }
        return zzA(string, SameMD5.TAG);
    }

    public final int zzb(Context context, int i9) {
        if (this.zzh < 0.0f) {
            synchronized (this) {
                try {
                    if (this.zzh < 0.0f) {
                        WindowManager windowManager = (WindowManager) context.getSystemService("window");
                        if (windowManager == null) {
                            return 0;
                        }
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        defaultDisplay.getMetrics(displayMetrics);
                        this.zzh = displayMetrics.density;
                    }
                } finally {
                }
            }
        }
        return Math.round(i9 / this.zzh);
    }

    public final JSONArray zzh(Object[] objArr) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : objArr) {
            zzC(jSONArray, obj);
        }
        return jSONArray;
    }

    public final JSONObject zzi(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            zzD(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    public final JSONObject zzj(Map map) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                zzD(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e4) {
            throw new JSONException("Could not convert map to JSON: ".concat(String.valueOf(e4.getMessage())));
        }
    }

    public final JSONObject zzk(@Nullable Bundle bundle, JSONObject jSONObject) {
        if (bundle == null) {
            return null;
        }
        try {
            return zzi(bundle);
        } catch (JSONException e4) {
            zzm.zzh("Error converting Bundle to JSON", e4);
            return null;
        }
    }

    public final void zzl(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject2.get(next);
            try {
                Object obj2 = jSONObject.get(next);
                if (JSONObject.class.isInstance(obj2) && JSONObject.class.isInstance(obj)) {
                    zzl((JSONObject) obj2, (JSONObject) obj);
                }
            } catch (JSONException unused) {
                jSONObject.put(next, obj);
            }
        }
    }

    public final void zzm(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzq zzqVar, @Nullable String str, @Nullable String str2) {
        if (str2 != null) {
            zzm.zzj(str2);
        }
        zzE(viewGroup, zzqVar, str, -65536, ViewCompat.MEASURED_STATE_MASK);
    }

    public final void zzn(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzq zzqVar, @Nullable String str) {
        zzE(viewGroup, zzqVar, "Ads by Google", ViewCompat.MEASURED_STATE_MASK, -1);
    }

    public final void zzo(Context context, @Nullable String str, String str2, Bundle bundle, boolean z8) {
        zzx(context, str, "gmob-apps", bundle, true, new zze() { // from class: com.google.android.gms.ads.internal.util.client.zzc
            @Override // com.google.android.gms.ads.internal.util.client.zze
            public final boolean zza(String str3) {
                new zzd(zzf.this, str3).start();
                return true;
            }
        });
    }
}

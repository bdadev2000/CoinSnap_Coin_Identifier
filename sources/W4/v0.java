package w4;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustAdRevenue;
import com.adjust.sdk.AdjustConfig;
import com.adjust.sdk.AdjustEvent;
import com.applovin.sdk.AppLovinEventParameters;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.tools.arruler.photomeasure.camera.ruler.R;
import g4.C2296f;
import java.io.IOException;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Currency;
import k4.C2434c;
import k4.InterfaceC2433b;
import n1.C2475f;
import q1.C2639a;
import u1.AbstractC2748a;
import x0.AbstractC2914a;
import z.AbstractC2965e;

/* loaded from: classes2.dex */
public abstract class v0 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f23972a = true;
    public static Field b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f23973c;

    public static boolean C(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static int D(int i9) {
        int d2 = AbstractC2965e.d(i9);
        if (d2 != 0) {
            int i10 = 1;
            if (d2 != 1) {
                i10 = 2;
                if (d2 != 2) {
                    i10 = 3;
                    if (d2 != 3) {
                        i10 = 4;
                        if (d2 != 4) {
                            if (d2 == 5) {
                                return 5;
                            }
                            throw new IllegalArgumentException("Could not convert " + Q7.n0.z(i9) + " to int");
                        }
                    }
                }
            }
            return i10;
        }
        return 0;
    }

    public static void E(Parcel parcel, Parcelable parcelable) {
        if (parcelable != null) {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
    }

    public static float a(float f9) {
        if (f9 <= 0.04045f) {
            return f9 / 12.92f;
        }
        return (float) Math.pow((f9 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static float b(float f9) {
        if (f9 <= 0.0031308f) {
            return f9 * 12.92f;
        }
        return (float) ((Math.pow(f9, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static final void c(l8.a aVar, l8.b bVar, String str) {
        l8.c.f21648i.fine(bVar.b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + aVar.f21639a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, w8.y, w8.f] */
    public static void d(long j7, w8.f fVar, int i9, ArrayList arrayList, int i10, int i11, ArrayList arrayList2) {
        boolean z8;
        int i12;
        int i13;
        int i14;
        long j9;
        Object obj;
        long j10;
        int i15 = i9;
        int i16 = 0;
        int i17 = 1;
        if (i10 < i11) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            if (i10 < i11) {
                int i18 = i10;
                while (true) {
                    int i19 = i18 + 1;
                    if (((w8.i) arrayList.get(i18)).c() >= i15) {
                        if (i19 >= i11) {
                            break;
                        } else {
                            i18 = i19;
                        }
                    } else {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                }
            }
            w8.i iVar = (w8.i) arrayList.get(i10);
            w8.i iVar2 = (w8.i) arrayList.get(i11 - 1);
            if (i15 == iVar.c()) {
                int intValue = ((Number) arrayList2.get(i10)).intValue();
                int i20 = i10 + 1;
                w8.i iVar3 = (w8.i) arrayList.get(i20);
                i12 = i20;
                i13 = intValue;
                iVar = iVar3;
            } else {
                i12 = i10;
                i13 = -1;
            }
            if (iVar.f(i15) != iVar2.f(i15)) {
                int i21 = i12 + 1;
                if (i21 < i11) {
                    while (true) {
                        int i22 = i21 + 1;
                        if (((w8.i) arrayList.get(i21 - 1)).f(i15) != ((w8.i) arrayList.get(i21)).f(i15)) {
                            i17++;
                        }
                        if (i22 >= i11) {
                            break;
                        } else {
                            i21 = i22;
                        }
                    }
                }
                long j11 = 4;
                long j12 = (i17 * 2) + (fVar.f24014c / j11) + j7 + 2;
                fVar.q(i17);
                fVar.q(i13);
                if (i12 < i11) {
                    int i23 = i12;
                    while (true) {
                        int i24 = i23 + 1;
                        byte f9 = ((w8.i) arrayList.get(i23)).f(i15);
                        if (i23 == i12 || f9 != ((w8.i) arrayList.get(i23 - 1)).f(i15)) {
                            fVar.q(f9 & 255);
                        }
                        if (i24 >= i11) {
                            break;
                        } else {
                            i23 = i24;
                        }
                    }
                }
                w8.f fVar2 = new Object();
                while (i12 < i11) {
                    byte f10 = ((w8.i) arrayList.get(i12)).f(i15);
                    int i25 = i12 + 1;
                    if (i25 < i11) {
                        int i26 = i25;
                        while (true) {
                            int i27 = i26 + 1;
                            if (f10 != ((w8.i) arrayList.get(i26)).f(i15)) {
                                i14 = i26;
                                break;
                            } else if (i27 >= i11) {
                                break;
                            } else {
                                i26 = i27;
                            }
                        }
                    }
                    i14 = i11;
                    if (i25 == i14 && i15 + 1 == ((w8.i) arrayList.get(i12)).c()) {
                        fVar.q(((Number) arrayList2.get(i12)).intValue());
                        j9 = j12;
                        obj = fVar2;
                        j10 = j11;
                    } else {
                        fVar.q(((int) ((fVar2.f24014c / j11) + j12)) * (-1));
                        j9 = j12;
                        obj = fVar2;
                        j10 = j11;
                        d(j12, fVar2, i15 + 1, arrayList, i12, i14, arrayList2);
                    }
                    i12 = i14;
                    fVar2 = obj;
                    j11 = j10;
                    j12 = j9;
                }
                fVar.z(fVar2);
                return;
            }
            int min = Math.min(iVar.c(), iVar2.c());
            if (i15 < min) {
                int i28 = i15;
                while (true) {
                    int i29 = i28 + 1;
                    if (iVar.f(i28) != iVar2.f(i28)) {
                        break;
                    }
                    i16++;
                    if (i29 >= min) {
                        break;
                    } else {
                        i28 = i29;
                    }
                }
            }
            long j13 = 4;
            long j14 = (fVar.f24014c / j13) + j7 + 2 + i16 + 1;
            fVar.q(-i16);
            fVar.q(i13);
            int i30 = i15 + i16;
            if (i15 < i30) {
                while (true) {
                    int i31 = i15 + 1;
                    fVar.q(iVar.f(i15) & 255);
                    if (i31 >= i30) {
                        break;
                    } else {
                        i15 = i31;
                    }
                }
            }
            if (i12 + 1 == i11) {
                if (i30 == ((w8.i) arrayList.get(i12)).c()) {
                    fVar.q(((Number) arrayList2.get(i12)).intValue());
                    return;
                }
                throw new IllegalStateException("Check failed.".toString());
            }
            ?? obj2 = new Object();
            fVar.q(((int) ((obj2.f24014c / j13) + j14)) * (-1));
            d(j14, obj2, i30, arrayList, i12, i11, arrayList2);
            fVar.z(obj2);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.work.e e(byte[] r7) {
        /*
            androidx.work.e r0 = new androidx.work.e
            r0.<init>()
            if (r7 != 0) goto L8
            return r0
        L8:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4b
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4b
            int r7 = r2.readInt()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
        L17:
            if (r7 <= 0) goto L36
            java.lang.String r3 = r2.readUTF()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            boolean r4 = r2.readBoolean()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            androidx.work.d r5 = new androidx.work.d     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r5.<init>(r3, r4)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            java.util.HashSet r3 = r0.f5211a     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r3.add(r5)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            int r7 = r7 + (-1)
            goto L17
        L32:
            r7 = move-exception
            goto L60
        L34:
            r7 = move-exception
            goto L4f
        L36:
            r2.close()     // Catch: java.io.IOException -> L3a
            goto L3e
        L3a:
            r7 = move-exception
            r7.printStackTrace()
        L3e:
            r1.close()     // Catch: java.io.IOException -> L42
            goto L5f
        L42:
            r7 = move-exception
            r7.printStackTrace()
            goto L5f
        L47:
            r0 = move-exception
            r2 = r7
            r7 = r0
            goto L60
        L4b:
            r2 = move-exception
            r6 = r2
            r2 = r7
            r7 = r6
        L4f:
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L5c
            r2.close()     // Catch: java.io.IOException -> L58
            goto L5c
        L58:
            r7 = move-exception
            r7.printStackTrace()
        L5c:
            r1.close()     // Catch: java.io.IOException -> L42
        L5f:
            return r0
        L60:
            if (r2 == 0) goto L6a
            r2.close()     // Catch: java.io.IOException -> L66
            goto L6a
        L66:
            r0 = move-exception
            r0.printStackTrace()
        L6a:
            r1.close()     // Catch: java.io.IOException -> L6e
            goto L72
        L6e:
            r0 = move-exception
            r0.printStackTrace()
        L72:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.v0.e(byte[]):androidx.work.e");
    }

    public static final double f(double d2, P7.c cVar, P7.c cVar2) {
        G7.j.e(cVar2, "targetUnit");
        long convert = cVar2.b.convert(1L, cVar.b);
        if (convert > 0) {
            return d2 * convert;
        }
        return d2 / r8.convert(1L, r9);
    }

    public static final long g(long j7, P7.c cVar, P7.c cVar2) {
        G7.j.e(cVar, "sourceUnit");
        G7.j.e(cVar2, "targetUnit");
        return cVar2.b.convert(j7, cVar.b);
    }

    public static AdError h(int i9, String str) {
        return new AdError(i9, str, "com.google.ads.mediation.pangle");
    }

    public static AdError i(int i9, String str) {
        return new AdError(i9, str, "com.pangle.ads");
    }

    public static boolean j() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            C2296f.c();
            C2296f c9 = C2296f.c();
            c9.a();
            Context context = c9.f20433a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    public static int k(float f9, int i9, int i10) {
        if (i9 == i10) {
            return i9;
        }
        if (f9 <= 0.0f) {
            return i9;
        }
        if (f9 >= 1.0f) {
            return i10;
        }
        float f10 = ((i9 >> 24) & 255) / 255.0f;
        float f11 = ((i10 >> 24) & 255) / 255.0f;
        float a6 = a(((i9 >> 16) & 255) / 255.0f);
        float a9 = a(((i9 >> 8) & 255) / 255.0f);
        float a10 = a((i9 & 255) / 255.0f);
        float a11 = a(((i10 >> 16) & 255) / 255.0f);
        float a12 = a(((i10 >> 8) & 255) / 255.0f);
        float a13 = a((i10 & 255) / 255.0f);
        float a14 = AbstractC2914a.a(f11, f10, f9, f10);
        float a15 = AbstractC2914a.a(a11, a6, f9, a6);
        float a16 = AbstractC2914a.a(a12, a9, f9, a9);
        float a17 = AbstractC2914a.a(a13, a10, f9, a10);
        float b8 = b(a15) * 255.0f;
        float b9 = b(a16) * 255.0f;
        return Math.round(b(a17) * 255.0f) | (Math.round(b8) << 16) | (Math.round(a14 * 255.0f) << 24) | (Math.round(b9) << 8);
    }

    public static final String l(long j7) {
        String k6;
        if (j7 <= -999500000) {
            k6 = Q7.n0.k(new StringBuilder(), (j7 - 500000000) / 1000000000, " s ");
        } else if (j7 <= -999500) {
            k6 = Q7.n0.k(new StringBuilder(), (j7 - 500000) / 1000000, " ms");
        } else if (j7 <= 0) {
            k6 = Q7.n0.k(new StringBuilder(), (j7 - 500) / 1000, " µs");
        } else if (j7 < 999500) {
            k6 = Q7.n0.k(new StringBuilder(), (j7 + 500) / 1000, " µs");
        } else if (j7 < 999500000) {
            k6 = Q7.n0.k(new StringBuilder(), (j7 + 500000) / 1000000, " ms");
        } else {
            k6 = Q7.n0.k(new StringBuilder(), (j7 + 500000000) / 1000000000, " s ");
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{k6}, 1));
    }

    public static i8.A m(String str) {
        if (str.equals("http/1.0")) {
            return i8.A.HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return i8.A.HTTP_1_1;
        }
        if (str.equals("h2_prior_knowledge")) {
            return i8.A.H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals("h2")) {
            return i8.A.HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return i8.A.SPDY_3;
        }
        if (str.equals("quic")) {
            return i8.A.QUIC;
        }
        throw new IOException(G7.j.j(str, "Unexpected protocol: "));
    }

    public static int o(int i9) {
        if (i9 == 0) {
            return 1;
        }
        if (i9 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(Q7.n0.f(i9, "Could not convert ", " to BackoffPolicy"));
    }

    public static int p(int i9) {
        if (i9 == 0) {
            return 1;
        }
        if (i9 == 1) {
            return 2;
        }
        if (i9 == 2) {
            return 3;
        }
        if (i9 == 3) {
            return 4;
        }
        if (i9 == 4) {
            return 5;
        }
        if (Build.VERSION.SDK_INT >= 30 && i9 == 5) {
            return 6;
        }
        throw new IllegalArgumentException(Q7.n0.f(i9, "Could not convert ", " to NetworkType"));
    }

    public static int q(int i9) {
        if (i9 == 0) {
            return 1;
        }
        if (i9 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(Q7.n0.f(i9, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    public static int r(int i9) {
        if (i9 == 0) {
            return 1;
        }
        if (i9 == 1) {
            return 2;
        }
        if (i9 == 2) {
            return 3;
        }
        if (i9 == 3) {
            return 4;
        }
        if (i9 == 4) {
            return 5;
        }
        if (i9 == 5) {
            return 6;
        }
        throw new IllegalArgumentException(Q7.n0.f(i9, "Could not convert ", " to State"));
    }

    public static void s(Context context, String str) {
        Log.d("MiaLogEventManager", "User click ad for ad unit " + str + ".");
        Bundle bundle = new Bundle();
        bundle.putString("ad_unit_id", str);
        FirebaseAnalytics.getInstance(context).a(bundle, "event_user_click_ads");
        G7.j.e(context, "context");
        new com.facebook.appevents.l(context, (String) null).d(bundle, "event_user_click_ads");
    }

    public static void t(Context context, String str) {
        float f9 = context.getSharedPreferences("mia_ad_pref", 0).getFloat("KEY_CURRENT_TOTAL_REVENUE_AD", 0.0f);
        Bundle bundle = new Bundle();
        bundle.putFloat(AppMeasurementSdk.ConditionalUserProperty.VALUE, f9);
        FirebaseAnalytics.getInstance(context).a(bundle, str);
        new com.facebook.appevents.l(context, (String) null).d(bundle, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void u(android.content.Intent r19) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.v0.u(android.content.Intent):void");
    }

    public static void v(Context context, AdValue adValue, String str, String str2) {
        float valueMicros = (float) adValue.getValueMicros();
        int precisionType = adValue.getPrecisionType();
        Bundle bundle = new Bundle();
        double d2 = valueMicros;
        bundle.putDouble("valuemicros", d2);
        bundle.putString(AppLovinEventParameters.REVENUE_CURRENCY, "USD");
        bundle.putInt("precision", precisionType);
        bundle.putString("adunitid", str);
        bundle.putString("network", str2);
        double d9 = d2 / 1000000.0d;
        Bundle bundle2 = new Bundle();
        bundle2.putDouble(AppMeasurementSdk.ConditionalUserProperty.VALUE, d9);
        bundle2.putString(AppLovinEventParameters.REVENUE_CURRENCY, "USD");
        bundle2.putInt("precision", precisionType);
        bundle2.putString("adunitid", str);
        bundle2.putString("network", str2);
        if (((C2639a) C2475f.p().f21833c).b != null && ((C2639a) C2475f.p().f21833c).b.f624c) {
            ((C2639a) C2475f.p().f21833c).b.getClass();
            AdjustEvent adjustEvent = new AdjustEvent("");
            adjustEvent.setRevenue(d9, "USD");
            Adjust.trackEvent(adjustEvent);
        }
        FirebaseAnalytics.getInstance(context).a(bundle2, "paid_ad_impression_value");
        G7.j.e(context, "context");
        new com.facebook.appevents.l(context, (String) null).d(bundle2, "paid_ad_impression_value");
        FirebaseAnalytics.getInstance(context).a(bundle, "paid_ad_impression");
        new com.facebook.appevents.l(context, (String) null).d(bundle, "paid_ad_impression");
        context.getSharedPreferences("mia_ad_pref", 0).edit().putFloat("KEY_CURRENT_TOTAL_REVENUE_AD", (float) (d9 + r5.getFloat("KEY_CURRENT_TOTAL_REVENUE_AD", 0.0f))).apply();
        t(context, "event_current_total_revenue_ad");
        float f9 = AbstractC2748a.b + valueMicros;
        AbstractC2748a.b = f9;
        context.getSharedPreferences("mia_ad_pref", 0).edit().putFloat("KEY_CURRENT_TOTAL_REVENUE_001_AD", f9).apply();
        float f10 = AbstractC2748a.b / 1000000.0f;
        if (f10 >= 0.01d) {
            AbstractC2748a.b = 0.0f;
            context.getSharedPreferences("mia_ad_pref", 0).edit().putFloat("KEY_CURRENT_TOTAL_REVENUE_001_AD", 0.0f).apply();
            Bundle bundle3 = new Bundle();
            bundle3.putFloat(AppMeasurementSdk.ConditionalUserProperty.VALUE, f10);
            FirebaseAnalytics.getInstance(context).a(bundle3, "paid_ad_impression_value_001");
            new com.facebook.appevents.l(context, (String) null).d(bundle3, "paid_ad_impression_value_001");
        }
        long j7 = context.getSharedPreferences("mia_ad_pref", 0).getLong("KEY_INSTALL_TIME", 0L);
        if (!context.getSharedPreferences("mia_ad_pref", 0).getBoolean("KEY_PUSH_EVENT_REVENUE_3_DAY", false) && System.currentTimeMillis() - j7 >= 259200000) {
            Log.d("MiaLogEventManager", "logTotalRevenueAdAt3DaysIfNeed: ");
            t(context, "event_total_revenue_ad_in_3_days");
            context.getSharedPreferences("mia_ad_pref", 0).edit().putBoolean("KEY_PUSH_EVENT_REVENUE_3_DAY", true).apply();
        }
        long j9 = context.getSharedPreferences("mia_ad_pref", 0).getLong("KEY_INSTALL_TIME", 0L);
        if (!context.getSharedPreferences("mia_ad_pref", 0).getBoolean("KEY_PUSH_EVENT_REVENUE_7_DAY", false) && System.currentTimeMillis() - j9 >= 604800000) {
            Log.d("MiaLogEventManager", "logTotalRevenueAdAt7DaysIfNeed: ");
            t(context, "event_total_revenue_ad_in_7_days");
            context.getSharedPreferences("mia_ad_pref", 0).edit().putBoolean("KEY_PUSH_EVENT_REVENUE_7_DAY", true).apply();
        }
        if (r8.k.b) {
            AdjustAdRevenue adjustAdRevenue = new AdjustAdRevenue(AdjustConfig.AD_REVENUE_ADMOB);
            adjustAdRevenue.setRevenue(Double.valueOf(adValue.getValueMicros() / 1000000.0d), adValue.getCurrencyCode());
            Adjust.trackAdRevenue(adjustAdRevenue);
        }
        float valueMicros2 = ((((float) adValue.getValueMicros()) * 1.0f) / 1000000.0f) * 25000.0f;
        com.facebook.appevents.l lVar = new com.facebook.appevents.l(context, (String) null);
        BigDecimal valueOf = BigDecimal.valueOf(valueMicros2);
        Currency currency = Currency.getInstance("VND");
        if (!O2.a.b(lVar)) {
            try {
                if (!O2.a.b(lVar)) {
                    try {
                        if (E2.h.a()) {
                            Log.w(com.facebook.appevents.l.f13492c, "You are logging purchase events while auto-logging of in-app purchase is enabled in the SDK. Make sure you don't log duplicate events");
                        }
                        lVar.g(valueOf, currency, null, false);
                    } catch (Throwable th) {
                        O2.a.a(lVar, th);
                    }
                }
            } catch (Throwable th2) {
                O2.a.a(lVar, th2);
            }
        }
    }

    public static void w(AdValue adValue, String str, String str2) {
        AdjustEvent adjustEvent = new AdjustEvent(str2);
        adjustEvent.setRevenue((((float) adValue.getValueMicros()) * 1.0f) / 1000000.0f, "USD");
        adjustEvent.setOrderId(str);
        Adjust.trackEvent(adjustEvent);
    }

    public static void x(Bundle bundle, String str) {
        String str2;
        try {
            C2296f.c();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            String str3 = null;
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e4) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e4);
                }
            }
            if (bundle.containsKey("google.c.a.udt")) {
                str3 = bundle.getString("google.c.a.udt");
            }
            if (str3 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(str3));
                } catch (NumberFormatException e9) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e9);
                }
            }
            if (U4.s.j(bundle)) {
                str2 = "display";
            } else {
                str2 = DataSchemeDataSource.SCHEME_DATA;
            }
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            InterfaceC2433b interfaceC2433b = (InterfaceC2433b) C2296f.c().b(InterfaceC2433b.class);
            if (interfaceC2433b != null) {
                ((C2434c) interfaceC2433b).a(AppMeasurement.FCM_ORIGIN, str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0134, code lost:
    
        continue;
     */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, w8.f] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static w8.q y(w8.i... r13) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.v0.y(w8.i[]):w8.q");
    }

    public static final void z(View view, f.y yVar) {
        G7.j.e(view, "<this>");
        G7.j.e(yVar, "onBackPressedDispatcherOwner");
        view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, yVar);
    }

    public void A(View view, float f9) {
        if (f23972a) {
            try {
                M0.I.b(view, f9);
                return;
            } catch (NoSuchMethodError unused) {
                f23972a = false;
            }
        }
        view.setAlpha(f9);
    }

    public void B(View view, int i9) {
        if (!f23973c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f23973c = true;
        }
        Field field = b;
        if (field != null) {
            try {
                b.setInt(view, i9 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public float n(View view) {
        if (f23972a) {
            try {
                return M0.I.a(view);
            } catch (NoSuchMethodError unused) {
                f23972a = false;
            }
        }
        return view.getAlpha();
    }
}

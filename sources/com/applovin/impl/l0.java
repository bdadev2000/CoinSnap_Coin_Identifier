package com.applovin.impl;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class l0 {
    private static boolean a = true;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f5796b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static final Collection f5797c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private static boolean f5798d = false;

    /* renamed from: e, reason: collision with root package name */
    private static a f5799e = null;

    /* loaded from: classes.dex */
    public static class a {
        private boolean a;

        /* renamed from: b, reason: collision with root package name */
        private String f5800b = "";

        /* renamed from: c, reason: collision with root package name */
        private EnumC0020a f5801c = EnumC0020a.NOT_SET;

        /* renamed from: com.applovin.impl.l0$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public enum EnumC0020a {
            NOT_SET("dnt_not_set"),
            ON("dnt_on"),
            OFF("dnt_off");

            private final String a;

            EnumC0020a(String str) {
                this.a = str;
            }

            public String b() {
                return this.a;
            }
        }

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public EnumC0020a b() {
            return this.f5801c;
        }

        public boolean c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!aVar.a(this) || c() != aVar.c()) {
                return false;
            }
            String a = a();
            String a10 = aVar.a();
            if (a != null ? !a.equals(a10) : a10 != null) {
                return false;
            }
            EnumC0020a b3 = b();
            EnumC0020a b10 = aVar.b();
            return b3 != null ? b3.equals(b10) : b10 == null;
        }

        public int hashCode() {
            int i10 = c() ? 79 : 97;
            String a = a();
            int hashCode = ((i10 + 59) * 59) + (a == null ? 43 : a.hashCode());
            EnumC0020a b3 = b();
            return (hashCode * 59) + (b3 != null ? b3.hashCode() : 43);
        }

        public String toString() {
            return "AdvertisingInfoCollector.AdvertisingIdInformation(adTrackingLimited=" + c() + ", advertisingId=" + a() + ", dntCode=" + b() + ")";
        }

        public String a() {
            return this.f5800b;
        }

        public void a(boolean z10) {
            this.a = z10;
        }

        public void a(String str) {
            this.f5800b = str;
        }

        public void a(EnumC0020a enumC0020a) {
            this.f5801c = enumC0020a;
        }
    }

    private static a a(Context context) {
        a aVar;
        HashSet hashSet;
        zp.a();
        Object obj = f5796b;
        synchronized (obj) {
            if (f5798d) {
                return f5799e;
            }
            Collection collection = f5797c;
            boolean isEmpty = collection.isEmpty();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            collection.add(countDownLatch);
            if (isEmpty) {
                a c10 = c(context);
                synchronized (obj) {
                    f5798d = true;
                    f5799e = c10;
                    hashSet = new HashSet(collection);
                    collection.clear();
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((CountDownLatch) it.next()).countDown();
                }
            }
            try {
                if (!countDownLatch.await(60L, TimeUnit.SECONDS)) {
                    com.applovin.impl.sdk.t.h("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }: collection timeout");
                }
            } catch (InterruptedException e2) {
                com.applovin.impl.sdk.t.c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", e2);
            }
            synchronized (f5796b) {
                aVar = f5799e;
            }
            return aVar;
        }
    }

    public static a b(Context context) {
        return a(context);
    }

    private static a c(Context context) {
        a collectGoogleAdvertisingInfo = collectGoogleAdvertisingInfo(context);
        if (collectGoogleAdvertisingInfo == null) {
            collectGoogleAdvertisingInfo = collectFireOSAdvertisingInfo(context);
        }
        if (collectGoogleAdvertisingInfo == null) {
            return new a();
        }
        return collectGoogleAdvertisingInfo;
    }

    @Nullable
    private static a collectFireOSAdvertisingInfo(Context context) {
        boolean z10;
        a.EnumC0020a enumC0020a;
        if (a) {
            try {
                ContentResolver contentResolver = context.getContentResolver();
                a aVar = new a();
                aVar.a(StringUtils.emptyIfNull(Settings.Secure.getString(contentResolver, "advertising_id")));
                if (Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                aVar.a(z10);
                if (z10) {
                    enumC0020a = a.EnumC0020a.ON;
                } else {
                    enumC0020a = a.EnumC0020a.OFF;
                }
                aVar.a(enumC0020a);
                return aVar;
            } catch (Settings.SettingNotFoundException e2) {
                com.applovin.impl.sdk.t.c("DataCollector", "Unable to determine if Fire OS limited ad tracking is turned on", e2);
            } catch (Throwable th2) {
                com.applovin.impl.sdk.t.c("DataCollector", "Unable to collect Fire OS IDFA", th2);
            }
        }
        a = false;
        return null;
    }

    @Nullable
    private static a collectGoogleAdvertisingInfo(Context context) {
        a.EnumC0020a enumC0020a;
        zp.a();
        if (a()) {
            try {
                a aVar = new a();
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
                boolean isLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
                aVar.a(isLimitAdTrackingEnabled);
                if (isLimitAdTrackingEnabled) {
                    enumC0020a = a.EnumC0020a.ON;
                } else {
                    enumC0020a = a.EnumC0020a.OFF;
                }
                aVar.a(enumC0020a);
                aVar.a(advertisingIdInfo.getId());
                return aVar;
            } catch (Throwable th2) {
                if (!AppLovinSdkUtils.isFireOS(context)) {
                    com.applovin.impl.sdk.t.c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", th2);
                    return null;
                }
                return null;
            }
        }
        if (!AppLovinSdkUtils.isFireOS(context)) {
            com.applovin.impl.sdk.t.h("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }");
            return null;
        }
        return null;
    }

    public static boolean a() {
        return zp.a("com.google.android.gms.ads.identifier.AdvertisingIdClient");
    }
}

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

    /* renamed from: a, reason: collision with root package name */
    private static boolean f24957a = true;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f24958b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static final Collection f24959c = new HashSet();
    private static boolean d = false;
    private static a e = null;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f24960a;

        /* renamed from: b, reason: collision with root package name */
        private String f24961b = "";

        /* renamed from: c, reason: collision with root package name */
        private EnumC0081a f24962c = EnumC0081a.NOT_SET;

        /* renamed from: com.applovin.impl.l0$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public enum EnumC0081a {
            NOT_SET("dnt_not_set"),
            ON("dnt_on"),
            OFF("dnt_off");


            /* renamed from: a, reason: collision with root package name */
            private final String f24966a;

            EnumC0081a(String str) {
                this.f24966a = str;
            }

            public String b() {
                return this.f24966a;
            }
        }

        public String a() {
            return this.f24961b;
        }

        public EnumC0081a b() {
            return this.f24962c;
        }

        public boolean c() {
            return this.f24960a;
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
            String a2 = a();
            String a3 = aVar.a();
            if (a2 != null ? !a2.equals(a3) : a3 != null) {
                return false;
            }
            EnumC0081a b2 = b();
            EnumC0081a b3 = aVar.b();
            return b2 != null ? b2.equals(b3) : b3 == null;
        }

        public int hashCode() {
            int i2 = c() ? 79 : 97;
            String a2 = a();
            int hashCode = ((i2 + 59) * 59) + (a2 == null ? 43 : a2.hashCode());
            EnumC0081a b2 = b();
            return (hashCode * 59) + (b2 != null ? b2.hashCode() : 43);
        }

        public String toString() {
            return "AdvertisingInfoCollector.AdvertisingIdInformation(adTrackingLimited=" + c() + ", advertisingId=" + a() + ", dntCode=" + b() + ")";
        }

        public void a(EnumC0081a enumC0081a) {
            this.f24962c = enumC0081a;
        }

        public void a(String str) {
            this.f24961b = str;
        }

        public void a(boolean z2) {
            this.f24960a = z2;
        }

        public boolean a(Object obj) {
            return obj instanceof a;
        }
    }

    private static a a(Context context) {
        a aVar;
        HashSet hashSet;
        yp.a();
        Object obj = f24958b;
        synchronized (obj) {
            try {
                if (d) {
                    return e;
                }
                Collection collection = f24959c;
                boolean isEmpty = collection.isEmpty();
                CountDownLatch countDownLatch = new CountDownLatch(1);
                collection.add(countDownLatch);
                if (isEmpty) {
                    a c2 = c(context);
                    synchronized (obj) {
                        d = true;
                        e = c2;
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
                        com.applovin.impl.sdk.n.h("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }: collection timeout");
                    }
                } catch (InterruptedException e2) {
                    com.applovin.impl.sdk.n.c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", e2);
                }
                synchronized (f24958b) {
                    aVar = e;
                }
                return aVar;
            } catch (Throwable th) {
                throw th;
            }
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
        return collectGoogleAdvertisingInfo == null ? new a() : collectGoogleAdvertisingInfo;
    }

    @Nullable
    private static a collectFireOSAdvertisingInfo(Context context) {
        if (f24957a) {
            try {
                ContentResolver contentResolver = context.getContentResolver();
                a aVar = new a();
                aVar.a(StringUtils.emptyIfNull(Settings.Secure.getString(contentResolver, "advertising_id")));
                boolean z2 = Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 0;
                aVar.a(z2);
                aVar.a(z2 ? a.EnumC0081a.ON : a.EnumC0081a.OFF);
                return aVar;
            } catch (Settings.SettingNotFoundException e2) {
                com.applovin.impl.sdk.n.c("DataCollector", "Unable to determine if Fire OS limited ad tracking is turned on", e2);
            } catch (Throwable th) {
                com.applovin.impl.sdk.n.c("DataCollector", "Unable to collect Fire OS IDFA", th);
            }
        }
        f24957a = false;
        return null;
    }

    @Nullable
    private static a collectGoogleAdvertisingInfo(Context context) {
        yp.a();
        if (!a()) {
            if (AppLovinSdkUtils.isFireOS(context)) {
                return null;
            }
            com.applovin.impl.sdk.n.h("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }");
            return null;
        }
        try {
            a aVar = new a();
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            boolean isLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
            aVar.a(isLimitAdTrackingEnabled);
            aVar.a(isLimitAdTrackingEnabled ? a.EnumC0081a.ON : a.EnumC0081a.OFF);
            aVar.a(advertisingIdInfo.getId());
            return aVar;
        } catch (Throwable th) {
            if (AppLovinSdkUtils.isFireOS(context)) {
                return null;
            }
            com.applovin.impl.sdk.n.c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", th);
            return null;
        }
    }

    public static boolean a() {
        return yp.a("com.google.android.gms.ads.identifier.AdvertisingIdClient");
    }
}

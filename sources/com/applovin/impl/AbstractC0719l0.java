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

/* renamed from: com.applovin.impl.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0719l0 {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f8760a = true;
    private static final Object b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static final Collection f8761c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private static boolean f8762d = false;

    /* renamed from: e, reason: collision with root package name */
    private static a f8763e = null;

    /* renamed from: com.applovin.impl.l0$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f8764a;
        private String b = "";

        /* renamed from: c, reason: collision with root package name */
        private EnumC0020a f8765c = EnumC0020a.NOT_SET;

        /* renamed from: com.applovin.impl.l0$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public enum EnumC0020a {
            NOT_SET("dnt_not_set"),
            ON("dnt_on"),
            OFF("dnt_off");


            /* renamed from: a, reason: collision with root package name */
            private final String f8769a;

            EnumC0020a(String str) {
                this.f8769a = str;
            }

            public String b() {
                return this.f8769a;
            }
        }

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public EnumC0020a b() {
            return this.f8765c;
        }

        public boolean c() {
            return this.f8764a;
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
            String a6 = a();
            String a9 = aVar.a();
            if (a6 != null ? !a6.equals(a9) : a9 != null) {
                return false;
            }
            EnumC0020a b = b();
            EnumC0020a b8 = aVar.b();
            if (b != null ? b.equals(b8) : b8 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i9;
            int hashCode;
            if (c()) {
                i9 = 79;
            } else {
                i9 = 97;
            }
            String a6 = a();
            int i10 = (i9 + 59) * 59;
            int i11 = 43;
            if (a6 == null) {
                hashCode = 43;
            } else {
                hashCode = a6.hashCode();
            }
            int i12 = i10 + hashCode;
            EnumC0020a b = b();
            int i13 = i12 * 59;
            if (b != null) {
                i11 = b.hashCode();
            }
            return i13 + i11;
        }

        public String toString() {
            return "AdvertisingInfoCollector.AdvertisingIdInformation(adTrackingLimited=" + c() + ", advertisingId=" + a() + ", dntCode=" + b() + ")";
        }

        public String a() {
            return this.b;
        }

        public void a(boolean z8) {
            this.f8764a = z8;
        }

        public void a(String str) {
            this.b = str;
        }

        public void a(EnumC0020a enumC0020a) {
            this.f8765c = enumC0020a;
        }
    }

    private static a a(Context context) {
        a aVar;
        HashSet hashSet;
        zp.a();
        Object obj = b;
        synchronized (obj) {
            try {
                if (f8762d) {
                    return f8763e;
                }
                Collection collection = f8761c;
                boolean isEmpty = collection.isEmpty();
                CountDownLatch countDownLatch = new CountDownLatch(1);
                collection.add(countDownLatch);
                if (isEmpty) {
                    a c9 = c(context);
                    synchronized (obj) {
                        f8762d = true;
                        f8763e = c9;
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
                } catch (InterruptedException e4) {
                    com.applovin.impl.sdk.t.c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", e4);
                }
                synchronized (b) {
                    aVar = f8763e;
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
        if (collectGoogleAdvertisingInfo == null) {
            return new a();
        }
        return collectGoogleAdvertisingInfo;
    }

    @Nullable
    private static a collectFireOSAdvertisingInfo(Context context) {
        boolean z8;
        a.EnumC0020a enumC0020a;
        if (f8760a) {
            try {
                ContentResolver contentResolver = context.getContentResolver();
                a aVar = new a();
                aVar.a(StringUtils.emptyIfNull(Settings.Secure.getString(contentResolver, "advertising_id")));
                if (Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                aVar.a(z8);
                if (z8) {
                    enumC0020a = a.EnumC0020a.ON;
                } else {
                    enumC0020a = a.EnumC0020a.OFF;
                }
                aVar.a(enumC0020a);
                return aVar;
            } catch (Settings.SettingNotFoundException e4) {
                com.applovin.impl.sdk.t.c("DataCollector", "Unable to determine if Fire OS limited ad tracking is turned on", e4);
            } catch (Throwable th) {
                com.applovin.impl.sdk.t.c("DataCollector", "Unable to collect Fire OS IDFA", th);
            }
        }
        f8760a = false;
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
            } catch (Throwable th) {
                if (!AppLovinSdkUtils.isFireOS(context)) {
                    com.applovin.impl.sdk.t.c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", th);
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

package com.adjust.sdk;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.LocaleList;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.autofill.HintConstants;
import com.adjust.sdk.GooglePlayServicesClient;
import com.adjust.sdk.scheduler.AsyncTaskExecutor;
import com.adjust.sdk.scheduler.SingleThreadFutureScheduler;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* loaded from: classes7.dex */
public class Util {
    private static final String fieldReadErrorMessage = "Unable to read '%s' field in migration device with message (%s)";
    public static final DecimalFormat SecondsDisplayFormat = newLocalDecimalFormat();
    private static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'Z";
    public static final SimpleDateFormat dateFormatter = new SimpleDateFormat(DATE_FORMAT, Locale.US);
    private static volatile SingleThreadFutureScheduler playAdIdScheduler = null;

    /* loaded from: classes7.dex */
    public class a implements Callable<Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f256a;

        public a(Context context) {
            this.f256a = context;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            try {
                return Reflection.getAdvertisingInfoObject(this.f256a);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* loaded from: classes7.dex */
    public class b implements Callable<String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f257a;
        public final /* synthetic */ Object b;

        public b(Context context, Object obj) {
            this.f257a = context;
            this.b = obj;
        }

        @Override // java.util.concurrent.Callable
        public final String call() {
            return Reflection.getPlayAdId(this.f257a, this.b);
        }
    }

    /* loaded from: classes7.dex */
    public class c implements Callable<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f258a;
        public final /* synthetic */ Object b;

        public c(Context context, Object obj) {
            this.f258a = context;
            this.b = obj;
        }

        @Override // java.util.concurrent.Callable
        public final Boolean call() {
            return Reflection.isPlayTrackingEnabled(this.f258a, this.b);
        }
    }

    /* loaded from: classes7.dex */
    public class d extends AsyncTaskExecutor<Context, String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ OnDeviceIdsRead f259a;

        public d(OnDeviceIdsRead onDeviceIdsRead) {
            this.f259a = onDeviceIdsRead;
        }

        @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
        public final String doInBackground(Context[] contextArr) {
            ILogger logger = AdjustFactory.getLogger();
            String googleAdId = Util.getGoogleAdId(contextArr[0]);
            logger.debug("GoogleAdId read " + googleAdId, new Object[0]);
            return googleAdId;
        }

        @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
        public final void onPostExecute(String str) {
            this.f259a.onGoogleAdIdRead(str);
        }
    }

    public static boolean canReadNonPlayIds(AdjustConfig adjustConfig) {
        return (adjustConfig.playStoreKidsAppEnabled || adjustConfig.coppaCompliantEnabled) ? false : true;
    }

    public static boolean canReadPlayIds(AdjustConfig adjustConfig) {
        return (adjustConfig.playStoreKidsAppEnabled || adjustConfig.coppaCompliantEnabled) ? false : true;
    }

    public static boolean checkPermission(Context context, String str) {
        try {
            return context.checkCallingOrSelfPermission(str) == 0;
        } catch (Exception e) {
            getLogger().debug("Unable to check permission '%s' with message (%s)", str, e.getMessage());
            return false;
        }
    }

    public static String convertToHex(byte[] bArr) {
        return formatString("%0" + (bArr.length << 1) + "x", new BigInteger(1, bArr));
    }

    public static String createUuid() {
        return UUID.randomUUID().toString();
    }

    public static boolean equalBoolean(Boolean bool, Boolean bool2) {
        return equalObject(bool, bool2);
    }

    public static boolean equalEnum(Enum r0, Enum r1) {
        return equalObject(r0, r1);
    }

    public static boolean equalInt(Integer num, Integer num2) {
        return equalObject(num, num2);
    }

    public static boolean equalLong(Long l, Long l2) {
        return equalObject(l, l2);
    }

    public static boolean equalObject(Object obj, Object obj2) {
        return (obj == null || obj2 == null) ? obj == null && obj2 == null : obj.equals(obj2);
    }

    public static boolean equalString(String str, String str2) {
        return equalObject(str, str2);
    }

    public static boolean equalsDouble(Double d2, Double d3) {
        return (d2 == null || d3 == null) ? d2 == null && d3 == null : Double.doubleToLongBits(d2.doubleValue()) == Double.doubleToLongBits(d3.doubleValue());
    }

    public static String formatString(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static Object getAdvertisingInfoObject(Context context, long j) {
        return runSyncInPlayAdIdSchedulerWithTimeout(context, new a(context), j);
    }

    public static String getAndroidId(Context context) {
        return AndroidIdUtil.getAndroidId(context);
    }

    public static int getConnectivityType(Context context) {
        ConnectivityManager connectivityManager;
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        try {
            connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Exception e) {
            getLogger().warn("Couldn't read connectivity type (%s)", e.getMessage());
        }
        if (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return -1;
        }
        if (networkCapabilities.hasTransport(1)) {
            return 1;
        }
        if (networkCapabilities.hasTransport(0)) {
            return 0;
        }
        if (networkCapabilities.hasTransport(3)) {
            return 3;
        }
        if (networkCapabilities.hasTransport(4)) {
            return 4;
        }
        if (networkCapabilities.hasTransport(2)) {
            return 2;
        }
        if (networkCapabilities.hasTransport(5)) {
            return 5;
        }
        return networkCapabilities.hasTransport(6) ? 6 : -1;
    }

    public static String getCpuAbi() {
        return null;
    }

    public static String getFireAdvertisingId(ContentResolver contentResolver) {
        if (contentResolver == null) {
            return null;
        }
        try {
            return Settings.Secure.getString(contentResolver, "advertising_id");
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getFireAdvertisingId(AdjustConfig adjustConfig) {
        if (adjustConfig.coppaCompliantEnabled) {
            return null;
        }
        return getFireAdvertisingId(adjustConfig.context.getContentResolver());
    }

    public static Boolean getFireTrackingEnabled(ContentResolver contentResolver) {
        try {
            return Boolean.valueOf(Settings.Secure.getInt(contentResolver, "limit_ad_tracking") == 0);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Boolean getFireTrackingEnabled(AdjustConfig adjustConfig) {
        if (adjustConfig.coppaCompliantEnabled) {
            return null;
        }
        return getFireTrackingEnabled(adjustConfig.context.getContentResolver());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getGoogleAdId(Context context) {
        String str;
        Object advertisingInfoObject;
        GooglePlayServicesClient.GooglePlayServicesInfo googlePlayServicesInfo;
        try {
            googlePlayServicesInfo = GooglePlayServicesClient.getGooglePlayServicesInfo(context, 11000L);
        } catch (Exception unused) {
        }
        if (googlePlayServicesInfo != null) {
            str = googlePlayServicesInfo.getGpsAdid();
            return (str != null || (advertisingInfoObject = getAdvertisingInfoObject(context, 11000L)) == null) ? str : getPlayAdId(context, advertisingInfoObject, 1000L);
        }
        str = null;
        if (str != null) {
            return str;
        }
    }

    public static void getGoogleAdId(Context context, OnDeviceIdsRead onDeviceIdsRead) {
        new d(onDeviceIdsRead).execute(context);
    }

    public static Map<String, String> getImeiParameters(AdjustConfig adjustConfig, ILogger iLogger) {
        if (adjustConfig.coppaCompliantEnabled) {
            return null;
        }
        return Reflection.getImeiParameters(adjustConfig.context, iLogger);
    }

    public static Locale getLocale(Configuration configuration) {
        LocaleList locales = configuration.getLocales();
        if (locales == null || locales.isEmpty()) {
            return null;
        }
        return locales.get(0);
    }

    private static ILogger getLogger() {
        return AdjustFactory.getLogger();
    }

    public static String getMcc(Context context) {
        try {
            String networkOperator = ((TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE)).getNetworkOperator();
            if (!TextUtils.isEmpty(networkOperator)) {
                return networkOperator.substring(0, 3);
            }
            AdjustFactory.getLogger().warn("Couldn't receive networkOperator string to read MCC", new Object[0]);
            return null;
        } catch (Exception unused) {
            AdjustFactory.getLogger().warn("Couldn't return mcc", new Object[0]);
            return null;
        }
    }

    public static String getMnc(Context context) {
        try {
            String networkOperator = ((TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE)).getNetworkOperator();
            if (!TextUtils.isEmpty(networkOperator)) {
                return networkOperator.substring(3);
            }
            AdjustFactory.getLogger().warn("Couldn't receive networkOperator string to read MNC", new Object[0]);
            return null;
        } catch (Exception unused) {
            AdjustFactory.getLogger().warn("Couldn't return mnc", new Object[0]);
            return null;
        }
    }

    public static Map<String, String> getOaidParameters(AdjustConfig adjustConfig, ILogger iLogger) {
        if (adjustConfig.coppaCompliantEnabled) {
            return null;
        }
        return Reflection.getOaidParameters(adjustConfig.context, iLogger);
    }

    public static String getPlayAdId(Context context, Object obj, long j) {
        return (String) runSyncInPlayAdIdSchedulerWithTimeout(context, new b(context, obj), j);
    }

    public static String getReasonString(String str, Throwable th) {
        return th != null ? formatString("%s: %s", str, th) : formatString("%s", str);
    }

    public static String getRootCause(Exception exc) {
        if (!hasRootCause(exc)) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        int indexOf = stringWriter2.indexOf("Caused by:");
        return stringWriter2.substring(indexOf, stringWriter2.indexOf("\n", indexOf));
    }

    private static String getSdkPrefix(String str) {
        String[] split;
        if (str != null && str.contains("@") && (split = str.split("@")) != null && split.length == 2) {
            return split[0];
        }
        return null;
    }

    public static String getSdkPrefixPlatform(String str) {
        String[] split;
        String sdkPrefix = getSdkPrefix(str);
        if (sdkPrefix == null || (split = sdkPrefix.split("\\d+", 2)) == null || split.length == 0) {
            return null;
        }
        return split[0];
    }

    public static String getSdkVersion() {
        return Constants.CLIENT_SDK;
    }

    public static String[] getSupportedAbis() {
        return Build.SUPPORTED_ABIS;
    }

    public static long getWaitingTime(int i, BackoffStrategy backoffStrategy) {
        if (i < backoffStrategy.minRetries) {
            return 0L;
        }
        return (long) (Math.min(((long) Math.pow(2.0d, i - r0)) * backoffStrategy.milliSecondMultiplier, backoffStrategy.maxWait) * randomInRange(backoffStrategy.minRange, backoffStrategy.maxRange));
    }

    public static boolean hasRootCause(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString().contains("Caused by:");
    }

    public static String hash(String str, String str2) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            MessageDigest messageDigest = MessageDigest.getInstance(str2);
            messageDigest.update(bytes, 0, bytes.length);
            return convertToHex(messageDigest.digest());
        } catch (Exception unused) {
            return null;
        }
    }

    public static int hashBoolean(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public static int hashDouble(Double d2) {
        if (d2 == null) {
            return 0;
        }
        return d2.hashCode();
    }

    public static int hashEnum(Enum r0) {
        if (r0 == null) {
            return 0;
        }
        return r0.hashCode();
    }

    public static int hashLong(Long l) {
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public static int hashObject(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static int hashString(String str) {
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    private static boolean isEqualGoogleReferrerDetails(ReferrerDetails referrerDetails, ActivityState activityState) {
        return referrerDetails.referrerClickTimestampSeconds == activityState.clickTime && referrerDetails.installBeginTimestampSeconds == activityState.installBegin && referrerDetails.referrerClickTimestampServerSeconds == activityState.clickTimeServer && referrerDetails.installBeginTimestampServerSeconds == activityState.installBeginServer && equalString(referrerDetails.installReferrer, activityState.installReferrer) && equalString(referrerDetails.installVersion, activityState.installVersion) && equalBoolean(referrerDetails.googlePlayInstant, activityState.googlePlayInstant);
    }

    private static boolean isEqualHuaweiReferrerAdsDetails(ReferrerDetails referrerDetails, ActivityState activityState) {
        return referrerDetails.referrerClickTimestampSeconds == activityState.clickTimeHuawei && referrerDetails.installBeginTimestampSeconds == activityState.installBeginHuawei && equalString(referrerDetails.installReferrer, activityState.installReferrerHuawei);
    }

    private static boolean isEqualHuaweiReferrerAppGalleryDetails(ReferrerDetails referrerDetails, ActivityState activityState) {
        return referrerDetails.referrerClickTimestampSeconds == activityState.clickTimeHuawei && referrerDetails.installBeginTimestampSeconds == activityState.installBeginHuawei && equalString(referrerDetails.installReferrer, activityState.installReferrerHuaweiAppGallery);
    }

    public static boolean isEqualReferrerDetails(ReferrerDetails referrerDetails, String str, ActivityState activityState) {
        if (str.equals(Constants.REFERRER_API_GOOGLE)) {
            return isEqualGoogleReferrerDetails(referrerDetails, activityState);
        }
        if (str.equals(Constants.REFERRER_API_HUAWEI_ADS)) {
            return isEqualHuaweiReferrerAdsDetails(referrerDetails, activityState);
        }
        if (str.equals(Constants.REFERRER_API_HUAWEI_APP_GALLERY)) {
            return isEqualHuaweiReferrerAppGalleryDetails(referrerDetails, activityState);
        }
        if (str.equals(Constants.REFERRER_API_XIAOMI)) {
            return isEqualXiaomiReferrerDetails(referrerDetails, activityState);
        }
        return false;
    }

    private static boolean isEqualXiaomiReferrerDetails(ReferrerDetails referrerDetails, ActivityState activityState) {
        return referrerDetails.referrerClickTimestampSeconds == activityState.clickTimeXiaomi && referrerDetails.installBeginTimestampSeconds == activityState.installBeginXiaomi && referrerDetails.referrerClickTimestampServerSeconds == activityState.clickTimeServerXiaomi && referrerDetails.installBeginTimestampServerSeconds == activityState.installBeginServerXiaomi && equalString(referrerDetails.installReferrer, activityState.installReferrerXiaomi);
    }

    public static Boolean isPlayTrackingEnabled(Context context, Object obj, long j) {
        return (Boolean) runSyncInPlayAdIdSchedulerWithTimeout(context, new c(context, obj), j);
    }

    public static boolean isUrlFilteredOut(Uri uri) {
        String uri2;
        return uri == null || (uri2 = uri.toString()) == null || uri2.length() == 0 || uri2.matches(Constants.FB_AUTH_REGEX);
    }

    public static boolean isValidParameter(String str, String str2, String str3) {
        if (str == null) {
            getLogger().error("%s parameter %s is missing", str3, str2);
            return false;
        }
        if (!str.equals("")) {
            return true;
        }
        getLogger().error("%s parameter %s is empty", str3, str2);
        return false;
    }

    public static Map<String, String> mergeParameters(Map<String, String> map, Map<String, String> map2, String str) {
        if (map == null) {
            return map2;
        }
        if (map2 == null) {
            return map;
        }
        HashMap hashMap = new HashMap(map);
        ILogger logger = getLogger();
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            String str2 = (String) hashMap.put(entry.getKey(), entry.getValue());
            if (str2 != null) {
                logger.warn("Key %s with value %s from %s parameter was replaced by value %s", entry.getKey(), str2, str, entry.getValue());
            }
        }
        return hashMap;
    }

    private static DecimalFormat newLocalDecimalFormat() {
        return new DecimalFormat("0.0", new DecimalFormatSymbols(Locale.US));
    }

    public static String quote(String str) {
        if (str == null) {
            return null;
        }
        return !Pattern.compile("\\s").matcher(str).find() ? str : formatString("'%s'", str);
    }

    private static double randomInRange(double d2, double d3) {
        return (new Random().nextDouble() * (d3 - d2)) + d2;
    }

    public static boolean readBooleanField(ObjectInputStream.GetField getField, String str, boolean z) {
        try {
            return getField.get(str, z);
        } catch (Exception e) {
            getLogger().debug(fieldReadErrorMessage, str, e.getMessage());
            return z;
        }
    }

    public static int readIntField(ObjectInputStream.GetField getField, String str, int i) {
        try {
            return getField.get(str, i);
        } catch (Exception e) {
            getLogger().debug(fieldReadErrorMessage, str, e.getMessage());
            return i;
        }
    }

    public static long readLongField(ObjectInputStream.GetField getField, String str, long j) {
        try {
            return getField.get(str, j);
        } catch (Exception e) {
            getLogger().debug(fieldReadErrorMessage, str, e.getMessage());
            return j;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.io.ObjectInputStream] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.io.BufferedInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> T readObject(android.content.Context r6, java.lang.String r7, java.lang.String r8, java.lang.Class<T> r9) {
        /*
            r0 = 0
            java.io.FileInputStream r6 = r6.openFileInput(r7)     // Catch: java.lang.Exception -> L74 java.io.FileNotFoundException -> L88
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch: java.lang.Exception -> L6b java.io.FileNotFoundException -> L70
            r7.<init>(r6)     // Catch: java.lang.Exception -> L6b java.io.FileNotFoundException -> L70
            java.io.ObjectInputStream r6 = new java.io.ObjectInputStream     // Catch: java.lang.Exception -> L69 java.io.FileNotFoundException -> L8b
            r6.<init>(r7)     // Catch: java.lang.Exception -> L69 java.io.FileNotFoundException -> L8b
            r7 = 1
            r1 = 0
            r2 = 2
            java.lang.Object r3 = r6.readObject()     // Catch: java.lang.Exception -> L29 java.lang.ClassCastException -> L3f java.lang.ClassNotFoundException -> L54
            java.lang.Object r0 = r9.cast(r3)     // Catch: java.lang.Exception -> L29 java.lang.ClassCastException -> L3f java.lang.ClassNotFoundException -> L54
            com.adjust.sdk.ILogger r9 = getLogger()     // Catch: java.lang.Exception -> L29 java.lang.ClassCastException -> L3f java.lang.ClassNotFoundException -> L54
            java.lang.String r3 = "Read %s: %s"
            java.lang.Object[] r4 = new java.lang.Object[]{r8, r0}     // Catch: java.lang.Exception -> L29 java.lang.ClassCastException -> L3f java.lang.ClassNotFoundException -> L54
            r9.debug(r3, r4)     // Catch: java.lang.Exception -> L29 java.lang.ClassCastException -> L3f java.lang.ClassNotFoundException -> L54
            goto L99
        L29:
            r9 = move-exception
            com.adjust.sdk.ILogger r3 = getLogger()     // Catch: java.lang.Exception -> L6b java.io.FileNotFoundException -> L70
            java.lang.String r4 = "Failed to read %s object (%s)"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L6b java.io.FileNotFoundException -> L70
            r2[r1] = r8     // Catch: java.lang.Exception -> L6b java.io.FileNotFoundException -> L70
            java.lang.String r9 = r9.getMessage()     // Catch: java.lang.Exception -> L6b java.io.FileNotFoundException -> L70
            r2[r7] = r9     // Catch: java.lang.Exception -> L6b java.io.FileNotFoundException -> L70
            r3.error(r4, r2)     // Catch: java.lang.Exception -> L6b java.io.FileNotFoundException -> L70
            goto L99
        L3f:
            r9 = move-exception
            com.adjust.sdk.ILogger r3 = getLogger()     // Catch: java.lang.Exception -> L6b java.io.FileNotFoundException -> L70
            java.lang.String r4 = "Failed to cast %s object (%s)"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L6b java.io.FileNotFoundException -> L70
            r2[r1] = r8     // Catch: java.lang.Exception -> L6b java.io.FileNotFoundException -> L70
            java.lang.String r9 = r9.getMessage()     // Catch: java.lang.Exception -> L6b java.io.FileNotFoundException -> L70
            r2[r7] = r9     // Catch: java.lang.Exception -> L6b java.io.FileNotFoundException -> L70
            r3.error(r4, r2)     // Catch: java.lang.Exception -> L6b java.io.FileNotFoundException -> L70
            goto L99
        L54:
            r9 = move-exception
            com.adjust.sdk.ILogger r3 = getLogger()     // Catch: java.lang.Exception -> L6b java.io.FileNotFoundException -> L70
            java.lang.String r4 = "Failed to find %s class (%s)"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L6b java.io.FileNotFoundException -> L70
            r2[r1] = r8     // Catch: java.lang.Exception -> L6b java.io.FileNotFoundException -> L70
            java.lang.String r9 = r9.getMessage()     // Catch: java.lang.Exception -> L6b java.io.FileNotFoundException -> L70
            r2[r7] = r9     // Catch: java.lang.Exception -> L6b java.io.FileNotFoundException -> L70
            r3.error(r4, r2)     // Catch: java.lang.Exception -> L6b java.io.FileNotFoundException -> L70
            goto L99
        L69:
            r6 = move-exception
            goto L7a
        L6b:
            r7 = move-exception
            r5 = r0
            r0 = r6
            r6 = r5
            goto L76
        L70:
            r5 = r0
            r0 = r6
            r6 = r5
            goto L89
        L74:
            r7 = move-exception
            r6 = r0
        L76:
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L7a:
            com.adjust.sdk.ILogger r9 = getLogger()
            java.lang.Object[] r6 = new java.lang.Object[]{r8, r6}
            java.lang.String r1 = "Failed to open %s file for reading (%s)"
            r9.error(r1, r6)
            goto L98
        L88:
            r6 = r0
        L89:
            r7 = r0
            r0 = r6
        L8b:
            com.adjust.sdk.ILogger r6 = getLogger()
            java.lang.Object[] r9 = new java.lang.Object[]{r8}
            java.lang.String r1 = "%s file not found"
            r6.debug(r1, r9)
        L98:
            r6 = r7
        L99:
            if (r6 == 0) goto Lad
            r6.close()     // Catch: java.lang.Exception -> L9f
            goto Lad
        L9f:
            r6 = move-exception
            com.adjust.sdk.ILogger r7 = getLogger()
            java.lang.Object[] r6 = new java.lang.Object[]{r8, r6}
            java.lang.String r8 = "Failed to close %s file for reading (%s)"
            r7.error(r8, r6)
        Lad:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adjust.sdk.Util.readObject(android.content.Context, java.lang.String, java.lang.String, java.lang.Class):java.lang.Object");
    }

    public static <T> T readObjectField(ObjectInputStream.GetField getField, String str, T t) {
        try {
            return (T) getField.get(str, t);
        } catch (Exception e) {
            getLogger().debug(fieldReadErrorMessage, str, e.getMessage());
            return t;
        }
    }

    public static String readStringField(ObjectInputStream.GetField getField, String str, String str2) {
        return (String) readObjectField(getField, str, str2);
    }

    public static boolean resolveContentProvider(Context context, String str) {
        try {
            return context.getPackageManager().resolveContentProvider(str, 0) != null;
        } catch (Exception unused) {
            return false;
        }
    }

    private static <R> R runSyncInPlayAdIdSchedulerWithTimeout(Context context, Callable<R> callable, long j) {
        if (playAdIdScheduler == null) {
            synchronized (Util.class) {
                if (playAdIdScheduler == null) {
                    playAdIdScheduler = new SingleThreadFutureScheduler("PlayAdIdLibrary", true);
                }
            }
        }
        try {
            return (R) playAdIdScheduler.scheduleFutureWithReturn(callable, 0L).get(j, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            return null;
        }
    }

    public static String sha256(String str) {
        return hash(str, Constants.SHA256);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.OutputStream, java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.io.ObjectOutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> void writeObject(T r1, android.content.Context r2, java.lang.String r3, java.lang.String r4) {
        /*
            r0 = 0
            java.io.FileOutputStream r2 = r2.openFileOutput(r3, r0)     // Catch: java.lang.Exception -> L32
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch: java.lang.Exception -> L30
            r3.<init>(r2)     // Catch: java.lang.Exception -> L30
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch: java.lang.Exception -> L2e
            r2.<init>(r3)     // Catch: java.lang.Exception -> L2e
            r2.writeObject(r1)     // Catch: java.io.NotSerializableException -> L20 java.lang.Exception -> L30
            com.adjust.sdk.ILogger r3 = getLogger()     // Catch: java.io.NotSerializableException -> L20 java.lang.Exception -> L30
            java.lang.String r0 = "Wrote %s: %s"
            java.lang.Object[] r1 = new java.lang.Object[]{r4, r1}     // Catch: java.io.NotSerializableException -> L20 java.lang.Exception -> L30
            r3.debug(r0, r1)     // Catch: java.io.NotSerializableException -> L20 java.lang.Exception -> L30
            goto L43
        L20:
            com.adjust.sdk.ILogger r1 = getLogger()     // Catch: java.lang.Exception -> L30
            java.lang.String r3 = "Failed to serialize %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r4}     // Catch: java.lang.Exception -> L30
            r1.error(r3, r0)     // Catch: java.lang.Exception -> L30
            goto L43
        L2e:
            r1 = move-exception
            goto L35
        L30:
            r1 = move-exception
            goto L34
        L32:
            r1 = move-exception
            r2 = 0
        L34:
            r3 = r2
        L35:
            com.adjust.sdk.ILogger r2 = getLogger()
            java.lang.Object[] r1 = new java.lang.Object[]{r4, r1}
            java.lang.String r0 = "Failed to open %s for writing (%s)"
            r2.error(r0, r1)
            r2 = r3
        L43:
            if (r2 == 0) goto L57
            r2.close()     // Catch: java.lang.Exception -> L49
            goto L57
        L49:
            r1 = move-exception
            com.adjust.sdk.ILogger r2 = getLogger()
            java.lang.Object[] r1 = new java.lang.Object[]{r4, r1}
            java.lang.String r3 = "Failed to close %s file for writing (%s)"
            r2.error(r3, r1)
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adjust.sdk.Util.writeObject(java.lang.Object, android.content.Context, java.lang.String, java.lang.String):void");
    }
}

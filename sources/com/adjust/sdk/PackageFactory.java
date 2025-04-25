package com.adjust.sdk;

import android.net.UrlQuerySanitizer;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class PackageFactory {
    private static final String ADJUST_PREFIX = "adjust_";

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0004, code lost:
    
        r1 = r5.toString();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.adjust.sdk.ActivityPackage buildDeeplinkSdkClickPackage(android.net.Uri r5, long r6, com.adjust.sdk.ActivityState r8, com.adjust.sdk.AdjustConfig r9, com.adjust.sdk.a r10, com.adjust.sdk.SessionParameters r11) {
        /*
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = r5.toString()
            if (r1 == 0) goto L8b
            int r2 = r1.length()
            if (r2 != 0) goto L12
            goto L8b
        L12:
            java.lang.String r2 = "UTF-8"
            java.lang.String r1 = java.net.URLDecoder.decode(r1, r2)     // Catch: java.lang.Exception -> L19 java.lang.IllegalArgumentException -> L2c java.io.UnsupportedEncodingException -> L3f
            goto L51
        L19:
            r2 = move-exception
            com.adjust.sdk.ILogger r3 = com.adjust.sdk.AdjustFactory.getLogger()
            java.lang.String r2 = r2.getMessage()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r4 = "Deeplink url decoding failed. Message: (%s)"
            r3.error(r4, r2)
            goto L51
        L2c:
            r2 = move-exception
            com.adjust.sdk.ILogger r3 = com.adjust.sdk.AdjustFactory.getLogger()
            java.lang.String r2 = r2.getMessage()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r4 = "Deeplink url decoding failed due to IllegalArgumentException. Message: (%s)"
            r3.error(r4, r2)
            goto L51
        L3f:
            r2 = move-exception
            com.adjust.sdk.ILogger r3 = com.adjust.sdk.AdjustFactory.getLogger()
            java.lang.String r2 = r2.getMessage()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r4 = "Deeplink url decoding failed due to UnsupportedEncodingException. Message: (%s)"
            r3.error(r4, r2)
        L51:
            com.adjust.sdk.ILogger r2 = com.adjust.sdk.AdjustFactory.getLogger()
            java.lang.Object[] r3 = new java.lang.Object[]{r1}
            java.lang.String r4 = "Url to parse (%s)"
            r2.verbose(r4, r3)
            android.net.UrlQuerySanitizer r2 = new android.net.UrlQuerySanitizer
            r2.<init>()
            android.net.UrlQuerySanitizer$ValueSanitizer r3 = android.net.UrlQuerySanitizer.getAllButNulLegal()
            r2.setUnregisteredParameterValueSanitizer(r3)
            r3 = 1
            r2.setAllowUnregisteredParamaters(r3)
            r2.parseUrl(r1)
            java.util.List r1 = r2.getParameterList()
            com.adjust.sdk.PackageBuilder r8 = queryStringClickPackageBuilder(r1, r8, r9, r10, r11)
            if (r8 != 0) goto L7c
            return r0
        L7c:
            java.lang.String r5 = r5.toString()
            r8.deeplink = r5
            r8.clickTimeInMilliseconds = r6
            java.lang.String r5 = "deeplink"
            com.adjust.sdk.ActivityPackage r5 = r8.buildClickPackage(r5)
            return r5
        L8b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adjust.sdk.PackageFactory.buildDeeplinkSdkClickPackage(android.net.Uri, long, com.adjust.sdk.ActivityState, com.adjust.sdk.AdjustConfig, com.adjust.sdk.a, com.adjust.sdk.SessionParameters):com.adjust.sdk.ActivityPackage");
    }

    public static ActivityPackage buildInstallReferrerSdkClickPackage(ReferrerDetails referrerDetails, String str, ActivityState activityState, AdjustConfig adjustConfig, a aVar, SessionParameters sessionParameters) {
        PackageBuilder packageBuilder = new PackageBuilder(adjustConfig, aVar, activityState, sessionParameters, System.currentTimeMillis());
        packageBuilder.referrer = referrerDetails.installReferrer;
        packageBuilder.clickTimeInSeconds = referrerDetails.referrerClickTimestampSeconds;
        packageBuilder.installBeginTimeInSeconds = referrerDetails.installBeginTimestampSeconds;
        packageBuilder.clickTimeServerInSeconds = referrerDetails.referrerClickTimestampServerSeconds;
        packageBuilder.installBeginTimeServerInSeconds = referrerDetails.installBeginTimestampServerSeconds;
        packageBuilder.installVersion = referrerDetails.installVersion;
        packageBuilder.googlePlayInstant = referrerDetails.googlePlayInstant;
        packageBuilder.referrerApi = str;
        return packageBuilder.buildClickPackage(Constants.INSTALL_REFERRER);
    }

    public static ActivityPackage buildPreinstallSdkClickPackage(String str, String str2, ActivityState activityState, AdjustConfig adjustConfig, a aVar, SessionParameters sessionParameters) {
        if (str == null || str.length() == 0) {
            return null;
        }
        PackageBuilder packageBuilder = new PackageBuilder(adjustConfig, aVar, activityState, sessionParameters, System.currentTimeMillis());
        packageBuilder.preinstallPayload = str;
        packageBuilder.preinstallLocation = str2;
        return packageBuilder.buildClickPackage(Constants.PREINSTALL);
    }

    public static ActivityPackage buildReftagSdkClickPackage(String str, long j, ActivityState activityState, AdjustConfig adjustConfig, a aVar, SessionParameters sessionParameters) {
        String str2 = Constants.MALFORMED;
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            str2 = URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            AdjustFactory.getLogger().error("Referrer decoding failed due to UnsupportedEncodingException. Message: (%s)", e.getMessage());
        } catch (IllegalArgumentException e2) {
            AdjustFactory.getLogger().error("Referrer decoding failed due to IllegalArgumentException. Message: (%s)", e2.getMessage());
        } catch (Exception e3) {
            AdjustFactory.getLogger().error("Referrer decoding failed. Message: (%s)", e3.getMessage());
        }
        AdjustFactory.getLogger().verbose("Referrer to parse (%s)", str2);
        UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer();
        urlQuerySanitizer.setUnregisteredParameterValueSanitizer(UrlQuerySanitizer.getAllButNulLegal());
        urlQuerySanitizer.setAllowUnregisteredParamaters(true);
        urlQuerySanitizer.parseQuery(str2);
        PackageBuilder queryStringClickPackageBuilder = queryStringClickPackageBuilder(urlQuerySanitizer.getParameterList(), activityState, adjustConfig, aVar, sessionParameters);
        if (queryStringClickPackageBuilder == null) {
            return null;
        }
        queryStringClickPackageBuilder.referrer = str2;
        queryStringClickPackageBuilder.clickTimeInMilliseconds = j;
        queryStringClickPackageBuilder.rawReferrer = str;
        return queryStringClickPackageBuilder.buildClickPackage(Constants.REFTAG);
    }

    private static PackageBuilder queryStringClickPackageBuilder(List<UrlQuerySanitizer.ParameterValuePair> list, ActivityState activityState, AdjustConfig adjustConfig, a aVar, SessionParameters sessionParameters) {
        if (list == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AdjustAttribution adjustAttribution = new AdjustAttribution();
        for (UrlQuerySanitizer.ParameterValuePair parameterValuePair : list) {
            readQueryString(parameterValuePair.mParameter, parameterValuePair.mValue, linkedHashMap, adjustAttribution);
        }
        long currentTimeMillis = System.currentTimeMillis();
        String str = (String) linkedHashMap.remove(Constants.REFTAG);
        if (activityState != null) {
            activityState.lastInterval = currentTimeMillis - activityState.lastActivity;
        }
        PackageBuilder packageBuilder = new PackageBuilder(adjustConfig, aVar, activityState, sessionParameters, currentTimeMillis);
        packageBuilder.extraParameters = linkedHashMap;
        packageBuilder.attribution = adjustAttribution;
        packageBuilder.reftag = str;
        return packageBuilder;
    }

    private static boolean readQueryString(String str, String str2, Map<String, String> map, AdjustAttribution adjustAttribution) {
        if (str == null || str2 == null || !str.startsWith(ADJUST_PREFIX)) {
            return false;
        }
        String substring = str.substring(7);
        if (substring.length() == 0 || str2.length() == 0) {
            return false;
        }
        if (tryToSetAttribution(adjustAttribution, substring, str2)) {
            return true;
        }
        map.put(substring, str2);
        return true;
    }

    private static boolean tryToSetAttribution(AdjustAttribution adjustAttribution, String str, String str2) {
        if (str.equals("tracker")) {
            adjustAttribution.trackerName = str2;
            return true;
        }
        if (str.equals("campaign")) {
            adjustAttribution.campaign = str2;
            return true;
        }
        if (str.equals("adgroup")) {
            adjustAttribution.adgroup = str2;
            return true;
        }
        if (!str.equals("creative")) {
            return false;
        }
        adjustAttribution.creative = str2;
        return true;
    }
}

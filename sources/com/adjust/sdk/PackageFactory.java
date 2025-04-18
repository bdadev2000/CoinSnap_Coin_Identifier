package com.adjust.sdk;

import android.net.UrlQuerySanitizer;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class PackageFactory {
    private static final String ADJUST_PREFIX = "adjust_";

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0004, code lost:
    
        r1 = r7.toString();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.adjust.sdk.ActivityPackage buildDeeplinkSdkClickPackage(android.net.Uri r7, long r8, com.adjust.sdk.ActivityState r10, com.adjust.sdk.AdjustConfig r11, com.adjust.sdk.a r12, com.adjust.sdk.SessionParameters r13) {
        /*
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = r7.toString()
            if (r1 == 0) goto L8c
            int r2 = r1.length()
            if (r2 != 0) goto L12
            goto L8c
        L12:
            r2 = 0
            r3 = 1
            java.lang.String r4 = "UTF-8"
            java.lang.String r1 = java.net.URLDecoder.decode(r1, r4)     // Catch: java.lang.Exception -> L1b java.lang.IllegalArgumentException -> L2e java.io.UnsupportedEncodingException -> L41
            goto L53
        L1b:
            r4 = move-exception
            com.adjust.sdk.ILogger r5 = com.adjust.sdk.AdjustFactory.getLogger()
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String r4 = r4.getMessage()
            r6[r2] = r4
            java.lang.String r4 = "Deeplink url decoding failed. Message: (%s)"
            r5.error(r4, r6)
            goto L53
        L2e:
            r4 = move-exception
            com.adjust.sdk.ILogger r5 = com.adjust.sdk.AdjustFactory.getLogger()
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String r4 = r4.getMessage()
            r6[r2] = r4
            java.lang.String r4 = "Deeplink url decoding failed due to IllegalArgumentException. Message: (%s)"
            r5.error(r4, r6)
            goto L53
        L41:
            r4 = move-exception
            com.adjust.sdk.ILogger r5 = com.adjust.sdk.AdjustFactory.getLogger()
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String r4 = r4.getMessage()
            r6[r2] = r4
            java.lang.String r4 = "Deeplink url decoding failed due to UnsupportedEncodingException. Message: (%s)"
            r5.error(r4, r6)
        L53:
            com.adjust.sdk.ILogger r4 = com.adjust.sdk.AdjustFactory.getLogger()
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r2] = r1
            java.lang.String r2 = "Url to parse (%s)"
            r4.verbose(r2, r5)
            android.net.UrlQuerySanitizer r2 = new android.net.UrlQuerySanitizer
            r2.<init>()
            android.net.UrlQuerySanitizer$ValueSanitizer r4 = android.net.UrlQuerySanitizer.getAllButNulLegal()
            r2.setUnregisteredParameterValueSanitizer(r4)
            r2.setAllowUnregisteredParamaters(r3)
            r2.parseUrl(r1)
            java.util.List r1 = r2.getParameterList()
            com.adjust.sdk.PackageBuilder r10 = queryStringClickPackageBuilder(r1, r10, r11, r12, r13)
            if (r10 != 0) goto L7d
            return r0
        L7d:
            java.lang.String r7 = r7.toString()
            r10.deeplink = r7
            r10.clickTimeInMilliseconds = r8
            java.lang.String r7 = "deeplink"
            com.adjust.sdk.ActivityPackage r7 = r10.buildClickPackage(r7)
            return r7
        L8c:
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

    public static ActivityPackage buildReftagSdkClickPackage(String str, long j3, ActivityState activityState, AdjustConfig adjustConfig, a aVar, SessionParameters sessionParameters) {
        String str2 = Constants.MALFORMED;
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            str2 = URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            AdjustFactory.getLogger().error("Referrer decoding failed due to UnsupportedEncodingException. Message: (%s)", e2.getMessage());
        } catch (IllegalArgumentException e10) {
            AdjustFactory.getLogger().error("Referrer decoding failed due to IllegalArgumentException. Message: (%s)", e10.getMessage());
        } catch (Exception e11) {
            AdjustFactory.getLogger().error("Referrer decoding failed. Message: (%s)", e11.getMessage());
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
        queryStringClickPackageBuilder.clickTimeInMilliseconds = j3;
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

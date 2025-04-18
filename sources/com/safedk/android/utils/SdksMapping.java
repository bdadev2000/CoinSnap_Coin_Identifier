package com.safedk.android.utils;

import android.os.Bundle;
import com.google.android.gms.ads.MobileAds;
import com.safedk.android.SafeDK;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class SdksMapping {
    private static final String AD_COLONY_ADAPTER_CLASS_NAME = "com.applovin.mediation.adapters.AdColonyMediationAdapter";
    public static final String KEY_INSTALLED_MEDIATION_ADAPTERS = "installed_mediation_adapters";
    public static final String KEY_INSTALLED_MEDIATION_ADAPTERS_CLASS = "class";
    public static final String KEY_INSTALLED_MEDIATION_ADAPTERS_SDK_VERSION = "sdk_version";
    public static final String KEY_INSTALLED_MEDIATION_ADAPTERS_VERSION = "version";
    private static final String TAG = "SdksMapping";
    private static Set<String> redirectSupportedSdks;
    private static boolean topicSdkVersionsUpdated;
    private static TreeMap<String, String> sdkPackageToName = new TreeMap<>(Collections.reverseOrder());
    private static TreeMap<String, String> sdkPackageToUUID = new TreeMap<>(Collections.reverseOrder());
    private static TreeMap<String, String> sdkPackages = new TreeMap<>(Collections.reverseOrder());
    private static TreeMap<String, String> sdkPackageUUIDToVersion = new TreeMap<>(Collections.reverseOrder());
    private static TreeMap<String, String> sdkAdaptersUUID = new TreeMap<>(Collections.reverseOrder());

    static {
        sdkPackageToName.put(g.f30053h, "AdMob");
        sdkPackages.put("com.google.android.gms.internal", g.f30053h);
        sdkPackages.put(MobileAds.ERROR_DOMAIN, g.f30053h);
        sdkPackageToUUID.put(g.f30053h, "29015bbfcc182d80e7f75bd2c38e4521");
        sdkPackages.put(g.f30053h, g.f30053h);
        sdkAdaptersUUID.put("com.applovin.mediation.adapters.GoogleMediationAdapter", "29015bbfcc182d80e7f75bd2c38e4521");
        sdkPackageToName.put(g.f30048a, "AppLovin");
        sdkPackageToUUID.put(g.f30048a, "74616804a7dc29147dfb0afe122a9fd2");
        sdkPackages.put(g.f30048a, g.f30048a);
        sdkAdaptersUUID.put(com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f29540j, "74616804a7dc29147dfb0afe122a9fd2");
    }

    public static TreeMap<String, String> getSdkAdaptersUUID() {
        return sdkAdaptersUUID;
    }

    public static void setTopicSdkVersionsUpdated() {
        topicSdkVersionsUpdated = true;
        Logger.d(TAG, "set topic sdk versions updated, sdkPackageToUUID=" + sdkPackageToUUID.toString());
        Logger.d(TAG, "set topic sdk versions updated, redirectSupprotedSdks=" + redirectSupportedSdks.toString());
    }

    public static boolean isTopicSdkVersionsUpdated() {
        return topicSdkVersionsUpdated;
    }

    public static void init() {
        printAllSdkVersions();
    }

    public static void initForInitTests() {
        sdkPackages.put("com.applovin.adview.StaticInterstitialActivity", g.f30048a);
        sdkPackages.put("com.google.ads.AdActivity1", g.f30053h);
        sdkPackages.put("com.inmobi.StaticInterstitialActivity", g.f30054i);
    }

    public static String getSdkPackageByClass(String className) {
        if (className != null) {
            for (String str : sdkPackages.keySet()) {
                if (className.startsWith(str)) {
                    return sdkPackages.get(str);
                }
            }
        }
        return null;
    }

    public static String getSdkNameByPackage(String packageName) {
        return sdkPackageToName.get(packageName);
    }

    public static String getSdkUUIDByPackage(String packageName) {
        if (!SafeDK.f29035a.equals(packageName)) {
            String packageName2 = sdkPackageToUUID.get(packageName);
            Logger.d(TAG, "get sdk UUID by package " + packageName + " , result = " + packageName2);
            return packageName2;
        }
        return packageName;
    }

    public static String getSdkPackageByPackageUUID(String uuid) {
        for (Map.Entry<String, String> entry : sdkPackageToUUID.entrySet()) {
            if (entry.getValue().equals(uuid)) {
                Logger.d(TAG, "get sdk package by package UUID returns " + entry.getKey() + " for UUID " + entry.getValue());
                return entry.getKey();
            }
        }
        Logger.d(TAG, "sdk UUID not valid: " + uuid);
        return null;
    }

    public static String getSdkVersionByPackage(String packageName) {
        Logger.d(TAG, "get sdk version by package started, package name = " + packageName);
        String sdkUUIDByPackage = getSdkUUIDByPackage(packageName);
        Logger.d(TAG, "get sdk version by package, uuid = " + sdkUUIDByPackage);
        if (sdkUUIDByPackage != null) {
            return sdkPackageUUIDToVersion.get(sdkUUIDByPackage);
        }
        return null;
    }

    public static Set<String> getAllSdkNames() {
        return new HashSet(sdkPackageToName.values());
    }

    public static Map<String, String> getAllSdkVersionsMap() {
        return sdkPackageUUIDToVersion;
    }

    public static void printAllSdkVersions() {
        Logger.d(TAG, "print all sdk versions, sdkPackages=" + sdkPackages.toString());
        Logger.d(TAG, "print all sdk versions, sdkPackageToName=" + sdkPackageToName.toString());
        Logger.d(TAG, "print all sdk versions, sdkPackageToUUID=" + sdkPackageToUUID.toString());
        Logger.d(TAG, "print all sdk versions, sdkPackageUUIDToVersion=" + sdkPackageUUIDToVersion.toString());
        Logger.d(TAG, "print all sdk versions, sdkAdaptersUUID=" + sdkAdaptersUUID.toString());
        Iterator<Map.Entry<String, String>> it = sdkPackageToName.entrySet().iterator();
        Logger.d(TAG, "print all sdk versions, sdks detected: " + sdkPackageToName.entrySet().size() + " sdks with versions: " + sdkPackageUUIDToVersion.entrySet().size());
        while (it.hasNext()) {
            String key = it.next().getKey();
            Logger.d(TAG, String.format("print all sdk versions, sdk package: %s, version: %s", key, sdkPackageUUIDToVersion.get(key)));
        }
    }

    public static Set<String> getAllSdkPackages() {
        return sdkPackageToName.keySet();
    }

    public static boolean isSameSdkByPackages(String package1, String package2) {
        if (package1 == null || package2 == null) {
            return false;
        }
        String sdkNameByPackage = getSdkNameByPackage(package1);
        String sdkNameByPackage2 = getSdkNameByPackage(package2);
        if (sdkNameByPackage == null || sdkNameByPackage2 == null) {
            return false;
        }
        return sdkNameByPackage.equals(sdkNameByPackage2) || sdkNameByPackage.regionMatches(false, 0, sdkNameByPackage2, 0, 5);
    }

    public static void updateSdkVersionIfNeeded(String className, String version) {
        if (!isTopicSdkVersionsUpdated()) {
            if (sdkAdaptersUUID.containsKey(className)) {
                String str = sdkAdaptersUUID.get(className);
                Logger.d(TAG, "UUID for class " + className + " is " + str);
                if (!sdkPackageUUIDToVersion.containsKey(str) || (sdkPackageUUIDToVersion.containsKey(str) && version != null && version.length() > 0 && !sdkPackageUUIDToVersion.get(str).equals(version))) {
                    sdkPackageUUIDToVersion.put(str, version);
                    Logger.d(TAG, "update sdk version if needed, class " + className + " (uuid " + str + ") updated to " + version);
                }
                if (redirectSupportedSdks == null) {
                    redirectSupportedSdks = new HashSet();
                }
                if (sdkAdaptersUUID.values().contains(str)) {
                    Logger.d(TAG, "Adding " + className + " , package UUID " + str + " to redirect supported sdks");
                    redirectSupportedSdks.add(str);
                } else {
                    Logger.d(TAG, "Not adding " + className + " , package UUID " + str + " to redirect supported sdks");
                }
                Logger.d(TAG, "get redirect supported sdks : " + getRedirectSupportedSdks().toString());
                return;
            }
            Logger.d(TAG, "Cannot find UUID for package " + className);
        }
    }

    public static void setMaxAdapterVersions(Bundle bundle) {
        try {
            Logger.d(TAG, "get max adapter versions started, Bundle = " + bundle);
            if (bundle.containsKey(KEY_INSTALLED_MEDIATION_ADAPTERS)) {
                Logger.d(TAG, "get max adapter versions, processing " + KEY_INSTALLED_MEDIATION_ADAPTERS.toUpperCase());
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(KEY_INSTALLED_MEDIATION_ADAPTERS);
                if (parcelableArrayList != null) {
                    Iterator it = parcelableArrayList.iterator();
                    while (it.hasNext()) {
                        Bundle bundle2 = (Bundle) it.next();
                        String string = bundle2.getString(KEY_INSTALLED_MEDIATION_ADAPTERS_CLASS);
                        String string2 = bundle2.getString("sdk_version");
                        Logger.d(TAG, "get max adapter versions, class name = " + string);
                        Logger.d(TAG, "get max adapter versions, class version = " + string2);
                        if (string2 != null && string2.length() > 0) {
                            updateSdkVersionIfNeeded(string, string2);
                        } else if (string.equals(AD_COLONY_ADAPTER_CLASS_NAME)) {
                            String string3 = bundle2.getString("version");
                            Logger.d(TAG, "get max adapter versions, ad colony adapter version special handling. version is " + string3);
                            updateSdkVersionIfNeeded(string, string3);
                        } else {
                            Logger.d(TAG, "get max adapter versions, adapter sdk_version field is empty for class " + string);
                        }
                        Logger.d(TAG, "get max adapter versions, class name " + string + " : " + getRedirectSupportedSdks().contains(string));
                    }
                    setTopicSdkVersionsUpdated();
                } else {
                    Logger.d(TAG, "extracting value for key installed_mediation_adapters produced null value, skipping");
                }
                printAllSdkVersions();
                return;
            }
            Logger.d(TAG, "get max adapter versions, no adapter class version received from MAX");
        } catch (Throwable th) {
            Logger.e(TAG, "get max adapter versions, exception extracting " + KEY_INSTALLED_MEDIATION_ADAPTERS.toUpperCase(), th);
        }
    }

    public static Set<String> getRedirectSupportedSdks() {
        Logger.d(TAG, "get redirect supported sdks started, sdkAdaptersUUID=" + sdkAdaptersUUID.values());
        return !isTopicSdkVersionsUpdated() ? new HashSet(sdkAdaptersUUID.values()) : redirectSupportedSdks;
    }

    public static String getMainSdkPackage(String sdkpackage) {
        if (g.f30058m.equals(sdkpackage)) {
            return g.f30056k;
        }
        if (g.f30052g.equals(sdkpackage)) {
            return g.f30051f;
        }
        return sdkpackage;
    }
}

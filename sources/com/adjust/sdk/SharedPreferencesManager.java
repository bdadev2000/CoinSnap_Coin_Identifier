package com.adjust.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public class SharedPreferencesManager {
    private static final int INDEX_CLICK_TIME = 1;
    private static final int INDEX_IS_SENDING = 2;
    private static final int INDEX_RAW_REFERRER = 0;
    private static final String PREFS_KEY_DEEPLINK_CLICK_TIME = "deeplink_click_time";
    private static final String PREFS_KEY_DEEPLINK_URL = "deeplink_url";
    private static final String PREFS_KEY_DISABLE_THIRD_PARTY_SHARING = "disable_third_party_sharing";
    private static final String PREFS_KEY_GDPR_FORGET_ME = "gdpr_forget_me";
    private static final String PREFS_KEY_INSTALL_TRACKED = "install_tracked";
    private static final String PREFS_KEY_PREINSTALL_PAYLOAD_READ_STATUS = "preinstall_payload_read_status";
    private static final String PREFS_KEY_PREINSTALL_SYSTEM_INSTALLER_REFERRER = "preinstall_system_installer_referrer";
    private static final String PREFS_KEY_PUSH_TOKEN = "push_token";
    private static final String PREFS_KEY_RAW_REFERRERS = "raw_referrers";
    private static final String PREFS_NAME = "adjust_preferences";
    private static final int REFERRERS_COUNT = 10;
    private static SharedPreferencesManager defaultInstance;
    private static SharedPreferences sharedPreferences;
    private static SharedPreferences.Editor sharedPreferencesEditor;

    private SharedPreferencesManager(Context context) {
        try {
            SharedPreferences sharedPreferences2 = context.getSharedPreferences(PREFS_NAME, 0);
            sharedPreferences = sharedPreferences2;
            sharedPreferencesEditor = sharedPreferences2.edit();
        } catch (Exception e4) {
            AdjustFactory.getLogger().error("Cannot access to SharedPreferences", e4.getMessage());
            sharedPreferences = null;
            sharedPreferencesEditor = null;
        }
    }

    private synchronized boolean getBoolean(String str, boolean z8) {
        SharedPreferences sharedPreferences2 = sharedPreferences;
        if (sharedPreferences2 == null) {
            return z8;
        }
        try {
            return sharedPreferences2.getBoolean(str, z8);
        } catch (ClassCastException unused) {
            return z8;
        }
    }

    public static synchronized SharedPreferencesManager getDefaultInstance(Context context) {
        SharedPreferencesManager sharedPreferencesManager;
        synchronized (SharedPreferencesManager.class) {
            try {
                if (defaultInstance == null) {
                    defaultInstance = new SharedPreferencesManager(context);
                }
                sharedPreferencesManager = defaultInstance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sharedPreferencesManager;
    }

    private synchronized long getLong(String str, long j7) {
        SharedPreferences sharedPreferences2 = sharedPreferences;
        if (sharedPreferences2 == null) {
            return j7;
        }
        try {
            return sharedPreferences2.getLong(str, j7);
        } catch (ClassCastException unused) {
            return j7;
        }
    }

    private synchronized int getRawReferrerIndex(String str, long j7) {
        try {
            JSONArray rawReferrerArray = getRawReferrerArray();
            for (int i9 = 0; i9 < rawReferrerArray.length(); i9++) {
                JSONArray jSONArray = rawReferrerArray.getJSONArray(i9);
                String optString = jSONArray.optString(0, null);
                if (optString != null && optString.equals(str) && jSONArray.optLong(1, -1L) == j7) {
                    return i9;
                }
            }
        } catch (JSONException unused) {
        }
        return -1;
    }

    private synchronized String getString(String str) {
        SharedPreferences sharedPreferences2 = sharedPreferences;
        if (sharedPreferences2 == null) {
            return null;
        }
        try {
            return sharedPreferences2.getString(str, null);
        } catch (ClassCastException unused) {
            return null;
        } catch (Throwable unused2) {
            if (str.equals(PREFS_KEY_RAW_REFERRERS)) {
                remove(PREFS_KEY_RAW_REFERRERS);
            }
            return null;
        }
    }

    private synchronized void remove(String str) {
        SharedPreferences.Editor editor = sharedPreferencesEditor;
        if (editor != null) {
            editor.remove(str).apply();
        }
    }

    private synchronized void saveBoolean(String str, boolean z8) {
        SharedPreferences.Editor editor = sharedPreferencesEditor;
        if (editor != null) {
            editor.putBoolean(str, z8).apply();
        }
    }

    private synchronized void saveInteger(String str, int i9) {
        SharedPreferences.Editor editor = sharedPreferencesEditor;
        if (editor != null) {
            editor.putInt(str, i9).apply();
        }
    }

    private synchronized void saveLong(String str, long j7) {
        SharedPreferences.Editor editor = sharedPreferencesEditor;
        if (editor != null) {
            editor.putLong(str, j7).apply();
        }
    }

    private synchronized void saveString(String str, String str2) {
        SharedPreferences.Editor editor = sharedPreferencesEditor;
        if (editor != null) {
            editor.putString(str, str2).apply();
        }
    }

    public synchronized void clear() {
        SharedPreferences.Editor editor = sharedPreferencesEditor;
        if (editor != null) {
            editor.clear().apply();
        }
    }

    public synchronized long getDeeplinkClickTime() {
        return getLong(PREFS_KEY_DEEPLINK_CLICK_TIME, -1L);
    }

    public synchronized String getDeeplinkUrl() {
        return getString(PREFS_KEY_DEEPLINK_URL);
    }

    public synchronized boolean getDisableThirdPartySharing() {
        return getBoolean(PREFS_KEY_DISABLE_THIRD_PARTY_SHARING, false);
    }

    public synchronized boolean getGdprForgetMe() {
        return getBoolean(PREFS_KEY_GDPR_FORGET_ME, false);
    }

    public synchronized boolean getInstallTracked() {
        return getBoolean(PREFS_KEY_INSTALL_TRACKED, false);
    }

    public synchronized long getPreinstallPayloadReadStatus() {
        return getLong(PREFS_KEY_PREINSTALL_PAYLOAD_READ_STATUS, 0L);
    }

    public synchronized String getPreinstallReferrer() {
        return getString(PREFS_KEY_PREINSTALL_SYSTEM_INSTALLER_REFERRER);
    }

    public synchronized String getPushToken() {
        return getString(PREFS_KEY_PUSH_TOKEN);
    }

    public synchronized JSONArray getRawReferrer(String str, long j7) {
        int rawReferrerIndex = getRawReferrerIndex(str, j7);
        if (rawReferrerIndex >= 0) {
            try {
                return getRawReferrerArray().getJSONArray(rawReferrerIndex);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public synchronized JSONArray getRawReferrerArray() {
        String string = getString(PREFS_KEY_RAW_REFERRERS);
        if (string != null) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                if (jSONArray.length() <= 10) {
                    return new JSONArray(string);
                }
                JSONArray jSONArray2 = new JSONArray();
                for (int i9 = 0; i9 < 10; i9++) {
                    jSONArray2.put(jSONArray.get(i9));
                }
                saveRawReferrerArray(jSONArray2);
                return jSONArray2;
            } catch (Throwable unused) {
            }
        }
        return new JSONArray();
    }

    public synchronized void removeDeeplink() {
        remove(PREFS_KEY_DEEPLINK_URL);
        remove(PREFS_KEY_DEEPLINK_CLICK_TIME);
    }

    public synchronized void removeDisableThirdPartySharing() {
        remove(PREFS_KEY_DISABLE_THIRD_PARTY_SHARING);
    }

    public synchronized void removeGdprForgetMe() {
        remove(PREFS_KEY_GDPR_FORGET_ME);
    }

    public synchronized void removePreinstallReferrer() {
        remove(PREFS_KEY_PREINSTALL_SYSTEM_INSTALLER_REFERRER);
    }

    public synchronized void removePushToken() {
        remove(PREFS_KEY_PUSH_TOKEN);
    }

    public synchronized void removeRawReferrer(String str, long j7) {
        if (str != null) {
            if (str.length() != 0) {
                int rawReferrerIndex = getRawReferrerIndex(str, j7);
                if (rawReferrerIndex < 0) {
                    return;
                }
                JSONArray rawReferrerArray = getRawReferrerArray();
                JSONArray jSONArray = new JSONArray();
                for (int i9 = 0; i9 < rawReferrerArray.length(); i9++) {
                    if (i9 != rawReferrerIndex) {
                        try {
                            jSONArray.put(rawReferrerArray.getJSONArray(i9));
                        } catch (JSONException unused) {
                        }
                    }
                }
                saveString(PREFS_KEY_RAW_REFERRERS, jSONArray.toString());
            }
        }
    }

    public synchronized void saveDeeplink(Uri uri, long j7) {
        if (uri == null) {
            return;
        }
        saveString(PREFS_KEY_DEEPLINK_URL, uri.toString());
        saveLong(PREFS_KEY_DEEPLINK_CLICK_TIME, j7);
    }

    public synchronized void savePreinstallReferrer(String str) {
        saveString(PREFS_KEY_PREINSTALL_SYSTEM_INSTALLER_REFERRER, str);
    }

    public synchronized void savePushToken(String str) {
        saveString(PREFS_KEY_PUSH_TOKEN, str);
    }

    public synchronized void saveRawReferrer(String str, long j7) {
        if (getRawReferrer(str, j7) != null) {
            return;
        }
        JSONArray rawReferrerArray = getRawReferrerArray();
        if (rawReferrerArray.length() == 10) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(0, str);
        jSONArray.put(1, j7);
        jSONArray.put(2, 0);
        rawReferrerArray.put(jSONArray);
        saveRawReferrerArray(rawReferrerArray);
    }

    public synchronized void saveRawReferrerArray(JSONArray jSONArray) {
        try {
            saveString(PREFS_KEY_RAW_REFERRERS, jSONArray.toString());
        } catch (Throwable unused) {
            remove(PREFS_KEY_RAW_REFERRERS);
        }
    }

    public synchronized void setDisableThirdPartySharing() {
        saveBoolean(PREFS_KEY_DISABLE_THIRD_PARTY_SHARING, true);
    }

    public synchronized void setGdprForgetMe() {
        saveBoolean(PREFS_KEY_GDPR_FORGET_ME, true);
    }

    public synchronized void setInstallTracked() {
        saveBoolean(PREFS_KEY_INSTALL_TRACKED, true);
    }

    public synchronized void setPreinstallPayloadReadStatus(long j7) {
        saveLong(PREFS_KEY_PREINSTALL_PAYLOAD_READ_STATUS, j7);
    }

    public synchronized void setSendingReferrersAsNotSent() {
        try {
            JSONArray rawReferrerArray = getRawReferrerArray();
            boolean z8 = false;
            for (int i9 = 0; i9 < rawReferrerArray.length(); i9++) {
                JSONArray jSONArray = rawReferrerArray.getJSONArray(i9);
                if (jSONArray.optInt(2, -1) == 1) {
                    jSONArray.put(2, 0);
                    z8 = true;
                }
            }
            if (z8) {
                saveRawReferrerArray(rawReferrerArray);
            }
        } catch (JSONException unused) {
        } catch (Throwable th) {
            throw th;
        }
    }
}

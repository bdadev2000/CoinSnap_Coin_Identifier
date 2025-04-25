package com.glority.android.ui.base;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.preference.PreferenceManager;
import android.util.Log;
import java.util.Arrays;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes4.dex */
public class LocaleManager {
    private static final String COUNTRY_KEY = "country_key";
    private static final String[] EUROPE_REGION_CODES = {"AX", "AL", "AD", "AT", "BY", "BE", "BA", "BG", "HR", "CY", "CZ", "DK", "EE", "FO", "FI", "FR", "DE", "GI", "GR", "GG", "VA", "HU", "IS", "IE", "IM", "IT", "JE", "LV", "LI", "LT", "LU", "MK", "MT", "MD", "MC", "ME", "NL", "NO", "PL", "PT", "RO", "RU", "SM", "RS", "SK", "SI", "ES", "SJ", "SE", "CH", "UA", "XK", "039", "150", "151", "154", "155"};
    private static final String[] EUROPE_TIME_ZONES = {"Europe", "Pacific/Marquesas", "Arctic/Longyearbyen", "Asia/Magadan", "Asia/Kamchatka", "Asia/Omsk", "Atlantic/Azores", "America/Cayenne", "Atlantic/Reykjavik"};
    private static final String LANGUAGE_KEY = "language_key";
    private static final String TAG = "LocaleManager";
    private static LocaleManager localeManager;
    private final SharedPreferences prefs;

    private LocaleManager(Context context) {
        this.prefs = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public static void init(Context context) {
        localeManager = new LocaleManager(context);
    }

    public static LocaleManager getInstance() {
        return localeManager;
    }

    public Context setLocale(Context context) {
        String str;
        String str2;
        if (!this.prefs.contains(LANGUAGE_KEY) || !this.prefs.contains(COUNTRY_KEY)) {
            Locale locale = Locale.getDefault();
            String language = locale.getLanguage();
            String country = locale.getCountry();
            persistLocale(locale);
            str = language;
            str2 = country;
        } else {
            str = getLanguage();
            str2 = getCountry();
        }
        return updateResources(context, str, str2);
    }

    public Context setNewLocale(Context context, Locale locale) {
        persistLocale(locale);
        return updateResources(context, locale.getLanguage(), locale.getCountry());
    }

    private Context updateResources(Context context, String str, String str2) {
        Log.d(TAG, "language: " + str + "  country: " + str2);
        Locale locale = new Locale(str, str2);
        Locale.setDefault(locale);
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(locale);
        configuration.uiMode = 0;
        return context.createConfigurationContext(configuration);
    }

    public static Locale getLocale(Resources resources) {
        return resources.getConfiguration().getLocales().get(0);
    }

    public boolean isJapanese() {
        return Locale.JAPANESE.getLanguage().equals(getLanguage());
    }

    public String getLanguage() {
        return this.prefs.getString(LANGUAGE_KEY, "en");
    }

    public String getCountry() {
        return this.prefs.getString(COUNTRY_KEY, "US");
    }

    private void persistLocale(Locale locale) {
        this.prefs.edit().putString(LANGUAGE_KEY, locale.getLanguage()).apply();
        this.prefs.edit().putString(COUNTRY_KEY, locale.getCountry()).apply();
        this.prefs.edit().commit();
    }

    public boolean isEurope() {
        boolean isEuropeTimeZone = isEuropeTimeZone();
        boolean isEuropeLocale = isEuropeLocale();
        Log.d("appViewModel", "isEuropeTimeZone: " + isEuropeTimeZone + " isEuropeLocale: " + isEuropeLocale);
        return isEuropeTimeZone || isEuropeLocale;
    }

    private boolean isEuropeTimeZone() {
        try {
            Log.d("appViewModel", "TimeZone.getDefault().getID(): " + TimeZone.getDefault().getID());
            Log.d("appViewModel", "TimeZone.getDefault().getDisplayName(): " + TimeZone.getDefault().getDisplayName());
            String id = TimeZone.getDefault().getID();
            for (String str : EUROPE_TIME_ZONES) {
                if (id.contains(str)) {
                    return true;
                }
            }
            return TimeZone.getDefault().getDisplayName().contains("Europe");
        } catch (Exception unused) {
            return true;
        }
    }

    private boolean isEuropeLocale() {
        try {
            return Arrays.asList(EUROPE_REGION_CODES).contains(Locale.getDefault().getCountry());
        } catch (Exception unused) {
            return true;
        }
    }
}

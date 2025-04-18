package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.Logger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class LegacyTokenHelper {

    @NotNull
    public static final String APPLICATION_ID_KEY = "com.facebook.TokenCachingStrategy.ApplicationId";

    @NotNull
    public static final String DECLINED_PERMISSIONS_KEY = "com.facebook.TokenCachingStrategy.DeclinedPermissions";

    @NotNull
    public static final String DEFAULT_CACHE_KEY = "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY";

    @NotNull
    public static final String EXPIRATION_DATE_KEY = "com.facebook.TokenCachingStrategy.ExpirationDate";

    @NotNull
    public static final String EXPIRED_PERMISSIONS_KEY = "com.facebook.TokenCachingStrategy.ExpiredPermissions";
    private static final long INVALID_BUNDLE_MILLISECONDS = Long.MIN_VALUE;

    @NotNull
    private static final String IS_SSO_KEY = "com.facebook.TokenCachingStrategy.IsSSO";

    @NotNull
    private static final String JSON_VALUE = "value";

    @NotNull
    private static final String JSON_VALUE_ENUM_TYPE = "enumType";

    @NotNull
    private static final String JSON_VALUE_TYPE = "valueType";

    @NotNull
    public static final String LAST_REFRESH_DATE_KEY = "com.facebook.TokenCachingStrategy.LastRefreshDate";

    @NotNull
    public static final String PERMISSIONS_KEY = "com.facebook.TokenCachingStrategy.Permissions";

    @NotNull
    public static final String TOKEN_KEY = "com.facebook.TokenCachingStrategy.Token";

    @NotNull
    public static final String TOKEN_SOURCE_KEY = "com.facebook.TokenCachingStrategy.AccessTokenSource";

    @NotNull
    private static final String TYPE_BOOLEAN = "bool";

    @NotNull
    private static final String TYPE_BOOLEAN_ARRAY = "bool[]";

    @NotNull
    private static final String TYPE_BYTE = "byte";

    @NotNull
    private static final String TYPE_BYTE_ARRAY = "byte[]";

    @NotNull
    private static final String TYPE_CHAR = "char";

    @NotNull
    private static final String TYPE_CHAR_ARRAY = "char[]";

    @NotNull
    private static final String TYPE_DOUBLE = "double";

    @NotNull
    private static final String TYPE_DOUBLE_ARRAY = "double[]";

    @NotNull
    private static final String TYPE_ENUM = "enum";

    @NotNull
    private static final String TYPE_FLOAT = "float";

    @NotNull
    private static final String TYPE_FLOAT_ARRAY = "float[]";

    @NotNull
    private static final String TYPE_INTEGER = "int";

    @NotNull
    private static final String TYPE_INTEGER_ARRAY = "int[]";

    @NotNull
    private static final String TYPE_LONG = "long";

    @NotNull
    private static final String TYPE_LONG_ARRAY = "long[]";

    @NotNull
    private static final String TYPE_SHORT = "short";

    @NotNull
    private static final String TYPE_SHORT_ARRAY = "short[]";

    @NotNull
    private static final String TYPE_STRING = "string";

    @NotNull
    private static final String TYPE_STRING_LIST = "stringList";

    @NotNull
    private final SharedPreferences cache;

    @NotNull
    private final String cacheKey;

    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "LegacyTokenHelper";

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private final Date getDate(Bundle bundle, String str) {
            if (bundle == null) {
                return null;
            }
            long j2 = bundle.getLong(str, LegacyTokenHelper.INVALID_BUNDLE_MILLISECONDS);
            if (j2 == LegacyTokenHelper.INVALID_BUNDLE_MILLISECONDS) {
                return null;
            }
            return new Date(j2);
        }

        private final void putDate(Bundle bundle, String str, Date date) {
            bundle.putLong(str, date.getTime());
        }

        @Nullable
        public final String getApplicationId(@NotNull Bundle bundle) {
            p0.a.s(bundle, "bundle");
            return bundle.getString(LegacyTokenHelper.APPLICATION_ID_KEY);
        }

        @Nullable
        public final Date getExpirationDate(@NotNull Bundle bundle) {
            p0.a.s(bundle, "bundle");
            return getDate(bundle, LegacyTokenHelper.EXPIRATION_DATE_KEY);
        }

        public final long getExpirationMilliseconds(@NotNull Bundle bundle) {
            p0.a.s(bundle, "bundle");
            return bundle.getLong(LegacyTokenHelper.EXPIRATION_DATE_KEY);
        }

        @Nullable
        public final Date getLastRefreshDate(@NotNull Bundle bundle) {
            p0.a.s(bundle, "bundle");
            return getDate(bundle, LegacyTokenHelper.LAST_REFRESH_DATE_KEY);
        }

        public final long getLastRefreshMilliseconds(@NotNull Bundle bundle) {
            p0.a.s(bundle, "bundle");
            return bundle.getLong(LegacyTokenHelper.LAST_REFRESH_DATE_KEY);
        }

        @Nullable
        public final Set<String> getPermissions(@NotNull Bundle bundle) {
            p0.a.s(bundle, "bundle");
            ArrayList<String> stringArrayList = bundle.getStringArrayList(LegacyTokenHelper.PERMISSIONS_KEY);
            if (stringArrayList == null) {
                return null;
            }
            return new HashSet(stringArrayList);
        }

        @Nullable
        public final AccessTokenSource getSource(@NotNull Bundle bundle) {
            p0.a.s(bundle, "bundle");
            return bundle.containsKey(LegacyTokenHelper.TOKEN_SOURCE_KEY) ? (AccessTokenSource) bundle.getSerializable(LegacyTokenHelper.TOKEN_SOURCE_KEY) : bundle.getBoolean(LegacyTokenHelper.IS_SSO_KEY) ? AccessTokenSource.FACEBOOK_APPLICATION_WEB : AccessTokenSource.WEB_VIEW;
        }

        @Nullable
        public final String getToken(@NotNull Bundle bundle) {
            p0.a.s(bundle, "bundle");
            return bundle.getString(LegacyTokenHelper.TOKEN_KEY);
        }

        public final boolean hasTokenInformation(@Nullable Bundle bundle) {
            String string;
            return (bundle == null || (string = bundle.getString(LegacyTokenHelper.TOKEN_KEY)) == null || string.length() == 0 || bundle.getLong(LegacyTokenHelper.EXPIRATION_DATE_KEY, 0L) == 0) ? false : true;
        }

        public final void putApplicationId(@NotNull Bundle bundle, @Nullable String str) {
            p0.a.s(bundle, "bundle");
            bundle.putString(LegacyTokenHelper.APPLICATION_ID_KEY, str);
        }

        public final void putDeclinedPermissions(@NotNull Bundle bundle, @NotNull Collection<String> collection) {
            p0.a.s(bundle, "bundle");
            p0.a.s(collection, "value");
            bundle.putStringArrayList(LegacyTokenHelper.DECLINED_PERMISSIONS_KEY, new ArrayList<>(collection));
        }

        public final void putExpirationDate(@NotNull Bundle bundle, @NotNull Date date) {
            p0.a.s(bundle, "bundle");
            p0.a.s(date, "value");
            putDate(bundle, LegacyTokenHelper.EXPIRATION_DATE_KEY, date);
        }

        public final void putExpirationMilliseconds(@NotNull Bundle bundle, long j2) {
            p0.a.s(bundle, "bundle");
            bundle.putLong(LegacyTokenHelper.EXPIRATION_DATE_KEY, j2);
        }

        public final void putExpiredPermissions(@NotNull Bundle bundle, @NotNull Collection<String> collection) {
            p0.a.s(bundle, "bundle");
            p0.a.s(collection, "value");
            bundle.putStringArrayList(LegacyTokenHelper.EXPIRED_PERMISSIONS_KEY, new ArrayList<>(collection));
        }

        public final void putLastRefreshDate(@NotNull Bundle bundle, @NotNull Date date) {
            p0.a.s(bundle, "bundle");
            p0.a.s(date, "value");
            putDate(bundle, LegacyTokenHelper.LAST_REFRESH_DATE_KEY, date);
        }

        public final void putLastRefreshMilliseconds(@NotNull Bundle bundle, long j2) {
            p0.a.s(bundle, "bundle");
            bundle.putLong(LegacyTokenHelper.LAST_REFRESH_DATE_KEY, j2);
        }

        public final void putPermissions(@NotNull Bundle bundle, @NotNull Collection<String> collection) {
            p0.a.s(bundle, "bundle");
            p0.a.s(collection, "value");
            bundle.putStringArrayList(LegacyTokenHelper.PERMISSIONS_KEY, new ArrayList<>(collection));
        }

        public final void putSource(@NotNull Bundle bundle, @NotNull AccessTokenSource accessTokenSource) {
            p0.a.s(bundle, "bundle");
            p0.a.s(accessTokenSource, "value");
            bundle.putSerializable(LegacyTokenHelper.TOKEN_SOURCE_KEY, accessTokenSource);
        }

        public final void putToken(@NotNull Bundle bundle, @NotNull String str) {
            p0.a.s(bundle, "bundle");
            p0.a.s(str, "value");
            bundle.putString(LegacyTokenHelper.TOKEN_KEY, str);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LegacyTokenHelper(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        p0.a.s(context, "context");
    }

    private final void deserializeKey(String str, Bundle bundle) throws JSONException {
        String str2;
        String string;
        String string2 = this.cache.getString(str, JsonUtils.EMPTY_JSON);
        if (string2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        JSONObject jSONObject = new JSONObject(string2);
        String string3 = jSONObject.getString(JSON_VALUE_TYPE);
        if (string3 != null) {
            int i2 = 0;
            switch (string3.hashCode()) {
                case -1573317553:
                    if (string3.equals(TYPE_STRING_LIST)) {
                        JSONArray jSONArray = jSONObject.getJSONArray("value");
                        int length = jSONArray.length();
                        ArrayList<String> arrayList = new ArrayList<>(length);
                        if (length > 0) {
                            while (true) {
                                int i3 = i2 + 1;
                                Object obj = jSONArray.get(i2);
                                if (obj == JSONObject.NULL) {
                                    str2 = null;
                                } else {
                                    if (obj == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                    }
                                    str2 = (String) obj;
                                }
                                arrayList.add(i2, str2);
                                if (i3 < length) {
                                    i2 = i3;
                                }
                            }
                        }
                        bundle.putStringArrayList(str, arrayList);
                        return;
                    }
                    return;
                case -1383386164:
                    if (string3.equals(TYPE_BOOLEAN_ARRAY)) {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("value");
                        int length2 = jSONArray2.length();
                        boolean[] zArr = new boolean[length2];
                        int i4 = length2 - 1;
                        if (i4 >= 0) {
                            while (true) {
                                int i5 = i2 + 1;
                                zArr[i2] = jSONArray2.getBoolean(i2);
                                if (i5 <= i4) {
                                    i2 = i5;
                                }
                            }
                        }
                        bundle.putBooleanArray(str, zArr);
                        return;
                    }
                    return;
                case -1374008726:
                    if (string3.equals(TYPE_BYTE_ARRAY)) {
                        JSONArray jSONArray3 = jSONObject.getJSONArray("value");
                        int length3 = jSONArray3.length();
                        byte[] bArr = new byte[length3];
                        int i6 = length3 - 1;
                        if (i6 >= 0) {
                            while (true) {
                                int i7 = i2 + 1;
                                bArr[i2] = (byte) jSONArray3.getInt(i2);
                                if (i7 <= i6) {
                                    i2 = i7;
                                }
                            }
                        }
                        bundle.putByteArray(str, bArr);
                        return;
                    }
                    return;
                case -1361632968:
                    if (string3.equals(TYPE_CHAR_ARRAY)) {
                        JSONArray jSONArray4 = jSONObject.getJSONArray("value");
                        int length4 = jSONArray4.length();
                        char[] cArr = new char[length4];
                        int i8 = length4 - 1;
                        if (i8 >= 0) {
                            int i9 = 0;
                            while (true) {
                                int i10 = i9 + 1;
                                String string4 = jSONArray4.getString(i9);
                                if (string4 != null && string4.length() == 1) {
                                    cArr[i9] = string4.charAt(0);
                                }
                                if (i10 <= i8) {
                                    i9 = i10;
                                }
                            }
                        }
                        bundle.putCharArray(str, cArr);
                        return;
                    }
                    return;
                case -1325958191:
                    if (string3.equals(TYPE_DOUBLE)) {
                        bundle.putDouble(str, jSONObject.getDouble("value"));
                        return;
                    }
                    return;
                case -1097129250:
                    if (string3.equals(TYPE_LONG_ARRAY)) {
                        JSONArray jSONArray5 = jSONObject.getJSONArray("value");
                        int length5 = jSONArray5.length();
                        long[] jArr = new long[length5];
                        int i11 = length5 - 1;
                        if (i11 >= 0) {
                            while (true) {
                                int i12 = i2 + 1;
                                jArr[i2] = jSONArray5.getLong(i2);
                                if (i12 <= i11) {
                                    i2 = i12;
                                }
                            }
                        }
                        bundle.putLongArray(str, jArr);
                        return;
                    }
                    return;
                case -891985903:
                    if (string3.equals(TYPE_STRING)) {
                        bundle.putString(str, jSONObject.getString("value"));
                        return;
                    }
                    return;
                case -766441794:
                    if (string3.equals(TYPE_FLOAT_ARRAY)) {
                        JSONArray jSONArray6 = jSONObject.getJSONArray("value");
                        int length6 = jSONArray6.length();
                        float[] fArr = new float[length6];
                        int i13 = length6 - 1;
                        if (i13 >= 0) {
                            while (true) {
                                int i14 = i2 + 1;
                                fArr[i2] = (float) jSONArray6.getDouble(i2);
                                if (i14 <= i13) {
                                    i2 = i14;
                                }
                            }
                        }
                        bundle.putFloatArray(str, fArr);
                        return;
                    }
                    return;
                case 104431:
                    if (string3.equals("int")) {
                        bundle.putInt(str, jSONObject.getInt("value"));
                        return;
                    }
                    return;
                case 3029738:
                    if (string3.equals(TYPE_BOOLEAN)) {
                        bundle.putBoolean(str, jSONObject.getBoolean("value"));
                        return;
                    }
                    return;
                case 3039496:
                    if (string3.equals(TYPE_BYTE)) {
                        bundle.putByte(str, (byte) jSONObject.getInt("value"));
                        return;
                    }
                    return;
                case 3052374:
                    if (string3.equals(TYPE_CHAR) && (string = jSONObject.getString("value")) != null && string.length() == 1) {
                        bundle.putChar(str, string.charAt(0));
                        return;
                    }
                    return;
                case 3118337:
                    if (string3.equals(TYPE_ENUM)) {
                        try {
                            bundle.putSerializable(str, Enum.valueOf(Class.forName(jSONObject.getString(JSON_VALUE_ENUM_TYPE)), jSONObject.getString("value")));
                            return;
                        } catch (ClassNotFoundException | IllegalArgumentException unused) {
                            return;
                        }
                    }
                    return;
                case 3327612:
                    if (string3.equals(TYPE_LONG)) {
                        bundle.putLong(str, jSONObject.getLong("value"));
                        return;
                    }
                    return;
                case 97526364:
                    if (string3.equals(TYPE_FLOAT)) {
                        bundle.putFloat(str, (float) jSONObject.getDouble("value"));
                        return;
                    }
                    return;
                case 100361105:
                    if (string3.equals(TYPE_INTEGER_ARRAY)) {
                        JSONArray jSONArray7 = jSONObject.getJSONArray("value");
                        int length7 = jSONArray7.length();
                        int[] iArr = new int[length7];
                        int i15 = length7 - 1;
                        if (i15 >= 0) {
                            while (true) {
                                int i16 = i2 + 1;
                                iArr[i2] = jSONArray7.getInt(i2);
                                if (i16 <= i15) {
                                    i2 = i16;
                                }
                            }
                        }
                        bundle.putIntArray(str, iArr);
                        return;
                    }
                    return;
                case 109413500:
                    if (string3.equals(TYPE_SHORT)) {
                        bundle.putShort(str, (short) jSONObject.getInt("value"));
                        return;
                    }
                    return;
                case 1359468275:
                    if (string3.equals(TYPE_DOUBLE_ARRAY)) {
                        JSONArray jSONArray8 = jSONObject.getJSONArray("value");
                        int length8 = jSONArray8.length();
                        double[] dArr = new double[length8];
                        int i17 = length8 - 1;
                        if (i17 >= 0) {
                            while (true) {
                                int i18 = i2 + 1;
                                dArr[i2] = jSONArray8.getDouble(i2);
                                if (i18 <= i17) {
                                    i2 = i18;
                                }
                            }
                        }
                        bundle.putDoubleArray(str, dArr);
                        return;
                    }
                    return;
                case 2067161310:
                    if (string3.equals(TYPE_SHORT_ARRAY)) {
                        JSONArray jSONArray9 = jSONObject.getJSONArray("value");
                        int length9 = jSONArray9.length();
                        short[] sArr = new short[length9];
                        int i19 = length9 - 1;
                        if (i19 >= 0) {
                            while (true) {
                                int i20 = i2 + 1;
                                sArr[i2] = (short) jSONArray9.getInt(i2);
                                if (i20 <= i19) {
                                    i2 = i20;
                                }
                            }
                        }
                        bundle.putShortArray(str, sArr);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Nullable
    public static final String getApplicationId(@NotNull Bundle bundle) {
        return Companion.getApplicationId(bundle);
    }

    @Nullable
    public static final Date getExpirationDate(@NotNull Bundle bundle) {
        return Companion.getExpirationDate(bundle);
    }

    public static final long getExpirationMilliseconds(@NotNull Bundle bundle) {
        return Companion.getExpirationMilliseconds(bundle);
    }

    @Nullable
    public static final Date getLastRefreshDate(@NotNull Bundle bundle) {
        return Companion.getLastRefreshDate(bundle);
    }

    public static final long getLastRefreshMilliseconds(@NotNull Bundle bundle) {
        return Companion.getLastRefreshMilliseconds(bundle);
    }

    @Nullable
    public static final Set<String> getPermissions(@NotNull Bundle bundle) {
        return Companion.getPermissions(bundle);
    }

    @Nullable
    public static final AccessTokenSource getSource(@NotNull Bundle bundle) {
        return Companion.getSource(bundle);
    }

    @Nullable
    public static final String getToken(@NotNull Bundle bundle) {
        return Companion.getToken(bundle);
    }

    public static final boolean hasTokenInformation(@Nullable Bundle bundle) {
        return Companion.hasTokenInformation(bundle);
    }

    public static final void putApplicationId(@NotNull Bundle bundle, @Nullable String str) {
        Companion.putApplicationId(bundle, str);
    }

    public static final void putDeclinedPermissions(@NotNull Bundle bundle, @NotNull Collection<String> collection) {
        Companion.putDeclinedPermissions(bundle, collection);
    }

    public static final void putExpirationDate(@NotNull Bundle bundle, @NotNull Date date) {
        Companion.putExpirationDate(bundle, date);
    }

    public static final void putExpirationMilliseconds(@NotNull Bundle bundle, long j2) {
        Companion.putExpirationMilliseconds(bundle, j2);
    }

    public static final void putExpiredPermissions(@NotNull Bundle bundle, @NotNull Collection<String> collection) {
        Companion.putExpiredPermissions(bundle, collection);
    }

    public static final void putLastRefreshDate(@NotNull Bundle bundle, @NotNull Date date) {
        Companion.putLastRefreshDate(bundle, date);
    }

    public static final void putLastRefreshMilliseconds(@NotNull Bundle bundle, long j2) {
        Companion.putLastRefreshMilliseconds(bundle, j2);
    }

    public static final void putPermissions(@NotNull Bundle bundle, @NotNull Collection<String> collection) {
        Companion.putPermissions(bundle, collection);
    }

    public static final void putSource(@NotNull Bundle bundle, @NotNull AccessTokenSource accessTokenSource) {
        Companion.putSource(bundle, accessTokenSource);
    }

    public static final void putToken(@NotNull Bundle bundle, @NotNull String str) {
        Companion.putToken(bundle, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void serializeKey(java.lang.String r9, android.os.Bundle r10, android.content.SharedPreferences.Editor r11) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.LegacyTokenHelper.serializeKey(java.lang.String, android.os.Bundle, android.content.SharedPreferences$Editor):void");
    }

    public final void clear() {
        this.cache.edit().clear().apply();
    }

    @Nullable
    public final Bundle load() {
        Bundle bundle = new Bundle();
        for (String str : this.cache.getAll().keySet()) {
            try {
                p0.a.r(str, SDKConstants.PARAM_KEY);
                deserializeKey(str, bundle);
            } catch (JSONException e) {
                Logger.Companion companion = Logger.Companion;
                LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                String str2 = TAG;
                p0.a.r(str2, "TAG");
                companion.log(loggingBehavior, 5, str2, "Error reading cached value for key: '" + ((Object) str) + "' -- " + e);
                return null;
            }
        }
        return bundle;
    }

    public final void save(@NotNull Bundle bundle) {
        p0.a.s(bundle, "bundle");
        SharedPreferences.Editor edit = this.cache.edit();
        for (String str : bundle.keySet()) {
            try {
                p0.a.r(str, SDKConstants.PARAM_KEY);
                p0.a.r(edit, "editor");
                serializeKey(str, bundle, edit);
            } catch (JSONException e) {
                Logger.Companion companion = Logger.Companion;
                LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                String str2 = TAG;
                p0.a.r(str2, "TAG");
                companion.log(loggingBehavior, 5, str2, "Error processing value for key: '" + ((Object) str) + "' -- " + e);
                return;
            }
        }
        edit.apply();
    }

    public LegacyTokenHelper(@NotNull Context context, @Nullable String str) {
        p0.a.s(context, "context");
        str = (str == null || str.length() == 0) ? DEFAULT_CACHE_KEY : str;
        this.cacheKey = str;
        Context applicationContext = context.getApplicationContext();
        SharedPreferences sharedPreferences = (applicationContext != null ? applicationContext : context).getSharedPreferences(str, 0);
        p0.a.r(sharedPreferences, "context.getSharedPreferences(this.cacheKey, Context.MODE_PRIVATE)");
        this.cache = sharedPreferences;
    }

    public /* synthetic */ LegacyTokenHelper(Context context, String str, int i2, k kVar) {
        this(context, (i2 & 2) != 0 ? null : str);
    }
}

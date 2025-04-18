package com.adjust.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import vd.e;

/* loaded from: classes.dex */
public class PreinstallUtil {
    private static final long ALL_LOCATION_BITMASK = 255;
    private static final long CONTENT_PROVIDER_BITMASK = 16;
    private static final long CONTENT_PROVIDER_INTENT_ACTION_BITMASK = 32;
    private static final long CONTENT_PROVIDER_NO_PERMISSION_BITMASK = 128;
    private static final long FILE_SYSTEM_BITMASK = 64;
    private static final long SYSTEM_PROPERTY_BITMASK = 1;
    private static final long SYSTEM_PROPERTY_PATH_BITMASK = 4;
    private static final long SYSTEM_PROPERTY_PATH_REFLECTION_BITMASK = 8;
    private static final long SYSTEM_PROPERTY_REFLECTION_BITMASK = 2;

    public static String getPayloadFromContentProviderDefault(Context context, String str, ILogger iLogger) {
        if (Util.resolveContentProvider(context, Constants.ADJUST_PREINSTALL_CONTENT_URI_AUTHORITY)) {
            return readContentProvider(context, Util.formatString("content://%s/%s", Constants.ADJUST_PREINSTALL_CONTENT_URI_AUTHORITY, Constants.ADJUST_PREINSTALL_CONTENT_URI_PATH), str, iLogger);
        }
        return null;
    }

    public static String getPayloadFromFileSystem(String str, String str2, ILogger iLogger) {
        String readFileContent = readFileContent(Constants.ADJUST_PREINSTALL_FILE_SYSTEM_PATH, iLogger);
        if (readFileContent == null || readFileContent.isEmpty()) {
            if (str2 != null && !str2.isEmpty()) {
                readFileContent = readFileContent(str2, iLogger);
            }
            if (readFileContent == null || readFileContent.isEmpty()) {
                return null;
            }
        }
        return readPayloadFromJsonString(readFileContent, str, iLogger);
    }

    public static String getPayloadFromSystemProperty(String str, ILogger iLogger) {
        return readSystemProperty(e.e(Constants.ADJUST_PREINSTALL_SYSTEM_PROPERTY_PREFIX, str), iLogger);
    }

    public static String getPayloadFromSystemPropertyFilePath(String str, ILogger iLogger) {
        String readFileContent;
        String readSystemProperty = readSystemProperty(Constants.ADJUST_PREINSTALL_SYSTEM_PROPERTY_PATH, iLogger);
        if (readSystemProperty == null || readSystemProperty.isEmpty() || (readFileContent = readFileContent(readSystemProperty, iLogger)) == null || readFileContent.isEmpty()) {
            return null;
        }
        return readPayloadFromJsonString(readFileContent, str, iLogger);
    }

    public static String getPayloadFromSystemPropertyFilePathReflection(String str, ILogger iLogger) {
        String readFileContent;
        String readSystemPropertyReflection = readSystemPropertyReflection(Constants.ADJUST_PREINSTALL_SYSTEM_PROPERTY_PATH, iLogger);
        if (readSystemPropertyReflection == null || readSystemPropertyReflection.isEmpty() || (readFileContent = readFileContent(readSystemPropertyReflection, iLogger)) == null || readFileContent.isEmpty()) {
            return null;
        }
        return readPayloadFromJsonString(readFileContent, str, iLogger);
    }

    public static String getPayloadFromSystemPropertyReflection(String str, ILogger iLogger) {
        return readSystemPropertyReflection(e.e(Constants.ADJUST_PREINSTALL_SYSTEM_PROPERTY_PREFIX, str), iLogger);
    }

    public static List<String> getPayloadsFromContentProviderIntentAction(Context context, String str, ILogger iLogger) {
        return readContentProviderIntentAction(context, str, "android.permission.INSTALL_PACKAGES", iLogger);
    }

    public static List<String> getPayloadsFromContentProviderNoPermission(Context context, String str, ILogger iLogger) {
        return readContentProviderIntentAction(context, str, null, iLogger);
    }

    public static boolean hasAllLocationsBeenRead(long j3) {
        return (j3 & ALL_LOCATION_BITMASK) == ALL_LOCATION_BITMASK;
    }

    public static boolean hasNotBeenRead(String str, long j3) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1771852303:
                if (str.equals(Constants.CONTENT_PROVIDER_INTENT_ACTION)) {
                    c10 = 0;
                    break;
                }
                break;
            case -1590804087:
                if (str.equals(Constants.SYSTEM_PROPERTIES_PATH_REFLECTION)) {
                    c10 = 1;
                    break;
                }
                break;
            case -782042377:
                if (str.equals(Constants.CONTENT_PROVIDER)) {
                    c10 = 2;
                    break;
                }
                break;
            case -480091743:
                if (str.equals(Constants.SYSTEM_PROPERTIES_PATH)) {
                    c10 = 3;
                    break;
                }
                break;
            case -468656985:
                if (str.equals(Constants.SYSTEM_PROPERTIES_REFLECTION)) {
                    c10 = 4;
                    break;
                }
                break;
            case -95318717:
                if (str.equals(Constants.SYSTEM_PROPERTIES)) {
                    c10 = 5;
                    break;
                }
                break;
            case 2055247442:
                if (str.equals(Constants.FILE_SYSTEM)) {
                    c10 = 6;
                    break;
                }
                break;
            case 2080271301:
                if (str.equals(Constants.CONTENT_PROVIDER_NO_PERMISSION)) {
                    c10 = 7;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return (j3 & CONTENT_PROVIDER_INTENT_ACTION_BITMASK) != CONTENT_PROVIDER_INTENT_ACTION_BITMASK;
            case 1:
                return (j3 & SYSTEM_PROPERTY_PATH_REFLECTION_BITMASK) != SYSTEM_PROPERTY_PATH_REFLECTION_BITMASK;
            case 2:
                return (j3 & CONTENT_PROVIDER_BITMASK) != CONTENT_PROVIDER_BITMASK;
            case 3:
                return (j3 & SYSTEM_PROPERTY_PATH_BITMASK) != SYSTEM_PROPERTY_PATH_BITMASK;
            case 4:
                return (j3 & SYSTEM_PROPERTY_REFLECTION_BITMASK) != SYSTEM_PROPERTY_REFLECTION_BITMASK;
            case 5:
                return (j3 & 1) != 1;
            case 6:
                return (j3 & FILE_SYSTEM_BITMASK) != FILE_SYSTEM_BITMASK;
            case 7:
                return (j3 & CONTENT_PROVIDER_NO_PERMISSION_BITMASK) != CONTENT_PROVIDER_NO_PERMISSION_BITMASK;
            default:
                return false;
        }
    }

    public static long markAsRead(String str, long j3) {
        long j10;
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1771852303:
                if (str.equals(Constants.CONTENT_PROVIDER_INTENT_ACTION)) {
                    c10 = 0;
                    break;
                }
                break;
            case -1590804087:
                if (str.equals(Constants.SYSTEM_PROPERTIES_PATH_REFLECTION)) {
                    c10 = 1;
                    break;
                }
                break;
            case -782042377:
                if (str.equals(Constants.CONTENT_PROVIDER)) {
                    c10 = 2;
                    break;
                }
                break;
            case -480091743:
                if (str.equals(Constants.SYSTEM_PROPERTIES_PATH)) {
                    c10 = 3;
                    break;
                }
                break;
            case -468656985:
                if (str.equals(Constants.SYSTEM_PROPERTIES_REFLECTION)) {
                    c10 = 4;
                    break;
                }
                break;
            case -95318717:
                if (str.equals(Constants.SYSTEM_PROPERTIES)) {
                    c10 = 5;
                    break;
                }
                break;
            case 2055247442:
                if (str.equals(Constants.FILE_SYSTEM)) {
                    c10 = 6;
                    break;
                }
                break;
            case 2080271301:
                if (str.equals(Constants.CONTENT_PROVIDER_NO_PERMISSION)) {
                    c10 = 7;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                j10 = CONTENT_PROVIDER_INTENT_ACTION_BITMASK;
                break;
            case 1:
                j10 = SYSTEM_PROPERTY_PATH_REFLECTION_BITMASK;
                break;
            case 2:
                j10 = CONTENT_PROVIDER_BITMASK;
                break;
            case 3:
                j10 = SYSTEM_PROPERTY_PATH_BITMASK;
                break;
            case 4:
                j10 = SYSTEM_PROPERTY_REFLECTION_BITMASK;
                break;
            case 5:
                j10 = 1;
                break;
            case 6:
                j10 = FILE_SYSTEM_BITMASK;
                break;
            case 7:
                j10 = CONTENT_PROVIDER_NO_PERMISSION_BITMASK;
                break;
            default:
                return j3;
        }
        return j3 | j10;
    }

    private static String readContentProvider(Context context, String str, String str2, ILogger iLogger) {
        try {
            Cursor query = context.getContentResolver().query(Uri.parse(str), new String[]{"encrypted_data"}, "package_name=?", new String[]{str2}, null);
            if (query == null) {
                iLogger.debug("Read content provider cursor null content uri [%s]", str);
                return null;
            }
            if (query.moveToFirst()) {
                String string = query.getString(0);
                query.close();
                return string;
            }
            iLogger.debug("Read content provider cursor empty content uri [%s]", str);
            query.close();
            return null;
        } catch (Exception e2) {
            iLogger.error("Exception read content provider uri [%s] error [%s]", str, e2.getMessage());
            return null;
        }
    }

    private static List<String> readContentProviderIntentAction(Context context, String str, String str2, ILogger iLogger) {
        List<ResolveInfo> queryIntentContentProviders;
        String str3;
        String readContentProvider;
        PackageManager.ResolveInfoFlags of2;
        if (Build.VERSION.SDK_INT >= 33) {
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent(Constants.ADJUST_PREINSTALL_CONTENT_PROVIDER_INTENT_ACTION);
            of2 = PackageManager.ResolveInfoFlags.of(0L);
            queryIntentContentProviders = packageManager.queryIntentContentProviders(intent, of2);
        } else {
            queryIntentContentProviders = context.getPackageManager().queryIntentContentProviders(new Intent(Constants.ADJUST_PREINSTALL_CONTENT_PROVIDER_INTENT_ACTION), 0);
        }
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : queryIntentContentProviders) {
            if ((str2 == null || context.getPackageManager().checkPermission(str2, resolveInfo.providerInfo.packageName) == 0) && (str3 = resolveInfo.providerInfo.authority) != null && !str3.isEmpty() && (readContentProvider = readContentProvider(context, Util.formatString("content://%s/%s", str3, Constants.ADJUST_PREINSTALL_CONTENT_URI_PATH), str, iLogger)) != null && !readContentProvider.isEmpty()) {
                arrayList.add(readContentProvider);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    private static String readFileContent(String str, ILogger iLogger) {
        File file = new File(str);
        if (file.exists() && file.isFile() && file.canRead()) {
            try {
                int length = (int) file.length();
                if (length <= 0) {
                    iLogger.debug("Read file content empty file", new Object[0]);
                    return null;
                }
                byte[] bArr = new byte[length];
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    try {
                        fileInputStream.read(bArr);
                        fileInputStream.close();
                        return new String(bArr);
                    } catch (Exception e2) {
                        iLogger.error("Exception read file input stream error [%s]", e2.getMessage());
                        fileInputStream.close();
                        return null;
                    }
                } catch (Throwable th2) {
                    fileInputStream.close();
                    throw th2;
                }
            } catch (Exception e10) {
                iLogger.error("Exception read file content error [%s]", e10.getMessage());
            }
        }
        return null;
    }

    private static String readPayloadFromJsonString(String str, String str2, ILogger iLogger) {
        try {
            return new JSONObject(str.trim()).optString(str2);
        } catch (Exception e2) {
            iLogger.error("Exception read payload from json string error [%s]", e2.getMessage());
            return null;
        }
    }

    private static String readSystemProperty(String str, ILogger iLogger) {
        try {
            return System.getProperty(str);
        } catch (Exception e2) {
            iLogger.error("Exception read system property key [%s] error [%s]", str, e2.getMessage());
            return null;
        }
    }

    private static String readSystemPropertyReflection(String str, ILogger iLogger) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getDeclaredMethod("get", String.class).invoke(cls, str);
        } catch (Exception e2) {
            iLogger.error("Exception read system property using reflection key [%s] error [%s]", str, e2.getMessage());
            return null;
        }
    }
}

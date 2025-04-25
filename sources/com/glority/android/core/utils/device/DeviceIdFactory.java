package com.glority.android.core.utils.device;

import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.UUID;

/* loaded from: classes7.dex */
public class DeviceIdFactory {
    private static final String PREFS_DEVICE_ID = "device_id";
    private static final String PREFS_FILE = "device_id.xml";
    private static final String TAG = "DeviceIdFactory";
    private static UUID uuid;

    public DeviceIdFactory(Context context) {
        String str = TAG;
        Log.v(str, "constructor called");
        if (uuid == null) {
            synchronized (DeviceIdFactory.class) {
                if (uuid == null) {
                    SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS_FILE, 0);
                    String string = sharedPreferences.getString("device_id", null);
                    if (string != null) {
                        uuid = UUID.fromString(string);
                    } else {
                        String string2 = Settings.Secure.getString(context.getContentResolver(), "android_id");
                        try {
                            Log.v(str, "androidId: " + string2);
                            if (!"9774d56d682e549c".equals(string2) && string2 != null) {
                                uuid = UUID.nameUUIDFromBytes(string2.getBytes("UTF-8"));
                            } else {
                                uuid = UUID.randomUUID();
                            }
                            Log.v(str, "uuid: " + uuid.toString());
                            sharedPreferences.edit().putString("device_id", uuid.toString()).commit();
                        } catch (UnsupportedEncodingException e) {
                            Log.e(TAG, e.getMessage());
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }
    }

    public UUID getDeviceId() {
        return uuid;
    }
}

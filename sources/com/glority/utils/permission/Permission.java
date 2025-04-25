package com.glority.utils.permission;

import android.content.Context;
import com.glority.utils.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes9.dex */
public class Permission {
    public static final int CALENDAR = 65290;
    public static final int CAMERA = 65289;
    public static final int COARSE_LOCATION = 65291;
    public static final int CONTACTS = 65288;
    public static final int LOCATION = 65283;
    public static final int MEDIA_LOCATION = 65284;
    public static final int MICROPHONE = 65285;
    public static final int PHONE_STATE = 65282;
    static final int REQUEST_PERMISSIONS = 65280;
    public static final int SENSORS = 65287;
    public static final int SMS = 65286;
    public static final int STORAGE = 65281;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes9.dex */
    public @interface PermissionCode {
    }

    private Permission() {
        throw new UnsupportedOperationException("U can't initialize me!");
    }

    public static String map(int i) {
        switch (i) {
            case STORAGE /* 65281 */:
                return "android.permission.WRITE_EXTERNAL_STORAGE";
            case PHONE_STATE /* 65282 */:
                return "android.permission.READ_PHONE_STATE";
            case LOCATION /* 65283 */:
                return "android.permission.ACCESS_FINE_LOCATION";
            case MEDIA_LOCATION /* 65284 */:
                return "android.permission.ACCESS_MEDIA_LOCATION";
            case MICROPHONE /* 65285 */:
                return "android.permission.RECORD_AUDIO";
            case SMS /* 65286 */:
                return "android.permission.SEND_SMS";
            case SENSORS /* 65287 */:
                return "android.permission.BODY_SENSORS";
            case CONTACTS /* 65288 */:
                return "android.permission.READ_CONTACTS";
            case CAMERA /* 65289 */:
                return "android.permission.CAMERA";
            case CALENDAR /* 65290 */:
                return "android.permission.READ_CALENDAR";
            case COARSE_LOCATION /* 65291 */:
                return "android.permission.ACCESS_COARSE_LOCATION";
            default:
                throw new IllegalArgumentException("Unrecognized permission code " + i);
        }
    }

    public static String name(Context context, String str) {
        int i;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1928411001:
                if (str.equals("android.permission.READ_CALENDAR")) {
                    c = 0;
                    break;
                }
                break;
            case -1888586689:
                if (str.equals("android.permission.ACCESS_FINE_LOCATION")) {
                    c = 1;
                    break;
                }
                break;
            case -1238066820:
                if (str.equals("android.permission.BODY_SENSORS")) {
                    c = 2;
                    break;
                }
                break;
            case -63024214:
                if (str.equals("android.permission.ACCESS_COARSE_LOCATION")) {
                    c = 3;
                    break;
                }
                break;
            case -5573545:
                if (str.equals("android.permission.READ_PHONE_STATE")) {
                    c = 4;
                    break;
                }
                break;
            case 52602690:
                if (str.equals("android.permission.SEND_SMS")) {
                    c = 5;
                    break;
                }
                break;
            case 463403621:
                if (str.equals("android.permission.CAMERA")) {
                    c = 6;
                    break;
                }
                break;
            case 1365911975:
                if (str.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
                    c = 7;
                    break;
                }
                break;
            case 1831139720:
                if (str.equals("android.permission.RECORD_AUDIO")) {
                    c = '\b';
                    break;
                }
                break;
            case 1977429404:
                if (str.equals("android.permission.READ_CONTACTS")) {
                    c = '\t';
                    break;
                }
                break;
            case 2114579147:
                if (str.equals("android.permission.ACCESS_MEDIA_LOCATION")) {
                    c = '\n';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                i = R.string.permission_calendar_permission;
                break;
            case 1:
            case 3:
                i = R.string.permission_location_permission;
                break;
            case 2:
                i = R.string.permission_sensor_permission;
                break;
            case 4:
                i = R.string.permission_phone_permission;
                break;
            case 5:
                i = R.string.permission_sms_permission;
                break;
            case 6:
                i = R.string.permission_camera_permission;
                break;
            case 7:
                i = R.string.permission_storage_permission;
                break;
            case '\b':
                i = R.string.permission_microphone_permission;
                break;
            case '\t':
                i = R.string.permission_contacts_permission;
                break;
            case '\n':
                i = R.string.permission_location_permission;
                break;
            default:
                throw new IllegalArgumentException("Unrecognized permission " + str);
        }
        return context.getResources().getString(i);
    }

    public static String names(Context context, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(name(context, strArr[i]));
            if (i != length - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }
}

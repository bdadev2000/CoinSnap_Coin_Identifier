package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.content.SharedPreferences;
import com.mbridge.msdk.foundation.tools.FastKV;

/* loaded from: classes4.dex */
public final class al {
    static FastKV a;

    public static Object a(Context context, String str, Object obj) {
        String str2;
        if (context == null) {
            return obj;
        }
        if (obj != null) {
            str2 = obj.getClass().getSimpleName();
        } else {
            str2 = "";
        }
        com.mbridge.msdk.foundation.controller.d.a();
        if (a == null) {
            try {
                a = new FastKV.Builder(com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_CONFIG), "share_date").build();
            } catch (Exception unused) {
                a = null;
            }
        }
        if (a != null) {
            try {
                if ("String".equals(str2)) {
                    return a.getString(str, (String) obj);
                }
                if ("Integer".equals(str2)) {
                    return Integer.valueOf(a.getInt(str, ((Integer) obj).intValue()));
                }
                if ("Boolean".equals(str2)) {
                    return Boolean.valueOf(a.getBoolean(str, ((Boolean) obj).booleanValue()));
                }
                if ("Float".equals(str2)) {
                    return Float.valueOf(a.getFloat(str, ((Float) obj).floatValue()));
                }
                if ("Long".equals(str2)) {
                    return Long.valueOf(a.getLong(str, ((Long) obj).longValue()));
                }
            } catch (Exception unused2) {
                return obj;
            }
        } else {
            SharedPreferences sharedPreferences = context.getSharedPreferences("share_date", 0);
            if ("String".equals(str2)) {
                return sharedPreferences.getString(str, (String) obj);
            }
            if ("Integer".equals(str2)) {
                return Integer.valueOf(sharedPreferences.getInt(str, ((Integer) obj).intValue()));
            }
            if ("Boolean".equals(str2)) {
                return Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) obj).booleanValue()));
            }
            if ("Float".equals(str2)) {
                return Float.valueOf(sharedPreferences.getFloat(str, ((Float) obj).floatValue()));
            }
            if ("Long".equals(str2)) {
                return Long.valueOf(sharedPreferences.getLong(str, ((Long) obj).longValue()));
            }
        }
        return obj;
    }

    public static void b(Context context, String str, Object obj) {
        String simpleName = obj.getClass().getSimpleName();
        if (context == null) {
            return;
        }
        com.mbridge.msdk.foundation.controller.d.a();
        if (a == null) {
            try {
                a = new FastKV.Builder(com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_CONFIG), "share_date").build();
            } catch (Exception unused) {
                a = null;
            }
        }
        if (a != null) {
            try {
                if ("String".equals(simpleName)) {
                    a.putString(str, (String) obj);
                } else if ("Integer".equals(simpleName)) {
                    a.putInt(str, ((Integer) obj).intValue());
                } else if ("Boolean".equals(simpleName)) {
                    a.putBoolean(str, ((Boolean) obj).booleanValue());
                } else if ("Float".equals(simpleName)) {
                    a.putFloat(str, ((Float) obj).floatValue());
                } else if ("Long".equals(simpleName)) {
                    a.putLong(str, ((Long) obj).longValue());
                }
                return;
            } catch (Exception unused2) {
                return;
            }
        }
        SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences("share_date", 0).edit();
        if ("String".equals(simpleName)) {
            edit.putString(str, (String) obj);
        } else if ("Integer".equals(simpleName)) {
            edit.putInt(str, ((Integer) obj).intValue());
        } else if ("Boolean".equals(simpleName)) {
            edit.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if ("Float".equals(simpleName)) {
            edit.putFloat(str, ((Float) obj).floatValue());
        } else if ("Long".equals(simpleName)) {
            edit.putLong(str, ((Long) obj).longValue());
        }
        edit.apply();
    }
}

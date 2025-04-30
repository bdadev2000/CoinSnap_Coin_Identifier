package com.applovin.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import com.applovin.impl.sm;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class sj {
    private static com.applovin.impl.sdk.k b;

    /* renamed from: c, reason: collision with root package name */
    private static SharedPreferences f11194c;

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f11195a;

    public sj(com.applovin.impl.sdk.k kVar) {
        this.f11195a = com.applovin.impl.sdk.k.k().getSharedPreferences("com.applovin.sdk.preferences." + kVar.d0(), 0);
        b = kVar;
    }

    public void a(SharedPreferences sharedPreferences) {
        a(sharedPreferences.edit().clear());
    }

    public void b(qj qjVar, Object obj) {
        b(qjVar, obj, this.f11195a);
    }

    public static void b(qj qjVar, Object obj, Context context) {
        a(qjVar.a(), obj, a(context), (SharedPreferences.Editor) null);
    }

    public Object a(qj qjVar, Object obj) {
        return a(qjVar, obj, this.f11195a);
    }

    public static Object a(qj qjVar, Object obj, Context context) {
        return a(qjVar.a(), obj, qjVar.b(), a(context));
    }

    public void b(qj qjVar, Object obj, SharedPreferences sharedPreferences) {
        a(qjVar.a(), obj, sharedPreferences);
    }

    public Object a(qj qjVar, Object obj, SharedPreferences sharedPreferences) {
        return a(qjVar.a(), obj, qjVar.b(), sharedPreferences);
    }

    public void b(qj qjVar) {
        a(this.f11195a.edit().remove(qjVar.a()));
    }

    public static Object a(qj qjVar, Object obj, SharedPreferences sharedPreferences, boolean z8) {
        return a(qjVar.a(), obj, qjVar.b(), sharedPreferences, z8);
    }

    public static Object a(String str, Object obj, Class cls, SharedPreferences sharedPreferences) {
        return a(str, obj, cls, sharedPreferences, true);
    }

    public static Object a(String str, Object obj, Class cls, SharedPreferences sharedPreferences, boolean z8) {
        Object stringSet;
        long longValue;
        int intValue;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (!sharedPreferences.contains(str)) {
                return obj;
            }
            if (Boolean.class.equals(cls)) {
                if (obj != null) {
                    stringSet = Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) obj).booleanValue()));
                } else {
                    stringSet = Boolean.valueOf(sharedPreferences.getBoolean(str, false));
                }
            } else if (Float.class.equals(cls)) {
                if (obj != null) {
                    stringSet = Float.valueOf(sharedPreferences.getFloat(str, ((Float) obj).floatValue()));
                } else {
                    stringSet = Float.valueOf(sharedPreferences.getFloat(str, 0.0f));
                }
            } else if (Integer.class.equals(cls)) {
                if (obj != null) {
                    if (obj.getClass().equals(Long.class)) {
                        intValue = ((Long) obj).intValue();
                    } else {
                        intValue = ((Integer) obj).intValue();
                    }
                    stringSet = Integer.valueOf(sharedPreferences.getInt(str, intValue));
                } else {
                    stringSet = Integer.valueOf(sharedPreferences.getInt(str, 0));
                }
            } else if (Long.class.equals(cls)) {
                if (obj != null) {
                    if (obj.getClass().equals(Integer.class)) {
                        longValue = ((Integer) obj).longValue();
                    } else {
                        longValue = ((Long) obj).longValue();
                    }
                    stringSet = Long.valueOf(sharedPreferences.getLong(str, longValue));
                } else {
                    stringSet = Long.valueOf(sharedPreferences.getLong(str, 0L));
                }
            } else if (Double.class.equals(cls)) {
                if (obj != null) {
                    stringSet = Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong(str, Double.doubleToRawLongBits(((Double) obj).doubleValue()))));
                } else {
                    stringSet = Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong(str, 0L)));
                }
            } else if (String.class.equals(cls)) {
                stringSet = sharedPreferences.getString(str, (String) obj);
            } else {
                stringSet = Set.class.isAssignableFrom(cls) ? sharedPreferences.getStringSet(str, (Set) obj) : obj;
            }
            return stringSet != null ? cls.cast(stringSet) : obj;
        } catch (Throwable th) {
            if (z8) {
                try {
                    com.applovin.impl.sdk.t.c("SharedPreferencesManager", "Error getting value for key: " + str, th);
                } finally {
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                }
            }
            return obj;
        }
    }

    public Object a(qj qjVar) {
        Object a6 = a(qjVar, null);
        b(qjVar);
        return a6;
    }

    public void a(String str, Object obj, SharedPreferences.Editor editor) {
        a(str, obj, (SharedPreferences) null, editor);
    }

    public void a(String str, Object obj, SharedPreferences sharedPreferences) {
        a(str, obj, sharedPreferences, (SharedPreferences.Editor) null);
    }

    public static void a(String str, Object obj, SharedPreferences sharedPreferences, SharedPreferences.Editor editor) {
        boolean z8 = editor != null;
        if (!z8) {
            editor = sharedPreferences.edit();
        }
        if (obj != null) {
            if (obj instanceof Boolean) {
                editor.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Float) {
                editor.putFloat(str, ((Float) obj).floatValue());
            } else if (obj instanceof Integer) {
                editor.putInt(str, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                editor.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                editor.putLong(str, Double.doubleToRawLongBits(((Double) obj).doubleValue()));
            } else if (obj instanceof String) {
                editor.putString(str, (String) obj);
            } else if (obj instanceof Set) {
                editor.putStringSet(str, (Set) obj);
            } else {
                com.applovin.impl.sdk.t.h("SharedPreferencesManager", "Unable to put default value of invalid type: " + obj);
                return;
            }
        } else {
            editor.remove(str);
        }
        if (z8) {
            return;
        }
        a(editor);
    }

    private static void a(SharedPreferences.Editor editor) {
        try {
            if (zp.h()) {
                com.applovin.impl.sdk.k kVar = b;
                if (kVar != null && kVar.l0() != null) {
                    sm l02 = b.l0();
                    com.applovin.impl.sdk.k kVar2 = b;
                    Objects.requireNonNull(editor);
                    l02.a((xl) new kn(kVar2, true, "commitSharedPreferencesChanges", new F0(editor, 16)), sm.b.OTHER);
                } else {
                    editor.apply();
                }
            } else {
                editor.commit();
            }
        } catch (Throwable th) {
            com.applovin.impl.sdk.t.c("SharedPreferencesManager", "Unable to apply changes", th);
        }
    }

    private static SharedPreferences a(Context context) {
        if (f11194c == null) {
            f11194c = context.getSharedPreferences("com.applovin.sdk.shared", 0);
        }
        return f11194c;
    }
}

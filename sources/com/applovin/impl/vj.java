package com.applovin.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import com.applovin.impl.tm;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public final class vj {

    /* renamed from: b, reason: collision with root package name */
    private static com.applovin.impl.sdk.j f27581b;

    /* renamed from: c, reason: collision with root package name */
    private static SharedPreferences f27582c;

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f27583a;

    public vj(com.applovin.impl.sdk.j jVar) {
        this.f27583a = com.applovin.impl.sdk.j.l().getSharedPreferences("com.applovin.sdk.preferences." + jVar.b0(), 0);
        f27581b = jVar;
    }

    public void a(SharedPreferences sharedPreferences) {
        a(sharedPreferences.edit().clear());
    }

    public void b(uj ujVar, Object obj) {
        b(ujVar, obj, this.f27583a);
    }

    public static void b(uj ujVar, Object obj, Context context) {
        a(ujVar.a(), obj, a(context), (SharedPreferences.Editor) null);
    }

    public Object a(uj ujVar, Object obj) {
        return a(ujVar, obj, this.f27583a);
    }

    public static Object a(uj ujVar, Object obj, Context context) {
        return a(ujVar.a(), obj, ujVar.b(), a(context));
    }

    public void b(uj ujVar, Object obj, SharedPreferences sharedPreferences) {
        a(ujVar.a(), obj, sharedPreferences);
    }

    public Object a(uj ujVar, Object obj, SharedPreferences sharedPreferences) {
        return a(ujVar.a(), obj, ujVar.b(), sharedPreferences);
    }

    public void b(uj ujVar) {
        a(this.f27583a.edit().remove(ujVar.a()));
    }

    public static Object a(uj ujVar, Object obj, SharedPreferences sharedPreferences, boolean z2) {
        return a(ujVar.a(), obj, ujVar.b(), sharedPreferences, z2);
    }

    public static Object a(String str, Object obj, Class cls, SharedPreferences sharedPreferences) {
        return a(str, obj, cls, sharedPreferences, true);
    }

    public static Object a(String str, Object obj, Class cls, SharedPreferences sharedPreferences, boolean z2) {
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
            if (z2) {
                try {
                    com.applovin.impl.sdk.n.c("SharedPreferencesManager", "Error getting value for key: " + str, th);
                } finally {
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                }
            }
            return obj;
        }
    }

    public Object a(uj ujVar) {
        Object a2 = a(ujVar, null);
        b(ujVar);
        return a2;
    }

    public void a(String str, Object obj, SharedPreferences.Editor editor) {
        a(str, obj, (SharedPreferences) null, editor);
    }

    public void a(String str, Object obj, SharedPreferences sharedPreferences) {
        a(str, obj, sharedPreferences, (SharedPreferences.Editor) null);
    }

    public static void a(String str, Object obj, SharedPreferences sharedPreferences, SharedPreferences.Editor editor) {
        boolean z2 = editor != null;
        if (!z2) {
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
                com.applovin.impl.sdk.n.h("SharedPreferencesManager", "Unable to put default value of invalid type: " + obj);
                return;
            }
        } else {
            editor.remove(str);
        }
        if (z2) {
            return;
        }
        a(editor);
    }

    private static void a(SharedPreferences.Editor editor) {
        try {
            if (yp.h()) {
                com.applovin.impl.sdk.j jVar = f27581b;
                if (jVar != null && jVar.j0() != null) {
                    tm j02 = f27581b.j0();
                    com.applovin.impl.sdk.j jVar2 = f27581b;
                    Objects.requireNonNull(editor);
                    j02.a((yl) new jn(jVar2, true, "commitSharedPreferencesChanges", new mt(editor, 18)), tm.b.OTHER);
                } else {
                    editor.apply();
                }
            } else {
                editor.commit();
            }
        } catch (Throwable th) {
            com.applovin.impl.sdk.n.c("SharedPreferencesManager", "Unable to apply changes", th);
        }
    }

    private static SharedPreferences a(Context context) {
        if (f27582c == null) {
            f27582c = context.getSharedPreferences("com.applovin.sdk.shared", 0);
        }
        return f27582c;
    }
}

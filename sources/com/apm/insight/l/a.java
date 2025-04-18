package com.apm.insight.l;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {
    private static String a = null;

    /* renamed from: b, reason: collision with root package name */
    private static Class<?> f3226b = null;

    /* renamed from: c, reason: collision with root package name */
    private static Field f3227c = null;

    /* renamed from: d, reason: collision with root package name */
    private static Field f3228d = null;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f3229e = false;

    private static long a(int i10) {
        if (i10 < 0) {
            return 0L;
        }
        return i10 * 1024;
    }

    private static void b(JSONObject jSONObject, ActivityManager activityManager) {
        JSONObject jSONObject2 = new JSONObject();
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        jSONObject2.put("availMem", memoryInfo.availMem);
        jSONObject2.put("lowMemory", memoryInfo.lowMemory);
        jSONObject2.put("threshold", memoryInfo.threshold);
        jSONObject2.put("totalMem", m.a(memoryInfo));
        jSONObject.put("sys_memory_info", jSONObject2);
    }

    public static String c(Context context) {
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        try {
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                    if (runningAppProcessInfo.pid == myPid) {
                        String str = runningAppProcessInfo.processName;
                        a = str;
                        return str;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        String a10 = a();
        a = a10;
        return a10 == null ? "" : a10;
    }

    public static String d(Context context) {
        Class<?> g10 = g(context);
        if (f3227c == null && g10 != null) {
            try {
                f3227c = g10.getDeclaredField("VERSION_NAME");
            } catch (NoSuchFieldException unused) {
            }
        }
        Field field = f3227c;
        if (field == null) {
            return "";
        }
        try {
            return String.valueOf(field.get(null));
        } catch (Throwable unused2) {
            return "";
        }
    }

    public static int e(Context context) {
        Class<?> g10 = g(context);
        if (f3228d == null && g10 != null) {
            try {
                f3228d = g10.getDeclaredField("VERSION_CODE");
            } catch (NoSuchFieldException unused) {
            }
        }
        Field field = f3228d;
        if (field == null) {
            return -1;
        }
        try {
            return ((Integer) field.get(null)).intValue();
        } catch (Throwable unused2) {
            return -1;
        }
    }

    private static boolean f(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        String packageName = context.getPackageName();
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.importance == 100) {
                        return packageName.equals(runningAppProcessInfo.pkgList[0]);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static Class<?> g(Context context) {
        if (f3226b == null && !f3229e) {
            try {
                f3226b = Class.forName(context.getPackageName() + ".BuildConfig");
            } catch (ClassNotFoundException unused) {
            }
            f3229e = true;
        }
        return f3226b;
    }

    public static ActivityManager.ProcessErrorStateInfo a(Context context, int i10) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return null;
        }
        int myPid = Process.myPid();
        int i11 = 0;
        while (i11 < i10) {
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
            if (processesInErrorState != null) {
                for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                    if (processErrorStateInfo.pid == myPid && processErrorStateInfo.condition == 2) {
                        return processErrorStateInfo;
                    }
                }
            }
            i11++;
            if (i10 == i11 || com.apm.insight.b.f.a()) {
                break;
            }
            SystemClock.sleep(200L);
        }
        return null;
    }

    public static boolean b(Context context) {
        String c10 = c(context);
        if (c10 != null && c10.contains(":")) {
            return false;
        }
        if (c10 == null || !c10.equals(context.getPackageName())) {
            return c10 != null && c10.equals(context.getApplicationInfo().processName);
        }
        return true;
    }

    private static String a() {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + Process.myPid() + "/cmdline"), "iso-8859-1"));
            try {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    int read = bufferedReader.read();
                    if (read <= 0) {
                        String sb3 = sb2.toString();
                        j.a(bufferedReader);
                        return sb3;
                    }
                    sb2.append((char) read);
                }
            } catch (Throwable unused) {
                j.a(bufferedReader);
                return null;
            }
        } catch (Throwable unused2) {
            bufferedReader = null;
        }
    }

    public static void a(Context context, JSONObject jSONObject) {
        try {
            a(jSONObject);
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                b(jSONObject, activityManager);
            }
            a(jSONObject, activityManager);
        } catch (Throwable unused) {
        }
    }

    public static void a(String str) {
        a = str;
    }

    private static void a(JSONObject jSONObject) {
        Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
        Debug.getMemoryInfo(memoryInfo);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("dalvikPrivateDirty", a(memoryInfo.dalvikPrivateDirty));
        jSONObject2.put("dalvikPss", a(memoryInfo.dalvikPss));
        jSONObject2.put("dalvikSharedDirty", a(memoryInfo.dalvikSharedDirty));
        jSONObject2.put("nativePrivateDirty", a(memoryInfo.nativePrivateDirty));
        jSONObject2.put("nativePss", a(memoryInfo.nativePss));
        jSONObject2.put("nativeSharedDirty", a(memoryInfo.nativeSharedDirty));
        jSONObject2.put("otherPrivateDirty", a(memoryInfo.otherPrivateDirty));
        jSONObject2.put("otherPss", a(memoryInfo.otherPss));
        jSONObject2.put("otherSharedDirty", memoryInfo.otherSharedDirty);
        try {
            String memoryStat = memoryInfo.getMemoryStat("summary.graphics");
            if (!TextUtils.isEmpty(memoryStat)) {
                jSONObject2.put("summary.graphics", a(Integer.parseInt(memoryStat)));
            }
        } catch (Throwable unused) {
        }
        jSONObject2.put("totalPrivateClean", c.a(memoryInfo));
        jSONObject2.put("totalPrivateDirty", memoryInfo.getTotalPrivateDirty());
        jSONObject2.put("totalPss", a(memoryInfo.getTotalPss()));
        jSONObject2.put("totalSharedClean", c.b(memoryInfo));
        jSONObject2.put("totalSharedDirty", a(memoryInfo.getTotalSharedDirty()));
        jSONObject2.put("totalSwappablePss", a(c.c(memoryInfo)));
        jSONObject.put("memory_info", jSONObject2);
    }

    private static void a(JSONObject jSONObject, ActivityManager activityManager) {
        JSONObject jSONObject2 = new JSONObject();
        com.apm.insight.entity.a.a(jSONObject, "filters", "native_heap_leak", String.valueOf(Debug.getNativeHeapAllocatedSize() > 209715200));
        jSONObject2.put("native_heap_size", Debug.getNativeHeapSize());
        jSONObject2.put("native_heap_alloc_size", Debug.getNativeHeapAllocatedSize());
        jSONObject2.put("native_heap_free_size", Debug.getNativeHeapFreeSize());
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory();
        long freeMemory = runtime.freeMemory();
        long j3 = runtime.totalMemory();
        jSONObject2.put("max_memory", maxMemory);
        jSONObject2.put("free_memory", freeMemory);
        jSONObject2.put("total_memory", j3);
        com.apm.insight.entity.a.a(jSONObject, "filters", "java_heap_leak", String.valueOf(((float) (j3 - freeMemory)) > ((float) maxMemory) * 0.95f));
        if (activityManager != null) {
            jSONObject2.put("memory_class", activityManager.getMemoryClass());
            jSONObject2.put("large_memory_class", activityManager.getLargeMemoryClass());
        }
        jSONObject.put("app_memory_info", jSONObject2);
    }

    public static boolean a(Context context) {
        return context == null ? com.apm.insight.runtime.a.b.d().f() : com.apm.insight.runtime.a.b.d().f() || f(context);
    }
}

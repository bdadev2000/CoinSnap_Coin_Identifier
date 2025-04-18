package com.cooldev.gba.emulator.gameboy.network.models;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.common.ConnectionResult;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.jvm.internal.g0;
import org.jetbrains.annotations.NotNull;
import p0.a;
import z0.m;
import z0.n;

/* loaded from: classes4.dex */
public final class SlackMessageKt {
    @NotNull
    public static final String generateGoogleSearchLink(@NotNull String str) {
        a.s(str, "question");
        String obj = m.y1(str).toString();
        Pattern compile = Pattern.compile("\\s+");
        a.r(compile, "compile(...)");
        a.s(obj, "input");
        String replaceAll = compile.matcher(obj).replaceAll("+");
        a.r(replaceAll, "replaceAll(...)");
        return "https://www.google.com/search?q=".concat(replaceAll);
    }

    @NotNull
    public static final String generateStackOverflowSearchLink(@NotNull String str) {
        a.s(str, "question");
        String obj = m.y1(str).toString();
        Pattern compile = Pattern.compile("\\s+");
        a.r(compile, "compile(...)");
        a.s(obj, "input");
        String replaceAll = compile.matcher(obj).replaceAll("+");
        a.r(replaceAll, "replaceAll(...)");
        return "https://stackoverflow.com/search?q=".concat(replaceAll);
    }

    @NotNull
    public static final String getApplicationName(@NotNull Context context) {
        a.s(context, "context");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i2 = applicationInfo.labelRes;
        if (i2 == 0) {
            return applicationInfo.nonLocalizedLabel.toString();
        }
        String string = context.getString(i2);
        a.r(string, "getString(...)");
        return string;
    }

    @NotNull
    public static final String getDeviceInfo() {
        return a.D0("\n    *Manufacturer*: " + Build.MANUFACTURER + "\n    *Model*: " + Build.MODEL + "\n    *Brand*: " + Build.BRAND + "\n    *Device*: " + Build.DEVICE + "\n    *Product*: " + Build.PRODUCT + "\n    *SDK Version*: " + Build.VERSION.SDK_INT + "\n    *Release Version*: " + Build.VERSION.RELEASE + '\n');
    }

    @NotNull
    public static final String getDiskFreeSpace() {
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        return "Disk free: " + new DecimalFormat("#.##").format((statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong()) / Ints.MAX_POWER_OF_TWO) + " GB";
    }

    @NotNull
    public static final String getFormattedCurrentTime() {
        String format = new SimpleDateFormat("MMM dd, yyyy, HH:mm:ss a", Locale.getDefault()).format(new Date());
        a.r(format, "format(...)");
        return format;
    }

    @NotNull
    public static final String getMemoryInfo(@NotNull Context context) {
        a.s(context, "context");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        Object systemService = context.getSystemService("activity");
        a.q(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
        StringBuilder sb = new StringBuilder("*Total memory:* ");
        long j2 = 1048576;
        sb.append(memoryInfo.totalMem / j2);
        sb.append(" MB\n*Available memory:* ");
        sb.append(memoryInfo.availMem / j2);
        sb.append(" MB\n*Low memory:* ");
        sb.append(memoryInfo.lowMemory);
        return sb.toString();
    }

    @NotNull
    public static final String getNetworkInfo(@NotNull Context context) {
        a.s(context, "context");
        Object systemService = context.getSystemService("connectivity");
        a.q(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return "*Network:* No network connection";
        }
        return "*Network Type:* " + activeNetworkInfo.getTypeName() + "\n*Is Connected:* " + activeNetworkInfo.isConnected();
    }

    @NotNull
    public static final String getOrientationString(@NotNull Context context) {
        a.s(context, "context");
        int i2 = context.getResources().getConfiguration().orientation;
        return i2 != 1 ? i2 != 2 ? "Undefined" : "Landscape" : "Portrait";
    }

    @NotNull
    public static final String handleThrowable(@NotNull Throwable th) {
        a.s(th, "throwable");
        if (th instanceof NullPointerException) {
            return "NullPointerException";
        }
        if (th instanceof IllegalArgumentException) {
            return "IllegalArgumentException";
        }
        if (th instanceof IOException) {
            return "IOException";
        }
        if (th instanceof OutOfMemoryError) {
            return "OutOfMemoryError";
        }
        if (th instanceof StackOverflowError) {
            return "StackOverflowError";
        }
        String c2 = g0.a(th.getClass()).c();
        return c2 == null ? NativeProtocol.ERROR_UNKNOWN_ERROR : c2;
    }

    @NotNull
    public static final String truncateLog(@NotNull String str, int i2) {
        a.s(str, "message");
        return str.length() <= i2 ? str : n.A1(i2, str).concat("...");
    }

    public static /* synthetic */ String truncateLog$default(String str, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
        }
        return truncateLog(str, i2);
    }
}

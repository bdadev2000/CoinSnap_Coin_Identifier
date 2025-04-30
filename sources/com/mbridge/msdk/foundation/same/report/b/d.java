package com.mbridge.msdk.foundation.same.report.b;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.Log;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.i;
import com.mbridge.msdk.foundation.entity.o;
import com.mbridge.msdk.foundation.same.b.e;
import com.mbridge.msdk.foundation.same.report.f;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public class d implements Thread.UncaughtExceptionHandler {
    private static volatile d b;

    /* renamed from: a, reason: collision with root package name */
    Handler f15881a = new Handler() { // from class: com.mbridge.msdk.foundation.same.report.b.d.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Context context;
            HashMap hashMap;
            super.handleMessage(message);
            if (message.what != 101 || (context = (Context) d.this.f15882c.get()) == null) {
                return;
            }
            Object obj = message.obj;
            if ((obj instanceof HashMap) && (hashMap = (HashMap) obj) != null) {
                new h(context).a((String) hashMap.get("crashinfo"), (File) hashMap.get("file"));
            }
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference<Context> f15882c;

    /* renamed from: d, reason: collision with root package name */
    private Throwable f15883d;

    /* renamed from: e, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f15884e;

    private d(Context context) {
        this.f15882c = new WeakReference<>(context);
    }

    private static String b(Context context) {
        try {
            return context.getApplicationContext().getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e4) {
            Log.e("", e4.getMessage());
            return "";
        }
    }

    private HashMap<String, Object> c() {
        HashMap<String, Object> hashMap = new HashMap<>();
        if (this.f15883d == null) {
            return null;
        }
        String a6 = e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_CRASH_INFO);
        File file = new File(o.j(a6, "/"));
        if (!file.exists()) {
            file.mkdirs();
        }
        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis()));
        File file2 = new File(AbstractC2914a.f(a6, "/sdkcrash", format, ".txt"));
        try {
            PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(file2)));
            printWriter.println(a(this.f15883d, format));
            printWriter.println("====");
            this.f15883d.printStackTrace(printWriter);
            printWriter.close();
            hashMap.put("file", file2);
            hashMap.put("time", format);
            return hashMap;
        } catch (Exception e4) {
            e4.printStackTrace();
            return null;
        }
    }

    private int d(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e4) {
            e4.printStackTrace();
            return 0;
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        f.a().b();
        try {
            this.f15883d = th;
            String a6 = a();
            List<String> a9 = a(a6);
            if (a9.size() > 0) {
                for (int i9 = 0; i9 < a9.size(); i9++) {
                    a(a(th), a9.get(i9), th, thread);
                }
                return;
            }
            a(a(th), a6, th, thread);
        } catch (Exception e4) {
            a(thread, th);
            e4.printStackTrace();
        }
    }

    public static d a(Context context) {
        if (b == null) {
            synchronized (d.class) {
                try {
                    if (b == null) {
                        b = new d(context);
                    }
                } finally {
                }
            }
        }
        return b;
    }

    public final JSONObject b(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Context context = this.f15882c.get();
        if (context == null) {
            return null;
        }
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        long usableSpace = externalStorageDirectory.getUsableSpace();
        long totalSpace = externalStorageDirectory.getTotalSpace();
        String formatFileSize = Formatter.formatFileSize(context, usableSpace);
        String formatFileSize2 = Formatter.formatFileSize(context, totalSpace);
        jSONObject.put("max_memory", String.valueOf((float) ((Runtime.getRuntime().maxMemory() * 1.0d) / 1048576.0d)));
        jSONObject.put("memoryby_app", String.valueOf((float) ((Runtime.getRuntime().totalMemory() * 1.0d) / 1048576.0d)));
        jSONObject.put("remaining_memory", (float) ((Runtime.getRuntime().freeMemory() * 1.0d) / 1048576.0d));
        jSONObject.put("sdcard_remainder", formatFileSize);
        jSONObject.put("totalspacestr", formatFileSize2);
        jSONObject.put("crashtime", str);
        String a6 = com.mbridge.msdk.foundation.a.a.a.a().a(MBridgeConstans.SDK_APP_ID);
        if (!TextUtils.isEmpty(a6)) {
            jSONObject.put("appid", a6);
        }
        try {
            jSONObject.put("osversion", Build.VERSION.SDK_INT);
            jSONObject.put("appversioncode", d(context));
            jSONObject.put("appversionname", b(context));
            jSONObject.put("appname", c(context));
        } catch (Exception unused) {
            jSONObject.put("osversion", 0);
            jSONObject.put("appversioncode", "-1");
            jSONObject.put("appversionname", "-1");
            jSONObject.put("appname", "");
        }
        return jSONObject;
    }

    private static List<String> a(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        try {
            Matcher matcher = Pattern.compile(str2).matcher(str);
            while (matcher.find()) {
                arrayList.add(matcher.group(1));
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        return arrayList;
    }

    public static String a() {
        try {
            g b8 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
            if (b8 == null) {
                com.mbridge.msdk.c.h.a();
                b8 = i.a();
            }
            String S8 = b8.S();
            return TextUtils.isEmpty(S8) ? "<mvpackage>mbridge</mvpackage>" : S8;
        } catch (Exception unused) {
            return "<mvpackage>mbridge</mvpackage>";
        }
    }

    public static List<String> a(String str) {
        try {
            List<String> a6 = a(str, "<mvpackage>(.*?)</mvpackage>");
            return a6 == null ? new ArrayList() : a6;
        } catch (Exception unused) {
            return new ArrayList();
        }
    }

    private String a(Throwable th, String str) {
        try {
            JSONObject b8 = b(str);
            if (b8 == null) {
                return "";
            }
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            b8.put("crashinfo", stringWriter.toString());
            String jSONObject = b8.toString();
            StringBuffer stringBuffer = new StringBuffer("key=2000052");
            stringBuffer.append("&crash_first_index_from_mtg=");
            stringBuffer.append(c.b(th.getStackTrace()));
            stringBuffer.append("&exception=" + jSONObject);
            return stringBuffer.toString();
        } catch (Throwable th2) {
            th2.printStackTrace();
            return "";
        }
    }

    public final void b() {
        this.f15884e = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    private String a(Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb.append(stackTraceElement.toString() + "\n");
        }
        return sb.toString();
    }

    private String c(Context context) {
        try {
            return context.getResources().getString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.labelRes);
        } catch (PackageManager.NameNotFoundException e4) {
            e4.printStackTrace();
            return null;
        }
    }

    private void a(String str, String str2, Throwable th, Thread thread) {
        if (str.contains(str2)) {
            HashMap<String, Object> c9 = c();
            if (c9 == null || c9.get("file") == null) {
                return;
            }
            Message obtain = Message.obtain();
            HashMap hashMap = new HashMap();
            hashMap.put("crashinfo", a(th, (String) c9.get("time")));
            hashMap.put("file", c9.get("file"));
            obtain.obj = hashMap;
            obtain.what = 101;
            this.f15881a.sendMessage(obtain);
            a(thread, th);
            return;
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f15884e;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    private void a(Thread thread, Throwable th) {
        try {
            Thread.sleep(AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
        } catch (InterruptedException e4) {
            e4.printStackTrace();
        }
        Process.killProcess(Process.myPid());
    }
}

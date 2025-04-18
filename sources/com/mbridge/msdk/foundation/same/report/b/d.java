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
import com.mbridge.msdk.foundation.same.b.e;
import com.mbridge.msdk.foundation.same.report.f;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import eb.j;
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

/* loaded from: classes4.dex */
public class d implements Thread.UncaughtExceptionHandler {

    /* renamed from: b, reason: collision with root package name */
    private static volatile d f13445b;
    Handler a = new Handler() { // from class: com.mbridge.msdk.foundation.same.report.b.d.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Context context;
            HashMap hashMap;
            super.handleMessage(message);
            if (message.what != 101 || (context = (Context) d.this.f13446c.get()) == null) {
                return;
            }
            Object obj = message.obj;
            if ((obj instanceof HashMap) && (hashMap = (HashMap) obj) != null) {
                new h(context).a((String) hashMap.get("crashinfo"), (File) hashMap.get("file"));
            }
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference<Context> f13446c;

    /* renamed from: d, reason: collision with root package name */
    private Throwable f13447d;

    /* renamed from: e, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f13448e;

    private d(Context context) {
        this.f13446c = new WeakReference<>(context);
    }

    private static String b(Context context) {
        try {
            return context.getApplicationContext().getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("", e2.getMessage());
            return "";
        }
    }

    private HashMap<String, Object> c() {
        HashMap<String, Object> hashMap = new HashMap<>();
        if (this.f13447d == null) {
            return null;
        }
        String a = e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_CRASH_INFO);
        File file = new File(j.k(a, "/"));
        if (!file.exists()) {
            file.mkdirs();
        }
        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis()));
        File file2 = new File(a + "/sdkcrash" + format + ".txt");
        try {
            PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(file2)));
            printWriter.println(a(this.f13447d, format));
            printWriter.println("====");
            this.f13447d.printStackTrace(printWriter);
            printWriter.close();
            hashMap.put("file", file2);
            hashMap.put("time", format);
            return hashMap;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private int d(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        f.a().b();
        try {
            this.f13447d = th2;
            String a = a();
            List<String> a10 = a(a);
            if (a10.size() > 0) {
                for (int i10 = 0; i10 < a10.size(); i10++) {
                    a(a(th2), a10.get(i10), th2, thread);
                }
                return;
            }
            a(a(th2), a, th2, thread);
        } catch (Exception e2) {
            a(thread, th2);
            e2.printStackTrace();
        }
    }

    public static d a(Context context) {
        if (f13445b == null) {
            synchronized (d.class) {
                if (f13445b == null) {
                    f13445b = new d(context);
                }
            }
        }
        return f13445b;
    }

    public final JSONObject b(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Context context = this.f13446c.get();
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
        String a = com.mbridge.msdk.foundation.a.a.a.a().a(MBridgeConstans.SDK_APP_ID);
        if (!TextUtils.isEmpty(a)) {
            jSONObject.put("appid", a);
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
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return arrayList;
    }

    public static String a() {
        try {
            g b3 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
            if (b3 == null) {
                com.mbridge.msdk.c.h.a();
                b3 = i.a();
            }
            String S = b3.S();
            return TextUtils.isEmpty(S) ? "<mvpackage>mbridge</mvpackage>" : S;
        } catch (Exception unused) {
            return "<mvpackage>mbridge</mvpackage>";
        }
    }

    public static List<String> a(String str) {
        try {
            List<String> a = a(str, "<mvpackage>(.*?)</mvpackage>");
            return a == null ? new ArrayList() : a;
        } catch (Exception unused) {
            return new ArrayList();
        }
    }

    private String a(Throwable th2, String str) {
        try {
            JSONObject b3 = b(str);
            if (b3 == null) {
                return "";
            }
            StringWriter stringWriter = new StringWriter();
            th2.printStackTrace(new PrintWriter(stringWriter));
            b3.put("crashinfo", stringWriter.toString());
            String jSONObject = b3.toString();
            StringBuffer stringBuffer = new StringBuffer("key=2000052");
            stringBuffer.append("&crash_first_index_from_mtg=");
            stringBuffer.append(c.b(th2.getStackTrace()));
            stringBuffer.append("&exception=" + jSONObject);
            return stringBuffer.toString();
        } catch (Throwable th3) {
            th3.printStackTrace();
            return "";
        }
    }

    private String c(Context context) {
        try {
            return context.getResources().getString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.labelRes);
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final void b() {
        this.f13448e = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    private String a(Throwable th2) {
        StackTraceElement[] stackTrace = th2.getStackTrace();
        StringBuilder sb2 = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb2.append(stackTraceElement.toString() + "\n");
        }
        return sb2.toString();
    }

    private void a(String str, String str2, Throwable th2, Thread thread) {
        if (str.contains(str2)) {
            HashMap<String, Object> c10 = c();
            if (c10 == null || c10.get("file") == null) {
                return;
            }
            Message obtain = Message.obtain();
            HashMap hashMap = new HashMap();
            hashMap.put("crashinfo", a(th2, (String) c10.get("time")));
            hashMap.put("file", c10.get("file"));
            obtain.obj = hashMap;
            obtain.what = 101;
            this.a.sendMessage(obtain);
            a(thread, th2);
            return;
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f13448e;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th2);
        }
    }

    private void a(Thread thread, Throwable th2) {
        try {
            Thread.sleep(AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
        Process.killProcess(Process.myPid());
    }
}

package com.glority.utils.stability;

import android.content.ClipData;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import com.glority.utils.UtilsApp;
import com.glority.utils.data.StringUtils;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.UnknownHostException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class LogUtils {
    public static final int A = 7;
    private static final String ARGS = "args";
    private static final String BOTTOM_BORDER = "└────────────────────────────────────────────────────────────────────────────────────────────────────────────────";
    private static final String BOTTOM_CORNER = "└";
    public static final int D = 3;
    public static final int E = 6;
    private static final int FILE = 16;
    public static final int I = 4;
    private static final int JSON = 32;
    private static final String LEFT_BORDER = "│ ";
    private static final int MAX_LEN = 3000;
    private static final String MIDDLE_BORDER = "├┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄";
    private static final String MIDDLE_CORNER = "├";
    private static final String MIDDLE_DIVIDER = "┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄";
    private static final String NOTHING = "log nothing";
    private static final String NULL = "null";
    private static final String PLACEHOLDER = " ";
    private static final String SIDE_DIVIDER = "────────────────────────────────────────────────────────";
    private static final String TOP_BORDER = "┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────";
    private static final String TOP_CORNER = "┌";
    public static final int V = 2;
    public static final int W = 5;
    private static final int XML = 48;
    private static final char[] T = {'V', 'D', 'I', 'W', 'E', 'A'};
    private static final String FILE_SEP = System.getProperty("file.separator");
    private static final String LINE_SEP = System.getProperty("line.separator");
    private static final Config CONFIG = new Config();
    private static final ThreadLocal<SimpleDateFormat> SDF_THREAD_LOCAL = new ThreadLocal<>();
    private static final ExecutorService EXECUTOR = Executors.newSingleThreadExecutor();
    private static final SimpleArrayMap<Class, IFormatter> I_FORMATTER_MAP = new SimpleArrayMap<>();

    /* loaded from: classes9.dex */
    public static abstract class IFormatter<T> {
        public abstract String format(T t);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes9.dex */
    public @interface TYPE {
    }

    private LogUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static Config getConfig() {
        return CONFIG;
    }

    public static void v(Object... objArr) {
        log(2, CONFIG.mGlobalTag, objArr);
    }

    public static void vTag(String str, Object... objArr) {
        log(2, str, objArr);
    }

    public static void d(Object... objArr) {
        log(3, CONFIG.mGlobalTag, objArr);
    }

    public static void dTag(String str, Object... objArr) {
        log(3, str, objArr);
    }

    public static void i(Object... objArr) {
        log(4, CONFIG.mGlobalTag, objArr);
    }

    public static void iTag(String str, Object... objArr) {
        log(4, str, objArr);
    }

    public static void w(Object... objArr) {
        log(5, CONFIG.mGlobalTag, objArr);
    }

    public static void wTag(String str, Object... objArr) {
        log(5, str, objArr);
    }

    public static void e(Object... objArr) {
        log(6, CONFIG.mGlobalTag, objArr);
    }

    public static void eTag(String str, Object... objArr) {
        log(6, str, objArr);
    }

    public static void a(Object... objArr) {
        log(7, CONFIG.mGlobalTag, objArr);
    }

    public static void aTag(String str, Object... objArr) {
        log(7, str, objArr);
    }

    public static void file(Object obj) {
        log(19, CONFIG.mGlobalTag, obj);
    }

    public static void file(int i, Object obj) {
        log(i | 16, CONFIG.mGlobalTag, obj);
    }

    public static void file(String str, Object obj) {
        log(19, str, obj);
    }

    public static void file(int i, String str, Object obj) {
        log(i | 16, str, obj);
    }

    public static void json(String str) {
        log(35, CONFIG.mGlobalTag, str);
    }

    public static void json(int i, String str) {
        log(i | 32, CONFIG.mGlobalTag, str);
    }

    public static void json(String str, String str2) {
        log(35, str, str2);
    }

    public static void json(int i, String str, String str2) {
        log(i | 32, str, str2);
    }

    public static void xml(String str) {
        log(51, CONFIG.mGlobalTag, str);
    }

    public static void xml(int i, String str) {
        log(i | 48, CONFIG.mGlobalTag, str);
    }

    public static void xml(String str, String str2) {
        log(51, str, str2);
    }

    public static void xml(int i, String str, String str2) {
        log(i | 48, str, str2);
    }

    public static void log(int i, String str, Object... objArr) {
        Config config = CONFIG;
        if (config.mLogSwitch) {
            if (config.mLog2ConsoleSwitch || config.mLog2FileSwitch) {
                int i2 = i & 15;
                int i3 = i & PsExtractor.VIDEO_STREAM_MASK;
                if (i2 >= config.mConsoleFilter || i2 >= config.mFileFilter) {
                    TagHead processTagAndHead = processTagAndHead(str);
                    String processBody = processBody(i3, objArr);
                    if (config.mLog2ConsoleSwitch && i2 >= config.mConsoleFilter && i3 != 16) {
                        print2Console(i2, processTagAndHead.tag, processTagAndHead.consoleHead, processBody);
                    }
                    if ((config.mLog2FileSwitch || i3 == 16) && i2 >= config.mFileFilter) {
                        print2File(i2, processTagAndHead.tag, processTagAndHead.fileHead + processBody);
                    }
                }
            }
        }
    }

    private static TagHead processTagAndHead(String str) {
        Config config = CONFIG;
        if (config.mTagIsSpace || config.mLogHeadSwitch) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            int i = config.mStackOffset + 3;
            if (i >= stackTrace.length) {
                String fileName = getFileName(stackTrace[3]);
                if (config.mTagIsSpace && StringUtils.isSpace(str)) {
                    int indexOf = fileName.indexOf(46);
                    str = indexOf == -1 ? fileName : fileName.substring(0, indexOf);
                }
                return new TagHead(str, null, ": ");
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            String fileName2 = getFileName(stackTraceElement);
            if (config.mTagIsSpace && StringUtils.isSpace(str)) {
                int indexOf2 = fileName2.indexOf(46);
                str = indexOf2 == -1 ? fileName2 : fileName2.substring(0, indexOf2);
            }
            if (config.mLogHeadSwitch) {
                String name = Thread.currentThread().getName();
                String formatter = new Formatter().format("%s, %s.%s(%s:%d)", name, stackTraceElement.getClassName(), stackTraceElement.getMethodName(), fileName2, Integer.valueOf(stackTraceElement.getLineNumber())).toString();
                String str2 = " [" + formatter + "]: ";
                if (config.mStackDeep <= 1) {
                    return new TagHead(str, new String[]{formatter}, str2);
                }
                int min = Math.min(config.mStackDeep, stackTrace.length - i);
                String[] strArr = new String[min];
                strArr[0] = formatter;
                String formatter2 = new Formatter().format("%" + (name.length() + 2) + "s", "").toString();
                for (int i2 = 1; i2 < min; i2++) {
                    StackTraceElement stackTraceElement2 = stackTrace[i2 + i];
                    strArr[i2] = new Formatter().format("%s%s.%s(%s:%d)", formatter2, stackTraceElement2.getClassName(), stackTraceElement2.getMethodName(), getFileName(stackTraceElement2), Integer.valueOf(stackTraceElement2.getLineNumber())).toString();
                }
                return new TagHead(str, strArr, str2);
            }
        } else {
            str = config.mGlobalTag;
        }
        return new TagHead(str, null, ": ");
    }

    private static String getFileName(StackTraceElement stackTraceElement) {
        String fileName = stackTraceElement.getFileName();
        if (fileName != null) {
            return fileName;
        }
        String className = stackTraceElement.getClassName();
        String[] split = className.split("\\.");
        if (split.length > 0) {
            className = split[split.length - 1];
        }
        int indexOf = className.indexOf(36);
        if (indexOf != -1) {
            className = className.substring(0, indexOf);
        }
        return className + ".java";
    }

    private static String processBody(int i, Object... objArr) {
        String str;
        if (objArr == null) {
            str = "null";
        } else {
            if (objArr.length == 1) {
                str = formatObject(i, objArr[0]);
            } else {
                StringBuilder sb = new StringBuilder();
                int length = objArr.length;
                for (int i2 = 0; i2 < length; i2++) {
                    sb.append("args[").append(i2).append("] = ").append(formatObject(objArr[i2])).append(LINE_SEP);
                }
                str = sb.toString();
            }
        }
        return str.length() == 0 ? NOTHING : str;
    }

    private static String formatObject(int i, Object obj) {
        if (obj == null) {
            return "null";
        }
        if (i == 32) {
            return LogFormatter.formatJson(obj.toString());
        }
        if (i == 48) {
            return LogFormatter.formatXml(obj.toString());
        }
        return formatObject(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String formatObject(Object obj) {
        IFormatter iFormatter;
        if (obj == null) {
            return "null";
        }
        SimpleArrayMap<Class, IFormatter> simpleArrayMap = I_FORMATTER_MAP;
        if (simpleArrayMap.isEmpty() || (iFormatter = simpleArrayMap.get(getClassFromObject(obj))) == null) {
            return obj.getClass().isArray() ? LogFormatter.array2String(obj) : obj instanceof Throwable ? LogFormatter.throwable2String((Throwable) obj) : obj instanceof Bundle ? LogFormatter.bundle2String((Bundle) obj) : obj instanceof Intent ? LogFormatter.intent2String((Intent) obj) : obj.toString();
        }
        return iFormatter.format(obj);
    }

    private static void print2Console(int i, String str, String[] strArr, String str2) {
        if (CONFIG.mSingleTagSwitch) {
            printSingleTagMsg(i, str, processSingleTagMsg(i, str, strArr, str2));
            return;
        }
        printBorder(i, str, true);
        printHead(i, str, strArr);
        printMsg(i, str, str2);
        printBorder(i, str, false);
    }

    private static void printBorder(int i, String str, boolean z) {
        if (CONFIG.mLogBorderSwitch) {
            Log.println(i, str, z ? TOP_BORDER : BOTTOM_BORDER);
        }
    }

    private static void printHead(int i, String str, String[] strArr) {
        if (strArr != null) {
            for (String str2 : strArr) {
                if (CONFIG.mLogBorderSwitch) {
                    str2 = LEFT_BORDER + str2;
                }
                Log.println(i, str, str2);
            }
            if (CONFIG.mLogBorderSwitch) {
                Log.println(i, str, MIDDLE_BORDER);
            }
        }
    }

    private static void printMsg(int i, String str, String str2) {
        int length = str2.length();
        int i2 = length / 3000;
        if (i2 <= 0) {
            printSubMsg(i, str, str2);
            return;
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i4 + 3000;
            printSubMsg(i, str, str2.substring(i4, i5));
            i3++;
            i4 = i5;
        }
        if (i4 != length) {
            printSubMsg(i, str, str2.substring(i4, length));
        }
    }

    private static void printSubMsg(int i, String str, String str2) {
        if (!CONFIG.mLogBorderSwitch) {
            Log.println(i, str, str2);
            return;
        }
        for (String str3 : str2.split(LINE_SEP)) {
            Log.println(i, str, LEFT_BORDER + str3);
        }
    }

    private static String processSingleTagMsg(int i, String str, String[] strArr, String str2) {
        StringBuilder sb = new StringBuilder(PLACEHOLDER);
        String str3 = LINE_SEP;
        sb.append(str3);
        int i2 = 0;
        if (CONFIG.mLogBorderSwitch) {
            sb.append(TOP_BORDER).append(str3);
            if (strArr != null) {
                for (String str4 : strArr) {
                    sb.append(LEFT_BORDER).append(str4).append(LINE_SEP);
                }
                sb.append(MIDDLE_BORDER).append(LINE_SEP);
            }
            String[] split = str2.split(LINE_SEP);
            int length = split.length;
            while (i2 < length) {
                sb.append(LEFT_BORDER).append(split[i2]).append(LINE_SEP);
                i2++;
            }
            sb.append(BOTTOM_BORDER);
        } else {
            if (strArr != null) {
                int length2 = strArr.length;
                while (i2 < length2) {
                    sb.append(strArr[i2]).append(LINE_SEP);
                    i2++;
                }
            }
            sb.append(str2);
        }
        return sb.toString();
    }

    private static void printSingleTagMsg(int i, String str, String str2) {
        int length = str2.length();
        int i2 = length / 3000;
        if (i2 <= 0) {
            Log.println(i, str, str2);
            return;
        }
        int i3 = 1;
        int i4 = 3000;
        if (CONFIG.mLogBorderSwitch) {
            Log.println(i, str, str2.substring(0, 3000) + LINE_SEP + BOTTOM_BORDER);
            while (i3 < i2) {
                StringBuilder sb = new StringBuilder(PLACEHOLDER);
                String str3 = LINE_SEP;
                int i5 = i4 + 3000;
                Log.println(i, str, sb.append(str3).append(TOP_BORDER).append(str3).append(LEFT_BORDER).append(str2.substring(i4, i5)).append(str3).append(BOTTOM_BORDER).toString());
                i3++;
                i4 = i5;
            }
            if (i4 != length) {
                StringBuilder sb2 = new StringBuilder(PLACEHOLDER);
                String str4 = LINE_SEP;
                Log.println(i, str, sb2.append(str4).append(TOP_BORDER).append(str4).append(LEFT_BORDER).append(str2.substring(i4, length)).toString());
                return;
            }
            return;
        }
        Log.println(i, str, str2.substring(0, 3000));
        while (i3 < i2) {
            int i6 = i4 + 3000;
            Log.println(i, str, PLACEHOLDER + LINE_SEP + str2.substring(i4, i6));
            i3++;
            i4 = i6;
        }
        if (i4 != length) {
            Log.println(i, str, PLACEHOLDER + LINE_SEP + str2.substring(i4, length));
        }
    }

    private static void print2File(int i, String str, String str2) {
        String format = getSdf().format(new Date(System.currentTimeMillis()));
        String substring = format.substring(0, 10);
        String substring2 = format.substring(11);
        StringBuilder sb = new StringBuilder();
        Config config = CONFIG;
        String sb2 = sb.append(config.mDir == null ? config.mDefaultDir : config.mDir).append(config.mFilePrefix).append("-").append(substring).append(".txt").toString();
        if (!createOrExistsFile(sb2)) {
            Log.e("LogUtils", "create " + sb2 + " failed!");
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(substring2).append(T[i - 2]).append(RemoteSettings.FORWARD_SLASH_STRING).append(str).append(str2).append(LINE_SEP);
        input2File(sb3.toString(), sb2);
    }

    private static SimpleDateFormat getSdf() {
        ThreadLocal<SimpleDateFormat> threadLocal = SDF_THREAD_LOCAL;
        SimpleDateFormat simpleDateFormat = threadLocal.get();
        if (simpleDateFormat != null) {
            return simpleDateFormat;
        }
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        threadLocal.set(simpleDateFormat2);
        return simpleDateFormat2;
    }

    private static boolean createOrExistsFile(String str) {
        File file = new File(str);
        if (file.exists()) {
            return file.isFile();
        }
        if (!createOrExistsDir(file.getParentFile())) {
            return false;
        }
        try {
            deleteDueLogs(str);
            boolean createNewFile = file.createNewFile();
            if (createNewFile) {
                printDeviceInfo(str);
            }
            return createNewFile;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    private static void deleteDueLogs(String str) {
        File[] listFiles = new File(str).getParentFile().listFiles(new FilenameFilter() { // from class: com.glority.utils.stability.LogUtils.1
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str2) {
                return str2.matches("^" + LogUtils.CONFIG.mFilePrefix + "-[0-9]{4}-[0-9]{2}-[0-9]{2}.txt$");
            }
        });
        if (listFiles.length <= 0) {
            return;
        }
        int length = str.length();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        try {
            long time = simpleDateFormat.parse(str.substring(length - 14, length - 4)).getTime() - (CONFIG.mSaveDays * 86400000);
            for (final File file : listFiles) {
                String name = file.getName();
                int length2 = name.length();
                if (simpleDateFormat.parse(name.substring(length2 - 14, length2 - 4)).getTime() <= time) {
                    EXECUTOR.execute(new Runnable() { // from class: com.glority.utils.stability.LogUtils.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (file.delete()) {
                                return;
                            }
                            Log.e("LogUtils", "delete " + file + " failed!");
                        }
                    });
                }
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static void printDeviceInfo(String str) {
        String str2 = "";
        int i = 0;
        try {
            PackageInfo packageInfo = UtilsApp.getApp().getPackageManager().getPackageInfo(UtilsApp.getApp().getPackageName(), 0);
            if (packageInfo != null) {
                str2 = packageInfo.versionName;
                i = packageInfo.versionCode;
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        input2File("************* Log Head ****************\nDate of Log        : " + str.substring(str.length() - 14, str.length() - 4) + "\nDevice Manufacturer: " + Build.MANUFACTURER + "\nDevice Model       : " + Build.MODEL + "\nAndroid Version    : " + Build.VERSION.RELEASE + "\nAndroid SDK        : " + Build.VERSION.SDK_INT + "\nApp VersionName    : " + str2 + "\nApp VersionCode    : " + i + "\n************* Log Head ****************\n\n", str);
    }

    private static boolean createOrExistsDir(File file) {
        return file != null && (!file.exists() ? !file.mkdirs() : !file.isDirectory());
    }

    private static void input2File(final String str, final String str2) {
        EXECUTOR.execute(new Runnable() { // from class: com.glority.utils.stability.LogUtils.3
            @Override // java.lang.Runnable
            public void run() {
                BufferedWriter bufferedWriter;
                IOException e;
                BufferedWriter bufferedWriter2 = null;
                try {
                    try {
                        try {
                            bufferedWriter = new BufferedWriter(new FileWriter(str2, true));
                        } catch (IOException e2) {
                            bufferedWriter = null;
                            e = e2;
                        } catch (Throwable th) {
                            th = th;
                            if (bufferedWriter2 != null) {
                                try {
                                    bufferedWriter2.close();
                                } catch (IOException e3) {
                                    e3.printStackTrace();
                                }
                            }
                            throw th;
                        }
                        try {
                            bufferedWriter.write(str);
                            bufferedWriter.close();
                        } catch (IOException e4) {
                            e = e4;
                            e.printStackTrace();
                            Log.e("LogUtils", "log to " + str2 + " failed!");
                            if (bufferedWriter != null) {
                                bufferedWriter.close();
                            }
                        }
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter2 = bufferedWriter;
                }
            }
        });
    }

    /* loaded from: classes9.dex */
    public static class Config {
        private int mConsoleFilter;
        private String mDefaultDir;
        private String mDir;
        private int mFileFilter;
        private String mFilePrefix;
        private String mGlobalTag;
        private boolean mLog2ConsoleSwitch;
        private boolean mLog2FileSwitch;
        private boolean mLogBorderSwitch;
        private boolean mLogHeadSwitch;
        private boolean mLogSwitch;
        private int mSaveDays;
        private boolean mSingleTagSwitch;
        private int mStackDeep;
        private int mStackOffset;
        private boolean mTagIsSpace;

        private Config() {
            this.mFilePrefix = "util";
            this.mLogSwitch = true;
            this.mLog2ConsoleSwitch = true;
            this.mGlobalTag = null;
            this.mTagIsSpace = true;
            this.mLogHeadSwitch = true;
            this.mLog2FileSwitch = false;
            this.mLogBorderSwitch = true;
            this.mSingleTagSwitch = true;
            this.mConsoleFilter = 2;
            this.mFileFilter = 2;
            this.mStackDeep = 1;
            this.mStackOffset = 0;
            this.mSaveDays = -1;
            if (this.mDefaultDir != null) {
                return;
            }
            if (!"mounted".equals(Environment.getExternalStorageState()) || UtilsApp.getApp().getExternalCacheDir() == null) {
                this.mDefaultDir = UtilsApp.getApp().getCacheDir() + LogUtils.FILE_SEP + "log" + LogUtils.FILE_SEP;
            } else {
                this.mDefaultDir = UtilsApp.getApp().getExternalCacheDir() + LogUtils.FILE_SEP + "log" + LogUtils.FILE_SEP;
            }
        }

        public Config setLogSwitch(boolean z) {
            this.mLogSwitch = z;
            return this;
        }

        public Config setConsoleSwitch(boolean z) {
            this.mLog2ConsoleSwitch = z;
            return this;
        }

        public Config setGlobalTag(String str) {
            if (StringUtils.isSpace(str)) {
                this.mGlobalTag = "";
                this.mTagIsSpace = true;
            } else {
                this.mGlobalTag = str;
                this.mTagIsSpace = false;
            }
            return this;
        }

        public Config setLogHeadSwitch(boolean z) {
            this.mLogHeadSwitch = z;
            return this;
        }

        public Config setLog2FileSwitch(boolean z) {
            this.mLog2FileSwitch = z;
            return this;
        }

        public Config setDir(String str) {
            if (!StringUtils.isSpace(str)) {
                if (!str.endsWith(LogUtils.FILE_SEP)) {
                    str = str + LogUtils.FILE_SEP;
                }
                this.mDir = str;
            } else {
                this.mDir = null;
            }
            return this;
        }

        public Config setDir(File file) {
            this.mDir = file == null ? null : file.getAbsolutePath() + LogUtils.FILE_SEP;
            return this;
        }

        public Config setFilePrefix(String str) {
            if (StringUtils.isSpace(str)) {
                this.mFilePrefix = "util";
            } else {
                this.mFilePrefix = str;
            }
            return this;
        }

        public Config setBorderSwitch(boolean z) {
            this.mLogBorderSwitch = z;
            return this;
        }

        public Config setSingleTagSwitch(boolean z) {
            this.mSingleTagSwitch = z;
            return this;
        }

        public Config setConsoleFilter(int i) {
            this.mConsoleFilter = i;
            return this;
        }

        public Config setFileFilter(int i) {
            this.mFileFilter = i;
            return this;
        }

        public Config setStackDeep(int i) {
            this.mStackDeep = i;
            return this;
        }

        public Config setStackOffset(int i) {
            this.mStackOffset = i;
            return this;
        }

        public Config setSaveDays(int i) {
            this.mSaveDays = i;
            return this;
        }

        public final <T> Config addFormatter(IFormatter<T> iFormatter) {
            if (iFormatter != null) {
                LogUtils.I_FORMATTER_MAP.put(LogUtils.getTypeClassFromParadigm(iFormatter), iFormatter);
            }
            return this;
        }

        public String toString() {
            StringBuilder append = new StringBuilder("switch: ").append(this.mLogSwitch).append(LogUtils.LINE_SEP).append("console: ").append(this.mLog2ConsoleSwitch).append(LogUtils.LINE_SEP).append("tag: ").append(this.mTagIsSpace ? "null" : this.mGlobalTag).append(LogUtils.LINE_SEP).append("head: ").append(this.mLogHeadSwitch).append(LogUtils.LINE_SEP).append("file: ").append(this.mLog2FileSwitch).append(LogUtils.LINE_SEP).append("dir: ");
            String str = this.mDir;
            if (str == null) {
                str = this.mDefaultDir;
            }
            return append.append(str).append(LogUtils.LINE_SEP).append("filePrefix: ").append(this.mFilePrefix).append(LogUtils.LINE_SEP).append("border: ").append(this.mLogBorderSwitch).append(LogUtils.LINE_SEP).append("singleTag: ").append(this.mSingleTagSwitch).append(LogUtils.LINE_SEP).append("consoleFilter: ").append(LogUtils.T[this.mConsoleFilter - 2]).append(LogUtils.LINE_SEP).append("fileFilter: ").append(LogUtils.T[this.mFileFilter - 2]).append(LogUtils.LINE_SEP).append("stackDeep: ").append(this.mStackDeep).append(LogUtils.LINE_SEP).append("stackOffset: ").append(this.mStackOffset).append(LogUtils.LINE_SEP).append("saveDays: ").append(this.mSaveDays).append(LogUtils.LINE_SEP).append("formatter: ").append(LogUtils.I_FORMATTER_MAP).toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    public static class TagHead {
        String[] consoleHead;
        String fileHead;
        String tag;

        TagHead(String str, String[] strArr, String str2) {
            this.tag = str;
            this.consoleHead = strArr;
            this.fileHead = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    public static class LogFormatter {
        private LogFormatter() {
        }

        static String formatJson(String str) {
            try {
                if (str.startsWith("{")) {
                    str = new JSONObject(str).toString(4);
                } else if (str.startsWith("[")) {
                    str = new JSONArray(str).toString(4);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return str;
        }

        static String formatXml(String str) {
            try {
                StreamSource streamSource = new StreamSource(new StringReader(str));
                StreamResult streamResult = new StreamResult(new StringWriter());
                Transformer newTransformer = TransformerFactory.newInstance().newTransformer();
                newTransformer.setOutputProperty("indent", "yes");
                newTransformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
                newTransformer.transform(streamSource, streamResult);
                return streamResult.getWriter().toString().replaceFirst(">", ">" + LogUtils.LINE_SEP);
            } catch (Exception e) {
                e.printStackTrace();
                return str;
            }
        }

        static String array2String(Object obj) {
            if (obj instanceof Object[]) {
                return Arrays.deepToString((Object[]) obj);
            }
            if (obj instanceof boolean[]) {
                return Arrays.toString((boolean[]) obj);
            }
            if (obj instanceof byte[]) {
                return Arrays.toString((byte[]) obj);
            }
            if (obj instanceof char[]) {
                return Arrays.toString((char[]) obj);
            }
            if (obj instanceof double[]) {
                return Arrays.toString((double[]) obj);
            }
            if (obj instanceof float[]) {
                return Arrays.toString((float[]) obj);
            }
            if (obj instanceof int[]) {
                return Arrays.toString((int[]) obj);
            }
            if (obj instanceof long[]) {
                return Arrays.toString((long[]) obj);
            }
            if (obj instanceof short[]) {
                return Arrays.toString((short[]) obj);
            }
            throw new IllegalArgumentException("Array has incompatible type: " + obj.getClass());
        }

        static String throwable2String(Throwable th) {
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                if (th2 instanceof UnknownHostException) {
                    return "";
                }
            }
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
                cause.printStackTrace(printWriter);
            }
            printWriter.flush();
            return stringWriter.toString();
        }

        static String bundle2String(Bundle bundle) {
            Iterator<String> it = bundle.keySet().iterator();
            if (!it.hasNext()) {
                return "Bundle {}";
            }
            StringBuilder sb = new StringBuilder(128);
            sb.append("Bundle { ");
            while (true) {
                String next = it.next();
                Object obj = bundle.get(next);
                sb.append(next).append('=');
                if (obj == null || !(obj instanceof Bundle)) {
                    sb.append(LogUtils.formatObject(obj));
                } else {
                    sb.append(obj == bundle ? "(this Bundle)" : bundle2String((Bundle) obj));
                }
                if (!it.hasNext()) {
                    return sb.append(" }").toString();
                }
                sb.append(", ");
            }
        }

        static String intent2String(Intent intent) {
            boolean z;
            StringBuilder sb = new StringBuilder(128);
            sb.append("Intent { ");
            String action = intent.getAction();
            boolean z2 = false;
            boolean z3 = true;
            if (action != null) {
                sb.append("act=").append(action);
                z = false;
            } else {
                z = true;
            }
            Set<String> categories = intent.getCategories();
            if (categories != null) {
                if (!z) {
                    sb.append(' ');
                }
                sb.append("cat=[");
                for (String str : categories) {
                    if (!z3) {
                        sb.append(',');
                    }
                    sb.append(str);
                    z3 = false;
                }
                sb.append("]");
                z = false;
            }
            Uri data = intent.getData();
            if (data != null) {
                if (!z) {
                    sb.append(' ');
                }
                sb.append("dat=").append(data);
                z = false;
            }
            String type = intent.getType();
            if (type != null) {
                if (!z) {
                    sb.append(' ');
                }
                sb.append("typ=").append(type);
                z = false;
            }
            int flags = intent.getFlags();
            if (flags != 0) {
                if (!z) {
                    sb.append(' ');
                }
                sb.append("flg=0x").append(Integer.toHexString(flags));
                z = false;
            }
            String str2 = intent.getPackage();
            if (str2 != null) {
                if (!z) {
                    sb.append(' ');
                }
                sb.append("pkg=").append(str2);
                z = false;
            }
            ComponentName component = intent.getComponent();
            if (component != null) {
                if (!z) {
                    sb.append(' ');
                }
                sb.append("cmp=").append(component.flattenToShortString());
                z = false;
            }
            Rect sourceBounds = intent.getSourceBounds();
            if (sourceBounds != null) {
                if (!z) {
                    sb.append(' ');
                }
                sb.append("bnds=").append(sourceBounds.toShortString());
                z = false;
            }
            ClipData clipData = intent.getClipData();
            if (clipData != null) {
                if (!z) {
                    sb.append(' ');
                }
                clipData2String(clipData, sb);
                z = false;
            }
            Bundle extras = intent.getExtras();
            if (extras != null) {
                if (!z) {
                    sb.append(' ');
                }
                sb.append("extras={");
                sb.append(bundle2String(extras));
                sb.append('}');
            } else {
                z2 = z;
            }
            Intent selector = intent.getSelector();
            if (selector != null) {
                if (!z2) {
                    sb.append(' ');
                }
                sb.append("sel={");
                sb.append(selector == intent ? "(this Intent)" : intent2String(selector));
                sb.append("}");
            }
            sb.append(" }");
            return sb.toString();
        }

        private static void clipData2String(ClipData clipData, StringBuilder sb) {
            ClipData.Item itemAt = clipData.getItemAt(0);
            if (itemAt == null) {
                sb.append("ClipData.Item {}");
                return;
            }
            sb.append("ClipData.Item { ");
            String htmlText = itemAt.getHtmlText();
            if (htmlText != null) {
                sb.append("H:");
                sb.append(htmlText);
                sb.append("}");
                return;
            }
            CharSequence text = itemAt.getText();
            if (text != null) {
                sb.append("T:");
                sb.append(text);
                sb.append("}");
                return;
            }
            Uri uri = itemAt.getUri();
            if (uri != null) {
                sb.append("U:").append(uri);
                sb.append("}");
                return;
            }
            Intent intent = itemAt.getIntent();
            if (intent != null) {
                sb.append("I:");
                sb.append(intent2String(intent));
                sb.append("}");
            } else {
                sb.append("NULL");
                sb.append("}");
            }
        }
    }

    static <T> Class getTypeClassFromParadigm(IFormatter<T> iFormatter) {
        Type genericSuperclass;
        Type[] genericInterfaces = iFormatter.getClass().getGenericInterfaces();
        if (genericInterfaces.length == 1) {
            genericSuperclass = genericInterfaces[0];
        } else {
            genericSuperclass = iFormatter.getClass().getGenericSuperclass();
        }
        Type type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
        while (type instanceof ParameterizedType) {
            type = ((ParameterizedType) type).getRawType();
        }
        String obj = type.toString();
        if (obj.startsWith("class ")) {
            obj = obj.substring(6);
        } else if (obj.startsWith("interface ")) {
            obj = obj.substring(10);
        }
        try {
            return Class.forName(obj);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static Class getClassFromObject(Object obj) {
        String obj2;
        Class<?> cls = obj.getClass();
        if (cls.isAnonymousClass() || cls.isSynthetic()) {
            Type[] genericInterfaces = cls.getGenericInterfaces();
            if (genericInterfaces.length == 1) {
                Type type = genericInterfaces[0];
                while (type instanceof ParameterizedType) {
                    type = ((ParameterizedType) type).getRawType();
                }
                obj2 = type.toString();
            } else {
                Type genericSuperclass = cls.getGenericSuperclass();
                while (genericSuperclass instanceof ParameterizedType) {
                    genericSuperclass = ((ParameterizedType) genericSuperclass).getRawType();
                }
                obj2 = genericSuperclass.toString();
            }
            if (obj2.startsWith("class ")) {
                obj2 = obj2.substring(6);
            } else if (obj2.startsWith("interface ")) {
                obj2 = obj2.substring(10);
            }
            try {
                return Class.forName(obj2);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return cls;
    }
}

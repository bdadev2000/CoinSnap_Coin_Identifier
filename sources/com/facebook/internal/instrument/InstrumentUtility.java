package com.facebook.internal.instrument;

import androidx.annotation.RestrictTo;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.internal.Utility;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p0.a;
import y.b;
import z0.m;

@RestrictTo
/* loaded from: classes3.dex */
public final class InstrumentUtility {

    @NotNull
    public static final String ANALYSIS_REPORT_PREFIX = "analysis_log_";

    @NotNull
    public static final String ANR_REPORT_PREFIX = "anr_log_";

    @NotNull
    private static final String CODELESS_PREFIX = "com.facebook.appevents.codeless";

    @NotNull
    public static final String CRASH_REPORT_PREFIX = "crash_log_";

    @NotNull
    public static final String CRASH_SHIELD_PREFIX = "shield_log_";

    @NotNull
    public static final String ERROR_REPORT_PREFIX = "error_log_";

    @NotNull
    private static final String FBSDK_PREFIX = "com.facebook";

    @NotNull
    public static final InstrumentUtility INSTANCE = new InstrumentUtility();

    @NotNull
    private static final String INSTRUMENT_DIR = "instrument";

    @NotNull
    private static final String METASDK_PREFIX = "com.meta";

    @NotNull
    private static final String SUGGESTED_EVENTS_PREFIX = "com.facebook.appevents.suggestedevents";

    @NotNull
    public static final String THREAD_CHECK_PREFIX = "thread_check_log_";

    private InstrumentUtility() {
    }

    public static final boolean deleteFile(@Nullable String str) {
        File instrumentReportDir = getInstrumentReportDir();
        if (instrumentReportDir == null || str == null) {
            return false;
        }
        return new File(instrumentReportDir, str).delete();
    }

    @Nullable
    public static final String getCause(@Nullable Throwable th) {
        if (th == null) {
            return null;
        }
        return th.getCause() == null ? th.toString() : String.valueOf(th.getCause());
    }

    @Nullable
    public static final File getInstrumentReportDir() {
        File file = new File(FacebookSdk.getApplicationContext().getCacheDir(), INSTRUMENT_DIR);
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    @Nullable
    public static final String getStackTrace(@Nullable Throwable th) {
        Throwable th2 = null;
        if (th == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        while (th != null && th != th2) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            a.r(stackTrace, "t.stackTrace");
            int length = stackTrace.length;
            int i2 = 0;
            while (i2 < length) {
                StackTraceElement stackTraceElement = stackTrace[i2];
                i2++;
                jSONArray.put(stackTraceElement.toString());
            }
            th2 = th;
            th = th.getCause();
        }
        return jSONArray.toString();
    }

    public static final boolean isFromFbOrMeta(@NotNull StackTraceElement stackTraceElement) {
        a.s(stackTraceElement, "element");
        String className = stackTraceElement.getClassName();
        a.r(className, "element.className");
        if (!m.q1(className, "com.facebook", false)) {
            String className2 = stackTraceElement.getClassName();
            a.r(className2, "element.className");
            if (!m.q1(className2, METASDK_PREFIX, false)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean isSDKRelatedException(@Nullable Throwable th) {
        if (th == null) {
            return false;
        }
        Throwable th2 = null;
        while (th != null && th != th2) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            a.r(stackTrace, "t.stackTrace");
            int length = stackTrace.length;
            int i2 = 0;
            while (i2 < length) {
                StackTraceElement stackTraceElement = stackTrace[i2];
                i2++;
                a.r(stackTraceElement, "element");
                if (isFromFbOrMeta(stackTraceElement)) {
                    return true;
                }
            }
            th2 = th;
            th = th.getCause();
        }
        return false;
    }

    public static final boolean isSDKRelatedThread(@Nullable Thread thread) {
        StackTraceElement[] stackTrace;
        if (thread != null && (stackTrace = thread.getStackTrace()) != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                a.r(stackTraceElement, "element");
                if (isFromFbOrMeta(stackTraceElement)) {
                    String className = stackTraceElement.getClassName();
                    a.r(className, "element.className");
                    if (!m.q1(className, CODELESS_PREFIX, false)) {
                        String className2 = stackTraceElement.getClassName();
                        a.r(className2, "element.className");
                        if (!m.q1(className2, SUGGESTED_EVENTS_PREFIX, false)) {
                            return true;
                        }
                    }
                    String methodName = stackTraceElement.getMethodName();
                    a.r(methodName, "element.methodName");
                    if (m.q1(methodName, "onClick", false)) {
                        continue;
                    } else {
                        String methodName2 = stackTraceElement.getMethodName();
                        a.r(methodName2, "element.methodName");
                        if (m.q1(methodName2, "onItemClick", false)) {
                            continue;
                        } else {
                            String methodName3 = stackTraceElement.getMethodName();
                            a.r(methodName3, "element.methodName");
                            if (!m.q1(methodName3, "onTouch", false)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @NotNull
    public static final File[] listAnrReportFiles() {
        File instrumentReportDir = getInstrumentReportDir();
        if (instrumentReportDir == null) {
            return new File[0];
        }
        File[] listFiles = instrumentReportDir.listFiles(new b(2));
        return listFiles == null ? new File[0] : listFiles;
    }

    /* renamed from: listAnrReportFiles$lambda-1 */
    public static final boolean m545listAnrReportFiles$lambda1(File file, String str) {
        a.r(str, "name");
        String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{ANR_REPORT_PREFIX}, 1));
        a.r(format, "java.lang.String.format(format, *args)");
        Pattern compile = Pattern.compile(format);
        a.r(compile, "compile(...)");
        return compile.matcher(str).matches();
    }

    @NotNull
    public static final File[] listExceptionAnalysisReportFiles() {
        File instrumentReportDir = getInstrumentReportDir();
        if (instrumentReportDir == null) {
            return new File[0];
        }
        File[] listFiles = instrumentReportDir.listFiles(new b(1));
        return listFiles == null ? new File[0] : listFiles;
    }

    /* renamed from: listExceptionAnalysisReportFiles$lambda-2 */
    public static final boolean m546listExceptionAnalysisReportFiles$lambda2(File file, String str) {
        a.r(str, "name");
        String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{ANALYSIS_REPORT_PREFIX}, 1));
        a.r(format, "java.lang.String.format(format, *args)");
        Pattern compile = Pattern.compile(format);
        a.r(compile, "compile(...)");
        return compile.matcher(str).matches();
    }

    @NotNull
    public static final File[] listExceptionReportFiles() {
        File instrumentReportDir = getInstrumentReportDir();
        if (instrumentReportDir == null) {
            return new File[0];
        }
        File[] listFiles = instrumentReportDir.listFiles(new b(0));
        return listFiles == null ? new File[0] : listFiles;
    }

    /* renamed from: listExceptionReportFiles$lambda-3 */
    public static final boolean m547listExceptionReportFiles$lambda3(File file, String str) {
        a.r(str, "name");
        String format = String.format("^(%s|%s|%s)[0-9]+.json$", Arrays.copyOf(new Object[]{CRASH_REPORT_PREFIX, CRASH_SHIELD_PREFIX, THREAD_CHECK_PREFIX}, 3));
        a.r(format, "java.lang.String.format(format, *args)");
        Pattern compile = Pattern.compile(format);
        a.r(compile, "compile(...)");
        return compile.matcher(str).matches();
    }

    @Nullable
    public static final JSONObject readFile(@Nullable String str, boolean z2) {
        File instrumentReportDir = getInstrumentReportDir();
        if (instrumentReportDir != null && str != null) {
            try {
                return new JSONObject(Utility.readStreamToString(new FileInputStream(new File(instrumentReportDir, str))));
            } catch (Exception unused) {
                if (z2) {
                    deleteFile(str);
                }
            }
        }
        return null;
    }

    public static final void sendReports(@Nullable String str, @NotNull JSONArray jSONArray, @Nullable GraphRequest.Callback callback) {
        a.s(jSONArray, "reports");
        if (jSONArray.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, jSONArray.toString());
            JSONObject dataProcessingOptions = Utility.getDataProcessingOptions();
            if (dataProcessingOptions != null) {
                Iterator<String> keys = dataProcessingOptions.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, dataProcessingOptions.get(next));
                }
            }
            GraphRequest.Companion.newPostRequest(null, androidx.compose.foundation.text.input.a.o(new Object[]{FacebookSdk.getApplicationId()}, 1, "%s/instruments", "java.lang.String.format(format, *args)"), jSONObject, callback).executeAsync();
        } catch (JSONException unused) {
        }
    }

    public static final void writeFile(@Nullable String str, @Nullable String str2) {
        File instrumentReportDir = getInstrumentReportDir();
        if (instrumentReportDir == null || str == null || str2 == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(instrumentReportDir, str));
            byte[] bytes = str2.getBytes(z0.a.f31458a);
            a.r(bytes, "(this as java.lang.String).getBytes(charset)");
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (Exception unused) {
        }
    }

    @Nullable
    public static final String getStackTrace(@NotNull Thread thread) {
        a.s(thread, "thread");
        StackTraceElement[] stackTrace = thread.getStackTrace();
        JSONArray jSONArray = new JSONArray();
        a.r(stackTrace, "stackTrace");
        int length = stackTrace.length;
        int i2 = 0;
        while (i2 < length) {
            StackTraceElement stackTraceElement = stackTrace[i2];
            i2++;
            jSONArray.put(stackTraceElement.toString());
        }
        return jSONArray.toString();
    }
}

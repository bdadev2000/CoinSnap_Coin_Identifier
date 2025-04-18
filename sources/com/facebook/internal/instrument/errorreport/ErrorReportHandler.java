package com.facebook.internal.instrument.errorreport;

import androidx.annotation.RestrictTo;
import com.facebook.FacebookSdk;
import com.facebook.GraphResponse;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.InstrumentUtility;
import e0.s;
import java.io.File;
import java.util.ArrayList;
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

@RestrictTo
/* loaded from: classes.dex */
public final class ErrorReportHandler {

    @NotNull
    public static final ErrorReportHandler INSTANCE = new ErrorReportHandler();
    private static final int MAX_ERROR_REPORT_NUM = 1000;

    private ErrorReportHandler() {
    }

    public static final void enable() {
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            sendErrorReports();
        }
    }

    @NotNull
    public static final File[] listErrorReportFiles() {
        File instrumentReportDir = InstrumentUtility.getInstrumentReportDir();
        if (instrumentReportDir == null) {
            return new File[0];
        }
        File[] listFiles = instrumentReportDir.listFiles(new b(3));
        a.r(listFiles, "reportDir.listFiles { dir, name ->\n      name.matches(Regex(String.format(\"^%s[0-9]+.json$\", InstrumentUtility.ERROR_REPORT_PREFIX)))\n    }");
        return listFiles;
    }

    /* renamed from: listErrorReportFiles$lambda-3 */
    public static final boolean m553listErrorReportFiles$lambda3(File file, String str) {
        a.r(str, "name");
        String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{InstrumentUtility.ERROR_REPORT_PREFIX}, 1));
        a.r(format, "java.lang.String.format(format, *args)");
        Pattern compile = Pattern.compile(format);
        a.r(compile, "compile(...)");
        return compile.matcher(str).matches();
    }

    public static final void save(@Nullable String str) {
        try {
            new ErrorReportData(str).save();
        } catch (Exception unused) {
        }
    }

    public static final void sendErrorReports() {
        if (Utility.isDataProcessingRestricted()) {
            return;
        }
        File[] listErrorReportFiles = listErrorReportFiles();
        ArrayList arrayList = new ArrayList();
        int length = listErrorReportFiles.length;
        int i2 = 0;
        while (i2 < length) {
            File file = listErrorReportFiles[i2];
            i2++;
            ErrorReportData errorReportData = new ErrorReportData(file);
            if (errorReportData.isValid()) {
                arrayList.add(errorReportData);
            }
        }
        s.s0(arrayList, new androidx.compose.ui.node.a(4));
        JSONArray jSONArray = new JSONArray();
        for (int i3 = 0; i3 < arrayList.size() && i3 < 1000; i3++) {
            jSONArray.put(arrayList.get(i3));
        }
        InstrumentUtility.sendReports("error_reports", jSONArray, new y.a(arrayList, 1));
    }

    /* renamed from: sendErrorReports$lambda-0 */
    public static final int m554sendErrorReports$lambda0(ErrorReportData errorReportData, ErrorReportData errorReportData2) {
        a.r(errorReportData2, "o2");
        return errorReportData.compareTo(errorReportData2);
    }

    /* renamed from: sendErrorReports$lambda-2 */
    public static final void m555sendErrorReports$lambda2(ArrayList arrayList, GraphResponse graphResponse) {
        a.s(arrayList, "$validReports");
        a.s(graphResponse, "response");
        try {
            if (graphResponse.getError() == null) {
                JSONObject jsonObject = graphResponse.getJsonObject();
                if (a.g(jsonObject == null ? null : Boolean.valueOf(jsonObject.getBoolean("success")), Boolean.TRUE)) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((ErrorReportData) it.next()).clear();
                    }
                }
            }
        } catch (JSONException unused) {
        }
    }
}

package com.glority.analysis.utils;

import android.content.Context;
import android.os.Environment;
import com.glority.android.core.app.AppContext;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReadAndWriteJson.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004J\u001c\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u00152\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\u001a\u0010\u0016\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004J\u0018\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/glority/analysis/utils/ReadAndWriteJson;", "", "()V", "filePath", "", "getFilePath", "()Ljava/lang/String;", "setFilePath", "(Ljava/lang/String;)V", "fileIsExists", "", "strFile", "getSystemFilePath", "context", "Landroid/content/Context;", "readFile", "path", "readToBuffer", "", "buffer", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "writeFile", "input", "writeFileByAppend", "base-analysis_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes7.dex */
public final class ReadAndWriteJson {
    public static final ReadAndWriteJson INSTANCE;
    private static String filePath;

    static {
        ReadAndWriteJson readAndWriteJson = new ReadAndWriteJson();
        INSTANCE = readAndWriteJson;
        filePath = Intrinsics.stringPlus(readAndWriteJson.getSystemFilePath(AppContext.INSTANCE.peekContext()), "/analysis");
    }

    private ReadAndWriteJson() {
    }

    public final String getFilePath() {
        return filePath;
    }

    public final void setFilePath(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        filePath = str;
    }

    public final void writeFile(String filePath2, String input) throws IOException {
        FileWriter fileWriter = new FileWriter(filePath2);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        try {
            PrintWriter printWriter2 = printWriter;
            Intrinsics.checkNotNull(input);
            printWriter2.write(input);
            printWriter2.println();
            fileWriter.close();
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(printWriter, null);
        } finally {
        }
    }

    public final void writeFileByAppend(String filePath2, String input) throws IOException {
        Intrinsics.checkNotNullParameter(filePath2, "filePath");
        File file = new File(filePath2);
        if (!file.exists()) {
            file.mkdirs();
        }
        FileWriter fileWriter = new FileWriter(filePath2 + File.separator + "log.txt", true);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        try {
            PrintWriter printWriter2 = printWriter;
            Intrinsics.checkNotNull(input);
            printWriter2.write(input);
            printWriter2.println();
            fileWriter.close();
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(printWriter, null);
        } finally {
        }
    }

    public final String readFile(String path) throws IOException {
        if (path == null) {
            path = filePath + File.separator + "log.txt";
        }
        StringBuilder sb = new StringBuilder();
        readToBuffer(sb, path);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }

    public final void readToBuffer(StringBuilder buffer, String filePath2) throws IOException {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        FileInputStream fileInputStream = new FileInputStream(filePath2);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        try {
            BufferedReader bufferedReader2 = bufferedReader;
            String readLine = bufferedReader2.readLine();
            Intrinsics.checkNotNullExpressionValue(readLine, "reader.readLine()");
            while (readLine != null) {
                buffer.append(readLine);
                buffer.append("\n");
                readLine = bufferedReader2.readLine();
                Intrinsics.checkNotNullExpressionValue(readLine, "reader.readLine()");
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(bufferedReader, null);
            fileInputStream.close();
        } finally {
        }
    }

    private final String getSystemFilePath(Context context) {
        if (Intrinsics.areEqual("mounted", Environment.getExternalStorageState()) || !Environment.isExternalStorageRemovable()) {
            File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
            if (externalFilesDir != null) {
                return externalFilesDir.getAbsolutePath();
            }
            return null;
        }
        File filesDir = context.getFilesDir();
        Intrinsics.checkNotNullExpressionValue(filesDir, "context.filesDir");
        return filesDir.getAbsolutePath();
    }

    public final boolean fileIsExists(String strFile) {
        Intrinsics.checkNotNullParameter(strFile, "strFile");
        try {
            return new File(strFile).exists();
        } catch (Exception unused) {
            return false;
        }
    }
}

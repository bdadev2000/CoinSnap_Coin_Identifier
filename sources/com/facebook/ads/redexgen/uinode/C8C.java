package com.facebook.ads.redexgen.uinode;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.io.encoding.Base64;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.8C, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C8C {
    public static AtomicInteger A00;
    public static byte[] A01;
    public static String[] A02 = {"TEIgz1GSUxi0w6HxI", "WqDufwBE7AlvD41n6qdN4YbCXU2LtDad", "95AkSvnB6didgYS0", "q9Pm9O4XheyxpjJIaV85netzFUNpUTJ1", "laKi0sQOm1cRNFPmXQKezZzTFfBBOlTJ", "R9By8R7rHrFXxi8d0eZrOpOQKJFwFXXr", "DNKj97yZe49oXEmfRz7aINNiwqbkjDQZ", "HsAQREGxpVIGFVt11mTJ2r8ajNtMZb1h"};
    public static final Object A03;
    public static final String A04;
    public static final Map<String, Integer> A05;
    public static final Set<String> A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static C8E A01(String str, C03987f c03987f, Map<String, String> map) {
        C8E c8e = null;
        try {
            c8e = new C8E(c03987f.A08().A01(), c03987f.A08().A02(), new C04127y(str, map, true).A02());
            A0C(c8e, c03987f);
            return c8e;
        } catch (Exception unused) {
            return c8e;
        }
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 124);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static JSONArray A04(C03987f c03987f, int i10) {
        AnonymousClass89 A07;
        JSONArray jSONArray = new JSONArray();
        synchronized (A03) {
            FileInputStream fileInputStream = null;
            InputStreamReader inputStreamReader = null;
            BufferedReader bufferedReader = null;
            try {
                try {
                    if (new File(c03987f.getFilesDir(), ProcessUtils.getProcessSpecificName(A02(281, 9, 51), c03987f)).exists()) {
                        fileInputStream = c03987f.openFileInput(ProcessUtils.getProcessSpecificName(A02(281, 9, 51), c03987f));
                        inputStreamReader = new InputStreamReader(fileInputStream);
                        bufferedReader = new BufferedReader(inputStreamReader);
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null || i10 == 0) {
                                break;
                            }
                            JSONObject jSONObject = new JSONObject(readLine);
                            if (!jSONObject.has(A02(260, 7, 27))) {
                                jSONObject.put(A02(260, 7, 27), String.valueOf(0));
                            }
                            String string = jSONObject.getString(A02(343, 2, 126));
                            if (!A06.contains(string)) {
                                int i11 = jSONObject.getInt(A02(260, 7, 27));
                                Map<String, Integer> map = A05;
                                if (map.containsKey(string)) {
                                    jSONObject.put(A02(260, 7, 27), String.valueOf(map.get(string)));
                                } else {
                                    A0E(string, i11);
                                }
                                jSONArray.put(jSONObject);
                                if (i10 > 0) {
                                    i10--;
                                }
                            }
                        }
                    }
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e2) {
                            e = e2;
                            A07 = c03987f.A07();
                            A07.A3c(e);
                            return jSONArray;
                        }
                    }
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                } catch (IOException | JSONException e10) {
                    c03987f.A07().A3c(e10);
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e11) {
                            e = e11;
                            A07 = c03987f.A07();
                            A07.A3c(e);
                            return jSONArray;
                        }
                    }
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                }
            } finally {
                if (bufferedReader != null) {
                    try {
                    } catch (IOException e12) {
                    }
                }
            }
        }
        return jSONArray;
    }

    public static void A06() {
        A01 = new byte[]{7, 95, 83, 55, 1, Ascii.FS, 3, 48, Ascii.FS, 6, Ascii.GS, 7, Ascii.SYN, 1, 73, 83, 63, Ascii.GS, Ascii.DC2, 91, 8, 92, Ascii.CAN, Ascii.EM, Ascii.DLE, Ascii.EM, 8, Ascii.EM, 92, Ascii.CAN, Ascii.EM, Ascii.RS, 9, Ascii.ESC, 92, Ascii.EM, 10, Ascii.EM, Ascii.DC2, 8, Ascii.SI, 92, Ascii.SUB, Ascii.NAK, Ascii.DLE, Ascii.EM, 82, Ascii.SO, 44, 35, 106, 57, 109, 41, 40, 33, 40, 57, 40, 109, 43, 36, 33, 40, 108, 119, 118, 113, 102, 116, 108, 99, 97, 118, 117, 42, Ascii.EM, 10, 1, Ascii.ESC, 44, 0, Ascii.SUB, 1, Ascii.ESC, 41, 45, 46, Ascii.SUB, Ascii.VT, 6, 10, 1, Ascii.FF, 10, 33, 10, Ascii.ESC, Ascii.CAN, 0, Ascii.GS, 4, Ascii.US, 58, Base64.padSymbol, 40, 42, 111, 43, 42, 45, 58, 40, 111, 42, 57, 42, 33, 59, 60, 111, 41, 38, 35, 42, 97, 69, 9, 38, 35, 42, 111, 60, 38, 53, 42, 117, 111, 111, 87, 85, 76, 76, 89, 88, Ascii.FS, 89, 74, 89, 82, 72, 79, Ascii.DC2, 40, Ascii.DLE, Ascii.DC2, Ascii.VT, Ascii.VT, Ascii.DC2, Ascii.NAK, Ascii.FS, 91, Ascii.CAN, Ascii.DC4, 9, 9, Ascii.SO, Ascii.VT, Ascii.SI, Ascii.RS, Ascii.US, 91, Ascii.US, Ascii.RS, Ascii.EM, Ascii.SO, Ascii.FS, 91, Ascii.RS, Ascii.CR, Ascii.RS, Ascii.NAK, Ascii.SI, 91, Ascii.ETB, Ascii.DC2, Ascii.NAK, Ascii.RS, 85, 98, 68, 79, 95, 88, 81, Ascii.SYN, 66, 89, Ascii.SYN, 67, 70, 82, 87, 66, 83, Ascii.SYN, 67, 88, 68, 83, 85, 89, 68, 82, 83, 82, Ascii.SYN, 82, 83, 84, 67, 81, 122, 89, 81, 115, 64, 83, 88, 66, Ascii.CAN, Ascii.SYN, 87, 82, 82, 95, 88, 81, Ascii.SYN, 66, 89, Ascii.SYN, 121, 88, 81, 89, 95, 88, 81, 115, 64, 83, 88, 66, Ascii.CAN, 58, 17, 0, 8, Ascii.NAK, 6, 19, 19, 2, 10, Ascii.ETB, 19, 88, 93, 72, 93, Byte.MAX_VALUE, 126, 68, 119, 116, 124, 124, 114, 117, 124, 43, 42, 45, 58, 40, 35, 32, 40, 60, 91, 84, 83, 84, 78, 85, 88, 89, Ascii.GS, 88, 75, 88, 83, 73, Ascii.GS, 78, 85, 82, 72, 81, 89, Ascii.GS, 83, 82, 73, Ascii.GS, 95, 88, Ascii.GS, 72, 77, 89, 92, 73, 88, 89, Ascii.GS, 73, 82, Ascii.GS, 114, 83, 90, 82, 84, 83, 90, 120, 75, 88, 83, 73, 19, 107, 102, 126, 104, 126, 126, 100, 98, 99, 82, 100, 105, 72, 94, 72, 72, 82, 84, 85, 100, 79, 82, 86, 94, 105, 113, 115, 106, 106, Byte.MAX_VALUE, 126, 95, 108, Byte.MAX_VALUE, 116, 110, 105, 58, 39, 58, 49, 55, 32, 54, 59, 50, 39, 75, 77, 90, 76, 65, 72, 93, 103, 91, 87, 92, 93, 119, 106, 110, 102, 85, 88, 81, 68};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 15
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static boolean A0G(C03987f c03987f) {
        JSONArray jSONArray = new JSONArray();
        synchronized (A03) {
            int i10 = 0;
            FileInputStream fileInputStream = null;
            InputStreamReader inputStreamReader = null;
            BufferedReader bufferedReader = null;
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    if (new File(c03987f.getFilesDir(), ProcessUtils.getProcessSpecificName(A02(281, 9, 51), c03987f)).exists()) {
                        fileInputStream = c03987f.openFileInput(ProcessUtils.getProcessSpecificName(A02(281, 9, 51), c03987f));
                        inputStreamReader = new InputStreamReader(fileInputStream);
                        bufferedReader = new BufferedReader(inputStreamReader);
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            JSONObject jSONObject = new JSONObject(readLine);
                            String string = jSONObject.getString(A02(343, 2, 126));
                            if (!A06.contains(string)) {
                                Map<String, Integer> map = A05;
                                if (map.containsKey(string)) {
                                    Integer num = map.get(string);
                                    Integer valueOf = Integer.valueOf(num != null ? num.intValue() : 0);
                                    int A022 = Ij.A02(c03987f);
                                    if (A022 <= -1 || valueOf.intValue() <= A022 - 1) {
                                        jSONObject.put(A02(260, 7, 27), String.valueOf(valueOf));
                                        jSONArray.put(jSONObject);
                                    } else {
                                        A0D(string);
                                        i10++;
                                    }
                                } else {
                                    jSONArray.put(jSONObject);
                                }
                            }
                        }
                        StringBuilder sb2 = new StringBuilder();
                        int length = jSONArray.length();
                        for (int i11 = 0; i11 < length; i11++) {
                            sb2.append(jSONArray.getJSONObject(i11).toString()).append('\n');
                        }
                        fileOutputStream = c03987f.openFileOutput(ProcessUtils.getProcessSpecificName(A02(281, 9, 51), c03987f), 0);
                        fileOutputStream.write(sb2.toString().getBytes());
                    }
                    A09(c03987f, A00(c03987f));
                    if (i10 > 0) {
                        c03987f.A07().A9a(A02(271, 10, 103), C8A.A2W, new C8B(A02(138, 15, 64), A02(367, 16, 102) + i10));
                    }
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e2) {
                            c03987f.A07().A3c(e2);
                        }
                    }
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    A06.clear();
                    A05.clear();
                    return true;
                } catch (IOException | JSONException e10) {
                    c03987f.A07().A3c(e10);
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e11) {
                            c03987f.A07().A3c(e11);
                            A06.clear();
                            A05.clear();
                            return false;
                        }
                    }
                    if (inputStreamReader != null) {
                        inputStreamReader.close();
                    }
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    A06.clear();
                    A05.clear();
                    return false;
                }
            } finally {
                if (bufferedReader != null) {
                    try {
                    } catch (IOException e12) {
                    }
                }
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01f0 A[Catch: IOException -> 0x0208, all -> 0x0252, TryCatch #5 {IOException -> 0x0208, blocks: (B:64:0x01eb, B:47:0x01f0, B:49:0x01f5, B:51:0x01fa, B:53:0x01ff, B:55:0x0204), top: B:63:0x01eb, outer: #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01f5 A[Catch: IOException -> 0x0208, all -> 0x0252, TryCatch #5 {IOException -> 0x0208, blocks: (B:64:0x01eb, B:47:0x01f0, B:49:0x01f5, B:51:0x01fa, B:53:0x01ff, B:55:0x0204), top: B:63:0x01eb, outer: #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01fa A[Catch: IOException -> 0x0208, all -> 0x0252, TryCatch #5 {IOException -> 0x0208, blocks: (B:64:0x01eb, B:47:0x01f0, B:49:0x01f5, B:51:0x01fa, B:53:0x01ff, B:55:0x0204), top: B:63:0x01eb, outer: #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ff A[Catch: IOException -> 0x0208, all -> 0x0252, TryCatch #5 {IOException -> 0x0208, blocks: (B:64:0x01eb, B:47:0x01f0, B:49:0x01f5, B:51:0x01fa, B:53:0x01ff, B:55:0x0204), top: B:63:0x01eb, outer: #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0204 A[Catch: IOException -> 0x0208, all -> 0x0252, TRY_LEAVE, TryCatch #5 {IOException -> 0x0208, blocks: (B:64:0x01eb, B:47:0x01f0, B:49:0x01f5, B:51:0x01fa, B:53:0x01ff, B:55:0x0204), top: B:63:0x01eb, outer: #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0227 A[Catch: IOException -> 0x023f, all -> 0x0252, TryCatch #6 {IOException -> 0x023f, blocks: (B:84:0x0222, B:69:0x0227, B:71:0x022c, B:73:0x0231, B:75:0x0236, B:77:0x023b), top: B:83:0x0222, outer: #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x022c A[Catch: IOException -> 0x023f, all -> 0x0252, TryCatch #6 {IOException -> 0x023f, blocks: (B:84:0x0222, B:69:0x0227, B:71:0x022c, B:73:0x0231, B:75:0x0236, B:77:0x023b), top: B:83:0x0222, outer: #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0231 A[Catch: IOException -> 0x023f, all -> 0x0252, TryCatch #6 {IOException -> 0x023f, blocks: (B:84:0x0222, B:69:0x0227, B:71:0x022c, B:73:0x0231, B:75:0x0236, B:77:0x023b), top: B:83:0x0222, outer: #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0236 A[Catch: IOException -> 0x023f, all -> 0x0252, TryCatch #6 {IOException -> 0x023f, blocks: (B:84:0x0222, B:69:0x0227, B:71:0x022c, B:73:0x0231, B:75:0x0236, B:77:0x023b), top: B:83:0x0222, outer: #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x023b A[Catch: IOException -> 0x023f, all -> 0x0252, TRY_LEAVE, TryCatch #6 {IOException -> 0x023f, blocks: (B:84:0x0222, B:69:0x0227, B:71:0x022c, B:73:0x0231, B:75:0x0236, B:77:0x023b), top: B:83:0x0222, outer: #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0222 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0H(com.facebook.ads.redexgen.uinode.C03987f r17) {
        /*
            Method dump skipped, instructions count: 597
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C8C.A0H(com.facebook.ads.redexgen.X.7f):boolean");
    }

    static {
        A06();
        A04 = C8C.class.getName();
        A03 = new Object();
        A06 = Collections.synchronizedSet(new HashSet());
        A05 = Collections.synchronizedMap(new HashMap());
        A00 = new AtomicInteger();
    }

    public static int A00(Context context) {
        return context.getSharedPreferences(ProcessUtils.getProcessSpecificName(A02(65, 10, 79), context), 0).getInt(A02(75, 10, 19), 0) - A06.size();
    }

    public static JSONArray A03(C03987f c03987f) {
        return A04(c03987f, -1);
    }

    public static JSONObject A05(C8E c8e) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(A02(343, 2, 126), UUID.randomUUID().toString());
        jSONObject.put(A02(406, 4, 93), c8e.A03());
        jSONObject.put(A02(402, 4, 127), C0728Lf.A02(c8e.A01()));
        jSONObject.put(A02(355, 12, 71), C0728Lf.A02(c8e.A00()));
        jSONObject.put(A02(345, 10, 113), c8e.A02());
        jSONObject.put(A02(267, 4, 64), c8e.A04() != null ? new JSONObject(c8e.A04()) : new JSONObject());
        jSONObject.put(A02(260, 7, 27), String.valueOf(0));
        return jSONObject;
    }

    public static void A07(Context context) {
        synchronized (A03) {
            File file = new File(context.getFilesDir(), ProcessUtils.getProcessSpecificName(A02(281, 9, 51), context));
            if (file.exists()) {
                file.delete();
            }
            A09(context, 0);
            A06.clear();
            A05.clear();
        }
    }

    public static void A08(Context context) {
        A09(context, context.getSharedPreferences(ProcessUtils.getProcessSpecificName(A02(65, 10, 79), context), 0).getInt(A02(75, 10, 19), 0) + 1);
    }

    public static void A09(Context context, int i10) {
        int i11 = 0;
        SharedPreferences sharedPreferences = context.getSharedPreferences(ProcessUtils.getProcessSpecificName(A02(65, 10, 79), context), 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (i10 >= 0) {
            i11 = i10;
        }
        edit.putInt(A02(75, 10, 19), i11).apply();
    }

    public static void A0A(C03987f c03987f, String str) {
        File file = new File(c03987f.getFilesDir(), str);
        if (file.exists() && !file.delete()) {
            c03987f.A07().A3c(new RuntimeException(A02(47, 18, 49)));
        }
    }

    public static void A0B(C1069Ym c1069Ym, String str) {
        Map<String, Integer> map = A05;
        Integer num = map.get(str);
        if (num == null) {
            if (c1069Ym.A04().A8z()) {
                Log.e(A04, A02(PsExtractor.PRIVATE_STREAM_1, 66, 74));
            }
            num = 0;
        } else {
            map.remove(str);
        }
        map.put(str, Integer.valueOf(num.intValue() + 1));
    }

    public static void A0C(C8E c8e, C03987f c03987f) {
        if (c8e != null && c03987f != null) {
            synchronized (A03) {
                try {
                    String processSpecificName = ProcessUtils.getProcessSpecificName(A02(281, 9, 51), c03987f);
                    File file = new File(c03987f.getFilesDir(), processSpecificName);
                    if (file.exists()) {
                        int debugLogFileSizeLimit = Ij.A07(c03987f);
                        long length = file.length();
                        if (debugLogFileSizeLimit > 0 && length > debugLogFileSizeLimit) {
                            boolean delete = file.delete();
                            A09(c03987f, 0);
                            A06.clear();
                            A05.clear();
                            if (delete) {
                                Map<String, String> A4n = c03987f.A03().A4n();
                                A4n.put(A02(383, 7, 62), A02(271, 10, 103));
                                A4n.put(A02(390, 12, 68), String.valueOf(2401));
                                A01(A02(102, 36, 51) + length + A02(1, 15, 15) + A00.getAndIncrement(), c03987f, A4n);
                                return;
                            }
                            String processSpecificName2 = A02(85, 17, 19);
                            Log.e(processSpecificName2, A02(16, 31, 0));
                        }
                    }
                    JSONObject A052 = A05(c8e);
                    FileOutputStream outputStream = c03987f.openFileOutput(processSpecificName, 32768);
                    outputStream.write((A052.toString() + A02(0, 1, 113)).getBytes());
                    outputStream.close();
                    A08(c03987f);
                } catch (Exception e2) {
                    c03987f.A07().A3c(e2);
                }
            }
        }
    }

    public static void A0D(String str) {
        A05.remove(str);
        A06.add(str);
    }

    public static void A0E(String str, int i10) {
        if (!A06.contains(str)) {
            Map<String, Integer> map = A05;
            boolean containsKey = map.containsKey(str);
            if (A02[7].charAt(23) == 'F') {
                throw new RuntimeException();
            }
            A02[6] = "rEqe91lv7lznGuMpeMm8YlOivWfc8wjs";
            if (containsKey) {
                map.remove(str);
            }
            map.put(str, Integer.valueOf(i10));
            return;
        }
        throw new RuntimeException(A02(290, 53, 65));
    }

    public static boolean A0F(C03987f c03987f) {
        if (Ij.A0O(c03987f)) {
            return A0H(c03987f);
        }
        boolean A0G = A0G(c03987f);
        String[] strArr = A02;
        if (strArr[0].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[3] = "3ABJ1YchwKShiC4YrWnTlA0erUDCQvCN";
        strArr2[1] = "wuaZskSkctYpKQ1vHIoiu3NDqUJM9HRQ";
        return A0G;
    }

    public static boolean A0I(String str) {
        return A06.contains(str) || A05.containsKey(str);
    }
}

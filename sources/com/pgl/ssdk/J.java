package com.pgl.ssdk;

import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class J {

    /* renamed from: a, reason: collision with root package name */
    private static List<String> f19543a = new ArrayList();

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f19544a;
        public String b;

        public a(int i9, String... strArr) {
            this.f19544a = i9;
            JSONArray jSONArray = new JSONArray();
            for (String str : strArr) {
                jSONArray.put(str);
            }
            this.b = jSONArray.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0129 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0128 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized com.pgl.ssdk.J.a a(android.content.Context r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.J.a(android.content.Context, java.lang.String):com.pgl.ssdk.J$a");
    }

    private static String a(ZipFile zipFile, String str) {
        ArrayList arrayList = new ArrayList();
        String[] strArr = {"armeabi-v7a", "arm64-v8a", "x86", "x86_64", "armeabi"};
        for (int i9 = 0; i9 < 5; i9++) {
            String str2 = strArr[i9];
            if (a(zipFile, str2, str) != null) {
                arrayList.add(str2);
            }
        }
        List asList = Arrays.asList(Build.SUPPORTED_ABIS);
        ArrayList arrayList2 = new ArrayList();
        String str3 = Build.CPU_ABI;
        if (!TextUtils.isEmpty(str3)) {
            arrayList2.add(str3);
        }
        String str4 = Build.CPU_ABI2;
        if (!TextUtils.isEmpty(str4)) {
            arrayList2.add(str4);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("supportedABIS", asList);
            jSONObject.put("curABIs", arrayList2);
            jSONObject.put("apkABIS", arrayList);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    private static ZipEntry a(ZipFile zipFile, String str, String str2) {
        StringBuilder n2 = com.mbridge.msdk.foundation.entity.o.n("lib/", str, "/");
        n2.append(System.mapLibraryName(str2));
        ZipEntry entry = zipFile.getEntry(n2.toString());
        if (entry != null) {
            return entry;
        }
        int indexOf = str.indexOf(45);
        StringBuilder sb = new StringBuilder("lib/");
        if (indexOf <= 0) {
            indexOf = str.length();
        }
        sb.append(str.substring(0, indexOf));
        sb.append("/");
        sb.append(System.mapLibraryName(str2));
        return zipFile.getEntry(sb.toString());
    }
}

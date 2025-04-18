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

/* loaded from: classes4.dex */
public class K {
    private static List<String> a = new ArrayList();

    /* loaded from: classes4.dex */
    public static class a {
        public int a;

        /* renamed from: b, reason: collision with root package name */
        public String f16525b;

        public a(int i10, String... strArr) {
            this.a = i10;
            JSONArray jSONArray = new JSONArray();
            for (String str : strArr) {
                jSONArray.put(str);
            }
            this.f16525b = jSONArray.toString();
        }
    }

    private static ZipEntry a(ZipFile zipFile, String str, String str2) {
        StringBuilder o10 = a4.j.o("lib/", str, "/");
        o10.append(System.mapLibraryName(str2));
        ZipEntry entry = zipFile.getEntry(o10.toString());
        if (entry != null) {
            return entry;
        }
        int indexOf = str.indexOf(45);
        StringBuilder sb2 = new StringBuilder("lib/");
        if (indexOf <= 0) {
            indexOf = str.length();
        }
        sb2.append(str.substring(0, indexOf));
        sb2.append("/");
        sb2.append(System.mapLibraryName(str2));
        return zipFile.getEntry(sb2.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0125 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0124 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized com.pgl.ssdk.K.a a(android.content.Context r16, java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.K.a(android.content.Context, java.lang.String):com.pgl.ssdk.K$a");
    }

    private static String a(ZipFile zipFile, String str) {
        ArrayList arrayList = new ArrayList();
        String[] strArr = {"armeabi-v7a", "arm64-v8a", "x86", "x86_64", "armeabi"};
        for (int i10 = 0; i10 < 5; i10++) {
            String str2 = strArr[i10];
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
}

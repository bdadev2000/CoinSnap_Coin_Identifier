package com.mbridge.msdk.foundation.same.report;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.ad;
import org.json.JSONArray;

/* loaded from: classes4.dex */
public class b {
    private static String a = "DomainReport";

    public static boolean a(com.mbridge.msdk.c.g gVar, String str) {
        if (gVar == null) {
            return true;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            int N = gVar.N();
            JSONArray L = gVar.L();
            JSONArray K = gVar.K();
            if (K != null) {
                for (int i10 = 0; i10 < K.length(); i10++) {
                    if (str.contains(K.getString(i10))) {
                        return false;
                    }
                }
            }
            if (N != 2) {
                return true;
            }
            if (L != null) {
                for (int i11 = 0; i11 < L.length(); i11++) {
                    if (str.contains(L.getString(i11))) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e2) {
            ad.b(a, e2.getMessage());
            return true;
        }
    }
}

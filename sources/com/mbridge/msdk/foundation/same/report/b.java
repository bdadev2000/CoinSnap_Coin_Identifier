package com.mbridge.msdk.foundation.same.report;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.ad;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static String f15870a = "DomainReport";

    public static boolean a(com.mbridge.msdk.c.g gVar, String str) {
        if (gVar == null) {
            return true;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            int N8 = gVar.N();
            JSONArray L8 = gVar.L();
            JSONArray K5 = gVar.K();
            if (K5 != null) {
                for (int i9 = 0; i9 < K5.length(); i9++) {
                    if (str.contains(K5.getString(i9))) {
                        return false;
                    }
                }
            }
            if (N8 != 2) {
                return true;
            }
            if (L8 != null) {
                for (int i10 = 0; i10 < L8.length(); i10++) {
                    if (str.contains(L8.getString(i10))) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e4) {
            ad.b(f15870a, e4.getMessage());
            return true;
        }
    }
}

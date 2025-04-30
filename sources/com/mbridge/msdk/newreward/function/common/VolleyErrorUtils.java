package com.mbridge.msdk.newreward.function.common;

import com.mbridge.msdk.newreward.function.d.b.b;
import com.mbridge.msdk.tracker.network.ad;

/* loaded from: classes3.dex */
public class VolleyErrorUtils {
    public static b parseVolleyError(ad adVar) {
        b bVar = new b(0);
        bVar.b("Network unknown error");
        if (adVar == null) {
            return bVar;
        }
        int a6 = adVar.a();
        if (a6 == 1) {
            adVar.a("Network error,please check state code " + adVar.b());
            bVar = new b(1);
        } else if (a6 == 7) {
            adVar.a("The server returns an exception state code " + adVar.b());
            bVar = new b(2);
        } else if (a6 == 2) {
            adVar.a("unSupportEncodingException");
            bVar = new b(8);
        } else if (a6 == 8) {
            adVar.a("Network error,timeout exception");
            bVar = new b(4);
        } else if (a6 == 3) {
            adVar.a("Network error,I/O exception");
            bVar = new b(3);
        } else if (a6 == 4) {
            adVar.a(880041);
            adVar.a("Network error,UnknownHostException");
            bVar = new b(5);
        } else if (a6 == 6) {
            adVar.a("Network error,I/O exception response null");
            bVar = new b(7);
        } else if (a6 == 5) {
            adVar.a("Network error,I/O exception");
            bVar = new b(6);
        } else if (a6 == 0) {
            adVar.a("Network error,I/O exception");
            bVar = new b(0);
        } else if (a6 == 9) {
            adVar.a("Network unknown error");
            bVar = new b(1);
        }
        bVar.a(adVar);
        bVar.b(adVar.getMessage());
        return bVar;
    }
}

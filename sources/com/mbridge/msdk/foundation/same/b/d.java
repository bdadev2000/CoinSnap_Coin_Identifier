package com.mbridge.msdk.foundation.same.b;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class d extends b {
    public d(String str) {
        super(str);
    }

    @Override // com.mbridge.msdk.foundation.same.b.b
    public final List<a> a() {
        ArrayList<a> arrayList = new ArrayList<>();
        a(arrayList, c.MBRIDGE_RES_MANAGER_DIR, "mb/res");
        a(arrayList, c.AD_MOVIES, "mb/res/Movies").a(c.MBRIDGE_VC, "mb/res/.MBridge_VC");
        a a6 = a(arrayList, c.AD_MBRIDGE_700, "mb/res/.mbridge700");
        a6.a(c.MBRIDGE_700_IMG, "mb/res/img");
        a6.a(c.MBRIDGE_700_IMG_PICASSO, "mb/res/picasso");
        a6.a(c.MBRIDGE_700_RES, "mb/res/res");
        a6.a(c.MBRIDGE_700_HTML, "mb/res/html");
        a6.a(c.MBRIDGE_700_XML, "mb/res/xml");
        a6.a(c.MBRIDGE_700_CONFIG, "mb/config");
        c cVar = c.MBRIDGE_OTHER;
        a(arrayList, cVar, "mb/other");
        a(arrayList, c.MBRIDGE_CRASH_INFO, "mb/crashinfo");
        a(arrayList, cVar, "mb/other");
        return arrayList;
    }
}

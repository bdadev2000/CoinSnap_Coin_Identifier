package com.vungle.ads.internal.util;

import u7.AbstractC2829t;

/* loaded from: classes3.dex */
public final class t {
    public static final t INSTANCE = new t();

    private t() {
    }

    public final String getContentStringValue(f8.v vVar, String str) {
        f8.y yVar;
        G7.j.e(vVar, "json");
        G7.j.e(str, "key");
        try {
            f8.j jVar = (f8.j) AbstractC2829t.W(vVar, str);
            G7.j.e(jVar, "<this>");
            if (jVar instanceof f8.y) {
                yVar = (f8.y) jVar;
            } else {
                yVar = null;
            }
            if (yVar != null) {
                return yVar.b();
            }
            C2.m.l(jVar, "JsonPrimitive");
            throw null;
        } catch (Exception unused) {
            return null;
        }
    }
}

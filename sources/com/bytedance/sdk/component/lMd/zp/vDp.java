package com.bytedance.sdk.component.lMd.zp;

/* loaded from: classes.dex */
public enum vDp {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");

    private final String COT;

    vDp(String str) {
        this.COT = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.COT;
    }
}

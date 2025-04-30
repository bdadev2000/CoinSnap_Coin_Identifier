package com.bytedance.sdk.component.lMd.zp;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class YW {
    private String lMd;
    private String zp;

    private YW(String str) {
        this.zp = str;
    }

    public static YW zp(String str) {
        return new YW(str);
    }

    public String zp() {
        return this.zp;
    }

    public Charset zp(Charset charset) {
        try {
            String str = this.lMd;
            return str != null ? Charset.forName(str) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }
}

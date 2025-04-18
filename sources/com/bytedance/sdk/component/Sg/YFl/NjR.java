package com.bytedance.sdk.component.Sg.YFl;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class NjR {
    private String Sg;
    private String YFl;

    private NjR(String str) {
        this.YFl = str;
    }

    public static NjR YFl(String str) {
        return new NjR(str);
    }

    public String YFl() {
        return this.YFl;
    }

    public Charset YFl(Charset charset) {
        try {
            String str = this.Sg;
            return str != null ? Charset.forName(str) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }
}

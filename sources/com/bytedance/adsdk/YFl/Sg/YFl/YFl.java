package com.bytedance.adsdk.YFl.Sg.YFl;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class YFl {
    private Object[] Sg;
    private String YFl;

    public Object[] Sg() {
        return this.Sg;
    }

    public String YFl() {
        return this.YFl;
    }

    public String toString() {
        return "MethodResult{methodName='" + this.YFl + "', args=" + Arrays.toString(this.Sg) + AbstractJsonLexerKt.END_OBJ;
    }

    public void YFl(String str) {
        this.YFl = str;
    }

    public void YFl(Object[] objArr) {
        this.Sg = objArr;
    }
}

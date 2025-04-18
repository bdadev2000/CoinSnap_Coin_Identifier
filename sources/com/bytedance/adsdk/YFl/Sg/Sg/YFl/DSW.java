package com.bytedance.adsdk.YFl.Sg.Sg.YFl;

import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class DSW implements com.bytedance.adsdk.YFl.Sg.Sg.YFl {
    private final Object YFl;

    public DSW(String str) {
        if (str.equalsIgnoreCase("true")) {
            this.YFl = Boolean.TRUE;
        } else if (str.equalsIgnoreCase("false")) {
            this.YFl = Boolean.FALSE;
        } else {
            if (str.equalsIgnoreCase(AbstractJsonLexerKt.NULL)) {
                this.YFl = null;
                return;
            }
            throw new IllegalArgumentException();
        }
    }

    @Override // com.bytedance.adsdk.YFl.Sg.Sg.YFl
    public String Sg() {
        Object obj = this.YFl;
        if (obj != null) {
            return obj.toString();
        }
        return "NULL";
    }

    @Override // com.bytedance.adsdk.YFl.Sg.Sg.YFl
    public Object YFl(Map<String, JSONObject> map) {
        return this.YFl;
    }

    public String toString() {
        return "KeywordNode [keywordValue=" + this.YFl + "]";
    }

    @Override // com.bytedance.adsdk.YFl.Sg.Sg.YFl
    public com.bytedance.adsdk.YFl.Sg.AlY.wN YFl() {
        return com.bytedance.adsdk.YFl.Sg.AlY.vc.CONSTANT;
    }
}

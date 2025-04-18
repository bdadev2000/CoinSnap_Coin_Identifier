package com.bytedance.adsdk.Sg.tN.Sg;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class NjR implements tN {
    private final YFl Sg;
    private final String YFl;
    private final boolean tN;

    /* loaded from: classes.dex */
    public enum YFl {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static YFl YFl(int i10) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                return MERGE;
                            }
                            return EXCLUDE_INTERSECTIONS;
                        }
                        return INTERSECT;
                    }
                    return SUBTRACT;
                }
                return ADD;
            }
            return MERGE;
        }
    }

    public NjR(String str, YFl yFl, boolean z10) {
        this.YFl = str;
        this.Sg = yFl;
        this.tN = z10;
    }

    public YFl Sg() {
        return this.Sg;
    }

    public String YFl() {
        return this.YFl;
    }

    public boolean tN() {
        return this.tN;
    }

    public String toString() {
        return "MergePaths{mode=" + this.Sg + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // com.bytedance.adsdk.Sg.tN.Sg.tN
    public com.bytedance.adsdk.Sg.YFl.YFl.tN YFl(com.bytedance.adsdk.Sg.NjR njR, com.bytedance.adsdk.Sg.DSW dsw, com.bytedance.adsdk.Sg.tN.tN.YFl yFl) {
        return new com.bytedance.adsdk.Sg.YFl.YFl.YoT(this);
    }
}

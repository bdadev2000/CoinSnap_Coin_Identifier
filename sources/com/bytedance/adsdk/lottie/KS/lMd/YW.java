package com.bytedance.adsdk.lottie.KS.lMd;

/* loaded from: classes.dex */
public class YW implements KS {
    private final boolean KS;
    private final zp lMd;
    private final String zp;

    /* loaded from: classes.dex */
    public enum zp {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static zp zp(int i9) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 != 4) {
                            if (i9 != 5) {
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

    public YW(String str, zp zpVar, boolean z8) {
        this.zp = str;
        this.lMd = zpVar;
        this.KS = z8;
    }

    public boolean KS() {
        return this.KS;
    }

    public zp lMd() {
        return this.lMd;
    }

    public String toString() {
        return "MergePaths{mode=" + this.lMd + '}';
    }

    public String zp() {
        return this.zp;
    }

    @Override // com.bytedance.adsdk.lottie.KS.lMd.KS
    public com.bytedance.adsdk.lottie.zp.zp.KS zp(com.bytedance.adsdk.lottie.ku kuVar, com.bytedance.adsdk.lottie.HWF hwf, com.bytedance.adsdk.lottie.KS.KS.zp zpVar) {
        if (kuVar.zp()) {
            return new com.bytedance.adsdk.lottie.zp.zp.vDp(this);
        }
        return null;
    }
}

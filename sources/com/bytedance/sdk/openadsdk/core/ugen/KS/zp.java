package com.bytedance.sdk.openadsdk.core.ugen.KS;

import com.bytedance.adsdk.ugeno.core.KVG;
import com.bytedance.sdk.component.adexpress.lMd.tG;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zp extends tG {
    private float KS;
    private float jU;
    private KVG lMd;
    private JSONObject zp;

    /* renamed from: com.bytedance.sdk.openadsdk.core.ugen.KS.zp$zp, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0114zp extends tG.zp {
        private float KS;
        private float jU;
        private KVG lMd;
        private JSONObject zp;

        public C0114zp lMd(float f9) {
            this.jU = f9;
            return this;
        }

        @Override // com.bytedance.sdk.component.adexpress.lMd.tG.zp
        /* renamed from: lMd, reason: merged with bridge method [inline-methods] */
        public zp zp() {
            return new zp(this);
        }

        public C0114zp zp(JSONObject jSONObject) {
            this.zp = jSONObject;
            return this;
        }

        public C0114zp zp(KVG kvg) {
            this.lMd = kvg;
            return this;
        }

        public C0114zp zp(float f9) {
            this.KS = f9;
            return this;
        }
    }

    public zp(C0114zp c0114zp) {
        super(c0114zp);
        this.zp = c0114zp.zp;
        this.lMd = c0114zp.lMd;
        this.KS = c0114zp.KS;
        this.jU = c0114zp.jU;
    }

    public KVG Lij() {
        return this.lMd;
    }

    public JSONObject RCv() {
        return this.zp;
    }

    public float ox() {
        return this.jU;
    }

    public float yRU() {
        return this.KS;
    }
}

package com.bytedance.sdk.openadsdk.core.eT.AlY;

import com.bytedance.adsdk.ugeno.core.EH;
import com.bytedance.sdk.component.adexpress.Sg.GA;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class YFl extends GA {
    private float AlY;
    private EH Sg;
    private JSONObject YFl;
    private float tN;

    /* renamed from: com.bytedance.sdk.openadsdk.core.eT.AlY.YFl$YFl, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0124YFl extends GA.YFl {
        private float AlY;
        private EH Sg;
        private JSONObject YFl;
        private float tN;

        public C0124YFl Sg(float f10) {
            this.AlY = f10;
            return this;
        }

        @Override // com.bytedance.sdk.component.adexpress.Sg.GA.YFl
        /* renamed from: Sg, reason: merged with bridge method [inline-methods] */
        public YFl YFl() {
            return new YFl(this);
        }

        public C0124YFl YFl(JSONObject jSONObject) {
            this.YFl = jSONObject;
            return this;
        }

        public C0124YFl YFl(EH eh2) {
            this.Sg = eh2;
            return this;
        }

        public C0124YFl YFl(float f10) {
            this.tN = f10;
            return this;
        }
    }

    public YFl(C0124YFl c0124YFl) {
        super(c0124YFl);
        this.YFl = c0124YFl.YFl;
        this.Sg = c0124YFl.Sg;
        this.tN = c0124YFl.tN;
        this.AlY = c0124YFl.AlY;
    }

    public EH Cfr() {
        return this.Sg;
    }

    public float Ga() {
        return this.AlY;
    }

    public float YI() {
        return this.tN;
    }

    public JSONObject dXO() {
        return this.YFl;
    }
}

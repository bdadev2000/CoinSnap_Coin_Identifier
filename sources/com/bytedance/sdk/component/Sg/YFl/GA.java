package com.bytedance.sdk.component.Sg.YFl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class GA {
    public com.bytedance.sdk.component.tN.YFl.YFl Sg = new com.bytedance.sdk.component.tN.YFl.YFl();
    public eT YFl;

    /* loaded from: classes.dex */
    public static class YFl {
        String AlY;
        int DSW;
        Map<String, List<String>> Sg;
        com.bytedance.sdk.component.Sg.YFl.YFl YFl;
        String qsH;
        DSW tN;

        /* renamed from: vc, reason: collision with root package name */
        pDU f10331vc;
        Object wN;

        public YFl() {
            this.Sg = new HashMap();
        }

        public YFl Sg(String str) {
            return YFl(DSW.tN(str));
        }

        public YFl YFl(com.bytedance.sdk.component.Sg.YFl.YFl yFl) {
            this.YFl = yFl;
            return this;
        }

        public YFl Sg(String str, String str2) {
            if (!this.Sg.containsKey(str)) {
                this.Sg.put(str, new ArrayList());
            }
            this.Sg.get(str).add(str2);
            return this;
        }

        public YFl YFl(String str) {
            this.qsH = str;
            return this;
        }

        public YFl(GA ga2) {
            this.tN = ga2.Sg();
            this.AlY = ga2.tN();
            this.Sg = ga2.AlY();
            this.wN = ga2.YFl();
            this.f10331vc = ga2.qsH();
            this.YFl = ga2.wN();
            this.DSW = ga2.DSW();
            this.qsH = ga2.vc();
        }

        public YFl YFl(int i10) {
            this.DSW = i10;
            return this;
        }

        public YFl YFl(Object obj) {
            this.wN = obj;
            return this;
        }

        public GA Sg() {
            return new GA() { // from class: com.bytedance.sdk.component.Sg.YFl.GA.YFl.1
                @Override // com.bytedance.sdk.component.Sg.YFl.GA
                public Map AlY() {
                    return YFl.this.Sg;
                }

                @Override // com.bytedance.sdk.component.Sg.YFl.GA
                public int DSW() {
                    return YFl.this.DSW;
                }

                @Override // com.bytedance.sdk.component.Sg.YFl.GA
                public DSW Sg() {
                    return YFl.this.tN;
                }

                @Override // com.bytedance.sdk.component.Sg.YFl.GA
                public Object YFl() {
                    return YFl.this.wN;
                }

                @Override // com.bytedance.sdk.component.Sg.YFl.GA
                public pDU qsH() {
                    return YFl.this.f10331vc;
                }

                @Override // com.bytedance.sdk.component.Sg.YFl.GA
                public String tN() {
                    return YFl.this.AlY;
                }

                public String toString() {
                    return "";
                }

                @Override // com.bytedance.sdk.component.Sg.YFl.GA
                public String vc() {
                    return YFl.this.qsH;
                }

                @Override // com.bytedance.sdk.component.Sg.YFl.GA
                public com.bytedance.sdk.component.Sg.YFl.YFl wN() {
                    return YFl.this.YFl;
                }
            };
        }

        public YFl YFl(DSW dsw) {
            this.tN = dsw;
            return this;
        }

        public YFl YFl(String str, String str2) {
            return Sg(str, str2);
        }

        public YFl YFl() {
            return YFl("GET", (pDU) null);
        }

        private YFl YFl(String str, pDU pdu) {
            this.AlY = str;
            this.f10331vc = pdu;
            return this;
        }

        public YFl YFl(pDU pdu) {
            return YFl("POST", pdu);
        }
    }

    public abstract Map<String, List<String>> AlY();

    public abstract int DSW();

    public YFl NjR() {
        return new YFl(this);
    }

    public abstract DSW Sg();

    public abstract Object YFl();

    public void YFl(eT eTVar) {
        this.YFl = eTVar;
    }

    public pDU qsH() {
        return null;
    }

    public abstract String tN();

    public abstract String vc();

    public abstract com.bytedance.sdk.component.Sg.YFl.YFl wN();
}

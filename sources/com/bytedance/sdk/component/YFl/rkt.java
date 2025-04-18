package com.bytedance.sdk.component.YFl;

import android.text.TextUtils;
import vd.e;

/* loaded from: classes.dex */
public class rkt {
    public final String AlY;
    public final String DSW;
    public final String Sg;
    public final int YFl;
    public final String qsH;
    public final String tN;

    /* renamed from: vc, reason: collision with root package name */
    public final String f10346vc;
    public final String wN;

    /* loaded from: classes.dex */
    public static final class YFl {
        private String AlY;
        private String DSW;
        private String Sg;
        private String YFl;
        private String tN;

        /* renamed from: vc, reason: collision with root package name */
        private String f10347vc;
        private String wN;

        private YFl() {
        }

        public YFl AlY(String str) {
            this.AlY = str;
            return this;
        }

        public YFl DSW(String str) {
            this.DSW = str;
            return this;
        }

        public YFl Sg(String str) {
            this.Sg = str;
            return this;
        }

        public YFl YFl(String str) {
            this.YFl = str;
            return this;
        }

        public YFl tN(String str) {
            this.tN = str;
            return this;
        }

        public YFl vc(String str) {
            this.f10347vc = str;
            return this;
        }

        public YFl wN(String str) {
            this.wN = str;
            return this;
        }

        public rkt YFl() {
            return new rkt(this);
        }
    }

    public static YFl YFl() {
        return new YFl();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("methodName: ");
        sb2.append(this.AlY);
        sb2.append(", params: ");
        sb2.append(this.wN);
        sb2.append(", callbackId: ");
        sb2.append(this.f10346vc);
        sb2.append(", type: ");
        sb2.append(this.tN);
        sb2.append(", version: ");
        return e.h(sb2, this.Sg, ", ");
    }

    private rkt(String str, int i10) {
        this.Sg = null;
        this.tN = null;
        this.AlY = null;
        this.wN = null;
        this.f10346vc = str;
        this.DSW = null;
        this.YFl = i10;
        this.qsH = null;
    }

    public static rkt YFl(String str, int i10) {
        return new rkt(str, i10);
    }

    public static boolean YFl(rkt rktVar) {
        return rktVar == null || rktVar.YFl != 1 || TextUtils.isEmpty(rktVar.AlY) || TextUtils.isEmpty(rktVar.wN);
    }

    private rkt(YFl yFl) {
        this.Sg = yFl.YFl;
        this.tN = yFl.Sg;
        this.AlY = yFl.tN;
        this.wN = yFl.AlY;
        this.f10346vc = yFl.wN;
        this.DSW = yFl.f10347vc;
        this.YFl = 1;
        this.qsH = yFl.DSW;
    }
}

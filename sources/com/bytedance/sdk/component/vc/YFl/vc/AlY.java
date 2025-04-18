package com.bytedance.sdk.component.vc.YFl.vc;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public class AlY {
    private String DSW;
    private final String Sg;
    private final String YFl;
    private boolean eT;
    private String qsH;
    private final boolean tN;

    /* renamed from: vc, reason: collision with root package name */
    private final String f10468vc;
    private final int wN;
    private int AlY = -1;
    private int NjR = 0;

    /* renamed from: nc, reason: collision with root package name */
    private String f10467nc = null;

    public AlY(String str, String str2, boolean z10, int i10, String str3) {
        this.YFl = str;
        this.Sg = str2;
        this.tN = z10;
        this.wN = i10;
        this.f10468vc = str3;
    }

    public int AlY() {
        return this.AlY;
    }

    public String DSW() {
        return this.DSW;
    }

    public String NjR() {
        return this.qsH;
    }

    public String Sg() {
        return this.Sg;
    }

    public String YFl() {
        return this.YFl;
    }

    public boolean eT() {
        return this.AlY == -1;
    }

    public boolean nc() {
        return this.eT;
    }

    public int qsH() {
        return this.NjR;
    }

    public boolean tN() {
        return this.tN;
    }

    public String vc() {
        return this.f10468vc;
    }

    public int wN() {
        return this.wN;
    }

    public void Sg(int i10) {
        this.NjR = i10;
        if (i10 == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.DSW)) {
            this.DSW = String.valueOf(this.NjR);
            return;
        }
        this.DSW += "," + this.NjR;
    }

    public void YFl(int i10) {
        this.AlY = i10;
    }

    public void tN(String str) {
        this.f10467nc = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(this.qsH)) {
            this.qsH = String.valueOf(this.f10467nc);
            return;
        }
        this.qsH += "," + this.f10467nc;
    }

    public void YFl(String str) {
        this.DSW = str;
    }

    public void YFl(boolean z10) {
        this.eT = z10;
    }

    public Runnable YFl(String str, Map<String, String> map) {
        return YFl.YFl().YFl(this, str, map);
    }

    public void Sg(String str) {
        this.qsH = str;
    }
}

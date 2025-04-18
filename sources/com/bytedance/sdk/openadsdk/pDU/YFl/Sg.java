package com.bytedance.sdk.openadsdk.pDU.YFl;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.utils.Sco;

/* loaded from: classes.dex */
public class Sg {
    private int AlY;
    private int DSW;
    private Wwa Sg;
    private String YFl;
    private String tN;

    /* renamed from: vc, reason: collision with root package name */
    private String f10780vc;
    private boolean wN;
    private int qsH = 0;
    private int NjR = 0;

    public int AlY() {
        return this.AlY;
    }

    public int DSW() {
        return this.DSW;
    }

    public int NjR() {
        return this.NjR;
    }

    public Wwa Sg() {
        return this.Sg;
    }

    public String YFl() {
        return this.YFl;
    }

    public int qsH() {
        return this.qsH;
    }

    public String tN() {
        Wwa wwa;
        if (TextUtils.isEmpty(this.tN) && (wwa = this.Sg) != null) {
            this.tN = Sco.YFl(wwa);
        }
        return this.tN;
    }

    public String vc() {
        return this.f10780vc;
    }

    public boolean wN() {
        return this.wN;
    }

    public void AlY(int i10) {
        this.NjR = i10;
    }

    public void Sg(String str) {
        this.tN = str;
    }

    public void YFl(String str) {
        this.YFl = str;
    }

    public void Sg(int i10) {
        this.DSW = i10;
    }

    public void YFl(Wwa wwa) {
        this.Sg = wwa;
    }

    public void YFl(int i10) {
        this.AlY = i10;
    }

    public void YFl(boolean z10) {
        this.wN = z10;
    }

    public void tN(String str) {
        this.f10780vc = str;
    }

    public void tN(int i10) {
        this.qsH = i10;
    }
}

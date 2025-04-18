package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;

/* loaded from: classes.dex */
public class qsH implements Comparable<qsH> {
    private final int AlY;
    private final int DSW;
    private final String Sg;
    private final String YFl;
    private final String qsH;
    private final int tN;

    /* renamed from: vc, reason: collision with root package name */
    private final int f10746vc;
    private String wN;

    public qsH(String str, String str2, int i10, int i11, String str3, int i12, int i13, String str4) {
        this.YFl = str;
        this.Sg = str2;
        this.tN = i10;
        this.AlY = i11;
        this.wN = str3;
        if (TextUtils.isEmpty(str3)) {
            this.wN = "0";
        }
        this.f10746vc = i12;
        this.DSW = i13;
        this.qsH = str4;
    }

    public int YFl() {
        return this.f10746vc;
    }

    @Override // java.lang.Comparable
    /* renamed from: YFl, reason: merged with bridge method [inline-methods] */
    public int compareTo(qsH qsh) {
        if (this.f10746vc < qsh.YFl()) {
            return -1;
        }
        return this.f10746vc == qsh.YFl() ? 0 : 1;
    }
}

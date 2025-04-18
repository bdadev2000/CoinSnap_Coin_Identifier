package com.bytedance.adsdk.Sg;

import android.graphics.Bitmap;
import com.bytedance.component.sdk.annotation.RestrictTo;
import java.util.List;

/* loaded from: classes.dex */
public class nc {
    private final String AlY;
    private final List<YFl> DSW;
    private final int[][] NjR;
    private final int Sg;
    private final int YFl;

    /* renamed from: nc, reason: collision with root package name */
    private Bitmap f10184nc;
    private final String qsH;
    private final String tN;

    /* renamed from: vc, reason: collision with root package name */
    private final String f10185vc;
    private final String wN;

    /* loaded from: classes.dex */
    public static class YFl {
        public String AlY;
        public int Sg;
        public int YFl;
        public String tN;

        /* renamed from: vc, reason: collision with root package name */
        public int f10186vc;
        public int wN;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public nc(int i10, int i11, String str, String str2, String str3, String str4, List<YFl> list, String str5, int[][] iArr) {
        this.YFl = i10;
        this.Sg = i11;
        this.tN = str;
        this.AlY = str2;
        this.wN = str3;
        this.f10185vc = str4;
        this.DSW = list;
        this.qsH = str5;
        this.NjR = iArr;
    }

    public String AlY() {
        return this.f10185vc;
    }

    public String DSW() {
        return this.tN;
    }

    public String NjR() {
        return this.wN;
    }

    public int Sg() {
        return this.Sg;
    }

    public int YFl() {
        return this.YFl;
    }

    public Bitmap nc() {
        return this.f10184nc;
    }

    public String qsH() {
        return this.AlY;
    }

    public List<YFl> tN() {
        return this.DSW;
    }

    public int[][] vc() {
        return this.NjR;
    }

    public String wN() {
        return this.qsH;
    }

    public void YFl(Bitmap bitmap) {
        this.f10184nc = bitmap;
    }
}

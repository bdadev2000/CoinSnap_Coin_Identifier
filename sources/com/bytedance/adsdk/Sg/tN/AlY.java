package com.bytedance.adsdk.Sg.tN;

import com.bytedance.adsdk.Sg.tN.Sg.rkt;
import com.bytedance.component.sdk.annotation.RestrictTo;
import java.util.List;
import vd.e;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class AlY {
    private final double AlY;
    private final char Sg;
    private final List<rkt> YFl;
    private final double tN;

    /* renamed from: vc, reason: collision with root package name */
    private final String f10188vc;
    private final String wN;

    public AlY(List<rkt> list, char c10, double d10, double d11, String str, String str2) {
        this.YFl = list;
        this.Sg = c10;
        this.tN = d10;
        this.AlY = d11;
        this.wN = str;
        this.f10188vc = str2;
    }

    public static int YFl(char c10, String str, String str2) {
        return str2.hashCode() + e.c(str, c10 * 31, 31);
    }

    public double Sg() {
        return this.AlY;
    }

    public int hashCode() {
        return YFl(this.Sg, this.f10188vc, this.wN);
    }

    public List<rkt> YFl() {
        return this.YFl;
    }
}

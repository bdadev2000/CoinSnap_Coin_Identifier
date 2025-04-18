package com.bytedance.adsdk.Sg.tN;

import android.graphics.Typeface;
import com.bytedance.component.sdk.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class tN {
    private final float AlY;
    private final String Sg;
    private final String YFl;
    private final String tN;
    private Typeface wN;

    public tN(String str, String str2, String str3, float f10) {
        this.YFl = str;
        this.Sg = str2;
        this.tN = str3;
        this.AlY = f10;
    }

    public Typeface AlY() {
        return this.wN;
    }

    public String Sg() {
        return this.Sg;
    }

    public String YFl() {
        return this.YFl;
    }

    public String tN() {
        return this.tN;
    }

    public void YFl(Typeface typeface) {
        this.wN = typeface;
    }
}

package com.applovin.impl;

import android.text.SpannedString;
import com.applovin.impl.yb;

/* loaded from: classes.dex */
public class bj extends yb {
    public bj(String str) {
        super(yb.c.SECTION);
        this.f9168c = new SpannedString(str);
    }

    public String toString() {
        return "SectionListItemViewModel{text=" + ((Object) this.f9168c) + "}";
    }
}

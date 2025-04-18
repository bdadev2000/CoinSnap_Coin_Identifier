package com.applovin.impl;

import android.text.SpannedString;
import com.applovin.impl.dc;

/* loaded from: classes3.dex */
public class fj extends dc {
    public fj(String str) {
        super(dc.c.SECTION);
        this.f23448c = new SpannedString(str);
    }

    public String toString() {
        return "SectionListItemViewModel{text=" + ((Object) this.f23448c) + "}";
    }
}

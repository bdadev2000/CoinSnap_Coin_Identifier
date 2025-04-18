package com.bytedance.sdk.openadsdk.core.model;

import a4.j;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class NjR {
    public boolean YFl = true;
    public boolean Sg = true;
    public boolean tN = true;
    public boolean AlY = true;
    public boolean wN = true;

    /* renamed from: vc, reason: collision with root package name */
    public boolean f10684vc = true;

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ClickArea{clickUpperContentArea=");
        sb2.append(this.YFl);
        sb2.append(", clickUpperNonContentArea=");
        sb2.append(this.Sg);
        sb2.append(", clickLowerContentArea=");
        sb2.append(this.tN);
        sb2.append(", clickLowerNonContentArea=");
        sb2.append(this.AlY);
        sb2.append(", clickButtonArea=");
        sb2.append(this.wN);
        sb2.append(", clickVideoArea=");
        return j.l(sb2, this.f10684vc, AbstractJsonLexerKt.END_OBJ);
    }
}

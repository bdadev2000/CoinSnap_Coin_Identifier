package com.core.ar.model;

import G7.f;
import G7.j;
import androidx.annotation.Keep;
import x0.AbstractC2914a;

@Keep
/* loaded from: classes.dex */
public final class Tool {
    private final boolean isPremium;
    private final String name;
    private final int thumbId;

    public Tool(int i9, String str, boolean z8) {
        j.e(str, "name");
        this.thumbId = i9;
        this.name = str;
        this.isPremium = z8;
    }

    public static /* synthetic */ Tool copy$default(Tool tool, int i9, String str, boolean z8, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i9 = tool.thumbId;
        }
        if ((i10 & 2) != 0) {
            str = tool.name;
        }
        if ((i10 & 4) != 0) {
            z8 = tool.isPremium;
        }
        return tool.copy(i9, str, z8);
    }

    public final int component1() {
        return this.thumbId;
    }

    public final String component2() {
        return this.name;
    }

    public final boolean component3() {
        return this.isPremium;
    }

    public final Tool copy(int i9, String str, boolean z8) {
        j.e(str, "name");
        return new Tool(i9, str, z8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tool)) {
            return false;
        }
        Tool tool = (Tool) obj;
        return this.thumbId == tool.thumbId && j.a(this.name, tool.name) && this.isPremium == tool.isPremium;
    }

    public final String getName() {
        return this.name;
    }

    public final int getThumbId() {
        return this.thumbId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isPremium) + AbstractC2914a.b(Integer.hashCode(this.thumbId) * 31, 31, this.name);
    }

    public final boolean isPremium() {
        return this.isPremium;
    }

    public String toString() {
        return "Tool(thumbId=" + this.thumbId + ", name=" + this.name + ", isPremium=" + this.isPremium + ")";
    }

    public /* synthetic */ Tool(int i9, String str, boolean z8, int i10, f fVar) {
        this(i9, str, (i10 & 4) != 0 ? true : z8);
    }
}

package com.google.common.collect;

import java.util.Map;

/* loaded from: classes3.dex */
public abstract class c extends r {
    private static final long serialVersionUID = 6588350623831699109L;

    public c(Map map) {
        super(map);
    }

    @Override // com.google.common.collect.r1
    public final Map a() {
        Map map = this.f12037d;
        if (map == null) {
            Map d10 = d();
            this.f12037d = d10;
            return d10;
        }
        return map;
    }

    @Override // com.google.common.collect.u
    public final boolean equals(Object obj) {
        return super.equals(obj);
    }
}

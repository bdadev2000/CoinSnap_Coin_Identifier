package com.applovin.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.applovin.impl.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0687e extends AbstractC0692f implements ac {
    public AbstractC0687e(Map map) {
        super(map);
    }

    @Override // com.applovin.impl.AbstractC0702h, com.applovin.impl.pf
    public Map a() {
        return super.a();
    }

    @Override // com.applovin.impl.AbstractC0692f
    public Collection c(Collection collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // com.applovin.impl.AbstractC0702h
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.applovin.impl.AbstractC0692f, com.applovin.impl.pf
    public boolean put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }

    @Override // com.applovin.impl.AbstractC0692f
    public Collection a(Object obj, Collection collection) {
        return a(obj, (List) collection, null);
    }
}

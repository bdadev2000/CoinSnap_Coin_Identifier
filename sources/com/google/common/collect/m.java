package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes3.dex */
public class m extends g implements SortedMap {

    /* renamed from: g, reason: collision with root package name */
    public SortedSet f12001g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r f12002h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(r rVar, SortedMap sortedMap) {
        super(rVar, sortedMap);
        this.f12002h = rVar;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return f().comparator();
    }

    public SortedSet d() {
        return new n(this.f12002h, f());
    }

    @Override // com.google.common.collect.g, java.util.AbstractMap, java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f12001g;
        if (sortedSet == null) {
            SortedSet d10 = d();
            this.f12001g = d10;
            return d10;
        }
        return sortedSet;
    }

    public SortedMap f() {
        return (SortedMap) this.f11955d;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return f().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new m(this.f12002h, f().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return f().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new m(this.f12002h, f().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new m(this.f12002h, f().tailMap(obj));
    }
}

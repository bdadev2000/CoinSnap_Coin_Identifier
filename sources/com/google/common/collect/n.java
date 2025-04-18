package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes3.dex */
public class n extends i implements SortedSet {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r f12005f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(r rVar, SortedMap sortedMap) {
        super(rVar, sortedMap);
        this.f12005f = rVar;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.f11971c;
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return d().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new n(this.f12005f, d().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return d().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new n(this.f12005f, d().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new n(this.f12005f, d().tailMap(obj));
    }
}

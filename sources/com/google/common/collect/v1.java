package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes3.dex */
public final class v1 extends c {
    private static final long serialVersionUID = 0;

    /* renamed from: h, reason: collision with root package name */
    public transient ra.p f12045h;

    public v1(Map map, u1 u1Var) {
        super(map);
        this.f12045h = u1Var;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f12045h = (ra.p) objectInputStream.readObject();
        Map map = (Map) objectInputStream.readObject();
        this.f12024f = map;
        this.f12025g = 0;
        for (Collection collection : map.values()) {
            v8.u0.f(!collection.isEmpty());
            this.f12025g = collection.size() + this.f12025g;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f12045h);
        objectOutputStream.writeObject(this.f12024f);
    }

    @Override // com.google.common.collect.u
    public final Map d() {
        Map map = this.f12024f;
        if (map instanceof NavigableMap) {
            return new j(this, (NavigableMap) this.f12024f);
        }
        if (map instanceof SortedMap) {
            return new m(this, (SortedMap) this.f12024f);
        }
        return new g(this, this.f12024f);
    }

    @Override // com.google.common.collect.u
    public final Set e() {
        Map map = this.f12024f;
        if (map instanceof NavigableMap) {
            return new k(this, (NavigableMap) this.f12024f);
        }
        if (map instanceof SortedMap) {
            return new n(this, (SortedMap) this.f12024f);
        }
        return new i(this, this.f12024f);
    }
}

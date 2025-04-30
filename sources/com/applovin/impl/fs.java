package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class fs {

    /* renamed from: f, reason: collision with root package name */
    public static final fs f7759f = new fs();

    /* renamed from: a, reason: collision with root package name */
    private final fs f7760a;
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f7761c;

    /* renamed from: d, reason: collision with root package name */
    protected String f7762d;

    /* renamed from: e, reason: collision with root package name */
    protected final List f7763e;

    private fs() {
        this.f7760a = null;
        this.b = "";
        this.f7761c = Collections.emptyMap();
        this.f7762d = "";
        this.f7763e = Collections.emptyList();
    }

    public List a(String str) {
        if (str != null) {
            ArrayList arrayList = new ArrayList(this.f7763e.size());
            for (fs fsVar : this.f7763e) {
                if (str.equalsIgnoreCase(fsVar.c())) {
                    arrayList.add(fsVar);
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException("No name specified.");
    }

    public List b() {
        return Collections.unmodifiableList(this.f7763e);
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.f7762d;
    }

    public String toString() {
        return "XmlNode{elementName='" + this.b + "', text='" + this.f7762d + "', attributes=" + this.f7761c + '}';
    }

    public fs b(String str) {
        if (str != null) {
            if (this.f7763e.size() <= 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(this);
            while (!arrayList.isEmpty()) {
                fs fsVar = (fs) arrayList.get(0);
                arrayList.remove(0);
                if (str.equalsIgnoreCase(fsVar.c())) {
                    return fsVar;
                }
                arrayList.addAll(fsVar.b());
            }
            return null;
        }
        throw new IllegalArgumentException("No name specified.");
    }

    public fs c(String str) {
        if (str != null) {
            for (fs fsVar : this.f7763e) {
                if (str.equalsIgnoreCase(fsVar.c())) {
                    return fsVar;
                }
            }
            return null;
        }
        throw new IllegalArgumentException("No name specified.");
    }

    public Map a() {
        return this.f7761c;
    }

    public fs(String str, Map map, fs fsVar) {
        this.f7760a = fsVar;
        this.b = str;
        this.f7761c = Collections.unmodifiableMap(map);
        this.f7763e = new ArrayList();
    }
}

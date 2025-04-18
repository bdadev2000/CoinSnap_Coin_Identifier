package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class es {

    /* renamed from: f, reason: collision with root package name */
    public static final es f23752f = new es();

    /* renamed from: a, reason: collision with root package name */
    private final es f23753a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23754b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f23755c;
    protected String d;
    protected final List e;

    private es() {
        this.f23753a = null;
        this.f23754b = "";
        this.f23755c = Collections.emptyMap();
        this.d = "";
        this.e = Collections.emptyList();
    }

    public Map a() {
        return this.f23755c;
    }

    public List b() {
        return Collections.unmodifiableList(this.e);
    }

    public String c() {
        return this.f23754b;
    }

    public String d() {
        return this.d;
    }

    public String toString() {
        return "XmlNode{elementName='" + this.f23754b + "', text='" + this.d + "', attributes=" + this.f23755c + '}';
    }

    public List a(String str) {
        if (str != null) {
            ArrayList arrayList = new ArrayList(this.e.size());
            for (es esVar : this.e) {
                if (str.equalsIgnoreCase(esVar.c())) {
                    arrayList.add(esVar);
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException("No name specified.");
    }

    public es b(String str) {
        if (str != null) {
            if (this.e.size() <= 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(this);
            while (!arrayList.isEmpty()) {
                es esVar = (es) arrayList.get(0);
                arrayList.remove(0);
                if (str.equalsIgnoreCase(esVar.c())) {
                    return esVar;
                }
                arrayList.addAll(esVar.b());
            }
            return null;
        }
        throw new IllegalArgumentException("No name specified.");
    }

    public es c(String str) {
        if (str != null) {
            for (es esVar : this.e) {
                if (str.equalsIgnoreCase(esVar.c())) {
                    return esVar;
                }
            }
            return null;
        }
        throw new IllegalArgumentException("No name specified.");
    }

    public es(String str, Map map, es esVar) {
        this.f23753a = esVar;
        this.f23754b = str;
        this.f23755c = Collections.unmodifiableMap(map);
        this.e = new ArrayList();
    }
}

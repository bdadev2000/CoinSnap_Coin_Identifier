package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class fs {

    /* renamed from: f, reason: collision with root package name */
    public static final fs f4801f = new fs();
    private final fs a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4802b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f4803c;

    /* renamed from: d, reason: collision with root package name */
    protected String f4804d;

    /* renamed from: e, reason: collision with root package name */
    protected final List f4805e;

    private fs() {
        this.a = null;
        this.f4802b = "";
        this.f4803c = Collections.emptyMap();
        this.f4804d = "";
        this.f4805e = Collections.emptyList();
    }

    public List a(String str) {
        if (str != null) {
            ArrayList arrayList = new ArrayList(this.f4805e.size());
            for (fs fsVar : this.f4805e) {
                if (str.equalsIgnoreCase(fsVar.c())) {
                    arrayList.add(fsVar);
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException("No name specified.");
    }

    public List b() {
        return Collections.unmodifiableList(this.f4805e);
    }

    public String c() {
        return this.f4802b;
    }

    public String d() {
        return this.f4804d;
    }

    public String toString() {
        return "XmlNode{elementName='" + this.f4802b + "', text='" + this.f4804d + "', attributes=" + this.f4803c + AbstractJsonLexerKt.END_OBJ;
    }

    public fs b(String str) {
        if (str != null) {
            if (this.f4805e.size() <= 0) {
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
            for (fs fsVar : this.f4805e) {
                if (str.equalsIgnoreCase(fsVar.c())) {
                    return fsVar;
                }
            }
            return null;
        }
        throw new IllegalArgumentException("No name specified.");
    }

    public Map a() {
        return this.f4803c;
    }

    public fs(String str, Map map, fs fsVar) {
        this.a = fsVar;
        this.f4802b = str;
        this.f4803c = Collections.unmodifiableMap(map);
        this.f4805e = new ArrayList();
    }
}

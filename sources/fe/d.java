package fe;

import ge.n;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

/* loaded from: classes4.dex */
public abstract class d {
    public final HashSet a = new HashSet(5);

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f17819b = new HashSet(2);

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f17820c = new HashSet(4);

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f17821d = new HashSet(2);

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f17822e = new HashSet(15);

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f17823f = new HashSet(5);

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f17824g = new HashSet(4);

    /* renamed from: h, reason: collision with root package name */
    public final HashSet f17825h = new HashSet(3);

    /* renamed from: i, reason: collision with root package name */
    public final HashSet f17826i = new HashSet(2);

    /* renamed from: j, reason: collision with root package name */
    public final HashSet f17827j = new HashSet(2);

    /* renamed from: k, reason: collision with root package name */
    public boolean f17828k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f17829l;

    /* renamed from: m, reason: collision with root package name */
    public float f17830m;

    /* renamed from: n, reason: collision with root package name */
    public float f17831n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f17832o;

    /* renamed from: p, reason: collision with root package name */
    public float f17833p;

    /* renamed from: q, reason: collision with root package name */
    public float f17834q;

    public final boolean a(ge.c cVar) {
        Collection emptyList;
        Class<?> cls = cVar.getClass();
        if (cls.equals(ge.a.class)) {
            emptyList = Arrays.asList(ge.a.values());
        } else if (cls.equals(ge.f.class)) {
            emptyList = Collections.unmodifiableSet(this.f17819b);
        } else if (cls.equals(ge.g.class)) {
            emptyList = Collections.unmodifiableSet(this.f17820c);
        } else if (cls.equals(ge.h.class)) {
            emptyList = Arrays.asList(ge.h.values());
        } else if (cls.equals(ge.i.class)) {
            emptyList = Collections.unmodifiableSet(this.f17821d);
        } else if (cls.equals(ge.j.class)) {
            emptyList = Arrays.asList(ge.j.values());
        } else if (cls.equals(ge.m.class)) {
            emptyList = Arrays.asList(ge.m.values());
        } else if (cls.equals(ge.b.class)) {
            emptyList = Arrays.asList(ge.b.values());
        } else if (cls.equals(n.class)) {
            emptyList = Collections.unmodifiableSet(this.a);
        } else if (cls.equals(ge.e.class)) {
            emptyList = Arrays.asList(ge.e.values());
        } else if (cls.equals(ge.l.class)) {
            emptyList = Arrays.asList(ge.l.values());
        } else if (cls.equals(ge.k.class)) {
            emptyList = Collections.unmodifiableSet(this.f17826i);
        } else {
            emptyList = Collections.emptyList();
        }
        return emptyList.contains(cVar);
    }
}

package com.bykv.vk.openvk.preload.a;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: h, reason: collision with root package name */
    public String f9957h;
    public com.bykv.vk.openvk.preload.a.b.d a = com.bykv.vk.openvk.preload.a.b.d.a;

    /* renamed from: b, reason: collision with root package name */
    public s f9951b = s.DEFAULT;

    /* renamed from: c, reason: collision with root package name */
    public e f9952c = d.IDENTITY;

    /* renamed from: d, reason: collision with root package name */
    public final Map<Type, h<?>> f9953d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final List<u> f9954e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final List<u> f9955f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public boolean f9956g = false;

    /* renamed from: i, reason: collision with root package name */
    public int f9958i = 2;

    /* renamed from: j, reason: collision with root package name */
    public int f9959j = 2;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9960k = false;

    /* renamed from: l, reason: collision with root package name */
    public boolean f9961l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f9962m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f9963n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f9964o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9965p = false;

    public final g a(Type type, Object obj) {
        com.bykv.vk.openvk.preload.a.b.a.a(true);
        this.f9954e.add(com.bykv.vk.openvk.preload.a.b.a.n.a(com.bykv.vk.openvk.preload.a.c.a.a(type), (t) obj));
        return this;
    }
}

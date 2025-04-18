package com.applovin.impl;

import android.net.Uri;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class c6 implements o8 {

    /* renamed from: n, reason: collision with root package name */
    private static final int[] f23204n = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14};

    /* renamed from: o, reason: collision with root package name */
    private static final Constructor f23205o;

    /* renamed from: b, reason: collision with root package name */
    private boolean f23206b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f23207c;
    private int d;
    private int e;

    /* renamed from: f, reason: collision with root package name */
    private int f23208f;

    /* renamed from: g, reason: collision with root package name */
    private int f23209g;

    /* renamed from: h, reason: collision with root package name */
    private int f23210h;

    /* renamed from: i, reason: collision with root package name */
    private int f23211i;

    /* renamed from: j, reason: collision with root package name */
    private int f23212j;

    /* renamed from: l, reason: collision with root package name */
    private int f23214l;

    /* renamed from: k, reason: collision with root package name */
    private int f23213k = 1;

    /* renamed from: m, reason: collision with root package name */
    private int f23215m = 112800;

    static {
        Constructor constructor = null;
        try {
            if (Boolean.TRUE.equals(Class.forName("com.applovin.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                constructor = Class.forName("com.applovin.exoplayer2.ext.flac.FlacExtractor").asSubclass(k8.class).getConstructor(Integer.TYPE);
            }
        } catch (ClassNotFoundException unused) {
        } catch (Exception e) {
            throw new RuntimeException("Error instantiating FLAC extension", e);
        }
        f23205o = constructor;
    }

    private void a(int i2, List list) {
        switch (i2) {
            case 0:
                list.add(new i());
                return;
            case 1:
                list.add(new l());
                return;
            case 2:
                list.add(new j0((this.f23207c ? 2 : 0) | this.d | (this.f23206b ? 1 : 0)));
                return;
            case 3:
                list.add(new q0((this.f23207c ? 2 : 0) | this.e | (this.f23206b ? 1 : 0)));
                return;
            case 4:
                Constructor constructor = f23205o;
                if (constructor != null) {
                    try {
                        list.add((k8) constructor.newInstance(Integer.valueOf(this.f23208f)));
                        return;
                    } catch (Exception e) {
                        throw new IllegalStateException("Unexpected error creating FLAC extractor", e);
                    }
                }
                list.add(new v8(this.f23208f));
                return;
            case 5:
                list.add(new e9());
                return;
            case 6:
                list.add(new yc(this.f23209g));
                return;
            case 7:
                list.add(new of((this.f23207c ? 2 : 0) | this.f23212j | (this.f23206b ? 1 : 0)));
                return;
            case 8:
                list.add(new j9(this.f23211i));
                list.add(new pf(this.f23210h));
                return;
            case 9:
                list.add(new hg());
                return;
            case 10:
                list.add(new ii());
                return;
            case 11:
                list.add(new cp(this.f23213k, this.f23214l, this.f23215m));
                return;
            case 12:
                list.add(new lr());
                return;
            case 13:
            default:
                return;
            case 14:
                list.add(new yb());
                return;
        }
    }

    @Override // com.applovin.impl.o8
    public synchronized k8[] a() {
        return a(Uri.EMPTY, new HashMap());
    }

    @Override // com.applovin.impl.o8
    public synchronized k8[] a(Uri uri, Map map) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList(14);
            int a2 = q8.a(map);
            if (a2 != -1) {
                a(a2, arrayList);
            }
            int a3 = q8.a(uri);
            if (a3 != -1 && a3 != a2) {
                a(a3, arrayList);
            }
            for (int i2 : f23204n) {
                if (i2 != a2 && i2 != a3) {
                    a(i2, arrayList);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (k8[]) arrayList.toArray(new k8[arrayList.size()]);
    }
}

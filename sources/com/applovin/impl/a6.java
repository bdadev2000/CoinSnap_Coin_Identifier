package com.applovin.impl;

import android.net.Uri;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class a6 implements m8 {

    /* renamed from: n, reason: collision with root package name */
    private static final int[] f3572n = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14};

    /* renamed from: o, reason: collision with root package name */
    private static final Constructor f3573o;

    /* renamed from: b, reason: collision with root package name */
    private boolean f3574b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f3575c;

    /* renamed from: d, reason: collision with root package name */
    private int f3576d;

    /* renamed from: e, reason: collision with root package name */
    private int f3577e;

    /* renamed from: f, reason: collision with root package name */
    private int f3578f;

    /* renamed from: g, reason: collision with root package name */
    private int f3579g;

    /* renamed from: h, reason: collision with root package name */
    private int f3580h;

    /* renamed from: i, reason: collision with root package name */
    private int f3581i;

    /* renamed from: j, reason: collision with root package name */
    private int f3582j;

    /* renamed from: l, reason: collision with root package name */
    private int f3584l;

    /* renamed from: k, reason: collision with root package name */
    private int f3583k = 1;

    /* renamed from: m, reason: collision with root package name */
    private int f3585m = 112800;

    static {
        Constructor constructor = null;
        try {
            if (Boolean.TRUE.equals(Class.forName("com.applovin.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                constructor = Class.forName("com.applovin.exoplayer2.ext.flac.FlacExtractor").asSubclass(i8.class).getConstructor(Integer.TYPE);
            }
        } catch (ClassNotFoundException unused) {
        } catch (Exception e2) {
            throw new RuntimeException("Error instantiating FLAC extension", e2);
        }
        f3573o = constructor;
    }

    private void a(int i10, List list) {
        switch (i10) {
            case 0:
                list.add(new i());
                return;
            case 1:
                list.add(new l());
                return;
            case 2:
                list.add(new j0((this.f3575c ? 2 : 0) | this.f3576d | (this.f3574b ? 1 : 0)));
                return;
            case 3:
                list.add(new q0((this.f3575c ? 2 : 0) | this.f3577e | (this.f3574b ? 1 : 0)));
                return;
            case 4:
                Constructor constructor = f3573o;
                if (constructor != null) {
                    try {
                        list.add((i8) constructor.newInstance(Integer.valueOf(this.f3578f)));
                        return;
                    } catch (Exception e2) {
                        throw new IllegalStateException("Unexpected error creating FLAC extractor", e2);
                    }
                }
                list.add(new t8(this.f3578f));
                return;
            case 5:
                list.add(new c9());
                return;
            case 6:
                list.add(new tc(this.f3579g));
                return;
            case 7:
                list.add(new jf((this.f3575c ? 2 : 0) | this.f3582j | (this.f3574b ? 1 : 0)));
                return;
            case 8:
                list.add(new h9(this.f3581i));
                list.add(new kf(this.f3580h));
                return;
            case 9:
                list.add(new dg());
                return;
            case 10:
                list.add(new ei());
                return;
            case 11:
                list.add(new dp(this.f3583k, this.f3584l, this.f3585m));
                return;
            case 12:
                list.add(new mr());
                return;
            case 13:
            default:
                return;
            case 14:
                list.add(new tb());
                return;
        }
    }

    @Override // com.applovin.impl.m8
    public synchronized i8[] a() {
        return a(Uri.EMPTY, new HashMap());
    }

    @Override // com.applovin.impl.m8
    public synchronized i8[] a(Uri uri, Map map) {
        ArrayList arrayList;
        arrayList = new ArrayList(14);
        int a = o8.a(map);
        if (a != -1) {
            a(a, arrayList);
        }
        int a10 = o8.a(uri);
        if (a10 != -1 && a10 != a) {
            a(a10, arrayList);
        }
        for (int i10 : f3572n) {
            if (i10 != a && i10 != a10) {
                a(i10, arrayList);
            }
        }
        return (i8[]) arrayList.toArray(new i8[arrayList.size()]);
    }
}

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
    private static final int[] f6550n = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14};

    /* renamed from: o, reason: collision with root package name */
    private static final Constructor f6551o;
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6552c;

    /* renamed from: d, reason: collision with root package name */
    private int f6553d;

    /* renamed from: e, reason: collision with root package name */
    private int f6554e;

    /* renamed from: f, reason: collision with root package name */
    private int f6555f;

    /* renamed from: g, reason: collision with root package name */
    private int f6556g;

    /* renamed from: h, reason: collision with root package name */
    private int f6557h;

    /* renamed from: i, reason: collision with root package name */
    private int f6558i;

    /* renamed from: j, reason: collision with root package name */
    private int f6559j;
    private int l;

    /* renamed from: k, reason: collision with root package name */
    private int f6560k = 1;
    private int m = 112800;

    static {
        Constructor constructor = null;
        try {
            if (Boolean.TRUE.equals(Class.forName("com.applovin.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                constructor = Class.forName("com.applovin.exoplayer2.ext.flac.FlacExtractor").asSubclass(i8.class).getConstructor(Integer.TYPE);
            }
        } catch (ClassNotFoundException unused) {
        } catch (Exception e4) {
            throw new RuntimeException("Error instantiating FLAC extension", e4);
        }
        f6551o = constructor;
    }

    private void a(int i9, List list) {
        switch (i9) {
            case 0:
                list.add(new C0706i());
                return;
            case 1:
                list.add(new C0718l());
                return;
            case 2:
                list.add(new C0711j0((this.f6552c ? 2 : 0) | this.f6553d | (this.b ? 1 : 0)));
                return;
            case 3:
                list.add(new C0739q0((this.f6552c ? 2 : 0) | this.f6554e | (this.b ? 1 : 0)));
                return;
            case 4:
                Constructor constructor = f6551o;
                if (constructor != null) {
                    try {
                        list.add((i8) constructor.newInstance(Integer.valueOf(this.f6555f)));
                        return;
                    } catch (Exception e4) {
                        throw new IllegalStateException("Unexpected error creating FLAC extractor", e4);
                    }
                }
                list.add(new t8(this.f6555f));
                return;
            case 5:
                list.add(new c9());
                return;
            case 6:
                list.add(new tc(this.f6556g));
                return;
            case 7:
                list.add(new jf((this.f6552c ? 2 : 0) | this.f6559j | (this.b ? 1 : 0)));
                return;
            case 8:
                list.add(new h9(this.f6558i));
                list.add(new kf(this.f6557h));
                return;
            case 9:
                list.add(new dg());
                return;
            case 10:
                list.add(new ei());
                return;
            case 11:
                list.add(new dp(this.f6560k, this.l, this.m));
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
        try {
            arrayList = new ArrayList(14);
            int a6 = o8.a(map);
            if (a6 != -1) {
                a(a6, arrayList);
            }
            int a9 = o8.a(uri);
            if (a9 != -1 && a9 != a6) {
                a(a9, arrayList);
            }
            for (int i9 : f6550n) {
                if (i9 != a6 && i9 != a9) {
                    a(i9, arrayList);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (i8[]) arrayList.toArray(new i8[arrayList.size()]);
    }
}

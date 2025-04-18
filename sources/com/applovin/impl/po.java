package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.o2;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class po implements o2 {
    public static final po d = new po(new oo[0]);

    /* renamed from: f */
    public static final o2.a f26087f = new ru(1);

    /* renamed from: a */
    public final int f26088a;

    /* renamed from: b */
    private final oo[] f26089b;

    /* renamed from: c */
    private int f26090c;

    public po(oo... ooVarArr) {
        this.f26089b = ooVarArr;
        this.f26088a = ooVarArr.length;
    }

    public static /* synthetic */ po b(Bundle bundle) {
        return a(bundle);
    }

    public boolean a() {
        return this.f26088a == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || po.class != obj.getClass()) {
            return false;
        }
        po poVar = (po) obj;
        return this.f26088a == poVar.f26088a && Arrays.equals(this.f26089b, poVar.f26089b);
    }

    public int hashCode() {
        if (this.f26090c == 0) {
            this.f26090c = Arrays.hashCode(this.f26089b);
        }
        return this.f26090c;
    }

    private static String b(int i2) {
        return Integer.toString(i2, 36);
    }

    public oo a(int i2) {
        return this.f26089b[i2];
    }

    public int a(oo ooVar) {
        for (int i2 = 0; i2 < this.f26088a; i2++) {
            if (this.f26089b[i2] == ooVar) {
                return i2;
            }
        }
        return -1;
    }

    public static /* synthetic */ po a(Bundle bundle) {
        return new po((oo[]) p2.a(oo.d, bundle.getParcelableArrayList(b(0)), eb.h()).toArray(new oo[0]));
    }
}

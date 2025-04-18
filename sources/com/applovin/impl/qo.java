package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.m2;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class qo implements m2 {

    /* renamed from: d */
    public static final qo f7276d = new qo(new po[0]);

    /* renamed from: f */
    public static final m2.a f7277f = new lu(5);
    public final int a;

    /* renamed from: b */
    private final po[] f7278b;

    /* renamed from: c */
    private int f7279c;

    public qo(po... poVarArr) {
        this.f7278b = poVarArr;
        this.a = poVarArr.length;
    }

    public static /* synthetic */ qo b(Bundle bundle) {
        return a(bundle);
    }

    public po a(int i10) {
        return this.f7278b[i10];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qo.class != obj.getClass()) {
            return false;
        }
        qo qoVar = (qo) obj;
        if (this.a == qoVar.a && Arrays.equals(this.f7278b, qoVar.f7278b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.f7279c == 0) {
            this.f7279c = Arrays.hashCode(this.f7278b);
        }
        return this.f7279c;
    }

    private static String b(int i10) {
        return Integer.toString(i10, 36);
    }

    public int a(po poVar) {
        for (int i10 = 0; i10 < this.a; i10++) {
            if (this.f7278b[i10] == poVar) {
                return i10;
            }
        }
        return -1;
    }

    public boolean a() {
        return this.a == 0;
    }

    public static /* synthetic */ qo a(Bundle bundle) {
        return new qo((po[]) n2.a(po.f6992d, bundle.getParcelableArrayList(b(0)), ab.h()).toArray(new po[0]));
    }
}

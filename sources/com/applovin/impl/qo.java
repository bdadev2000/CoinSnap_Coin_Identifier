package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.InterfaceC0725m2;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class qo implements InterfaceC0725m2 {

    /* renamed from: d */
    public static final qo f10419d = new qo(new po[0]);

    /* renamed from: f */
    public static final InterfaceC0725m2.a f10420f = new C1(6);

    /* renamed from: a */
    public final int f10421a;
    private final po[] b;

    /* renamed from: c */
    private int f10422c;

    public qo(po... poVarArr) {
        this.b = poVarArr;
        this.f10421a = poVarArr.length;
    }

    public static /* synthetic */ qo b(Bundle bundle) {
        return a(bundle);
    }

    public po a(int i9) {
        return this.b[i9];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qo.class != obj.getClass()) {
            return false;
        }
        qo qoVar = (qo) obj;
        if (this.f10421a == qoVar.f10421a && Arrays.equals(this.b, qoVar.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.f10422c == 0) {
            this.f10422c = Arrays.hashCode(this.b);
        }
        return this.f10422c;
    }

    private static String b(int i9) {
        return Integer.toString(i9, 36);
    }

    public int a(po poVar) {
        for (int i9 = 0; i9 < this.f10421a; i9++) {
            if (this.b[i9] == poVar) {
                return i9;
            }
        }
        return -1;
    }

    public boolean a() {
        return this.f10421a == 0;
    }

    public static /* synthetic */ qo a(Bundle bundle) {
        return new qo((po[]) AbstractC0729n2.a(po.f10057d, bundle.getParcelableArrayList(b(0)), ab.h()).toArray(new po[0]));
    }
}

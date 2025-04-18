package com.applovin.impl;

/* loaded from: classes2.dex */
public final class wo {

    /* renamed from: a, reason: collision with root package name */
    public final int f27776a;

    /* renamed from: b, reason: collision with root package name */
    public final si[] f27777b;

    /* renamed from: c, reason: collision with root package name */
    public final h8[] f27778c;
    public final Object d;

    public wo(si[] siVarArr, h8[] h8VarArr, Object obj) {
        this.f27777b = siVarArr;
        this.f27778c = (h8[]) h8VarArr.clone();
        this.d = obj;
        this.f27776a = siVarArr.length;
    }

    public boolean a(wo woVar) {
        if (woVar == null || woVar.f27778c.length != this.f27778c.length) {
            return false;
        }
        for (int i2 = 0; i2 < this.f27778c.length; i2++) {
            if (!a(woVar, i2)) {
                return false;
            }
        }
        return true;
    }

    public boolean a(wo woVar, int i2) {
        return woVar != null && xp.a(this.f27777b[i2], woVar.f27777b[i2]) && xp.a(this.f27778c[i2], woVar.f27778c[i2]);
    }

    public boolean a(int i2) {
        return this.f27777b[i2] != null;
    }
}

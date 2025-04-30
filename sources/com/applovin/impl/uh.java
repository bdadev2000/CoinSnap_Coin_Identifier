package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import com.applovin.impl.y3;
import com.applovin.impl.yb;

/* loaded from: classes.dex */
public class uh extends yb {

    /* renamed from: n, reason: collision with root package name */
    private final y3.a f11612n;

    /* renamed from: o, reason: collision with root package name */
    private final Context f11613o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f11614p;

    public uh(y3.a aVar, boolean z8, Context context) {
        super(yb.c.RIGHT_DETAIL);
        this.f11612n = aVar;
        this.f11613o = context;
        this.f12370c = new SpannedString(aVar.a());
        this.f11614p = z8;
    }

    @Override // com.applovin.impl.yb
    public SpannedString f() {
        return new SpannedString(this.f11612n.a(this.f11613o));
    }

    @Override // com.applovin.impl.yb
    public boolean o() {
        return false;
    }

    @Override // com.applovin.impl.yb
    public boolean p() {
        Boolean b = this.f11612n.b(this.f11613o);
        if (b != null) {
            return b.equals(Boolean.valueOf(this.f11614p));
        }
        return false;
    }
}

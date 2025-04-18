package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import com.applovin.impl.y3;
import com.applovin.impl.yb;

/* loaded from: classes.dex */
public class uh extends yb {

    /* renamed from: n, reason: collision with root package name */
    private final y3.a f8398n;

    /* renamed from: o, reason: collision with root package name */
    private final Context f8399o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f8400p;

    public uh(y3.a aVar, boolean z10, Context context) {
        super(yb.c.RIGHT_DETAIL);
        this.f8398n = aVar;
        this.f8399o = context;
        this.f9168c = new SpannedString(aVar.a());
        this.f8400p = z10;
    }

    @Override // com.applovin.impl.yb
    public SpannedString f() {
        return new SpannedString(this.f8398n.a(this.f8399o));
    }

    @Override // com.applovin.impl.yb
    public boolean o() {
        return false;
    }

    @Override // com.applovin.impl.yb
    public boolean p() {
        Boolean b3 = this.f8398n.b(this.f8399o);
        if (b3 != null) {
            return b3.equals(Boolean.valueOf(this.f8400p));
        }
        return false;
    }
}

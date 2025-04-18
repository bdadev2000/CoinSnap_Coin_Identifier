package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.d6;
import com.applovin.impl.i5;

/* loaded from: classes2.dex */
public final class w5 implements i5.a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f27695a;

    /* renamed from: b, reason: collision with root package name */
    private final xo f27696b;

    /* renamed from: c, reason: collision with root package name */
    private final i5.a f27697c;

    public w5(Context context, xo xoVar, i5.a aVar) {
        this.f27695a = context.getApplicationContext();
        this.f27696b = xoVar;
        this.f27697c = aVar;
    }

    @Override // com.applovin.impl.i5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public v5 a() {
        v5 v5Var = new v5(this.f27695a, this.f27697c.a());
        xo xoVar = this.f27696b;
        if (xoVar != null) {
            v5Var.a(xoVar);
        }
        return v5Var;
    }

    public w5(Context context, String str) {
        this(context, str, (xo) null);
    }

    public w5(Context context, String str, xo xoVar) {
        this(context, xoVar, new d6.b().a(str));
    }
}

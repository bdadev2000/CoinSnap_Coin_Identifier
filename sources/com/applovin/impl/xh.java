package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import com.applovin.impl.a4;
import com.applovin.impl.dc;

/* loaded from: classes4.dex */
public class xh extends dc {

    /* renamed from: n, reason: collision with root package name */
    private final a4.a f27917n;

    /* renamed from: o, reason: collision with root package name */
    private final Context f27918o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f27919p;

    public xh(a4.a aVar, boolean z2, Context context) {
        super(dc.c.RIGHT_DETAIL);
        this.f27917n = aVar;
        this.f27918o = context;
        this.f23448c = new SpannedString(aVar.a());
        this.f27919p = z2;
    }

    @Override // com.applovin.impl.dc
    public SpannedString f() {
        return new SpannedString(this.f27917n.a(this.f27918o));
    }

    @Override // com.applovin.impl.dc
    public boolean o() {
        return false;
    }

    @Override // com.applovin.impl.dc
    public boolean p() {
        Boolean b2 = this.f27917n.b(this.f27918o);
        if (b2 != null) {
            return b2.equals(Boolean.valueOf(this.f27919p));
        }
        return false;
    }
}

package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.b6;
import com.applovin.impl.g5;

/* loaded from: classes.dex */
public final class u5 implements g5.a {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final yo f8351b;

    /* renamed from: c, reason: collision with root package name */
    private final g5.a f8352c;

    public u5(Context context, yo yoVar, g5.a aVar) {
        this.a = context.getApplicationContext();
        this.f8351b = yoVar;
        this.f8352c = aVar;
    }

    @Override // com.applovin.impl.g5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public t5 a() {
        t5 t5Var = new t5(this.a, this.f8352c.a());
        yo yoVar = this.f8351b;
        if (yoVar != null) {
            t5Var.a(yoVar);
        }
        return t5Var;
    }

    public u5(Context context, String str) {
        this(context, str, (yo) null);
    }

    public u5(Context context, String str, yo yoVar) {
        this(context, yoVar, new b6.b().a(str));
    }
}

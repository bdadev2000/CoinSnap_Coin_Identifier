package com.vungle.ads.internal.executor;

import com.vungle.ads.d2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class k extends Lambda implements Function0 {
    public static final k INSTANCE = new k();

    public k() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m24invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m24invoke() {
        new d2("submit callable error").logErrorNoReturnValue$vungle_ads_release();
    }
}

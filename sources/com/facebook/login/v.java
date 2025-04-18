package com.facebook.login;

import com.google.android.gms.tasks.OnSuccessListener;
import com.plantcare.ai.identifier.plantid.ui.component.main.MainActivity;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class v implements androidx.activity.result.b, OnSuccessListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f11307b;

    @Override // androidx.activity.result.b
    public final void a(Object obj) {
        int i10 = x.f11308h;
        Function1 tmp0 = this.f11307b;
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke((androidx.activity.result.a) obj);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        int i10 = MainActivity.f16644q;
        Function1 tmp0 = this.f11307b;
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }
}

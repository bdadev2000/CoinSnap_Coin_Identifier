package com.applovin.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.applovin.impl.InterfaceC0746s0;
import com.applovin.impl.cc;
import com.google.android.gms.tasks.OnSuccessListener;

/* loaded from: classes.dex */
public final /* synthetic */ class N1 implements cc.a, OnSuccessListener {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6441c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f6442d;

    public /* synthetic */ N1(int i9, Object obj, boolean z8) {
        this.b = i9;
        this.f6441c = obj;
        this.f6442d = z8;
    }

    @Override // com.applovin.impl.cc.a
    public void a(Object obj) {
        switch (this.b) {
            case 0:
                ((InterfaceC0746s0) obj).b((InterfaceC0746s0.a) this.f6441c, this.f6442d);
                return;
            case 1:
                ((InterfaceC0746s0) obj).a((InterfaceC0746s0.a) this.f6441c, this.f6442d);
                return;
            case 2:
                C0742r0.a((InterfaceC0746s0.a) this.f6441c, this.f6442d, (InterfaceC0746s0) obj);
                return;
            default:
                ((InterfaceC0746s0) obj).d((InterfaceC0746s0.a) this.f6441c, this.f6442d);
                return;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        SharedPreferences.Editor edit = y8.a.l((Context) this.f6441c).edit();
        edit.putBoolean("proxy_retention", this.f6442d);
        edit.apply();
    }
}

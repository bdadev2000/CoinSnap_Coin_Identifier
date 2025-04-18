package com.swordfish.libretrodroid;

import com.google.firebase.installations.FirebaseInstallations;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30121a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30122b;

    public /* synthetic */ c(Object obj, int i2) {
        this.f30121a = i2;
        this.f30122b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f30121a;
        Object obj = this.f30122b;
        switch (i2) {
            case 0:
                KtUtils.a((q0.a) obj);
                return;
            default:
                ((FirebaseInstallations) obj).lambda$getId$1();
                return;
        }
    }
}

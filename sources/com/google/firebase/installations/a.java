package com.google.firebase.installations;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28899a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseInstallations f28900b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f28901c;

    public /* synthetic */ a(FirebaseInstallations firebaseInstallations, boolean z2, int i2) {
        this.f28899a = i2;
        this.f28900b = firebaseInstallations;
        this.f28901c = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f28899a;
        boolean z2 = this.f28901c;
        FirebaseInstallations firebaseInstallations = this.f28900b;
        switch (i2) {
            case 0:
                FirebaseInstallations.c(firebaseInstallations, z2);
                return;
            default:
                FirebaseInstallations.d(firebaseInstallations, z2);
                return;
        }
    }
}

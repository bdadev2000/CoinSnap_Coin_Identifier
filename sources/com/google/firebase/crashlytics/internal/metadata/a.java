package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28883a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28884b;

    public /* synthetic */ a(Object obj, int i2) {
        this.f28883a = i2;
        this.f28884b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f28883a;
        Object obj = this.f28884b;
        switch (i2) {
            case 0:
                UserMetadata.SerializeableKeysMap.a((UserMetadata.SerializeableKeysMap) obj);
                return;
            default:
                UserMetadata.c((UserMetadata) obj);
                return;
        }
    }
}

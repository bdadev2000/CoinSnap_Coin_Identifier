package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.google.firebase.remoteconfig.internal.ConfigStorageClient;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final /* synthetic */ class h implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28878a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28879b;

    public /* synthetic */ h(Object obj, int i2) {
        this.f28878a = i2;
        this.f28879b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Boolean lambda$checkForPreviousCrash$10;
        Void deleteFirebaseInstallationId;
        int i2 = this.f28878a;
        Object obj = this.f28879b;
        switch (i2) {
            case 0:
                lambda$checkForPreviousCrash$10 = ((CrashlyticsCore) obj).lambda$checkForPreviousCrash$10();
                return lambda$checkForPreviousCrash$10;
            case 1:
                deleteFirebaseInstallationId = ((FirebaseInstallations) obj).deleteFirebaseInstallationId();
                return deleteFirebaseInstallationId;
            case 2:
                return ((RemoteConfigComponent) obj).getDefault();
            default:
                return ((ConfigStorageClient) obj).read();
        }
    }
}

package com.google.firebase;

import android.content.Context;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.heartbeatinfo.HeartBeatInfoStorage;
import com.google.firebase.inject.Provider;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Provider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28817a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f28818b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28819c;

    public /* synthetic */ a(Context context, String str) {
        this.f28818b = context;
        this.f28819c = str;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        HeartBeatInfoStorage lambda$new$2;
        int i2 = this.f28817a;
        Context context = this.f28818b;
        Object obj = this.f28819c;
        switch (i2) {
            case 0:
                return FirebaseApp.b((FirebaseApp) obj, context);
            default:
                lambda$new$2 = DefaultHeartBeatController.lambda$new$2(context, (String) obj);
                return lambda$new$2;
        }
    }

    public /* synthetic */ a(FirebaseApp firebaseApp, Context context) {
        this.f28819c = firebaseApp;
        this.f28818b = context;
    }
}

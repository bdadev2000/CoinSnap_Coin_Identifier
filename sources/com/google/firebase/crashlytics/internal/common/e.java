package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.settings.SettingsProvider;

/* loaded from: classes4.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28869a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CrashlyticsCore f28870b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SettingsProvider f28871c;

    public /* synthetic */ e(CrashlyticsCore crashlyticsCore, SettingsProvider settingsProvider, int i2) {
        this.f28869a = i2;
        this.f28870b = crashlyticsCore;
        this.f28871c = settingsProvider;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f28869a;
        SettingsProvider settingsProvider = this.f28871c;
        CrashlyticsCore crashlyticsCore = this.f28870b;
        switch (i2) {
            case 0:
                crashlyticsCore.lambda$finishInitSynchronously$9(settingsProvider);
                return;
            default:
                crashlyticsCore.lambda$doBackgroundInitializationAsync$0(settingsProvider);
                return;
        }
    }
}

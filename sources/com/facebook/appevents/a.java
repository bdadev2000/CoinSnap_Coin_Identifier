package com.facebook.appevents;

import com.facebook.appevents.codeless.CodelessManager;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28532a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f28533b;

    public /* synthetic */ a(String str, int i2) {
        this.f28532a = i2;
        this.f28533b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f28532a;
        String str = this.f28533b;
        switch (i2) {
            case 0:
                AnalyticsUserIDStore.a(str);
                return;
            default:
                CodelessManager.a(str);
                return;
        }
    }
}

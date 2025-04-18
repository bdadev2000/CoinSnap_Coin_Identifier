package com.facebook.appevents;

import com.facebook.appevents.suggestedevents.ViewOnClickListener;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28541a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f28542b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f28543c;

    public /* synthetic */ d(String str, String str2, int i2) {
        this.f28541a = i2;
        this.f28542b = str;
        this.f28543c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f28541a;
        String str = this.f28543c;
        String str2 = this.f28542b;
        switch (i2) {
            case 0:
                UserDataStore.a(str2, str);
                return;
            default:
                ViewOnClickListener.Companion.a(str2, str);
                return;
        }
    }
}

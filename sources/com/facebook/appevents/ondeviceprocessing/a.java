package com.facebook.appevents.ondeviceprocessing;

import android.content.Context;
import com.facebook.internal.FetchedAppGateKeepersManager;
import com.facebook.internal.FetchedAppSettingsManager;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28547a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f28548b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f28549c;
    public final /* synthetic */ String d;

    public /* synthetic */ a(int i2, Context context, String str, String str2) {
        this.f28547a = i2;
        this.f28549c = context;
        this.f28548b = str;
        this.d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f28547a;
        Context context = this.f28549c;
        String str = this.d;
        String str2 = this.f28548b;
        switch (i2) {
            case 0:
                OnDeviceProcessingManager.a(context, str2, str);
                return;
            case 1:
                FetchedAppGateKeepersManager.b(context, str2, str);
                return;
            default:
                FetchedAppSettingsManager.a(context, str2, str);
                return;
        }
    }

    public /* synthetic */ a(Context context, String str, String str2) {
        this.f28547a = 1;
        this.f28548b = str;
        this.f28549c = context;
        this.d = str2;
    }
}

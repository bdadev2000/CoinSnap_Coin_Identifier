package com.facebook;

import com.facebook.GraphRequest;
import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.AppEventQueue;
import com.facebook.appevents.FlushStatistics;
import com.facebook.appevents.SessionEventsState;
import com.facebook.login.DeviceAuthDialog;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements GraphRequest.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28529a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28530b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28531c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.f28529a = i2;
        this.f28530b = obj;
        this.f28531c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // com.facebook.GraphRequest.Callback
    public final void onCompleted(GraphResponse graphResponse) {
        int i2 = this.f28529a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f28531c;
        Object obj4 = this.f28530b;
        switch (i2) {
            case 0:
                AccessTokenManager.m412refreshCurrentAccessTokenImpl$lambda1((AtomicBoolean) obj4, (Set) obj3, (Set) obj2, (Set) obj, graphResponse);
                return;
            case 1:
                AppEventQueue.m437buildRequestForSession$lambda4((AccessTokenAppIdPair) obj4, (GraphRequest) obj3, (SessionEventsState) obj2, (FlushStatistics) obj, graphResponse);
                return;
            default:
                DeviceAuthDialog.m560onSuccess$lambda10((DeviceAuthDialog) obj4, (String) obj3, (Date) obj2, (Date) obj, graphResponse);
                return;
        }
    }
}

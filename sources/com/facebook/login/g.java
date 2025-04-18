package com.facebook.login;

import android.os.Bundle;
import android.util.Pair;
import androidx.activity.result.ActivityResultCallback;
import com.facebook.internal.PlatformServiceClient;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginManager;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements ActivityResultCallback, PlatformServiceClient.CompletedListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28617b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28618c;

    public /* synthetic */ g(Object obj, Object obj2) {
        this.f28617b = obj;
        this.f28618c = obj2;
    }

    @Override // com.facebook.internal.PlatformServiceClient.CompletedListener
    public final void completed(Bundle bundle) {
        GetTokenLoginMethodHandler.b((GetTokenLoginMethodHandler) this.f28617b, (LoginClient.Request) this.f28618c, bundle);
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public final void onActivityResult(Object obj) {
        LoginManager.AndroidxActivityResultRegistryOwnerStartActivityDelegate.m572startActivityForResult$lambda0((LoginManager.AndroidxActivityResultRegistryOwnerStartActivityDelegate) this.f28617b, (LoginManager$AndroidxActivityResultRegistryOwnerStartActivityDelegate$startActivityForResult$LauncherHolder) this.f28618c, (Pair) obj);
    }
}

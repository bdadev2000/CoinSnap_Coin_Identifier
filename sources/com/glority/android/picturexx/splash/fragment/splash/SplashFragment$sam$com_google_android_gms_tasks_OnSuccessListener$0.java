package com.glority.android.picturexx.splash.fragment.splash;

import com.google.android.gms.tasks.OnSuccessListener;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SplashFragment.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
final class SplashFragment$sam$com_google_android_gms_tasks_OnSuccessListener$0 implements OnSuccessListener {
    private final /* synthetic */ Function1 function;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SplashFragment$sam$com_google_android_gms_tasks_OnSuccessListener$0(Function1 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.function = function;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* synthetic */ void onSuccess(Object obj) {
        this.function.invoke(obj);
    }
}

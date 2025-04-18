package com.facebook.appevents;

import android.content.Context;
import android.text.Editable;
import androidx.activity.result.ActivityResultCallback;
import com.facebook.CallbackManager;
import com.facebook.appevents.internal.ActivityLifecycleTracker;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.InstrumentManager;
import com.facebook.login.widget.LoginButton;
import com.google.android.datatransport.Transformer;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.material.carousel.MaskableFrameLayout;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements FeatureManager.Callback, ActivityResultCallback, ShapeAppearanceModel.CornerSizeUnaryOperator, TextInputLayout.LengthCounter, LibraryVersionComponent.VersionExtractor, Transformer, SuccessContinuation {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28537b;

    public /* synthetic */ c(int i2) {
        this.f28537b = i2;
    }

    @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
    public final CornerSize apply(CornerSize cornerSize) {
        return MaskableFrameLayout.b(cornerSize);
    }

    @Override // com.google.android.material.textfield.TextInputLayout.LengthCounter
    public final int countLength(Editable editable) {
        int lambda$new$0;
        lambda$new$0 = TextInputLayout.lambda$new$0(editable);
        return lambda$new$0;
    }

    @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
    public final String extract(Object obj) {
        Context context = (Context) obj;
        switch (this.f28537b) {
            case 14:
                return FirebaseCommonRegistrar.b(context);
            case 15:
                return FirebaseCommonRegistrar.c(context);
            case 16:
                return FirebaseCommonRegistrar.d(context);
            default:
                return FirebaseCommonRegistrar.a(context);
        }
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public final void onActivityResult(Object obj) {
        LoginButton.m577onAttachedToWindow$lambda0((CallbackManager.ActivityResultParameters) obj);
    }

    @Override // com.facebook.internal.FeatureManager.Callback
    public final void onCompleted(boolean z2) {
        switch (this.f28537b) {
            case 0:
                AppEventsManager$start$1.m448onSuccess$lambda3(z2);
                return;
            case 1:
                AppEventsManager$start$1.m449onSuccess$lambda4(z2);
                return;
            case 2:
                AppEventsManager$start$1.m450onSuccess$lambda5(z2);
                return;
            case 3:
                AppEventsManager$start$1.m451onSuccess$lambda6(z2);
                return;
            case 4:
                AppEventsManager$start$1.m452onSuccess$lambda7(z2);
                return;
            case 5:
                AppEventsManager$start$1.m453onSuccess$lambda8(z2);
                return;
            case 6:
                AppEventsManager$start$1.m454onSuccess$lambda9(z2);
                return;
            case 7:
                ActivityLifecycleTracker.m479startTracking$lambda0(z2);
                return;
            case 8:
                InstrumentManager.a(z2);
                return;
            case 9:
                InstrumentManager.c(z2);
                return;
            default:
                InstrumentManager.b(z2);
                return;
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        Task lambda$setDefaultsWithStringsMapAsync$7;
        Task lambda$fetch$4;
        Task lambda$fetch$3;
        switch (this.f28537b) {
            case 19:
                lambda$setDefaultsWithStringsMapAsync$7 = FirebaseRemoteConfig.lambda$setDefaultsWithStringsMapAsync$7((ConfigContainer) obj);
                return lambda$setDefaultsWithStringsMapAsync$7;
            case 20:
                lambda$fetch$4 = FirebaseRemoteConfig.lambda$fetch$4((ConfigFetchHandler.FetchResponse) obj);
                return lambda$fetch$4;
            default:
                lambda$fetch$3 = FirebaseRemoteConfig.lambda$fetch$3((ConfigFetchHandler.FetchResponse) obj);
                return lambda$fetch$3;
        }
    }

    @Override // com.google.android.datatransport.Transformer
    public final Object apply(Object obj) {
        return DataTransportCrashlyticsReportSender.a((CrashlyticsReport) obj);
    }
}

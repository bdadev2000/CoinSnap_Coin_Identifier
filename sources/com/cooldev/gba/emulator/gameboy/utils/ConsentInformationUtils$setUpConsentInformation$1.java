package com.cooldev.gba.emulator.gameboy.utils;

import android.app.Activity;
import android.util.Log;
import b1.d0;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.utils.ConsentInformationUtils$setUpConsentInformation$1", f = "ConsentInformationUtils.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ConsentInformationUtils$setUpConsentInformation$1 extends i implements p {
    final /* synthetic */ ConsentRequestParameters $params;
    int label;
    final /* synthetic */ ConsentInformationUtils this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsentInformationUtils$setUpConsentInformation$1(ConsentInformationUtils consentInformationUtils, ConsentRequestParameters consentRequestParameters, g gVar) {
        super(2, gVar);
        this.this$0 = consentInformationUtils;
        this.$params = consentRequestParameters;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1(final ConsentInformationUtils consentInformationUtils) {
        Activity activity;
        activity = consentInformationUtils.activity;
        UserMessagingPlatform.loadAndShowConsentFormIfRequired(activity, new ConsentForm.OnConsentFormDismissedListener() { // from class: com.cooldev.gba.emulator.gameboy.utils.b
            @Override // com.google.android.ump.ConsentForm.OnConsentFormDismissedListener
            public final void onConsentFormDismissed(FormError formError) {
                ConsentInformationUtils$setUpConsentInformation$1.invokeSuspend$lambda$1$lambda$0(ConsentInformationUtils.this, formError);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1$lambda$0(ConsentInformationUtils consentInformationUtils, FormError formError) {
        ConsentInformation consentInformation;
        if (formError != null) {
            Log.w("Consent", "Error showing consent form: " + formError.getMessage());
        } else {
            Log.d("Consent", "Consent form loaded successfully");
        }
        consentInformation = consentInformationUtils.consentInformation;
        if (consentInformation == null) {
            p0.a.B0("consentInformation");
            throw null;
        }
        if (consentInformation.canRequestAds()) {
            consentInformationUtils.initializeMobileAdsSdk();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$2(FormError formError) {
        Log.e("Consent", "Error requesting consent info: " + formError.getMessage());
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new ConsentInformationUtils$setUpConsentInformation$1(this.this$0, this.$params, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((ConsentInformationUtils$setUpConsentInformation$1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.ump.ConsentInformation$OnConsentInfoUpdateFailureListener, java.lang.Object] */
    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        ConsentInformation consentInformation;
        Activity activity;
        i0.a aVar = i0.a.f30806a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        q.m(obj);
        consentInformation = this.this$0.consentInformation;
        if (consentInformation == 0) {
            p0.a.B0("consentInformation");
            throw null;
        }
        activity = this.this$0.activity;
        ConsentRequestParameters consentRequestParameters = this.$params;
        final ConsentInformationUtils consentInformationUtils = this.this$0;
        consentInformation.requestConsentInfoUpdate(activity, consentRequestParameters, new ConsentInformation.OnConsentInfoUpdateSuccessListener() { // from class: com.cooldev.gba.emulator.gameboy.utils.c
            @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener
            public final void onConsentInfoUpdateSuccess() {
                ConsentInformationUtils$setUpConsentInformation$1.invokeSuspend$lambda$1(ConsentInformationUtils.this);
            }
        }, new Object());
        return b0.f30125a;
    }
}

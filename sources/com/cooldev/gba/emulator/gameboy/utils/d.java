package com.cooldev.gba.emulator.gameboy.utils;

import com.google.android.ump.ConsentInformation;
import com.google.android.ump.FormError;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements ConsentInformation.OnConsentInfoUpdateFailureListener {
    @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener
    public final void onConsentInfoUpdateFailure(FormError formError) {
        ConsentInformationUtils$setUpConsentInformation$1.invokeSuspend$lambda$2(formError);
    }
}

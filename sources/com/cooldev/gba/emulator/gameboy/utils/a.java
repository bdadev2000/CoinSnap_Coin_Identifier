package com.cooldev.gba.emulator.gameboy.utils;

import android.util.Log;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements OnInitializationCompleteListener {
    @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
    public final void onInitializationComplete(InitializationStatus initializationStatus) {
        Log.d("Consent", "Google Mobile Ads SDK initialized");
    }
}

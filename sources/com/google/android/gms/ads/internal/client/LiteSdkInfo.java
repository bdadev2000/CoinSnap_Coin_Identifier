package com.google.android.gms.ads.internal.client;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbph;
import com.google.android.gms.internal.ads.zzbpl;

@KeepForSdk
/* loaded from: classes.dex */
public class LiteSdkInfo extends zzcv {
    public LiteSdkInfo(@NonNull Context context) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcw
    public zzbpl getAdapterCreator() {
        return new zzbph();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcw
    public zzfc getLiteSdkVersion() {
        return new zzfc(ModuleDescriptor.MODULE_VERSION, 243220000, "23.4.0");
    }
}

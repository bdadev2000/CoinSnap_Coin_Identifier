package com.google.android.gms.ads.internal.client;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbrb;
import com.google.android.gms.internal.ads.zzbrf;

@KeepForSdk
/* loaded from: classes2.dex */
public class LiteSdkInfo extends zzck {
    public LiteSdkInfo(@NonNull Context context) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcl
    public zzbrf getAdapterCreator() {
        return new zzbrb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcl
    public zzen getLiteSdkVersion() {
        return new zzen(ModuleDescriptor.MODULE_VERSION, 241806000, "23.2.0");
    }
}

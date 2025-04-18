package com.google.android.gms.ads.internal.client;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbpc;
import com.google.android.gms.internal.ads.zzbpg;

@KeepForSdk
/* loaded from: classes3.dex */
public class LiteSdkInfo extends zzcv {
    public LiteSdkInfo(@NonNull Context context) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcw
    public zzbpg getAdapterCreator() {
        return new zzbpc();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcw
    public zzfb getLiteSdkVersion() {
        return new zzfb(ModuleDescriptor.MODULE_VERSION, 243799000, "23.5.0");
    }
}

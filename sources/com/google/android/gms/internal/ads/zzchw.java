package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.net.Uri;

/* loaded from: classes3.dex */
public final class zzchw implements zzhfx {
    public zzchw(zzchn zzchnVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* synthetic */ Object zzb() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage("com.android.vending");
        intent.setData(Uri.parse("https://play.google.com/d"));
        return intent;
    }
}

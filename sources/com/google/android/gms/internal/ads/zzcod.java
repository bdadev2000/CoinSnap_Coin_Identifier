package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.facebook.internal.ServerProtocol;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzcod implements zzcnf {
    private final zzdxb zza;

    public zzcod(zzdxb zzdxbVar) {
        this.zza = zzdxbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcnf
    public final void zza(Map map) {
        String str = (String) map.get("test_mode_enabled");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.zza.zzo(str.equals(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE));
    }
}

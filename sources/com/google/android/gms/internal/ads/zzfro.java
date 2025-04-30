package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;

@ShowFirstParty
/* loaded from: classes2.dex */
public final class zzfro {
    public static zzftb zza(Context context, int i9, zzazw zzazwVar, String str, String str2, String str3, zzfre zzfreVar) {
        return new zzfrn(context, 1, zzazwVar, str, str2, "1", zzfreVar).zzb(DefaultLoadControl.DEFAULT_MAX_BUFFER_MS);
    }
}

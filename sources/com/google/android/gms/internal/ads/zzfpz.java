package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;

@ShowFirstParty
/* loaded from: classes3.dex */
public final class zzfpz {
    public static zzfri zza(Context context, int i10, int i11, String str, String str2, String str3, zzfpp zzfppVar) {
        return new zzfpy(context, 1, i11, str, str2, "1", zzfppVar).zza(DefaultLoadControl.DEFAULT_MAX_BUFFER_MS);
    }
}

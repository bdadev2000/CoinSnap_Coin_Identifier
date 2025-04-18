package com.google.android.gms.internal.ads;

import android.content.Context;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
/* loaded from: classes4.dex */
public final class zzfrj {
    public static zzfss zza(Context context, int i2, int i3, String str, String str2, String str3, zzfqz zzfqzVar) {
        return new zzfri(context, 1, i3, str, str2, AppEventsConstants.EVENT_PARAM_VALUE_YES, zzfqzVar).zza(50000);
    }
}

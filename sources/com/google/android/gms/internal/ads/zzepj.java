package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class zzepj implements zzevy {
    final ArrayList zza;

    public zzepj(ArrayList arrayList) {
        this.zza = arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzevy
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        ((Bundle) obj).putStringArrayList("android_permissions", this.zza);
    }
}

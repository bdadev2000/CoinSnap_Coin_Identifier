package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.Spanned;
import androidx.annotation.Nullable;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzel {
    private static final String zza = Integer.toString(0, 36);
    private static final String zzb = Integer.toString(1, 36);
    private static final String zzc = Integer.toString(2, 36);
    private static final String zzd = Integer.toString(3, 36);
    private static final String zze = Integer.toString(4, 36);

    public static ArrayList zza(Spanned spanned) {
        ArrayList arrayList = new ArrayList();
        for (zzen zzenVar : (zzen[]) spanned.getSpans(0, spanned.length(), zzen.class)) {
            arrayList.add(zzb(spanned, zzenVar, 1, zzenVar.zza()));
        }
        for (zzep zzepVar : (zzep[]) spanned.getSpans(0, spanned.length(), zzep.class)) {
            arrayList.add(zzb(spanned, zzepVar, 2, zzepVar.zza()));
        }
        for (zzem zzemVar : (zzem[]) spanned.getSpans(0, spanned.length(), zzem.class)) {
            arrayList.add(zzb(spanned, zzemVar, 3, null));
        }
        return arrayList;
    }

    private static Bundle zzb(Spanned spanned, Object obj, int i9, @Nullable Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(zza, spanned.getSpanStart(obj));
        bundle2.putInt(zzb, spanned.getSpanEnd(obj));
        bundle2.putInt(zzc, spanned.getSpanFlags(obj));
        bundle2.putInt(zzd, i9);
        if (bundle != null) {
            bundle2.putBundle(zze, bundle);
        }
        return bundle2;
    }
}

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.Spanned;
import androidx.annotation.Nullable;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzcv {
    private static final String zza = Integer.toString(0, 36);
    private static final String zzb = Integer.toString(1, 36);
    private static final String zzc = Integer.toString(2, 36);
    private static final String zzd = Integer.toString(3, 36);
    private static final String zze = Integer.toString(4, 36);

    public static ArrayList zza(Spanned spanned) {
        ArrayList arrayList = new ArrayList();
        for (zzcx zzcxVar : (zzcx[]) spanned.getSpans(0, spanned.length(), zzcx.class)) {
            arrayList.add(zzb(spanned, zzcxVar, 1, zzcxVar.zza()));
        }
        for (zzcz zzczVar : (zzcz[]) spanned.getSpans(0, spanned.length(), zzcz.class)) {
            arrayList.add(zzb(spanned, zzczVar, 2, zzczVar.zza()));
        }
        for (zzcw zzcwVar : (zzcw[]) spanned.getSpans(0, spanned.length(), zzcw.class)) {
            arrayList.add(zzb(spanned, zzcwVar, 3, null));
        }
        for (zzda zzdaVar : (zzda[]) spanned.getSpans(0, spanned.length(), zzda.class)) {
            arrayList.add(zzb(spanned, zzdaVar, 4, zzdaVar.zza()));
        }
        return arrayList;
    }

    private static Bundle zzb(Spanned spanned, Object obj, int i10, @Nullable Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(zza, spanned.getSpanStart(obj));
        bundle2.putInt(zzb, spanned.getSpanEnd(obj));
        bundle2.putInt(zzc, spanned.getSpanFlags(obj));
        bundle2.putInt(zzd, i10);
        if (bundle != null) {
            bundle2.putBundle(zze, bundle);
        }
        return bundle2;
    }
}

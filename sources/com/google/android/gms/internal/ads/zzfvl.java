package com.google.android.gms.internal.ads;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes2.dex */
public final class zzfvl {
    public static final int zza = 67108864;
    public static final ClipData zzb = ClipData.newIntent("", new Intent());

    public static PendingIntent zza(Context context, int i9, Intent intent, int i10) {
        return PendingIntent.getActivity(context, 0, zzc(intent, 201326592, 0), 201326592);
    }

    public static PendingIntent zzb(Context context, int i9, Intent intent, int i10, int i11) {
        return PendingIntent.getService(context, 0, zzc(intent, i10, 0), i10);
    }

    private static Intent zzc(Intent intent, int i9, int i10) {
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if ((i9 & 88) == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzfyg.zzf(z8, "Cannot set any dangerous parts of intent to be mutable.");
        if ((i9 & 1) == 0 || zzd(0, 3)) {
            z9 = true;
        } else {
            z9 = false;
        }
        zzfyg.zzf(z9, "Cannot use Intent.FILL_IN_ACTION unless the action is marked as mutable.");
        if ((i9 & 2) == 0 || zzd(0, 5)) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzfyg.zzf(z10, "Cannot use Intent.FILL_IN_DATA unless the data is marked as mutable.");
        if ((i9 & 4) == 0 || zzd(0, 9)) {
            z11 = true;
        } else {
            z11 = false;
        }
        zzfyg.zzf(z11, "Cannot use Intent.FILL_IN_CATEGORIES unless the category is marked as mutable.");
        if ((i9 & 128) == 0 || zzd(0, 17)) {
            z12 = true;
        } else {
            z12 = false;
        }
        zzfyg.zzf(z12, "Cannot use Intent.FILL_IN_CLIP_DATA unless the clip data is marked as mutable.");
        if (intent.getComponent() != null) {
            z13 = true;
        } else {
            z13 = false;
        }
        zzfyg.zzf(z13, "Must set component on Intent.");
        if (zzd(0, 1)) {
            zzfyg.zzf(!zzd(i9, 67108864), "Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.");
        } else {
            zzfyg.zzf(zzd(i9, 67108864), "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.");
        }
        Intent intent2 = new Intent(intent);
        if (!zzd(i9, 67108864)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!zzd(0, 3) && intent2.getAction() == null) {
                intent2.setAction("");
            }
            if (!zzd(0, 9) && intent2.getCategories() == null) {
                intent2.addCategory("");
            }
            if (!zzd(0, 5) && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!zzd(0, 17) && intent2.getClipData() == null) {
                intent2.setClipData(zzb);
            }
        }
        return intent2;
    }

    private static boolean zzd(int i9, int i10) {
        return (i9 & i10) == i10;
    }
}

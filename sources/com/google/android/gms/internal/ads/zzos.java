package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.net.Uri;
import android.provider.Settings;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzos {

    @VisibleForTesting
    static final zzgba zzb;
    private final SparseArray zzd;
    private final int zze;
    public static final zzos zza = new zzos(zzgax.zzo(zzoq.zza));

    @SuppressLint({"InlinedApi"})
    private static final zzgax zzc = zzgax.zzq(2, 5, 6);

    static {
        zzgaz zzgazVar = new zzgaz();
        zzgazVar.zza(5, 6);
        zzgazVar.zza(17, 6);
        zzgazVar.zza(7, 6);
        zzgazVar.zza(30, 10);
        zzgazVar.zza(18, 6);
        zzgazVar.zza(6, 8);
        zzgazVar.zza(8, 8);
        zzgazVar.zza(14, 8);
        zzb = zzgazVar.zzc();
    }

    @Nullable
    public static Uri zza() {
        if (zzf()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    @SuppressLint({"UnprotectedReceiver"})
    public static zzos zzc(Context context, zzh zzhVar, @Nullable zzpa zzpaVar) {
        return zzd(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), zzhVar, zzpaVar);
    }

    @SuppressLint({"InlinedApi"})
    public static zzos zzd(Context context, @Nullable Intent intent, zzh zzhVar, @Nullable zzpa zzpaVar) {
        Object systemService = context.getSystemService("audio");
        systemService.getClass();
        AudioManager audioManager = (AudioManager) systemService;
        if (zzpaVar == null) {
            zzpaVar = zzeu.zza >= 33 ? zzop.zzb(audioManager, zzhVar) : null;
        }
        int i2 = zzeu.zza;
        if (i2 >= 33 && (zzeu.zzL(context) || zzeu.zzH(context))) {
            return zzop.zza(audioManager, zzhVar);
        }
        if (i2 >= 23 && zzon.zza(audioManager, zzpaVar)) {
            return zza;
        }
        zzgbb zzgbbVar = new zzgbb();
        zzgbbVar.zzf((Object) 2);
        if (i2 >= 29 && (zzeu.zzL(context) || zzeu.zzH(context))) {
            zzgbbVar.zzh(zzoo.zzb(zzhVar));
            return new zzos(zze(zzgdu.zzh(zzgbbVar.zzi()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z2 = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if ((z2 || zzf()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            zzgbbVar.zzh(zzc);
        }
        if (intent == null || z2 || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new zzos(zze(zzgdu.zzh(zzgbbVar.zzi()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            zzgbbVar.zzh(zzgdu.zzg(intArrayExtra));
        }
        return new zzos(zze(zzgdu.zzh(zzgbbVar.zzi()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    private static zzgax zze(@Nullable int[] iArr, int i2) {
        zzgau zzgauVar = new zzgau();
        for (int i3 : iArr) {
            zzgauVar.zzf(new zzoq(i3, i2));
        }
        return zzgauVar.zzi();
    }

    private static boolean zzf() {
        String str = zzeu.zzc;
        return "Amazon".equals(str) || "Xiaomi".equals(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001a, code lost:
    
        if (r1 != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(@androidx.annotation.Nullable java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            boolean r1 = r9 instanceof com.google.android.gms.internal.ads.zzos
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.internal.ads.zzos r9 = (com.google.android.gms.internal.ads.zzos) r9
            android.util.SparseArray r1 = r8.zzd
            android.util.SparseArray r3 = r9.zzd
            int r4 = com.google.android.gms.internal.ads.zzeu.zza
            r5 = 31
            if (r4 < r5) goto L1d
            boolean r1 = com.google.android.gms.internal.ads.c.x(r1, r3)
            if (r1 == 0) goto L46
            goto L3f
        L1d:
            int r4 = r1.size()
            int r5 = r3.size()
            if (r4 != r5) goto L46
            r5 = r2
        L28:
            if (r5 >= r4) goto L3f
            int r6 = r1.keyAt(r5)
            java.lang.Object r7 = r1.valueAt(r5)
            java.lang.Object r6 = r3.get(r6)
            boolean r6 = java.util.Objects.equals(r7, r6)
            if (r6 == 0) goto L46
            int r5 = r5 + 1
            goto L28
        L3f:
            int r1 = r8.zze
            int r9 = r9.zze
            if (r1 != r9) goto L46
            return r0
        L46:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzos.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i2;
        int i3 = zzeu.zza;
        SparseArray sparseArray = this.zzd;
        if (i3 >= 31) {
            i2 = sparseArray.contentHashCode();
        } else {
            int i4 = 17;
            for (int i5 = 0; i5 < sparseArray.size(); i5++) {
                i4 = Objects.hashCode(sparseArray.valueAt(i5)) + ((sparseArray.keyAt(i5) + (i4 * 31)) * 31);
            }
            i2 = i4;
        }
        return (i2 * 31) + this.zze;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.zze + ", audioProfiles=" + this.zzd.toString() + "]";
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0044, code lost:
    
        if (com.google.android.gms.internal.ads.zzeu.zzF(r8.zzd, 30) == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c3 A[ORIG_RETURN, RETURN] */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair zzb(com.google.android.gms.internal.ads.zzaf r9, com.google.android.gms.internal.ads.zzh r10) {
        /*
            r8 = this;
            java.lang.String r0 = r9.zzn
            r0.getClass()
            java.lang.String r1 = r9.zzj
            int r0 = com.google.android.gms.internal.ads.zzbn.zza(r0, r1)
            com.google.android.gms.internal.ads.zzgba r1 = com.google.android.gms.internal.ads.zzos.zzb
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            boolean r1 = r1.containsKey(r2)
            if (r1 != 0) goto L19
            goto Lc3
        L19:
            r1 = 7
            r2 = 8
            r3 = 6
            r4 = 18
            if (r0 != r4) goto L2c
            android.util.SparseArray r0 = r8.zzd
            boolean r0 = com.google.android.gms.internal.ads.zzeu.zzF(r0, r4)
            if (r0 != 0) goto L2b
            r0 = r3
            goto L47
        L2b:
            r0 = r4
        L2c:
            if (r0 != r2) goto L3a
            android.util.SparseArray r0 = r8.zzd
            boolean r0 = com.google.android.gms.internal.ads.zzeu.zzF(r0, r2)
            if (r0 == 0) goto L38
            r0 = r2
            goto L3a
        L38:
            r0 = r1
            goto L47
        L3a:
            r5 = 30
            if (r0 != r5) goto L47
            android.util.SparseArray r6 = r8.zzd
            boolean r5 = com.google.android.gms.internal.ads.zzeu.zzF(r6, r5)
            if (r5 != 0) goto L47
            goto L38
        L47:
            android.util.SparseArray r5 = r8.zzd
            boolean r5 = com.google.android.gms.internal.ads.zzeu.zzF(r5, r0)
            if (r5 == 0) goto Lc3
            android.util.SparseArray r5 = r8.zzd
            java.lang.Object r5 = r5.get(r0)
            com.google.android.gms.internal.ads.zzoq r5 = (com.google.android.gms.internal.ads.zzoq) r5
            r5.getClass()
            int r6 = r9.zzB
            r7 = -1
            if (r6 == r7) goto L7e
            if (r0 != r4) goto L62
            goto L7e
        L62:
            java.lang.String r9 = r9.zzn
            java.lang.String r10 = "audio/vnd.dts.uhd;profile=p2"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L77
            int r9 = com.google.android.gms.internal.ads.zzeu.zza
            r10 = 33
            if (r9 >= r10) goto L77
            r9 = 10
            if (r6 <= r9) goto L89
            goto Lc3
        L77:
            boolean r9 = r5.zzb(r6)
            if (r9 != 0) goto L89
            goto Lc3
        L7e:
            int r9 = r9.zzC
            if (r9 != r7) goto L85
            r9 = 48000(0xbb80, float:6.7262E-41)
        L85:
            int r6 = r5.zza(r9, r10)
        L89:
            int r9 = com.google.android.gms.internal.ads.zzeu.zza
            r10 = 28
            if (r9 > r10) goto L9d
            if (r6 != r1) goto L92
            goto L9e
        L92:
            r10 = 3
            if (r6 == r10) goto L9b
            r10 = 4
            if (r6 == r10) goto L9b
            r10 = 5
            if (r6 != r10) goto L9d
        L9b:
            r2 = r3
            goto L9e
        L9d:
            r2 = r6
        L9e:
            r10 = 26
            if (r9 > r10) goto Lb0
            java.lang.String r9 = "fugu"
            java.lang.String r10 = com.google.android.gms.internal.ads.zzeu.zzb
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto Lb0
            r9 = 1
            if (r2 != r9) goto Lb0
            r2 = 2
        Lb0:
            int r9 = com.google.android.gms.internal.ads.zzeu.zzh(r2)
            if (r9 == 0) goto Lc3
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            android.util.Pair r9 = android.util.Pair.create(r10, r9)
            return r9
        Lc3:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzos.zzb(com.google.android.gms.internal.ads.zzaf, com.google.android.gms.internal.ads.zzh):android.util.Pair");
    }

    private zzos(List list) {
        this.zzd = new SparseArray();
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzoq zzoqVar = (zzoq) list.get(i2);
            this.zzd.put(zzoqVar.zzb, zzoqVar);
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.zzd.size(); i4++) {
            i3 = Math.max(i3, ((zzoq) this.zzd.valueAt(i4)).zzc);
        }
        this.zze = i3;
    }
}

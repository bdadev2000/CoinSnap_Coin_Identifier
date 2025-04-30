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
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class zzpp {
    static final zzgbf zzb;
    private final SparseArray zzd;
    private final int zze;
    public static final zzpp zza = new zzpp(zzgbc.zzn(zzpn.zza));

    @SuppressLint({"InlinedApi"})
    private static final zzgbc zzc = zzgbc.zzp(2, 5, 6);

    static {
        zzgbe zzgbeVar = new zzgbe();
        zzgbeVar.zza(5, 6);
        zzgbeVar.zza(17, 6);
        zzgbeVar.zza(7, 6);
        zzgbeVar.zza(30, 10);
        zzgbeVar.zza(18, 6);
        zzgbeVar.zza(6, 8);
        zzgbeVar.zza(8, 8);
        zzgbeVar.zza(14, 8);
        zzb = zzgbeVar.zzc();
    }

    @Nullable
    public static Uri zza() {
        if (zzf()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    @SuppressLint({"UnprotectedReceiver"})
    public static zzpp zzc(Context context, zzk zzkVar, @Nullable zzpx zzpxVar) {
        return zzd(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), zzkVar, zzpxVar);
    }

    @SuppressLint({"InlinedApi"})
    public static zzpp zzd(Context context, @Nullable Intent intent, zzk zzkVar, @Nullable zzpx zzpxVar) {
        boolean z8;
        Object systemService = context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        systemService.getClass();
        AudioManager audioManager = (AudioManager) systemService;
        if (zzpxVar == null) {
            if (zzgd.zza >= 33) {
                zzpxVar = zzpm.zzb(audioManager, zzkVar);
            } else {
                zzpxVar = null;
            }
        }
        int i9 = zzgd.zza;
        if (i9 >= 33 && (zzgd.zzN(context) || zzgd.zzJ(context))) {
            return zzpm.zza(audioManager, zzkVar);
        }
        if (i9 >= 23 && zzpk.zza(audioManager, zzpxVar)) {
            return zza;
        }
        zzgbg zzgbgVar = new zzgbg();
        zzgbgVar.zzf((Object) 2);
        if (i9 >= 29 && (zzgd.zzN(context) || zzgd.zzJ(context))) {
            zzgbgVar.zzh(zzpl.zzb(zzkVar));
            return new zzpp(zze(zzgea.zzg(zzgbgVar.zzi()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        if (Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        if ((z8 || zzf()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            zzgbgVar.zzh(zzc);
        }
        if (intent != null && !z8 && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 1) {
            int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
            if (intArrayExtra != null) {
                zzgbgVar.zzh(zzgea.zzf(intArrayExtra));
            }
            return new zzpp(zze(zzgea.zzg(zzgbgVar.zzi()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
        }
        return new zzpp(zze(zzgea.zzg(zzgbgVar.zzi()), 10));
    }

    private static zzgbc zze(@Nullable int[] iArr, int i9) {
        zzgaz zzgazVar = new zzgaz();
        for (int i10 : iArr) {
            zzgazVar.zzf(new zzpn(i10, i9));
        }
        return zzgazVar.zzi();
    }

    private static boolean zzf() {
        String str = zzgd.zzc;
        if (!"Amazon".equals(str) && !"Xiaomi".equals(str)) {
            return false;
        }
        return true;
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
            boolean r1 = r9 instanceof com.google.android.gms.internal.ads.zzpp
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.internal.ads.zzpp r9 = (com.google.android.gms.internal.ads.zzpp) r9
            android.util.SparseArray r1 = r8.zzd
            android.util.SparseArray r3 = r9.zzd
            int r4 = com.google.android.gms.internal.ads.zzgd.zza
            r5 = 31
            if (r4 < r5) goto L1d
            boolean r1 = com.google.android.gms.internal.ads.c.s(r1, r3)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpp.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i9;
        int i10 = zzgd.zza;
        SparseArray sparseArray = this.zzd;
        if (i10 >= 31) {
            i9 = sparseArray.contentHashCode();
        } else {
            int i11 = 17;
            for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                i11 = Objects.hashCode(sparseArray.valueAt(i12)) + ((sparseArray.keyAt(i12) + (i11 * 31)) * 31);
            }
            i9 = i11;
        }
        return (i9 * 31) + this.zze;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.zze + ", audioProfiles=" + this.zzd.toString() + "]";
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0044, code lost:
    
        if (com.google.android.gms.internal.ads.zzgd.zzH(r8.zzd, 30) == false) goto L15;
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
    public final android.util.Pair zzb(com.google.android.gms.internal.ads.zzan r9, com.google.android.gms.internal.ads.zzk r10) {
        /*
            r8 = this;
            java.lang.String r0 = r9.zzn
            r0.getClass()
            java.lang.String r1 = r9.zzk
            int r0 = com.google.android.gms.internal.ads.zzcg.zza(r0, r1)
            com.google.android.gms.internal.ads.zzgbf r1 = com.google.android.gms.internal.ads.zzpp.zzb
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
            boolean r0 = com.google.android.gms.internal.ads.zzgd.zzH(r0, r4)
            if (r0 != 0) goto L2b
            r0 = r3
            goto L47
        L2b:
            r0 = r4
        L2c:
            if (r0 != r2) goto L3a
            android.util.SparseArray r0 = r8.zzd
            boolean r0 = com.google.android.gms.internal.ads.zzgd.zzH(r0, r2)
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
            boolean r5 = com.google.android.gms.internal.ads.zzgd.zzH(r6, r5)
            if (r5 != 0) goto L47
            goto L38
        L47:
            android.util.SparseArray r5 = r8.zzd
            boolean r5 = com.google.android.gms.internal.ads.zzgd.zzH(r5, r0)
            if (r5 == 0) goto Lc3
            android.util.SparseArray r5 = r8.zzd
            java.lang.Object r5 = r5.get(r0)
            com.google.android.gms.internal.ads.zzpn r5 = (com.google.android.gms.internal.ads.zzpn) r5
            r5.getClass()
            int r6 = r9.zzA
            r7 = -1
            if (r6 == r7) goto L7e
            if (r0 != r4) goto L62
            goto L7e
        L62:
            java.lang.String r9 = r9.zzn
            java.lang.String r10 = "audio/vnd.dts.uhd;profile=p2"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L77
            int r9 = com.google.android.gms.internal.ads.zzgd.zza
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
            int r9 = r9.zzB
            if (r9 != r7) goto L85
            r9 = 48000(0xbb80, float:6.7262E-41)
        L85:
            int r6 = r5.zza(r9, r10)
        L89:
            int r9 = com.google.android.gms.internal.ads.zzgd.zza
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
            java.lang.String r10 = com.google.android.gms.internal.ads.zzgd.zzb
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto Lb0
            r9 = 1
            if (r2 != r9) goto Lb0
            r2 = 2
        Lb0:
            int r9 = com.google.android.gms.internal.ads.zzgd.zzh(r2)
            if (r9 == 0) goto Lc3
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            android.util.Pair r9 = android.util.Pair.create(r10, r9)
            return r9
        Lc3:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpp.zzb(com.google.android.gms.internal.ads.zzan, com.google.android.gms.internal.ads.zzk):android.util.Pair");
    }

    private zzpp(List list) {
        this.zzd = new SparseArray();
        for (int i9 = 0; i9 < list.size(); i9++) {
            zzpn zzpnVar = (zzpn) list.get(i9);
            this.zzd.put(zzpnVar.zzb, zzpnVar);
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.zzd.size(); i11++) {
            i10 = Math.max(i10, ((zzpn) this.zzd.valueAt(i11)).zzc);
        }
        this.zze = i10;
    }
}

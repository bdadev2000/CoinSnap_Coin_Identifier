package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.entity.o;

/* loaded from: classes2.dex */
public final class zztt extends Exception {

    @Nullable
    public final String zza;
    public final boolean zzb;

    @Nullable
    public final zztp zzc;

    @Nullable
    public final String zzd;

    @Nullable
    public final zztt zze;

    public zztt(zzan zzanVar, @Nullable Throwable th, boolean z8, int i9) {
        this("Decoder init failed: [" + i9 + "], " + zzanVar.toString(), th, zzanVar.zzn, false, null, o.h(Math.abs(i9), "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_"), null);
    }

    public static /* bridge */ /* synthetic */ zztt zza(zztt zzttVar, zztt zzttVar2) {
        return new zztt(zzttVar.getMessage(), zzttVar.getCause(), zzttVar.zza, false, zzttVar.zzc, zzttVar.zzd, zzttVar2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zztt(com.google.android.gms.internal.ads.zzan r12, @androidx.annotation.Nullable java.lang.Throwable r13, boolean r14, com.google.android.gms.internal.ads.zztp r15) {
        /*
            r11 = this;
            java.lang.String r14 = r15.zza
            java.lang.String r0 = r12.toString()
            java.lang.String r1 = "Decoder init failed: "
            java.lang.String r2 = ", "
            java.lang.String r4 = x0.AbstractC2914a.k(r1, r14, r2, r0)
            java.lang.String r6 = r12.zzn
            int r12 = com.google.android.gms.internal.ads.zzgd.zza
            boolean r12 = r13 instanceof android.media.MediaCodec.CodecException
            if (r12 == 0) goto L1f
            r12 = r13
            android.media.MediaCodec$CodecException r12 = (android.media.MediaCodec.CodecException) r12
            java.lang.String r12 = r12.getDiagnosticInfo()
        L1d:
            r9 = r12
            goto L21
        L1f:
            r12 = 0
            goto L1d
        L21:
            r7 = 0
            r10 = 0
            r3 = r11
            r5 = r13
            r8 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztt.<init>(com.google.android.gms.internal.ads.zzan, java.lang.Throwable, boolean, com.google.android.gms.internal.ads.zztp):void");
    }

    private zztt(@Nullable String str, @Nullable Throwable th, @Nullable String str2, boolean z8, @Nullable zztp zztpVar, @Nullable String str3, @Nullable zztt zzttVar) {
        super(str, th);
        this.zza = str2;
        this.zzb = false;
        this.zzc = zztpVar;
        this.zzd = str3;
        this.zze = zzttVar;
    }
}

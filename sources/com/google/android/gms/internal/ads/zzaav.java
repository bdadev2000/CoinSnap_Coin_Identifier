package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzaav implements zzdr {
    private static final zzfyw zza = zzfyz.zza(new zzfyw() { // from class: com.google.android.gms.internal.ads.zzaat
        @Override // com.google.android.gms.internal.ads.zzfyw
        public final Object zza() {
            try {
                Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                Object invoke = cls.getMethod("build", null).invoke(cls.getConstructor(null).newInstance(null), null);
                invoke.getClass();
                return (zzdr) invoke;
            } catch (Exception e4) {
                throw new IllegalStateException(e4);
            }
        }
    });

    private zzaav() {
        throw null;
    }

    public /* synthetic */ zzaav(zzaau zzaauVar) {
    }
}

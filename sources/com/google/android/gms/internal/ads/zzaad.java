package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzaad implements zzcm {
    public static final /* synthetic */ int zza = 0;

    static {
        zzfyt.zza(new zzfyp() { // from class: com.google.android.gms.internal.ads.zzaab
            @Override // com.google.android.gms.internal.ads.zzfyp
            public final Object zza() {
                int i2 = zzaad.zza;
                try {
                    Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                    Object invoke = cls.getMethod("build", new Class[0]).invoke(cls.getConstructor(new Class[0]).newInstance(new Object[0]), new Object[0]);
                    invoke.getClass();
                    return (zzcm) invoke;
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            }
        });
    }

    private zzaad() {
        throw null;
    }

    public /* synthetic */ zzaad(zzaac zzaacVar) {
    }
}

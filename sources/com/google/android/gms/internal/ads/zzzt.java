package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzzt implements zzcf {
    public static final /* synthetic */ int zza = 0;

    static {
        zzfxk.zza(new zzfxg() { // from class: com.google.android.gms.internal.ads.zzzs
            @Override // com.google.android.gms.internal.ads.zzfxg
            public final Object zza() {
                int i10 = zzzt.zza;
                try {
                    Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                    Object invoke = cls.getMethod("build", new Class[0]).invoke(cls.getConstructor(new Class[0]).newInstance(new Object[0]), new Object[0]);
                    invoke.getClass();
                    return (zzcf) invoke;
                } catch (Exception e2) {
                    throw new IllegalStateException(e2);
                }
            }
        });
    }

    private zzzt() {
        throw null;
    }

    public /* synthetic */ zzzt(zzzz zzzzVar) {
    }
}

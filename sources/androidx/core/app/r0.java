package androidx.core.app;

import android.media.AudioAttributes;

/* loaded from: classes.dex */
public abstract class r0 {
    public static AudioAttributes a(AudioAttributes.Builder builder) {
        return builder.build();
    }

    public static AudioAttributes.Builder b() {
        return new AudioAttributes.Builder();
    }

    public static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i10) {
        return builder.setContentType(i10);
    }

    public static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i10) {
        return builder.setLegacyStreamType(i10);
    }

    public static AudioAttributes.Builder e(AudioAttributes.Builder builder, int i10) {
        return builder.setUsage(i10);
    }
}

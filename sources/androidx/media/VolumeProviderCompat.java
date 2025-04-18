package androidx.media;

import androidx.annotation.RestrictTo;
import androidx.media.VolumeProviderCompatApi21;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public abstract class VolumeProviderCompat {

    /* renamed from: androidx.media.VolumeProviderCompat$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass1 implements VolumeProviderCompatApi21.Delegate {
    }

    /* loaded from: classes2.dex */
    public static abstract class Callback {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes2.dex */
    public @interface ControlType {
    }
}

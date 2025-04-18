package com.google.android.gms.internal.play_billing;

import androidx.compose.foundation.text.input.a;
import com.google.firebase.sessions.settings.RemoteSettings;

/* loaded from: classes2.dex */
public class zzba {
    private final String zza;
    private final Class zzb;
    private final boolean zzc;

    public zzba(String str, Class cls, boolean z2) {
        this(str, cls, z2, true);
    }

    public static zzba zza(String str, Class cls) {
        return new zzba(str, cls, false, false);
    }

    public final String toString() {
        Class cls = this.zzb;
        String name = getClass().getName();
        String name2 = cls.getName();
        StringBuilder B = a.B(name, RemoteSettings.FORWARD_SLASH_STRING);
        B.append(this.zza);
        B.append("[");
        B.append(name2);
        B.append("]");
        return B.toString();
    }

    public final boolean zzb() {
        return this.zzc;
    }

    private zzba(String str, Class cls, boolean z2, boolean z3) {
        zzda.zzb(str);
        this.zza = str;
        this.zzb = cls;
        this.zzc = z2;
        System.identityHashCode(this);
        for (int i2 = 0; i2 < 5; i2++) {
        }
    }
}

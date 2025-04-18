package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class zzhft implements zzhfx {
    private final Map zza;

    public zzhft(Map map) {
        this.zza = Collections.unmodifiableMap(map);
    }

    public final Map zza() {
        return this.zza;
    }
}

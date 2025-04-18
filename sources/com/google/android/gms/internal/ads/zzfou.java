package com.google.android.gms.internal.ads;

import com.facebook.appevents.integrity.IntegrityManager;

/* loaded from: classes4.dex */
public enum zzfou {
    NATIVE("native"),
    JAVASCRIPT("javascript"),
    NONE(IntegrityManager.INTEGRITY_TYPE_NONE);

    private final String zze;

    zzfou(String str) {
        this.zze = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zze;
    }
}

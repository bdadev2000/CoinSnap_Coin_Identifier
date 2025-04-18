package com.google.android.gms.internal.measurement;

import a4.j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzmt extends IllegalArgumentException {
    public zzmt(int i10, int i11) {
        super(j.e("Unpaired surrogate at index ", i10, " of ", i11));
    }
}

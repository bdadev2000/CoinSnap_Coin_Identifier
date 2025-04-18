package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzfwi {
    public static final CharSequence zza(Object obj) {
        Objects.requireNonNull(obj);
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    public static final StringBuilder zzb(StringBuilder sb2, Iterable iterable, String str) {
        zzc(sb2, iterable.iterator(), str);
        return sb2;
    }

    public static final StringBuilder zzc(StringBuilder sb2, Iterator it, String str) {
        try {
            if (it.hasNext()) {
                sb2.append(zza(it.next()));
                while (it.hasNext()) {
                    sb2.append((CharSequence) str);
                    sb2.append(zza(it.next()));
                }
            }
            return sb2;
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}

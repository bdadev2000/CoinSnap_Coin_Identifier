package com.google.android.gms.internal.measurement;

import Q7.n0;
import com.google.android.gms.internal.measurement.zzhp;
import com.google.android.gms.internal.measurement.zzhq;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public abstract class zzhq<MessageType extends zzhq<MessageType, BuilderType>, BuilderType extends zzhp<MessageType, BuilderType>> implements zzkt {
    protected int zza = 0;

    public int zza(zzll zzllVar) {
        int zzbx = zzbx();
        if (zzbx != -1) {
            return zzbx;
        }
        int zza = zzllVar.zza(this);
        zzc(zza);
        return zza;
    }

    public int zzbx() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.measurement.zzkt
    public final zzia zzby() {
        try {
            zzif zzc = zzia.zzc(zzca());
            zza(zzc.zzb());
            return zzc.zza();
        } catch (IOException e4) {
            throw new RuntimeException(AbstractC2914a.e("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e4);
        }
    }

    public final byte[] zzbz() {
        try {
            byte[] bArr = new byte[zzca()];
            zzit zzb = zzit.zzb(bArr);
            zza(zzb);
            zzb.zzb();
            return bArr;
        } catch (IOException e4) {
            throw new RuntimeException(AbstractC2914a.e("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e4);
        }
    }

    public void zzc(int i9) {
        throw new UnsupportedOperationException();
    }

    public static <T> void zza(Iterable<T> iterable, List<? super T> list) {
        zzjm.zza(iterable);
        if (iterable instanceof zzka) {
            List<?> zza = ((zzka) iterable).zza();
            zzka zzkaVar = (zzka) list;
            int size = list.size();
            for (Object obj : zza) {
                if (obj == null) {
                    String f9 = n0.f(zzkaVar.size() - size, "Element at index ", " is null.");
                    for (int size2 = zzkaVar.size() - 1; size2 >= size; size2--) {
                        zzkaVar.remove(size2);
                    }
                    throw new NullPointerException(f9);
                }
                if (obj instanceof zzia) {
                    zzkaVar.zza((zzia) obj);
                } else if (obj instanceof byte[]) {
                    zzkaVar.zza(zzia.zza((byte[]) obj));
                } else {
                    zzkaVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof zzlf) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size3 = list.size();
        for (T t9 : iterable) {
            if (t9 == null) {
                String f10 = n0.f(list.size() - size3, "Element at index ", " is null.");
                for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                    list.remove(size4);
                }
                throw new NullPointerException(f10);
            }
            list.add(t9);
        }
    }
}

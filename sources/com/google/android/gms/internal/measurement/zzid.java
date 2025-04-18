package com.google.android.gms.internal.measurement;

import a4.j;
import com.google.android.gms.internal.measurement.zzib;
import com.google.android.gms.internal.measurement.zzid;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;

/* loaded from: classes3.dex */
public abstract class zzid<MessageType extends zzib<MessageType, BuilderType>, BuilderType extends zzid<MessageType, BuilderType>> implements zzlb {
    @Override // 
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType zzb(zziw zziwVar, zzjg zzjgVar) throws IOException;

    public BuilderType zza(byte[] bArr, int i10, int i11) throws zzkb {
        try {
            zziw zza = zziw.zza(bArr, 0, i11, false);
            zzb(zza, zzjg.zza);
            zza.zzc(0);
            return this;
        } catch (zzkb e2) {
            throw e2;
        } catch (IOException e10) {
            throw new RuntimeException(zza("byte array"), e10);
        }
    }

    @Override // 
    /* renamed from: zzaf, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType clone();

    public BuilderType zza(byte[] bArr, int i10, int i11, zzjg zzjgVar) throws zzkb {
        try {
            zziw zza = zziw.zza(bArr, 0, i11, false);
            zzb(zza, zzjgVar);
            zza.zzc(0);
            return this;
        } catch (zzkb e2) {
            throw e2;
        } catch (IOException e10) {
            throw new RuntimeException(zza("byte array"), e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final /* synthetic */ zzlb zza(byte[] bArr) throws zzkb {
        return zza(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final /* synthetic */ zzlb zza(byte[] bArr, zzjg zzjgVar) throws zzkb {
        return zza(bArr, 0, bArr.length, zzjgVar);
    }

    private final String zza(String str) {
        return j.h("Reading ", getClass().getName(), " from a ", str, " threw an IOException (should never happen).");
    }

    public static <T> void zza(Iterable<T> iterable, List<? super T> list) {
        zzjv.zza(iterable);
        if (iterable instanceof zzkj) {
            List<?> zza = ((zzkj) iterable).zza();
            zzkj zzkjVar = (zzkj) list;
            int size = list.size();
            for (Object obj : zza) {
                if (obj == null) {
                    String i10 = a.i("Element at index ", zzkjVar.size() - size, " is null.");
                    int size2 = zzkjVar.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            break;
                        } else {
                            zzkjVar.remove(size2);
                        }
                    }
                    throw new NullPointerException(i10);
                }
                if (obj instanceof zzik) {
                    zzkjVar.zza((zzik) obj);
                } else if (obj instanceof byte[]) {
                    zzkjVar.zza(zzik.zza((byte[]) obj));
                } else {
                    zzkjVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof zzlo) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size3 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size3);
            }
            if (list instanceof zzlp) {
                ((zzlp) list).zzb(list.size() + size3);
            }
        }
        int size4 = list.size();
        if ((iterable instanceof List) && (iterable instanceof RandomAccess)) {
            List list2 = (List) iterable;
            int size5 = list2.size();
            for (int i11 = 0; i11 < size5; i11++) {
                a0.a aVar = (Object) list2.get(i11);
                if (aVar == null) {
                    zza(list, size4);
                }
                list.add(aVar);
            }
            return;
        }
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                zza(list, size4);
            }
            list.add(obj2);
        }
    }

    private static void zza(List<?> list, int i10) {
        String i11 = a.i("Element at index ", list.size() - i10, " is null.");
        int size = list.size();
        while (true) {
            size--;
            if (size >= i10) {
                list.remove(size);
            } else {
                throw new NullPointerException(i11);
            }
        }
    }
}

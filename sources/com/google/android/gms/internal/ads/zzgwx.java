package com.google.android.gms.internal.ads;

import a4.j;
import com.google.android.gms.internal.ads.zzgwx;
import com.google.android.gms.internal.ads.zzgwy;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public abstract class zzgwx<MessageType extends zzgwy<MessageType, BuilderType>, BuilderType extends zzgwx<MessageType, BuilderType>> implements zzhah {
    private String zza(String str) {
        return j.h("Reading ", getClass().getName(), " from a ", str, " threw an IOException (should never happen).");
    }

    private static <T> void zzb(Iterable<T> iterable, List<? super T> list) {
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            }
            if (list instanceof zzhat) {
                ((zzhat) list).zze(list.size() + size);
            }
        }
        int size2 = list.size();
        if ((iterable instanceof List) && (iterable instanceof RandomAccess)) {
            List list2 = (List) iterable;
            int size3 = list2.size();
            for (int i10 = 0; i10 < size3; i10++) {
                a0.a aVar = (Object) list2.get(i10);
                if (aVar == null) {
                    zzc(list, size2);
                }
                list.add(aVar);
            }
            return;
        }
        for (Object obj : iterable) {
            if (obj == null) {
                zzc(list, size2);
            }
            list.add(obj);
        }
    }

    public static zzhbm zzbb(zzhai zzhaiVar) {
        return new zzhbm(zzhaiVar);
    }

    @Deprecated
    public static <T> void zzbc(Iterable<T> iterable, Collection<? super T> collection) {
        zzbd(iterable, (List) collection);
    }

    public static <T> void zzbd(Iterable<T> iterable, List<? super T> list) {
        byte[] bArr = zzgzk.zzb;
        iterable.getClass();
        if (iterable instanceof zzgzu) {
            List zza = ((zzgzu) iterable).zza();
            zzgzu zzgzuVar = (zzgzu) list;
            int size = list.size();
            for (Object obj : zza) {
                if (obj == null) {
                    String i10 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.i("Element at index ", zzgzuVar.size() - size, " is null.");
                    int size2 = zzgzuVar.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            break;
                        } else {
                            zzgzuVar.remove(size2);
                        }
                    }
                    throw new NullPointerException(i10);
                }
                if (obj instanceof zzgxp) {
                    zzgzuVar.zzb();
                } else if (obj instanceof byte[]) {
                    byte[] bArr2 = (byte[]) obj;
                    zzgxp.zzv(bArr2, 0, bArr2.length);
                    zzgzuVar.zzb();
                } else {
                    zzgzuVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof zzhar) {
            list.addAll((Collection) iterable);
        } else {
            zzb(iterable, list);
        }
    }

    private static void zzc(List<?> list, int i10) {
        String i11 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.i("Element at index ", list.size() - i10, " is null.");
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

    @Override // 
    /* renamed from: zzaC, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract BuilderType zzaP();

    public abstract BuilderType zzaD(MessageType messagetype);

    public BuilderType zzaE(zzgxp zzgxpVar) throws zzgzm {
        try {
            zzgxv zzl = zzgxpVar.zzl();
            zzaR(zzl);
            zzl.zzy(0);
            return this;
        } catch (zzgzm e2) {
            throw e2;
        } catch (IOException e10) {
            throw new RuntimeException(zza("ByteString"), e10);
        }
    }

    /* renamed from: zzaF, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaR(zzgxv zzgxvVar) throws IOException {
        int i10 = zzgyh.zzb;
        int i11 = zzhas.zza;
        return zzaW(zzgxvVar, zzgyh.zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: zzaG, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaS(zzhai zzhaiVar) {
        if (zzbt().getClass().isInstance(zzhaiVar)) {
            return (BuilderType) zzaD((zzgwy) zzhaiVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    public BuilderType zzaH(InputStream inputStream) throws IOException {
        zzgxv zzG = zzgxv.zzG(inputStream, 4096);
        zzaR(zzG);
        zzG.zzy(0);
        return this;
    }

    /* renamed from: zzaI, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaU(byte[] bArr) throws zzgzm {
        return zzaZ(bArr, 0, bArr.length);
    }

    public BuilderType zzaJ(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
        try {
            zzgxv zzl = zzgxpVar.zzl();
            zzaW(zzl, zzgyhVar);
            zzl.zzy(0);
            return this;
        } catch (zzgzm e2) {
            throw e2;
        } catch (IOException e10) {
            throw new RuntimeException(zza("ByteString"), e10);
        }
    }

    @Override // 
    /* renamed from: zzaK, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType zzaW(zzgxv zzgxvVar, zzgyh zzgyhVar) throws IOException;

    public BuilderType zzaL(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
        zzgxv zzG = zzgxv.zzG(inputStream, 4096);
        zzaW(zzG, zzgyhVar);
        zzG.zzy(0);
        return this;
    }

    /* renamed from: zzaM, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaY(byte[] bArr, zzgyh zzgyhVar) throws zzgzm {
        return zzba(bArr, 0, bArr.length, zzgyhVar);
    }

    @Override // 
    /* renamed from: zzaN, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaZ(byte[] bArr, int i10, int i11) throws zzgzm {
        try {
            zzgxv zzH = zzgxv.zzH(bArr, i10, i11, false);
            zzaR(zzH);
            zzH.zzy(0);
            return this;
        } catch (zzgzm e2) {
            throw e2;
        } catch (IOException e10) {
            throw new RuntimeException(zza("byte array"), e10);
        }
    }

    @Override // 
    /* renamed from: zzaO, reason: merged with bridge method [inline-methods] */
    public BuilderType zzba(byte[] bArr, int i10, int i11, zzgyh zzgyhVar) throws zzgzm {
        try {
            zzgxv zzH = zzgxv.zzH(bArr, i10, i11, false);
            zzaW(zzH, zzgyhVar);
            zzH.zzy(0);
            return this;
        } catch (zzgzm e2) {
            throw e2;
        } catch (IOException e10) {
            throw new RuntimeException(zza("byte array"), e10);
        }
    }

    public /* bridge */ /* synthetic */ zzhah zzaQ(zzgxp zzgxpVar) throws zzgzm {
        zzaE(zzgxpVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzhah zzaT(InputStream inputStream) throws IOException {
        zzaH(inputStream);
        return this;
    }

    public /* bridge */ /* synthetic */ zzhah zzaV(zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
        zzaJ(zzgxpVar, zzgyhVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzhah zzaX(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
        zzaL(inputStream, zzgyhVar);
        return this;
    }

    public boolean zzbe(InputStream inputStream) throws IOException {
        int i10 = zzgyh.zzb;
        int i11 = zzhas.zza;
        return zzbf(inputStream, zzgyh.zza);
    }

    public boolean zzbf(InputStream inputStream, zzgyh zzgyhVar) throws IOException {
        int read = inputStream.read();
        if (read == -1) {
            return false;
        }
        zzaL(new zzgww(inputStream, zzgxv.zzE(read, inputStream)), zzgyhVar);
        return true;
    }
}

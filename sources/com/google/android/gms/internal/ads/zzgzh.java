package com.google.android.gms.internal.ads;

import Q7.n0;
import com.google.android.gms.internal.ads.zzgzh;
import com.google.android.gms.internal.ads.zzgzi;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class zzgzh<MessageType extends zzgzi<MessageType, BuilderType>, BuilderType extends zzgzh<MessageType, BuilderType>> implements zzhdd {
    private String zza(String str) {
        return n0.j("Reading ", getClass().getName(), " from a ", str, " threw an IOException (should never happen).");
    }

    private static <T> void zzb(Iterable<T> iterable, List<? super T> list) {
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size = list.size();
        for (T t9 : iterable) {
            if (t9 == null) {
                String f9 = n0.f(list.size() - size, "Element at index ", " is null.");
                int size2 = list.size();
                while (true) {
                    size2--;
                    if (size2 < size) {
                        break;
                    } else {
                        list.remove(size2);
                    }
                }
                throw new NullPointerException(f9);
            }
            list.add(t9);
        }
    }

    public static zzhep zzbb(zzhde zzhdeVar) {
        return new zzhep(zzhdeVar);
    }

    @Deprecated
    public static <T> void zzbc(Iterable<T> iterable, Collection<? super T> collection) {
        zzbd(iterable, (List) collection);
    }

    public static <T> void zzbd(Iterable<T> iterable, List<? super T> list) {
        byte[] bArr = zzhcb.zzd;
        iterable.getClass();
        if (iterable instanceof zzhcm) {
            List zzh = ((zzhcm) iterable).zzh();
            zzhcm zzhcmVar = (zzhcm) list;
            int size = list.size();
            for (Object obj : zzh) {
                if (obj == null) {
                    String f9 = n0.f(zzhcmVar.size() - size, "Element at index ", " is null.");
                    int size2 = zzhcmVar.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            break;
                        } else {
                            zzhcmVar.remove(size2);
                        }
                    }
                    throw new NullPointerException(f9);
                }
                if (obj instanceof zzhac) {
                    zzhcmVar.zzi((zzhac) obj);
                } else {
                    zzhcmVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof zzhdn) {
            list.addAll((Collection) iterable);
        } else {
            zzb(iterable, list);
        }
    }

    @Override // 
    /* renamed from: zzaC, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract BuilderType zzaP();

    public abstract BuilderType zzaD(MessageType messagetype);

    public BuilderType zzaE(zzhac zzhacVar) throws zzhcd {
        try {
            zzham zzl = zzhacVar.zzl();
            zzaR(zzl);
            zzl.zzz(0);
            return this;
        } catch (zzhcd e4) {
            throw e4;
        } catch (IOException e9) {
            throw new RuntimeException(zza("ByteString"), e9);
        }
    }

    /* renamed from: zzaF, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaR(zzham zzhamVar) throws IOException {
        return zzaW(zzhamVar, zzhay.zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzhdd
    /* renamed from: zzaG, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaS(zzhde zzhdeVar) {
        if (zzbt().getClass().isInstance(zzhdeVar)) {
            return (BuilderType) zzaD((zzgzi) zzhdeVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    public BuilderType zzaH(InputStream inputStream) throws IOException {
        zzham zzI = zzham.zzI(inputStream, 4096);
        zzaR(zzI);
        zzI.zzz(0);
        return this;
    }

    /* renamed from: zzaI, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaU(byte[] bArr) throws zzhcd {
        return zzaZ(bArr, 0, bArr.length);
    }

    public BuilderType zzaJ(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
        try {
            zzham zzl = zzhacVar.zzl();
            zzaW(zzl, zzhayVar);
            zzl.zzz(0);
            return this;
        } catch (zzhcd e4) {
            throw e4;
        } catch (IOException e9) {
            throw new RuntimeException(zza("ByteString"), e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhdd
    /* renamed from: zzaK, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType zzaW(zzham zzhamVar, zzhay zzhayVar) throws IOException;

    public BuilderType zzaL(InputStream inputStream, zzhay zzhayVar) throws IOException {
        zzham zzI = zzham.zzI(inputStream, 4096);
        zzaW(zzI, zzhayVar);
        zzI.zzz(0);
        return this;
    }

    /* renamed from: zzaM, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaY(byte[] bArr, zzhay zzhayVar) throws zzhcd {
        return zzba(bArr, 0, bArr.length, zzhayVar);
    }

    @Override // 
    /* renamed from: zzaN, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaZ(byte[] bArr, int i9, int i10) throws zzhcd {
        try {
            zzham zzJ = zzham.zzJ(bArr, i9, i10, false);
            zzaR(zzJ);
            zzJ.zzz(0);
            return this;
        } catch (zzhcd e4) {
            throw e4;
        } catch (IOException e9) {
            throw new RuntimeException(zza("byte array"), e9);
        }
    }

    @Override // 
    /* renamed from: zzaO, reason: merged with bridge method [inline-methods] */
    public BuilderType zzba(byte[] bArr, int i9, int i10, zzhay zzhayVar) throws zzhcd {
        try {
            zzham zzJ = zzham.zzJ(bArr, i9, i10, false);
            zzaW(zzJ, zzhayVar);
            zzJ.zzz(0);
            return this;
        } catch (zzhcd e4) {
            throw e4;
        } catch (IOException e9) {
            throw new RuntimeException(zza("byte array"), e9);
        }
    }

    public /* bridge */ /* synthetic */ zzhdd zzaQ(zzhac zzhacVar) throws zzhcd {
        zzaE(zzhacVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzhdd zzaT(InputStream inputStream) throws IOException {
        zzaH(inputStream);
        return this;
    }

    public /* bridge */ /* synthetic */ zzhdd zzaV(zzhac zzhacVar, zzhay zzhayVar) throws zzhcd {
        zzaJ(zzhacVar, zzhayVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzhdd zzaX(InputStream inputStream, zzhay zzhayVar) throws IOException {
        zzaL(inputStream, zzhayVar);
        return this;
    }

    public boolean zzbe(InputStream inputStream) throws IOException {
        return zzbf(inputStream, zzhay.zza);
    }

    public boolean zzbf(InputStream inputStream, zzhay zzhayVar) throws IOException {
        int read = inputStream.read();
        if (read == -1) {
            return false;
        }
        zzaL(new zzgzg(inputStream, zzham.zzG(read, inputStream)), zzhayVar);
        return true;
    }
}

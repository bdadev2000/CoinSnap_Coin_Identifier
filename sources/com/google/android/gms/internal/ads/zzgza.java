package com.google.android.gms.internal.ads;

import android.support.v4.media.d;
import com.google.android.gms.internal.ads.zzgza;
import com.google.android.gms.internal.ads.zzgzb;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public abstract class zzgza<MessageType extends zzgzb<MessageType, BuilderType>, BuilderType extends zzgza<MessageType, BuilderType>> implements zzhco {
    private String zza(String str) {
        return androidx.compose.foundation.text.input.a.m("Reading ", getClass().getName(), " from a ", str, " threw an IOException (should never happen).");
    }

    private static <T> void zzb(Iterable<T> iterable, List<? super T> list) {
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size = list.size();
        for (T t2 : iterable) {
            if (t2 == null) {
                String j2 = d.j("Element at index ", list.size() - size, " is null.");
                int size2 = list.size();
                while (true) {
                    size2--;
                    if (size2 < size) {
                        break;
                    } else {
                        list.remove(size2);
                    }
                }
                throw new NullPointerException(j2);
            }
            list.add(t2);
        }
    }

    public static zzhdx zzbb(zzhcp zzhcpVar) {
        return new zzhdx(zzhcpVar);
    }

    @Deprecated
    public static <T> void zzbc(Iterable<T> iterable, Collection<? super T> collection) {
        zzbd(iterable, (List) collection);
    }

    public static <T> void zzbd(Iterable<T> iterable, List<? super T> list) {
        byte[] bArr = zzhbr.zzb;
        iterable.getClass();
        if (!(iterable instanceof zzhcb)) {
            if (iterable instanceof zzhcy) {
                list.addAll((Collection) iterable);
                return;
            } else {
                zzb(iterable, list);
                return;
            }
        }
        List zza = ((zzhcb) iterable).zza();
        zzhcb zzhcbVar = (zzhcb) list;
        int size = list.size();
        for (Object obj : zza) {
            if (obj == null) {
                String j2 = d.j("Element at index ", zzhcbVar.size() - size, " is null.");
                int size2 = zzhcbVar.size();
                while (true) {
                    size2--;
                    if (size2 < size) {
                        break;
                    } else {
                        zzhcbVar.remove(size2);
                    }
                }
                throw new NullPointerException(j2);
            }
            if (obj instanceof zzgzs) {
                zzhcbVar.zzb();
            } else if (obj instanceof byte[]) {
                byte[] bArr2 = (byte[]) obj;
                zzgzs.zzv(bArr2, 0, bArr2.length);
                zzhcbVar.zzb();
            } else {
                zzhcbVar.add((String) obj);
            }
        }
    }

    @Override // 
    /* renamed from: zzaC, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract BuilderType zzaP();

    public abstract BuilderType zzaD(MessageType messagetype);

    public BuilderType zzaE(zzgzs zzgzsVar) throws zzhbt {
        try {
            zzhac zzl = zzgzsVar.zzl();
            zzaR(zzl);
            zzl.zzy(0);
            return this;
        } catch (zzhbt e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("ByteString"), e2);
        }
    }

    /* renamed from: zzaF, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaR(zzhac zzhacVar) throws IOException {
        int i2 = zzhao.zzb;
        int i3 = zzhcz.zza;
        return zzaW(zzhacVar, zzhao.zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: zzaG, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaS(zzhcp zzhcpVar) {
        if (zzbt().getClass().isInstance(zzhcpVar)) {
            return (BuilderType) zzaD((zzgzb) zzhcpVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    public BuilderType zzaH(InputStream inputStream) throws IOException {
        zzhac zzG = zzhac.zzG(inputStream, 4096);
        zzaR(zzG);
        zzG.zzy(0);
        return this;
    }

    /* renamed from: zzaI, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaU(byte[] bArr) throws zzhbt {
        return zzaZ(bArr, 0, bArr.length);
    }

    public BuilderType zzaJ(zzgzs zzgzsVar, zzhao zzhaoVar) throws zzhbt {
        try {
            zzhac zzl = zzgzsVar.zzl();
            zzaW(zzl, zzhaoVar);
            zzl.zzy(0);
            return this;
        } catch (zzhbt e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("ByteString"), e2);
        }
    }

    @Override // 
    /* renamed from: zzaK, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType zzaW(zzhac zzhacVar, zzhao zzhaoVar) throws IOException;

    public BuilderType zzaL(InputStream inputStream, zzhao zzhaoVar) throws IOException {
        zzhac zzG = zzhac.zzG(inputStream, 4096);
        zzaW(zzG, zzhaoVar);
        zzG.zzy(0);
        return this;
    }

    /* renamed from: zzaM, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaY(byte[] bArr, zzhao zzhaoVar) throws zzhbt {
        return zzba(bArr, 0, bArr.length, zzhaoVar);
    }

    @Override // 
    /* renamed from: zzaN, reason: merged with bridge method [inline-methods] */
    public BuilderType zzaZ(byte[] bArr, int i2, int i3) throws zzhbt {
        try {
            zzhac zzH = zzhac.zzH(bArr, i2, i3, false);
            zzaR(zzH);
            zzH.zzy(0);
            return this;
        } catch (zzhbt e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("byte array"), e2);
        }
    }

    @Override // 
    /* renamed from: zzaO, reason: merged with bridge method [inline-methods] */
    public BuilderType zzba(byte[] bArr, int i2, int i3, zzhao zzhaoVar) throws zzhbt {
        try {
            zzhac zzH = zzhac.zzH(bArr, i2, i3, false);
            zzaW(zzH, zzhaoVar);
            zzH.zzy(0);
            return this;
        } catch (zzhbt e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("byte array"), e2);
        }
    }

    public /* bridge */ /* synthetic */ zzhco zzaQ(zzgzs zzgzsVar) throws zzhbt {
        zzaE(zzgzsVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzhco zzaT(InputStream inputStream) throws IOException {
        zzaH(inputStream);
        return this;
    }

    public /* bridge */ /* synthetic */ zzhco zzaV(zzgzs zzgzsVar, zzhao zzhaoVar) throws zzhbt {
        zzaJ(zzgzsVar, zzhaoVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzhco zzaX(InputStream inputStream, zzhao zzhaoVar) throws IOException {
        zzaL(inputStream, zzhaoVar);
        return this;
    }

    public boolean zzbe(InputStream inputStream) throws IOException {
        int i2 = zzhao.zzb;
        int i3 = zzhcz.zza;
        return zzbf(inputStream, zzhao.zza);
    }

    public boolean zzbf(InputStream inputStream, zzhao zzhaoVar) throws IOException {
        int read = inputStream.read();
        if (read == -1) {
            return false;
        }
        zzaL(new zzgyz(inputStream, zzhac.zzE(read, inputStream)), zzhaoVar);
        return true;
    }
}

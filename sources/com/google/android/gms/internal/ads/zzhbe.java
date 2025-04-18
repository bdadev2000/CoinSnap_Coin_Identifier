package com.google.android.gms.internal.ads;

import android.support.v4.media.d;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhbe;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public abstract class zzhbe<MessageType extends zzhbe<MessageType, BuilderType>, BuilderType extends zzhay<MessageType, BuilderType>> extends zzgzb<MessageType, BuilderType> {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static Map<Object, zzhbe<?, ?>> zzc = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzd = -1;
    protected zzhdz zzt = zzhdz.zzc();

    public static zzhbg zzbA() {
        return zzgzi.zzd();
    }

    public static zzhbg zzbB(zzhbg zzhbgVar) {
        int size = zzhbgVar.size();
        return zzhbgVar.zzf(size == 0 ? 10 : size + size);
    }

    public static zzhbh zzbC() {
        return zzhal.zze();
    }

    public static zzhbh zzbD(zzhbh zzhbhVar) {
        int size = zzhbhVar.size();
        return zzhbhVar.zzf(size == 0 ? 10 : size + size);
    }

    public static zzhbl zzbE() {
        return zzhav.zze();
    }

    public static zzhbl zzbF(zzhbl zzhblVar) {
        int size = zzhblVar.size();
        return zzhblVar.zzf(size == 0 ? 10 : size + size);
    }

    public static zzhbm zzbG() {
        return zzhbf.zzg();
    }

    public static zzhbm zzbH(zzhbm zzhbmVar) {
        int size = zzhbmVar.size();
        return zzhbmVar.zzf(size == 0 ? 10 : size + size);
    }

    public static zzhbp zzbI() {
        return zzhce.zzh();
    }

    public static zzhbp zzbJ(zzhbp zzhbpVar) {
        int size = zzhbpVar.size();
        return zzhbpVar.zzf(size == 0 ? 10 : size + size);
    }

    public static <E> zzhbq<E> zzbK() {
        return zzhda.zzd();
    }

    public static <E> zzhbq<E> zzbL(zzhbq<E> zzhbqVar) {
        int size = zzhbqVar.size();
        return zzhbqVar.zzf(size == 0 ? 10 : size + size);
    }

    public static Object zzbR(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static Object zzbS(zzhcp zzhcpVar, String str, Object[] objArr) {
        return new zzhdb(zzhcpVar, str, objArr);
    }

    public static Method zzbT(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(androidx.compose.foundation.text.input.a.m("Generated message class \"", cls.getName(), "\" missing method \"", str, "\"."), e);
        }
    }

    public static <ContainingType extends zzhcp, Type> zzhbc<ContainingType, Type> zzbe(ContainingType containingtype, zzhcp zzhcpVar, zzhbj zzhbjVar, int i2, zzhel zzhelVar, boolean z2, Class cls) {
        return new zzhbc<>(containingtype, Collections.emptyList(), zzhcpVar, new zzhbb(zzhbjVar, i2, zzhelVar, true, z2), cls);
    }

    public static <ContainingType extends zzhcp, Type> zzhbc<ContainingType, Type> zzbf(ContainingType containingtype, Type type, zzhcp zzhcpVar, zzhbj zzhbjVar, int i2, zzhel zzhelVar, Class cls) {
        return new zzhbc<>(containingtype, type, zzhcpVar, new zzhbb(zzhbjVar, i2, zzhelVar, false, false), cls);
    }

    public static <T extends zzhbe> T zzbh(Class<T> cls) {
        zzhbe<?, ?> zzhbeVar = zzc.get(cls);
        if (zzhbeVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzhbeVar = zzc.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzhbeVar == null) {
            zzhbeVar = ((zzhbe) zzhef.zzg(cls)).zzbt();
            if (zzhbeVar == null) {
                throw new IllegalStateException();
            }
            zzc.put(cls, zzhbeVar);
        }
        return zzhbeVar;
    }

    public static <T extends zzhbe<T, ?>> T zzbk(T t2, InputStream inputStream) throws zzhbt {
        int i2 = zzhao.zzb;
        int i3 = zzhcz.zza;
        T t3 = (T) zzf(t2, inputStream, zzhao.zza);
        zze(t3);
        return t3;
    }

    public static <T extends zzhbe<T, ?>> T zzbl(T t2, InputStream inputStream, zzhao zzhaoVar) throws zzhbt {
        T t3 = (T) zzf(t2, inputStream, zzhaoVar);
        zze(t3);
        return t3;
    }

    public static <T extends zzhbe<T, ?>> T zzbm(T t2, zzgzs zzgzsVar) throws zzhbt {
        int i2 = zzhao.zzb;
        int i3 = zzhcz.zza;
        T t3 = (T) zzbr(t2, zzgzsVar, zzhao.zza);
        zze(t3);
        return t3;
    }

    public static <T extends zzhbe<T, ?>> T zzbn(T t2, zzhac zzhacVar) throws zzhbt {
        int i2 = zzhao.zzb;
        int i3 = zzhcz.zza;
        return (T) zzbs(t2, zzhacVar, zzhao.zza);
    }

    public static <T extends zzhbe<T, ?>> T zzbo(T t2, InputStream inputStream) throws zzhbt {
        zzhac zzG = zzhac.zzG(inputStream, 4096);
        int i2 = zzhao.zzb;
        int i3 = zzhcz.zza;
        T t3 = (T) zzbz(t2, zzG, zzhao.zza);
        zze(t3);
        return t3;
    }

    public static <T extends zzhbe<T, ?>> T zzbp(T t2, ByteBuffer byteBuffer) throws zzhbt {
        int i2 = zzhao.zzb;
        int i3 = zzhcz.zza;
        return (T) zzbv(t2, byteBuffer, zzhao.zza);
    }

    public static <T extends zzhbe<T, ?>> T zzbq(T t2, byte[] bArr) throws zzhbt {
        int length = bArr.length;
        int i2 = zzhao.zzb;
        int i3 = zzhcz.zza;
        T t3 = (T) zzh(t2, bArr, 0, length, zzhao.zza);
        zze(t3);
        return t3;
    }

    public static <T extends zzhbe<T, ?>> T zzbr(T t2, zzgzs zzgzsVar, zzhao zzhaoVar) throws zzhbt {
        T t3 = (T) zzg(t2, zzgzsVar, zzhaoVar);
        zze(t3);
        return t3;
    }

    public static <T extends zzhbe<T, ?>> T zzbs(T t2, zzhac zzhacVar, zzhao zzhaoVar) throws zzhbt {
        T t3 = (T) zzbz(t2, zzhacVar, zzhaoVar);
        zze(t3);
        return t3;
    }

    public static <T extends zzhbe<T, ?>> T zzbu(T t2, InputStream inputStream, zzhao zzhaoVar) throws zzhbt {
        T t3 = (T) zzbz(t2, zzhac.zzG(inputStream, 4096), zzhaoVar);
        zze(t3);
        return t3;
    }

    public static <T extends zzhbe<T, ?>> T zzbv(T t2, ByteBuffer byteBuffer, zzhao zzhaoVar) throws zzhbt {
        zzhac zzH;
        boolean z2 = false;
        if (byteBuffer.hasArray()) {
            zzH = zzhac.zzH(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), false);
        } else if (byteBuffer.isDirect() && zzhef.zzB()) {
            zzH = new zzhaa(byteBuffer, z2, null);
        } else {
            int remaining = byteBuffer.remaining();
            byte[] bArr = new byte[remaining];
            byteBuffer.duplicate().get(bArr);
            zzH = zzhac.zzH(bArr, 0, remaining, true);
        }
        T t3 = (T) zzbs(t2, zzH, zzhaoVar);
        zze(t3);
        return t3;
    }

    public static <T extends zzhbe<T, ?>> T zzbx(T t2, byte[] bArr, zzhao zzhaoVar) throws zzhbt {
        T t3 = (T) zzh(t2, bArr, 0, bArr.length, zzhaoVar);
        zze(t3);
        return t3;
    }

    public static <T extends zzhbe<T, ?>> T zzby(T t2, zzhac zzhacVar) throws zzhbt {
        int i2 = zzhao.zzb;
        int i3 = zzhcz.zza;
        return (T) zzbz(t2, zzhacVar, zzhao.zza);
    }

    public static <T extends zzhbe<T, ?>> T zzbz(T t2, zzhac zzhacVar, zzhao zzhaoVar) throws zzhbt {
        T t3 = (T) t2.zzbj();
        try {
            zzhdk zzb2 = zzhcz.zza().zzb(t3.getClass());
            zzb2.zzh(t3, zzhad.zzq(zzhacVar), zzhaoVar);
            zzb2.zzf(t3);
            return t3;
        } catch (zzhbt e) {
            if (e.zzb()) {
                throw new zzhbt(e);
            }
            throw e;
        } catch (zzhdx e2) {
            throw e2.zza();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzhbt) {
                throw ((zzhbt) e3.getCause());
            }
            throw new zzhbt(e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzhbt) {
                throw ((zzhbt) e4.getCause());
            }
            throw e4;
        }
    }

    private int zzc(zzhdk<?> zzhdkVar) {
        if (zzhdkVar != null) {
            return zzhdkVar.zza(this);
        }
        return zzhcz.zza().zzb(getClass()).zza(this);
    }

    public static <T extends zzhbe> void zzcb(Class<T> cls, T t2) {
        t2.zzbX();
        zzc.put(cls, t2);
    }

    public static final <T extends zzhbe<T, ?>> boolean zzce(T t2, boolean z2) {
        byte byteValue = ((Byte) t2.zzbP(zzhbd.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzl = zzhcz.zza().zzb(t2.getClass()).zzl(t2);
        if (z2) {
            t2.zzbQ(zzhbd.SET_MEMOIZED_IS_INITIALIZED, true != zzl ? null : t2);
        }
        return zzl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends zzhba<MessageType, BuilderType>, BuilderType, T> zzhbc<MessageType, T> zzd(zzham<MessageType, T> zzhamVar) {
        return (zzhbc) zzhamVar;
    }

    private static <T extends zzhbe<T, ?>> T zze(T t2) throws zzhbt {
        if (t2 == null || t2.zzbw()) {
            return t2;
        }
        throw t2.zzaP().zza();
    }

    private static <T extends zzhbe<T, ?>> T zzf(T t2, InputStream inputStream, zzhao zzhaoVar) throws zzhbt {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            zzhac zzG = zzhac.zzG(new zzgyz(inputStream, zzhac.zzE(read, inputStream)), 4096);
            T t3 = (T) zzbz(t2, zzG, zzhaoVar);
            zzG.zzy(0);
            return t3;
        } catch (zzhbt e) {
            if (e.zzb()) {
                throw new zzhbt(e);
            }
            throw e;
        } catch (IOException e2) {
            throw new zzhbt(e2);
        }
    }

    private static <T extends zzhbe<T, ?>> T zzg(T t2, zzgzs zzgzsVar, zzhao zzhaoVar) throws zzhbt {
        zzhac zzl = zzgzsVar.zzl();
        T t3 = (T) zzbz(t2, zzl, zzhaoVar);
        zzl.zzy(0);
        return t3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends zzhbe<T, ?>> T zzh(T t2, byte[] bArr, int i2, int i3, zzhao zzhaoVar) throws zzhbt {
        if (i3 == 0) {
            return t2;
        }
        T t3 = (T) t2.zzbj();
        try {
            zzhdk zzb2 = zzhcz.zza().zzb(t3.getClass());
            zzb2.zzi(t3, bArr, i2, i2 + i3, new zzgzg(zzhaoVar));
            zzb2.zzf(t3);
            return t3;
        } catch (zzhbt e) {
            if (e.zzb()) {
                throw new zzhbt(e);
            }
            throw e;
        } catch (zzhdx e2) {
            throw e2.zza();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzhbt) {
                throw ((zzhbt) e3.getCause());
            }
            throw new zzhbt(e3);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzhbt("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private void zzi() {
        if (this.zzt == zzhdz.zzc()) {
            this.zzt = zzhdz.zzf();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzhcz.zza().zzb(getClass()).zzk(this, (zzhbe) obj);
    }

    public int hashCode() {
        if (zzcf()) {
            return zzaW();
        }
        if (zzcd()) {
            zzcc(zzaW());
        }
        return zzaX();
    }

    public String toString() {
        return zzhcr.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzgzb
    public int zzaL() {
        return this.zzd & Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    @Override // com.google.android.gms.internal.ads.zzgzb
    public int zzaM(zzhdk zzhdkVar) {
        if (zzcf()) {
            int zzc2 = zzc(zzhdkVar);
            if (zzc2 >= 0) {
                return zzc2;
            }
            throw new IllegalStateException(d.i("serialized size must be non-negative, was ", zzc2));
        }
        if (zzaL() != Integer.MAX_VALUE) {
            return zzaL();
        }
        int zzc3 = zzc(zzhdkVar);
        zzaS(zzc3);
        return zzc3;
    }

    @Override // com.google.android.gms.internal.ads.zzgzb
    public zzhcu zzaO() {
        throw new UnsupportedOperationException("Lite does not support the mutable API.");
    }

    @Override // com.google.android.gms.internal.ads.zzgzb
    public void zzaS(int i2) {
        if (i2 < 0) {
            throw new IllegalStateException(d.i("serialized size must be non-negative, was ", i2));
        }
        this.zzd = i2 | (this.zzd & Integer.MIN_VALUE);
    }

    public int zzaW() {
        return zzhcz.zza().zzb(getClass()).zzb(this);
    }

    public int zzaX() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzhcp
    public int zzaY() {
        return zzaM(null);
    }

    public final <MessageType extends zzhbe<MessageType, BuilderType>, BuilderType extends zzhay<MessageType, BuilderType>> BuilderType zzaZ() {
        return (BuilderType) zzbP(zzhbd.NEW_BUILDER);
    }

    public final zzhcx<MessageType> zzbN() {
        return (zzhcx) zzbP(zzhbd.GET_PARSER);
    }

    public Object zzbO() throws Exception {
        return zzbP(zzhbd.BUILD_MESSAGE_INFO);
    }

    public Object zzbP(zzhbd zzhbdVar) {
        return zzde(zzhbdVar, null, null);
    }

    public Object zzbQ(zzhbd zzhbdVar, Object obj) {
        return zzde(zzhbdVar, obj, null);
    }

    public void zzbU() {
        this.zzq = 0;
    }

    public void zzbV() {
        zzaS(Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    public void zzbW() {
        zzhcz.zza().zzb(getClass()).zzf(this);
        zzbX();
    }

    public void zzbX() {
        this.zzd &= Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public void zzbY(int i2, zzgzs zzgzsVar) {
        zzi();
        zzhdz zzhdzVar = this.zzt;
        zzhdzVar.zzg();
        if (i2 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        zzhdzVar.zzj((i2 << 3) | 2, zzgzsVar);
    }

    public final void zzbZ(zzhdz zzhdzVar) {
        this.zzt = zzhdz.zze(this.zzt, zzhdzVar);
    }

    public final <MessageType extends zzhbe<MessageType, BuilderType>, BuilderType extends zzhay<MessageType, BuilderType>> BuilderType zzba(MessageType messagetype) {
        BuilderType zzaZ = zzaZ();
        zzaZ.zzbj(messagetype);
        return zzaZ;
    }

    @Override // com.google.android.gms.internal.ads.zzhcp
    /* renamed from: zzbb, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzcZ() {
        return (BuilderType) zzbP(zzhbd.NEW_BUILDER);
    }

    /* renamed from: zzbc, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzbM() {
        BuilderType buildertype = (BuilderType) zzbP(zzhbd.NEW_BUILDER);
        buildertype.zzbj(this);
        return buildertype;
    }

    @Override // com.google.android.gms.internal.ads.zzhcq
    /* renamed from: zzbi, reason: merged with bridge method [inline-methods] */
    public final MessageType zzbt() {
        return (MessageType) zzbP(zzhbd.GET_DEFAULT_INSTANCE);
    }

    public MessageType zzbj() {
        return (MessageType) zzbP(zzhbd.NEW_MUTABLE_INSTANCE);
    }

    @Override // com.google.android.gms.internal.ads.zzhcq
    public final boolean zzbw() {
        return zzce(this, true);
    }

    public void zzca(int i2, int i3) {
        zzi();
        zzhdz zzhdzVar = this.zzt;
        zzhdzVar.zzg();
        if (i2 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        zzhdzVar.zzj(i2 << 3, Long.valueOf(i3));
    }

    public void zzcc(int i2) {
        this.zzq = i2;
    }

    public boolean zzcd() {
        return zzaX() == 0;
    }

    public boolean zzcf() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public boolean zzcg(int i2, zzhac zzhacVar) throws IOException {
        if ((i2 & 7) == 4) {
            return false;
        }
        zzi();
        return this.zzt.zzm(i2, zzhacVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhcp
    public void zzda(zzhaj zzhajVar) throws IOException {
        zzhcz.zza().zzb(getClass()).zzj(this, zzhak.zza(zzhajVar));
    }

    public abstract Object zzde(zzhbd zzhbdVar, Object obj, Object obj2);
}

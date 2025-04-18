package com.google.android.gms.internal.ads;

import a4.j;
import com.google.android.gms.internal.ads.zzgyr;
import com.google.android.gms.internal.ads.zzgyx;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public abstract class zzgyx<MessageType extends zzgyx<MessageType, BuilderType>, BuilderType extends zzgyr<MessageType, BuilderType>> extends zzgwy<MessageType, BuilderType> {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static Map<Class<?>, zzgyx<?, ?>> zzc = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzd = -1;
    protected zzhbo zzt = zzhbo.zzc();

    public static zzgyz zzbA() {
        return zzgxf.zzd();
    }

    public static zzgyz zzbB(zzgyz zzgyzVar) {
        int i10;
        int size = zzgyzVar.size();
        if (size == 0) {
            i10 = 10;
        } else {
            i10 = size + size;
        }
        return zzgyzVar.zzf(i10);
    }

    public static zzgza zzbC() {
        return zzgye.zze();
    }

    public static zzgza zzbD(zzgza zzgzaVar) {
        int i10;
        int size = zzgzaVar.size();
        if (size == 0) {
            i10 = 10;
        } else {
            i10 = size + size;
        }
        return zzgzaVar.zzf(i10);
    }

    public static zzgze zzbE() {
        return zzgyo.zze();
    }

    public static zzgze zzbF(zzgze zzgzeVar) {
        int i10;
        int size = zzgzeVar.size();
        if (size == 0) {
            i10 = 10;
        } else {
            i10 = size + size;
        }
        return zzgzeVar.zzf(i10);
    }

    public static zzgzf zzbG() {
        return zzgyy.zzg();
    }

    public static zzgzf zzbH(zzgzf zzgzfVar) {
        int i10;
        int size = zzgzfVar.size();
        if (size == 0) {
            i10 = 10;
        } else {
            i10 = size + size;
        }
        return zzgzfVar.zzf(i10);
    }

    public static zzgzi zzbI() {
        return zzgzx.zzh();
    }

    public static zzgzi zzbJ(zzgzi zzgziVar) {
        int i10;
        int size = zzgziVar.size();
        if (size == 0) {
            i10 = 10;
        } else {
            i10 = size + size;
        }
        return zzgziVar.zzf(i10);
    }

    public static <E> zzgzj<E> zzbK() {
        return zzhat.zzd();
    }

    public static <E> zzgzj<E> zzbL(zzgzj<E> zzgzjVar) {
        int i10;
        int size = zzgzjVar.size();
        if (size == 0) {
            i10 = 10;
        } else {
            i10 = size + size;
        }
        return zzgzjVar.zzf(i10);
    }

    public static Object zzbR(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static Object zzbS(zzhai zzhaiVar, String str, Object[] objArr) {
        return new zzhau(zzhaiVar, str, objArr);
    }

    public static Method zzbT(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException(j.h("Generated message class \"", cls.getName(), "\" missing method \"", str, "\"."), e2);
        }
    }

    public static <ContainingType extends zzhai, Type> zzgyv<ContainingType, Type> zzbe(ContainingType containingtype, zzhai zzhaiVar, zzgzc zzgzcVar, int i10, zzhca zzhcaVar, boolean z10, Class cls) {
        return new zzgyv<>(containingtype, Collections.emptyList(), zzhaiVar, new zzgyu(zzgzcVar, i10, zzhcaVar, true, z10), cls);
    }

    public static <ContainingType extends zzhai, Type> zzgyv<ContainingType, Type> zzbf(ContainingType containingtype, Type type, zzhai zzhaiVar, zzgzc zzgzcVar, int i10, zzhca zzhcaVar, Class cls) {
        return new zzgyv<>(containingtype, type, zzhaiVar, new zzgyu(zzgzcVar, i10, zzhcaVar, false, false), cls);
    }

    public static <T extends zzgyx> T zzbh(Class<T> cls) {
        zzgyx<?, ?> zzgyxVar = zzc.get(cls);
        if (zzgyxVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzgyxVar = zzc.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (zzgyxVar == null) {
            zzgyxVar = ((zzgyx) zzhbu.zzg(cls)).zzbt();
            if (zzgyxVar != null) {
                zzc.put(cls, zzgyxVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return zzgyxVar;
    }

    public static <T extends zzgyx<T, ?>> T zzbk(T t5, InputStream inputStream) throws zzgzm {
        int i10 = zzgyh.zzb;
        int i11 = zzhas.zza;
        T t10 = (T) zzg(t5, inputStream, zzgyh.zza);
        zzf(t10);
        return t10;
    }

    public static <T extends zzgyx<T, ?>> T zzbl(T t5, InputStream inputStream, zzgyh zzgyhVar) throws zzgzm {
        T t10 = (T) zzg(t5, inputStream, zzgyhVar);
        zzf(t10);
        return t10;
    }

    public static <T extends zzgyx<T, ?>> T zzbm(T t5, zzgxp zzgxpVar) throws zzgzm {
        int i10 = zzgyh.zzb;
        int i11 = zzhas.zza;
        T t10 = (T) zzbr(t5, zzgxpVar, zzgyh.zza);
        zzf(t10);
        return t10;
    }

    public static <T extends zzgyx<T, ?>> T zzbn(T t5, zzgxv zzgxvVar) throws zzgzm {
        int i10 = zzgyh.zzb;
        int i11 = zzhas.zza;
        return (T) zzbs(t5, zzgxvVar, zzgyh.zza);
    }

    public static <T extends zzgyx<T, ?>> T zzbo(T t5, InputStream inputStream) throws zzgzm {
        zzgxv zzG = zzgxv.zzG(inputStream, 4096);
        int i10 = zzgyh.zzb;
        int i11 = zzhas.zza;
        T t10 = (T) zzbz(t5, zzG, zzgyh.zza);
        zzf(t10);
        return t10;
    }

    public static <T extends zzgyx<T, ?>> T zzbp(T t5, ByteBuffer byteBuffer) throws zzgzm {
        int i10 = zzgyh.zzb;
        int i11 = zzhas.zza;
        return (T) zzbv(t5, byteBuffer, zzgyh.zza);
    }

    public static <T extends zzgyx<T, ?>> T zzbq(T t5, byte[] bArr) throws zzgzm {
        int length = bArr.length;
        int i10 = zzgyh.zzb;
        int i11 = zzhas.zza;
        T t10 = (T) zzi(t5, bArr, 0, length, zzgyh.zza);
        zzf(t10);
        return t10;
    }

    public static <T extends zzgyx<T, ?>> T zzbr(T t5, zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
        T t10 = (T) zzh(t5, zzgxpVar, zzgyhVar);
        zzf(t10);
        return t10;
    }

    public static <T extends zzgyx<T, ?>> T zzbs(T t5, zzgxv zzgxvVar, zzgyh zzgyhVar) throws zzgzm {
        T t10 = (T) zzbz(t5, zzgxvVar, zzgyhVar);
        zzf(t10);
        return t10;
    }

    public static <T extends zzgyx<T, ?>> T zzbu(T t5, InputStream inputStream, zzgyh zzgyhVar) throws zzgzm {
        T t10 = (T) zzbz(t5, zzgxv.zzG(inputStream, 4096), zzgyhVar);
        zzf(t10);
        return t10;
    }

    public static <T extends zzgyx<T, ?>> T zzbv(T t5, ByteBuffer byteBuffer, zzgyh zzgyhVar) throws zzgzm {
        zzgxv zzH;
        boolean z10 = false;
        if (byteBuffer.hasArray()) {
            zzH = zzgxv.zzH(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), false);
        } else if (byteBuffer.isDirect() && zzhbu.zzB()) {
            zzH = new zzgxt(byteBuffer, z10, null);
        } else {
            int remaining = byteBuffer.remaining();
            byte[] bArr = new byte[remaining];
            byteBuffer.duplicate().get(bArr);
            zzH = zzgxv.zzH(bArr, 0, remaining, true);
        }
        T t10 = (T) zzbs(t5, zzH, zzgyhVar);
        zzf(t10);
        return t10;
    }

    public static <T extends zzgyx<T, ?>> T zzbx(T t5, byte[] bArr, zzgyh zzgyhVar) throws zzgzm {
        T t10 = (T) zzi(t5, bArr, 0, bArr.length, zzgyhVar);
        zzf(t10);
        return t10;
    }

    public static <T extends zzgyx<T, ?>> T zzby(T t5, zzgxv zzgxvVar) throws zzgzm {
        int i10 = zzgyh.zzb;
        int i11 = zzhas.zza;
        return (T) zzbz(t5, zzgxvVar, zzgyh.zza);
    }

    public static <T extends zzgyx<T, ?>> T zzbz(T t5, zzgxv zzgxvVar, zzgyh zzgyhVar) throws zzgzm {
        T t10 = (T) t5.zzbj();
        try {
            zzhbb zzb2 = zzhas.zza().zzb(t10.getClass());
            zzb2.zzh(t10, zzgxw.zzq(zzgxvVar), zzgyhVar);
            zzb2.zzf(t10);
            return t10;
        } catch (zzgzm e2) {
            if (e2.zzb()) {
                throw new zzgzm(e2);
            }
            throw e2;
        } catch (zzhbm e10) {
            throw e10.zza();
        } catch (IOException e11) {
            if (e11.getCause() instanceof zzgzm) {
                throw ((zzgzm) e11.getCause());
            }
            throw new zzgzm(e11);
        } catch (RuntimeException e12) {
            if (e12.getCause() instanceof zzgzm) {
                throw ((zzgzm) e12.getCause());
            }
            throw e12;
        }
    }

    private int zzc(zzhbb<?> zzhbbVar) {
        if (zzhbbVar == null) {
            return zzhas.zza().zzb(getClass()).zza(this);
        }
        return zzhbbVar.zza(this);
    }

    public static <T extends zzgyx> void zzcb(Class<T> cls, T t5) {
        t5.zzbX();
        zzc.put(cls, t5);
    }

    public static final <T extends zzgyx<T, ?>> boolean zzce(T t5, boolean z10) {
        T t10;
        byte byteValue = ((Byte) t5.zzbP(zzgyw.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzl = zzhas.zza().zzb(t5.getClass()).zzl(t5);
        if (z10) {
            if (true != zzl) {
                t10 = null;
            } else {
                t10 = t5;
            }
            t5.zzbQ(zzgyw.SET_MEMOIZED_IS_INITIALIZED, t10);
        }
        return zzl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends zzgyt<MessageType, BuilderType>, BuilderType, T> zzgyv<MessageType, T> zzd(zzgyf<MessageType, T> zzgyfVar) {
        return (zzgyv) zzgyfVar;
    }

    private static <T extends zzgyx<T, ?>> T zzf(T t5) throws zzgzm {
        if (t5 != null && !t5.zzbw()) {
            throw t5.zzaP().zza();
        }
        return t5;
    }

    private static <T extends zzgyx<T, ?>> T zzg(T t5, InputStream inputStream, zzgyh zzgyhVar) throws zzgzm {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            zzgxv zzG = zzgxv.zzG(new zzgww(inputStream, zzgxv.zzE(read, inputStream)), 4096);
            T t10 = (T) zzbz(t5, zzG, zzgyhVar);
            zzG.zzy(0);
            return t10;
        } catch (zzgzm e2) {
            if (e2.zzb()) {
                throw new zzgzm(e2);
            }
            throw e2;
        } catch (IOException e10) {
            throw new zzgzm(e10);
        }
    }

    private static <T extends zzgyx<T, ?>> T zzh(T t5, zzgxp zzgxpVar, zzgyh zzgyhVar) throws zzgzm {
        zzgxv zzl = zzgxpVar.zzl();
        T t10 = (T) zzbz(t5, zzl, zzgyhVar);
        zzl.zzy(0);
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends zzgyx<T, ?>> T zzi(T t5, byte[] bArr, int i10, int i11, zzgyh zzgyhVar) throws zzgzm {
        if (i11 == 0) {
            return t5;
        }
        T t10 = (T) t5.zzbj();
        try {
            zzhbb zzb2 = zzhas.zza().zzb(t10.getClass());
            zzb2.zzi(t10, bArr, i10, i10 + i11, new zzgxd(zzgyhVar));
            zzb2.zzf(t10);
            return t10;
        } catch (zzgzm e2) {
            if (e2.zzb()) {
                throw new zzgzm(e2);
            }
            throw e2;
        } catch (zzhbm e10) {
            throw e10.zza();
        } catch (IOException e11) {
            if (e11.getCause() instanceof zzgzm) {
                throw ((zzgzm) e11.getCause());
            }
            throw new zzgzm(e11);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzgzm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private void zzj() {
        if (this.zzt == zzhbo.zzc()) {
            this.zzt = zzhbo.zzf();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzhas.zza().zzb(getClass()).zzk(this, (zzgyx) obj);
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
        return zzhak.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzgwy
    public int zzaL() {
        return this.zzd & Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzgwy
    public int zzaM(zzhbb zzhbbVar) {
        if (zzcf()) {
            int zzc2 = zzc(zzhbbVar);
            if (zzc2 >= 0) {
                return zzc2;
            }
            throw new IllegalStateException(eb.j.i("serialized size must be non-negative, was ", zzc2));
        }
        if (zzaL() != Integer.MAX_VALUE) {
            return zzaL();
        }
        int zzc3 = zzc(zzhbbVar);
        zzaS(zzc3);
        return zzc3;
    }

    @Override // com.google.android.gms.internal.ads.zzgwy
    public zzhan zzaO() {
        throw new UnsupportedOperationException("Lite does not support the mutable API.");
    }

    @Override // com.google.android.gms.internal.ads.zzgwy
    public void zzaS(int i10) {
        if (i10 >= 0) {
            this.zzd = i10 | (this.zzd & Integer.MIN_VALUE);
            return;
        }
        throw new IllegalStateException(eb.j.i("serialized size must be non-negative, was ", i10));
    }

    public int zzaW() {
        return zzhas.zza().zzb(getClass()).zzb(this);
    }

    public int zzaX() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzhai
    public int zzaY() {
        return zzaM(null);
    }

    public final <MessageType extends zzgyx<MessageType, BuilderType>, BuilderType extends zzgyr<MessageType, BuilderType>> BuilderType zzaZ() {
        return (BuilderType) zzbP(zzgyw.NEW_BUILDER);
    }

    public final zzhaq<MessageType> zzbN() {
        return (zzhaq) zzbP(zzgyw.GET_PARSER);
    }

    public Object zzbO() throws Exception {
        return zzbP(zzgyw.BUILD_MESSAGE_INFO);
    }

    public Object zzbP(zzgyw zzgywVar) {
        return zzde(zzgywVar, null, null);
    }

    public Object zzbQ(zzgyw zzgywVar, Object obj) {
        return zzde(zzgywVar, obj, null);
    }

    public void zzbU() {
        this.zzq = 0;
    }

    public void zzbV() {
        zzaS(Integer.MAX_VALUE);
    }

    public void zzbW() {
        zzhas.zza().zzb(getClass()).zzf(this);
        zzbX();
    }

    public void zzbX() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public void zzbY(int i10, zzgxp zzgxpVar) {
        zzj();
        zzhbo zzhboVar = this.zzt;
        zzhboVar.zzg();
        if (i10 != 0) {
            zzhboVar.zzj((i10 << 3) | 2, zzgxpVar);
            return;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    public final void zzbZ(zzhbo zzhboVar) {
        this.zzt = zzhbo.zze(this.zzt, zzhboVar);
    }

    public final <MessageType extends zzgyx<MessageType, BuilderType>, BuilderType extends zzgyr<MessageType, BuilderType>> BuilderType zzba(MessageType messagetype) {
        BuilderType zzaZ = zzaZ();
        zzaZ.zzbj(messagetype);
        return zzaZ;
    }

    @Override // com.google.android.gms.internal.ads.zzhai
    /* renamed from: zzbb, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzcZ() {
        return (BuilderType) zzbP(zzgyw.NEW_BUILDER);
    }

    /* renamed from: zzbc, reason: merged with bridge method [inline-methods] */
    public final BuilderType zzbM() {
        BuilderType buildertype = (BuilderType) zzbP(zzgyw.NEW_BUILDER);
        buildertype.zzbj(this);
        return buildertype;
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    /* renamed from: zzbi, reason: merged with bridge method [inline-methods] */
    public final MessageType zzbt() {
        return (MessageType) zzbP(zzgyw.GET_DEFAULT_INSTANCE);
    }

    public MessageType zzbj() {
        return (MessageType) zzbP(zzgyw.NEW_MUTABLE_INSTANCE);
    }

    @Override // com.google.android.gms.internal.ads.zzhaj
    public final boolean zzbw() {
        return zzce(this, true);
    }

    public void zzca(int i10, int i11) {
        zzj();
        zzhbo zzhboVar = this.zzt;
        zzhboVar.zzg();
        if (i10 != 0) {
            zzhboVar.zzj(i10 << 3, Long.valueOf(i11));
            return;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    public void zzcc(int i10) {
        this.zzq = i10;
    }

    public boolean zzcd() {
        return zzaX() == 0;
    }

    public boolean zzcf() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public boolean zzcg(int i10, zzgxv zzgxvVar) throws IOException {
        if ((i10 & 7) == 4) {
            return false;
        }
        zzj();
        return this.zzt.zzm(i10, zzgxvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhai
    public void zzda(zzgyc zzgycVar) throws IOException {
        zzhas.zza().zzb(getClass()).zzj(this, zzgyd.zza(zzgycVar));
    }

    public abstract Object zzde(zzgyw zzgywVar, Object obj, Object obj2);
}
